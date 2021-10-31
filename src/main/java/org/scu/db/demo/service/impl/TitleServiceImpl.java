package org.scu.db.demo.service.impl;

import org.scu.db.demo.mapper.TitleMapper;
import org.scu.db.demo.model.Book;
import org.scu.db.demo.model.Title;
import org.scu.db.demo.service.BookService;
import org.scu.db.demo.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TitleServiceImpl implements TitleService {
    @Autowired
    private TitleMapper titleMapper;
    public List<Title> findIliadOrOdysseyTitle()
    {
        return titleMapper.IandO();
    }
}
