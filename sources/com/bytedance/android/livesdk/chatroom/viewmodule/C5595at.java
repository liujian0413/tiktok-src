package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import com.bytedance.android.live.core.rxutils.C3231a;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.sdk.widgets.DataCenter;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.at */
public interface C5595at extends C0043i, C10290a {
    /* renamed from: a */
    void mo9118a(Throwable th);

    /* renamed from: e */
    String mo9125e();

    <T> C3231a<T> getAutoUnbindTransformer();

    Context getContext();

    DataCenter getDataCenter();
}
