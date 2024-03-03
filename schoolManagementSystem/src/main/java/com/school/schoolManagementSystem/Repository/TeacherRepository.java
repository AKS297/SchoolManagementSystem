package com.school.schoolManagementSystem.Repository;

import com.school.schoolManagementSystem.teacher.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository  extends JpaRepository<Teacher,Integer> {

}
