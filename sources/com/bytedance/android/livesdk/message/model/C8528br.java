package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.br */
public class C8528br extends C8538c {
    @C6593c(mo15949a = "award_url")

    /* renamed from: a */
    public String f23441a;
    @C6593c(mo15949a = "left_task_count")

    /* renamed from: b */
    public long f23442b;
    @C6593c(mo15949a = "fallback_context")

    /* renamed from: c */
    public String f23443c;
    @C6593c(mo15949a = "icon")

    /* renamed from: d */
    public ImageModel f23444d;
    @C6593c(mo15949a = "task_begin")

    /* renamed from: e */
    public boolean f23445e;

    public C8528br() {
        this.f23441a = "https://s3.bytecdn.cn/ies/venus/webcast_activity/douyin/task_gift/package/index.html?web_bg_color=%2300FFFFFF&type=2";
        this.type = MessageType.DOUYIN_OFFICIAL_TASK_INFO;
    }
}
