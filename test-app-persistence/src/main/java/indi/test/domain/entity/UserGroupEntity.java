package indi.test.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sys_user_group")
    public class UserGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String userId;
    private String groupId;
}
