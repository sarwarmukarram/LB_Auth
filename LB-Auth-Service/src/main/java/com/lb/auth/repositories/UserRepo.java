package com.lb.auth.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lb.auth.entities.User;

@Repository
public interface UserRepo  extends JpaRepository<User ,Long > {

}
