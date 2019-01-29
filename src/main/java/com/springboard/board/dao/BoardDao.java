package com.springboard.board.dao;

import com.springboard.board.dto.Board;

import java.util.List;

public interface BoardDao {
     Board getBoard(Long id);
     List<Board> getBoards(int start, int limit);
     void addBoard(Board board);
     void deleteBoard(Long id);
     void updateBoard(Long id);
     void updateReadCount(Long id);
     Long getLastInsertId();
     void updateLastInsertId(Long id);
     void updateGroupSeqGt(int groupNo, int groupSeq);
     void addReBoard(Board board);
}
