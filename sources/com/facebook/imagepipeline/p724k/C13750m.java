package com.facebook.imagepipeline.p724k;

import android.graphics.Bitmap;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.C13316a;
import com.facebook.common.references.C13326a;
import com.facebook.common.util.C13337d;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.decoder.C13629b;
import com.facebook.imagepipeline.decoder.C13631d;
import com.facebook.imagepipeline.decoder.C13632e;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p720g.C13649g;
import com.facebook.imagepipeline.p720g.C13650h;
import com.facebook.imagepipeline.p724k.C13772w.C13776a;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.m */
public final class C13750m implements C13699am<C13326a<C13645c>> {

    /* renamed from: a */
    public final Executor f36488a;

    /* renamed from: b */
    public final C13629b f36489b;

    /* renamed from: c */
    public final boolean f36490c;

    /* renamed from: d */
    public final boolean f36491d;

    /* renamed from: e */
    private final C13316a f36492e;

    /* renamed from: f */
    private final C13631d f36493f;

    /* renamed from: g */
    private final C13699am<C13647e> f36494g;

    /* renamed from: h */
    private final boolean f36495h;

    /* renamed from: i */
    private final int f36496i;

    /* renamed from: com.facebook.imagepipeline.k.m$a */
    class C13751a extends C13753c {
        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final C13650h mo33366c() {
            return C13649g.m40258a(0, false, false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo33364a(C13647e eVar) {
            return eVar.mo33281i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final synchronized boolean mo33365a(C13647e eVar, int i) {
            if (m40494b(i)) {
                return false;
            }
            return super.mo33365a(eVar, i);
        }

        public C13751a(C13748k<C13326a<C13645c>> kVar, C13700an anVar, boolean z, int i) {
            super(kVar, anVar, z, i);
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.m$b */
    class C13752b extends C13753c {

        /* renamed from: f */
        private final C13632e f36499f;

        /* renamed from: g */
        private final C13631d f36500g;

        /* renamed from: h */
        private int f36501h = 0;

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final C13650h mo33366c() {
            return this.f36500g.mo33248b(this.f36499f.f36239a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo33364a(C13647e eVar) {
            return this.f36499f.f36240b;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
            return r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo33365a(com.facebook.imagepipeline.p720g.C13647e r4, int r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = super.mo33365a(r4, r5)     // Catch:{ all -> 0x0053 }
                boolean r1 = m40494b(r5)     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x0013
                r1 = 8
                boolean r1 = m40495b(r5, r1)     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0051
            L_0x0013:
                r1 = 4
                boolean r5 = m40495b(r5, r1)     // Catch:{ all -> 0x0053 }
                if (r5 != 0) goto L_0x0051
                boolean r5 = com.facebook.imagepipeline.p720g.C13647e.m40238e(r4)     // Catch:{ all -> 0x0053 }
                if (r5 == 0) goto L_0x0051
                com.facebook.imageformat.c r5 = r4.mo33276d()     // Catch:{ all -> 0x0053 }
                com.facebook.imageformat.c r1 = com.facebook.imageformat.C13508b.f35825a     // Catch:{ all -> 0x0053 }
                if (r5 != r1) goto L_0x0051
                com.facebook.imagepipeline.decoder.e r5 = r3.f36499f     // Catch:{ all -> 0x0053 }
                boolean r4 = r5.mo33249a(r4)     // Catch:{ all -> 0x0053 }
                r5 = 0
                if (r4 != 0) goto L_0x0033
                monitor-exit(r3)
                return r5
            L_0x0033:
                com.facebook.imagepipeline.decoder.e r4 = r3.f36499f     // Catch:{ all -> 0x0053 }
                int r4 = r4.f36239a     // Catch:{ all -> 0x0053 }
                int r1 = r3.f36501h     // Catch:{ all -> 0x0053 }
                if (r4 > r1) goto L_0x003d
                monitor-exit(r3)
                return r5
            L_0x003d:
                com.facebook.imagepipeline.decoder.d r1 = r3.f36500g     // Catch:{ all -> 0x0053 }
                int r2 = r3.f36501h     // Catch:{ all -> 0x0053 }
                int r1 = r1.mo33247a(r2)     // Catch:{ all -> 0x0053 }
                if (r4 >= r1) goto L_0x004f
                com.facebook.imagepipeline.decoder.e r1 = r3.f36499f     // Catch:{ all -> 0x0053 }
                boolean r1 = r1.f36241c     // Catch:{ all -> 0x0053 }
                if (r1 != 0) goto L_0x004f
                monitor-exit(r3)
                return r5
            L_0x004f:
                r3.f36501h = r4     // Catch:{ all -> 0x0053 }
            L_0x0051:
                monitor-exit(r3)
                return r0
            L_0x0053:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13750m.C13752b.mo33365a(com.facebook.imagepipeline.g.e, int):boolean");
        }

        public C13752b(C13748k<C13326a<C13645c>> kVar, C13700an anVar, C13632e eVar, C13631d dVar, boolean z, int i) {
            super(kVar, anVar, z, i);
            this.f36499f = (C13632e) C13307g.m38940a(eVar);
            this.f36500g = (C13631d) C13307g.m38940a(dVar);
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.m$c */
    abstract class C13753c extends C13756n<C13647e, C13326a<C13645c>> {

        /* renamed from: a */
        private final String f36502a = "ProgressiveDecoder";

        /* renamed from: b */
        public final C13700an f36503b;

        /* renamed from: c */
        public final C13772w f36504c;

        /* renamed from: f */
        private final C13702ap f36506f;

        /* renamed from: g */
        private final C13594b f36507g;

        /* renamed from: h */
        private boolean f36508h;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract int mo33364a(C13647e eVar);

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract C13650h mo33366c();

        /* renamed from: e */
        private synchronized boolean m40590e() {
            return this.f36508h;
        }

        /* renamed from: a */
        public final void mo33254a() {
            mo33368d();
        }

        /* renamed from: d */
        public final void mo33368d() {
            m40587b(true);
            this.f36516e.mo33352b();
        }

        /* renamed from: c */
        private void m40589c(Throwable th) {
            m40587b(true);
            this.f36516e.mo33355b(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33255a(float f) {
            super.mo33255a(f * 0.99f);
        }

        /* renamed from: b */
        private void m40587b(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f36508h) {
                        this.f36516e.mo33353b(1.0f);
                        this.f36508h = true;
                        this.f36504c.mo33375a();
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo33257a(Throwable th) {
            m40589c(th);
        }

        /* renamed from: a */
        private void m40586a(C13645c cVar, int i) {
            C13326a a = C13326a.m38995a(cVar);
            try {
                m40587b(m40493a(i));
                this.f36516e.mo33354b(a, i);
            } finally {
                C13326a.m39001c(a);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void mo33256a(C13647e eVar, int i) {
            try {
                if (C13783b.m40665b()) {
                    C13783b.m40664a("DecodeProducer#onNewResultImpl");
                }
                boolean a = m40493a(i);
                if (a && !C13647e.m40238e(eVar)) {
                    m40589c(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                } else if (!mo33365a(eVar, i)) {
                    if (C13783b.m40665b()) {
                        C13783b.m40663a();
                    }
                } else {
                    boolean b = m40495b(i, 4);
                    if (a || b || this.f36503b.mo33341h()) {
                        this.f36504c.mo33377b();
                    }
                    if (C13783b.m40665b()) {
                        C13783b.m40663a();
                    }
                }
            } finally {
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo33365a(C13647e eVar, int i) {
            return this.f36504c.mo33376a(eVar, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2 A[Catch:{ all -> 0x014c }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33367b(com.facebook.imagepipeline.p720g.C13647e r19, int r20) {
            /*
                r18 = this;
                r11 = r18
                r12 = r19
                r0 = r20
                com.facebook.imageformat.c r1 = r19.mo33276d()
                com.facebook.imageformat.c r2 = com.facebook.imageformat.C13508b.f35825a
                if (r1 == r2) goto L_0x0015
                boolean r1 = m40494b(r20)
                if (r1 == 0) goto L_0x0015
                return
            L_0x0015:
                boolean r1 = r18.m40590e()
                if (r1 != 0) goto L_0x0151
                boolean r1 = com.facebook.imagepipeline.p720g.C13647e.m40238e(r19)
                if (r1 != 0) goto L_0x0023
                goto L_0x0151
            L_0x0023:
                com.facebook.imageformat.c r1 = r19.mo33276d()
                if (r1 == 0) goto L_0x002d
                java.lang.String r1 = r1.f35839c
            L_0x002b:
                r7 = r1
                goto L_0x0030
            L_0x002d:
                java.lang.String r1 = "unknown"
                goto L_0x002b
            L_0x0030:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r19.mo33279g()
                r1.append(r2)
                java.lang.String r2 = "x"
                r1.append(r2)
                int r2 = r19.mo33280h()
                r1.append(r2)
                java.lang.String r8 = r1.toString()
                int r1 = r12.f36263f
                java.lang.String r10 = java.lang.String.valueOf(r1)
                boolean r6 = m40493a(r20)
                if (r6 == 0) goto L_0x0062
                r3 = 8
                boolean r3 = m40495b(r0, r3)
                if (r3 != 0) goto L_0x0062
                r3 = 1
                goto L_0x0063
            L_0x0062:
                r3 = 0
            L_0x0063:
                r4 = 4
                boolean r5 = m40495b(r0, r4)
                com.facebook.imagepipeline.k.an r9 = r11.f36503b
                com.facebook.imagepipeline.request.ImageRequest r9 = r9.mo33333a()
                com.facebook.imagepipeline.common.d r9 = r9.mResizeOptions
                if (r9 == 0) goto L_0x008b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                int r14 = r9.f36024a
                r13.append(r14)
                java.lang.String r14 = "x"
                r13.append(r14)
                int r9 = r9.f36025b
                r13.append(r9)
                java.lang.String r9 = r13.toString()
                goto L_0x008d
            L_0x008b:
                java.lang.String r9 = "unknown"
            L_0x008d:
                com.facebook.imagepipeline.k.w r13 = r11.f36504c     // Catch:{ all -> 0x014c }
                long r13 = r13.mo33380e()     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.k.an r15 = r11.f36503b     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.request.ImageRequest r15 = r15.mo33333a()     // Catch:{ all -> 0x014c }
                android.net.Uri r15 = r15.mSourceUri     // Catch:{ all -> 0x014c }
                java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x014c }
                if (r3 != 0) goto L_0x00ab
                if (r5 == 0) goto L_0x00a4
                goto L_0x00ab
            L_0x00a4:
                int r16 = r18.mo33364a(r19)     // Catch:{ all -> 0x014c }
            L_0x00a8:
                r1 = r16
                goto L_0x00b0
            L_0x00ab:
                int r16 = r19.mo33281i()     // Catch:{ all -> 0x014c }
                goto L_0x00a8
            L_0x00b0:
                if (r3 != 0) goto L_0x00bb
                if (r5 == 0) goto L_0x00b5
                goto L_0x00bb
            L_0x00b5:
                com.facebook.imagepipeline.g.h r3 = r18.mo33366c()     // Catch:{ all -> 0x014c }
            L_0x00b9:
                r5 = r3
                goto L_0x00be
            L_0x00bb:
                com.facebook.imagepipeline.g.h r3 = com.facebook.imagepipeline.p720g.C13649g.f36269a     // Catch:{ all -> 0x014c }
                goto L_0x00b9
            L_0x00be:
                com.facebook.imagepipeline.k.ap r3 = r11.f36506f     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.k.an r4 = r11.f36503b     // Catch:{ all -> 0x014c }
                java.lang.String r4 = r4.mo33335b()     // Catch:{ all -> 0x014c }
                java.lang.String r2 = "DecodeProducer"
                r3.onProducerStart(r4, r2)     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.k.m r3 = com.facebook.imagepipeline.p724k.C13750m.this     // Catch:{ DecodeException -> 0x0100 }
                com.facebook.imagepipeline.decoder.b r3 = r3.f36489b     // Catch:{ DecodeException -> 0x0100 }
                com.facebook.imagepipeline.common.b r4 = r11.f36507g     // Catch:{ DecodeException -> 0x0100 }
                com.facebook.imagepipeline.g.c r3 = r3.mo33042a(r12, r1, r5, r4)     // Catch:{ DecodeException -> 0x0100 }
                int r1 = r12.f36263f     // Catch:{ Exception -> 0x00f9 }
                r2 = 1
                if (r1 == r2) goto L_0x00dc
                r0 = r0 | 16
            L_0x00dc:
                r1 = r18
                r2 = r3
                r15 = r3
                r3 = r13
                java.util.Map r1 = r1.m40585a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.k.ap r2 = r11.f36506f     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.k.an r3 = r11.f36503b     // Catch:{ all -> 0x014c }
                java.lang.String r3 = r3.mo33335b()     // Catch:{ all -> 0x014c }
                java.lang.String r4 = "DecodeProducer"
                r2.onProducerFinishWithSuccess(r3, r4, r1)     // Catch:{ all -> 0x014c }
                r11.m40586a(r15, r0)     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.p720g.C13647e.m40237d(r19)
                return
            L_0x00f9:
                r0 = move-exception
                r15 = r3
                r2 = r15
                goto L_0x0131
            L_0x00fd:
                r0 = move-exception
                r2 = 0
                goto L_0x0131
            L_0x0100:
                r0 = move-exception
                com.facebook.imagepipeline.g.e r1 = r0.getEncodedImage()     // Catch:{ Exception -> 0x00fd }
                java.lang.String r3 = "ProgressiveDecoder"
                java.lang.String r4 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00fd }
                java.lang.String r16 = r0.getMessage()     // Catch:{ Exception -> 0x00fd }
                r17 = 0
                r2[r17] = r16     // Catch:{ Exception -> 0x00fd }
                r16 = 1
                r2[r16] = r15     // Catch:{ Exception -> 0x00fd }
                r15 = 10
                java.lang.String r15 = r1.mo33272b(r15)     // Catch:{ Exception -> 0x00fd }
                r16 = 2
                r2[r16] = r15     // Catch:{ Exception -> 0x00fd }
                r15 = 3
                int r1 = r1.mo33281i()     // Catch:{ Exception -> 0x00fd }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x00fd }
                r2[r15] = r1     // Catch:{ Exception -> 0x00fd }
                com.facebook.common.p686c.C13286a.m38855b(r3, r4, r2)     // Catch:{ Exception -> 0x00fd }
                throw r0     // Catch:{ Exception -> 0x00fd }
            L_0x0131:
                r1 = r18
                r3 = r13
                java.util.Map r1 = r1.m40585a(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.k.ap r2 = r11.f36506f     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.k.an r3 = r11.f36503b     // Catch:{ all -> 0x014c }
                java.lang.String r3 = r3.mo33335b()     // Catch:{ all -> 0x014c }
                java.lang.String r4 = "DecodeProducer"
                r2.onProducerFinishWithFailure(r3, r4, r0, r1)     // Catch:{ all -> 0x014c }
                r11.m40589c(r0)     // Catch:{ all -> 0x014c }
                com.facebook.imagepipeline.p720g.C13647e.m40237d(r19)
                return
            L_0x014c:
                r0 = move-exception
                com.facebook.imagepipeline.p720g.C13647e.m40237d(r19)
                throw r0
            L_0x0151:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13750m.C13753c.mo33367b(com.facebook.imagepipeline.g.e, int):void");
        }

        public C13753c(C13748k<C13326a<C13645c>> kVar, final C13700an anVar, final boolean z, final int i) {
            super(kVar);
            this.f36503b = anVar;
            this.f36506f = anVar.mo33336c();
            this.f36507g = anVar.mo33333a().mImageDecodeOptions;
            this.f36508h = false;
            this.f36504c = new C13772w(C13750m.this.f36488a, new C13776a(C13750m.this) {
                /* renamed from: a */
                public final void mo33343a(C13647e eVar, int i) {
                    if (eVar != null) {
                        if (C13750m.this.f36490c || !C13728b.m40495b(i, 16)) {
                            ImageRequest a = anVar.mo33333a();
                            if (C13750m.this.f36491d || !C13337d.m39034b(a.mSourceUri)) {
                                eVar.f36263f = C13763q.m40620a(a.mRotationOptions, a.mResizeOptions, eVar, i);
                            }
                        }
                        C13753c.this.mo33367b(eVar, i);
                    }
                }
            }, this.f36507g.f36002a);
            this.f36503b.mo33334a(new C13738e(C13750m.this) {
                /* renamed from: a */
                public final void mo29896a() {
                    if (z) {
                        C13753c.this.mo33368d();
                    }
                }

                /* renamed from: c */
                public final void mo33320c() {
                    if (C13753c.this.f36503b.mo33341h()) {
                        C13753c.this.f36504c.mo33377b();
                    }
                }
            });
        }

        /* renamed from: a */
        private Map<String, String> m40585a(C13645c cVar, long j, C13650h hVar, boolean z, String str, String str2, String str3, String str4) {
            if (!this.f36506f.requiresExtraMap(this.f36503b.mo33335b())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(hVar.mo33284b());
            String valueOf3 = String.valueOf(z);
            if (cVar instanceof C13646d) {
                Bitmap d = ((C13646d) cVar).mo33265d();
                StringBuilder sb = new StringBuilder();
                sb.append(d.getWidth());
                sb.append("x");
                sb.append(d.getHeight());
                String sb2 = sb.toString();
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", sb2);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                return ImmutableMap.copyOf(hashMap);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            return ImmutableMap.copyOf(hashMap2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.facebook.imagepipeline.k.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33296a(com.facebook.imagepipeline.p724k.C13748k<com.facebook.common.references.C13326a<com.facebook.imagepipeline.p720g.C13645c>> r10, com.facebook.imagepipeline.p724k.C13700an r11) {
        /*
            r9 = this;
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "DecodeProducer#produceResults"
            com.facebook.imagepipeline.p725l.C13783b.m40664a(r0)     // Catch:{ all -> 0x004c }
        L_0x000b:
            com.facebook.imagepipeline.request.ImageRequest r0 = r11.mo33333a()     // Catch:{ all -> 0x004c }
            android.net.Uri r0 = r0.mSourceUri     // Catch:{ all -> 0x004c }
            boolean r0 = com.facebook.common.util.C13337d.m39034b(r0)     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0025
            com.facebook.imagepipeline.k.m$a r0 = new com.facebook.imagepipeline.k.m$a     // Catch:{ all -> 0x004c }
            boolean r5 = r9.f36495h     // Catch:{ all -> 0x004c }
            int r6 = r9.f36496i     // Catch:{ all -> 0x004c }
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x004c }
            goto L_0x003c
        L_0x0025:
            com.facebook.imagepipeline.decoder.e r4 = new com.facebook.imagepipeline.decoder.e     // Catch:{ all -> 0x004c }
            com.facebook.common.memory.a r0 = r9.f36492e     // Catch:{ all -> 0x004c }
            r4.<init>(r0)     // Catch:{ all -> 0x004c }
            com.facebook.imagepipeline.k.m$b r8 = new com.facebook.imagepipeline.k.m$b     // Catch:{ all -> 0x004c }
            com.facebook.imagepipeline.decoder.d r5 = r9.f36493f     // Catch:{ all -> 0x004c }
            boolean r6 = r9.f36495h     // Catch:{ all -> 0x004c }
            int r7 = r9.f36496i     // Catch:{ all -> 0x004c }
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004c }
            r0 = r8
        L_0x003c:
            com.facebook.imagepipeline.k.am<com.facebook.imagepipeline.g.e> r10 = r9.f36494g     // Catch:{ all -> 0x004c }
            r10.mo33296a(r0, r11)     // Catch:{ all -> 0x004c }
            boolean r10 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r10 == 0) goto L_0x004b
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
            return
        L_0x004b:
            return
        L_0x004c:
            r10 = move-exception
            boolean r11 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r11 == 0) goto L_0x0056
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x0056:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13750m.mo33296a(com.facebook.imagepipeline.k.k, com.facebook.imagepipeline.k.an):void");
    }

    public C13750m(C13316a aVar, Executor executor, C13629b bVar, C13631d dVar, boolean z, boolean z2, boolean z3, C13699am<C13647e> amVar, int i) {
        this.f36492e = (C13316a) C13307g.m38940a(aVar);
        this.f36488a = (Executor) C13307g.m38940a(executor);
        this.f36489b = (C13629b) C13307g.m38940a(bVar);
        this.f36493f = (C13631d) C13307g.m38940a(dVar);
        this.f36490c = z;
        this.f36491d = z2;
        this.f36494g = (C13699am) C13307g.m38940a(amVar);
        this.f36495h = z3;
        this.f36496i = i;
    }
}
