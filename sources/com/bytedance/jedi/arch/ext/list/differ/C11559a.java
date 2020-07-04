package com.bytedance.jedi.arch.ext.list.differ;

import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.arch.ext.list.differ.a */
public abstract class C11559a implements C11569b {

    /* renamed from: a */
    private boolean f31216a;

    /* renamed from: b */
    public int f31217b;

    /* renamed from: c */
    private boolean f31218c;

    /* renamed from: com.bytedance.jedi.arch.ext.list.differ.a$a */
    static final class C11560a extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11559a f31219a;

        /* renamed from: b */
        final /* synthetic */ int f31220b;

        C11560a(C11559a aVar, int i) {
            this.f31219a = aVar;
            this.f31220b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m34024a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m34024a(int i) {
            int i2 = this.f31220b - i;
            this.f31219a.f31217b = Math.max(this.f31219a.f31217b, i2);
            if (this.f31219a.f31217b > 0) {
                this.f31219a.mo29142b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29086a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29087a(C7562b<? super Integer, C7581n> bVar);

    /* renamed from: b */
    public final void mo29142b() {
        if (!this.f31216a) {
            this.f31216a = true;
            mo29086a();
        }
    }

    /* renamed from: b */
    public final void mo29083b(int i) {
        this.f31218c = true;
        mo29087a(new C11560a(this, i));
    }

    /* renamed from: a */
    public final void mo29141a(int i, Throwable th) {
        if (this.f31218c) {
            this.f31216a = false;
            if (th == null && i != 0) {
                this.f31217b -= i;
                if (this.f31217b > 0) {
                    mo29142b();
                }
            }
        }
    }
}
