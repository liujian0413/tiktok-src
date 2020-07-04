package com.p280ss.android.p817ad.splash.core.p826a;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.p280ss.android.p817ad.splash.core.p831f.C19038f;

/* renamed from: com.ss.android.ad.splash.core.a.b */
public class C18964b {

    /* renamed from: b */
    public static final Object f51131b = new Object();

    /* renamed from: a */
    public Context f51132a;

    /* renamed from: c */
    private C18967c f51133c;

    /* renamed from: com.ss.android.ad.splash.core.a.b$a */
    protected class C18965a extends SQLiteOpenHelper {

        /* renamed from: a */
        Context f51134a;

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            m61927a(sQLiteDatabase, this.f51134a);
        }

        /* renamed from: a */
        private static void m61927a(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(C19038f.m62218b());
        }

        public C18965a(Context context) {
            super(context, "splashsdk.db", null, 1);
            this.f51134a = context;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.a.b$b */
    public class C18966b extends AbstractCursor {
        public final String[] getColumnNames() {
            return new String[0];
        }

        public final int getCount() {
            return 0;
        }

        public final double getDouble(int i) {
            return 0.0d;
        }

        public final float getFloat(int i) {
            return 0.0f;
        }

        public final int getInt(int i) {
            return 0;
        }

        public final long getLong(int i) {
            return 0;
        }

        public final short getShort(int i) {
            return 0;
        }

        public final String getString(int i) {
            return null;
        }

        public final boolean isNull(int i) {
            return true;
        }

        public C18966b() {
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.a.b$c */
    public class C18967c {

        /* renamed from: b */
        private volatile SQLiteDatabase f51138b;

        /* renamed from: a */
        private void m61928a() {
            try {
                synchronized (C18964b.f51131b) {
                    if (this.f51138b == null || !this.f51138b.isOpen()) {
                        this.f51138b = new C18965a(C18964b.this.f51132a).getWritableDatabase();
                        this.f51138b.setLockingEnabled(false);
                    }
                }
            } catch (Throwable unused) {
            }
        }

        public C18967c() {
        }

        /* renamed from: a */
        public final int mo50402a(String str, String str2, String[] strArr) {
            try {
                m61928a();
                return this.f51138b.delete(str, str2, strArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        /* renamed from: a */
        public final long mo50403a(String str, String str2, ContentValues contentValues) {
            try {
                m61928a();
                return this.f51138b.insert(str, null, contentValues);
            } catch (Exception unused) {
                return -1;
            }
        }

        /* renamed from: a */
        public final int mo50401a(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                m61928a();
                return this.f51138b.update(str, contentValues, str2, strArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        /* renamed from: a */
        public final Cursor mo50404a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                m61928a();
                return this.f51138b.query(str, null, null, null, null, null, null);
            } catch (Throwable unused) {
                return new C18966b();
            }
        }
    }

    /* renamed from: a */
    public C18967c mo50389a() {
        return this.f51133c;
    }

    C18964b(Context context) {
        this.f51132a = context.getApplicationContext();
        if (this.f51133c == null) {
            this.f51133c = new C18967c();
        }
    }
}
