package com.p280ss.android.ugc.aweme.utils;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.utils.as */
public abstract class C42939as implements OnClickListener {

    /* renamed from: a */
    private final long f111470a;

    /* renamed from: b */
    private final Runnable f111471b;

    /* renamed from: g */
    public boolean f111472g;

    /* renamed from: a */
    public abstract void mo70606a(View view);

    public C42939as() {
        this(300);
    }

    public C42939as(long j) {
        this.f111472g = true;
        this.f111471b = new Runnable() {
            public final void run() {
                C42939as.this.f111472g = true;
            }
        };
        this.f111470a = j;
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f111472g) {
            this.f111472g = false;
            view.postDelayed(this.f111471b, this.f111470a);
            mo70606a(view);
        }
    }
}
