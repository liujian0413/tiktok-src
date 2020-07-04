package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.C1642a;
import com.google.android.gms.analytics.C14933l;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15328k;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ac */
final class C16383ac extends C16695r implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f45859b = C1642a.m8034a("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});

    /* renamed from: c */
    private static final String f45860c = C1642a.m8034a("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});

    /* renamed from: d */
    private final C16384ad f45861d;

    /* renamed from: e */
    private final C16431bx f45862e = new C16431bx(mo43203g());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C16431bx f45863f = new C16431bx(mo43203g());

    C16383ac(C16697t tVar) {
        super(tVar);
        this.f45861d = new C16384ad(this, tVar.f46639a, "google_analytics_v4.db");
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static String m53370y() {
        return "google_analytics_v4.db";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42476a() {
    }

    /* renamed from: b */
    public final void mo42479b() {
        mo43214s();
        mo42488v().beginTransaction();
    }

    /* renamed from: c */
    public final void mo42482c() {
        mo43214s();
        mo42488v().setTransactionSuccessful();
    }

    /* renamed from: d */
    public final void mo42484d() {
        mo43214s();
        mo42488v().endTransaction();
    }

    /* renamed from: a */
    public final void mo42477a(C16412be beVar) {
        String str;
        C15267r.m44384a(beVar);
        C14933l.m43382c();
        mo43214s();
        C15267r.m44384a(beVar);
        Builder builder = new Builder();
        for (Entry entry : beVar.f45954a.entrySet()) {
            String str2 = (String) entry.getKey();
            if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2)) {
                builder.appendQueryParameter(str2, (String) entry.getValue());
            }
        }
        String encodedQuery = builder.build().getEncodedQuery();
        if (encodedQuery == null) {
            encodedQuery = "";
        }
        if (encodedQuery.length() > 8192) {
            mo43205i().mo42538a(beVar, "Hit length exceeds the maximum allowed size");
            return;
        }
        int intValue = ((Integer) C16406az.f45920c.f45945a).intValue();
        long x = m53369x();
        if (x > ((long) (intValue - 1))) {
            List d = m53366d((x - ((long) intValue)) + 1);
            mo43198d("Store full, deleting hits to make room, count", Integer.valueOf(d.size()));
            mo42478a(d);
        }
        SQLiteDatabase v = mo42488v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_string", encodedQuery);
        contentValues.put("hit_time", Long.valueOf(beVar.f45957d));
        contentValues.put("hit_app_id", Integer.valueOf(beVar.f45958e));
        String str3 = "hit_url";
        if (beVar.f45959f) {
            str = C16398ar.m53436h();
        } else {
            str = C16398ar.m53437i();
        }
        contentValues.put(str3, str);
        try {
            long insert = v.insert("hits2", null, contentValues);
            if (insert == -1) {
                mo43202f("Failed to insert a hit (got -1)");
            } else {
                mo43192b("Hit saved to database. db-id, hit", Long.valueOf(insert), beVar);
            }
        } catch (SQLiteException e) {
            mo43201e("Error storing a hit", e);
        }
    }

    /* renamed from: x */
    private final long m53369x() {
        C14933l.m43382c();
        mo43214s();
        return m53361a("SELECT COUNT(*) FROM hits2", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo42485e() {
        return m53369x() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.Long> m53366d(long r14) {
        /*
            r13 = this;
            com.google.android.gms.analytics.C14933l.m43382c()
            r13.mo43214s()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0011
            java.util.List r14 = java.util.Collections.emptyList()
            return r14
        L_0x0011:
            android.database.sqlite.SQLiteDatabase r0 = r13.mo42488v()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
            java.lang.String r1 = "hits2"
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r4 = "hit_id"
            r11 = 0
            r3[r11] = r4     // Catch:{ SQLiteException -> 0x0069 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "%s ASC"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r12 = "hit_id"
            r2[r11] = r12     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r8 = com.C1642a.m8034a(r8, r2)     // Catch:{ SQLiteException -> 0x0069 }
            java.lang.String r14 = java.lang.Long.toString(r14)     // Catch:{ SQLiteException -> 0x0069 }
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r14
            android.database.Cursor r14 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0069 }
            boolean r15 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            if (r15 == 0) goto L_0x005b
        L_0x004a:
            long r0 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            java.lang.Long r15 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            r9.add(r15)     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            boolean r15 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0064, all -> 0x0061 }
            if (r15 != 0) goto L_0x004a
        L_0x005b:
            if (r14 == 0) goto L_0x0074
            r14.close()
            goto L_0x0074
        L_0x0061:
            r15 = move-exception
            r10 = r14
            goto L_0x0075
        L_0x0064:
            r15 = move-exception
            r10 = r14
            goto L_0x006a
        L_0x0067:
            r15 = move-exception
            goto L_0x0075
        L_0x0069:
            r15 = move-exception
        L_0x006a:
            java.lang.String r14 = "Error selecting hit ids"
            r13.mo43198d(r14, r15)     // Catch:{ all -> 0x0067 }
            if (r10 == 0) goto L_0x0074
            r10.close()
        L_0x0074:
            return r9
        L_0x0075:
            if (r10 == 0) goto L_0x007a
            r10.close()
        L_0x007a:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16383ac.m53366d(long):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C16412be> mo42475a(long r22) {
        /*
            r21 = this;
            r10 = r21
            r0 = 0
            r11 = 1
            r1 = 0
            int r5 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r5 < 0) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            com.google.android.gms.common.internal.C15267r.m44394b(r1)
            com.google.android.gms.analytics.C14933l.m43382c()
            r21.mo43214s()
            android.database.sqlite.SQLiteDatabase r12 = r21.mo42488v()
            r1 = 0
            java.lang.String r13 = "hits2"
            r2 = 5
            java.lang.String[] r14 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00a7 }
            java.lang.String r2 = "hit_id"
            r14[r0] = r2     // Catch:{ SQLiteException -> 0x00a7 }
            java.lang.String r2 = "hit_time"
            r14[r11] = r2     // Catch:{ SQLiteException -> 0x00a7 }
            java.lang.String r2 = "hit_string"
            r9 = 2
            r14[r9] = r2     // Catch:{ SQLiteException -> 0x00a7 }
            java.lang.String r2 = "hit_url"
            r7 = 3
            r14[r7] = r2     // Catch:{ SQLiteException -> 0x00a7 }
            java.lang.String r2 = "hit_app_id"
            r8 = 4
            r14[r8] = r2     // Catch:{ SQLiteException -> 0x00a7 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r2 = "%s ASC"
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ SQLiteException -> 0x00a7 }
            java.lang.String r6 = "hit_id"
            r5[r0] = r6     // Catch:{ SQLiteException -> 0x00a7 }
            java.lang.String r19 = com.C1642a.m8034a(r2, r5)     // Catch:{ SQLiteException -> 0x00a7 }
            java.lang.String r20 = java.lang.Long.toString(r22)     // Catch:{ SQLiteException -> 0x00a7 }
            android.database.Cursor r12 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00a7 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            r13.<init>()     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            boolean r1 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            if (r1 == 0) goto L_0x0099
        L_0x005d:
            long r14 = r12.getLong(r0)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            long r4 = r12.getLong(r11)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            java.lang.String r1 = r12.getString(r9)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            java.lang.String r2 = r12.getString(r7)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            int r16 = r12.getInt(r8)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            java.util.Map r3 = r10.m53364a(r1)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            boolean r6 = com.google.android.gms.internal.measurement.C16432by.m53554c(r2)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            com.google.android.gms.internal.measurement.be r2 = new com.google.android.gms.internal.measurement.be     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            r1 = r2
            r0 = r2
            r2 = r21
            r17 = 3
            r18 = 4
            r7 = r14
            r14 = 2
            r9 = r16
            r1.<init>(r2, r3, r4, r6, r7, r9)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            r13.add(r0)     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            boolean r0 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x00a2, all -> 0x009f }
            if (r0 != 0) goto L_0x0094
            goto L_0x0099
        L_0x0094:
            r0 = 0
            r7 = 3
            r8 = 4
            r9 = 2
            goto L_0x005d
        L_0x0099:
            if (r12 == 0) goto L_0x009e
            r12.close()
        L_0x009e:
            return r13
        L_0x009f:
            r0 = move-exception
            r1 = r12
            goto L_0x00ae
        L_0x00a2:
            r0 = move-exception
            r1 = r12
            goto L_0x00a8
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ae
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            java.lang.String r2 = "Error loading hits from the database"
            r10.mo43201e(r2, r0)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00ae:
            if (r1 == 0) goto L_0x00b3
            r1.close()
        L_0x00b3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16383ac.mo42475a(long):java.util.List");
    }

    /* renamed from: a */
    public final void mo42478a(List<Long> list) {
        C15267r.m44384a(list);
        C14933l.m43382c();
        mo43214s();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id");
            sb.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(l);
            }
            sb.append(")");
            String sb2 = sb.toString();
            try {
                SQLiteDatabase v = mo42488v();
                mo43187a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = v.delete("hits2", sb2, null);
                if (delete != list.size()) {
                    mo43193b("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                }
            } catch (SQLiteException e) {
                mo43201e("Error deleting hits", e);
                throw e;
            }
        }
    }

    /* renamed from: b */
    public final void mo42480b(long j) {
        C14933l.m43382c();
        mo43214s();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j));
        mo43187a("Deleting hit, id", Long.valueOf(j));
        mo42478a((List<Long>) arrayList);
    }

    /* renamed from: f */
    public final int mo42486f() {
        C14933l.m43382c();
        mo43214s();
        if (!this.f45862e.mo42567a(86400000)) {
            return 0;
        }
        this.f45862e.mo42566a();
        mo43190b("Deleting stale hits (if any)");
        int delete = mo42488v().delete("hits2", "hit_time < ?", new String[]{Long.toString(mo43203g().mo38684a() - 2592000000L)});
        mo43187a("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    /* renamed from: u */
    public final long mo42487u() {
        C14933l.m43382c();
        mo43214s();
        return m53362a(f45860c, (String[]) null, 0);
    }

    /* renamed from: a */
    public final long mo42474a(long j, String str, String str2) {
        C15267r.m44386a(str);
        C15267r.m44386a(str2);
        mo43214s();
        C14933l.m43382c();
        return m53362a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{String.valueOf(j), str, str2}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C16700w> mo42481c(long r26) {
        /*
            r25 = this;
            r1 = r25
            r25.mo43214s()
            com.google.android.gms.analytics.C14933l.m43382c()
            android.database.sqlite.SQLiteDatabase r2 = r25.mo42488v()
            r0 = 5
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "cid"
            r12 = 0
            r4[r12] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "tid"
            r13 = 1
            r4[r13] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "adid"
            r14 = 2
            r4[r14] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "hits_count"
            r15 = 3
            r4[r15] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r0 = "params"
            r10 = 4
            r4[r10] = r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            com.google.android.gms.internal.measurement.ba<java.lang.Integer> r0 = com.google.android.gms.internal.measurement.C16406az.f45921d     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            V r0 = r0.f45945a     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            int r0 = r0.intValue()     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r5 = "app_uid=?"
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r3 = "0"
            r6[r12] = r3     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.lang.String r3 = "properties"
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r10 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00bc, all -> 0x00b8 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r4 == 0) goto L_0x00a0
        L_0x0055:
            java.lang.String r4 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r5 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            int r6 = r2.getInt(r14)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r6 == 0) goto L_0x0066
            r21 = 1
            goto L_0x0068
        L_0x0066:
            r21 = 0
        L_0x0068:
            int r6 = r2.getInt(r15)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            java.lang.String r8 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            java.util.Map r24 = r1.m53367g(r8)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r8 != 0) goto L_0x0095
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r8 == 0) goto L_0x0082
            goto L_0x0095
        L_0x0082:
            com.google.android.gms.internal.measurement.w r8 = new com.google.android.gms.internal.measurement.w     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            r17 = 0
            r16 = r8
            r19 = r4
            r20 = r5
            r22 = r6
            r16.<init>(r17, r19, r20, r21, r22, r24)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            r3.add(r8)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            goto L_0x009a
        L_0x0095:
            java.lang.String r6 = "Read property with empty client id or tracker id"
            r1.mo43196c(r6, r4, r5)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
        L_0x009a:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r4 != 0) goto L_0x0055
        L_0x00a0:
            int r4 = r3.size()     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
            if (r4 < r0) goto L_0x00ab
            java.lang.String r0 = "Sending hits to too many properties. Campaign report might be incorrect"
            r1.mo43200e(r0)     // Catch:{ SQLiteException -> 0x00b5, all -> 0x00b1 }
        L_0x00ab:
            if (r2 == 0) goto L_0x00b0
            r2.close()
        L_0x00b0:
            return r3
        L_0x00b1:
            r0 = move-exception
            r17 = r2
            goto L_0x00c7
        L_0x00b5:
            r0 = move-exception
            r11 = r2
            goto L_0x00be
        L_0x00b8:
            r0 = move-exception
            r17 = 0
            goto L_0x00c7
        L_0x00bc:
            r0 = move-exception
            r11 = 0
        L_0x00be:
            java.lang.String r2 = "Error loading hits from the database"
            r1.mo43201e(r2, r0)     // Catch:{ all -> 0x00c4 }
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r0 = move-exception
            r17 = r11
        L_0x00c7:
            if (r17 == 0) goto L_0x00cc
            r17.close()
        L_0x00cc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16383ac.mo42481c(long):java.util.List");
    }

    public final void close() {
        try {
            this.f45861d.close();
        } catch (SQLiteException e) {
            mo43201e("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            mo43201e("Error closing database", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m53361a(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r5 = r3.mo42488v()
            r0 = 0
            android.database.Cursor r5 = r5.rawQuery(r4, r0)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0026 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0024 }
            if (r0 == 0) goto L_0x001a
            r0 = 0
            long r0 = r5.getLong(r0)     // Catch:{ SQLiteException -> 0x0024 }
            if (r5 == 0) goto L_0x0019
            r5.close()
        L_0x0019:
            return r0
        L_0x001a:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x0024 }
            java.lang.String r1 = "Database returned empty set"
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x0024 }
            throw r0     // Catch:{ SQLiteException -> 0x0024 }
        L_0x0022:
            r4 = move-exception
            goto L_0x0033
        L_0x0024:
            r0 = move-exception
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
            r5 = r0
            goto L_0x0033
        L_0x0029:
            r5 = move-exception
            r2 = r0
            r0 = r5
            r5 = r2
        L_0x002d:
            java.lang.String r1 = "Database error"
            r3.mo43199d(r1, r4, r0)     // Catch:{ all -> 0x0022 }
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0033:
            if (r5 == 0) goto L_0x0038
            r5.close()
        L_0x0038:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16383ac.m53361a(java.lang.String, java.lang.String[]):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m53362a(java.lang.String r1, java.lang.String[] r2, long r3) {
        /*
            r0 = this;
            android.database.sqlite.SQLiteDatabase r3 = r0.mo42488v()
            r4 = 0
            android.database.Cursor r2 = r3.rawQuery(r1, r2)     // Catch:{ SQLiteException -> 0x002a }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0025, all -> 0x0022 }
            if (r3 == 0) goto L_0x001a
            r3 = 0
            long r3 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0022 }
            if (r2 == 0) goto L_0x0019
            r2.close()
        L_0x0019:
            return r3
        L_0x001a:
            if (r2 == 0) goto L_0x001f
            r2.close()
        L_0x001f:
            r1 = 0
            return r1
        L_0x0022:
            r1 = move-exception
            r4 = r2
            goto L_0x0031
        L_0x0025:
            r3 = move-exception
            r4 = r2
            goto L_0x002b
        L_0x0028:
            r1 = move-exception
            goto L_0x0031
        L_0x002a:
            r3 = move-exception
        L_0x002b:
            java.lang.String r2 = "Database error"
            r0.mo43199d(r2, r1, r3)     // Catch:{ all -> 0x0028 }
            throw r3     // Catch:{ all -> 0x0028 }
        L_0x0031:
            if (r4 == 0) goto L_0x0036
            r4.close()
        L_0x0036:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16383ac.m53362a(java.lang.String, java.lang.String[], long):long");
    }

    /* renamed from: a */
    private final Map<String, String> m53364a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String str2 = "?";
                String valueOf = String.valueOf(str);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            return C15328k.m44586a(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            mo43201e("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    /* renamed from: g */
    private final Map<String, String> m53367g(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        String str2 = "?";
        try {
            String valueOf = String.valueOf(str);
            return C15328k.m44586a(new URI(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)), "UTF-8");
        } catch (URISyntaxException e) {
            mo43201e("Error parsing property parameters", e);
            return new HashMap(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final SQLiteDatabase mo42488v() {
        try {
            return this.f45861d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo43198d("Error opening database", e);
            throw e;
        }
    }
}
