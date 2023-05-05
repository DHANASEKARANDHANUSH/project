package com.spring.Snackx.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Snackx.model.Snackx;

public interface SnackxRepository extends JpaRepository<Snackx, Integer> {
	Snackx findByuname(String uname);

}
