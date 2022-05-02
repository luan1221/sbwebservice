package com.luan1221.sbwebservice.repositories;

import com.luan1221.sbwebservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
