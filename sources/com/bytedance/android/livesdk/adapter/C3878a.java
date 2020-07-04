package com.bytedance.android.livesdk.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.chatroom.model.C4905g.C4906a;

/* renamed from: com.bytedance.android.livesdk.adapter.a */
final /* synthetic */ class C3878a implements OnClickListener {

    /* renamed from: a */
    private final C3874a f11590a;

    /* renamed from: b */
    private final int f11591b;

    /* renamed from: c */
    private final C4906a f11592c;

    C3878a(C3874a aVar, int i, C4906a aVar2) {
        this.f11590a = aVar;
        this.f11591b = i;
        this.f11592c = aVar2;
    }

    public final void onClick(View view) {
        this.f11590a.mo11413a(this.f11591b, this.f11592c, view);
    }
}
