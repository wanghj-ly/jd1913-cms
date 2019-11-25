package com.briup.cms.service;

import com.briup.cms.bean.Link;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface ILinkService {
    void seveOrUpdateLink(Link link) throws CustomerException;

    void deletelLink(int id) throws CustomerException;

    Link quesryById(int id) throws CustomerException;

    List<Link> getAllLink() throws CustomerException;
}

