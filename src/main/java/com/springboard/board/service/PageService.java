package com.springboard.board.service;

import com.springboard.board.dto.Board;

import java.util.List;

public interface PageService {
    public int getCount();
    public List<Board> search(String sort, String value);
}
