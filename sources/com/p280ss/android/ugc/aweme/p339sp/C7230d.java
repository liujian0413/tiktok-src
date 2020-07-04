package com.p280ss.android.ugc.aweme.p339sp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.ugc.aweme.sp.d */
public final class C7230d implements SharedPreferences {

    /* renamed from: i */
    private static final Object f20215i = new Object();

    /* renamed from: a */
    public final String f20216a;

    /* renamed from: b */
    public final Object f20217b = new Object();

    /* renamed from: c */
    public final Object f20218c = new Object();

    /* renamed from: d */
    public Map<String, Object> f20219d;

    /* renamed from: e */
    public int f20220e = 0;

    /* renamed from: f */
    public boolean f20221f = false;

    /* renamed from: g */
    public final WeakHashMap<OnSharedPreferenceChangeListener, Object> f20222g = new WeakHashMap<>();

    /* renamed from: h */
    public long f20223h;

    /* renamed from: j */
    private final File f20224j;

    /* renamed from: k */
    private final File f20225k;

    /* renamed from: l */
    private long f20226l;

    /* renamed from: com.ss.android.ugc.aweme.sp.d$a */
    public final class C7233a implements Editor {

        /* renamed from: b */
        private final Object f20234b = new Object();

        /* renamed from: c */
        private final Map<String, Object> f20235c = new HashMap();

        /* renamed from: d */
        private boolean f20236d = false;

        public final Editor clear() {
            synchronized (this.f20234b) {
                this.f20236d = true;
            }
            return this;
        }

        public final boolean commit() {
            C7237b a = m22672a();
            C7230d.this.mo18906a(a, null, this, null, false);
            try {
                a.f20247e.await();
                mo18922a(a);
                return a.f20248f;
            } catch (InterruptedException unused) {
                return false;
            }
        }

        public final void apply() {
            List list;
            try {
                list = new ArrayList(this.f20235c.keySet());
            } catch (Exception unused) {
                list = Collections.emptyList();
            }
            List list2 = list;
            final C7237b a = m22672a();
            final C72341 r1 = new Runnable() {
                public final void run() {
                    try {
                        a.f20247e.await();
                    } catch (InterruptedException unused) {
                    }
                }
            };
            C7228c.m22658a(r1);
            C7230d.this.mo18906a(a, new Runnable() {
                public final void run() {
                    r1.run();
                    C7228c.m22662b(r1);
                }
            }, this, list2, true);
            mo18922a(a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.p280ss.android.ugc.aweme.p339sp.C7230d.C7237b m22672a() {
            /*
                r12 = this;
                com.ss.android.ugc.aweme.sp.d r0 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this
                java.lang.Object r0 = r0.f20217b
                monitor-enter(r0)
                com.ss.android.ugc.aweme.sp.d r1 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00f2 }
                int r1 = r1.f20220e     // Catch:{ all -> 0x00f2 }
                if (r1 <= 0) goto L_0x0018
                com.ss.android.ugc.aweme.sp.d r1 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00f2 }
                java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.d r3 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00f2 }
                java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f20219d     // Catch:{ all -> 0x00f2 }
                r2.<init>(r3)     // Catch:{ all -> 0x00f2 }
                r1.f20219d = r2     // Catch:{ all -> 0x00f2 }
            L_0x0018:
                com.ss.android.ugc.aweme.sp.d r1 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00f2 }
                java.util.Map<java.lang.String, java.lang.Object> r7 = r1.f20219d     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.d r1 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00f2 }
                int r2 = r1.f20220e     // Catch:{ all -> 0x00f2 }
                r3 = 1
                int r2 = r2 + r3
                r1.f20220e = r2     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.d r1 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00f2 }
                java.util.WeakHashMap<android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object> r1 = r1.f20222g     // Catch:{ all -> 0x00f2 }
                r2 = 0
                if (r1 == 0) goto L_0x0037
                com.ss.android.ugc.aweme.sp.d r1 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00f2 }
                java.util.WeakHashMap<android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object> r1 = r1.f20222g     // Catch:{ all -> 0x00f2 }
                int r1 = r1.size()     // Catch:{ all -> 0x00f2 }
                if (r1 <= 0) goto L_0x0037
                r1 = 1
                goto L_0x0038
            L_0x0037:
                r1 = 0
            L_0x0038:
                r4 = 0
                if (r1 == 0) goto L_0x0050
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00f2 }
                r4.<init>()     // Catch:{ all -> 0x00f2 }
                java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.d r6 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00f2 }
                java.util.WeakHashMap<android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object> r6 = r6.f20222g     // Catch:{ all -> 0x00f2 }
                java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x00f2 }
                r5.<init>(r6)     // Catch:{ all -> 0x00f2 }
                r6 = r5
                r5 = r4
                goto L_0x0052
            L_0x0050:
                r5 = r4
                r6 = r5
            L_0x0052:
                java.lang.Object r4 = r12.f20234b     // Catch:{ all -> 0x00f2 }
                monitor-enter(r4)     // Catch:{ all -> 0x00f2 }
                boolean r8 = r12.f20236d     // Catch:{ all -> 0x00ef }
                if (r8 == 0) goto L_0x0070
                com.ss.android.ugc.aweme.sp.d r8 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r8 = r8.f20219d     // Catch:{ all -> 0x00ef }
                boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x00ef }
                if (r8 != 0) goto L_0x006c
                com.ss.android.ugc.aweme.sp.d r8 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r8 = r8.f20219d     // Catch:{ all -> 0x00ef }
                r8.clear()     // Catch:{ all -> 0x00ef }
                r8 = 1
                goto L_0x006d
            L_0x006c:
                r8 = 0
            L_0x006d:
                r12.f20236d = r2     // Catch:{ all -> 0x00ef }
                r2 = r8
            L_0x0070:
                java.util.Map<java.lang.String, java.lang.Object> r8 = r12.f20235c     // Catch:{ all -> 0x00ef }
                java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00ef }
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00ef }
            L_0x007a:
                boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00ef }
                if (r9 == 0) goto L_0x00cf
                java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00ef }
                java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x00ef }
                java.lang.Object r10 = r9.getKey()     // Catch:{ all -> 0x00ef }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00ef }
                java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x00ef }
                if (r9 == r12) goto L_0x00b7
                if (r9 != 0) goto L_0x0095
                goto L_0x00b7
            L_0x0095:
                com.ss.android.ugc.aweme.sp.d r11 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r11 = r11.f20219d     // Catch:{ all -> 0x00ef }
                boolean r11 = r11.containsKey(r10)     // Catch:{ all -> 0x00ef }
                if (r11 == 0) goto L_0x00af
                com.ss.android.ugc.aweme.sp.d r11 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r11 = r11.f20219d     // Catch:{ all -> 0x00ef }
                java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x00ef }
                if (r11 == 0) goto L_0x00af
                boolean r11 = r11.equals(r9)     // Catch:{ all -> 0x00ef }
                if (r11 != 0) goto L_0x007a
            L_0x00af:
                com.ss.android.ugc.aweme.sp.d r2 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f20219d     // Catch:{ all -> 0x00ef }
                r2.put(r10, r9)     // Catch:{ all -> 0x00ef }
                goto L_0x00c8
            L_0x00b7:
                com.ss.android.ugc.aweme.sp.d r9 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r9 = r9.f20219d     // Catch:{ all -> 0x00ef }
                boolean r9 = r9.containsKey(r10)     // Catch:{ all -> 0x00ef }
                if (r9 == 0) goto L_0x007a
                com.ss.android.ugc.aweme.sp.d r2 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00ef }
                java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f20219d     // Catch:{ all -> 0x00ef }
                r2.remove(r10)     // Catch:{ all -> 0x00ef }
            L_0x00c8:
                if (r1 == 0) goto L_0x00cd
                r5.add(r10)     // Catch:{ all -> 0x00ef }
            L_0x00cd:
                r2 = 1
                goto L_0x007a
            L_0x00cf:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r12.f20235c     // Catch:{ all -> 0x00ef }
                r1.clear()     // Catch:{ all -> 0x00ef }
                if (r2 == 0) goto L_0x00df
                com.ss.android.ugc.aweme.sp.d r1 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00ef }
                long r2 = r1.f20223h     // Catch:{ all -> 0x00ef }
                r8 = 1
                long r2 = r2 + r8
                r1.f20223h = r2     // Catch:{ all -> 0x00ef }
            L_0x00df:
                com.ss.android.ugc.aweme.sp.d r1 = com.p280ss.android.ugc.aweme.p339sp.C7230d.this     // Catch:{ all -> 0x00ef }
                long r8 = r1.f20223h     // Catch:{ all -> 0x00ef }
                monitor-exit(r4)     // Catch:{ all -> 0x00ef }
                monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
                com.ss.android.ugc.aweme.sp.d$b r0 = new com.ss.android.ugc.aweme.sp.d$b
                r1 = 0
                r2 = r0
                r3 = r8
                r8 = r1
                r2.<init>(r3, r5, r6, r7)
                return r0
            L_0x00ef:
                r1 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x00ef }
                throw r1     // Catch:{ all -> 0x00f2 }
            L_0x00f2:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p339sp.C7230d.C7233a.m22672a():com.ss.android.ugc.aweme.sp.d$b");
        }

        public final Editor remove(String str) {
            synchronized (this.f20234b) {
                this.f20235c.put(str, this);
            }
            return this;
        }

        public C7233a() {
        }

        /* renamed from: a */
        public final void mo18922a(final C7237b bVar) {
            if (bVar.f20245c != null && bVar.f20244b != null && bVar.f20244b.size() != 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    for (int size = bVar.f20244b.size() - 1; size >= 0; size--) {
                        String str = (String) bVar.f20244b.get(size);
                        for (OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : bVar.f20245c) {
                            if (onSharedPreferenceChangeListener != null) {
                                onSharedPreferenceChangeListener.onSharedPreferenceChanged(C7230d.this, str);
                            }
                        }
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C7233a.this.mo18922a(bVar);
                    }
                });
            }
        }

        public final Editor putBoolean(String str, boolean z) {
            synchronized (this.f20234b) {
                this.f20235c.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        public final Editor putFloat(String str, float f) {
            synchronized (this.f20234b) {
                this.f20235c.put(str, Float.valueOf(f));
            }
            return this;
        }

        public final Editor putInt(String str, int i) {
            synchronized (this.f20234b) {
                this.f20235c.put(str, Integer.valueOf(i));
            }
            return this;
        }

        public final Editor putLong(String str, long j) {
            synchronized (this.f20234b) {
                this.f20235c.put(str, Long.valueOf(j));
            }
            return this;
        }

        public final Editor putString(String str, String str2) {
            synchronized (this.f20234b) {
                this.f20235c.put(str, str2);
                if (str2 != null && str2.length() > 500) {
                    C7239f.m22678a(C7230d.this.f20216a, str, str2);
                }
            }
            return this;
        }

        public final Editor putStringSet(String str, Set<String> set) {
            Object obj;
            synchronized (this.f20234b) {
                Map<String, Object> map = this.f20235c;
                if (set == null) {
                    obj = null;
                } else {
                    obj = new HashSet(set);
                }
                map.put(str, obj);
            }
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sp.d$b */
    static class C7237b {

        /* renamed from: a */
        final long f20243a;

        /* renamed from: b */
        final List<String> f20244b;

        /* renamed from: c */
        final Set<OnSharedPreferenceChangeListener> f20245c;

        /* renamed from: d */
        final Map<String, Object> f20246d;

        /* renamed from: e */
        final CountDownLatch f20247e;

        /* renamed from: f */
        volatile boolean f20248f;

        /* renamed from: g */
        boolean f20249g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo18936a(boolean z, boolean z2) {
            this.f20249g = z;
            this.f20248f = z2;
            this.f20247e.countDown();
        }

        private C7237b(long j, List<String> list, Set<OnSharedPreferenceChangeListener> set, Map<String, Object> map) {
            this.f20247e = new CountDownLatch(1);
            this.f20248f = false;
            this.f20249g = false;
            this.f20243a = j;
            this.f20244b = list;
            this.f20245c = set;
            this.f20246d = map;
        }
    }

    /* renamed from: d */
    private void m22667d() {
        C7238e.m22675a(this);
    }

    public final Editor edit() {
        synchronized (this.f20217b) {
            m22667d();
        }
        return new C7233a();
    }

    /* renamed from: c */
    private void m22666c() {
        synchronized (this.f20217b) {
            this.f20221f = false;
        }
        new Thread("SharedPreferencesImpl-load") {
            public final void run() {
                C7230d.this.mo18905a();
            }
        }.start();
    }

    public final Map<String, ?> getAll() {
        HashMap hashMap;
        synchronized (this.f20217b) {
            m22667d();
            hashMap = new HashMap(this.f20219d);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void mo18908b() {
        if (!this.f20221f) {
            BlockGuard.m22649a();
        }
        while (!this.f20221f) {
            try {
                this.f20217b.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: used method not loaded: com.ss.android.ugc.aweme.sp.f.a(java.lang.String, long, long):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|(0)|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r6.f20224j.canRead() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = new java.io.BufferedInputStream(new java.io.FileInputStream(r6.f20224j), 16384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4 = com.p280ss.android.ugc.aweme.p339sp.C7242i.m22681a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r3 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        if (r3 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r6.f20221f = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0058, code lost:
        if (r2 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005a, code lost:
        r6.f20219d = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005d, code lost:
        r6.f20219d = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0064, code lost:
        r6.f20217b.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0079, code lost:
        com.p280ss.android.ugc.aweme.p339sp.C7239f.m22676a(r6.f20216a, r0, r6.f20224j.length());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x004b */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0048 A[SYNTHETIC, Splitter:B:27:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004f A[SYNTHETIC, Splitter:B:35:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18905a() {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = r6.f20217b
            monitor-enter(r2)
            boolean r3 = r6.f20221f     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0088 }
            return
        L_0x000d:
            java.io.File r3 = r6.f20225k     // Catch:{ all -> 0x0088 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0021
            java.io.File r3 = r6.f20224j     // Catch:{ all -> 0x0088 }
            r3.delete()     // Catch:{ all -> 0x0088 }
            java.io.File r3 = r6.f20225k     // Catch:{ all -> 0x0088 }
            java.io.File r4 = r6.f20224j     // Catch:{ all -> 0x0088 }
            r3.renameTo(r4)     // Catch:{ all -> 0x0088 }
        L_0x0021:
            monitor-exit(r2)     // Catch:{ all -> 0x0088 }
            r2 = 0
            java.io.File r3 = r6.f20224j     // Catch:{  }
            boolean r3 = r3.canRead()     // Catch:{  }
            if (r3 == 0) goto L_0x0052
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            java.io.File r5 = r6.f20224j     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            r5 = 16384(0x4000, float:2.2959E-41)
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x004c, all -> 0x0044 }
            java.util.HashMap r4 = com.p280ss.android.ugc.aweme.p339sp.C7242i.m22681a(r3)     // Catch:{ Exception -> 0x004d, all -> 0x0042 }
            r3.close()     // Catch:{ IOException | Exception -> 0x0040 }
        L_0x0040:
            r2 = r4
            goto L_0x0052
        L_0x0042:
            r4 = move-exception
            goto L_0x0046
        L_0x0044:
            r4 = move-exception
            r3 = r2
        L_0x0046:
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            throw r4     // Catch:{  }
        L_0x004c:
            r3 = r2
        L_0x004d:
            if (r3 == 0) goto L_0x0052
            r3.close()     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            java.lang.Object r3 = r6.f20217b
            monitor-enter(r3)
            r4 = 1
            r6.f20221f = r4     // Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x005d
            r6.f20219d = r2     // Catch:{ all -> 0x0085 }
            goto L_0x0064
        L_0x005d:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0085 }
            r2.<init>()     // Catch:{ all -> 0x0085 }
            r6.f20219d = r2     // Catch:{ all -> 0x0085 }
        L_0x0064:
            java.lang.Object r2 = r6.f20217b     // Catch:{ all -> 0x0085 }
            r2.notifyAll()     // Catch:{ all -> 0x0085 }
            monitor-exit(r3)     // Catch:{ all -> 0x0085 }
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            long r0 = java.lang.Math.abs(r2)
            r2 = 400(0x190, double:1.976E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0084
            java.lang.String r2 = r6.f20216a
            java.io.File r3 = r6.f20224j
            long r3 = r3.length()
            com.p280ss.android.ugc.aweme.p339sp.C7239f.m22676a(r2, r0, r3)
        L_0x0084:
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0085 }
            throw r0
        L_0x0088:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0088 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p339sp.C7230d.mo18905a():void");
    }

    public final void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f20217b) {
            this.f20222g.put(onSharedPreferenceChangeListener, f20215i);
        }
    }

    public final void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f20217b) {
            this.f20222g.remove(onSharedPreferenceChangeListener);
        }
    }

    /* renamed from: a */
    private static File m22664a(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        return new File(sb.toString());
    }

    /* renamed from: b */
    private static FileOutputStream m22665b(File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdir()) {
                return null;
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused2) {
                fileOutputStream = null;
            }
        }
        return fileOutputStream;
    }

    public final boolean contains(String str) {
        boolean containsKey;
        synchronized (this.f20217b) {
            m22667d();
            containsKey = this.f20219d.containsKey(str);
        }
        return containsKey;
    }

    public final boolean getBoolean(String str, boolean z) {
        Boolean bool;
        synchronized (this.f20217b) {
            m22667d();
            try {
                bool = (Boolean) this.f20219d.get(str);
            } catch (ClassCastException unused) {
                bool = null;
            }
            if (bool != null) {
                z = bool.booleanValue();
            }
        }
        return z;
    }

    public final float getFloat(String str, float f) {
        Float f2;
        synchronized (this.f20217b) {
            m22667d();
            try {
                f2 = (Float) this.f20219d.get(str);
            } catch (ClassCastException unused) {
                f2 = null;
            }
            if (f2 != null) {
                f = f2.floatValue();
            }
        }
        return f;
    }

    public final int getInt(String str, int i) {
        Integer num;
        synchronized (this.f20217b) {
            m22667d();
            try {
                num = (Integer) this.f20219d.get(str);
            } catch (ClassCastException unused) {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    public final long getLong(String str, long j) {
        Long l;
        synchronized (this.f20217b) {
            m22667d();
            try {
                l = (Long) this.f20219d.get(str);
            } catch (ClassCastException unused) {
                l = null;
            }
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    public final String getString(String str, String str2) {
        String str3;
        synchronized (this.f20217b) {
            m22667d();
            try {
                str3 = (String) this.f20219d.get(str);
            } catch (Exception unused) {
                str3 = null;
            }
            if (str3 == null) {
                str3 = str2;
            }
        }
        return str3;
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        synchronized (this.f20217b) {
            m22667d();
            try {
                set2 = (Set) this.f20219d.get(str);
            } catch (ClassCastException unused) {
                set2 = null;
            }
            if (set2 == null) {
                set2 = set;
            }
        }
        return set2;
    }

    public C7230d(String str, File file) {
        this.f20224j = file;
        this.f20216a = str;
        this.f20225k = m22664a(this.f20224j);
        this.f20221f = false;
        this.f20219d = null;
        m22666c();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0069 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18907a(com.p280ss.android.ugc.aweme.p339sp.C7230d.C7237b r8, boolean r9) {
        /*
            r7 = this;
            java.io.File r0 = r7.f20224j
            boolean r0 = r0.exists()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x004b
            long r3 = r7.f20226l
            long r5 = r8.f20243a
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            if (r9 == 0) goto L_0x0016
            r0 = 1
            goto L_0x002a
        L_0x0016:
            java.lang.Object r9 = r7.f20217b
            monitor-enter(r9)
            long r3 = r7.f20223h     // Catch:{ all -> 0x0026 }
            long r5 = r8.f20243a     // Catch:{ all -> 0x0026 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            monitor-exit(r9)     // Catch:{ all -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r8 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0026 }
            throw r8
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != 0) goto L_0x0030
            r8.mo18936a(r2, r1)
            return
        L_0x0030:
            java.io.File r9 = r7.f20225k
            boolean r9 = r9.exists()
            if (r9 != 0) goto L_0x0046
            java.io.File r9 = r7.f20224j
            java.io.File r0 = r7.f20225k
            boolean r9 = r9.renameTo(r0)
            if (r9 != 0) goto L_0x004b
            r8.mo18936a(r2, r2)
            return
        L_0x0046:
            java.io.File r9 = r7.f20224j
            r9.delete()
        L_0x004b:
            java.io.File r9 = r7.f20224j     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            java.io.FileOutputStream r9 = m22665b(r9)     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            if (r9 != 0) goto L_0x0057
            r8.mo18936a(r2, r2)     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            return
        L_0x0057:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f20246d     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            com.p280ss.android.ugc.aweme.p339sp.C7242i.m22685a(r0, r9)     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            boolean r0 = com.p280ss.android.ugc.aweme.p339sp.C7228c.m22660a()     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            if (r0 != 0) goto L_0x0069
            java.io.FileDescriptor r0 = r9.getFD()     // Catch:{ Exception -> 0x0069 }
            r0.sync()     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            r9.close()     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            java.io.File r9 = r7.f20225k     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            r9.delete()     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            long r3 = r8.f20243a     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            r7.f20226l = r3     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            r8.mo18936a(r1, r1)     // Catch:{ IOException -> 0x007f, XmlPullParserException -> 0x0079 }
            return
        L_0x0079:
            java.io.File r9 = r7.f20224j
            r9.delete()
            goto L_0x0084
        L_0x007f:
            java.io.File r9 = r7.f20224j
            r9.delete()
        L_0x0084:
            r8.mo18936a(r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p339sp.C7230d.mo18907a(com.ss.android.ugc.aweme.sp.d$b, boolean):void");
    }

    /* renamed from: a */
    public final void mo18906a(C7237b bVar, Runnable runnable, C7233a aVar, List<String> list, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (runnable == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        final C7237b bVar2 = bVar;
        final boolean z4 = z2;
        final Runnable runnable2 = runnable;
        final List<String> list2 = list;
        C72322 r0 = new Runnable() {
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (C7230d.this.f20218c) {
                    C7230d.this.mo18907a(bVar2, z4);
                }
                synchronized (C7230d.this.f20217b) {
                    C7230d.this.f20220e--;
                }
                if (runnable2 != null) {
                    runnable2.run();
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 > 100) {
                    C7239f.m22677a(C7230d.this.f20216a, currentTimeMillis2, list2);
                }
            }
        };
        if (z2) {
            synchronized (this.f20217b) {
                if (this.f20220e == 1) {
                    z3 = true;
                }
            }
            if (z3) {
                r0.run();
                return;
            }
        }
        C7228c.m22659a(r0, !z2);
    }
}
