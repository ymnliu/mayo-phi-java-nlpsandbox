package org.openapitools.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Home redirection to OpenAPI api documentation
 */
@Controller
public class HomeController {

    // Redirections required by the NLP Sandbox

    @RequestMapping("/")
    public String index() {
        return "redirect:/api/v1/tool";
    }

    @RequestMapping("/ui")
    public String ui() {
        return "redirect:swagger-ui.html";
    }

}
