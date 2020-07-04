package com.bytedance.android.livesdk.chatroom.p204a.p207c;

import android.graphics.Bitmap;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.e */
final /* synthetic */ class C4248e implements C7326g {

    /* renamed from: a */
    private final C4241a f12409a;

    /* renamed from: b */
    private final TextImageModel f12410b;

    C4248e(C4241a aVar, TextImageModel textImageModel) {
        this.f12409a = aVar;
        this.f12410b = textImageModel;
    }

    public final void accept(Object obj) {
        this.f12409a.mo11805a(this.f12410b, (Bitmap) obj);
    }
}
