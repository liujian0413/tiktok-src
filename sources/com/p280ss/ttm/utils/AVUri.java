package com.p280ss.ttm.utils;

import com.bytedance.ies.bullet.kit.web.WebKitApi;

/* renamed from: com.ss.ttm.utils.AVUri */
public class AVUri {
    private int mType;
    private String mUri;

    public int getType() {
        return this.mType;
    }

    public String getUri() {
        return this.mUri;
    }

    public static AVUri get(String str) {
        int i;
        if (str == null) {
            return null;
        }
        if (str.startsWith("rtmp")) {
            i = 0;
        } else if (str.startsWith("rtsp")) {
            i = 1;
        } else if (str.startsWith("file")) {
            i = 2;
        } else if (!str.startsWith(WebKitApi.SCHEME_HTTP)) {
            return null;
        } else {
            i = 3;
        }
        return new AVUri(i, str);
    }

    public AVUri(int i, String str) {
        this.mType = i;
        this.mUri = str;
    }
}
