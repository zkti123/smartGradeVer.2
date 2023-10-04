package com.green.smartgradever2.admin.grade_mngmn.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GradeMngmnRes {
    private Integer studentNum;
    private Long isemester;
    private int grade;
    private int score;
    private int avgScore;
    private double rating;
    private Long ilectureName;
    private int semester;
}
