package com.springboard.board.dao;

import com.springboard.board.dto.Board;
import com.springboard.board.dto.Page;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.springboard.board.dao.PageDaoSQL.ALLCOUNT;

@Repository
public class PageDaoImpl implements PageDao {
    private SimpleJdbcInsert simpleJdbcInsert;
    private NamedParameterJdbcTemplate jdbc;
    private RowMapper<Page> rowMapper = BeanPropertyRowMapper.newInstance(Page.class);

    public PageDaoImpl(DataSource dataSource){
        jdbc = new NamedParameterJdbcTemplate(dataSource);
        simpleJdbcInsert = new SimpleJdbcInsert(dataSource)
                            .withTableName("board")
                            .usingGeneratedKeyColumns("id");
    }
    @Override
    public int getCount() {
        int result = 0;
        result = jdbc.queryForObject(ALLCOUNT, (HashMap) null, Integer.class);
        return result;
    }

    @Override
    public List<Board> search(String sort, String value) {
        return null;
    }
}
