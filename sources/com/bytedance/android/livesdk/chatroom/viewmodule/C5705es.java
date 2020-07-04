package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.message.model.C8545cg;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.es */
final /* synthetic */ class C5705es implements OnClickListener {

    /* renamed from: a */
    private final RoomPushWidget f16797a;

    /* renamed from: b */
    private final C8545cg f16798b;

    /* renamed from: c */
    private final String f16799c;

    C5705es(RoomPushWidget roomPushWidget, C8545cg cgVar, String str) {
        this.f16797a = roomPushWidget;
        this.f16798b = cgVar;
        this.f16799c = str;
    }

    public final void onClick(View view) {
        this.f16797a.mo14005a(this.f16798b, this.f16799c, view);
    }
}
