package com.swedbank.academy.demoserver.team;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "team")
public class Team implements Serializable {
    /**
     * The pid.
     */
    @Id
    @NotNull
    private long pid;
    /**
     * The name.
     */
    @NotNull
    @NotBlank
    @Column(name = "first_name")
    private String name;
    /**
     * The middle name.
     */
    @Column(name = "middle_name")
    private String middleName;
    /**
     * The surname.
     */
    @NotNull
    @NotBlank
    @Column(name = "last_name")
    private String surname;
    /**
     * The email.
     */
    private String email;
    /**
     * The phone.
     */
    private String phone;

}
