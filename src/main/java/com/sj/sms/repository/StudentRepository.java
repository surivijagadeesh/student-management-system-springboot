package com.sj.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sj.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
