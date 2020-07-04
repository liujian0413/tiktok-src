package com.p280ss.android.ugc.aweme.emoji.utils;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.f */
public final class C27635f {

    /* renamed from: a */
    public static final C27635f f72818a = new C27635f();

    private C27635f() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[SYNTHETIC, Splitter:B:16:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[SYNTHETIC, Splitter:B:22:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m90604a(java.io.File r4) {
        /*
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            java.lang.String r0 = ""
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            java.io.Reader r3 = (java.io.Reader) r3     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0040, all -> 0x0038 }
            java.lang.String r4 = r2.readLine()     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r1.<init>()     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
        L_0x001d:
            if (r4 == 0) goto L_0x0027
            r1.append(r4)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            java.lang.String r4 = r2.readLine()     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            goto L_0x001d
        L_0x0027:
            java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r1)     // Catch:{ Exception -> 0x0036, all -> 0x0034 }
            r2.close()     // Catch:{ Exception -> 0x0046 }
            goto L_0x0046
        L_0x0034:
            r4 = move-exception
            goto L_0x003a
        L_0x0036:
            r1 = r2
            goto L_0x0040
        L_0x0038:
            r4 = move-exception
            r2 = r1
        L_0x003a:
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            throw r4
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            r4 = r0
        L_0x0046:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.utils.C27635f.m90604a(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|(0)|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047 A[SYNTHETIC, Splitter:B:20:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[SYNTHETIC, Splitter:B:26:0x004d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized <T extends java.io.Serializable> java.util.List<T> m90605a(java.lang.String r5, java.lang.Class<T> r6) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.emoji.utils.f> r0 = com.p280ss.android.ugc.aweme.emoji.utils.C27635f.class
            monitor-enter(r0)
            java.lang.String r1 = "fileName"
            kotlin.jvm.internal.C7573i.m23587b(r5, r1)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "clazz"
            kotlin.jvm.internal.C7573i.m23587b(r6, r1)     // Catch:{ all -> 0x0052 }
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ all -> 0x0052 }
            java.io.File r5 = r1.getFileStreamPath(r5)     // Catch:{ all -> 0x0052 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004b, all -> 0x0044 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ Exception -> 0x004b, all -> 0x0044 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x004b, all -> 0x0044 }
            java.io.Reader r4 = (java.io.Reader) r4     // Catch:{ Exception -> 0x004b, all -> 0x0044 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x004b, all -> 0x0044 }
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
        L_0x002d:
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = com.p280ss.android.ugc.aweme.emoji.utils.C27639h.m90620a(r5, r6)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            r1.add(r5)     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x0042, all -> 0x003f }
            goto L_0x002d
        L_0x003b:
            r3.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0050
        L_0x003f:
            r5 = move-exception
            r2 = r3
            goto L_0x0045
        L_0x0042:
            r2 = r3
            goto L_0x004b
        L_0x0044:
            r5 = move-exception
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            throw r5     // Catch:{ all -> 0x0052 }
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r2.close()     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            monitor-exit(r0)
            return r1
        L_0x0052:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.utils.C27635f.m90605a(java.lang.String, java.lang.Class):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:30|(0)|38|39) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0059 A[SYNTHETIC, Splitter:B:36:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005f A[SYNTHETIC, Splitter:B:42:0x005f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized <T extends java.io.Serializable> boolean m90606a(java.lang.String r5, java.util.List<? extends T> r6) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.emoji.utils.f> r0 = com.p280ss.android.ugc.aweme.emoji.utils.C27635f.class
            monitor-enter(r0)
            java.lang.String r1 = "fileName"
            kotlin.jvm.internal.C7573i.m23587b(r5, r1)     // Catch:{ all -> 0x0064 }
            r1 = 0
            if (r6 != 0) goto L_0x000d
            monitor-exit(r0)
            return r1
        L_0x000d:
            android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ all -> 0x0064 }
            java.io.File r5 = r2.getFileStreamPath(r5)     // Catch:{ all -> 0x0064 }
            boolean r2 = r5.exists()     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0021
            r5.createNewFile()     // Catch:{ IOException -> 0x001f }
            goto L_0x0021
        L_0x001f:
            monitor-exit(r0)
            return r1
        L_0x0021:
            r2 = 0
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x005d, all -> 0x0055 }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x005d, all -> 0x0055 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x005d, all -> 0x0055 }
            java.io.Writer r4 = (java.io.Writer) r4     // Catch:{ Exception -> 0x005d, all -> 0x0055 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x005d, all -> 0x0055 }
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            r2 = 0
        L_0x0036:
            if (r2 >= r5) goto L_0x004c
            java.lang.Object r4 = r6.get(r2)     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            java.lang.String r4 = com.p280ss.android.ugc.aweme.emoji.utils.C27639h.m90621a(r4)     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            r3.write(r4)     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            r3.newLine()     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            r3.flush()     // Catch:{ Exception -> 0x0053, all -> 0x0051 }
            int r2 = r2 + 1
            goto L_0x0036
        L_0x004c:
            r3.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            r1 = 1
            goto L_0x0062
        L_0x0051:
            r5 = move-exception
            goto L_0x0057
        L_0x0053:
            r2 = r3
            goto L_0x005d
        L_0x0055:
            r5 = move-exception
            r3 = r2
        L_0x0057:
            if (r3 == 0) goto L_0x005c
            r3.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            throw r5     // Catch:{ all -> 0x0064 }
        L_0x005d:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            monitor-exit(r0)
            return r1
        L_0x0064:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.utils.C27635f.m90606a(java.lang.String, java.util.List):boolean");
    }
}
