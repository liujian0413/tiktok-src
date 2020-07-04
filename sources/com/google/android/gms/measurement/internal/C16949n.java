package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.C15322e;

/* renamed from: com.google.android.gms.measurement.internal.n */
public final class C16949n extends C16896do {

    /* renamed from: a */
    private final C16950o f47481a = new C16950o(this, mo43581m(), "google_app_measurement_local.db");

    /* renamed from: b */
    private boolean f47482b;

    C16949n(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo43740t() {
        return false;
    }

    /* renamed from: v */
    public final void mo44144v() {
        mo43571c();
        try {
            int delete = m56285w().delete("messages", null, null) + 0;
            if (delete > 0) {
                mo43585q().f47495i.mo44161a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            mo43585q().f47487a.mo44161a("Error resetting local analytics data. error", e);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r12v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r9v2, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r9v8, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v1, types: [int, boolean]
      assigns: []
      uses: [?[int, short, byte, char], int, boolean]
      mth insns count: 162
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[SYNTHETIC, Splitter:B:49:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0114 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0114 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0114 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m56284a(int r18, byte[] r19) {
        /*
            r17 = this;
            r1 = r17
            r17.mo43571c()
            boolean r0 = r1.f47482b
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r0 = "type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r3.put(r0, r4)
            java.lang.String r0 = "entry"
            r4 = r19
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0023:
            if (r5 >= r4) goto L_0x0127
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r17.m56285w()     // Catch:{ SQLiteFullException -> 0x00fb, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x00c0, all -> 0x00bc }
            if (r9 != 0) goto L_0x003d
            r1.f47482b = r8     // Catch:{ SQLiteFullException -> 0x003a, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x0035 }
            if (r9 == 0) goto L_0x0034
            r9.close()
        L_0x0034:
            return r2
        L_0x0035:
            r0 = move-exception
            r12 = r7
        L_0x0037:
            r7 = r9
            goto L_0x00c2
        L_0x003a:
            r0 = move-exception
            goto L_0x00fd
        L_0x003d:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x003a, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x0035 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x003a, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x0035 }
            if (r12 == 0) goto L_0x005e
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            if (r0 == 0) goto L_0x005e
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            goto L_0x005e
        L_0x0055:
            r0 = move-exception
            goto L_0x011c
        L_0x0058:
            r0 = move-exception
            goto L_0x0037
        L_0x005a:
            r0 = move-exception
            r7 = r12
            goto L_0x00fd
        L_0x005e:
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x00a4
            com.google.android.gms.measurement.internal.r r0 = r17.mo43585q()     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            java.lang.String r15 = "Data loss, local db full"
            r0.mo44160a(r15)     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            r0 = 0
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r0 = "messages"
            java.lang.String r10 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            java.lang.String r15 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            r11[r2] = r15     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            int r0 = r9.delete(r0, r10, r11)     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            long r10 = (long) r0     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00a4
            com.google.android.gms.measurement.internal.r r0 = r17.mo43585q()     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r4 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            r16 = 0
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            r0.mo44163a(r15, r4, r2, r10)     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
        L_0x00a4:
            java.lang.String r0 = "messages"
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x005a, SQLiteDatabaseLockedException -> 0x00ba, SQLiteException -> 0x0058, all -> 0x0055 }
            if (r12 == 0) goto L_0x00b4
            r12.close()
        L_0x00b4:
            if (r9 == 0) goto L_0x00b9
            r9.close()
        L_0x00b9:
            return r8
        L_0x00ba:
            r7 = r12
            goto L_0x00ea
        L_0x00bc:
            r0 = move-exception
            r9 = r7
            r12 = r9
            goto L_0x011c
        L_0x00c0:
            r0 = move-exception
            r12 = r7
        L_0x00c2:
            if (r7 == 0) goto L_0x00d1
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x00d1
            r7.endTransaction()     // Catch:{ all -> 0x00ce }
            goto L_0x00d1
        L_0x00ce:
            r0 = move-exception
            r9 = r7
            goto L_0x011c
        L_0x00d1:
            com.google.android.gms.measurement.internal.r r2 = r17.mo43585q()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.measurement.internal.t r2 = r2.f47487a     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo44161a(r4, r0)     // Catch:{ all -> 0x00ce }
            r1.f47482b = r8     // Catch:{ all -> 0x00ce }
            if (r12 == 0) goto L_0x00e3
            r12.close()
        L_0x00e3:
            if (r7 == 0) goto L_0x0114
            r7.close()
            goto L_0x0114
        L_0x00e9:
            r9 = r7
        L_0x00ea:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x011a }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f5
            r7.close()
        L_0x00f5:
            if (r9 == 0) goto L_0x0114
            r9.close()
            goto L_0x0114
        L_0x00fb:
            r0 = move-exception
            r9 = r7
        L_0x00fd:
            com.google.android.gms.measurement.internal.r r2 = r17.mo43585q()     // Catch:{ all -> 0x011a }
            com.google.android.gms.measurement.internal.t r2 = r2.f47487a     // Catch:{ all -> 0x011a }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo44161a(r4, r0)     // Catch:{ all -> 0x011a }
            r1.f47482b = r8     // Catch:{ all -> 0x011a }
            if (r7 == 0) goto L_0x010f
            r7.close()
        L_0x010f:
            if (r9 == 0) goto L_0x0114
            r9.close()
        L_0x0114:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0023
        L_0x011a:
            r0 = move-exception
            r12 = r7
        L_0x011c:
            if (r12 == 0) goto L_0x0121
            r12.close()
        L_0x0121:
            if (r9 == 0) goto L_0x0126
            r9.close()
        L_0x0126:
            throw r0
        L_0x0127:
            com.google.android.gms.measurement.internal.r r0 = r17.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47490d
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo44160a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16949n.m56284a(int, byte[]):boolean");
    }

    /* renamed from: a */
    public final boolean mo44141a(zzag zzag) {
        Parcel obtain = Parcel.obtain();
        zzag.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m56284a(0, marshall);
        }
        mo43585q().f47490d.mo44160a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo44142a(zzfv zzfv) {
        Parcel obtain = Parcel.obtain();
        zzfv.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m56284a(1, marshall);
        }
        mo43585q().f47490d.mo44160a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo44143a(zzo zzo) {
        mo43583o();
        byte[] a = C16922em.m55966a((Parcelable) zzo);
        if (a.length <= 131072) {
            return m56284a(2, a);
        }
        mo43585q().f47490d.mo44160a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>] */
    /* JADX WARNING: type inference failed for: r9v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r9v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:54|55|56|57) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:69|70|71|72) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:41|42|43|44|165) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r9 = r2;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        r0 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        mo43585q().f47487a.mo44160a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r13.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        mo43585q().f47487a.mo44160a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        mo43585q().f47487a.mo44160a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0107 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0188 A[SYNTHETIC, Splitter:B:112:0x0188] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x002e] */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> mo44140a(int r20) {
        /*
            r19 = this;
            r1 = r19
            r19.mo43571c()
            boolean r0 = r1.f47482b
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.Context r0 = r19.mo43581m()
            java.lang.String r4 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r4)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0021
            return r3
        L_0x0021:
            r4 = 5
            r5 = 0
            r6 = 0
            r7 = 5
        L_0x0025:
            if (r6 >= r4) goto L_0x01f1
            r8 = 1
            android.database.sqlite.SQLiteDatabase r15 = r19.m56285w()     // Catch:{ SQLiteFullException -> 0x01c3, SQLiteDatabaseLockedException -> 0x01ac, SQLiteException -> 0x0183, all -> 0x017e }
            if (r15 != 0) goto L_0x0041
            r1.f47482b = r8     // Catch:{ SQLiteFullException -> 0x003e, SQLiteDatabaseLockedException -> 0x003b, SQLiteException -> 0x0036 }
            if (r15 == 0) goto L_0x0035
            r15.close()
        L_0x0035:
            return r2
        L_0x0036:
            r0 = move-exception
            r9 = r2
            r2 = r15
            goto L_0x0186
        L_0x003b:
            r2 = r15
            goto L_0x0177
        L_0x003e:
            r0 = move-exception
            goto L_0x01c6
        L_0x0041:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x017a, SQLiteDatabaseLockedException -> 0x003b, SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r10 = "messages"
            r0 = 3
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ SQLiteFullException -> 0x017a, SQLiteDatabaseLockedException -> 0x003b, SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r0 = "rowid"
            r11[r5] = r0     // Catch:{ SQLiteFullException -> 0x017a, SQLiteDatabaseLockedException -> 0x003b, SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r0 = "type"
            r11[r8] = r0     // Catch:{ SQLiteFullException -> 0x017a, SQLiteDatabaseLockedException -> 0x003b, SQLiteException -> 0x0174, all -> 0x0171 }
            java.lang.String r0 = "entry"
            r14 = 2
            r11[r14] = r0     // Catch:{ SQLiteFullException -> 0x017a, SQLiteDatabaseLockedException -> 0x003b, SQLiteException -> 0x0174, all -> 0x0171 }
            r12 = 0
            r13 = 0
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r9 = 100
            java.lang.String r18 = java.lang.Integer.toString(r9)     // Catch:{ SQLiteFullException -> 0x017a, SQLiteDatabaseLockedException -> 0x003b, SQLiteException -> 0x0174, all -> 0x0171 }
            r9 = r15
            r4 = 2
            r14 = r0
            r2 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteFullException -> 0x016e, SQLiteDatabaseLockedException -> 0x0177, SQLiteException -> 0x016c, all -> 0x016a }
            r10 = -1
        L_0x0073:
            boolean r0 = r9.moveToNext()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r0 == 0) goto L_0x012e
            long r10 = r9.getLong(r5)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r9.getInt(r8)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            byte[] r12 = r9.getBlob(r4)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r0 != 0) goto L_0x00b8
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00a5 }
            r13.unmarshall(r12, r5, r0)     // Catch:{ ParseException -> 0x00a5 }
            r13.setDataPosition(r5)     // Catch:{ ParseException -> 0x00a5 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r0 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ ParseException -> 0x00a5 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ParseException -> 0x00a5 }
            com.google.android.gms.measurement.internal.zzag r0 = (com.google.android.gms.measurement.internal.zzag) r0     // Catch:{ ParseException -> 0x00a5 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r0 == 0) goto L_0x0073
            r3.add(r0)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0073
        L_0x00a3:
            r0 = move-exception
            goto L_0x00b4
        L_0x00a5:
            com.google.android.gms.measurement.internal.r r0 = r19.mo43585q()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x00a3 }
            java.lang.String r12 = "Failed to load event from local database"
            r0.mo44160a(r12)     // Catch:{ all -> 0x00a3 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0073
        L_0x00b4:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
        L_0x00b8:
            if (r0 != r8) goto L_0x00ec
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00d3 }
            r13.unmarshall(r12, r5, r0)     // Catch:{ ParseException -> 0x00d3 }
            r13.setDataPosition(r5)     // Catch:{ ParseException -> 0x00d3 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzfv> r0 = com.google.android.gms.measurement.internal.zzfv.CREATOR     // Catch:{ ParseException -> 0x00d3 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ParseException -> 0x00d3 }
            com.google.android.gms.measurement.internal.zzfv r0 = (com.google.android.gms.measurement.internal.zzfv) r0     // Catch:{ ParseException -> 0x00d3 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x00e2
        L_0x00d1:
            r0 = move-exception
            goto L_0x00e8
        L_0x00d3:
            com.google.android.gms.measurement.internal.r r0 = r19.mo43585q()     // Catch:{ all -> 0x00d1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x00d1 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.mo44160a(r12)     // Catch:{ all -> 0x00d1 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            r0 = 0
        L_0x00e2:
            if (r0 == 0) goto L_0x0073
            r3.add(r0)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0073
        L_0x00e8:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
        L_0x00ec:
            if (r0 != r4) goto L_0x0121
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r12.length     // Catch:{ ParseException -> 0x0107 }
            r13.unmarshall(r12, r5, r0)     // Catch:{ ParseException -> 0x0107 }
            r13.setDataPosition(r5)     // Catch:{ ParseException -> 0x0107 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzo> r0 = com.google.android.gms.measurement.internal.zzo.CREATOR     // Catch:{ ParseException -> 0x0107 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ParseException -> 0x0107 }
            com.google.android.gms.measurement.internal.zzo r0 = (com.google.android.gms.measurement.internal.zzo) r0     // Catch:{ ParseException -> 0x0107 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0116
        L_0x0105:
            r0 = move-exception
            goto L_0x011d
        L_0x0107:
            com.google.android.gms.measurement.internal.r r0 = r19.mo43585q()     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ all -> 0x0105 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.mo44160a(r12)     // Catch:{ all -> 0x0105 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            r0 = 0
        L_0x0116:
            if (r0 == 0) goto L_0x0073
            r3.add(r0)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0073
        L_0x011d:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
        L_0x0121:
            com.google.android.gms.measurement.internal.r r0 = r19.mo43585q()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            java.lang.String r12 = "Unknown record type in local database"
            r0.mo44160a(r12)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            goto L_0x0073
        L_0x012e:
            java.lang.String r0 = "messages"
            java.lang.String r4 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            java.lang.String r10 = java.lang.Long.toString(r10)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            r12[r5] = r10     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r0 = r2.delete(r0, r4, r12)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            int r4 = r3.size()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r0 >= r4) goto L_0x014f
            com.google.android.gms.measurement.internal.r r0 = r19.mo43585q()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            com.google.android.gms.measurement.internal.t r0 = r0.f47487a     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            java.lang.String r4 = "Fewer entries removed from local database than expected"
            r0.mo44160a(r4)     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
        L_0x014f:
            r2.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            r2.endTransaction()     // Catch:{ SQLiteFullException -> 0x0165, SQLiteDatabaseLockedException -> 0x0162, SQLiteException -> 0x0160 }
            if (r9 == 0) goto L_0x015a
            r9.close()
        L_0x015a:
            if (r2 == 0) goto L_0x015f
            r2.close()
        L_0x015f:
            return r3
        L_0x0160:
            r0 = move-exception
            goto L_0x0186
        L_0x0162:
            r4 = r2
            r2 = r9
            goto L_0x01ae
        L_0x0165:
            r0 = move-exception
            r15 = r2
            r2 = r9
            goto L_0x01c6
        L_0x016a:
            r0 = move-exception
            goto L_0x0180
        L_0x016c:
            r0 = move-exception
            goto L_0x0185
        L_0x016e:
            r0 = move-exception
            r15 = r2
            goto L_0x017c
        L_0x0171:
            r0 = move-exception
            r2 = r15
            goto L_0x0180
        L_0x0174:
            r0 = move-exception
            r2 = r15
            goto L_0x0185
        L_0x0177:
            r4 = r2
            r2 = 0
            goto L_0x01ae
        L_0x017a:
            r0 = move-exception
            r2 = r15
        L_0x017c:
            r2 = 0
            goto L_0x01c6
        L_0x017e:
            r0 = move-exception
            r2 = 0
        L_0x0180:
            r9 = 0
            goto L_0x01e6
        L_0x0183:
            r0 = move-exception
            r2 = 0
        L_0x0185:
            r9 = 0
        L_0x0186:
            if (r2 == 0) goto L_0x0194
            boolean r4 = r2.inTransaction()     // Catch:{ all -> 0x0192 }
            if (r4 == 0) goto L_0x0194
            r2.endTransaction()     // Catch:{ all -> 0x0192 }
            goto L_0x0194
        L_0x0192:
            r0 = move-exception
            goto L_0x01e6
        L_0x0194:
            com.google.android.gms.measurement.internal.r r4 = r19.mo43585q()     // Catch:{ all -> 0x0192 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ all -> 0x0192 }
            java.lang.String r10 = "Error reading entries from local database"
            r4.mo44161a(r10, r0)     // Catch:{ all -> 0x0192 }
            r1.f47482b = r8     // Catch:{ all -> 0x0192 }
            if (r9 == 0) goto L_0x01a6
            r9.close()
        L_0x01a6:
            if (r2 == 0) goto L_0x01dd
            r2.close()
            goto L_0x01dd
        L_0x01ac:
            r2 = 0
            r4 = 0
        L_0x01ae:
            long r8 = (long) r7
            android.os.SystemClock.sleep(r8)     // Catch:{ all -> 0x01bf }
            int r7 = r7 + 20
            if (r2 == 0) goto L_0x01b9
            r2.close()
        L_0x01b9:
            if (r4 == 0) goto L_0x01dd
            r4.close()
            goto L_0x01dd
        L_0x01bf:
            r0 = move-exception
            r9 = r2
            r2 = r4
            goto L_0x01e6
        L_0x01c3:
            r0 = move-exception
            r2 = 0
            r15 = 0
        L_0x01c6:
            com.google.android.gms.measurement.internal.r r4 = r19.mo43585q()     // Catch:{ all -> 0x01e3 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47487a     // Catch:{ all -> 0x01e3 }
            java.lang.String r9 = "Error reading entries from local database"
            r4.mo44161a(r9, r0)     // Catch:{ all -> 0x01e3 }
            r1.f47482b = r8     // Catch:{ all -> 0x01e3 }
            if (r2 == 0) goto L_0x01d8
            r2.close()
        L_0x01d8:
            if (r15 == 0) goto L_0x01dd
            r15.close()
        L_0x01dd:
            int r6 = r6 + 1
            r2 = 0
            r4 = 5
            goto L_0x0025
        L_0x01e3:
            r0 = move-exception
            r9 = r2
            r2 = r15
        L_0x01e6:
            if (r9 == 0) goto L_0x01eb
            r9.close()
        L_0x01eb:
            if (r2 == 0) goto L_0x01f0
            r2.close()
        L_0x01f0:
            throw r0
        L_0x01f1:
            com.google.android.gms.measurement.internal.r r0 = r19.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47490d
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo44160a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16949n.mo44140a(int):java.util.List");
    }

    /* renamed from: w */
    private final SQLiteDatabase m56285w() throws SQLiteException {
        if (this.f47482b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f47481a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f47482b = true;
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C16800a mo43572d() {
        return super.mo43572d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C16858cd mo43573e() {
        return super.mo43573e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C16947l mo43574f() {
        return super.mo43574f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C16875cu mo43575g() {
        return super.mo43575g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C16871cq mo43576h() {
        return super.mo43576h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C16949n mo43577i() {
        return super.mo43577i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C16900ds mo43578j() {
        return super.mo43578j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
