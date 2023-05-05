package com.spring.Snackx.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;
@Entity

@Table(name = "snackx")
public class Snackx {
	
	@Id

		@GeneratedValue(strategy = GenerationType.AUTO)

		private int id;

		private String uname;

		private String pwd;

		public int getId() {

			return id;

		}

		public void setId(int id) {

			this.id = id;

		}

		public String getUname() {

			return uname;

		}

		public void setUname(String uname) {

			this.uname = uname;

		}

		public String getPwd() {

			return pwd;

		}

		public void setPwd(String pwd) {

			this.pwd = pwd;

		}
	}
