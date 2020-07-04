package com.bytedance.polaris.p634b;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.polaris.depend.C12428i;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.polaris.b.f */
public final class C12349f {

    /* renamed from: b */
    static Runnable f32783b = new Runnable() {
        public final void run() {
            C12349f a = C12349f.m35867a();
            while (true) {
                try {
                    String b = a.mo30189b();
                    if (!TextUtils.isEmpty(b)) {
                        if (C12370u.m35938d(b)) {
                            if (C12428i.m36159i() == null) {
                                break;
                            }
                            String substring = b.substring(b.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR) + 1);
                            C12340a aVar = new C12340a(C12428i.m36153c());
                            String a2 = C6306c.m19561a(b);
                            String b2 = aVar.mo30183b(a2, substring);
                            String a3 = C12340a.m35833a(a2, substring);
                            String a4 = aVar.mo30182a(a3);
                            if (C12340a.m35834a() && !new File(b2).isFile() && C12428i.m36159i() != null) {
                                C12428i.m36159i().mo30322a(b, 5120000, a4, a3);
                            }
                            a.mo30190b(b);
                        }
                    } else {
                        break;
                    }
                } catch (Throwable unused) {
                }
            }
            a.f32785a = false;
        }
    };

    /* renamed from: c */
    private static final C12369t<C12349f> f32784c = new C12369t<C12349f>() {
        /* renamed from: c */
        private static C12349f m35874c() {
            return new C12349f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo30173a() {
            return m35874c();
        }
    };

    /* renamed from: a */
    public volatile boolean f32785a;

    /* renamed from: d */
    private List<String> f32786d = new ArrayList();

    /* renamed from: a */
    public static C12349f m35867a() {
        return (C12349f) f32784c.mo30198b();
    }

    /* renamed from: c */
    private void m35869c() {
        if (!this.f32785a) {
            C6304f.submitRunnable(f32783b);
            this.f32785a = true;
        }
    }

    /* renamed from: b */
    public final synchronized String mo30189b() {
        if (this.f32786d != null) {
            if (!this.f32786d.isEmpty()) {
                return (String) this.f32786d.get(0);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo30187a(List<String> list) {
        m35868b(list);
        m35869c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m35868b(java.util.List<java.lang.String> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002d
            int r0 = r3.size()     // Catch:{ all -> 0x002a }
            if (r0 > 0) goto L_0x000a
            goto L_0x002d
        L_0x000a:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002a }
        L_0x000e:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x002a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x002a }
            java.util.List<java.lang.String> r1 = r2.f32786d     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x000e
            java.util.List<java.lang.String> r1 = r2.f32786d     // Catch:{ all -> 0x002a }
            r1.add(r0)     // Catch:{ all -> 0x002a }
            goto L_0x000e
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002d:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p634b.C12349f.m35868b(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo30188a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0021 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)
            return r1
        L_0x000a:
            java.util.List<java.lang.String> r0 = r2.f32786d     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            java.util.List<java.lang.String> r0 = r2.f32786d     // Catch:{ all -> 0x0021 }
            int r0 = r0.size()     // Catch:{ all -> 0x0021 }
            if (r0 > 0) goto L_0x0017
            goto L_0x001f
        L_0x0017:
            java.util.List<java.lang.String> r0 = r2.f32786d     // Catch:{ all -> 0x0021 }
            boolean r3 = r0.contains(r3)     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)
            return r3
        L_0x001f:
            monitor-exit(r2)
            return r1
        L_0x0021:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.p634b.C12349f.mo30188a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final synchronized void mo30190b(String str) {
        if (this.f32786d != null) {
            this.f32786d.remove(str);
        }
    }
}
