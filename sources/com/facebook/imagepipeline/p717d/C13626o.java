package com.facebook.imagepipeline.p717d;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p689f.C13296c;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13683ai;
import com.facebook.imagepipeline.p724k.C13699am;
import com.facebook.imagepipeline.p724k.C13704ar;
import com.facebook.imagepipeline.p724k.C13723ay;
import com.facebook.imagepipeline.p724k.C13731bb;
import com.facebook.imagepipeline.p724k.C13757o;
import com.facebook.imagepipeline.p724k.C13760p;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imagepipeline.p726m.C13790c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.d.o */
public final class C13626o {

    /* renamed from: A */
    private final boolean f36201A;

    /* renamed from: B */
    private final C13790c f36202B;

    /* renamed from: C */
    private C13699am<C13647e> f36203C;

    /* renamed from: a */
    C13699am<C13326a<C13645c>> f36204a;

    /* renamed from: b */
    C13699am<C13647e> f36205b;

    /* renamed from: c */
    C13699am<C13647e> f36206c;

    /* renamed from: d */
    C13699am<C13326a<PooledByteBuffer>> f36207d;

    /* renamed from: e */
    C13699am<C13326a<PooledByteBuffer>> f36208e;

    /* renamed from: f */
    C13699am<Void> f36209f;

    /* renamed from: g */
    C13699am<Void> f36210g;

    /* renamed from: h */
    C13699am<C13326a<C13645c>> f36211h;

    /* renamed from: i */
    C13699am<C13326a<C13645c>> f36212i;

    /* renamed from: j */
    C13699am<C13326a<C13645c>> f36213j;

    /* renamed from: k */
    C13699am<C13326a<C13645c>> f36214k;

    /* renamed from: l */
    C13699am<C13326a<C13645c>> f36215l;

    /* renamed from: m */
    C13699am<C13326a<C13645c>> f36216m;

    /* renamed from: n */
    C13699am<C13326a<C13645c>> f36217n;

    /* renamed from: o */
    Map<C13699am<C13326a<C13645c>>, C13699am<C13326a<C13645c>>> f36218o = new HashMap();

    /* renamed from: p */
    Map<C13699am<C13326a<C13645c>>, C13699am<Void>> f36219p = new HashMap();

    /* renamed from: q */
    Map<C13699am<C13326a<C13645c>>, C13699am<C13326a<C13645c>>> f36220q = new HashMap();

    /* renamed from: r */
    private final ContentResolver f36221r;

    /* renamed from: s */
    private final C13625n f36222s;

    /* renamed from: t */
    private final C13683ai f36223t;

    /* renamed from: u */
    private final boolean f36224u;

    /* renamed from: v */
    private final boolean f36225v;

    /* renamed from: w */
    private final boolean f36226w;

    /* renamed from: x */
    private final C13723ay f36227x;

    /* renamed from: y */
    private final boolean f36228y;

    /* renamed from: z */
    private final boolean f36229z;

    /* renamed from: i */
    private synchronized C13699am<C13326a<C13645c>> m40169i() {
        if (this.f36211h == null) {
            this.f36211h = m40148a((C13699am<C13647e>) this.f36222s.mo33224f());
        }
        return this.f36211h;
    }

    /* renamed from: j */
    private synchronized C13699am<C13326a<C13645c>> m40170j() {
        if (this.f36212i == null) {
            this.f36212i = m40160e((C13699am<C13326a<C13645c>>) this.f36222s.mo33230i());
        }
        return this.f36212i;
    }

    /* renamed from: l */
    private synchronized C13699am<C13326a<C13645c>> m40172l() {
        if (this.f36217n == null) {
            this.f36217n = m40148a((C13699am<C13647e>) this.f36222s.mo33226g());
        }
        return this.f36217n;
    }

    /* renamed from: m */
    private synchronized C13699am<C13326a<C13645c>> m40173m() {
        if (this.f36214k == null) {
            this.f36214k = m40148a((C13699am<C13647e>) this.f36222s.mo33228h());
        }
        return this.f36214k;
    }

    /* renamed from: n */
    private synchronized C13699am<C13326a<C13645c>> m40174n() {
        if (this.f36215l == null) {
            this.f36215l = m40148a((C13699am<C13647e>) this.f36222s.mo33217b());
        }
        return this.f36215l;
    }

    /* renamed from: a */
    private C13699am<C13326a<PooledByteBuffer>> m40147a() {
        synchronized (this) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence");
            }
            if (this.f36208e == null) {
                if (C13783b.m40665b()) {
                    C13783b.m40664a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
                }
                this.f36208e = new C13704ar(m40157d());
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            }
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
        return this.f36208e;
    }

    /* renamed from: b */
    private C13699am<C13326a<PooledByteBuffer>> m40152b() {
        synchronized (this) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence");
            }
            if (this.f36207d == null) {
                if (C13783b.m40665b()) {
                    C13783b.m40664a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
                }
                this.f36207d = new C13704ar(m40167h());
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            }
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
        return this.f36207d;
    }

    /* renamed from: c */
    private synchronized C13699am<C13326a<C13645c>> m40155c() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f36204a == null) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f36204a = m40153b(m40162f());
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return this.f36204a;
    }

    /* renamed from: d */
    private synchronized C13699am<C13647e> m40157d() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.f36206c == null) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.f36206c = C13625n.m40118a(m40162f(), this.f36227x);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return this.f36206c;
    }

    /* renamed from: e */
    private synchronized C13699am<Void> m40159e() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f36210g == null) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f36210g = C13625n.m40121m(m40157d());
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return this.f36210g;
    }

    /* renamed from: g */
    private synchronized C13699am<Void> m40165g() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f36209f == null) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f36209f = C13625n.m40121m(m40167h());
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return this.f36209f;
    }

    /* renamed from: k */
    private synchronized C13699am<C13326a<C13645c>> m40171k() {
        if (this.f36213j == null) {
            this.f36213j = m40149a(this.f36222s.mo33219c(), new C13731bb[]{this.f36222s.mo33220d(), this.f36222s.mo33222e()});
        }
        return this.f36213j;
    }

    /* renamed from: o */
    private synchronized C13699am<C13326a<C13645c>> m40175o() {
        if (this.f36216m == null) {
            C13699am a = this.f36222s.mo33215a();
            if (C13296c.f35194a && (!this.f36225v || C13296c.f35197d == null)) {
                a = this.f36222s.mo33236o(a);
            }
            this.f36216m = m40153b((C13699am<C13647e>) this.f36222s.mo33214a(C13625n.m40117a(a), true, this.f36202B));
        }
        return this.f36216m;
    }

    /* renamed from: f */
    private synchronized C13699am<C13647e> m40162f() {
        boolean z;
        if (C13783b.m40665b()) {
            C13783b.m40664a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f36203C == null) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            this.f36203C = C13625n.m40117a(m40156c((C13699am<C13647e>) this.f36222s.mo33213a(this.f36223t)));
            C13625n nVar = this.f36222s;
            C13699am<C13647e> amVar = this.f36203C;
            if (!this.f36224u || this.f36228y) {
                z = false;
            } else {
                z = true;
            }
            this.f36203C = nVar.mo33214a(amVar, z, this.f36202B);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return this.f36203C;
    }

    /* renamed from: h */
    private synchronized C13699am<C13647e> m40167h() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.f36205b == null) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.f36205b = C13625n.m40118a(m40156c((C13699am<C13647e>) this.f36222s.mo33224f()), this.f36227x);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return this.f36205b;
    }

    /* renamed from: a */
    private C13699am<C13326a<C13645c>> m40148a(C13699am<C13647e> amVar) {
        return m40149a(amVar, new C13731bb[]{this.f36222s.mo33222e()});
    }

    /* renamed from: b */
    private C13699am<C13326a<C13645c>> m40153b(C13699am<C13647e> amVar) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        C13699am<C13326a<C13645c>> e = m40160e((C13699am<C13326a<C13645c>>) this.f36222s.mo33223e(amVar));
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return e;
    }

    /* renamed from: e */
    private C13699am<C13326a<C13645c>> m40160e(C13699am<C13326a<C13645c>> amVar) {
        return this.f36222s.mo33216b(C13625n.m40118a((C13699am<T>) this.f36222s.mo33218c(this.f36222s.mo33221d(amVar)), this.f36227x));
    }

    /* renamed from: g */
    private synchronized C13699am<Void> m40166g(C13699am<C13326a<C13645c>> amVar) {
        if (!this.f36219p.containsKey(amVar)) {
            this.f36219p.put(amVar, C13625n.m40121m(amVar));
        }
        return (C13699am) this.f36219p.get(amVar);
    }

    /* renamed from: h */
    private synchronized C13699am<C13326a<C13645c>> m40168h(C13699am<C13326a<C13645c>> amVar) {
        C13699am<C13326a<C13645c>> amVar2;
        amVar2 = (C13699am) this.f36220q.get(amVar);
        if (amVar2 == null) {
            amVar2 = this.f36222s.mo33237p(amVar);
            this.f36220q.put(amVar, amVar2);
        }
        return amVar2;
    }

    /* renamed from: d */
    public final C13699am<Void> mo33241d(ImageRequest imageRequest) {
        C13699am f = m40164f(imageRequest);
        if (this.f36229z) {
            f = m40168h(f);
        }
        return m40166g(f);
    }

    /* renamed from: f */
    private synchronized C13699am<C13326a<C13645c>> m40163f(C13699am<C13326a<C13645c>> amVar) {
        if (!this.f36218o.containsKey(amVar)) {
            this.f36218o.put(amVar, this.f36222s.mo33233k(this.f36222s.mo33234l(amVar)));
        }
        return (C13699am) this.f36218o.get(amVar);
    }

    /* renamed from: a */
    private C13699am<C13647e> m40150a(C13731bb<C13647e>[] bbVarArr) {
        return this.f36222s.mo33214a(C13625n.m40119a(bbVarArr), true, this.f36202B);
    }

    /* renamed from: c */
    private C13699am<C13647e> m40156c(C13699am<C13647e> amVar) {
        if (C13296c.f35194a && (!this.f36225v || C13296c.f35197d == null)) {
            amVar = this.f36222s.mo33236o(amVar);
        }
        if (this.f36201A) {
            amVar = m40158d(amVar);
        }
        return this.f36222s.mo33231i(this.f36222s.mo33232j(amVar));
    }

    /* renamed from: d */
    private C13699am<C13647e> m40158d(C13699am<C13647e> amVar) {
        C13760p pVar;
        if (C13783b.m40665b()) {
            C13783b.m40664a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f36226w) {
            pVar = this.f36222s.mo33227g(this.f36222s.mo33229h(amVar));
        } else {
            pVar = this.f36222s.mo33227g(amVar);
        }
        C13757o f = this.f36222s.mo33225f(pVar);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return f;
    }

    /* renamed from: e */
    private static void m40161e(ImageRequest imageRequest) {
        boolean z;
        C13307g.m38940a(imageRequest);
        if (imageRequest.mLowestPermittedRequestLevel.getValue() <= RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
    }

    /* renamed from: a */
    private static String m40151a(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf.substring(0, 30));
        sb.append("...");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5 A[FINALLY_INSNS] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.p724k.C13699am<com.facebook.common.references.C13326a<com.facebook.imagepipeline.p720g.C13645c>> m40164f(com.facebook.imagepipeline.request.ImageRequest r4) {
        /*
            r3 = this;
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ProducerSequenceFactory#getBasicDecodedImageSequence"
            com.facebook.imagepipeline.p725l.C13783b.m40664a(r0)     // Catch:{ all -> 0x00be }
        L_0x000b:
            com.facebook.common.internal.C13307g.m38940a(r4)     // Catch:{ all -> 0x00be }
            android.net.Uri r0 = r4.mSourceUri     // Catch:{ all -> 0x00be }
            java.lang.String r1 = "Uri is null."
            com.facebook.common.internal.C13307g.m38941a(r0, r1)     // Catch:{ all -> 0x00be }
            int r4 = r4.mSourceUriType     // Catch:{ all -> 0x00be }
            if (r4 == 0) goto L_0x00b0
            switch(r4) {
                case 2: goto L_0x00a2;
                case 3: goto L_0x0094;
                case 4: goto L_0x006c;
                case 5: goto L_0x005e;
                case 6: goto L_0x0050;
                case 7: goto L_0x0042;
                case 8: goto L_0x0034;
                default: goto L_0x001c;
            }     // Catch:{ all -> 0x00be }
        L_0x001c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "Unsupported uri scheme! Uri is: "
            r1.<init>(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = m40151a(r0)     // Catch:{ all -> 0x00be }
            r1.append(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00be }
            r4.<init>(r0)     // Catch:{ all -> 0x00be }
            throw r4     // Catch:{ all -> 0x00be }
        L_0x0034:
            com.facebook.imagepipeline.k.am r4 = r3.m40172l()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x0041
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x0041:
            return r4
        L_0x0042:
            com.facebook.imagepipeline.k.am r4 = r3.m40175o()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x004f
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x004f:
            return r4
        L_0x0050:
            com.facebook.imagepipeline.k.am r4 = r3.m40173m()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x005d
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x005d:
            return r4
        L_0x005e:
            com.facebook.imagepipeline.k.am r4 = r3.m40174n()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x006b
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x006b:
            return r4
        L_0x006c:
            android.content.ContentResolver r4 = r3.f36221r     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r4.getType(r0)     // Catch:{ all -> 0x00be }
            boolean r4 = com.facebook.common.p687d.C13289a.m38892a(r4)     // Catch:{ all -> 0x00be }
            if (r4 == 0) goto L_0x0086
            com.facebook.imagepipeline.k.am r4 = r3.m40170j()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x0085
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x0085:
            return r4
        L_0x0086:
            com.facebook.imagepipeline.k.am r4 = r3.m40171k()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x0093
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x0093:
            return r4
        L_0x0094:
            com.facebook.imagepipeline.k.am r4 = r3.m40169i()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x00a1
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x00a1:
            return r4
        L_0x00a2:
            com.facebook.imagepipeline.k.am r4 = r3.m40170j()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x00af
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x00af:
            return r4
        L_0x00b0:
            com.facebook.imagepipeline.k.am r4 = r3.m40155c()     // Catch:{ all -> 0x00be }
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x00bd
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x00bd:
            return r4
        L_0x00be:
            r4 = move-exception
            boolean r0 = com.facebook.imagepipeline.p725l.C13783b.m40665b()
            if (r0 == 0) goto L_0x00c8
            com.facebook.imagepipeline.p725l.C13783b.m40663a()
        L_0x00c8:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p717d.C13626o.m40164f(com.facebook.imagepipeline.request.ImageRequest):com.facebook.imagepipeline.k.am");
    }

    /* renamed from: b */
    public final C13699am<Void> mo33239b(ImageRequest imageRequest) {
        m40161e(imageRequest);
        int i = imageRequest.mSourceUriType;
        if (i == 0) {
            return m40159e();
        }
        switch (i) {
            case 2:
            case 3:
                return m40165g();
            default:
                Uri uri = imageRequest.mSourceUri;
                StringBuilder sb = new StringBuilder("Unsupported uri scheme for encoded image fetch! Uri is: ");
                sb.append(m40151a(uri));
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public final C13699am<C13326a<C13645c>> mo33240c(ImageRequest imageRequest) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        C13699am<C13326a<C13645c>> f = m40164f(imageRequest);
        if (imageRequest.mPostprocessor != null) {
            f = m40163f(f);
        }
        if (this.f36229z) {
            f = m40168h(f);
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return f;
    }

    /* renamed from: a */
    public final C13699am<C13326a<PooledByteBuffer>> mo33238a(ImageRequest imageRequest) {
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("ProducerSequenceFactory#getEncodedImageProducerSequence");
            }
            m40161e(imageRequest);
            Uri uri = imageRequest.mSourceUri;
            int i = imageRequest.mSourceUriType;
            if (i != 0) {
                switch (i) {
                    case 2:
                    case 3:
                        return m40152b();
                    default:
                        StringBuilder sb = new StringBuilder("Unsupported uri scheme for encoded image fetch! Uri is: ");
                        sb.append(m40151a(uri));
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                C13699am<C13326a<PooledByteBuffer>> a = m40147a();
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                return a;
            }
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* renamed from: a */
    private C13699am<C13326a<C13645c>> m40149a(C13699am<C13647e> amVar, C13731bb<C13647e>[] bbVarArr) {
        return m40153b(m40154b(m40156c(amVar), bbVarArr));
    }

    /* renamed from: b */
    private C13699am<C13647e> m40154b(C13699am<C13647e> amVar, C13731bb<C13647e>[] bbVarArr) {
        return C13625n.m40120a(m40150a(bbVarArr), (C13699am<C13647e>) this.f36222s.mo33235n(this.f36222s.mo33214a(C13625n.m40117a(amVar), true, this.f36202B)));
    }

    public C13626o(ContentResolver contentResolver, C13625n nVar, C13683ai aiVar, boolean z, boolean z2, C13723ay ayVar, boolean z3, boolean z4, boolean z5, boolean z6, C13790c cVar) {
        this.f36221r = contentResolver;
        this.f36222s = nVar;
        this.f36223t = aiVar;
        this.f36224u = z;
        this.f36225v = z2;
        this.f36227x = ayVar;
        this.f36228y = z3;
        this.f36229z = z4;
        this.f36226w = z5;
        this.f36201A = z6;
        this.f36202B = cVar;
    }
}
