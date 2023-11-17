package com.shaon.highscalatondemo.model.employee;

import com.shaon.highscalatondemo.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends BaseEntity {

    private String name;
    private String phone;
}
