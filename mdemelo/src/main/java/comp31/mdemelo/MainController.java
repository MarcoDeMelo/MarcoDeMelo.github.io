package comp31.mdemelo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
    
  
   
    
    @GetMapping("/images")
    public String image(Model model)
    {
       
        return "imagePage";
        
    }

    @GetMapping("/date")
    public String date(Model model)
    {
       
        return "date";
        
    }

    
    @GetMapping("/final")
    public String getFinal(Model model)
    {
       
        return "final";
        
    }
}
