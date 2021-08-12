package com.muates.springbootpollsapi.repository;

import com.muates.springbootpollsapi.model.Role;
import com.muates.springbootpollsapi.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
