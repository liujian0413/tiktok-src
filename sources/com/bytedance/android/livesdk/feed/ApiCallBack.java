package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.feed.C2344a;

public interface ApiCallBack {

    public enum ApiType {
        REFRESH,
        LOAD_MORE
    }

    /* renamed from: a */
    void mo14442a(ApiType apiType, String str);

    /* renamed from: a */
    void mo14443a(ApiType apiType, String str, C2344a aVar);

    /* renamed from: a */
    void mo14444a(ApiType apiType, String str, Throwable th);
}
