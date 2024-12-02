package com.skyAdmin.controller.home;

import com.skyAdmin.DTO.home.homeApplicationDTO;
import com.skyAdmin.VO.home.homeApplicationVo;
import com.skyAdmin.common.result.Result;
import com.skyAdmin.service.ListApplicationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/home")
@Tag(name = "首页")
public class listApplicationController {

    @Autowired
    private ListApplicationService listApplicationService;

    @Operation(summary = "获取事务申请列表")
    @GetMapping("application")
    public Result<List<homeApplicationVo>> listApplication(){
        List<homeApplicationVo> list = listApplicationService.listApplication();
        return Result.ok(list);
    }

    @Operation(summary = "新增或修改事务申请")
    @PostMapping("application")
    public Result saveOrUpdate(@RequestBody homeApplicationDTO homeApplicationDTO){
        listApplicationService.saveOrUpdate(homeApplicationDTO);
        return Result.ok();
    }

    @DeleteMapping("application")
    @Operation(summary = "删除事务申请")
    public Result deleteApplication(@RequestParam Integer id){
        listApplicationService.deleteApplication(id);
        return Result.ok();
    }

}
