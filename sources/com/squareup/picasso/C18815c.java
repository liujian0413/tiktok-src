package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import com.squareup.picasso.C18850u.C18851a;
import com.squareup.picasso.Downloader.ResponseException;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Picasso.Priority;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.c */
final class C18815c implements Runnable {

    /* renamed from: t */
    private static final Object f50702t = new Object();

    /* renamed from: u */
    private static final ThreadLocal<StringBuilder> f50703u = new ThreadLocal<StringBuilder>() {
        /* renamed from: a */
        private static StringBuilder m61468a() {
            return new StringBuilder("Picasso-");
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return m61468a();
        }
    };

    /* renamed from: v */
    private static final AtomicInteger f50704v = new AtomicInteger();

    /* renamed from: w */
    private static final C18850u f50705w = new C18850u() {
        /* renamed from: a */
        public final boolean mo50006a(C18846s sVar) {
            return true;
        }

        /* renamed from: a */
        public final C18851a mo50005a(C18846s sVar, int i) throws IOException {
            StringBuilder sb = new StringBuilder("Unrecognized type of request: ");
            sb.append(sVar);
            throw new IllegalStateException(sb.toString());
        }
    };

    /* renamed from: a */
    final int f50706a = f50704v.incrementAndGet();

    /* renamed from: b */
    public final Picasso f50707b;

    /* renamed from: c */
    final C18829i f50708c;

    /* renamed from: d */
    final C18822d f50709d;

    /* renamed from: e */
    final C18853w f50710e;

    /* renamed from: f */
    public final String f50711f;

    /* renamed from: g */
    public final C18846s f50712g;

    /* renamed from: h */
    public final int f50713h;

    /* renamed from: i */
    int f50714i;

    /* renamed from: j */
    final C18850u f50715j;

    /* renamed from: k */
    public C18800a f50716k;

    /* renamed from: l */
    public List<C18800a> f50717l;

    /* renamed from: m */
    public Bitmap f50718m;

    /* renamed from: n */
    Future<?> f50719n;

    /* renamed from: o */
    public LoadedFrom f50720o;

    /* renamed from: p */
    public Exception f50721p;

    /* renamed from: q */
    int f50722q;

    /* renamed from: r */
    int f50723r;

    /* renamed from: s */
    public Priority f50724s;

    /* renamed from: a */
    private static boolean m61459a(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo50009a(boolean z, NetworkInfo networkInfo) {
        if (!(this.f50723r > 0)) {
            return false;
        }
        this.f50723r--;
        return this.f50715j.mo50060a(z, networkInfo);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo50012c() {
        return this.f50715j.mo50061b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo50011b() {
        if (this.f50719n == null || !this.f50719n.isCancelled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo50008a() {
        if (this.f50716k != null || ((this.f50717l != null && !this.f50717l.isEmpty()) || this.f50719n == null || !this.f50719n.cancel(false))) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private Priority m61461e() {
        boolean z;
        Priority priority = Priority.LOW;
        boolean z2 = true;
        if (this.f50717l == null || this.f50717l.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f50716k == null && !z) {
            z2 = false;
        }
        if (!z2) {
            return priority;
        }
        if (this.f50716k != null) {
            priority = this.f50716k.mo49998d();
        }
        if (z) {
            int size = this.f50717l.size();
            for (int i = 0; i < size; i++) {
                Priority d = ((C18800a) this.f50717l.get(i)).mo49998d();
                if (d.ordinal() > priority.ordinal()) {
                    priority = d;
                }
            }
        }
        return priority;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private Bitmap m61460d() throws IOException {
        Bitmap bitmap;
        int i;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.f50713h)) {
            bitmap = this.f50709d.mo50020a(this.f50711f);
            if (bitmap != null) {
                this.f50710e.mo50100a();
                this.f50720o = LoadedFrom.MEMORY;
                if (this.f50707b.f50662m) {
                    this.f50712g.mo50069a();
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        C18846s sVar = this.f50712g;
        if (this.f50723r == 0) {
            i = NetworkPolicy.OFFLINE.index;
        } else {
            i = this.f50714i;
        }
        sVar.f50793c = i;
        C18851a a = this.f50715j.mo50005a(this.f50712g, this.f50714i);
        if (a != null) {
            this.f50720o = a.f50837a;
            this.f50722q = a.f50840d;
            bitmap = a.f50838b;
            if (bitmap == null) {
                InputStream inputStream = a.f50839c;
                try {
                    Bitmap a2 = m61455a(inputStream, this.f50712g);
                    C18807ad.m61439a(inputStream);
                    bitmap = a2;
                } catch (Throwable th) {
                    C18807ad.m61439a(inputStream);
                    throw th;
                }
            }
        }
        if (bitmap != null) {
            if (this.f50707b.f50662m) {
                this.f50712g.mo50069a();
            }
            this.f50710e.mo50102a(bitmap);
            if (this.f50712g.mo50073e() || this.f50722q != 0) {
                synchronized (f50702t) {
                    if (this.f50712g.mo50074f() || this.f50722q != 0) {
                        bitmap = m61454a(this.f50712g, bitmap, this.f50722q);
                        if (this.f50707b.f50662m) {
                            this.f50712g.mo50069a();
                        }
                    }
                    if (this.f50712g.mo50075g()) {
                        bitmap = m61456a(this.f50712g.f50797g, bitmap);
                        if (this.f50707b.f50662m) {
                            this.f50712g.mo50069a();
                        }
                    }
                }
                if (bitmap != null) {
                    this.f50710e.mo50106b(bitmap);
                }
            }
        }
        return bitmap;
    }

    public final void run() {
        try {
            m61458a(this.f50712g);
            if (this.f50707b.f50662m) {
                C18807ad.m61433a(this);
            }
            this.f50718m = m61460d();
            if (this.f50718m == null) {
                this.f50708c.mo50040c(this);
            } else {
                this.f50708c.mo50031a(this);
            }
        } catch (ResponseException e) {
            if (!e.localCacheOnly || e.responseCode != 504) {
                this.f50721p = e;
            }
            this.f50708c.mo50040c(this);
        } catch (C18841a e2) {
            this.f50721p = e2;
            this.f50708c.mo50037b(this);
        } catch (IOException e3) {
            this.f50721p = e3;
            this.f50708c.mo50037b(this);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f50710e.mo50110e().mo50113a(new PrintWriter(stringWriter));
            this.f50721p = new RuntimeException(stringWriter.toString(), e4);
            this.f50708c.mo50040c(this);
        } catch (Exception e5) {
            this.f50721p = e5;
            this.f50708c.mo50040c(this);
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50010b(C18800a aVar) {
        boolean z;
        if (this.f50716k == aVar) {
            this.f50716k = null;
            z = true;
        } else if (this.f50717l != null) {
            z = this.f50717l.remove(aVar);
        } else {
            z = false;
        }
        if (z && aVar.mo49998d() == this.f50724s) {
            this.f50724s = m61461e();
        }
        if (this.f50707b.f50662m) {
            aVar.f50683b.mo50069a();
            C18807ad.m61434a(this, "from ");
        }
    }

    /* renamed from: a */
    private static void m61458a(C18846s sVar) {
        String c = sVar.mo50071c();
        StringBuilder sb = (StringBuilder) f50703u.get();
        sb.ensureCapacity(c.length() + 8);
        sb.replace(8, sb.length(), c);
        Thread.currentThread().setName(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50007a(C18800a aVar) {
        boolean z = this.f50707b.f50662m;
        C18846s sVar = aVar.f50683b;
        if (this.f50716k == null) {
            this.f50716k = aVar;
            if (z) {
                if (this.f50717l == null || this.f50717l.isEmpty()) {
                    sVar.mo50069a();
                    return;
                } else {
                    sVar.mo50069a();
                    C18807ad.m61434a(this, "to ");
                }
            }
            return;
        }
        if (this.f50717l == null) {
            this.f50717l = new ArrayList(3);
        }
        this.f50717l.add(aVar);
        if (z) {
            sVar.mo50069a();
            C18807ad.m61434a(this, "to ");
        }
        Priority d = aVar.mo49998d();
        if (d.ordinal() > this.f50724s.ordinal()) {
            this.f50724s = d;
        }
    }

    /* renamed from: a */
    private static Bitmap m61455a(InputStream inputStream, C18846s sVar) throws IOException {
        C18837m mVar = new C18837m(inputStream);
        long a = mVar.mo50048a(65536);
        Options c = C18850u.m61580c(sVar);
        boolean a2 = C18850u.m61579a(c);
        boolean c2 = C18807ad.m61446c((InputStream) mVar);
        mVar.mo50049a(a);
        if (c2) {
            byte[] b = C18807ad.m61444b((InputStream) mVar);
            if (a2) {
                BitmapFactory.decodeByteArray(b, 0, b.length, c);
                C18850u.m61578a(sVar.f50798h, sVar.f50799i, c, sVar);
            }
            return BitmapFactory.decodeByteArray(b, 0, b.length, c);
        }
        if (a2) {
            BitmapFactory.decodeStream(mVar, null, c);
            C18850u.m61578a(sVar.f50798h, sVar.f50799i, c, sVar);
            mVar.mo50049a(a);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(mVar, null, c);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    /* renamed from: a */
    private static Bitmap m61456a(List<C18802aa> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final C18802aa aaVar = (C18802aa) list.get(i);
            try {
                Bitmap a = aaVar.mo49999a(bitmap);
                if (a == null) {
                    final StringBuilder sb = new StringBuilder("Transformation ");
                    sb.append(aaVar.mo50000a());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C18802aa a2 : list) {
                        sb.append(a2.mo50000a());
                        sb.append(10);
                    }
                    Picasso.f50650a.post(new Runnable() {
                        public final void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                } else if (a == bitmap && bitmap.isRecycled()) {
                    Picasso.f50650a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Transformation ");
                            sb.append(aaVar.mo50000a());
                            sb.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                } else if (a == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a;
                } else {
                    Picasso.f50650a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Transformation ");
                            sb.append(aaVar.mo50000a());
                            sb.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e) {
                Picasso.f50650a.post(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Transformation ");
                        sb.append(aaVar.mo50000a());
                        sb.append(" crashed with exception.");
                        throw new RuntimeException(sb.toString(), e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m61454a(com.squareup.picasso.C18846s r13, android.graphics.Bitmap r14, int r15) {
        /*
            int r0 = r14.getWidth()
            int r1 = r14.getHeight()
            boolean r2 = r13.f50802l
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            boolean r3 = r13.mo50074f()
            r4 = 0
            if (r3 == 0) goto L_0x00b1
            int r3 = r13.f50798h
            int r5 = r13.f50799i
            float r6 = r13.f50803m
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0030
            boolean r7 = r13.f50806p
            if (r7 == 0) goto L_0x002d
            float r7 = r13.f50804n
            float r9 = r13.f50805o
            r8.setRotate(r6, r7, r9)
            goto L_0x0030
        L_0x002d:
            r8.setRotate(r6)
        L_0x0030:
            boolean r6 = r13.f50800j
            if (r6 == 0) goto L_0x0074
            float r13 = (float) r3
            float r6 = (float) r0
            float r7 = r13 / r6
            float r9 = (float) r5
            float r10 = (float) r1
            float r11 = r9 / r10
            int r12 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x0054
            float r11 = r11 / r7
            float r10 = r10 * r11
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r13 = (int) r10
            int r6 = r1 - r13
            int r6 = r6 / 2
            float r10 = (float) r13
            float r11 = r9 / r10
            r9 = r13
            r13 = r7
            r7 = r0
            goto L_0x0067
        L_0x0054:
            float r7 = r7 / r11
            float r6 = r6 * r7
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r7 = r0 - r6
            int r7 = r7 / 2
            float r9 = (float) r6
            float r13 = r13 / r9
            r9 = r1
            r4 = r7
            r7 = r6
            r6 = 0
        L_0x0067:
            boolean r0 = m61459a(r2, r0, r1, r3, r5)
            if (r0 == 0) goto L_0x0070
            r8.preScale(r13, r11)
        L_0x0070:
            r5 = r6
            r6 = r7
            r7 = r9
            goto L_0x00b4
        L_0x0074:
            boolean r13 = r13.f50801k
            if (r13 == 0) goto L_0x008e
            float r13 = (float) r3
            float r6 = (float) r0
            float r13 = r13 / r6
            float r6 = (float) r5
            float r7 = (float) r1
            float r6 = r6 / r7
            int r7 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r13 = r6
        L_0x0084:
            boolean r2 = m61459a(r2, r0, r1, r3, r5)
            if (r2 == 0) goto L_0x00b1
            r8.preScale(r13, r13)
            goto L_0x00b1
        L_0x008e:
            if (r3 != 0) goto L_0x0092
            if (r5 == 0) goto L_0x00b1
        L_0x0092:
            if (r3 != r0) goto L_0x0096
            if (r5 == r1) goto L_0x00b1
        L_0x0096:
            if (r3 == 0) goto L_0x009c
            float r13 = (float) r3
            float r6 = (float) r0
        L_0x009a:
            float r13 = r13 / r6
            goto L_0x009f
        L_0x009c:
            float r13 = (float) r5
            float r6 = (float) r1
            goto L_0x009a
        L_0x009f:
            if (r5 == 0) goto L_0x00a5
            float r6 = (float) r5
            float r7 = (float) r1
        L_0x00a3:
            float r6 = r6 / r7
            goto L_0x00a8
        L_0x00a5:
            float r6 = (float) r3
            float r7 = (float) r0
            goto L_0x00a3
        L_0x00a8:
            boolean r2 = m61459a(r2, r0, r1, r3, r5)
            if (r2 == 0) goto L_0x00b1
            r8.preScale(r13, r6)
        L_0x00b1:
            r6 = r0
            r7 = r1
            r5 = 0
        L_0x00b4:
            if (r15 == 0) goto L_0x00ba
            float r13 = (float) r15
            r8.preRotate(r13)
        L_0x00ba:
            r9 = 1
            r3 = r14
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            if (r13 == r14) goto L_0x00c6
            r14.recycle()
            goto L_0x00c7
        L_0x00c6:
            r13 = r14
        L_0x00c7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C18815c.m61454a(com.squareup.picasso.s, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    static C18815c m61457a(Picasso picasso, C18829i iVar, C18822d dVar, C18853w wVar, C18800a aVar) {
        C18846s sVar = aVar.f50683b;
        List<C18850u> list = picasso.f50652c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C18850u uVar = (C18850u) list.get(i);
            if (uVar.mo50006a(sVar)) {
                C18815c cVar = new C18815c(picasso, iVar, dVar, wVar, aVar, uVar);
                return cVar;
            }
        }
        C18815c cVar2 = new C18815c(picasso, iVar, dVar, wVar, aVar, f50705w);
        return cVar2;
    }

    private C18815c(Picasso picasso, C18829i iVar, C18822d dVar, C18853w wVar, C18800a aVar, C18850u uVar) {
        this.f50707b = picasso;
        this.f50708c = iVar;
        this.f50709d = dVar;
        this.f50710e = wVar;
        this.f50716k = aVar;
        this.f50711f = aVar.f50690i;
        this.f50712g = aVar.f50683b;
        this.f50724s = aVar.mo49998d();
        this.f50713h = aVar.f50686e;
        this.f50714i = aVar.f50687f;
        this.f50715j = uVar;
        this.f50723r = uVar.mo50059a();
    }
}
