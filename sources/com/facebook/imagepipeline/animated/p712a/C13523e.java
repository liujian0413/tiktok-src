package com.facebook.imagepipeline.animated.p712a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.animated.base.C13538a;
import com.facebook.imagepipeline.animated.base.C13541d;
import com.facebook.imagepipeline.animated.base.C13543f;
import com.facebook.imagepipeline.animated.p713b.C13528a;
import com.facebook.imagepipeline.animated.p713b.C13529b;
import com.facebook.imagepipeline.animated.p713b.C13534d;
import com.facebook.imagepipeline.animated.p713b.C13534d.C13536a;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.p715b.C13551f;
import com.facebook.imagepipeline.p720g.C13643a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p720g.C13649g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.animated.a.e */
public final class C13523e implements C13522d {

    /* renamed from: a */
    static C13521c f35855a = m39776a("com.facebook.animated.gif.GifImage");

    /* renamed from: b */
    static C13521c f35856b = m39776a("com.facebook.animated.webp.WebPImage");

    /* renamed from: c */
    private final C13529b f35857c;

    /* renamed from: d */
    private final C13551f f35858d;

    /* renamed from: a */
    private static C13521c m39776a(String str) {
        try {
            return (C13521c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public C13523e(C13529b bVar, C13551f fVar) {
        this.f35857c = bVar;
        this.f35858d = fVar;
    }

    /* renamed from: a */
    private List<C13326a<Bitmap>> m39778a(C13541d dVar, Config config) {
        C13538a a = this.f35857c.mo33043a(C13543f.m39845a(dVar), null);
        final ArrayList arrayList = new ArrayList(a.mo33060a());
        C13534d dVar2 = new C13534d(a, new C13536a() {
            /* renamed from: a */
            public final C13326a<Bitmap> mo33014a(int i) {
                return C13326a.m39000b((C13326a) arrayList.get(i));
            }
        });
        for (int i = 0; i < a.mo33060a(); i++) {
            C13326a a2 = m39774a(a.mo33066c(), a.mo33067d(), config);
            dVar2.mo33077a(i, (Bitmap) a2.mo32609a());
            arrayList.add(a2);
        }
        return arrayList;
    }

    /* renamed from: a */
    private C13326a<Bitmap> m39774a(int i, int i2, Config config) {
        C13326a<Bitmap> a = this.f35858d.mo33093a(i, i2, config);
        ((Bitmap) a.mo32609a()).eraseColor(0);
        if (VERSION.SDK_INT >= 12) {
            ((Bitmap) a.mo32609a()).setHasAlpha(true);
        }
        return a;
    }

    /* renamed from: a */
    private C13326a<Bitmap> m39775a(C13541d dVar, Config config, int i) {
        C13326a<Bitmap> a = m39774a(dVar.getWidth(), dVar.getHeight(), config);
        new C13534d(this.f35857c.mo33043a(C13543f.m39845a(dVar), null), new C13536a() {
            /* renamed from: a */
            public final C13326a<Bitmap> mo33014a(int i) {
                return null;
            }
        }).mo33077a(i, (Bitmap) a.mo32609a());
        return a;
    }

    /* renamed from: b */
    private List<C13326a<Bitmap>> m39779b(C13541d dVar, Config config, int i) {
        C13538a a = this.f35857c.mo33043a(C13543f.m39845a(dVar), null);
        int a2 = a.mo33060a();
        if (i > a2) {
            i = a2;
        }
        ((C13528a) a).f35864a = 1;
        final ArrayList arrayList = new ArrayList(i);
        C13534d dVar2 = new C13534d(a, new C13536a() {
            /* renamed from: a */
            public final C13326a<Bitmap> mo33014a(int i) {
                return C13326a.m39000b((C13326a) arrayList.get(i));
            }
        });
        for (int i2 = 0; i2 < i; i2++) {
            C13326a a3 = m39774a(a.mo33066c(), a.mo33067d(), config);
            try {
                dVar2.mo33077a(i2, (Bitmap) a3.mo32609a());
                arrayList.add(a3);
            } catch (IllegalStateException e) {
                C13286a.m38845a("AnimatedImageFactoryImp", (Throwable) e, "preview decode failed", new Object[0]);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private C13645c m39777a(C13594b bVar, C13541d dVar, Config config) {
        List list;
        int i;
        C13326a b;
        C13326a aVar = null;
        try {
            if (bVar.f36005d) {
                i = dVar.getFrameCount() - 1;
            } else {
                i = 0;
            }
            if (bVar.f36007f) {
                C13646d dVar2 = new C13646d(m39775a(dVar, bVar.f36009h, i), C13649g.f36269a, 0);
                C13326a.m39001c(null);
                C13326a.m38998a(null);
                return dVar2;
            }
            if (bVar.f36006e) {
                list = m39778a(dVar, bVar.f36009h);
                try {
                    if (list.size() > i) {
                        b = C13326a.m39000b((C13326a) list.get(i));
                    }
                    if (bVar.f36003b && aVar == null) {
                        aVar = m39775a(dVar, bVar.f36009h, i);
                    }
                    C13643a aVar2 = new C13643a(C13543f.m39846b(dVar).mo33089a(aVar).mo33088a(i).mo33090a(list).mo33092c(), bVar);
                    C13326a.m39001c(aVar);
                    C13326a.m38998a((Iterable<? extends C13326a<?>>) list);
                    return aVar2;
                } catch (Throwable th) {
                    th = th;
                    C13326a.m39001c(null);
                    C13326a.m38998a((Iterable<? extends C13326a<?>>) list);
                    throw th;
                }
            } else {
                if (bVar.f36004c > 0) {
                    list = m39779b(dVar, bVar.f36009h, bVar.f36004c);
                    if (list.size() > i) {
                        b = C13326a.m39000b((C13326a) list.get(i));
                    }
                } else {
                    list = null;
                }
                aVar = m39775a(dVar, bVar.f36009h, i);
                C13643a aVar22 = new C13643a(C13543f.m39846b(dVar).mo33089a(aVar).mo33088a(i).mo33090a(list).mo33092c(), bVar);
                C13326a.m39001c(aVar);
                C13326a.m38998a((Iterable<? extends C13326a<?>>) list);
                return aVar22;
            }
            aVar = b;
            aVar = m39775a(dVar, bVar.f36009h, i);
            C13643a aVar222 = new C13643a(C13543f.m39846b(dVar).mo33089a(aVar).mo33088a(i).mo33090a(list).mo33092c(), bVar);
            C13326a.m39001c(aVar);
            C13326a.m38998a((Iterable<? extends C13326a<?>>) list);
            return aVar222;
        } catch (Throwable th2) {
            th = th2;
            list = null;
            C13326a.m39001c(null);
            C13326a.m38998a((Iterable<? extends C13326a<?>>) list);
            throw th;
        }
    }

    /* renamed from: b */
    public final C13645c mo33058b(C13647e eVar, C13594b bVar, Config config) {
        C13541d dVar;
        if (f35856b != null) {
            C13326a b = eVar.mo33271b();
            C13307g.m38940a(b);
            try {
                PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) b.mo32609a();
                if (pooledByteBuffer.mo32578c() != null) {
                    dVar = f35856b.decode(pooledByteBuffer.mo32578c());
                } else {
                    dVar = f35856b.decode(pooledByteBuffer.mo32577b(), pooledByteBuffer.mo32575a());
                }
                return m39777a(bVar, dVar, config);
            } finally {
                C13326a.m39001c(b);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }

    /* renamed from: a */
    public final C13645c mo33057a(C13647e eVar, C13594b bVar, Config config) {
        C13541d dVar;
        if (f35855a != null) {
            C13326a b = eVar.mo33271b();
            C13307g.m38940a(b);
            try {
                PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) b.mo32609a();
                if (pooledByteBuffer.mo32578c() != null) {
                    dVar = f35855a.decode(pooledByteBuffer.mo32578c());
                } else {
                    dVar = f35855a.decode(pooledByteBuffer.mo32577b(), pooledByteBuffer.mo32575a());
                }
                return m39777a(bVar, dVar, config);
            } finally {
                C13326a.m39001c(b);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
    }
}
