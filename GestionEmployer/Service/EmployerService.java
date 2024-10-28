package com.example.GestionEmployer.Service;

import com.example.GestionEmployer.Dao.EmployerDao;
import com.example.GestionEmployer.Entity.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {
    @Autowired
    private EmployerDao employerDao;

    public int save(Employer employer) {
        if (employer == null) {
            return -1;
        } else {
            employerDao.save(employer);
            return 1;
        }
    }

    public List<Employer> findAll() {
        return employerDao.findAll();
    }

    public void deleteById(int id) {
        employerDao.deleteById(id);
    }

    public Employer findById(int id) {
        return employerDao.findById(id).orElse(null);
    }

    public long count() {
        return employerDao.count();
    }

    public Employer update(Employer employer) {
        return employerDao.save(employer);
    }

}
