package com.bytedance.android.livesdk.chatroom.detail;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.f */
public final class C4326f {

    /* renamed from: a */
    public int f12564a;

    /* renamed from: b */
    public boolean f12565b;

    /* renamed from: c */
    public int f12566c = 1;

    /* renamed from: d */
    private WeakReference<View> f12567d = new WeakReference<>(null);

    /* renamed from: a */
    private View m14539a() {
        return (View) this.f12567d.get();
    }

    /* renamed from: b */
    private final void m14540b() {
        int i;
        View a = m14539a();
        if (a != null) {
            if (!this.f12565b || this.f12566c != 1) {
                i = 8;
            } else {
                i = 0;
            }
            a.setVisibility(i);
            LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f12564a;
            }
        }
    }

    /* renamed from: a */
    public final void mo12010a(int i) {
        this.f12564a = i;
        m14540b();
    }

    /* renamed from: b */
    public final void mo12013b(int i) {
        this.f12566c = i;
        m14540b();
    }

    /* renamed from: a */
    public final void mo12011a(View view) {
        this.f12567d.clear();
        this.f12567d = new WeakReference<>(view);
        m14540b();
    }

    /* renamed from: a */
    public final void mo12012a(boolean z) {
        this.f12565b = z;
        m14540b();
    }
}
