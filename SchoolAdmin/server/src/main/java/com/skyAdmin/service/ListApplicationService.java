package com.skyAdmin.service;

import com.skyAdmin.DTO.home.homeApplicationDTO;
import com.skyAdmin.VO.home.homeApplicationVo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ListApplicationService {

    List<homeApplicationVo> listApplication();


    void saveOrUpdate(homeApplicationDTO homeApplicationDTO);

    void deleteApplication(Integer id);
}
