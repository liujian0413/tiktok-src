package com.facebook.cache.p683a;

import bolts.C1592h;
import com.facebook.binaryresource.C13231a;
import com.facebook.cache.common.C13265a;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p716c.C13561e;
import com.facebook.imagepipeline.p716c.C13591u;
import com.facebook.imagepipeline.p720g.C13647e;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.cache.a.k */
public class C13261k extends C13561e {

    /* renamed from: a */
    public static final Class<?> f35152a = C13261k.class;

    /* renamed from: b */
    public final C13591u f35153b;

    /* renamed from: h */
    private final C13259i f35154h;

    /* renamed from: i */
    private final C13322g f35155i;

    /* renamed from: j */
    private final Executor f35156j;

    /* renamed from: a */
    public final PooledByteBuffer mo32485a(C13265a aVar) throws IOException {
        InputStream a;
        try {
            C13286a.m38835a(f35152a, "Disk cache read for %s", (Object) aVar.toString());
            C13231a a2 = this.f35154h.mo32459a(aVar);
            if (a2 == null) {
                C13286a.m38835a(f35152a, "Disk cache miss for %s", (Object) aVar.toString());
                return null;
            }
            C13286a.m38835a(f35152a, "Found entry in disk cache for %s", (Object) aVar.toString());
            a = a2.mo32427a();
            PooledByteBuffer a3 = this.f35155i.mo32590a(a, (int) a2.mo32428b());
            a.close();
            C13286a.m38835a(f35152a, "Successful read from disk cache for %s", (Object) aVar.toString());
            return a3;
        } catch (IOException e) {
            C13286a.m38841a(f35152a, (Throwable) e, "Exception reading from cache for %s", aVar.toString());
            throw e;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final PooledByteBuffer mo32486b(C13265a aVar) {
        InputStream a;
        try {
            C13286a.m38835a(f35152a, "Disk temp file cache read for %s", (Object) aVar.toString());
            if (!(this.f35154h instanceof C13263l)) {
                return null;
            }
            C13231a e = ((C13263l) this.f35154h).mo32488e(aVar);
            if (e == null) {
                C13286a.m38835a(f35152a, "Disk temp file cache miss for %s", (Object) aVar.toString());
                return null;
            }
            C13286a.m38835a(f35152a, "Found temp file entry in disk cache for %s", (Object) aVar.toString());
            a = e.mo32427a();
            PooledByteBuffer a2 = this.f35155i.mo32590a(a, (int) e.mo32428b());
            a.close();
            C13286a.m38835a(f35152a, "Successful read temp file from disk cache for %s", (Object) aVar.toString());
            return a2;
        } catch (IOException e2) {
            C13286a.m38841a(f35152a, (Throwable) e2, "Exception reading temp file from cache for %s", aVar.toString());
            return null;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: c */
    private C1592h<C13647e> m38793c(C13265a aVar, C13647e eVar) {
        C13286a.m38835a(f35152a, "Found image for %s in staging area", (Object) aVar.toString());
        return C1592h.m7851a(eVar);
    }

    /* renamed from: a */
    public final C1592h<C13647e> mo32483a(C13265a aVar, AtomicBoolean atomicBoolean) {
        C13647e b = this.f35153b.mo33139b(aVar);
        if (b != null) {
            return m38793c(aVar, b);
        }
        return m38792b(aVar, atomicBoolean, true);
    }

    /* renamed from: b */
    private C1592h<C13647e> m38792b(final C13265a aVar, final AtomicBoolean atomicBoolean, final boolean z) {
        try {
            return C1592h.m7855a((Callable<TResult>) new Callable<C13647e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C13647e call() throws Exception {
                    C13326a a;
                    C13326a a2;
                    if (!atomicBoolean.get()) {
                        C13647e b = C13261k.this.f35153b.mo33139b(aVar);
                        if (b != null) {
                            C13286a.m38835a(C13261k.f35152a, "Found image for %s in staging area", (Object) aVar.toString());
                        } else {
                            C13286a.m38835a(C13261k.f35152a, "Did not find image for %s in staging area", (Object) aVar.toString());
                            try {
                                PooledByteBuffer a3 = C13261k.this.mo32485a(aVar);
                                if (a3 != null || z) {
                                    a = C13326a.m38995a(a3);
                                    C13647e eVar = new C13647e(a);
                                    C13326a.m39001c(a);
                                    b = eVar;
                                } else {
                                    PooledByteBuffer b2 = C13261k.this.mo32486b(aVar);
                                    if (b2 != null) {
                                        a2 = C13326a.m38995a(b2);
                                        C13647e mVar = new C13264m(a2);
                                        C13326a.m39001c(a2);
                                        b = mVar;
                                    }
                                    return b;
                                }
                            } catch (Exception unused) {
                                return null;
                            } catch (Throwable th) {
                                C13326a.m39001c(a2);
                                throw th;
                            }
                        }
                        if (!Thread.interrupted()) {
                            return b;
                        }
                        C13286a.m38834a(C13261k.f35152a, "Host thread was interrupted, decreasing reference count");
                        if (b != null) {
                            b.close();
                        }
                        throw new InterruptedException();
                    }
                    throw new CancellationException();
                }
            }, this.f35156j);
        } catch (Exception e) {
            C13286a.m38841a(f35152a, (Throwable) e, "Failed to schedule disk-cache read for %s", aVar.toString());
            return C1592h.m7850a(e);
        }
    }

    /* renamed from: a */
    public final C1592h<C13647e> mo32484a(C13265a aVar, AtomicBoolean atomicBoolean, boolean z) {
        C13647e b = this.f35153b.mo33139b(aVar);
        if (b != null) {
            return m38793c(aVar, b);
        }
        return m38792b(aVar, atomicBoolean, false);
    }
}
