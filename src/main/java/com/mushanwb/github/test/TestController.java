package com.mushanwb.github.test;

import com.mushanwb.github.entity.User;
import com.mushanwb.github.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    private UserService userService;

    @Inject
    public TestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public User index() {
        return userService.getUserByID(1);
    }


    /**
     * get 请求
     * @param searchKeyWord 对应的 RequestParam q 可传可不传
     * @param chart 对应的 RequestParam char 必传
     * @return String
     */
    @RequestMapping("/search")
    public String search(@RequestParam(value = "q", required = false)String searchKeyWord,
                         @RequestParam("char")String chart) {
        return "You are searching " + searchKeyWord;
    }

    @RequestMapping("/get")
    @ResponseBody
    public Object get(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> result = new HashMap<>();
        result.put("result", Arrays.asList("aaa","bbb","ccc","ddd"));
        return result;
    }

    @DeleteMapping("/{owner}/{repo}/issues/{issuesNumber}/lock")
    public void unlock(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @PathVariable("issuesNumber") String issuesNumber) {

        System.out.println(owner);
        System.out.println(repo);
        System.out.println(issuesNumber);
    }

    /**
     * post 请求
     * @param owner  对应的 url 路径参数
     * @param repo  对应的 url 路径参数
     * @param object    接收的是 raw 中的 json 格式参数
     */
    @PostMapping("/{owner}/{repo}/issues")
    public void create(@PathVariable("owner") String owner,
                       @PathVariable("repo") String repo,
                       @RequestBody TestParam object) {

        System.out.println(owner);
        System.out.println(repo);
        System.out.println(object);
    }

    /**
     * post 请求
     * @param aaa 接收的是 x-www-form-urlencoded 格式
     * @param bbb 同上
     */
    @PostMapping("/demo")
    public void formDemo(@RequestParam("aaa") int aaa,
                         @RequestParam(value = "bbb", required = false) String bbb) {

        System.out.println(aaa + 1);
        System.out.println(bbb + "1");

    }
}
