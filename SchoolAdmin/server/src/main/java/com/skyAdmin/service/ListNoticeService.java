package com.skyAdmin.service;


import com.skyAdmin.DTO.home.homeNoticeDTO;
import com.skyAdmin.VO.home.homeNoticeVO;

import java.util.List;

public interface ListNoticeService {

    List<homeNoticeVO> listNotice();

    void addNotice(homeNoticeDTO homeNoticeDTO);

    void deleteNotice(Integer id);
}
