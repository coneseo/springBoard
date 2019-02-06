package com.springboard.board.dao;

import com.springboard.board.dto.Board;

import java.util.List;

public interface PageDao {
    public int getCount();
    public List<Board> search(String sort, String value);
}
