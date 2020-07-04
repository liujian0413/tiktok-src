package com.bytedance.android.livesdk.kickout.p400ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p427v.C9097a;

/* renamed from: com.bytedance.android.livesdk.kickout.ui.a */
final /* synthetic */ class C8375a implements OnClickListener {

    /* renamed from: a */
    private final User f22960a;

    C8375a(User user) {
        this.f22960a = user;
    }

    public final void onClick(View view) {
        C9097a.m27146a().mo22267a((Object) new UserProfileEvent(this.f22960a));
    }
}
