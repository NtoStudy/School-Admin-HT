package com.skyAdmin.mapper;



import com.skyAdmin.DTO.home.homeApplicationDTO;
import com.skyAdmin.VO.home.homeApplicationVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ListApplicationMapper {

    List<homeApplicationVo> listApplication();

    void update(homeApplicationDTO homeApplicationDTO);

    void save(homeApplicationDTO homeApplicationDTO);

    void deleteApplication(Integer id);
}
