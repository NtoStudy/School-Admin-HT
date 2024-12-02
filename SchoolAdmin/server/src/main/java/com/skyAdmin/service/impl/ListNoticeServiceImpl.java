package com.skyAdmin.service.impl;

import com.skyAdmin.DTO.home.homeNoticeDTO;
import com.skyAdmin.VO.home.homeNoticeVO;
import com.skyAdmin.mapper.ListNoticeMapper;
import com.skyAdmin.service.ListNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListNoticeServiceImpl implements ListNoticeService {

    @Autowired
    private ListNoticeMapper listNoticeMapper;

    @Override
    public List<homeNoticeVO> listNotice() {
        return listNoticeMapper.listNotice();
    }

    @Override
    public void addNotice(homeNoticeDTO homeNoticeDTO) {
        listNoticeMapper.addNotice(homeNoticeDTO);
    }

    @Override
    public void deleteNotice(Integer id) {
        listNoticeMapper.deleteNotice(id);
    }


}
