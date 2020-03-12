package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called userRepository
			   // Which is auto-generated by Spring, we will use it to handle the data
	private UserService userService;

	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email, @RequestParam String telefono)  {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		userService.addUser(name, email, telefono);
		return "Saved";
	}
	
	public @ResponseBody String addaddresses(@RequestParam Integer userId,@RequestParam String indirizzo ) {
		User u = userService.addAddresses(userId,indirizzo);
		if(u!=null) {
			return "saved";
		}
		return "no such user";
	}

	@PostMapping(path="/update") // Map ONLY POST Requests
	public @ResponseBody String addNewUser (@RequestParam Integer id,@RequestParam String name
			, @RequestParam String email, @RequestParam String telefono)  {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
	User updateUser = userService.updateUser(id, name, email, telefono);
	if(updateUser == null) {
		return "Saved";
	} else {
		return "Updated";
	}
	}
	
	@GetMapping(path = "/delete")
	public @ResponseBody String deleteUser(@RequestParam Integer id) {
		userService.deleteById(id);
		return "Delete";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userService.findAll();
	}
	@GetMapping("/allWithName")
	public @ResponseBody Iterable<User> getAllUserWithName(@RequestParam String name) {
		return userService.findAllWithName(name);
	}

}