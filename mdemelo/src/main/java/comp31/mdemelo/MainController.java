package comp31.mdemelo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {
    
    @GetMapping("/login")
    public String getLogin(@RequestParam String userId, Model model) {
        String targetPage;
    
        // Check the user's userId and determine the target page based on their name and job role
        if ("Sam".equals(userId) || "Sue".equals(userId)) {
            targetPage = "salesLogin";  // Redirect to sales login page for Sam and Sue
        } else if ("Olivia".equals(userId) || "Ollie".equals(userId)) {
            targetPage = "ordersLogin";  // Redirect to orders login page for Olivia and Ollie
        } else if ("Rachel".equals(userId) || "Ralph".equals(userId)) {
            targetPage = "repairsLogin";  // Redirect to repairs login page for Rachel and Ralph
        } else {
            targetPage = "home";  // Default to the "home" page if no specific name is matched
        }
        
    
        // Add the userId to the model, if needed for the specific login page
        model.addAttribute("userId", userId);
    
        // Return the determined target page
        return targetPage;
    }
    
    @GetMapping("/image")
    public String image(Model model)
    {
        model.addAttribute("name", "Ellie");
        return "imagePage";
        
    }
}
