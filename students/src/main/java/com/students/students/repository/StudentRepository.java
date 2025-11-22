package com.students.students.repository;

import com.students.students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByBranch(String branch);
    List<Student> findByNameContaining(String keyword);
}

