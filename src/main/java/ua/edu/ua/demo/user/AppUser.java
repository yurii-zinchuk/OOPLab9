package ua.edu.ua.demo.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@Entity @Table
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Transient
    private int age;

    public AppUser(String email, LocalDate dob) {
        this.email = email;
        this.dob = dob;
    }


    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

}
