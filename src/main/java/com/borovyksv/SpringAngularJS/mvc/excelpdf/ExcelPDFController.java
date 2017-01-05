package com.borovyksv.SpringAngularJS.mvc.excelpdf;

        import com.borovyksv.SpringAngularJS.mvc.excelpdf.bean.Cat;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.servlet.ModelAndView;

        import java.util.ArrayList;
        import java.util.List;

@Controller
public class ExcelPDFController {


    @RequestMapping(value = "/excel", method= RequestMethod.GET)
    public ModelAndView excel() {
        System.out.println("ExcelPDFController excel is called");

        List<Cat> cats = createCats();

        //excelDocument - look excel-pdf-config.xml
        return new ModelAndView("excelDocument", "modelObject", cats);

    }
    @RequestMapping(value = "/pdf", method= RequestMethod.GET)
    public ModelAndView pdf() {

        System.out.println("ExcelPDFController pdf is called");

        List<Cat> cats = createCats();
        //pdfDocument - look excel-pdf-config.xml
        return new ModelAndView("pdfDocument", "modelObject", cats);

    }

    private List<Cat> createCats() {
        List<Cat> cats = new ArrayList<>();
        String[] colors = { "Absolute Zero",
                            "Acid Green",
                            "Aero",
                            "Aero Blue",
                            "African Violet",
                            "Air Force Blue",
                            "Alabama Crimson",
                            "Alabaster",
                             "Almond",
                            "Amaranth Purple"};
        for (int i = 0; i <10; i++) {
            Cat cat = new Cat("cat" + i, colors[i], i);
            cats.add(cat);
        }
        return cats;
    }
}