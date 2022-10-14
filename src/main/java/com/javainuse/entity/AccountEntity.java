package com.javainuse.entity;
import javax.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column()
    private String username;
    @Column()
    private String password;
    @Column()
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleEntity role;
}
