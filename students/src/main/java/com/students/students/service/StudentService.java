package com.students.students.service;



import com.students.students.entity.Student;
import com.students.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student addStudent(Student s) {
        return repo.save(s);
    }

    public Student updateStudent(Long id, Student s) {
        Student existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
        existing.setName(s.getName());
        existing.setEmail(s.getEmail());
        existing.setBranch(s.getBranch());
        existing.setMarks(s.getMarks());
        return repo.save(existing);
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }
}


