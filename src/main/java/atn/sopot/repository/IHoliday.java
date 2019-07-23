package atn.sopot.repository;

import atn.sopot.entity.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHoliday extends CrudRepository<Holiday,Long> {



 public List<Holiday> findByLoginOrNazwiskoAndImie(String login, String imie, String nazwisko);

 public List<Holiday> findAllByNazwiskoAndImie(String nazwisko, String imie);


}

//Pageable - stronicowanie
//Albo zapytania SQL przez @Querry("SELECT * FROM ...")