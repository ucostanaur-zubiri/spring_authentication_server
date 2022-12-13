package eus.hekuntza.zubiri.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import eus.hekuntza.zubiri.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findUserByUsername(String username);
}
