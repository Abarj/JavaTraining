package com.example.block7crudvalidation.student.infrastructure.dto.input;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
public class StudentInputDTO {

    @NotNull(message = "Debe asignar los datos del estudiante.")
    private String idPerson;

    private String idTeacher;

    private int numHoursWeek;

    private String comments;

    @NotEmpty(message = "Debe asignar un profesor al estudiante.")
    private String teacher;

    @NotEmpty(message = "Debe asignar una asignatura al estudiante.")
    private String branch;

    private List<String> subjects = new ArrayList<>();
}