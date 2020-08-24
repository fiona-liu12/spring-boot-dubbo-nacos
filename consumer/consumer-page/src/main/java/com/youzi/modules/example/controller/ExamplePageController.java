package com.youzi.modules.example.controller;

import com.youzi.common.controller.page.BasePageController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO
 * @author: zhuqi
 * @date: 2020年07月22日 11:40
 */
@Controller
@RequestMapping("/example")
public class ExamplePageController extends BasePageController {

    @RequestMapping("/list")
    public String list() {
        return "example/list";
    }

}
