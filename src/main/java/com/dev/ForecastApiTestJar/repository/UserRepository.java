package com.dev.ForecastApiTestJar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.ForecastApiTestJar.model.admin.Administration;

@Repository
public interface UserRepository extends JpaRepository<Administration, Long>{
	
//	Optional<Administration> findOneWithAuthoritiesByUsername(String username);
	Optional<Administration> findOneByUsername(String username);
	
}
