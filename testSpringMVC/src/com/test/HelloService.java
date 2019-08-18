package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HelloService {
    @Autowired
    private HelloDao helloDao;

    public List<Map<String,Object>> getInfo() {
        List<Map<String,Object>> resultList =  helloDao.getInfo();
        String name = resultList.get(0).get("name").toString();
        System.out.println(name);
        return resultList;
    }
}
