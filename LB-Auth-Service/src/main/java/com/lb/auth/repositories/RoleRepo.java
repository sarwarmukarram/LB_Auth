package com.lb.auth.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lb.auth.entities.Role;
@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {

}
