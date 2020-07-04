package com.bytedance.ies.geckoclient.p567a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.ies.geckoclient.C10851d;
import com.bytedance.p505d.p506a.C10031a;
import com.bytedance.p505d.p506a.C10032b;
import java.io.File;

/* renamed from: com.bytedance.ies.geckoclient.a.e */
final class C10842e extends C10839b {
    C10842e() {
    }

    /* renamed from: a */
    private void m31801a() {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        Cursor rawQuery;
        Cursor cursor = null;
        try {
            sQLiteDatabase = C10032b.m29806a(this.f29353h).getWritableDatabase();
            try {
                StringBuilder sb = new StringBuilder("SELECT * FROM ");
                sb.append(this.f29350e);
                rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            } catch (Exception unused) {
                C10031a.m29804a(cursor);
                C10031a.m29805a(sQLiteDatabase);
            } catch (Throwable th2) {
                th = th2;
                C10031a.m29804a(cursor);
                C10031a.m29805a(sQLiteDatabase);
                throw th;
            }
            try {
                int count = rawQuery.getCount() - this.f29349d.f29340a;
                while (true) {
                    int i = count - 1;
                    if (count <= 0) {
                        break;
                    }
                    if (rawQuery.moveToNext() && m31803a(rawQuery)) {
                        m31802a(sQLiteDatabase, rawQuery);
                    }
                    count = i;
                }
                C10031a.m29804a(rawQuery);
            } catch (Exception unused2) {
                cursor = rawQuery;
                C10031a.m29804a(cursor);
                C10031a.m29805a(sQLiteDatabase);
            } catch (Throwable th3) {
                Cursor cursor2 = rawQuery;
                th = th3;
                cursor = cursor2;
                C10031a.m29804a(cursor);
                C10031a.m29805a(sQLiteDatabase);
                throw th;
            }
        } catch (Exception unused3) {
            sQLiteDatabase = null;
            C10031a.m29804a(cursor);
            C10031a.m29805a(sQLiteDatabase);
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = null;
            C10031a.m29804a(cursor);
            C10031a.m29805a(sQLiteDatabase);
            throw th;
        }
        C10031a.m29805a(sQLiteDatabase);
    }

    /* renamed from: a */
    public final void mo26171a(String str) {
        m31801a();
    }

    /* renamed from: a */
    private boolean m31803a(Cursor cursor) {
        try {
            String string = cursor.getString(cursor.getColumnIndex("update_zip"));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f29352g);
            sb.append(string);
            boolean b = C10851d.m31824b(sb.toString()) | false;
            String string2 = cursor.getString(cursor.getColumnIndex("update_zip_dir"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f29352g);
            sb2.append(string2);
            boolean a = b | C10851d.m31822a(sb2.toString());
            String string3 = cursor.getString(cursor.getColumnIndex("patch_zip"));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f29352g);
            sb3.append(string3);
            boolean a2 = a | C10851d.m31822a(sb3.toString());
            String string4 = cursor.getString(cursor.getColumnIndex("zip"));
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f29352g);
            sb4.append(string4);
            boolean b2 = a2 | C10851d.m31823b(new File(sb4.toString()));
            String string5 = cursor.getString(cursor.getColumnIndex("package_dir"));
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f29352g);
            sb5.append(string5);
            return C10851d.m31822a(sb5.toString()) | b2;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m31802a(SQLiteDatabase sQLiteDatabase, Cursor cursor) {
        try {
            String string = cursor.getString(cursor.getColumnIndex("channel"));
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(this.f29350e);
            sb.append(" where channel");
            sb.append(" = \"");
            sb.append(string);
            sb.append("\"");
            sQLiteDatabase.execSQL(sb.toString());
            if (this.f29349d.f29342c != null) {
                this.f29349d.f29342c.mo26172a(string);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo26170a(Context context, C10836a aVar, String str, String str2, String str3) {
        super.mo26170a(context, aVar, str, str2, str3);
    }
}
