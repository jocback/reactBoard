package com.react.reactboard.board.mapper;

import com.react.reactboard.board.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BoardMapper {

    List<BoardVO> selectBoardList(BoardVO boardVo);

    int insertBoard(BoardVO boardVO);

    BoardVO getBoard(int boardNo);

    int updateBoard(BoardVO boardVO);

    int deleteBoard(int boardNo);

}
