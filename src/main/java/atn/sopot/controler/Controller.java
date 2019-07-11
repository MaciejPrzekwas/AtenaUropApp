package atn.sopot.controler;

import atn.sopot.repository.IHoliday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class Controller {
    @Autowired
    IHoliday iHoliday;

    //na froncie przez th:action listować

    @RequestMapping(value ="/search")
    public String view(Model model){
        model.addAttribute("list",iHoliday.FindThroughTheDataInput());

        return "holidayList";
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
}
