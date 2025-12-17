package com.example.demo.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.JpaRepository;
import com.example.demo.Entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}