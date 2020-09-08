package com.codeclan.example.foldersandfiles.repositories;

import com.codeclan.example.foldersandfiles.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
