package com.bytedance.android.livesdk.chatroom.utils;

import com.bytedance.android.livesdk.utils.C9037af;

public enum LotteryResource implements C9037af {
    Banner(r3.toString()),
    Lucky(r3.toString()),
    Unlucky(r3.toString());
    
    private final String subFolder;

    public final String getSubFolder() {
        return this.subFolder;
    }

    private LotteryResource(String str) {
        this.subFolder = str;
    }
}
