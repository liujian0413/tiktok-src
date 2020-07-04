package com.kakao.util.helper.log;

public enum Tag {
    DEFAULT("kakao.sdk");
    
    private final String tag;

    public final String tag() {
        return this.tag;
    }

    private Tag(String str) {
        this.tag = str;
    }
}
