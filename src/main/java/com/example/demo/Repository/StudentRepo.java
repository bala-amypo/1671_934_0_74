package com.example.demo.Repository;
import org.springframework.data.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}