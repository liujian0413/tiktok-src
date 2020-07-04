package com.p280ss.android.download;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.download.p861b.C19405c.C19406a;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.download.f */
public final class C19422f {

    /* renamed from: c */
    private static final UriMatcher f52565c;

    /* renamed from: d */
    private static final Uri[] f52566d = {C19406a.f52513a};

    /* renamed from: e */
    private static final HashMap<String, String> f52567e;

    /* renamed from: g */
    private static final Object f52568g = new Object();

    /* renamed from: h */
    private static C19422f f52569h;

    /* renamed from: a */
    protected C19439q f52570a;

    /* renamed from: b */
    protected final Context f52571b;

    /* renamed from: f */
    private SQLiteOpenHelper f52572f;

    /* renamed from: com.ss.android.download.f$a */
    final class C19424a extends SQLiteOpenHelper {
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            onUpgrade(sQLiteDatabase, 0, 100);
        }

        /* renamed from: c */
        private static void m63845c(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ss_downloads");
                sQLiteDatabase.execSQL("CREATE TABLE ss_downloads(_id INTEGER PRIMARY KEY AUTOINCREMENT,uri TEXT, entity TEXT, no_integrity BOOLEAN, hint TEXT, _data TEXT, mimetype TEXT, destination INTEGER, visibility INTEGER, control INTEGER, status INTEGER, numfailed INTEGER, lastmod BIGINT, notificationpackage TEXT, notificationextras TEXT, cookiedata TEXT, useragent TEXT, referer TEXT, total_bytes INTEGER, current_bytes INTEGER, title TEXT, description TEXT, allow_roaming INTEGER NOT NULL DEFAULT 0, allowed_network_types INTEGER NOT NULL DEFAULT 0, is_visible_in_downloads_ui INTEGER NOT NULL DEFAULT 1, bypass_recommended_size_limit INTEGER NOT NULL DEFAULT 0, mediaprovider_uri TEXT, deleted BOOLEAN NOT NULL DEFAULT 0, errorMsg TEXT, allow_write BOOLEAN NOT NULL DEFAULT 0, etag TEXT, scanned INTEGER, method INTEGER);");
            } catch (SQLException e) {
                throw e;
            }
        }

        /* renamed from: d */
        private static void m63846d(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS request_headers");
            sQLiteDatabase.execSQL("CREATE TABLE request_headers(id INTEGER PRIMARY KEY AUTOINCREMENT,download_id INTEGER NOT NULL,header TEXT NOT NULL,value TEXT NOT NULL);");
        }

        /* renamed from: b */
        private static void m63844b(SQLiteDatabase sQLiteDatabase) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_visible_in_downloads_ui", Boolean.valueOf(false));
            sQLiteDatabase.update("ss_downloads", contentValues, "destination != 0", null);
        }

        /* renamed from: a */
        private void m63841a(SQLiteDatabase sQLiteDatabase) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_bytes", Integer.valueOf(0));
            m63843a(sQLiteDatabase, contentValues);
            contentValues.put("total_bytes", Integer.valueOf(-1));
            m63843a(sQLiteDatabase, contentValues);
            contentValues.put("title", "");
            m63843a(sQLiteDatabase, contentValues);
            contentValues.put("description", "");
            m63843a(sQLiteDatabase, contentValues);
        }

        public C19424a(Context context) {
            super(context, "ss_downloads.db", null, 100);
        }

        /* renamed from: a */
        private void m63842a(SQLiteDatabase sQLiteDatabase, int i) {
            if (i == 100) {
                m63845c(sQLiteDatabase);
                m63846d(sQLiteDatabase);
                m63844b(sQLiteDatabase);
                m63841a(sQLiteDatabase);
                return;
            }
            StringBuilder sb = new StringBuilder("Don't know how to upgrade to ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        private static void m63843a(SQLiteDatabase sQLiteDatabase, ContentValues contentValues) {
            String str = (String) ((Entry) contentValues.valueSet().iterator().next()).getKey();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is null");
            sQLiteDatabase.update("ss_downloads", contentValues, sb.toString(), null);
            contentValues.clear();
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = 99;
            if (i >= 100 && i <= i2) {
                i3 = i;
            }
            while (true) {
                i3++;
                if (i3 <= i2) {
                    try {
                        m63842a(sQLiteDatabase, i3);
                    } catch (Throwable unused) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.download.f$b */
    static class C19425b {

        /* renamed from: a */
        public StringBuilder f52574a;

        /* renamed from: b */
        public List<String> f52575b;

        /* renamed from: a */
        public final String mo51454a() {
            return this.f52574a.toString();
        }

        private C19425b() {
            this.f52574a = new StringBuilder();
            this.f52575b = new ArrayList();
        }

        /* renamed from: b */
        public final String[] mo51456b() {
            return (String[]) this.f52575b.toArray(new String[this.f52575b.size()]);
        }

        /* renamed from: a */
        public final <T> void mo51455a(String str, T... tArr) {
            if (str != null && !TextUtils.isEmpty(str)) {
                if (this.f52574a.length() != 0) {
                    this.f52574a.append(" AND ");
                }
                this.f52574a.append("(");
                this.f52574a.append(str);
                this.f52574a.append(")");
                if (tArr != null) {
                    for (T obj : tArr) {
                        this.f52575b.add(obj.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final Cursor mo51451a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            SQLiteDatabase readableDatabase = this.f52572f.getReadableDatabase();
            int match = f52565c.match(uri);
            if (match == -1) {
                StringBuilder sb = new StringBuilder("Unknown URI: ");
                sb.append(uri);
                throw new IllegalArgumentException(sb.toString());
            } else if (match != 3) {
                C19425b a = m63832a(uri, str, strArr2, match);
                if (C19357a.f52378d) {
                    m63837a(strArr, str, strArr2, str2, readableDatabase);
                }
                Cursor query = readableDatabase.query("ss_downloads", strArr, a.mo51454a(), a.mo51456b(), null, null, str2);
                if (query != null) {
                    query.setNotificationUri(this.f52571b.getContentResolver(), uri);
                }
                return query;
            } else if (strArr == null && str == null && str2 == null) {
                return m63831a(readableDatabase, uri);
            } else {
                throw new UnsupportedOperationException("Request header queries do not support projections, selections or sorting");
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo51450a(Uri uri, String str, String[] strArr) {
        try {
            SQLiteDatabase writableDatabase = this.f52572f.getWritableDatabase();
            int match = f52565c.match(uri);
            switch (match) {
                case 1:
                case 2:
                    C19425b a = m63832a(uri, (String) null, (String[]) null, match);
                    m63835a(writableDatabase, a.mo51454a(), a.mo51456b());
                    int delete = writableDatabase.delete("ss_downloads", a.mo51454a(), a.mo51456b());
                    m63836a(uri, match);
                    return delete;
                default:
                    StringBuilder sb = new StringBuilder("Cannot delete URI: ");
                    sb.append(uri);
                    throw new UnsupportedOperationException(sb.toString());
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f52565c = uriMatcher;
        uriMatcher.addURI("com.ss.android.newmedia.downloads", "all_downloads", 1);
        f52565c.addURI("com.ss.android.newmedia.downloads", "all_downloads/#", 2);
        f52565c.addURI("com.ss.android.newmedia.downloads", "all_downloads/#/headers", 3);
        f52565c.addURI("com.ss.android.newmedia.downloads", "download/#/headers", 3);
        HashMap<String, String> hashMap = new HashMap<>();
        f52567e = hashMap;
        hashMap.put("_display_name", "title AS _display_name");
        f52567e.put("_size", "total_bytes AS _size");
    }

    /* renamed from: a */
    private static String m63834a(Uri uri) {
        return (String) uri.getPathSegments().get(1);
    }

    private C19422f(Context context) {
        this.f52571b = context;
        if (this.f52570a == null) {
            this.f52570a = C19435n.m63904a(context);
        }
        this.f52572f = new C19424a(context);
        try {
            context.startService(new Intent(context, DownloadService.class));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C19422f m63833a(Context context) {
        synchronized (f52568g) {
            if (f52569h == null) {
                f52569h = new C19422f(context.getApplicationContext());
            }
        }
        return f52569h;
    }

    /* renamed from: a */
    private Cursor m63831a(SQLiteDatabase sQLiteDatabase, Uri uri) {
        StringBuilder sb = new StringBuilder("download_id=");
        sb.append(m63834a(uri));
        return sQLiteDatabase.query("request_headers", new String[]{"header", "value"}, sb.toString(), null, null, null, null);
    }

    /* renamed from: a */
    private void m63836a(Uri uri, int i) {
        Long l;
        Uri[] uriArr;
        if (i == 2) {
            l = Long.valueOf(Long.parseLong(m63834a(uri)));
        } else {
            l = null;
        }
        for (Uri uri2 : f52566d) {
            if (l != null) {
                uri2 = ContentUris.withAppendedId(uri2, l.longValue());
            }
            this.f52571b.getContentResolver().notifyChange(uri2, null);
        }
    }

    /* renamed from: a */
    private static void m63835a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("ss_downloads", new String[]{"_id"}, str, strArr, null, null, null, null);
        try {
            query.moveToFirst();
            while (!query.isAfterLast()) {
                long j = query.getLong(0);
                StringBuilder sb = new StringBuilder("download_id=");
                sb.append(j);
                sQLiteDatabase.delete("request_headers", sb.toString(), null);
                query.moveToNext();
            }
            if (query != null) {
                try {
                    query.close();
                } catch (Exception unused) {
                }
            }
        } finally {
            if (query != null) {
                try {
                    query.close();
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    private C19425b m63832a(Uri uri, String str, String[] strArr, int i) {
        C19425b bVar = new C19425b();
        bVar.mo51455a(str, strArr);
        if (i == 2) {
            bVar.mo51455a("_id = ?", m63834a(uri));
        }
        return bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|(0)|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069 A[SYNTHETIC, Splitter:B:28:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f A[SYNTHETIC, Splitter:B:34:0x006f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007a A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009d A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa A[Catch:{ Exception -> 0x00ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad A[Catch:{ Exception -> 0x00ef }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo51449a(android.net.Uri r16, android.content.ContentValues r17, java.lang.String r18, java.lang.String[] r19) {
        /*
            r15 = this;
            r7 = r15
            r0 = r16
            r8 = r17
            r9 = 0
            android.database.sqlite.SQLiteOpenHelper r1 = r7.f52572f     // Catch:{ Exception -> 0x00ef }
            android.database.sqlite.SQLiteDatabase r10 = r1.getWritableDatabase()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "deleted"
            boolean r1 = r8.containsKey(r1)     // Catch:{ Exception -> 0x00ef }
            r11 = 1
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "deleted"
            java.lang.Integer r1 = r8.getAsInteger(r1)     // Catch:{ Exception -> 0x00ef }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            if (r1 != r11) goto L_0x0023
            r12 = 1
            goto L_0x0024
        L_0x0023:
            r12 = 0
        L_0x0024:
            java.lang.String r1 = "_data"
            java.lang.String r13 = r8.getAsString(r1)     // Catch:{ Exception -> 0x00ef }
            if (r13 == 0) goto L_0x0072
            r14 = 0
            java.lang.String[] r3 = new java.lang.String[r11]     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            java.lang.String r1 = "title"
            r3[r9] = r1     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r15
            r2 = r16
            android.database.Cursor r1 = r1.mo51451a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x006d, all -> 0x0065 }
            boolean r2 = r1.moveToFirst()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = r1.getString(r9)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            if (r2 == 0) goto L_0x005b
        L_0x004d:
            java.lang.String r2 = "title"
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r3.<init>(r13)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r8.put(r2, r3)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
        L_0x005b:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0072
        L_0x0061:
            r0 = move-exception
            goto L_0x0067
        L_0x0063:
            r14 = r1
            goto L_0x006d
        L_0x0065:
            r0 = move-exception
            r1 = r14
        L_0x0067:
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            throw r0     // Catch:{ Exception -> 0x00ef }
        L_0x006d:
            if (r14 == 0) goto L_0x0072
            r14.close()     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            java.lang.String r1 = "status"
            java.lang.Integer r1 = r8.getAsInteger(r1)     // Catch:{ Exception -> 0x00ef }
            if (r1 == 0) goto L_0x0094
            int r2 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            r3 = 190(0xbe, float:2.66E-43)
            if (r2 == r3) goto L_0x0092
            int r2 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            r3 = 201(0xc9, float:2.82E-43)
            if (r2 == r3) goto L_0x0092
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00ef }
            r2 = 193(0xc1, float:2.7E-43)
            if (r1 != r2) goto L_0x0094
        L_0x0092:
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            java.lang.String r2 = "bypass_recommended_size_limit"
            boolean r2 = r8.containsKey(r2)     // Catch:{ Exception -> 0x00ef }
            if (r1 != 0) goto L_0x00a1
            if (r2 == 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r11 = r12
        L_0x00a1:
            android.content.UriMatcher r1 = f52565c     // Catch:{ Exception -> 0x00ef }
            int r1 = r1.match(r0)     // Catch:{ Exception -> 0x00ef }
            switch(r1) {
                case 1: goto L_0x00ad;
                case 2: goto L_0x00ad;
                default: goto L_0x00aa;
            }     // Catch:{ Exception -> 0x00ef }
        L_0x00aa:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x00ef }
            goto L_0x00dd
        L_0x00ad:
            r2 = r18
            r3 = r19
            com.ss.android.download.f$b r2 = r15.m63832a(r0, r2, r3, r1)     // Catch:{ Exception -> 0x00ef }
            int r3 = r17.size()     // Catch:{ Exception -> 0x00ef }
            if (r3 <= 0) goto L_0x00ca
            java.lang.String r3 = "ss_downloads"
            java.lang.String r4 = r2.mo51454a()     // Catch:{ Exception -> 0x00ef }
            java.lang.String[] r2 = r2.mo51456b()     // Catch:{ Exception -> 0x00ef }
            int r2 = r10.update(r3, r8, r4, r2)     // Catch:{ Exception -> 0x00ef }
            goto L_0x00cb
        L_0x00ca:
            r2 = 0
        L_0x00cb:
            r15.m63836a(r0, r1)     // Catch:{ Exception -> 0x00ef }
            if (r11 == 0) goto L_0x00dc
            android.content.Context r0 = r7.f52571b     // Catch:{ Exception -> 0x00ef }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x00dc }
            java.lang.Class<com.ss.android.download.DownloadService> r3 = com.p280ss.android.download.DownloadService.class
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x00dc }
            r0.startService(r1)     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            return r2
        L_0x00dd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ef }
            java.lang.String r3 = "Cannot update URI: "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00ef }
            r2.append(r0)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00ef }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00ef }
            throw r1     // Catch:{ Exception -> 0x00ef }
        L_0x00ef:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19422f.mo51449a(android.net.Uri, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    /* renamed from: a */
    private static void m63837a(String[] strArr, String str, String[] strArr2, String str2, SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("starting query, database is ");
        if (sQLiteDatabase != null) {
            sb.append("not ");
        }
        sb.append("null; ");
        if (strArr == null) {
            sb.append("projection is null; ");
        } else if (strArr.length == 0) {
            sb.append("projection is empty; ");
        } else {
            for (int i = 0; i < strArr.length; i++) {
                sb.append("projection[");
                sb.append(i);
                sb.append("] is ");
                sb.append(strArr[i]);
                sb.append("; ");
            }
        }
        sb.append("selection is ");
        sb.append(str);
        sb.append("; ");
        if (strArr2 == null) {
            sb.append("selectionArgs is null; ");
        } else if (strArr2.length == 0) {
            sb.append("selectionArgs is empty; ");
        } else {
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                sb.append("selectionArgs[");
                sb.append(i2);
                sb.append("] is ");
                sb.append(strArr2[i2]);
                sb.append("; ");
            }
        }
        sb.append("sort is ");
        sb.append(str2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
    }
}
