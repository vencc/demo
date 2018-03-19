package indi.test.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String mobile;
    private String password;
    private String email;
    private Date createTime;
    private Integer gender;
    private String token;
    private Integer loginAccount;
    private Date lastLoginTime;
    private String userName;
}
