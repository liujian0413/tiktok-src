package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.graphics.Bitmap;
import java.util.List;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.d */
final /* synthetic */ class C5656d implements C7326g {

    /* renamed from: a */
    private final List f16731a;

    private C5656d(List list) {
        this.f16731a = list;
    }

    /* renamed from: a */
    static C7326g m18033a(List list) {
        return new C5656d(list);
    }

    public final void accept(Object obj) {
        this.f16731a.add((Bitmap) obj);
    }
}
