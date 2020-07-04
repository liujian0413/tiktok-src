package com.p280ss.android.ugc.aweme.utils;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.bx */
public abstract class C42993bx implements OnClickListener {

    /* renamed from: d */
    public static final C42994a f111553d = new C42994a(null);

    /* renamed from: f */
    private static boolean f111554f = true;

    /* renamed from: a */
    private final int f111555a;

    /* renamed from: b */
    private final boolean f111556b;

    /* renamed from: c */
    private boolean f111557c;

    /* renamed from: e */
    private final Runnable f111558e;

    /* renamed from: com.ss.android.ugc.aweme.utils.bx$a */
    public static final class C42994a {
        private C42994a() {
        }

        public /* synthetic */ C42994a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bx$b */
    static final class C42995b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42993bx f111559a;

        C42995b(C42993bx bxVar) {
            this.f111559a = bxVar;
        }

        public final void run() {
            this.f111559a.mo104690a(true);
        }
    }

    public C42993bx(int i) {
        this(i, false, 2, null);
    }

    /* renamed from: a */
    public abstract void mo101783a(View view);

    /* renamed from: a */
    private boolean m136480a() {
        if (this.f111556b) {
            return f111554f;
        }
        return this.f111557c;
    }

    /* renamed from: a */
    public final void mo104690a(boolean z) {
        if (this.f111556b) {
            f111554f = z;
        } else {
            this.f111557c = z;
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        if (m136480a()) {
            mo104690a(false);
            view.postDelayed(this.f111558e, (long) this.f111555a);
            mo101783a(view);
        }
    }

    private C42993bx(int i, boolean z) {
        this.f111557c = true;
        this.f111558e = new C42995b(this);
        this.f111555a = i;
        this.f111556b = z;
    }

    public /* synthetic */ C42993bx(int i, boolean z, int i2, C7571f fVar) {
        this(i, true);
    }
}
