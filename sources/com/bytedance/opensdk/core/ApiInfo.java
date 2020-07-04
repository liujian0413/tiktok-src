package com.bytedance.opensdk.core;

import com.bytedance.opensdk.core.base.C12303a;

public enum ApiInfo {
    GRANT(0, 100),
    BIND(1, 100);
    
    private final int offset;
    private final int supportSDKVersion;

    public final int getApiSupportVersion() {
        return this.supportSDKVersion;
    }

    public final int getRequestCodeInt() {
        return C12303a.m35734a() + this.offset;
    }

    private ApiInfo(int i, int i2) {
        this.offset = i;
        this.supportSDKVersion = i2;
    }
}
