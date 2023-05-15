package com.vti.Repository;

import com.vti.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClassroomRepository extends JpaRepository<Classroom,Integer> {
}
