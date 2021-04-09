package com.iwhalecloud.chinatower.dataqualitymonitor.controller;

import com.iwhalecloud.chinatower.dataqualitymonitor.common.ResponseResult;
import com.iwhalecloud.chinatower.dataqualitymonitor.service.interfaces.IUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class.getName());
    private final IUserRoleService userRoleService;
    
    public IndexController(IUserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }
    
    /**
     * 查询当前登录用户的用户编码
     *
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/{id:[0-9]+}")
    public ResponseResult queryUserId(@PathVariable("id") Long userId) {
        return ResponseResult.success(null, 1, userRoleService.queryRoles(userId));
    }

    /**
     * 查询当前登录用户的用户编码
     *
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/{id:[0-9]+}/index")
    public ResponseResult queryUserIdTest(@PathVariable("id") Long userId) {
        return ResponseResult.success(null, 1, userRoleService.queryRoles(userId));
    }

    @RequestMapping("/index.html")
    public ModelAndView demo() {
        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("roles", userRoleService.queryRoles(322543682924449792L));

        return modelAndView;
    }
}
