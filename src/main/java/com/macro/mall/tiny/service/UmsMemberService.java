package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;

/**
 * 会员管理Service
 *
 * @Author: thl
 * @Date: 2019/10/2
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
