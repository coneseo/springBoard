package com.springboard.board.service;

import com.springboard.board.dao.PageDao;
import com.springboard.board.dto.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PageServiceImpl implements PageService {
    @Autowired
    private PageDao pageDao;

    public PageServiceImpl(PageDao pageDao){
        this.pageDao = pageDao;
    }
    private final int SIZE = 5;
    @Override
    @Transactional
    public int getCount() {
        int result = 0;
        result = pageDao.getCount();
        return result;
    }

    @Override
    public List<Board> search(String sort, String value) {
        return null;
    }

    @Override
    public int getlastNum(int count) {
        int lastNum = 0;
        if(count%SIZE > 0){
            lastNum = (count/SIZE) + 1;
        }else{
            lastNum = count/SIZE;
        }
        return lastNum;
    }
}
