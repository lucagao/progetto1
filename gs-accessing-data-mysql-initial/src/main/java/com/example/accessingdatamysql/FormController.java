package com.example.accessingdatamysql;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {
	@Autowired
	private UserService userService;
	
    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/error/access-denied";
    }

	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("userList", userService.findAll());
		return "form";

	}

	@PostMapping(path = "/form")
	public String addNewUser(@RequestParam String name, @RequestParam String email, @RequestParam String telefono,
			Model model) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		n.setName(name);
		n.setEmail(email);
		n.setTelefono(telefono);
		userService.save(n);
		model.addAttribute("userList", userService.findAll());
		return "form";
	}

	@GetMapping(path = "/delete")
	public String deleteUser(@RequestParam Integer id, Model model) {
		userService.deleteById(id);
		model.addAttribute("userList", userService.findAll());
		return "form";
	}

	@GetMapping("/user")
	public String Conferma(@RequestParam Integer id, Model model) {
		model.addAttribute("id", id);
		return "user";
	}

	@GetMapping("/indirizzi")
	public String indirizzo(@RequestParam Integer id, Model model) {
		User u = userService.getById(id);
		model.addAttribute("id", id);
		model.addAttribute("addressList", u.getAddresses());
		return "indirizzi";
	}

	@PostMapping("/addIndirizzi")
	public String addIndirizzo(@RequestParam Integer id, @RequestParam String address, Model model) {
		User u = userService.addAddresses(id, address);
		model.addAttribute("id", id);
		model.addAttribute("addressList", u.getAddresses());
		return "indirizzi";
	}

	@GetMapping("/deleteAddress")
	public String deleteAddress(@RequestParam Integer address, @RequestParam Integer id, Model model) {
		userService.deleteByAddress(id, address);
		model.addAttribute("id", id);
		model.addAttribute("addressList", userService.getById(id).getAddresses());
		return "indirizzi";
	}
}
