package com.skyAdmin.mapper;

import com.skyAdmin.DTO.home.homeNoticeDTO;
import com.skyAdmin.VO.home.homeNoticeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ListNoticeMapper {

    List<homeNoticeVO> listNotice();

    void addNotice(homeNoticeDTO homeNoticeDTO);

    void deleteNotice(Integer id);
}
