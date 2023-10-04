package com.green.smartgradever2.admin.student.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdminStudentFindParam {
    private Long imajor;
    private int grade;
    private Integer studentNum;
    private String nm;
    private int finishedYn;
}
