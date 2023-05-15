package com.vti.Repository;

import com.vti.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenderRepository extends JpaRepository<Gender,Integer> {
}
