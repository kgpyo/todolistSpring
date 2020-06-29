package com.example.todoslitApi.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;

@Entity
@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

    private @Id @GeneratedValue Long id;
    @NonNull
    private String name;
    @NonNull
    private String role;

}