package com.p280ss.android.ugc.graph;

import com.p280ss.android.ugc.graph.C7289f.C7292c;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.ss.android.ugc.graph.e */
public final class C44840e implements C7292c {

    /* renamed from: a */
    private Map<Class, Method> f115330a;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m141509a(java.lang.Object r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r5.f115330a     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x000f
            java.util.Map<java.lang.Class, java.lang.reflect.Method> r0 = r5.f115330a     // Catch:{ all -> 0x003b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r5)
            return
        L_0x000f:
            java.lang.Class r6 = r6.getClass()     // Catch:{ Exception -> 0x0039 }
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()     // Catch:{ Exception -> 0x0039 }
            if (r6 == 0) goto L_0x0037
            int r0 = r6.length     // Catch:{ Exception -> 0x0039 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0037
        L_0x001d:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Exception -> 0x0039 }
            int r1 = r6.length     // Catch:{ Exception -> 0x0039 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0039 }
            int r1 = r6.length     // Catch:{ Exception -> 0x0039 }
            r2 = 0
        L_0x0025:
            if (r2 >= r1) goto L_0x0033
            r3 = r6[r2]     // Catch:{ Exception -> 0x0039 }
            java.lang.Class r4 = r3.getReturnType()     // Catch:{ Exception -> 0x0039 }
            r0.put(r4, r3)     // Catch:{ Exception -> 0x0039 }
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0033:
            r5.f115330a = r0     // Catch:{ Exception -> 0x0039 }
            monitor-exit(r5)
            return
        L_0x0037:
            monitor-exit(r5)
            return
        L_0x0039:
            monitor-exit(r5)
            return
        L_0x003b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.graph.C44840e.m141509a(java.lang.Object):void");
    }

    /* renamed from: a */
    public final <T> T mo19025a(Object obj, Class<T> cls) {
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        T a = C44837d.m141504a().mo107274a(obj, cls);
        if (a != null) {
            return a;
        }
        if (this.f115330a == null || this.f115330a.isEmpty()) {
            m141509a(obj);
        }
        if (this.f115330a == null || this.f115330a.isEmpty()) {
            return null;
        }
        try {
            Method method = (Method) this.f115330a.get(cls);
            if (method == null) {
                return null;
            }
            return method.invoke(obj, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
