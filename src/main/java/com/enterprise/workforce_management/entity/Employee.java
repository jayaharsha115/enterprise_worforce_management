package com.enterprise.workforce_management.entity;

import com.enterprise.workforce_management.enums.EmployeeStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeCode;
    private String firstName;
    private String lastName;
    @Column( unique = true )
    private String email;
    private String phoneNumber;
    private String designation;
    private LocalDate joiningDate;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
}
