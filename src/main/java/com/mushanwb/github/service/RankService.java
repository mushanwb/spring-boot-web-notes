package com.mushanwb.github.service;

import com.mushanwb.github.dao.RankDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankService {

    @Autowired
    private RankDao rankDao;

    public Object getRank() {
        return rankDao.getRank();
    }

}
