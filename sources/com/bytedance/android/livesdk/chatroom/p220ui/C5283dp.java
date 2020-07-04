package com.bytedance.android.livesdk.chatroom.p220ui;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p427v.C9097a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dp */
public final class C5283dp extends C5258ct {

    /* renamed from: a */
    private final int f15447a;

    /* renamed from: b */
    private final User f15448b;

    /* renamed from: c */
    private final boolean f15449c;

    /* renamed from: a */
    public final void mo13520a(View view) {
        if (this.f15449c) {
            onClick(view);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f15447a);
    }

    public final void onClick(View view) {
        if (this.f15448b != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f15448b.getId());
            userProfileEvent.mSource = UserProfileEvent.SOURCE_COMMENT;
            C9097a.m27146a().mo22267a((Object) userProfileEvent);
        }
    }

    public C5283dp(User user, int i, boolean z) {
        this.f15448b = user;
        this.f15447a = i;
        this.f15449c = z;
    }
}
