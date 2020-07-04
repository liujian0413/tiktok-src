package com.bytedance.android.livesdk.chatroom.p220ui;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.q */
public abstract class C5323q implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f15565b = true;

    /* renamed from: c */
    private static final Runnable f15566c = C5324r.f15568a;

    /* renamed from: a */
    public long f15567a;

    /* renamed from: a */
    public abstract void mo13335a(View view);

    public C5323q() {
        this(500);
    }

    private C5323q(long j) {
        this.f15567a = 500;
    }

    public final void onClick(View view) {
        if (f15565b) {
            f15565b = false;
            view.postDelayed(f15566c, this.f15567a);
            mo13335a(view);
        }
    }
}
