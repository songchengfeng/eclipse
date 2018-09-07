package com.iotek.service.impl;

import java.util.List;

import com.iotek.consts.Consts;
import com.iotek.entity.Mail;
import com.iotek.entity.Pagination;
import com.iotek.service.MailService;

import dao.NewsDao;
import daoImpl.NewsDaoImpl;

public class MailServiceImpl implements MailService {

	private NewsDao mailDao = new NewsDaoImpl();

	@Override
	public List<Mail> queryMail(String receivePerson) {
		return newsDao.queryMail(receivePerson);
	}

	@Override
	public Mail queryMailById(int id) {
		return  newsDao.queryMailById(id);
	}

	@Override
	public Pagination queryMailByPagination(String receivePerson, int currPage) {
		Pagination page = new Pagination();
		
		page.setPageSize(Consts.PAGE_SIZE);
		page.setCurrPage(currPage);
		page.setTotalRecord( newsDao.queryMailCount(receivePerson));
		page.setResultList( newsDao.queryMailByPage(receivePerson, page.getPageSize(), currPage));
		return page;
	}

}
