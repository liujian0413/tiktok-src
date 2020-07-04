package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import com.p280ss.android.ugc.aweme.livewallpaper.egl.C32594n.C32597b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.s */
public final class C32602s implements C32597b {

    /* renamed from: a */
    public final int f85009a;

    /* renamed from: b */
    public final int f85010b;

    /* renamed from: c */
    public String f85011c = "TextureQueue";

    /* renamed from: d */
    private final int f85012d;

    /* renamed from: e */
    private final boolean f85013e;

    /* renamed from: f */
    private List<C32587h> f85014f;

    /* renamed from: g */
    private List<C32587h> f85015g;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.s$a */
    static class C32603a extends C32594n implements C32597b {
        /* renamed from: e */
        public final void mo83920e() {
            super.mo83920e();
        }

        /* renamed from: a */
        public final void mo83921a(C32587h hVar) {
            this.f84980a = null;
        }

        /* renamed from: a */
        protected static C32587h m105635a(C32602s sVar) {
            return m105634a(sVar.mo83927a(), sVar.mo83929b(), sVar);
        }

        /* renamed from: a */
        private static C32587h m105634a(int i, int i2, C32597b bVar) {
            int i3;
            if (i == 0 && i2 == 0) {
                i3 = C32588i.m105573c();
            } else {
                i3 = C32588i.m105568a(null, i, i2, 6408);
            }
            if (i3 > 0) {
                return m105633a(i, i2, i3, bVar);
            }
            return null;
        }

        private C32603a(int i, int i2, int i3, C32597b bVar) {
            super(i, i2, i3, bVar);
        }

        /* renamed from: a */
        public static C32587h m105633a(int i, int i2, int i3, C32597b bVar) {
            return new C32603a(i3, i, i2, bVar);
        }
    }

    /* renamed from: a */
    public final int mo83927a() {
        return this.f85009a;
    }

    /* renamed from: b */
    public final int mo83929b() {
        return this.f85010b;
    }

    /* renamed from: c */
    public final void mo83930c() {
        synchronized (this) {
            m105627a(this.f85014f);
            m105627a(this.f85015g);
            synchronized (this.f85014f) {
                for (C32587h hVar : this.f85014f) {
                    ((C32603a) hVar).mo83920e();
                }
                this.f85014f.clear();
            }
            synchronized (this.f85015g) {
                this.f85015g.clear();
                this.f85015g.notifyAll();
            }
        }
    }

    /* renamed from: a */
    private static int m105627a(List<C32587h> list) {
        int size;
        synchronized (list) {
            size = list.size();
        }
        return size;
    }

    /* renamed from: a */
    public final void mo83921a(C32587h hVar) {
        synchronized (this.f85015g) {
            this.f85015g.add(hVar);
            this.f85015g.notifyAll();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0057 */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.livewallpaper.egl.C32587h mo83928a(int r6) {
        /*
            r5 = this;
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r6 = r5.f85015g
            monitor-enter(r6)
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r0 = r5.f85015g     // Catch:{ all -> 0x0071 }
            int r0 = r0.size()     // Catch:{ all -> 0x0071 }
            r1 = 0
            if (r0 <= 0) goto L_0x0015
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r0 = r5.f85015g     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x0071 }
            com.ss.android.ugc.aweme.livewallpaper.egl.h r0 = (com.p280ss.android.ugc.aweme.livewallpaper.egl.C32587h) r0     // Catch:{ all -> 0x0071 }
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            monitor-exit(r6)     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0047
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r6 = r5.f85014f
            monitor-enter(r6)
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r2 = r5.f85014f     // Catch:{ all -> 0x0044 }
            int r2 = r2.size()     // Catch:{ all -> 0x0044 }
            int r3 = r5.f85012d     // Catch:{ all -> 0x0044 }
            if (r2 >= r3) goto L_0x0041
            boolean r0 = r5.f85013e     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0034
            int r0 = r5.f85009a     // Catch:{ all -> 0x0044 }
            int r2 = r5.f85010b     // Catch:{ all -> 0x0044 }
            r3 = -1
            com.ss.android.ugc.aweme.livewallpaper.egl.h r0 = com.p280ss.android.ugc.aweme.livewallpaper.egl.C32602s.C32603a.m105633a(r0, r2, r3, r5)     // Catch:{ all -> 0x0044 }
            goto L_0x0038
        L_0x0034:
            com.ss.android.ugc.aweme.livewallpaper.egl.h r0 = com.p280ss.android.ugc.aweme.livewallpaper.egl.C32602s.C32603a.m105635a(r5)     // Catch:{ all -> 0x0044 }
        L_0x0038:
            if (r0 == 0) goto L_0x003f
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r2 = r5.f85014f     // Catch:{ all -> 0x0044 }
            r2.add(r0)     // Catch:{ all -> 0x0044 }
        L_0x003f:
            r2 = 0
            goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            throw r0
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 == 0) goto L_0x006b
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r6 = r5.f85015g
            monitor-enter(r6)
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r2 = r5.f85015g     // Catch:{ InterruptedException -> 0x0057 }
            r3 = 1000(0x3e8, double:4.94E-321)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0057 }
            goto L_0x0057
        L_0x0055:
            r0 = move-exception
            goto L_0x0069
        L_0x0057:
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r2 = r5.f85015g     // Catch:{ all -> 0x0055 }
            int r2 = r2.size()     // Catch:{ all -> 0x0055 }
            if (r2 <= 0) goto L_0x0067
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.egl.h> r0 = r5.f85015g     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x0055 }
            com.ss.android.ugc.aweme.livewallpaper.egl.h r0 = (com.p280ss.android.ugc.aweme.livewallpaper.egl.C32587h) r0     // Catch:{ all -> 0x0055 }
        L_0x0067:
            monitor-exit(r6)     // Catch:{ all -> 0x0055 }
            goto L_0x006b
        L_0x0069:
            monitor-exit(r6)     // Catch:{ all -> 0x0055 }
            throw r0
        L_0x006b:
            if (r0 == 0) goto L_0x0070
            r0.mo83895a()
        L_0x0070:
            return r0
        L_0x0071:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.livewallpaper.egl.C32602s.mo83928a(int):com.ss.android.ugc.aweme.livewallpaper.egl.h");
    }

    public C32602s(int i, int i2, int i3, boolean z) {
        this.f85009a = i2;
        this.f85010b = i3;
        this.f85012d = i;
        this.f85013e = false;
        this.f85014f = new ArrayList();
        this.f85015g = new ArrayList();
    }
}
