package com.kakao.auth.common;

public interface MessageSendable {
    String getTargetId();

    String getType();

    boolean isAllowedMsg();
}
