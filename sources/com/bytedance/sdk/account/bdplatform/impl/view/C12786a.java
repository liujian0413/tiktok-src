package com.bytedance.sdk.account.bdplatform.impl.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.view.a */
public abstract class C12786a implements OnClickListener {

    /* renamed from: a */
    private static final Handler f33826a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public boolean f33827b;

    /* renamed from: c */
    public long f33828c;

    /* renamed from: d */
    public final Runnable f33829d;

    /* renamed from: a */
    public abstract void mo31334a(View view);

    public C12786a() {
        this(500);
    }

    private C12786a(long j) {
        this.f33827b = true;
        this.f33829d = new Runnable() {
            public final void run() {
                C12786a.this.f33827b = true;
            }
        };
        this.f33828c = 500;
    }

    public void onClick(View view) {
        if (this.f33827b) {
            this.f33827b = false;
            f33826a.postDelayed(this.f33829d, this.f33828c);
            mo31334a(view);
        }
    }
}
