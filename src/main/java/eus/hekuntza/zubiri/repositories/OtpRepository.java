package eus.hekuntza.zubiri.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import eus.hekuntza.zubiri.entities.Otp;

public interface OtpRepository extends JpaRepository<Otp, String> {

    Optional<Otp> findOtpByUsername(String username);
}
