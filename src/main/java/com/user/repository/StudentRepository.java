package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}