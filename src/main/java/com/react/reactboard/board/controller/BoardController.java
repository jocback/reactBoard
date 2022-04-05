package com.react.reactboard.board.controller;

import com.react.reactboard.board.model.Board;
import com.react.reactboard.board.service.BoardService;
import com.react.reactboard.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;

    // 게시판 목록 조회
    @GetMapping("/api/board")
    public List<BoardVO> getAllBoards() {
        BoardVO boardVO = new BoardVO();
        List<BoardVO> list = boardService.selectBoardList(boardVO);
        return list;
    }

    // 게시글 등록
    @PostMapping("/api/board")
    public void createBoard(@RequestBody BoardVO boardVO) {
        boardService.insertBoard(boardVO);
    }

    @GetMapping("/api/board/{boardNo}")
    public BoardVO getBoardByNo(@PathVariable Integer boardNo) {
        return boardService.getBoard(boardNo);
    }

    @PutMapping("/api/board/{boardNo}")
    public void updateBoard(@PathVariable Integer boardNo, @RequestBody BoardVO boardVO){
        boardVO.setBoardNo(boardNo);
        boardService.updateBoard(boardVO);
    }

    @DeleteMapping("/api/board/{boardNo}")
    public void deleteBoard(@PathVariable Integer boardNo) {
        boardService.deleteBoard(boardNo);
    }
}
