package com.facebook.imagepipeline.p717d;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.d.a */
public final class C13598a implements C13604g {

    /* renamed from: a */
    private final Executor f36033a = C13599b.m40020a(2, new C13623m(10, "FrescoIoBoundExecutor", true));

    /* renamed from: b */
    private final Executor f36034b;

    /* renamed from: c */
    private final Executor f36035c;

    /* renamed from: d */
    private final Executor f36036d;

    /* renamed from: a */
    public final Executor mo33164a() {
        return this.f36033a;
    }

    /* renamed from: b */
    public final Executor mo33165b() {
        return this.f36033a;
    }

    /* renamed from: c */
    public final Executor mo33166c() {
        return this.f36034b;
    }

    /* renamed from: d */
    public final Executor mo33167d() {
        return this.f36035c;
    }

    /* renamed from: e */
    public final Executor mo33168e() {
        return this.f36036d;
    }

    public C13598a(int i) {
        this.f36034b = C13599b.m40020a(i, new C13623m(10, "FrescoDecodeExecutor", true));
        this.f36035c = C13599b.m40020a(i, new C13623m(10, "FrescoBackgroundExecutor", true));
        this.f36036d = C13599b.m40020a(1, new C13623m(10, "FrescoLightWeightBackgroundExecutor", true));
    }
}
