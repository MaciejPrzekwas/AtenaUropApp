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
    private String imie;

    @Column
    private String nazwisko;

    @Column
    private String login;

    @Column(name = "START_DATE")
    private Date nieobecnyod;

    @Column(name = "END_DATE")
    private Date nieobecnydo;

    public Holiday() {
    }

    public Holiday(String imie, String nazwisko, String login, Date nieobecnyod, Date nieobecnydo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.login = login;
        this.nieobecnyod = nieobecnyod;
        this.nieobecnydo = nieobecnydo;
    }

    public Long getId() {
        return id;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getNieobecnyod() {
        return nieobecnyod;
    }

    public void setNieobecnyod(Date nieobecnyod) {
        this.nieobecnyod = nieobecnyod;
    }

    public Date getNieobecnydo() {
        return nieobecnydo;
    }

    public void setNieobecnydo(Date nieobecnydo) {
        this.nieobecnydo = nieobecnydo;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", login='" + login + '\'' +
                ", nieobecnyod=" + nieobecnyod +
                ", nieobecnydo=" + nieobecnydo +
                '}';
    }
}
