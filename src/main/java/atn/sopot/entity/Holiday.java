package atn.sopot.entity;

import atn.sopot.enumStatus.Status;
import javax.persistence.*;
import java.util.Date;

/**
@ToDO przegadanie
 Czy zrobić to za pomocą adnotacji @NamedQueries ({
@NamedQuery(name ="HoidaySearch", query ="SELECT * FROM"")

W przypadku tabel relacyjnych
@JoinTable(name = "hoidayData", joinColumns = {
@JoinColumn(name "xyz", referencedColumnName= "id_xyz")}, inverseJoinColumns = {
@JoinColumn(name = "id_x_user", referencedColumnName = "id_user")})
@ManyToMany(fetch = FetchType.EAGER)
}
 **/

@Entity
@Table(name="per_holiday")
public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String email;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Holiday() {
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                '}';
    }
}
