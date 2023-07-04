package com.example.block7crudvalidation.teacher.application;

import com.example.block7crudvalidation.teacher.infrastructure.dto.input.TeacherInputDTO;
import com.example.block7crudvalidation.teacher.infrastructure.dto.output.TeacherOutputDTO;
import org.springframework.http.ResponseEntity;

public interface TeacherService {
    TeacherOutputDTO addTeacher(TeacherInputDTO teacherInputDTO);
    TeacherOutputDTO getTeacherId(Integer id, String outputType) throws Exception;
    TeacherOutputDTO updateTeacher(Integer id, TeacherInputDTO teacherInputDTO);
    void deleteTeacher(Integer id);
}