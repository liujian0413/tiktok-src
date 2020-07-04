package com.bytedance.android.livesdk.chatroom.p220ui;

import android.net.Uri;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ae */
final /* synthetic */ class C5179ae implements C7326g {

    /* renamed from: a */
    private final InRoomPKAnimationView f15208a;

    /* renamed from: b */
    private final Uri f15209b;

    C5179ae(InRoomPKAnimationView inRoomPKAnimationView, Uri uri) {
        this.f15208a = inRoomPKAnimationView;
        this.f15209b = uri;
    }

    public final void accept(Object obj) {
        this.f15208a.mo13208a(this.f15209b, (Long) obj);
    }
}
