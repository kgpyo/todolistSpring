package com.example.todoslitApi.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "CUSTOMER_ORDER")
@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
public class Order {
    private @Id @GeneratedValue Long id;
    @NonNull
    private String description;
    @NonNull
    private Status status;
}