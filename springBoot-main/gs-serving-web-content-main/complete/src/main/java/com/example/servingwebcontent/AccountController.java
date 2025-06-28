package com.example.servingwebcontent;

import com.example.servingwebcontent.model.Account;
import com.example.servingwebcontent.model.AccountRepository;
import com.example.servingwebcontent.model.Player;
import com.example.servingwebcontent.model.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;
    
    @Autowired
    private PlayerRepository playerRepository;

    // Trang chủ (index)
    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    // Trang đăng nhập
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // Trang đăng ký
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    // Xử lý đăng nhập
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if (username.equals("admin") && password.equals("admin123")) {
            model.addAttribute("accounts", accountRepository.findAll());
            return "accounts";
        }
        Account acc = accountRepository.findByUsername(username);
        if (acc != null && acc.getPassword().equals(password)) {
            // Chuyển đến trang chọn nhân vật thay vì vào game trực tiếp
            // Hiển thị tất cả player có sẵn để tài khoản có thể chọn
            List<Player> players = playerRepository.findAll();
            model.addAttribute("username", username);
            model.addAttribute("players", players);
            return "choose-character";
        }
        model.addAttribute("error", "Sai tên đăng nhập hoặc mật khẩu");
        return "login";
    }

    // Xử lý đăng ký
    @PostMapping("/register")
    public String register(@RequestParam("new-username") String newUsername, @RequestParam("new-password") String newPassword, Model model) {
        if (accountRepository.findByUsername(newUsername) != null) {
            model.addAttribute("error", "Tài khoản đã tồn tại");
            return "register";
        }
        Account newAcc = new Account();
        newAcc.setUsername(newUsername);
        newAcc.setPassword(newPassword);
        accountRepository.save(newAcc);
        model.addAttribute("success", "Đăng ký thành công!");
        return "register";
    }

    // Trang quản lý tài khoản (chỉ cho admin)
    @GetMapping("/admin/accounts")
    public String listAccounts(@RequestParam(value = "search", required = false) String search, Model model) {
        List<Account> accounts;
        if (search != null && !search.trim().isEmpty()) {
            accounts = accountRepository.findByUsernameContainingIgnoreCase(search.trim());
        } else {
            accounts = accountRepository.findAll();
        }
        model.addAttribute("accounts", accounts);
        model.addAttribute("searchTerm", search != null ? search : "");
        return "accounts";
    }

    // Trang thêm tài khoản mới (admin)
    @GetMapping("/admin/accounts/add")
    public String addAccountPage() {
        return "add-account";
    }

    // Xử lý thêm tài khoản mới (admin) - Không dùng redirect
    @PostMapping("/admin/accounts/add")
    public String addAccount(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if (accountRepository.findByUsername(username) != null) {
            model.addAttribute("error", "Tài khoản đã tồn tại");
            return "add-account";
        }
        Account acc = new Account();
        acc.setUsername(username);
        acc.setPassword(password);
        accountRepository.save(acc);

        // Sau khi thêm xong, load lại danh sách
        model.addAttribute("accounts", accountRepository.findAll());
        model.addAttribute("searchTerm", "");
        return "accounts";
    }

    // Trang sửa tài khoản (admin)
    @GetMapping("/admin/accounts/edit")
    public String editAccountPage(@RequestParam("username") String username, Model model) {
        Account acc = accountRepository.findByUsername(username);
        if (acc != null) {
            model.addAttribute("account", acc);
        }
        return "edit-account";
    }

    // Xử lý cập nhật tài khoản (admin) - Không dùng redirect
    @PostMapping("/admin/accounts/edit")
    public String editAccount(@RequestParam("old-username") String oldUsername,
                              @RequestParam("username") String username,
                              @RequestParam("password") String password,
                              Model model) {
        Account acc = accountRepository.findByUsername(oldUsername);
        if (acc != null) {
            acc.setUsername(username);
            acc.setPassword(password);
            accountRepository.save(acc);
        }
        model.addAttribute("accounts", accountRepository.findAll());
        model.addAttribute("searchTerm", "");
        return "accounts";
    }

    // Xử lý xóa tài khoản (admin) - Không dùng redirect
    @PostMapping("/admin/accounts/delete")
    public String deleteAccount(@RequestParam("username") String username, Model model) {
        Account acc = accountRepository.findByUsername(username);
        if (acc != null) {
            accountRepository.delete(acc);
            model.addAttribute("success", "Xoá tài khoản thành công!");
        } else {
            model.addAttribute("error", "Không tìm thấy tài khoản để xoá!");
        }
        model.addAttribute("accounts", accountRepository.findAll());
        model.addAttribute("searchTerm", "");
        return "accounts";
    }
}
