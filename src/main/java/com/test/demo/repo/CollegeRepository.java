package com.test.demo.repo;

import com.test.demo.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College,Integer> {
	
	}
