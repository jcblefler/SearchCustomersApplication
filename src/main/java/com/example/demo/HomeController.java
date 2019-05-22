package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    StateRepository stateRepository;

    @RequestMapping("/")
    public String listCustomers(Model model){
        model.addAttribute("customers", customerRepository.findAll());

        String lastName = "Smith";
        model.addAttribute("customers",customerRepository.findByLastName(lastName));

        return "list";
    }

    @GetMapping("/add")
    public String customerForm(Model model){
        model.addAttribute("customer", new Customer());

        return "customerform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Customer customer, BindingResult results){
        if (results.hasErrors()){
            return "customerform";
        }
        customerRepository.save(customer);
        return "redirect:/";
    }


}
