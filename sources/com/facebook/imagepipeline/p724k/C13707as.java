package com.facebook.imagepipeline.p724k;

import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.C13322g;
import com.facebook.common.util.TriState;
import com.facebook.imageformat.C13509c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13772w.C13776a;
import com.facebook.imagepipeline.p726m.C13788a;
import com.facebook.imagepipeline.p726m.C13789b;
import com.facebook.imagepipeline.p726m.C13790c;
import com.facebook.imagepipeline.p726m.C13791d;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.as */
public final class C13707as implements C13699am<C13647e> {

    /* renamed from: a */
    public final Executor f36382a;

    /* renamed from: b */
    public final C13322g f36383b;

    /* renamed from: c */
    private final C13699am<C13647e> f36384c;

    /* renamed from: d */
    private final boolean f36385d;

    /* renamed from: e */
    private final C13790c f36386e;

    /* renamed from: com.facebook.imagepipeline.k.as$a */
    class C13708a extends C13756n<C13647e, C13647e> {

        /* renamed from: a */
        public final boolean f36387a;

        /* renamed from: b */
        public final C13790c f36388b;

        /* renamed from: c */
        public final C13700an f36389c;

        /* renamed from: d */
        public boolean f36390d;

        /* renamed from: f */
        public final C13772w f36391f;

        /* renamed from: a */
        private static C13647e m40448a(C13647e eVar) {
            C13647e a = C13647e.m40235a(eVar);
            eVar.close();
            return a;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo33256a(C13647e eVar, int i) {
            if (!this.f36390d) {
                boolean a = m40493a(i);
                if (eVar == null) {
                    if (a) {
                        this.f36516e.mo33354b(null, 1);
                    }
                    return;
                }
                TriState a2 = C13707as.m40444a(this.f36389c.mo33333a(), eVar, (C13789b) C13307g.m38940a(this.f36388b.mo33388a(eVar.mo33276d(), this.f36387a)));
                if (!a && a2 == TriState.UNSET) {
                    return;
                }
                if (a2 != TriState.YES) {
                    if (!(this.f36389c.mo33333a().mRotationOptions.f36031a || eVar.mo33277e() == 0 || eVar.mo33277e() == -1)) {
                        eVar = m40448a(eVar);
                        eVar.f36259b = 0;
                    }
                    this.f36516e.mo33354b(eVar, i);
                } else if (this.f36391f.mo33376a(eVar, i)) {
                    if (a || this.f36389c.mo33341h()) {
                        this.f36391f.mo33377b();
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab A[Catch:{ all -> 0x0091 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33342a(com.facebook.imagepipeline.p720g.C13647e r11, int r12, com.facebook.imagepipeline.p726m.C13789b r13) {
            /*
                r10 = this;
                com.facebook.imagepipeline.k.an r0 = r10.f36389c
                com.facebook.imagepipeline.k.ap r0 = r0.mo33336c()
                com.facebook.imagepipeline.k.an r1 = r10.f36389c
                java.lang.String r1 = r1.mo33335b()
                java.lang.String r2 = "ResizeAndRotateProducer"
                r0.onProducerStart(r1, r2)
                com.facebook.imagepipeline.k.an r0 = r10.f36389c
                com.facebook.imagepipeline.request.ImageRequest r0 = r0.mo33333a()
                com.facebook.imagepipeline.k.as r1 = com.facebook.imagepipeline.p724k.C13707as.this
                com.facebook.common.memory.g r1 = r1.f36383b
                com.facebook.common.memory.i r1 = r1.mo32592a()
                r9 = 0
                com.facebook.imagepipeline.common.e r5 = r0.mRotationOptions     // Catch:{ Exception -> 0x0093 }
                com.facebook.imagepipeline.common.d r6 = r0.mResizeOptions     // Catch:{ Exception -> 0x0093 }
                r7 = 0
                r2 = 85
                java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0093 }
                r2 = r13
                r3 = r11
                r4 = r1
                com.facebook.imagepipeline.m.a r2 = r2.transcode(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0093 }
                int r3 = r2.f36580a     // Catch:{ Exception -> 0x0093 }
                r4 = 2
                if (r3 == r4) goto L_0x0089
                com.facebook.imagepipeline.common.d r0 = r0.mResizeOptions     // Catch:{ Exception -> 0x0093 }
                java.lang.String r13 = r13.getIdentifier()     // Catch:{ Exception -> 0x0093 }
                java.util.Map r11 = r10.m40449a(r11, r0, r2, r13)     // Catch:{ Exception -> 0x0093 }
                com.facebook.common.memory.PooledByteBuffer r13 = r1.mo32602a()     // Catch:{ Exception -> 0x0086 }
                com.facebook.common.references.a r13 = com.facebook.common.references.C13326a.m38995a(r13)     // Catch:{ Exception -> 0x0086 }
                com.facebook.imagepipeline.g.e r0 = new com.facebook.imagepipeline.g.e     // Catch:{ all -> 0x0081 }
                r0.<init>(r13)     // Catch:{ all -> 0x0081 }
                com.facebook.imageformat.c r3 = com.facebook.imageformat.C13508b.f35825a     // Catch:{ all -> 0x0081 }
                r0.f36258a = r3     // Catch:{ all -> 0x0081 }
                r0.mo33282j()     // Catch:{ all -> 0x007c }
                com.facebook.imagepipeline.k.an r3 = r10.f36389c     // Catch:{ all -> 0x007c }
                com.facebook.imagepipeline.k.ap r3 = r3.mo33336c()     // Catch:{ all -> 0x007c }
                com.facebook.imagepipeline.k.an r4 = r10.f36389c     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.mo33335b()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "ResizeAndRotateProducer"
                r3.onProducerFinishWithSuccess(r4, r5, r11)     // Catch:{ all -> 0x007c }
                int r2 = r2.f36580a     // Catch:{ all -> 0x007c }
                r3 = 1
                if (r2 == r3) goto L_0x006d
                r12 = r12 | 16
            L_0x006d:
                com.facebook.imagepipeline.k.k<O> r2 = r10.f36516e     // Catch:{ all -> 0x007c }
                r2.mo33354b(r0, r12)     // Catch:{ all -> 0x007c }
                com.facebook.imagepipeline.p720g.C13647e.m40237d(r0)     // Catch:{ all -> 0x0081 }
                com.facebook.common.references.C13326a.m39001c(r13)     // Catch:{ Exception -> 0x0086 }
                r1.close()
                return
            L_0x007c:
                r2 = move-exception
                com.facebook.imagepipeline.p720g.C13647e.m40237d(r0)     // Catch:{ all -> 0x0081 }
                throw r2     // Catch:{ all -> 0x0081 }
            L_0x0081:
                r0 = move-exception
                com.facebook.common.references.C13326a.m39001c(r13)     // Catch:{ Exception -> 0x0086 }
                throw r0     // Catch:{ Exception -> 0x0086 }
            L_0x0086:
                r13 = move-exception
                r9 = r11
                goto L_0x0094
            L_0x0089:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0093 }
                java.lang.String r13 = "Error while transcoding the image"
                r11.<init>(r13)     // Catch:{ Exception -> 0x0093 }
                throw r11     // Catch:{ Exception -> 0x0093 }
            L_0x0091:
                r11 = move-exception
                goto L_0x00b4
            L_0x0093:
                r13 = move-exception
            L_0x0094:
                com.facebook.imagepipeline.k.an r11 = r10.f36389c     // Catch:{ all -> 0x0091 }
                com.facebook.imagepipeline.k.ap r11 = r11.mo33336c()     // Catch:{ all -> 0x0091 }
                com.facebook.imagepipeline.k.an r0 = r10.f36389c     // Catch:{ all -> 0x0091 }
                java.lang.String r0 = r0.mo33335b()     // Catch:{ all -> 0x0091 }
                java.lang.String r2 = "ResizeAndRotateProducer"
                r11.onProducerFinishWithFailure(r0, r2, r13, r9)     // Catch:{ all -> 0x0091 }
                boolean r11 = m40493a(r12)     // Catch:{ all -> 0x0091 }
                if (r11 == 0) goto L_0x00b0
                com.facebook.imagepipeline.k.k<O> r11 = r10.f36516e     // Catch:{ all -> 0x0091 }
                r11.mo33355b(r13)     // Catch:{ all -> 0x0091 }
            L_0x00b0:
                r1.close()
                return
            L_0x00b4:
                r1.close()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13707as.C13708a.mo33342a(com.facebook.imagepipeline.g.e, int, com.facebook.imagepipeline.m.b):void");
        }

        /* renamed from: a */
        private Map<String, String> m40449a(C13647e eVar, C13596d dVar, C13788a aVar, String str) {
            String str2;
            if (!this.f36389c.mo33336c().requiresExtraMap(this.f36389c.mo33335b())) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.mo33279g());
            sb.append("x");
            sb.append(eVar.mo33280h());
            String sb2 = sb.toString();
            if (dVar != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(dVar.f36024a);
                sb3.append("x");
                sb3.append(dVar.f36025b);
                str2 = sb3.toString();
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(eVar.mo33276d()));
            hashMap.put("Original size", sb2);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f36391f.mo33380e()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(aVar));
            return ImmutableMap.copyOf(hashMap);
        }

        C13708a(final C13748k<C13647e> kVar, C13700an anVar, boolean z, C13790c cVar) {
            super(kVar);
            this.f36389c = anVar;
            this.f36387a = z;
            this.f36388b = cVar;
            this.f36391f = new C13772w(C13707as.this.f36382a, new C13776a(C13707as.this) {
                /* renamed from: a */
                public final void mo33343a(C13647e eVar, int i) {
                    C13708a.this.mo33342a(eVar, i, (C13789b) C13307g.m38940a(C13708a.this.f36388b.mo33388a(eVar.mo33276d(), C13708a.this.f36387a)));
                }
            }, 100);
            this.f36389c.mo33334a(new C13738e(C13707as.this) {
                /* renamed from: a */
                public final void mo29896a() {
                    C13708a.this.f36391f.mo33375a();
                    C13708a.this.f36390d = true;
                    kVar.mo33352b();
                }

                /* renamed from: c */
                public final void mo33320c() {
                    if (C13708a.this.f36389c.mo33341h()) {
                        C13708a.this.f36391f.mo33377b();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static boolean m40445a(C13597e eVar, C13647e eVar2) {
        if (eVar.f36031a || (C13791d.m40671a(eVar, eVar2) == 0 && !m40446b(eVar, eVar2))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m40446b(C13597e eVar, C13647e eVar2) {
        if (eVar.mo33159e() && !eVar.f36031a) {
            return C13791d.f36581a.contains(Integer.valueOf(eVar2.mo33278f()));
        }
        eVar2.f36260c = 0;
        return false;
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        C13699am<C13647e> amVar = this.f36384c;
        C13708a aVar = new C13708a(kVar, anVar, this.f36385d, this.f36386e);
        amVar.mo33296a(aVar, anVar);
    }

    /* renamed from: a */
    public static TriState m40444a(ImageRequest imageRequest, C13647e eVar, C13789b bVar) {
        boolean z;
        if (eVar == null || eVar.mo33276d() == C13509c.f35837a) {
            return TriState.UNSET;
        }
        if (!bVar.canTranscode(eVar.mo33276d())) {
            return TriState.NO;
        }
        if (m40445a(imageRequest.mRotationOptions, eVar) || bVar.canResize(eVar, imageRequest.mRotationOptions, imageRequest.mResizeOptions)) {
            z = true;
        } else {
            z = false;
        }
        return TriState.valueOf(z);
    }

    public C13707as(Executor executor, C13322g gVar, C13699am<C13647e> amVar, boolean z, C13790c cVar) {
        this.f36382a = (Executor) C13307g.m38940a(executor);
        this.f36383b = (C13322g) C13307g.m38940a(gVar);
        this.f36384c = (C13699am) C13307g.m38940a(amVar);
        this.f36386e = (C13790c) C13307g.m38940a(cVar);
        this.f36385d = z;
    }
}
