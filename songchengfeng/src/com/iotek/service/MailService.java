package com.iotek.service;

import java.util.List;

import com.iotek.entity.Mail;
import com.iotek.entity.Pagination;

public interface MailService {
	public List<Mail> queryMail(String receivePerson);

	public Mail queryMailById(int id);
	
	public Pagination queryMailByPagination(String receivePerson, int currPage);
}
