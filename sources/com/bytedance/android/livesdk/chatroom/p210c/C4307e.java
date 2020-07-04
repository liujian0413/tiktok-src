package com.bytedance.android.livesdk.chatroom.p210c;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.p210c.C4301d.C4303a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.e */
public final class C4307e {

    /* renamed from: a */
    private View f12520a;

    /* renamed from: b */
    private DataCenter f12521b;

    /* renamed from: c */
    private Set<C4301d> f12522c = new HashSet();

    /* renamed from: a */
    public final void mo11983a() {
        for (C4301d a : this.f12522c) {
            a.mo11976a();
        }
        this.f12522c.clear();
    }

    /* renamed from: a */
    private <V extends View> C4303a<V> m14509a(V v) {
        return new C4303a<>(this.f12521b, v, this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11984a(C4301d dVar) {
        this.f12522c.add(dVar);
    }

    /* renamed from: a */
    public final <V extends View> C4303a<V> mo11982a(int i) {
        if (this.f12520a != null) {
            return m14509a((V) this.f12520a.findViewById(i));
        }
        throw new IllegalStateException("Unable to find view by id due to null root view.");
    }

    public C4307e(DataCenter dataCenter, View view) {
        this.f12521b = dataCenter;
        this.f12520a = view;
    }
}
