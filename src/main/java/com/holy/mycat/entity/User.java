package com.holy.mycat.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * user table
 */
@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @Column(name="id", columnDefinition=("bigint NOT NULL FIRST COMMENT 'id'"))
    private Long id;

    @Column(name="username",  columnDefinition=("varchar(32) DEFAULT NULL COMMENT '名称'"))
    private String username;

}
