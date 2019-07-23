package atn.sopot.controler;

import atn.sopot.entity.Holiday;
import atn.sopot.repository.IHoliday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin //dostęp do api przez browser.
@RestController
@RequestMapping("/api/")
public class Controller {

   // @Autowired //autowstrzykiwanie
            IHoliday iHoliday;

    public Controller(IHoliday iHoliday) {
        this.iHoliday = iHoliday;
    }

    @GetMapping("holTest")
    public Holiday getHol () {
        return (Holiday) iHoliday.findAll();
    }

            /* @GetMapping(value="holiday"){
        public List<Holiday> getHoliday() {
            return iHoliday.findAllByNazwiskoAndImie();*/

    @GetMapping(value = "holidays")
    public List<Holiday> getHoliday(){
        return iHoliday.findAllByNazwiskoAndImie("","");
    }



    @GetMapping(value = "/search")
    public boolean isHolidayActive() {
        return false;
        // return iHoliday.isHeOnHoliday;
    }
    /*public String view(Model model){
        model.addAttribute("list",iHoliday.FindThroughTheDataInput());
        return "holidayList";*/

    /*@RequestMapping(value = "holiday")
    public String view(Model model) {
        model.addAttribute("lista", iHoliday.findByLoginOrNazwiskoAndImie("test","Maciej","Przekwas"));

        return "holidayList";
    }*/
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

