package com.bytedance.android.live.room;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.message.model.C8540cb;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.widgets.DataCenter;

/* renamed from: com.bytedance.android.live.room.d */
public interface C3486d {

    /* renamed from: com.bytedance.android.live.room.d$a */
    public static abstract class C3487a {
        /* renamed from: a */
        public void mo10490a(int i) {
        }

        /* renamed from: a */
        public void mo8807a(C8540cb cbVar) {
        }
    }

    /* renamed from: a */
    void mo10474a(float f);

    /* renamed from: a */
    void mo10475a(C2429a aVar);

    /* renamed from: a */
    void mo10476a(C4487am amVar);

    /* renamed from: a */
    void mo10477a(LiveMode liveMode);

    /* renamed from: a */
    void mo10478a(DataCenter dataCenter, boolean z, C3487a aVar, EnterRoomExtra enterRoomExtra);

    /* renamed from: a */
    void mo10479a(Runnable runnable);

    /* renamed from: a */
    void mo10480a(boolean z, CharSequence charSequence, CharSequence charSequence2);

    /* renamed from: c */
    void mo10481c();

    /* renamed from: d */
    void mo10482d();

    /* renamed from: e */
    FrameLayout mo10483e();

    /* renamed from: f */
    void mo10484f();

    C0608j getChildFragmentManager();

    boolean isAdded();

    void onActivityResult(int i, int i2, Intent intent);

    void setArguments(Bundle bundle);

    void show(C0608j jVar, String str);
}
