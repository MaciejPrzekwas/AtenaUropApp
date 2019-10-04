package atn.sopot.repository;

import atn.sopot.entity.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin(origins = "http://localhost:4200")

public interface IHoliday extends JpaRepository<Holiday, Long> {

    List findAll();

    List<Holiday> findByNazwisko(String Nazwisko);

 public List<Holiday> findByLoginOrNazwiskoAndImie(String login, String imie, String nazwisko);

 public List<Holiday> findAllByNazwiskoAndImie(String nazwisko, String imie);


 Holiday findByLogin(String holidayLogin);
}

//Pageable - stronicowanie
//Albo zapytania SQL przez @Querry("SELECT * FROM ...")