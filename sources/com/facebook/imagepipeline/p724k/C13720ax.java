package com.facebook.imagepipeline.p724k;

import com.facebook.common.internal.C13307g;

/* renamed from: com.facebook.imagepipeline.k.ax */
public final class C13720ax<T> implements C13699am<T> {

    /* renamed from: a */
    public final C13699am<T> f36427a;

    /* renamed from: b */
    public final C13723ay f36428b;

    public C13720ax(C13699am<T> amVar, C13723ay ayVar) {
        this.f36427a = (C13699am) C13307g.m38940a(amVar);
        this.f36428b = ayVar;
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<T> kVar, C13700an anVar) {
        final C13702ap c = anVar.mo33336c();
        final String b = anVar.mo33335b();
        final C13748k<T> kVar2 = kVar;
        final C13700an anVar2 = anVar;
        final C137211 r0 = new C13712au<T>(kVar, c, "BackgroundThreadHandoffProducer", b) {
            /* renamed from: b */
            public final void mo32536b(T t) {
            }

            /* renamed from: c */
            public final T mo32537c() throws Exception {
                return null;
            }

            /* renamed from: a */
            public final void mo32534a(T t) {
                c.onProducerFinishWithSuccess(b, "BackgroundThreadHandoffProducer", null);
                C13720ax.this.f36427a.mo33296a(kVar2, anVar2);
            }
        };
        anVar.mo33334a(new C13738e() {
            /* renamed from: a */
            public final void mo29896a() {
                r0.mo32532a();
                C13720ax.this.f36428b.mo33348b(r0);
            }
        });
        this.f36428b.mo33346a(r0);
    }
}
