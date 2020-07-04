package com.bytedance.ies.geckoclient;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.geckoclient.model.C10909j;
import com.bytedance.p505d.p506a.C10031a;
import com.bytedance.p505d.p506a.C10032b;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.l */
public final class C10890l {

    /* renamed from: a */
    private String f29456a;

    /* renamed from: b */
    private String f29457b;

    /* renamed from: c */
    private String f29458c;

    /* renamed from: d */
    private Context f29459d;

    /* renamed from: a */
    public final void mo26267a(Map<String, C10903d> map, String str, String str2) {
        ArrayList<C10903d> arrayList = new ArrayList<>();
        if (map.size() > 0) {
            arrayList.addAll(map.values());
        }
        if (arrayList.size() > 0) {
            for (C10903d b : arrayList) {
                m31985b(b, str, str2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo26266a(Map<String, C10903d> map) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = C10032b.m29806a(this.f29459d).getWritableDatabase();
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(this.f29456a);
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    m31982a(map, rawQuery);
                }
                rawQuery.close();
            }
            m31979a(sQLiteDatabase);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo26268a(String str, String str2) {
        SQLiteDatabase writableDatabase = C10032b.m29806a(this.f29459d).getWritableDatabase();
        StringBuilder sb = new StringBuilder("SELECT package_dir,zip FROM ");
        sb.append(this.f29456a);
        sb.append(" where channel");
        sb.append(" = \"");
        sb.append(str2);
        sb.append("\"");
        Cursor rawQuery = writableDatabase.rawQuery(sb.toString(), null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(rawQuery.getColumnIndex("package_dir"));
                if (!TextUtils.isEmpty(string)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(string);
                    C10851d.m31822a(sb2.toString());
                }
                String string2 = rawQuery.getString(rawQuery.getColumnIndex("zip"));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(string2);
                C10851d.m31824b(sb3.toString());
            }
            rawQuery.close();
            try {
                StringBuilder sb4 = new StringBuilder("DELETE FROM ");
                sb4.append(this.f29456a);
                sb4.append(" where channel");
                sb4.append(" = \"");
                sb4.append(str2);
                sb4.append("\"");
                writableDatabase.execSQL(sb4.toString());
            } catch (Exception unused) {
                return false;
            }
        }
        m31979a(writableDatabase);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo26269b(C10903d dVar) {
        m31986c(dVar);
    }

    /* renamed from: a */
    private static void m31979a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            sQLiteDatabase.close();
            new StringBuilder("close db ").append(Thread.currentThread());
        }
    }

    /* renamed from: c */
    private void m31986c(C10903d dVar) {
        Cursor cursor;
        if (dVar != null) {
            SQLiteDatabase writableDatabase = C10032b.m29806a(this.f29459d).getWritableDatabase();
            Cursor cursor2 = null;
            try {
                writableDatabase.beginTransaction();
                SQLiteDatabase sQLiteDatabase = writableDatabase;
                cursor = sQLiteDatabase.query(this.f29456a, new String[0], "channel=?", new String[]{dVar.f29508c}, null, null, null);
                try {
                    if (cursor.getCount() == 0) {
                        m31984b(writableDatabase, dVar);
                    } else {
                        m31980a(writableDatabase, dVar);
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    writableDatabase.endTransaction();
                    C10031a.m29804a(cursor2);
                    throw th;
                }
            } catch (Exception unused2) {
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                writableDatabase.endTransaction();
                C10031a.m29804a(cursor2);
                throw th;
            }
            writableDatabase.endTransaction();
            C10031a.m29804a(cursor);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo26264a(C10903d dVar) {
        m31986c(dVar);
    }

    /* renamed from: a */
    private static boolean m31983a(File file, File file2) {
        C10851d.m31821a(file2);
        if (file.renameTo(file2)) {
            return true;
        }
        boolean b = C10851d.m31825b(file.getAbsolutePath(), file2.getAbsolutePath());
        if (b) {
            C10851d.m31821a(file);
        }
        return b;
    }

    /* renamed from: a */
    private void m31980a(SQLiteDatabase sQLiteDatabase, C10903d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("channel", dVar.f29508c);
        contentValues.put(C38347c.f99551f, Integer.valueOf(dVar.f29506a));
        contentValues.put("update_when_launch", Integer.valueOf(dVar.f29507b));
        contentValues.put("zip", dVar.f29510e);
        contentValues.put("package_dir", dVar.f29509d);
        contentValues.put("patch_zip", dVar.f29511f);
        contentValues.put("update_done", Integer.valueOf(1));
        contentValues.put("extra", dVar.f29513h);
        C10909j jVar = dVar.f29515j;
        if (jVar != null) {
            contentValues.put("package_type", Integer.valueOf(jVar.f29542c));
        }
        sQLiteDatabase.update(this.f29456a, contentValues, "channel=?", new String[]{dVar.f29508c});
        StringBuilder sb = new StringBuilder("update package to local:");
        sb.append(dVar.toString());
        sb.append(Thread.currentThread());
    }

    /* renamed from: b */
    private void m31984b(SQLiteDatabase sQLiteDatabase, C10903d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("channel", dVar.f29508c);
        contentValues.put(C38347c.f99551f, Integer.valueOf(dVar.f29506a));
        contentValues.put("update_when_launch", Integer.valueOf(dVar.f29507b));
        contentValues.put("zip", dVar.f29510e);
        contentValues.put("package_dir", dVar.f29509d);
        contentValues.put("patch_zip", dVar.f29511f);
        contentValues.put("update_done", Integer.valueOf(1));
        contentValues.put("extra", dVar.f29513h);
        C10909j jVar = dVar.f29515j;
        if (jVar != null) {
            contentValues.put("package_type", Integer.valueOf(jVar.f29542c));
        } else {
            contentValues.put("package_type", Integer.valueOf(-1));
        }
        new StringBuilder("insert to db:").append(dVar.f29508c);
        sQLiteDatabase.insert(this.f29456a, null, contentValues);
        contentValues.clear();
        StringBuilder sb = new StringBuilder("update package to local:");
        sb.append(dVar.toString());
        sb.append(Thread.currentThread());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26263a(int r7, com.bytedance.ies.geckoclient.model.C10903d r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 == 0) goto L_0x00aa
            boolean r0 = r8.f29514i     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x00aa
            com.bytedance.ies.geckoclient.model.j r0 = r8.f29515j     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x000d
            goto L_0x00aa
        L_0x000d:
            com.bytedance.ies.geckoclient.model.j r0 = r8.f29515j     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.model.j$b r0 = r0.mo26309a()     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.model.j r1 = r8.f29515j     // Catch:{ all -> 0x00a7 }
            com.bytedance.ies.geckoclient.model.j$b r1 = r1.mo26310b()     // Catch:{ all -> 0x00a7 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x00a7 }
            r2.<init>()     // Catch:{ all -> 0x00a7 }
            r3 = 0
            switch(r7) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0049;
                case 2: goto L_0x0037;
                case 3: goto L_0x0023;
                default: goto L_0x0022;
            }     // Catch:{ all -> 0x00a7 }
        L_0x0022:
            goto L_0x0075
        L_0x0023:
            com.bytedance.ies.geckoclient.model.j r7 = r8.f29515j     // Catch:{ all -> 0x00a7 }
            java.lang.String r7 = r7.f29543d     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = "update_zip"
            com.bytedance.ies.geckoclient.model.j r0 = r8.f29515j     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r0.f29543d     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0075
        L_0x0037:
            if (r0 == 0) goto L_0x0075
            java.lang.String r7 = r0.f29554f     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = "update_zip_dir"
            java.lang.String r0 = r0.f29554f     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0075
        L_0x0049:
            if (r0 == 0) goto L_0x005a
            java.lang.String r7 = r0.f29553e     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x005a
            java.lang.String r7 = "update_zip"
            java.lang.String r0 = r0.f29553e     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
        L_0x005a:
            if (r1 == 0) goto L_0x0075
            java.lang.String r7 = r1.f29553e     // Catch:{ all -> 0x00a7 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a7 }
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = "patch_zip"
            java.lang.String r0 = r1.f29553e     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0075
        L_0x006c:
            java.lang.String r7 = "update_done"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00a7 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a7 }
        L_0x0075:
            android.content.Context r7 = r6.f29459d     // Catch:{ all -> 0x00a7 }
            com.bytedance.d.a.b r7 = com.bytedance.p505d.p506a.C10032b.m29806a(r7)     // Catch:{ all -> 0x00a7 }
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r6.f29456a     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "channel=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = r8.f29508c     // Catch:{ all -> 0x00a7 }
            r4[r3] = r5     // Catch:{ all -> 0x00a7 }
            r7.update(r0, r2, r1, r4)     // Catch:{ all -> 0x00a7 }
            m31979a(r7)     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "update status to local:"
            r7.<init>(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00a7 }
            r7.append(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00a7 }
            r7.append(r8)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r6)
            return
        L_0x00a7:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00aa:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.geckoclient.C10890l.mo26263a(int, com.bytedance.ies.geckoclient.model.d):void");
    }

    /* renamed from: a */
    private void m31982a(Map<String, C10903d> map, Cursor cursor) {
        File file;
        String string = cursor.getString(cursor.getColumnIndex("channel"));
        C10903d dVar = (C10903d) map.get(string);
        if (dVar != null) {
            if (cursor.getInt(cursor.getColumnIndex("update_done")) == 0) {
                String string2 = cursor.getString(cursor.getColumnIndex("update_zip"));
                if (!TextUtils.isEmpty(string2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f29458c);
                    sb.append(string2);
                    C10851d.m31824b(sb.toString());
                }
                String string3 = cursor.getString(cursor.getColumnIndex("update_zip_dir"));
                if (!TextUtils.isEmpty(string3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f29458c);
                    sb2.append(string3);
                    C10851d.m31822a(sb2.toString());
                }
                String string4 = cursor.getString(cursor.getColumnIndex("patch_zip"));
                if (!TextUtils.isEmpty(string4)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f29458c);
                    sb3.append(string4);
                    C10851d.m31822a(sb3.toString());
                }
            }
            String string5 = cursor.getString(cursor.getColumnIndex("zip"));
            String string6 = cursor.getString(cursor.getColumnIndex("package_dir"));
            int i = cursor.getInt(cursor.getColumnIndex("package_type"));
            dVar.f29512g = i;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f29458c);
            sb4.append(string6);
            File file2 = new File(sb4.toString());
            if (i == 1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.f29458c);
                sb5.append(string);
                sb5.append("/");
                sb5.append(string5);
                file = new File(sb5.toString());
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(this.f29458c);
                sb6.append(string5);
                file = new File(sb6.toString());
            }
            int i2 = cursor.getInt(cursor.getColumnIndex("update_when_launch"));
            if ((!file2.exists() || !file.exists()) && i2 == 0) {
                if (!TextUtils.isEmpty(string5)) {
                    C10851d.m31823b(file);
                }
                if (!TextUtils.isEmpty(string6)) {
                    C10851d.m31821a(file2);
                }
                dVar.f29506a = 0;
                dVar.f29507b = 0;
            } else {
                dVar.f29506a = cursor.getInt(cursor.getColumnIndex(C38347c.f99551f));
                dVar.f29507b = i2;
            }
            dVar.f29510e = cursor.getString(cursor.getColumnIndex("zip"));
            dVar.f29509d = cursor.getString(cursor.getColumnIndex("package_dir"));
            dVar.f29511f = cursor.getString(cursor.getColumnIndex("patch_zip"));
            dVar.f29513h = cursor.getString(cursor.getColumnIndex("extra"));
            dVar.f29514i = true;
            StringBuilder sb7 = new StringBuilder("update package from local:");
            sb7.append(dVar.toString());
            sb7.append(Thread.currentThread());
        }
    }

    /* renamed from: a */
    private void m31981a(C10903d dVar, String str, String str2) {
        m31985b(dVar, str, str2);
        if (dVar.f29514i) {
            mo26269b(dVar);
        } else {
            mo26264a(dVar);
        }
    }

    /* renamed from: b */
    private static void m31985b(C10903d dVar, String str, String str2) {
        if (dVar.f29507b == 1) {
            String a = C10851d.m31820a(str, dVar.f29508c);
            String a2 = C10851d.m31820a(str2, dVar.f29508c);
            C10851d.m31822a(a2);
            if (C10851d.m31825b(a, a2)) {
                C10851d.m31822a(a);
                dVar.f29507b = 0;
            }
        }
    }

    /* renamed from: b */
    public final void mo26270b(Map<String, C10903d> map, String str, String str2) {
        ArrayList<C10903d> arrayList = new ArrayList<>();
        if (map.size() > 0) {
            arrayList.addAll(map.values());
        }
        if (arrayList.size() > 0) {
            for (C10903d a : arrayList) {
                m31981a(a, str, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo26265a(Iterable<C10903d> iterable, String str, String str2) {
        if (iterable != null) {
            ArrayList<C10903d> arrayList = new ArrayList<>();
            for (C10903d dVar : iterable) {
                if (dVar.f29507b == 1) {
                    arrayList.add(dVar);
                }
            }
            if (!arrayList.isEmpty()) {
                for (C10903d dVar2 : arrayList) {
                    dVar2.f29507b = 0;
                    try {
                        if (!m31983a(new File(C10851d.m31820a(str, dVar2.f29508c)), new File(C10851d.m31820a(str2, dVar2.f29508c)))) {
                            dVar2.f29506a = 0;
                        }
                    } catch (Exception unused) {
                        dVar2.f29506a = 0;
                    }
                }
                SQLiteDatabase writableDatabase = C10032b.m29806a(this.f29459d).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (C10903d dVar3 : arrayList) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("update_when_launch", Integer.valueOf(dVar3.f29507b));
                        contentValues.put(C38347c.f99551f, Integer.valueOf(dVar3.f29506a));
                        writableDatabase.update(this.f29456a, contentValues, "channel=?", new String[]{dVar3.f29508c});
                    }
                    writableDatabase.setTransactionSuccessful();
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    C10031a.m29805a(writableDatabase);
                    throw th;
                }
                writableDatabase.endTransaction();
                C10031a.m29805a(writableDatabase);
            }
        }
    }

    C10890l(Context context, String str, String str2, String str3) {
        this.f29456a = str;
        this.f29457b = str2;
        this.f29458c = str3;
        this.f29459d = context;
    }
}
