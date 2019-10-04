package atn.sopot.controler;

import atn.sopot.entity.Holiday;


import atn.sopot.repository.IHoliday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@CrossOrigin (origins = "http://localhost:4200", maxAge = 3600) //dostęp do api przez browser.
@RestController
//@RequestMapping("/api/")
public class Controller {

    @Autowired //autowstrzykiwanie
           private IHoliday iHoliday;

    public Controller(IHoliday iHoliday) {
        this.iHoliday = iHoliday;
    }

    @GetMapping
    @RequestMapping("/findall")
    public List findAll(){
        return iHoliday.findAll();
    }
    @RequestMapping("/findbynazwisko")
    @CrossOrigin(origins = "http://localhost:4200")
    public String fetchDataByNazwisko(@RequestParam("nazwisko") String nazwisko){
        String result ="";

        for (Holiday holi: iHoliday.findByNazwisko(nazwisko)){
            result += holi.toString() + "<br>";
        }
        return result;
    }

    @GetMapping("holidaylogin/{login}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Holiday> getHolidayByLogin(@PathVariable(value = "login") String holidayLogin)
        throws ResourceNotFoundException {
        Holiday holiday = iHoliday.findByLogin(holidayLogin);
        return ResponseEntity.ok().body(holiday);
}


    @GetMapping(value = "holidays")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Holiday> getHoliday(){
        return iHoliday.findAllByNazwiskoAndImie("","");
    }



    @GetMapping(value = "/search")
    @CrossOrigin(origins = "http://localhost:4200")
    public boolean isHolidayActive() {
        return false;
        // return iHoliday.isHeOnHoliday;
    }
    /*public String view(Model model){
        model.addAttribute("list",iHoliday.FindThroughTheDataInput());
        return "holidayList";*/



}

    /**
     * lub
     *  private EntityManagerFactory entmenfac;
     *implementacja EntityManager
     *
     *  public Holiday[] getHoliday(){
     *         EntityManager em = getEntityManager();
     *         try {
     *             javax.persistence.Query q = em.createQuery("select * from per_holiday as u");
     *             return (Holiday[]) q.getResultList().toArray(new Holiday[0]);
     *         } finally {
     *             em.close();
     *         }
     */
    // + klasa SeassionBean która łączy kalse kontroller z fronetme. Na froncie
    // np. <h:dataTable class="tab" var="holiday" value="#{sessionBean.holidays}">

