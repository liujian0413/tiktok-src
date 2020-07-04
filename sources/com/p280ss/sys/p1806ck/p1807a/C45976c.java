package com.p280ss.sys.p1806ck.p1807a;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ck.a.c */
public class C45976c {

    /* renamed from: a */
    public static int f117500a;

    /* renamed from: b */
    private static Context f117501b;

    /* renamed from: c */
    private static volatile C45976c f117502c;

    /* renamed from: d */
    private SQLiteDatabase f117503d;

    /* renamed from: e */
    private C45975b f117504e;

    private C45976c(Context context) {
        if (context != null) {
            this.f117504e = new C45975b(context);
        }
    }

    /* renamed from: a */
    public static int m144150a() {
        int i = f117500a;
        f117500a++;
        return i;
    }

    /* renamed from: a */
    public static C45976c m144151a(Context context) {
        if (f117502c == null) {
            synchronized (C45976c.class) {
                if (f117502c == null && context != null) {
                    f117501b = context;
                    f117502c = new C45976c(context.getApplicationContext());
                }
            }
        }
        return f117502c;
    }

    /* renamed from: a */
    private static void m144152a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private void m144153b() {
        if (this.f117503d == null) {
            try {
                this.f117503d = this.f117504e.getWritableDatabase();
            } catch (SQLException unused) {
                this.f117503d = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r0v17, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v20, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String[], ?[OBJECT, ARRAY]]
      uses: [java.lang.String[], ?[OBJECT, ARRAY][], android.database.Cursor]
      mth insns count: 67
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0093=Splitter:B:28:0x0093, B:32:0x0098=Splitter:B:32:0x0098} */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String[] m144154b(long r16, java.lang.String r18, long r19) {
        /*
            r15 = this;
            r1 = r15
            r2 = r19
            monitor-enter(r15)
            r15.m144153b()     // Catch:{ all -> 0x009e }
            android.database.sqlite.SQLiteDatabase r0 = r1.f117503d     // Catch:{ all -> 0x009e }
            r4 = 0
            if (r0 == 0) goto L_0x009c
            android.database.sqlite.SQLiteDatabase r0 = r1.f117503d     // Catch:{ all -> 0x009e }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x0016
            goto L_0x009c
        L_0x0016:
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x009e }
            java.lang.String r5 = "log"
            r14 = 0
            r7[r14] = r5     // Catch:{ all -> 0x009e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            java.lang.String r6 = "timestamp"
            r5.<init>(r6)     // Catch:{ all -> 0x009e }
            r6 = r18
            r5.append(r6)     // Catch:{ all -> 0x009e }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x009e }
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x009e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r0.<init>()     // Catch:{ all -> 0x009e }
            r5 = r16
            r0.append(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x009e }
            r9[r14] = r0     // Catch:{ all -> 0x009e }
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            android.database.sqlite.SQLiteDatabase r5 = r1.f117503d     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "SCCheckLog"
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r0.<init>()     // Catch:{ all -> 0x0062 }
            r0.append(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0062 }
            android.database.Cursor r0 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0062 }
            goto L_0x006f
        L_0x0062:
            r0 = move-exception
            goto L_0x0098
        L_0x0064:
            android.database.sqlite.SQLiteDatabase r5 = r1.f117503d     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "SCCheckLog"
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r0 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0062 }
        L_0x006f:
            r2 = r0
            if (r2 == 0) goto L_0x0093
            int r0 = r2.getCount()     // Catch:{ all -> 0x0090 }
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0090 }
        L_0x0078:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "log"
            int r0 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0090 }
            r3 = -1
            if (r0 == r3) goto L_0x0078
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0090 }
            r4[r14] = r0     // Catch:{ all -> 0x0090 }
            int r14 = r14 + 1
            goto L_0x0078
        L_0x0090:
            r0 = move-exception
            r4 = r2
            goto L_0x0098
        L_0x0093:
            m144152a(r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r15)
            return r4
        L_0x0098:
            m144152a(r4)     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x009e }
        L_0x009c:
            monitor-exit(r15)
            return r4
        L_0x009e:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.p1806ck.p1807a.C45976c.m144154b(long, java.lang.String, long):java.lang.String[]");
    }

    /* renamed from: a */
    public final synchronized String mo111327a(long j, String str, long j2) {
        String str2;
        String sb;
        String str3 = "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append("[");
        String sb3 = sb2.toString();
        try {
            String[] b = m144154b(j, str, j2);
            int i = 0;
            while (i < b.length) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append(b[i]);
                sb4.append(",");
                i++;
                sb3 = sb4.toString();
            }
            str2 = sb3.substring(0, sb3.length() - 1);
        } catch (Throwable unused) {
            str2 = sb3;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append("]");
        sb = sb5.toString();
        try {
            JSONArray jSONArray = new JSONArray(sb);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("logs", jSONArray);
            sb = jSONObject.toString();
        } catch (JSONException unused2) {
        }
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo111328a(long r5, java.lang.String r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.m144153b()     // Catch:{ all -> 0x0049 }
            android.database.sqlite.SQLiteDatabase r0 = r4.f117503d     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 == 0) goto L_0x0047
            android.database.sqlite.SQLiteDatabase r0 = r4.f117503d     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0047
        L_0x0012:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "timestamp"
            r0.<init>(r2)     // Catch:{ all -> 0x0049 }
            r0.append(r7)     // Catch:{ all -> 0x0049 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0049 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r3.<init>()     // Catch:{ all -> 0x0049 }
            r3.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0049 }
            r2[r1] = r5     // Catch:{ all -> 0x0049 }
            android.database.sqlite.SQLiteDatabase r5 = r4.f117503d     // Catch:{ Exception -> 0x003b }
            java.lang.String r6 = "SCCheckLog"
            int r5 = r5.delete(r6, r7, r2)     // Catch:{ Exception -> 0x003b }
            long r5 = (long) r5
            goto L_0x003d
        L_0x003b:
            r5 = -1
        L_0x003d:
            r2 = 0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0045
            monitor-exit(r4)
            return r0
        L_0x0045:
            monitor-exit(r4)
            return r1
        L_0x0047:
            monitor-exit(r4)
            return r1
        L_0x0049:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.p1806ck.p1807a.C45976c.mo111328a(long, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo111329a(java.lang.String r4, long r5, java.lang.String r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m144153b()     // Catch:{ all -> 0x0040 }
            android.database.sqlite.SQLiteDatabase r0 = r3.f117503d     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x003e
            android.database.sqlite.SQLiteDatabase r0 = r3.f117503d     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0012
            goto L_0x003e
        L_0x0012:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x0040 }
            r0.<init>()     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = "tag"
            r0.put(r2, r4)     // Catch:{ all -> 0x0040 }
            java.lang.String r4 = "timestamp"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0040 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0040 }
            java.lang.String r4 = "log"
            r0.put(r4, r7)     // Catch:{ all -> 0x0040 }
            android.database.sqlite.SQLiteDatabase r4 = r3.f117503d     // Catch:{ all -> 0x0040 }
            java.lang.String r5 = "SCCheckLog"
            r6 = 0
            long r4 = r4.insert(r5, r6, r0)     // Catch:{ all -> 0x0040 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x003c:
            monitor-exit(r3)
            return r1
        L_0x003e:
            monitor-exit(r3)
            return r1
        L_0x0040:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.p1806ck.p1807a.C45976c.mo111329a(java.lang.String, long, java.lang.String):boolean");
    }
}
