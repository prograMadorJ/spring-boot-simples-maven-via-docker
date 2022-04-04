package com.skell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skell.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
