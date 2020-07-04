package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1602d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.draft.C27305d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.model.Face;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.b */
public class C40533b {

    /* renamed from: a */
    private static C40533b f105336a;

    /* renamed from: b */
    private C27305d f105337b = C27305d.m89405a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.d.b$a */
    interface C40535a<T> {
        /* renamed from: a */
        void mo100607a(T t);
    }

    private C40533b() {
    }

    /* renamed from: a */
    public static C40533b m129595a() {
        if (f105336a == null) {
            synchronized (C40533b.class) {
                if (f105336a == null) {
                    f105336a = new C40533b();
                }
            }
        }
        return f105336a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r2 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r2 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.shortvideo.model.Face> mo100605b() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            com.ss.android.ugc.aweme.draft.d r2 = r5.f105337b     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            java.lang.String r3 = "select * from 'face' order by 'date_added' desc"
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0030, all -> 0x002d }
            if (r2 == 0) goto L_0x002a
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x0028 }
            if (r1 <= 0) goto L_0x002a
        L_0x001a:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0028 }
            if (r1 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.shortvideo.model.Face r1 = m129594a(r2)     // Catch:{ Exception -> 0x0028 }
            r0.add(r1)     // Catch:{ Exception -> 0x0028 }
            goto L_0x001a
        L_0x0028:
            r1 = move-exception
            goto L_0x0034
        L_0x002a:
            if (r2 == 0) goto L_0x003c
            goto L_0x0039
        L_0x002d:
            r0 = move-exception
            r2 = r1
            goto L_0x003e
        L_0x0030:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L_0x0034:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r1)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x003c
        L_0x0039:
            r2.close()
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r2.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.p1602d.C40533b.mo100605b():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r2 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo100606c() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            com.ss.android.ugc.aweme.draft.d r2 = r5.f105337b     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            java.lang.String r3 = "select origin_path from face group by origin_path"
            android.database.Cursor r2 = r2.rawQuery(r3, r1)     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            if (r2 == 0) goto L_0x002b
            int r1 = r2.getCount()     // Catch:{ Exception -> 0x0029 }
            if (r1 <= 0) goto L_0x002b
        L_0x001a:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0029 }
            if (r1 == 0) goto L_0x002b
            r1 = 0
            java.lang.String r1 = r2.getString(r1)     // Catch:{ Exception -> 0x0029 }
            r0.add(r1)     // Catch:{ Exception -> 0x0029 }
            goto L_0x001a
        L_0x0029:
            r1 = move-exception
            goto L_0x0035
        L_0x002b:
            if (r2 == 0) goto L_0x003d
            goto L_0x003a
        L_0x002e:
            r0 = move-exception
            r2 = r1
            goto L_0x003f
        L_0x0031:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L_0x0035:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21554a(r1)     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x003d
        L_0x003a:
            r2.close()
        L_0x003d:
            return r0
        L_0x003e:
            r0 = move-exception
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            r2.close()
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.p1602d.C40533b.mo100606c():java.util.List");
    }

    /* renamed from: a */
    public final void mo100604a(final Set<String> set) {
        m129596a(this.f105337b.getWritableDatabase(), (C40535a<SQLiteDatabase>) new C40535a<SQLiteDatabase>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo100607a(SQLiteDatabase sQLiteDatabase) {
                for (String str : set) {
                    sQLiteDatabase.delete("face", "origin_path = ?", new String[]{str});
                }
            }
        });
    }

    /* renamed from: a */
    private static Face m129594a(Cursor cursor) {
        Face face = new Face();
        face.path = cursor.getString(cursor.getColumnIndex("path"));
        face.origin_path = cursor.getString(cursor.getColumnIndex("origin_path"));
        face.width = cursor.getInt(cursor.getColumnIndex("width"));
        face.height = cursor.getInt(cursor.getColumnIndex("height"));
        face.data_added = cursor.getLong(cursor.getColumnIndex("date_added"));
        return face;
    }

    /* renamed from: a */
    public final void mo100603a(Face face) {
        try {
            ContentValues contentValues = new ContentValues();
            m129597a(face, contentValues);
            this.f105337b.getWritableDatabase().insertWithOnConflict("face", null, contentValues, 4);
        } catch (SQLiteFullException e) {
            this.f105337b.getWritableDatabase().delete("face", null, null);
            C9738o.m28693a((Context) C35574k.m114861b(), (int) R.string.at0);
            C6921a.m21559a((Throwable) e);
        } catch (Exception e2) {
            C6921a.m21559a((Throwable) e2);
        }
    }

    /* renamed from: a */
    private static void m129596a(SQLiteDatabase sQLiteDatabase, C40535a<SQLiteDatabase> aVar) {
        if (sQLiteDatabase.isOpen()) {
            try {
                sQLiteDatabase.acquireReference();
                sQLiteDatabase.beginTransaction();
                aVar.mo100607a(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e) {
                C6921a.m21554a(e);
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                sQLiteDatabase.releaseReference();
                throw th;
            }
            sQLiteDatabase.endTransaction();
            sQLiteDatabase.releaseReference();
        }
    }

    /* renamed from: a */
    private static void m129597a(Face face, ContentValues contentValues) {
        contentValues.put("path", face.path);
        contentValues.put("origin_path", face.origin_path);
        contentValues.put("width", Integer.valueOf(face.width));
        contentValues.put("height", Integer.valueOf(face.height));
        contentValues.put("date_added", Long.valueOf(face.data_added));
    }
}
