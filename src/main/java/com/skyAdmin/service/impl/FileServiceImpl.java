package com.skyAdmin.service.impl;

import com.skyAdmin.entity.File;
import com.skyAdmin.mapper.FileMapper;
import com.skyAdmin.service.IFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文件表 服务实现类
 * </p>
 *
 * @author 哞哞
 * @since 2024-12-02
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
