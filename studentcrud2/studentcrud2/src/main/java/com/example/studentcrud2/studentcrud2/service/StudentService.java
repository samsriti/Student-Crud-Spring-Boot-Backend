package com.example.studentcrud2.studentcrud2.service;

import com.example.studentcrud2.studentcrud2.entity.Student;
import com.example.studentcrud2.studentcrud2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    //POST -Create
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> saveStudents(List<Student> students){
        return studentRepository.saveAll(students);
    }

    //GET - Retrieve
    public List<Student> getProducts(){
        return  studentRepository.findAll();
    }
    public Student getProductByID(int id){
        return studentRepository.findById(id).orElse(null);
    }

    //DELETE

    public String deleteStudent(int id){
        studentRepository.deleteById(id);
        return "Student Removed with id: " + id;
    }

    //PUT
    public Student updateStudent(Student student){
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setAddress(student.getAddress());
        return studentRepository.save(existingStudent);

    }





}
