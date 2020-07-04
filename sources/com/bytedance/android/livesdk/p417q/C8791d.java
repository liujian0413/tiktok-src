package com.bytedance.android.livesdk.p417q;

import android.content.Context;
import android.view.View;

/* renamed from: com.bytedance.android.livesdk.q.d */
public final class C8791d extends C8784a<C8791d> {

    /* renamed from: m */
    private C8792a f23885m;

    /* renamed from: com.bytedance.android.livesdk.q.d$a */
    public interface C8792a {
        /* renamed from: a */
        void mo14130a(View view, C8791d dVar);
    }

    public C8791d() {
    }

    /* renamed from: a */
    public final C8791d mo21862a(C8792a aVar) {
        this.f23885m = aVar;
        return this;
    }

    private C8791d(Context context) {
        mo21844a(context);
    }

    /* renamed from: b */
    public static C8791d m26348b(Context context) {
        return new C8791d(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21850a(View view, C8791d dVar) {
        if (this.f23885m != null) {
            this.f23885m.mo14130a(view, dVar);
        }
    }
}
