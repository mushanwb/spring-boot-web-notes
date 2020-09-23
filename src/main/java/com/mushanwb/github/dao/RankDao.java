package com.mushanwb.github.dao;

import com.mushanwb.github.entity.RankItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankDao {

    @Autowired
    private SqlSession sqlSession;

    public List<RankItem>getRank() {
        return sqlSession.selectList("RankMapper.selectRank");
    }
}
