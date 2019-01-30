package com.springboard.board.service;

import com.springboard.board.dto.Board;

import java.util.List;

public interface BoardService {
    public List<Board> getBoards(int page);
    public Board getBoard(Long id);
    public void deleteBoard(Long id);
    void addBoard(Board board);
    void updateBoard(Board board);
    void addReBoard(Board board);
}

