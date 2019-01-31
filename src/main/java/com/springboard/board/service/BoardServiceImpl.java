package com.springboard.board.service;

import com.springboard.board.dao.BoardDao;
import com.springboard.board.dto.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardDao boardDao;

    public BoardServiceImpl(BoardDao boardDao){
        this.boardDao = boardDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Board> getBoards(int page) {
        int start = page* 5 - 5;
        return boardDao.getBoards(start, 5);
    }

    @Override
    @Transactional
    public Board getBoard(Long id) {
        boardDao.updateReadCount(id);
        return boardDao.getBoard(id);
    }

    @Override
    public void deleteBoard(Long id) {

    }

    @Override
    @Transactional
    public void addBoard(Board board) {
        Long id = boardDao.addBoard(board);
        board.setId(id);
    }

    @Override
    @Transactional
    public void updateBoard(Board board) {
        boardDao.updateBoard(board);
    }

    @Override
    public void addReBoard(Board board) {

    }
}
