package com.facebook.fresco.animation.p703b.p705b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.SparseArray;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p703b.C13470b;
import com.facebook.fresco.animation.p703b.C13476c;
import com.facebook.imagepipeline.p715b.C13551f;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.fresco.animation.b.b.c */
public class C13473c implements C13472b {

    /* renamed from: a */
    public static final Class<?> f35726a = C13473c.class;

    /* renamed from: b */
    public final C13551f f35727b;

    /* renamed from: c */
    public final C13476c f35728c;

    /* renamed from: d */
    public final Config f35729d;

    /* renamed from: e */
    public final SparseArray<Runnable> f35730e = new SparseArray<>();

    /* renamed from: f */
    private final ExecutorService f35731f;

    /* renamed from: com.facebook.fresco.animation.b.b.c$a */
    class C13474a implements Runnable {

        /* renamed from: b */
        private final C13470b f35733b;

        /* renamed from: c */
        private final C13460a f35734c;

        /* renamed from: d */
        private final int f35735d;

        /* renamed from: e */
        private final int f35736e;

        public final void run() {
            try {
                if (this.f35733b.mo33007c(this.f35735d)) {
                    C13286a.m38835a(C13473c.f35726a, "Frame %d is cached already.", (Object) Integer.valueOf(this.f35735d));
                    synchronized (C13473c.this.f35730e) {
                        C13473c.this.f35730e.remove(this.f35736e);
                    }
                    return;
                }
                if (m39636a(this.f35735d, 1)) {
                    C13286a.m38835a(C13473c.f35726a, "Prepared frame frame %d.", (Object) Integer.valueOf(this.f35735d));
                } else {
                    C13286a.m38859c(C13473c.f35726a, "Could not prepare frame %d.", Integer.valueOf(this.f35735d));
                }
                synchronized (C13473c.this.f35730e) {
                    C13473c.this.f35730e.remove(this.f35736e);
                }
            } catch (Throwable th) {
                synchronized (C13473c.this.f35730e) {
                    C13473c.this.f35730e.remove(this.f35736e);
                    throw th;
                }
            }
        }

        /* renamed from: a */
        private boolean m39636a(int i, int i2) {
            C13326a aVar;
            char c;
            boolean a;
            while (true) {
                switch (i2) {
                    case 1:
                        aVar = this.f35733b.mo33002a(i, this.f35734c.mo32986a(), this.f35734c.mo32991b());
                        c = 2;
                        break;
                    case 2:
                        try {
                            aVar = C13473c.this.f35727b.mo33098b(this.f35734c.mo32986a(), this.f35734c.mo32991b(), C13473c.this.f35729d);
                            c = 65535;
                            break;
                        } catch (RuntimeException e) {
                            C13286a.m38839a(C13473c.f35726a, "Failed to create frame bitmap", (Throwable) e);
                            C13326a.m39001c(null);
                            return false;
                        } catch (Throwable th) {
                            C13326a.m39001c(null);
                            throw th;
                        }
                    default:
                        C13326a.m39001c(null);
                        return false;
                }
                a = m39637a(i, aVar, i2);
                C13326a.m39001c(aVar);
                if (a || c == 65535) {
                    return a;
                }
                i2 = 2;
            }
            return a;
        }

        /* renamed from: a */
        private boolean m39637a(int i, C13326a<Bitmap> aVar, int i2) {
            if (!C13326a.m38999a(aVar) || !C13473c.this.f35728c.mo33012a(i, (Bitmap) aVar.mo32609a())) {
                return false;
            }
            C13286a.m38835a(C13473c.f35726a, "Frame %d ready.", (Object) Integer.valueOf(this.f35735d));
            synchronized (C13473c.this.f35730e) {
                this.f35733b.mo33006b(this.f35735d, aVar, i2);
            }
            return true;
        }

        public C13474a(C13460a aVar, C13470b bVar, int i, int i2) {
            this.f35734c = aVar;
            this.f35733b = bVar;
            this.f35735d = i;
            this.f35736e = i2;
        }
    }

    /* renamed from: a */
    private static int m39634a(C13460a aVar, int i) {
        return (aVar.hashCode() * 31) + i;
    }

    /* renamed from: a */
    public final boolean mo33008a(C13470b bVar, C13460a aVar, int i) {
        int a = m39634a(aVar, i);
        synchronized (this.f35730e) {
            if (this.f35730e.get(a) != null) {
                C13286a.m38835a(f35726a, "Already scheduled decode job for frame %d", (Object) Integer.valueOf(i));
                return true;
            } else if (bVar.mo33007c(i)) {
                C13286a.m38835a(f35726a, "Frame %d is cached already.", (Object) Integer.valueOf(i));
                return true;
            } else {
                C13474a aVar2 = new C13474a(aVar, bVar, i, a);
                this.f35730e.put(a, aVar2);
                this.f35731f.execute(aVar2);
                return true;
            }
        }
    }

    public C13473c(C13551f fVar, C13476c cVar, Config config, ExecutorService executorService) {
        this.f35727b = fVar;
        this.f35728c = cVar;
        this.f35729d = config;
        this.f35731f = executorService;
    }
}
