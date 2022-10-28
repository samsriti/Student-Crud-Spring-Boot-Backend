package com.example.studentcrud2.studentcrud2.repository;

import com.example.studentcrud2.studentcrud2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}
