package com.lb.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lb.auth.entities.Organization;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, Long> {

}
