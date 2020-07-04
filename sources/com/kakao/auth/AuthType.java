package com.kakao.auth;

public enum AuthType {
    KAKAO_TALK(0),
    KAKAO_STORY(1),
    KAKAO_ACCOUNT(2),
    KAKAO_TALK_EXCLUDE_NATIVE_LOGIN(3),
    KAKAO_LOGIN_ALL(4),
    KAKAO_TALK_ONLY(5);
    
    private final int number;

    public final int getNumber() {
        return this.number;
    }

    public static AuthType valueOf(int i) {
        if (i == KAKAO_TALK.getNumber()) {
            return KAKAO_TALK;
        }
        if (i == KAKAO_STORY.getNumber()) {
            return KAKAO_STORY;
        }
        if (i == KAKAO_ACCOUNT.getNumber()) {
            return KAKAO_ACCOUNT;
        }
        if (i == KAKAO_TALK_EXCLUDE_NATIVE_LOGIN.getNumber()) {
            return KAKAO_TALK_EXCLUDE_NATIVE_LOGIN;
        }
        if (i == KAKAO_LOGIN_ALL.getNumber()) {
            return KAKAO_LOGIN_ALL;
        }
        return null;
    }

    private AuthType(int i) {
        this.number = i;
    }
}
