package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8544cf;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.di */
final /* synthetic */ class C5665di implements OnClickListener {

    /* renamed from: a */
    private final LiveRoomNotifyWidget f16744a;

    /* renamed from: b */
    private final String f16745b;

    /* renamed from: c */
    private final User f16746c;

    /* renamed from: d */
    private final long f16747d;

    /* renamed from: e */
    private final int f16748e;

    /* renamed from: f */
    private final C8544cf f16749f;

    C5665di(LiveRoomNotifyWidget liveRoomNotifyWidget, String str, User user, long j, int i, C8544cf cfVar) {
        this.f16744a = liveRoomNotifyWidget;
        this.f16745b = str;
        this.f16746c = user;
        this.f16747d = j;
        this.f16748e = i;
        this.f16749f = cfVar;
    }

    public final void onClick(View view) {
        this.f16744a.mo13901a(this.f16745b, this.f16746c, this.f16747d, this.f16748e, this.f16749f, view);
    }
}
