package atn.sopot.repository;

import atn.sopot.entity.Holiday;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHoliday {
   List<Holiday> FindThroughTheDataInput();
}

//Pageable - stronicowanie
//Albo zapytania SQL przez @Querry("SELECT * FROM ...")