package com.example.studentcrud2.studentcrud2.controller;


import com.example.studentcrud2.studentcrud2.entity.Student;
import com.example.studentcrud2.studentcrud2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Post-Method
    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @PostMapping("/addstudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    @GetMapping("/students")
    //Get Method
    public List<Student> findAllProducts(){
        return studentService.getProducts();
    }

    @GetMapping("/student/{id}")
    public Student findProductByID(@PathVariable int id){
        return studentService.getProductByID(id);
    }

    //Put Method

    @PutMapping("/updatestudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct( @PathVariable int id){
        return studentService.deleteStudent(id);
    }





}
