package com.bytedance.jedi.arch.ext.list.differ;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.arch.ext.list.differ.e */
public final class C11567e {

    /* renamed from: a */
    public final C11569b f31239a;

    /* renamed from: b */
    private final boolean f31240b;

    /* renamed from: c */
    private final int f31241c;

    /* renamed from: com.bytedance.jedi.arch.ext.list.differ.e$a */
    public static final class C11568a {

        /* renamed from: a */
        private int f31242a;

        /* renamed from: b */
        private boolean f31243b;

        /* renamed from: c */
        private final C11569b f31244c;

        /* renamed from: a */
        public final C11567e mo29154a() {
            if (!this.f31243b || this.f31242a > 0) {
                return new C11567e(this.f31244c, this.f31243b, this.f31242a, null);
            }
            throw new IllegalArgumentException("Prefetch distance must be a positive number when prefetch is enabled");
        }

        /* renamed from: a */
        public final C11568a mo29152a(int i) {
            this.f31242a = i;
            return this;
        }

        /* renamed from: a */
        public final C11568a mo29153a(boolean z) {
            this.f31243b = z;
            return this;
        }

        public C11568a(C11569b bVar) {
            C7573i.m23587b(bVar, "fetcher");
            this.f31244c = bVar;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.differ.e$b */
    public interface C11569b {
        /* renamed from: b */
        void mo29083b(int i);
    }

    /* renamed from: a */
    public final void mo29151a(int i) {
        if (this.f31240b) {
            this.f31239a.mo29083b(i + this.f31241c);
        }
    }

    private C11567e(C11569b bVar, boolean z, int i) {
        this.f31239a = bVar;
        this.f31240b = z;
        this.f31241c = i;
    }

    public /* synthetic */ C11567e(C11569b bVar, boolean z, int i, C7571f fVar) {
        this(bVar, z, i);
    }
}
