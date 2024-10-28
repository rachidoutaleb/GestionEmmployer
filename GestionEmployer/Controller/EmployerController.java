package com.example.GestionEmployer.Controller;

import com.example.GestionEmployer.Entity.Employer;
import com.example.GestionEmployer.Service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employers")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @PostMapping("/addEmployer")
    public int save(@RequestBody Employer employer) {
        return employerService.save(employer);
    }

    @GetMapping("/all")
    public List<Employer> findAll() {
        return employerService.findAll();
    }

    @DeleteMapping("id/{id}")
    public void deleteById(@PathVariable int id) {
        employerService.deleteById(id);
    }

    @GetMapping("id/{id}")
    public Employer findById(@PathVariable int id) {
        return employerService.findById(id);
    }

    @GetMapping("/count")
    public long count() {
        return employerService.count();
    }

    @PutMapping("/id/{id}")
    public Employer update(@PathVariable int id, @RequestBody Employer employer) {
        Employer existingEmployer = employerService.findById(id);
        if (existingEmployer == null) {
            throw new RuntimeException("Employer not found with id: " + id);
        }
        employer.setId(id);
        return employerService.update(employer);
    }



}