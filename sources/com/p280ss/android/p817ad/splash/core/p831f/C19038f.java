package com.p280ss.android.p817ad.splash.core.p831f;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.p280ss.android.p817ad.splash.core.p826a.C18963a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.f.f */
public final class C19038f implements C19037e {

    /* renamed from: a */
    C18963a f51453a;

    /* renamed from: b */
    public static String m62218b() {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append("trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,");
        sb.append("id TEXT UNIQUE,");
        sb.append("url TEXT ,");
        sb.append("replaceholder INTEGER default 0, ");
        sb.append("retry INTEGER default 0, ");
        sb.append("type INTEGER default 0, ");
        sb.append("cid BIGINT default 0, ");
        sb.append("log_extra TEXT");
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final List<C19036d> mo50532a() {
        boolean z;
        LinkedList linkedList = new LinkedList();
        Cursor a = this.f51453a.mo50389a().mo50404a("trackurl", null, null, null, null, null, null);
        while (a.moveToNext()) {
            try {
                String string = a.getString(a.getColumnIndex("id"));
                String string2 = a.getString(a.getColumnIndex("url"));
                if (a.getInt(a.getColumnIndex("replaceholder")) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C19036d dVar = new C19036d(a.getLong(a.getColumnIndex("cid")), a.getString(a.getColumnIndex("log_extra")), string, string2, z, a.getInt(a.getColumnIndex("retry")), a.getInt(a.getColumnIndex("type")));
                linkedList.add(dVar);
            } catch (Exception unused) {
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        return linkedList;
    }

    public C19038f(Context context) {
        this.f51453a = C18963a.m61924a(context.getApplicationContext());
    }

    /* renamed from: c */
    public final void mo50535c(C19036d dVar) {
        this.f51453a.mo50389a().mo50402a("trackurl", "id=?", new String[]{dVar.f51446a});
    }

    /* renamed from: b */
    public final void mo50534b(C19036d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dVar.f51446a);
        contentValues.put("url", dVar.f51447b);
        contentValues.put("replaceholder", Integer.valueOf(dVar.f51448c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(dVar.f51449d));
        contentValues.put("type", Integer.valueOf(dVar.f51450e));
        contentValues.put("cid", Long.valueOf(dVar.f51451f));
        contentValues.put("log_extra", dVar.f51452g);
        this.f51453a.mo50389a().mo50401a("trackurl", contentValues, "id=?", new String[]{dVar.f51446a});
    }

    /* renamed from: a */
    public final void mo50533a(C19036d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dVar.f51446a);
        contentValues.put("url", dVar.f51447b);
        contentValues.put("replaceholder", Integer.valueOf(dVar.f51448c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(dVar.f51449d));
        contentValues.put("type", Integer.valueOf(dVar.f51450e));
        contentValues.put("cid", Long.valueOf(dVar.f51451f));
        contentValues.put("log_extra", dVar.f51452g);
        this.f51453a.mo50389a().mo50403a("trackurl", (String) null, contentValues);
    }
}
