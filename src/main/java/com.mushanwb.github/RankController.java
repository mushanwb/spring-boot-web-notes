package com.mushanwb.github;

import com.mushanwb.github.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RankController {

    @Autowired
    private RankService rankService;


    /**
     * 需求：做一个分数排名
     * 字段包括：姓名和分数
     * @return Object
     */
    @RequestMapping("/rank")
    public Object rank() {
        return rankService.getRank();
    }

}
