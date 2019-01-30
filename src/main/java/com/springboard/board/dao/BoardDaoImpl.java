package com.springboard.board.dao;

import com.springboard.board.dto.Board;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.springboard.board.dao.BoardDaoSqls.*;

@Repository
public class BoardDaoImpl implements BoardDao {
    private SimpleJdbcInsert simpleJdbcInsert;
    private NamedParameterJdbcTemplate jdbc;
    private RowMapper<Board> rowMapper = BeanPropertyRowMapper.newInstance(Board.class);

    public BoardDaoImpl(DataSource dataSource){
        jdbc = new NamedParameterJdbcTemplate(dataSource);
        simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
                .withTableName("board")
                .usingGeneratedKeyColumns("id");
    }

    @Override
    public Board getBoard(Long id) {
        Board board = null;
        try{
            Map<String, Object> paramMap =
                    Collections.singletonMap("id", id);
            board = jdbc.queryForObject(SELECT_BY_ID, paramMap, rowMapper);
        }catch(EmptyResultDataAccessException ex){
            return null;
        }
        return board;
    }

    @Override
    public List<Board> getBoards(int start, int limit) {

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("start", start);
        paramMap.put("limit", limit);
        return jdbc.query(SELECT_BY_PAGING, paramMap, rowMapper);
    }

    @Override
    public long addBoard(Board board) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("title",board.getTitle());
        paramMap.put("userId",board.getUser_id());
        paramMap.put("content", board.getContent());
        paramMap.put("nickname", board.getNickname());

                jdbc.queryForObject(INSERT, paramMap, rowMapper);

        //Number number = simpleJdbcInsert.executeAndReturnKey(paramMap);
        return 0L;


    }

    @Override
    public void deleteBoard(Long id) {

    }

    @Override
    public void updateBoard(Board board) {

    }

    @Override
    public void updateReadCount(Long id) {

    }

    @Override
    public Long getLastInsertId() {
        return null;
    }

    @Override
    public void updateLastInsertId(Long id) {

    }

    @Override
    public void updateGroupSeqGt(int groupNo, int groupSeq) {

    }

    @Override
    public void addReBoard(Board board) {

    }
}
