package com.techprimers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@Slf4j
public class User {

	@Id
	@GeneratedValue
	private Long id;
    @Column(nullable = false)
    private String name;
    @Column(name="teamname")
    private String teamName;
    @Column(nullable = false)
    private Integer salary;

  
}
