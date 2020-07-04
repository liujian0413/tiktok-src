package com.p280ss.android.ugc.aweme.p313im.sdk.storage.p1347a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31870ap;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.storage.a.b */
public final class C31848b {

    /* renamed from: a */
    private static C31870ap<C31848b> f83311a = new C31870ap<C31848b>() {
        /* renamed from: c */
        private static C31848b m103355c() {
            return new C31848b();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18004a() {
            return m103355c();
        }
    };

    /* renamed from: b */
    private C31847a f83312b;

    /* renamed from: c */
    private SQLiteDatabase f83313c = m103347e();

    /* renamed from: d */
    private String f83314d;

    /* renamed from: a */
    public static C31848b m103344a() {
        return (C31848b) f83311a.mo82721b();
    }

    /* renamed from: d */
    private boolean m103346d() {
        if (this.f83313c == null || !this.f83313c.isOpen()) {
            this.f83313c = m103347e();
        }
        if (this.f83313c == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo82678b() {
        if (!m103346d() && !this.f83313c.inTransaction()) {
            try {
                this.f83313c.beginTransaction();
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    /* renamed from: c */
    public final void mo82679c() {
        if (!m103346d() && this.f83313c.inTransaction()) {
            try {
                this.f83313c.setTransactionSuccessful();
                this.f83313c.endTransaction();
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    /* renamed from: e */
    private SQLiteDatabase m103347e() {
        String str = "db_im_xx";
        try {
            if (this.f83313c != null && TextUtils.equals(str, this.f83314d) && this.f83313c.isOpen()) {
                return this.f83313c;
            }
            if (this.f83313c != null) {
                m103345a(this.f83313c);
            }
            if (this.f83312b == null) {
                this.f83312b = new C31847a(C6399b.m19921a(), "db_im_xx");
            }
            this.f83314d = str;
            this.f83313c = this.f83312b.getWritableDatabase();
            return this.f83313c;
        } catch (Exception e) {
            if (C7276d.m22827h() < 20971520) {
                C9738o.m28693a(C6399b.m19921a(), (int) R.string.boy);
            }
            C6921a.m21559a((Throwable) e);
        }
    }

    /* renamed from: a */
    private static void m103345a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo82676a(String str) {
        boolean z = false;
        if (m103346d()) {
            return false;
        }
        try {
            this.f83313c.execSQL(str);
            z = true;
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11209d.m32831b(e));
            C7074e.m22065a("db_exec_failed", hashMap);
        }
        return z;
    }

    /* renamed from: a */
    public final Cursor mo82675a(String str, String[] strArr) {
        Cursor cursor;
        if (m103346d()) {
            return null;
        }
        try {
            cursor = this.f83313c.rawQuery(str, null);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11209d.m32831b(e));
            C7074e.m22065a("db_query_failed", hashMap);
            cursor = null;
        }
        return cursor;
    }

    /* renamed from: a */
    public final long mo82674a(String str, String str2, ContentValues contentValues) {
        if (m103346d() || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return this.f83313c.replace(str, null, contentValues);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11209d.m32831b(e));
            C7074e.m22065a("db_replace_failed", hashMap);
            return -1;
        }
    }

    /* renamed from: a */
    public final boolean mo82677a(String str, String str2, String[] strArr) {
        if (m103346d() || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.f83313c.delete(str, null, null) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11209d.m32831b(e));
            C7074e.m22065a("db_delete_failed", hashMap);
            return false;
        }
    }

    /* renamed from: a */
    public final int mo82673a(String str, ContentValues contentValues, String str2, String[] strArr) {
        if (m103346d() || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return this.f83313c.update(str, contentValues, str2, strArr);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", C11209d.m32831b(e));
            C7074e.m22065a("db_update_failed", hashMap);
            return -1;
        }
    }
}
