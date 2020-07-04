package com.p280ss.android.ugc.aweme.comment.p1101h;

import android.support.constraint.C0177b;
import android.support.constraint.ConstraintLayout;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.h.i */
public final class C24159i {

    /* renamed from: a */
    public final C0177b f63828a = new C0177b();

    /* renamed from: b */
    public final ConstraintLayout f63829b;

    /* renamed from: c */
    private C24160a f63830c;

    /* renamed from: d */
    private final C0177b f63831d = new C0177b();

    /* renamed from: com.ss.android.ugc.aweme.comment.h.i$a */
    public final class C24160a {
        /* renamed from: a */
        public final void mo62589a() {
            C24159i.this.f63828a.mo430b(C24159i.this.f63829b);
        }

        public C24160a() {
        }

        /* renamed from: a */
        public final C24160a mo62588a(int i, int i2) {
            C24159i.this.f63828a.mo426a(i, 3, i2, 4);
            return this;
        }
    }

    /* renamed from: a */
    public final C24160a mo62587a() {
        synchronized (C24160a.class) {
            if (this.f63830c == null) {
                this.f63830c = new C24160a();
            }
        }
        this.f63828a.mo428a(this.f63829b);
        return this.f63830c;
    }

    public C24159i(ConstraintLayout constraintLayout) {
        C7573i.m23587b(constraintLayout, "constraintLayout");
        this.f63829b = constraintLayout;
        this.f63831d.mo428a(this.f63829b);
    }
}
