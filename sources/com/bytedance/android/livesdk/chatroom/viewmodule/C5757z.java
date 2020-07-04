package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.message.model.C8691v;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.z */
final /* synthetic */ class C5757z implements OnClickListener {

    /* renamed from: a */
    private final DailyRankWidget f16869a;

    /* renamed from: b */
    private final C8691v f16870b;

    C5757z(DailyRankWidget dailyRankWidget, C8691v vVar) {
        this.f16869a = dailyRankWidget;
        this.f16870b = vVar;
    }

    public final void onClick(View view) {
        this.f16869a.mo13708a(this.f16870b, view);
    }
}
