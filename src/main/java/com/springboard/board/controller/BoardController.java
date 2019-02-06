package com.springboard.board.controller;

import com.springboard.board.dto.Board;
import com.springboard.board.dto.User;
import com.springboard.board.service.BoardService;
import com.springboard.board.service.PageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BoardController {
    BoardService boardService;
    PageService pageService;

    public BoardController(BoardService boardService, PageService pageService){
        this.boardService = boardService;
        this.pageService = pageService;
    }

    @GetMapping("/writeform")
    public String writeform(){
            return "writeform";
    }

    @PostMapping("/write")
    public String write(
            @ModelAttribute Board board,
            @RequestHeader(name = "Accept") String accept,
            HttpSession session
    ){
        User user = (User)session.getAttribute("user");
        board.setUser_id(user.getId());
        board.setNickname(user.getNickname());
        boardService.addBoard(board);

        return "redirect:/board";
    }
    @GetMapping("/board")
    public String main(
            @RequestParam(name = "page", required = false, defaultValue = "1") int page,
            Model model){
        List<Board> boards = boardService.getBoards(page);
        int count = pageService.getCount();
        int lastNum = pageService.getlastNum(count);
        model.addAttribute("boards", boards);
        model.addAttribute("lastNum", lastNum);
        return "board"; // view name
    }

    @GetMapping("/content")
    public String content(
            @RequestParam(name = "id") long id,
            Model model){
        Board board = boardService.getBoard(id);
        model.addAttribute("board", board);
        return "content";
    }

    @GetMapping("/modifyform")
    public String modifyform(
            @RequestParam(name = "id") long id,
            Model model
    ){
        Board board = boardService.getBoard(id);
        model.addAttribute("board", board);
        return "modifyform";
    }

    @PostMapping("/modify")
    public String modify(
            @ModelAttribute Board board,
            @RequestHeader(name = "Accept") String accept,
            HttpSession session
    ){
        boardService.updateBoard(board);
        return "redirect:/board";
    }

    @GetMapping("/rewriteform")
    public String rewriteform(
            @RequestParam(name = "id") long id,
            Model model
    ){
        Board board = boardService.getBoard(id);
        model.addAttribute("board", board);
        return "rewriteform";
    }

    @PostMapping("/rewrite")
    public String rewrite(
            @ModelAttribute Board board,
            @RequestHeader(name = "Accept") String accept,
            HttpSession session
    ){
        User user = (User)session.getAttribute("user");
        board.setUser_id(user.getId());
        board.setNickname(user.getNickname());
        boardService.addReBoard(board);
        return "redirect:/board";
    }

    @GetMapping("/delete")
    public String delete(
            @RequestParam(name = "id") long id,
                         Model model){
        boardService.deleteBoard(id);

        return "redirect:/board";
    }
}
