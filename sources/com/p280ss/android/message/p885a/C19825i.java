package com.p280ss.android.message.p885a;

/* renamed from: com.ss.android.message.a.i */
final class C19825i {

    /* renamed from: a */
    private Object f53790a;

    C19825i() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(3:7|8|9)|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0017 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m65463a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f53790a
            if (r0 != 0) goto L_0x001c
            java.lang.Class<com.ss.android.message.a.h> r0 = com.p280ss.android.message.p885a.C19824h.class
            monitor-enter(r0)
            java.lang.Object r1 = r2.f53790a     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x0017 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x0017 }
            r2.f53790a = r1     // Catch:{ Throwable -> 0x0017 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        L_0x001c:
            java.lang.Object r0 = r2.f53790a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.p885a.C19825i.m65463a():java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r0 = m65463a();
        r8 = (java.lang.String) r0.getClass().getMethod("get", new java.lang.Class[]{java.lang.String.class}).invoke(r0, new java.lang.Object[]{r8});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        r8 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo53171a(java.lang.String r8) throws java.lang.IllegalArgumentException {
        /*
            r7 = this;
            java.lang.String r0 = android.os.SystemProperties.get(r8)     // Catch:{ Throwable -> 0x0005 }
            return r0
        L_0x0005:
            java.lang.Object r0 = r7.m65463a()     // Catch:{ IllegalArgumentException -> 0x0029, Throwable -> 0x0026 }
            java.lang.Class r1 = r0.getClass()     // Catch:{ IllegalArgumentException -> 0x0029, Throwable -> 0x0026 }
            java.lang.String r2 = "get"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ IllegalArgumentException -> 0x0029, Throwable -> 0x0026 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch:{ IllegalArgumentException -> 0x0029, Throwable -> 0x0026 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ IllegalArgumentException -> 0x0029, Throwable -> 0x0026 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x0029, Throwable -> 0x0026 }
            r2[r6] = r8     // Catch:{ IllegalArgumentException -> 0x0029, Throwable -> 0x0026 }
            java.lang.Object r8 = r1.invoke(r0, r2)     // Catch:{ IllegalArgumentException -> 0x0029, Throwable -> 0x0026 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalArgumentException -> 0x0029, Throwable -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            java.lang.String r8 = ""
        L_0x0028:
            return r8
        L_0x0029:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.p885a.C19825i.mo53171a(java.lang.String):java.lang.String");
    }
}
