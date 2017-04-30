package com.diary.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {

    @RequestMapping(value = "/blog/{blogId}", method = RequestMethod.GET)
    public String getData(@PathVariable String blogId) {
        return "blog";
    }

    @RequestMapping(value = "/blog", method = RequestMethod.POST)
    public String postData(@PathVariable String blogId) {
        return "blog";
    }
}
