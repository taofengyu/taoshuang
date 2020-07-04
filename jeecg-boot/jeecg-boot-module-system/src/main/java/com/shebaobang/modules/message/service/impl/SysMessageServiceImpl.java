package com.shebaobang.modules.message.service.impl;

import com.shebaobang.common.system.base.service.impl.JeecgServiceImpl;
import com.shebaobang.modules.message.entity.SysMessage;
import com.shebaobang.modules.message.mapper.SysMessageMapper;
import com.shebaobang.modules.message.service.ISysMessageService;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息
 * @Author: jeecg-boot
 * @Date:  2019-04-09
 * @Version: V1.0
 */
@Service
public class SysMessageServiceImpl extends JeecgServiceImpl<SysMessageMapper, SysMessage> implements ISysMessageService {

}
