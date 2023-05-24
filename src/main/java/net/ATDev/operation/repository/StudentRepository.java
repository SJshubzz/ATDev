package net.ATDev.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ATDev.operation.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
