package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class HelloDao {
    @Autowired
    private JdbcTemplate testJdbcTemplate;
    public List<Map<String,Object>> getInfo(){
        String sql = "select id,name,addr from base_info";
        return testJdbcTemplate.queryForList(sql);
    }
}
