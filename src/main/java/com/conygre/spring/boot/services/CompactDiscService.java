package com.conygre.spring.boot.services;

import com.conygre.spring.boot.repos.CompactDiscRepository;
import com.conygre.spring.boot.entities.CompactDisc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional (propagation = Propagation.REQUIRED)
public interface CompactDiscService {

	Iterable<CompactDisc> getCatalog();

	CompactDisc getCompactDiscById(int id);

	CompactDisc addNewCompactDisc(CompactDisc disc);

	void deleteCompactDisc(int id);

	void deleteCompactDisc(CompactDisc disc);

	CompactDisc updateCompactDisc(CompactDisc disc);
}
