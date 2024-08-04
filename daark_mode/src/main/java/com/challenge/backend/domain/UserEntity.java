package com.challenge.backend.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="tbl_user")
@Data
public class UserEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
}
