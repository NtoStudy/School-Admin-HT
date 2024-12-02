package com.skyAdmin.service.impl;
import com.skyAdmin.DTO.home.homeApplicationDTO;
import com.skyAdmin.VO.home.homeApplicationVo;
import com.skyAdmin.mapper.ListApplicationMapper;
import com.skyAdmin.service.ListApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ListApplicationServiceImpl implements ListApplicationService {
    @Autowired
    private ListApplicationMapper listApplicationMapper;

    @Override
    public List<homeApplicationVo> listApplication() {
        return listApplicationMapper.listApplication();
    }

    @Override
    public void saveOrUpdate(homeApplicationDTO homeApplicationDTO) {
        Integer id = homeApplicationDTO.getId();
        if (id!=null) {
            // 如果有id则是修改
            listApplicationMapper.update(homeApplicationDTO);
        } else {
            listApplicationMapper.save(homeApplicationDTO);
        }
    }

    @Override
    public void deleteApplication(Integer id) {
        listApplicationMapper.deleteApplication(id);
    }
}
