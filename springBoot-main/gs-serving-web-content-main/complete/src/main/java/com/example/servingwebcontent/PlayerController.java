package com.example.servingwebcontent;

import com.example.servingwebcontent.model.Player;
import com.example.servingwebcontent.model.PlayerRepository;
import com.example.servingwebcontent.model.Account;
import com.example.servingwebcontent.model.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/players")
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private AccountRepository accountRepository;

    // Danh sách nhân vật
    @GetMapping
    public String listPlayers(@RequestParam(value = "search", required = false) String search, Model model) {
        List<Player> players;
        if (search != null && !search.trim().isEmpty()) {
            players = playerRepository.findByNameContainingIgnoreCase(search.trim());
        } else {
            players = playerRepository.findAll();
        }
        model.addAttribute("players", players);
        model.addAttribute("searchTerm", search != null ? search : "");
        return "players";
    }

    // Trang thêm nhân vật
    @GetMapping("/add")
    public String addPlayerPage(Model model) {
        model.addAttribute("accounts", accountRepository.findAll());
        return "add-player";
    }

    // Xử lý thêm nhân vật
    @PostMapping("/add")
    public String addPlayer(@RequestParam("name") String name, 
                           @RequestParam("level") int level, 
                           @RequestParam("attack") int attack, 
                           @RequestParam("hp") int hp,
                           @RequestParam("defense") int defense,
                           @RequestParam("avatar") String avatar,
                           @RequestParam("accountId") Long accountId,
                           Model model) {
        Player player = new Player();
        player.setName(name);
        player.setLevel(level);
        player.setAttack(attack);
        player.setMaxHp(hp);
        player.setHp(hp); // Set current HP = max HP
        player.setDefense(defense);
        player.setAvatar(avatar);
        
        // Liên kết với account
        Account account = accountRepository.findById(accountId).orElse(null);
        if (account != null) {
            player.setAccount(account);
        }
        
        playerRepository.save(player);
        
        // Sau khi thêm xong, load lại danh sách
        model.addAttribute("players", playerRepository.findAll());
        model.addAttribute("searchTerm", "");
        return "players";
    }

    // Trang sửa nhân vật
    @GetMapping("/edit")
    public String editPlayerPage(@RequestParam("id") Long id, Model model) {
        Player player = playerRepository.findById(id).orElse(null);
        model.addAttribute("player", player);
        model.addAttribute("accounts", accountRepository.findAll());
        return "edit-player";
    }

    // Xử lý cập nhật nhân vật
    @PostMapping("/edit")
    public String editPlayer(@RequestParam("id") Long id, 
                            @RequestParam("name") String name, 
                            @RequestParam("level") int level, 
                            @RequestParam("attack") int attack, 
                            @RequestParam("hp") int hp,
                            @RequestParam("defense") int defense,
                            @RequestParam("avatar") String avatar,
                            @RequestParam("accountId") Long accountId,
                            Model model) {
        Player player = playerRepository.findById(id).orElse(null);
        if (player != null) {
            player.setName(name);
            player.setLevel(level);
            player.setAttack(attack);
            player.setMaxHp(hp);
            player.setHp(hp); // Reset current HP to max HP when editing
            player.setDefense(defense);
            player.setAvatar(avatar);
            
            // Cập nhật liên kết với account
            Account account = accountRepository.findById(accountId).orElse(null);
            player.setAccount(account);
            
            playerRepository.save(player);
        }
        
        // Sau khi sửa xong, load lại danh sách
        model.addAttribute("players", playerRepository.findAll());
        model.addAttribute("searchTerm", "");
        return "players";
    }

    // Xử lý xoá nhân vật
    @PostMapping("/delete")
    public String deletePlayer(@RequestParam("id") Long id, Model model) {
        playerRepository.deleteById(id);
        
        // Sau khi xóa xong, load lại danh sách
        model.addAttribute("players", playerRepository.findAll());
        model.addAttribute("searchTerm", "");
        return "players";
    }

    @GetMapping("/choose-character")
    public String chooseCharacterPage(@RequestParam("username") String username, Model model) {
        List<Player> players = playerRepository.findByAccount_Username(username);
        model.addAttribute("players", players);
        model.addAttribute("username", username);
        return "choose-character";
    }
    
    // Hiển thị nhân vật cấp cao
    @GetMapping("/high-level")
    public String showHighLevelPlayers(@RequestParam(value = "minLevel", required = false, defaultValue = "50") int minLevel, Model model) {
        try {
            // Lấy danh sách nhân vật cấp cao (level >= minLevel) sử dụng query tối ưu
            List<Player> highLevelPlayers = playerRepository.findHighLevelPlayers(minLevel);
            model.addAttribute("highLevelPlayers", highLevelPlayers);
            model.addAttribute("minLevel", minLevel);
            // Thống kê
            long legendaryCount = highLevelPlayers.stream().filter(p -> p.getLevel() >= 80).count();
            long eliteCount = highLevelPlayers.stream().filter(p -> p.getLevel() >= 60 && p.getLevel() < 80).count();
            long masterCount = highLevelPlayers.stream().filter(p -> p.getLevel() >= 50 && p.getLevel() < 60).count();
            model.addAttribute("legendaryCount", legendaryCount);
            model.addAttribute("eliteCount", eliteCount);
            model.addAttribute("masterCount", masterCount);
            model.addAttribute("totalCount", highLevelPlayers.size());
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "Lỗi khi tải dữ liệu nhân vật cấp cao: " + e.getMessage());
        }
        return "high-level-players";
    }
} 