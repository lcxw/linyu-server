package com.cershy.linyuserver.admin.vo.conversation;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ResetSecretVo {
    @NotNull(message = "会话不能为空~")
    private String conversationId;
}