package com.eazybytes.eazyschool.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "holidays")
public class Holiday extends BaseEntity{
    public enum Type {
        FESTIVAL, FEDERAL
    }

    @Id
    private String day;

    private String reason;

    @Enumerated(EnumType.STRING)
    private Type type;

}
