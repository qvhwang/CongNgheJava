package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        if ("admin".equals(username) && "123".equals(password)) {
            model.addAttribute("message", "Đăng nhập thành công!");
        } else {
            model.addAttribute("message", "Sai tên đăng nhập hoặc mật khẩu.");
        }
        return "login";
    }
}
