package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.CompactDisc;
import com.conygre.spring.boot.repos.CompactDiscRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CompactDiscServiceImpl implements CompactDiscService {

    @Autowired
    private CompactDiscRepository dao;



    public Iterable<CompactDisc> getCatalog() {
        return dao.findAll();
    }

    @Override
    public CompactDisc getCompactDiscById(int id) {
        Optional<CompactDisc> discOptional =  dao.findById(id);
        if (discOptional.isPresent()) {
            return discOptional.get();
        }
        else return null;
    }

    @Override
    public CompactDisc addNewCompactDisc(CompactDisc disc) {
        disc.setId(0); // assume it is not in the db
        return dao.save(disc);
    }

    @Override
    public CompactDisc updateCompactDisc(CompactDisc disc) {
        return dao.save(disc);
    }

    @Override
    public void deleteCompactDisc(int id) {
        CompactDisc toBeDeleted = dao.findById(id).get();
        deleteCompactDisc(toBeDeleted);

    }

    @Override
    public void deleteCompactDisc(CompactDisc disc) {
        dao.delete(disc);
    }
}
