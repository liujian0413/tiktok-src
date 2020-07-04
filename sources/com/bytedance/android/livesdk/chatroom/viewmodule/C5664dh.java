package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8544cf;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dh */
final /* synthetic */ class C5664dh implements OnClickListener {

    /* renamed from: a */
    private final LiveRoomNotifyWidget f16738a;

    /* renamed from: b */
    private final String f16739b;

    /* renamed from: c */
    private final User f16740c;

    /* renamed from: d */
    private final long f16741d;

    /* renamed from: e */
    private final int f16742e;

    /* renamed from: f */
    private final C8544cf f16743f;

    C5664dh(LiveRoomNotifyWidget liveRoomNotifyWidget, String str, User user, long j, int i, C8544cf cfVar) {
        this.f16738a = liveRoomNotifyWidget;
        this.f16739b = str;
        this.f16740c = user;
        this.f16741d = j;
        this.f16742e = i;
        this.f16743f = cfVar;
    }

    public final void onClick(View view) {
        this.f16738a.mo13903b(this.f16739b, this.f16740c, this.f16741d, this.f16742e, this.f16743f, view);
    }
}
