package com.codewithsonu.Sprintboottutorial.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long departmentId;
     // validation
     @NotNull(message = "Enter the Department name ")
     private String departmentName;
     private String departmentCode;
     private String departmentAddress;

}
