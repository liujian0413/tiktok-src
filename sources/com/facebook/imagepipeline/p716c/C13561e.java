package com.facebook.imagepipeline.p716c;

import bolts.C1592h;
import com.facebook.binaryresource.C13231a;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.C13271g;
import com.facebook.cache.p683a.C13259i;
import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.C13325j;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p725l.C13783b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.c.e */
public class C13561e {

    /* renamed from: c */
    public static final Class<?> f35942c = C13561e.class;

    /* renamed from: a */
    private final C13322g f35943a;

    /* renamed from: b */
    private final Executor f35944b;

    /* renamed from: d */
    public final C13259i f35945d;

    /* renamed from: e */
    public final C13325j f35946e;

    /* renamed from: f */
    public final C13591u f35947f = C13591u.m39988a();

    /* renamed from: g */
    public final C13583n f35948g;

    /* renamed from: h */
    private final Executor f35949h;

    /* renamed from: a */
    public final C1592h<Void> mo33100a() {
        this.f35947f.mo33140b();
        try {
            return C1592h.m7855a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() throws Exception {
                    C13561e.this.f35947f.mo33140b();
                    C13561e.this.f35945d.mo32461a();
                    return null;
                }
            }, this.f35949h);
        } catch (Exception e) {
            C13286a.m38841a(f35942c, (Throwable) e, "Failed to schedule disk-cache clear", new Object[0]);
            return C1592h.m7850a(e);
        }
    }

    /* renamed from: e */
    public final boolean mo33105e(C13265a aVar) {
        if (mo33103c(aVar)) {
            return true;
        }
        return mo33106f(aVar);
    }

    /* renamed from: c */
    public final boolean mo33103c(C13265a aVar) {
        if (this.f35947f.mo33142c(aVar) || this.f35945d.mo32465c(aVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C1592h<Boolean> mo33104d(C13265a aVar) {
        if (mo33103c(aVar)) {
            return C1592h.m7851a(Boolean.valueOf(true));
        }
        return mo32485a(aVar);
    }

    /* renamed from: a */
    private C1592h<Boolean> mo32485a(final C13265a aVar) {
        try {
            return C1592h.m7855a((Callable<TResult>) new Callable<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Boolean call() throws Exception {
                    return Boolean.valueOf(C13561e.this.mo33106f(aVar));
                }
            }, this.f35944b);
        } catch (Exception e) {
            C13286a.m38841a(f35942c, (Throwable) e, "Failed to schedule disk-cache read for %s", aVar.mo32489a());
            return C1592h.m7850a(e);
        }
    }

    /* renamed from: f */
    public final boolean mo33106f(C13265a aVar) {
        C13647e b = this.f35947f.mo33139b(aVar);
        if (b != null) {
            b.close();
            C13286a.m38835a(f35942c, "Found image for %s in staging area", (Object) aVar.mo32489a());
            return true;
        }
        C13286a.m38835a(f35942c, "Did not find image for %s in staging area", (Object) aVar.mo32489a());
        try {
            return this.f35945d.mo32467d(aVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public final C1592h<Void> mo33107g(final C13265a aVar) {
        C13307g.m38940a(aVar);
        this.f35947f.mo33138a(aVar);
        try {
            return C1592h.m7855a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() throws Exception {
                    try {
                        if (C13783b.m40665b()) {
                            C13783b.m40664a("BufferedDiskCache#remove");
                        }
                        C13561e.this.f35947f.mo33138a(aVar);
                        C13561e.this.f35945d.mo32463b(aVar);
                        return null;
                    } finally {
                        if (C13783b.m40665b()) {
                            C13783b.m40663a();
                        }
                    }
                }
            }, this.f35949h);
        } catch (Exception e) {
            C13286a.m38841a(f35942c, (Throwable) e, "Failed to schedule disk-cache remove for %s", aVar.mo32489a());
            return C1592h.m7850a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public PooledByteBuffer mo32486b(C13265a aVar) throws IOException {
        InputStream a;
        try {
            C13286a.m38835a(f35942c, "Disk cache read for %s", (Object) aVar.mo32489a());
            C13231a a2 = this.f35945d.mo32459a(aVar);
            if (a2 == null) {
                C13286a.m38835a(f35942c, "Disk cache miss for %s", (Object) aVar.mo32489a());
                return null;
            }
            C13286a.m38835a(f35942c, "Found entry in disk cache for %s", (Object) aVar.mo32489a());
            a = a2.mo32427a();
            PooledByteBuffer a3 = this.f35943a.mo32590a(a, (int) a2.mo32428b());
            a.close();
            C13286a.m38835a(f35942c, "Successful read from disk cache for %s", (Object) aVar.mo32489a());
            return a3;
        } catch (IOException e) {
            C13286a.m38841a(f35942c, (Throwable) e, "Exception reading from cache for %s", aVar.mo32489a());
            throw e;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: c */
    private C1592h<C13647e> m39897c(C13265a aVar, C13647e eVar) {
        C13286a.m38835a(f35942c, "Found image for %s in staging area", (Object) aVar.mo32489a());
        return C1592h.m7851a(eVar);
    }

    /* renamed from: b */
    private C1592h<C13647e> m39895b(final C13265a aVar, final AtomicBoolean atomicBoolean) {
        try {
            return C1592h.m7855a((Callable<TResult>) new Callable<C13647e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C13647e call() throws Exception {
                    C13326a a;
                    try {
                        if (C13783b.m40665b()) {
                            C13783b.m40664a("BufferedDiskCache#getAsync");
                        }
                        if (!atomicBoolean.get()) {
                            C13647e b = C13561e.this.f35947f.mo33139b(aVar);
                            if (b != null) {
                                C13286a.m38835a(C13561e.f35942c, "Found image for %s in staging area", (Object) aVar.mo32489a());
                            } else {
                                C13286a.m38835a(C13561e.f35942c, "Did not find image for %s in staging area", (Object) aVar.mo32489a());
                                try {
                                    a = C13326a.m38995a(C13561e.this.mo32486b(aVar));
                                    C13647e eVar = new C13647e(a);
                                    C13326a.m39001c(a);
                                    b = eVar;
                                } catch (Exception unused) {
                                    if (C13783b.m40665b()) {
                                        C13783b.m40663a();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    C13326a.m39001c(a);
                                    throw th;
                                }
                            }
                            if (!Thread.interrupted()) {
                                return b;
                            }
                            C13286a.m38834a(C13561e.f35942c, "Host thread was interrupted, decreasing reference count");
                            if (b != null) {
                                b.close();
                            }
                            throw new InterruptedException();
                        }
                        throw new CancellationException();
                    } finally {
                        if (C13783b.m40665b()) {
                            C13783b.m40663a();
                        }
                    }
                }
            }, this.f35944b);
        } catch (Exception e) {
            C13286a.m38841a(f35942c, (Throwable) e, "Failed to schedule disk-cache read for %s", aVar.mo32489a());
            return C1592h.m7850a(e);
        }
    }

    /* renamed from: a */
    public C1592h<C13647e> mo32483a(C13265a aVar, AtomicBoolean atomicBoolean) {
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("BufferedDiskCache#get");
            }
            C13647e b = this.f35947f.mo33139b(aVar);
            if (b != null) {
                return m39897c(aVar, b);
            }
            C1592h<C13647e> b2 = m39895b(aVar, atomicBoolean);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            return b2;
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* renamed from: b */
    public final void mo33102b(C13265a aVar, final C13647e eVar) {
        C13286a.m38835a(f35942c, "About to write to disk-cache for key %s", (Object) aVar.mo32489a());
        try {
            this.f35945d.mo32460a(aVar, new C13271g() {
                /* renamed from: a */
                public final void mo32494a(OutputStream outputStream) throws IOException {
                    C13561e.this.f35946e.mo32605a(eVar.mo33274c(), outputStream);
                }
            });
            C13286a.m38835a(f35942c, "Successful disk-cache write for key %s", (Object) aVar.mo32489a());
        } catch (IOException e) {
            C13286a.m38841a(f35942c, (Throwable) e, "Failed to write to disk-cache for key %s", aVar.mo32489a());
        }
    }

    /* renamed from: a */
    public final void mo33101a(final C13265a aVar, C13647e eVar) {
        final C13647e a;
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("BufferedDiskCache#put");
            }
            C13307g.m38940a(aVar);
            C13307g.m38943a(C13647e.m40238e(eVar));
            this.f35947f.mo33137a(aVar, eVar);
            a = C13647e.m40235a(eVar);
            this.f35949h.execute(new Runnable() {
                public final void run() {
                    try {
                        if (C13783b.m40665b()) {
                            C13783b.m40664a("BufferedDiskCache#putAsync");
                        }
                        C13561e.this.mo33102b(aVar, a);
                    } finally {
                        C13561e.this.f35947f.mo33141b(aVar, a);
                        C13647e.m40237d(a);
                        if (C13783b.m40665b()) {
                            C13783b.m40663a();
                        }
                    }
                }
            });
        } catch (Exception e) {
            C13286a.m38841a(f35942c, (Throwable) e, "Failed to schedule disk-cache write for %s", aVar.mo32489a());
            this.f35947f.mo33141b(aVar, eVar);
            C13647e.m40237d(a);
        } catch (Throwable th) {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            throw th;
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    public C13561e(C13259i iVar, C13322g gVar, C13325j jVar, Executor executor, Executor executor2, C13583n nVar) {
        this.f35945d = iVar;
        this.f35943a = gVar;
        this.f35946e = jVar;
        this.f35944b = executor;
        this.f35949h = executor2;
        this.f35948g = nVar;
    }
}
