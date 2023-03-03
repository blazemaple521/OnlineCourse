package com.yolo.xczx.media.mapper;

import com.yolo.xczx.media.model.po.MqMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 912
 */
@Mapper

public interface MqMessageMapper extends BaseMapper<MqMessage> {

}
