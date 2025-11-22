package com.students.students.controller;


import com.students.students.entity.Student;
import com.students.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student add(@RequestBody Student s) {
        return service.addStudent(s);
    }

    @GetMapping("/start")
    public String start()
    {
        String message = " this is the student management application written by the nallavelli varshith kumar reddy";
        return message;
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student s) {
        return service.updateStudent(id, s);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteStudent(id);
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }
}

