package com.react.reactboard.board.service;

import com.react.reactboard.board.mapper.BoardMapper;
import com.react.reactboard.board.model.Board;
import com.react.reactboard.board.repository.BoardRepository;
import com.react.reactboard.board.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private BoardMapper boardMapper;

    public List<Board> getAllBoard() {
        return boardRepository.findAll();
    }

    public List<BoardVO> selectBoardList(BoardVO boardVo) {
        return boardMapper.selectBoardList(boardVo);
    }

    public int insertBoard(BoardVO boardVO) {
        return boardMapper.insertBoard(boardVO);
    }

    public BoardVO getBoard(int boardNo) {
        return boardMapper.getBoard(boardNo);
    }

    public int updateBoard(BoardVO boardVO) {
        return boardMapper.updateBoard(boardVO);
    }

    public int deleteBoard(int boardNo) {
        return boardMapper.deleteBoard(boardNo);
    }
}
