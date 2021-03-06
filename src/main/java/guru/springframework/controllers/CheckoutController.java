package guru.springframework.controllers;

import guru.springframework.comands.CheckoutCommand;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by jt on 2/1/16.
 */

@Controller
public class CheckoutController {

  @RequestMapping("/checkout")
  public String checkoutForm(Model model) {
    model.addAttribute("checkoutCommand", new CheckoutCommand());

    return "checkoutform";
  }

  @RequestMapping(value = "/docheckout", method = RequestMethod.POST)
  public String doCheckout(
    @Valid CheckoutCommand checkoutCommand,
    BindingResult bindingResult
  ) {
    // if (bindingResult.hasErrors()) {
    //   return "checkoutform";
    // }

    return "checkoutcomplete";
  }
}
