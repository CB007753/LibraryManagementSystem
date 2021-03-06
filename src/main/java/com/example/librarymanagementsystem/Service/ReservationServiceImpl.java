package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.Model.Reservation;
import com.example.librarymanagementsystem.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    ReservationRepository reservationRepository;


    //overided methods
    @Override
    public List<Reservation> getReservationByStatus(String status) {
        return reservationRepository.findByStatus(status);
    }

    @Override
    public long getNumberOfReservationByEmail(String email) {

        return reservationRepository.countReservationByEmail(email);
    }

    @Override
    public String saveReservation(Reservation reservation) {
        if(reservation != null)
        {
            reservationRepository.save(reservation);
        }
        else
        {
            return "Error";
        }
        return "Error";
    }

    @Override
    public void deleteReservation(Reservation reservation) {
                reservationRepository.delete(reservation);
    }

    @Override
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Optional<Reservation> getReservationByID(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public List<Reservation> getReservationByEmailAndStatus(String email, String status) {
        return reservationRepository.findByEmailAndStatus(email,status);
    }
}
