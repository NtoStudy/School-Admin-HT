package com.skyAdmin.controller.home;

import com.skyAdmin.VO.home.homeNoticeVO;
import com.skyAdmin.DTO.home.homeNoticeDTO;
import com.skyAdmin.common.result.Result;
import com.skyAdmin.service.ListNoticeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/home")
@Tag(name = "首页")
public class listNoticeController {

    @Autowired
    private ListNoticeService listNoticeService;

    @Operation(summary = "获取通知通告列表")
    @GetMapping("notice")
    public Result<List<homeNoticeVO>> listNotice(){
        List<homeNoticeVO> list = listNoticeService.listNotice();
        return Result.ok(list);
    }


    @Operation(summary = "添加通知通告")
    @PostMapping("notice")
    public Result addNotice(@RequestBody homeNoticeDTO homeNoticeDTO){
        listNoticeService.addNotice(homeNoticeDTO);
        return Result.ok();
    }


    @Operation(summary = "删除通知通告")
    @DeleteMapping("notice")
    public Result deleteNotice(@RequestParam Integer id){
        listNoticeService.deleteNotice(id);
        return Result.ok();
    }





}
