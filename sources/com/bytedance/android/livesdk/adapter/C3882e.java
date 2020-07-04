package com.bytedance.android.livesdk.adapter;

import android.support.p029v7.util.C1143a.C1146b;
import java.util.List;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.adapter.e */
final /* synthetic */ class C3882e implements C7326g {

    /* renamed from: a */
    private final LiveMultiTypeAdapter f11598a;

    /* renamed from: b */
    private final List f11599b;

    C3882e(LiveMultiTypeAdapter liveMultiTypeAdapter, List list) {
        this.f11598a = liveMultiTypeAdapter;
        this.f11599b = list;
    }

    public final void accept(Object obj) {
        this.f11598a.mo11419a(this.f11599b, (C1146b) obj);
    }
}
