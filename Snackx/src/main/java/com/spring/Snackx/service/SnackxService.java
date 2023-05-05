package com.spring.Snackx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.spring.Snackx.Repository.SnackxRepository;
import com.spring.Snackx.model.Snackx;

@Service
public class SnackxService {
        @Autowired
        SnackxRepository repository;
        public String checkLogin(String uname,String pwd) {
        	Snackx user=repository.findByuname(uname);
        	if(user==null) {
        		return "no user found";
        	}
        	else
        	{
        		if(user.getPwd().equals(pwd)) {
        			return "Login Successfull";
        		}
        		else {
        			return "Login Failed";
        		}
        	}
        }
        public Snackx addUser(Snackx snackx) {
        	return repository.save(snackx);
        }
        public List<Snackx> getUser(){
        	return repository.findAll();
        }
        public List<Snackx> paginationAndSorting(int pageNumber,int pageSize,String column_name){
        	Page<Snackx> i=repository.findAll(PageRequest.of(pageNumber, pageSize,Sort.by(column_name).descending()));
        	return i.getContent();
        }
        public List<Snackx>sortDescending(String field){
        	return repository.findAll(Sort.by(Direction.DESC,field));
        }
        public List<Snackx>sortAscending(String field){
        	return repository.findAll(Sort.by(Direction.ASC,field));
        }
        public List<Snackx>pagination(int pageNumber,int pageSize){
        	Page<Snackx>i=repository.findAll(PageRequest.of(pageNumber, pageSize));
        	return i.getContent();
        }
        public List<Snackx>paginationAndSortingList(int pageNumber,int pageSize,String column_name){
        	Page<Snackx> i=repository.findAll(PageRequest.of(pageNumber, pageSize,Sort.by(column_name).descending()));
        	return i.getContent();
        }
        
}
