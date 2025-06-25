package com.example.servingwebcontent;

import com.example.servingwebcontent.model.Player;
import com.example.servingwebcontent.model.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class GameController {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/choose-character")
    public String chooseCharacterPage(@RequestParam("username") String username, Model model) {
        List<Player> players = playerRepository.findAll();
        model.addAttribute("players", players);
        model.addAttribute("username", username);
        return "choose-character";
    }
} 