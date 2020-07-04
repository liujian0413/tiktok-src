package com.bytedance.android.live.misc;

import com.bytedance.android.livesdk.init.I18nInitTask;
import com.bytedance.android.livesdk.init.InternalServiceInitTask;
import com.bytedance.android.livesdk.init.MonitorInitTask;
import com.bytedance.android.livesdk.init.ProtoDecoderInjectTask;
import com.bytedance.android.livesdk.init.TTCjInitTask;
import com.bytedance.android.livesdk.init.TaskManagerInitTask;
import com.bytedance.android.livesdk.init.WebPrefetchTask;
import com.bytedance.android.livesdk.p394i.C8308c;

/* renamed from: com.bytedance.android.live.misc.a */
public final class C3451a {
    /* renamed from: a */
    public static void m12773a() {
        C8308c.m25372a().mo21473a(5, new TTCjInitTask());
        C8308c.m25372a().mo21473a(4, new TaskManagerInitTask());
        C8308c.m25372a().mo21473a(3, new MonitorInitTask());
        C8308c.m25372a().mo21473a(1, new I18nInitTask());
        C8308c.m25372a().mo21473a(2, new InternalServiceInitTask());
        C8308c.m25372a().mo21473a(6, new WebPrefetchTask());
        C8308c.m25372a().mo21473a(7, new ProtoDecoderInjectTask());
    }
}
