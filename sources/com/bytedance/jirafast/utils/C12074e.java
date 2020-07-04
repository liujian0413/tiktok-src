package com.bytedance.jirafast.utils;

/* renamed from: com.bytedance.jirafast.utils.e */
public final class C12074e {
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(0)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031 A[SYNTHETIC, Splitter:B:19:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC, Splitter:B:25:0x0037] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List<java.lang.String> m35222a(java.lang.String r5) {
        /*
            java.lang.Class<com.bytedance.jirafast.utils.e> r0 = com.bytedance.jirafast.utils.C12074e.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x003c }
            r1.<init>()     // Catch:{ all -> 0x003c }
            android.content.Context r2 = com.bytedance.jirafast.C11999a.m35070a()     // Catch:{ all -> 0x003c }
            java.io.File r5 = r2.getFileStreamPath(r5)     // Catch:{ all -> 0x003c }
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0035, all -> 0x002e }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x0035, all -> 0x002e }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0035, all -> 0x002e }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0035, all -> 0x002e }
        L_0x001b:
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r5 == 0) goto L_0x0025
            r1.add(r5)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            goto L_0x001b
        L_0x0025:
            r3.close()     // Catch:{ Exception -> 0x003a }
            goto L_0x003a
        L_0x0029:
            r5 = move-exception
            r2 = r3
            goto L_0x002f
        L_0x002c:
            r2 = r3
            goto L_0x0035
        L_0x002e:
            r5 = move-exception
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            throw r5     // Catch:{ all -> 0x003c }
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            monitor-exit(r0)
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12074e.m35222a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(0)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC, Splitter:B:19:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003d A[SYNTHETIC, Splitter:B:25:0x003d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized <T extends java.io.Serializable> java.util.List<T> m35224b(java.lang.String r5) {
        /*
            java.lang.Class<com.bytedance.jirafast.utils.e> r0 = com.bytedance.jirafast.utils.C12074e.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0042 }
            r1.<init>()     // Catch:{ all -> 0x0042 }
            android.content.Context r2 = com.bytedance.jirafast.C11999a.m35070a()     // Catch:{ all -> 0x0042 }
            java.io.File r5 = r2.getFileStreamPath(r5)     // Catch:{ all -> 0x0042 }
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003b, all -> 0x0034 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x003b, all -> 0x0034 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x003b, all -> 0x0034 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x003b, all -> 0x0034 }
        L_0x001b:
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            if (r5 == 0) goto L_0x002b
            java.lang.Object r5 = com.bytedance.jirafast.utils.C12080j.m35236a(r5)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            java.io.Serializable r5 = (java.io.Serializable) r5     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            r1.add(r5)     // Catch:{ Exception -> 0x0032, all -> 0x002f }
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ Exception -> 0x0040 }
            goto L_0x0040
        L_0x002f:
            r5 = move-exception
            r2 = r3
            goto L_0x0035
        L_0x0032:
            r2 = r3
            goto L_0x003b
        L_0x0034:
            r5 = move-exception
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            throw r5     // Catch:{ all -> 0x0042 }
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            monitor-exit(r0)
            return r1
        L_0x0042:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12074e.m35224b(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|(0)|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0052 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004f A[SYNTHETIC, Splitter:B:33:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0055 A[SYNTHETIC, Splitter:B:39:0x0055] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized <T extends java.io.Serializable> boolean m35223a(java.lang.String r5, java.util.List<T> r6) {
        /*
            java.lang.Class<com.bytedance.jirafast.utils.e> r0 = com.bytedance.jirafast.utils.C12074e.class
            monitor-enter(r0)
            r1 = 0
            if (r6 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            android.content.Context r2 = com.bytedance.jirafast.C11999a.m35070a()     // Catch:{ all -> 0x005a }
            java.io.File r5 = r2.getFileStreamPath(r5)     // Catch:{ all -> 0x005a }
            boolean r2 = r5.exists()     // Catch:{ all -> 0x005a }
            if (r2 != 0) goto L_0x001c
            r5.createNewFile()     // Catch:{ IOException -> 0x001a }
            goto L_0x001c
        L_0x001a:
            monitor-exit(r0)
            return r1
        L_0x001c:
            r2 = 0
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0053, all -> 0x004b }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x0053, all -> 0x004b }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0053, all -> 0x004b }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0053, all -> 0x004b }
            r5 = 0
        L_0x0028:
            int r2 = r6.size()     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            if (r5 >= r2) goto L_0x0042
            java.lang.Object r2 = r6.get(r5)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            java.lang.String r2 = com.bytedance.jirafast.utils.C12080j.m35237a(r2)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            r3.write(r2)     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            r3.newLine()     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            r3.flush()     // Catch:{ Exception -> 0x0049, all -> 0x0047 }
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0042:
            r3.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            r1 = 1
            goto L_0x0058
        L_0x0047:
            r5 = move-exception
            goto L_0x004d
        L_0x0049:
            r2 = r3
            goto L_0x0053
        L_0x004b:
            r5 = move-exception
            r3 = r2
        L_0x004d:
            if (r3 == 0) goto L_0x0052
            r3.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            throw r5     // Catch:{ all -> 0x005a }
        L_0x0053:
            if (r2 == 0) goto L_0x0058
            r2.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            monitor-exit(r0)
            return r1
        L_0x005a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12074e.m35223a(java.lang.String, java.util.List):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|(0)|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0050 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004d A[SYNTHETIC, Splitter:B:33:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0053 A[SYNTHETIC, Splitter:B:39:0x0053] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m35225b(java.lang.String r5, java.util.List<java.lang.String> r6) {
        /*
            java.lang.Class<com.bytedance.jirafast.utils.e> r0 = com.bytedance.jirafast.utils.C12074e.class
            monitor-enter(r0)
            r1 = 0
            if (r6 != 0) goto L_0x0008
            monitor-exit(r0)
            return r1
        L_0x0008:
            android.content.Context r2 = com.bytedance.jirafast.C11999a.m35070a()     // Catch:{ all -> 0x0058 }
            java.io.File r5 = r2.getFileStreamPath(r5)     // Catch:{ all -> 0x0058 }
            boolean r2 = r5.exists()     // Catch:{ all -> 0x0058 }
            if (r2 != 0) goto L_0x001c
            r5.createNewFile()     // Catch:{ IOException -> 0x001a }
            goto L_0x001c
        L_0x001a:
            monitor-exit(r0)
            return r1
        L_0x001c:
            r2 = 0
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0051, all -> 0x0049 }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x0051, all -> 0x0049 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0051, all -> 0x0049 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0051, all -> 0x0049 }
            r5 = 0
        L_0x0028:
            int r2 = r6.size()     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            if (r5 >= r2) goto L_0x0040
            java.lang.Object r2 = r6.get(r5)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r3.write(r2)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r3.newLine()     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r3.flush()     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0040:
            r3.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            r1 = 1
            goto L_0x0056
        L_0x0045:
            r5 = move-exception
            goto L_0x004b
        L_0x0047:
            r2 = r3
            goto L_0x0051
        L_0x0049:
            r5 = move-exception
            r3 = r2
        L_0x004b:
            if (r3 == 0) goto L_0x0050
            r3.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r5     // Catch:{ all -> 0x0058 }
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            monitor-exit(r0)
            return r1
        L_0x0058:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.utils.C12074e.m35225b(java.lang.String, java.util.List):boolean");
    }
}
