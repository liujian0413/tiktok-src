package com.facebook.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.jni.a */
public final class C13974a {

    /* renamed from: a */
    public static C13977b f36956a = new C13977b();

    /* renamed from: b */
    public static C13978c f36957b = new C13978c();

    /* renamed from: c */
    public static ReferenceQueue f36958c = new ReferenceQueue();

    /* renamed from: d */
    private static Thread f36959d;

    /* renamed from: com.facebook.jni.a$a */
    public static abstract class C13976a extends PhantomReference<Object> {

        /* renamed from: a */
        public C13976a f36960a = new C13979d();

        /* renamed from: b */
        public C13976a f36961b = this.f36962a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo33625a();

        private C13976a() {
            super(null, C13974a.f36958c);
        }

        C13976a(Object obj) {
            super(obj, C13974a.f36958c);
            C13974a.f36957b.mo33632a(this);
        }
    }

    /* renamed from: com.facebook.jni.a$b */
    static class C13977b {

        /* renamed from: a */
        private C13976a f36962a = new C13979d();

        /* renamed from: b */
        public static void m41286b(C13976a aVar) {
            aVar.f36960a.f36961b = aVar.f36961b;
            aVar.f36961b.f36960a = aVar.f36960a;
        }

        /* renamed from: a */
        public final void mo33630a(C13976a aVar) {
            aVar.f36960a = this.f36962a.f36960a;
            this.f36962a.f36960a = aVar;
            aVar.f36960a.f36961b = aVar;
            aVar.f36961b = this.f36962a;
        }
    }

    /* renamed from: com.facebook.jni.a$c */
    static class C13978c {

        /* renamed from: a */
        private AtomicReference<C13976a> f36963a;

        private C13978c() {
            this.f36963a = new AtomicReference<>();
        }

        /* renamed from: a */
        public final void mo33631a() {
            C13976a aVar = (C13976a) this.f36963a.getAndSet(null);
            while (aVar != null) {
                C13976a aVar2 = aVar.f36960a;
                C13974a.f36956a.mo33630a(aVar);
                aVar = aVar2;
            }
        }

        /* renamed from: a */
        public final void mo33632a(C13976a aVar) {
            C13976a aVar2;
            do {
                aVar2 = (C13976a) this.f36963a.get();
                aVar.f36960a = aVar2;
            } while (!this.f36963a.compareAndSet(aVar2, aVar));
        }
    }

    /* renamed from: com.facebook.jni.a$d */
    static class C13979d extends C13976a {
        private C13979d() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo33625a() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    static {
        C139751 r0 = new Thread("HybridData DestructorThread") {
            /* JADX WARNING: Can't wrap try/catch for region: R(4:0|1|(2:3|5)(1:6)|4) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
            /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:4:0x0014, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r2 = this;
                L_0x0000:
                    java.lang.ref.ReferenceQueue r0 = com.facebook.jni.C13974a.f36958c     // Catch:{ InterruptedException -> 0x0000 }
                    java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r0 = (com.facebook.jni.C13974a.C13976a) r0     // Catch:{ InterruptedException -> 0x0000 }
                    r0.mo33625a()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r1 = r0.f36961b     // Catch:{ InterruptedException -> 0x0000 }
                    if (r1 != 0) goto L_0x0014
                    com.facebook.jni.a$c r1 = com.facebook.jni.C13974a.f36957b     // Catch:{ InterruptedException -> 0x0000 }
                    r1.mo33631a()     // Catch:{ InterruptedException -> 0x0000 }
                L_0x0014:
                    com.facebook.jni.C13974a.C13977b.m41286b(r0)     // Catch:{ InterruptedException -> 0x0000 }
                    goto L_0x0000
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.jni.C13974a.C139751.run():void");
            }
        };
        f36959d = r0;
        r0.start();
    }
}
