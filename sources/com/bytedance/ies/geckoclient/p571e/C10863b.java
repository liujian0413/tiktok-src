package com.bytedance.ies.geckoclient.p571e;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.ies.geckoclient.C10851d;
import com.bytedance.ies.geckoclient.model.C10898b.C10900b;
import com.bytedance.p505d.p506a.C10031a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.e.b */
public final class C10863b {

    /* renamed from: com.bytedance.ies.geckoclient.e.b$a */
    static class C10865a {

        /* renamed from: a */
        String f29395a;

        /* renamed from: b */
        String f29396b;

        /* renamed from: c */
        int f29397c;

        /* renamed from: d */
        int f29398d;

        /* renamed from: e */
        File f29399e;

        /* renamed from: f */
        File f29400f;

        public C10865a(String str, String str2, int i, int i2, File file, File file2) {
            this.f29395a = str;
            this.f29396b = str2;
            this.f29397c = i;
            this.f29398d = i2;
            this.f29399e = file;
            this.f29400f = file2;
        }
    }

    /* renamed from: a */
    private static List<String> m31869a(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("name")));
            } catch (Exception unused) {
            } catch (Throwable th) {
                C10031a.m29804a(rawQuery);
                throw th;
            }
        }
        C10031a.m29804a(rawQuery);
        return arrayList;
    }

    /* renamed from: a */
    public static void m31870a(Context context, List<C10865a> list) {
        String str;
        String str2;
        if (list != null && !list.isEmpty()) {
            for (C10865a aVar : list) {
                File file = aVar.f29399e;
                File file2 = aVar.f29400f;
                long currentTimeMillis = System.currentTimeMillis();
                boolean b = C10851d.m31823b(file);
                boolean a = C10851d.m31821a(file2);
                long currentTimeMillis2 = System.currentTimeMillis();
                if (!b || !a) {
                    C10866c a2 = C10866c.m31876a(context);
                    String str3 = aVar.f29395a;
                    String str4 = aVar.f29396b;
                    int i = aVar.f29397c;
                    int i2 = aVar.f29398d;
                    StringBuilder sb = new StringBuilder();
                    if (b) {
                        str = "";
                    } else {
                        str = "zip包删除失败";
                    }
                    sb.append(str);
                    if (a) {
                        str2 = "";
                    } else {
                        str2 = " 解压文件删除失败";
                    }
                    sb.append(str2);
                    a2.mo26196a(str3, str4, i, 201, i2, 601, sb.toString(), currentTimeMillis2 - currentTimeMillis, 1);
                } else {
                    C10866c.m31876a(context).mo26196a(aVar.f29395a, aVar.f29396b, aVar.f29397c, C34943c.f91127w, aVar.f29398d, 0, null, currentTimeMillis2 - currentTimeMillis, 1);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m31871a(final Context context, Map<String, C10900b> map, File file) {
        final List list;
        try {
            list = m31874b(context, map, file);
        } catch (Exception unused) {
            list = null;
        }
        if (list != null) {
            C10872h.m31897a().mo26206a(new Runnable() {
                public final void run() {
                    try {
                        C10863b.m31870a(context, list);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0118, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        com.bytedance.p505d.p506a.C10031a.m29804a(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012f, code lost:
        if (r19 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013f, code lost:
        if (r19 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0141, code lost:
        r19.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0144, code lost:
        return r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0118 A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:36:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0139  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.bytedance.ies.geckoclient.p571e.C10863b.C10865a> m31874b(android.content.Context r24, java.util.Map<java.lang.String, com.bytedance.ies.geckoclient.model.C10898b.C10900b> r25, java.io.File r26) {
        /*
            r0 = r26
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r24 == 0) goto L_0x0145
            if (r25 == 0) goto L_0x0145
            boolean r3 = r25.isEmpty()
            if (r3 != 0) goto L_0x0145
            if (r0 != 0) goto L_0x0015
            goto L_0x0145
        L_0x0015:
            r10 = 0
            com.bytedance.d.a.b r1 = com.bytedance.p505d.p506a.C10032b.m29806a(r24)     // Catch:{ Exception -> 0x013d, all -> 0x0134 }
            android.database.sqlite.SQLiteDatabase r19 = r1.getWritableDatabase()     // Catch:{ Exception -> 0x013d, all -> 0x0134 }
            r19.beginTransaction()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.util.List r20 = m31869a(r19)     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.util.Set r1 = r25.entrySet()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.util.Iterator r21 = r1.iterator()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
        L_0x002d:
            boolean r1 = r21.hasNext()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r1 == 0) goto L_0x012c
            java.lang.Object r1 = r21.next()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            r7.<init>(r0, r8)     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            boolean r2 = r7.isDirectory()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            com.bytedance.ies.geckoclient.model.b$b r1 = (com.bytedance.ies.geckoclient.model.C10898b.C10900b) r1     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r1 == 0) goto L_0x002d
            java.util.List<com.bytedance.ies.geckoclient.model.b$a> r1 = r1.f29497a     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r1 == 0) goto L_0x002d
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r2 != 0) goto L_0x002d
            java.util.Iterator r2 = r20.iterator()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
        L_0x0061:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            boolean r4 = r3.endsWith(r8)     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r4 == 0) goto L_0x0061
            r22 = r3
            goto L_0x0078
        L_0x0076:
            r22 = r10
        L_0x0078:
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            r6.<init>()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.util.Iterator r23 = r1.iterator()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
        L_0x0081:
            boolean r1 = r23.hasNext()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r23.next()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            com.bytedance.ies.geckoclient.model.b$a r1 = (com.bytedance.ies.geckoclient.model.C10898b.C10899a) r1     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r1 == 0) goto L_0x0081
            java.lang.String r4 = r1.f29490a     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            boolean r2 = r6.contains(r4)     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r2 != 0) goto L_0x0081
            r6.add(r4)     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            int r5 = r1.f29491b     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.util.List<java.lang.Integer> r3 = r1.f29492c     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            r1 = 2
            java.lang.String[] r13 = new java.lang.String[r1]     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.lang.String r1 = "version"
            r2 = 0
            r13[r2] = r1     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.lang.String r1 = "zip"
            r11 = 1
            r13[r11] = r1     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            java.lang.String r14 = "channel=?"
            java.lang.String[] r15 = new java.lang.String[r11]     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            r15[r2] = r4     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            r16 = 0
            r17 = 0
            r18 = 0
            r11 = r19
            r12 = r22
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            boolean r1 = r11.moveToNext()     // Catch:{ Exception -> 0x011d, all -> 0x0118 }
            if (r1 != 0) goto L_0x00c9
            com.bytedance.p505d.p506a.C10031a.m29804a(r11)     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            goto L_0x0081
        L_0x00c9:
            java.lang.String r1 = "version"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x011d, all -> 0x0118 }
            int r12 = r11.getInt(r1)     // Catch:{ Exception -> 0x011d, all -> 0x0118 }
            java.lang.String r1 = "zip"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x011d, all -> 0x0118 }
            java.lang.String r13 = r11.getString(r1)     // Catch:{ Exception -> 0x011d, all -> 0x0118 }
            switch(r5) {
                case 1: goto L_0x0106;
                case 2: goto L_0x00f5;
                case 3: goto L_0x00e6;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            r15 = r6
            r16 = r7
        L_0x00e3:
            r17 = r8
            goto L_0x0122
        L_0x00e6:
            r1 = r9
            r2 = r7
            r3 = r4
            r4 = r12
            r14 = r5
            r5 = r13
            r15 = r6
            r6 = r8
            r16 = r7
            r7 = r14
            m31872a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0120, all -> 0x0118 }
            goto L_0x00e3
        L_0x00f5:
            r14 = r5
            r15 = r6
            r16 = r7
            r1 = r9
            r2 = r16
            r5 = r12
            r6 = r13
            r7 = r8
            r17 = r8
            r8 = r14
            m31873a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0122, all -> 0x0118 }
            goto L_0x0122
        L_0x0106:
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r1 = r9
            r2 = r16
            r5 = r12
            r6 = r13
            r7 = r17
            r8 = r14
            m31875b(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0122, all -> 0x0118 }
            goto L_0x0122
        L_0x0118:
            r0 = move-exception
            com.bytedance.p505d.p506a.C10031a.m29804a(r11)     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            throw r0     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
        L_0x011d:
            r15 = r6
            r16 = r7
        L_0x0120:
            r17 = r8
        L_0x0122:
            com.bytedance.p505d.p506a.C10031a.m29804a(r11)     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            r6 = r15
            r7 = r16
            r8 = r17
            goto L_0x0081
        L_0x012c:
            r19.setTransactionSuccessful()     // Catch:{ Exception -> 0x013f, all -> 0x0132 }
            if (r19 == 0) goto L_0x0144
            goto L_0x0141
        L_0x0132:
            r0 = move-exception
            goto L_0x0137
        L_0x0134:
            r0 = move-exception
            r19 = r10
        L_0x0137:
            if (r19 == 0) goto L_0x013c
            r19.endTransaction()
        L_0x013c:
            throw r0
        L_0x013d:
            r19 = r10
        L_0x013f:
            if (r19 == 0) goto L_0x0144
        L_0x0141:
            r19.endTransaction()
        L_0x0144:
            return r9
        L_0x0145:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.p571e.C10863b.m31874b(android.content.Context, java.util.Map, java.io.File):java.util.List");
    }

    /* renamed from: a */
    private static void m31872a(List<C10865a> list, File file, String str, int i, String str2, String str3, int i2) {
        File file2 = new File(file, str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("--PendingDelete");
        File file3 = new File(file, sb.toString());
        file2.renameTo(file3);
        C10865a aVar = new C10865a(str3, str, i2, i, new File(file, str2), file3);
        list.add(aVar);
    }

    /* renamed from: b */
    private static void m31875b(List<C10865a> list, File file, List<Integer> list2, String str, int i, String str2, String str3, int i2) {
        if (!(list2 == null || list2.size() == 0 || !list2.contains(Integer.valueOf(i)))) {
            File file2 = new File(file, str);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("--PendingDelete");
            File file3 = new File(file, sb.toString());
            file2.renameTo(file3);
            C10865a aVar = new C10865a(str3, str, i2, i, new File(file, str2), file3);
            list.add(aVar);
        }
    }

    /* renamed from: a */
    private static void m31873a(List<C10865a> list, File file, List<Integer> list2, String str, int i, String str2, String str3, int i2) {
        if (!(list2 == null || list2.size() == 0 || ((Integer) list2.get(0)).intValue() <= i)) {
            File file2 = new File(file, str);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("--PendingDelete");
            File file3 = new File(file, sb.toString());
            file2.renameTo(file3);
            C10865a aVar = new C10865a(str3, str, i2, i, new File(file, str2), file3);
            list.add(aVar);
        }
    }
}
