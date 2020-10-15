package com.mushanwb.github.service;

import javax.inject.Inject;

public class OrderService {

    // OrderService 依赖 UserService,
    // 之前都是使用的 @Resource 或者 Autowired 注入，这些都是历史的注入方法
    // 现在的依赖注入标准使使用 构造器注入，也就是使用 @Inject
    // 需要去安装 @Inject maven 依赖
    private UserService userService;

    @Inject
    public OrderService(UserService userService) {
        this.userService = userService;
    }

    public void placeOrder(Integer userId, String item) {
        userService.getUserByID(userId);
    }

}
