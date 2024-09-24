package com.cershy.linyuserver.admin.vo.user;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CancelAdminVo {
    @NotNull(message = "用户不能为空")
    private String userId;
}
