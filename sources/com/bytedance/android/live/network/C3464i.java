package com.bytedance.android.live.network;

import com.bytedance.android.live.core.setting.C3338l;

/* renamed from: com.bytedance.android.live.network.i */
public interface C3464i {

    /* renamed from: a */
    public static final C3338l<Boolean> f10284a = new C3338l<>("enable_pb_requests", "PB 请求开关", Boolean.valueOf(true), Boolean.valueOf(true));

    /* renamed from: b */
    public static final C3338l<Boolean> f10285b = new C3338l<>("use_pb_object_json_pass_through", "PB 请求使用内网服务透传（方便抓包、Map 接口）", Boolean.valueOf(false), Boolean.valueOf(false));
}
