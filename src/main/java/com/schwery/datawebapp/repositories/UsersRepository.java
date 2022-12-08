package com.schwery.datawebapp.repositories;

import com.schwery.datawebapp.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
