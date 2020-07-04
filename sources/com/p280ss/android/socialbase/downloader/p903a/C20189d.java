package com.p280ss.android.socialbase.downloader.p903a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.p280ss.android.socialbase.downloader.utils.C20401g;

/* renamed from: com.ss.android.socialbase.downloader.a.d */
public final class C20189d {

    /* renamed from: a */
    private final SQLiteDatabase f54623a;

    /* renamed from: b */
    private final String f54624b;

    /* renamed from: c */
    private final String[] f54625c;

    /* renamed from: d */
    private final String[] f54626d;

    /* renamed from: e */
    private SQLiteStatement f54627e;

    /* renamed from: f */
    private SQLiteStatement f54628f;

    /* renamed from: g */
    private SQLiteStatement f54629g;

    /* renamed from: a */
    public final SQLiteStatement mo54084a() {
        if (this.f54627e == null) {
            SQLiteStatement compileStatement = this.f54623a.compileStatement(C20401g.m67698a("INSERT INTO ", this.f54624b, this.f54625c));
            synchronized (this) {
                if (this.f54627e == null) {
                    this.f54627e = compileStatement;
                }
            }
            if (this.f54627e != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f54627e;
    }

    /* renamed from: b */
    public final SQLiteStatement mo54085b() {
        if (this.f54629g == null) {
            SQLiteStatement compileStatement = this.f54623a.compileStatement(C20401g.m67699a(this.f54624b, this.f54626d));
            synchronized (this) {
                if (this.f54629g == null) {
                    this.f54629g = compileStatement;
                }
            }
            if (this.f54629g != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f54629g;
    }

    /* renamed from: c */
    public final SQLiteStatement mo54086c() {
        if (this.f54628f == null) {
            SQLiteStatement compileStatement = this.f54623a.compileStatement(C20401g.m67700a(this.f54624b, this.f54625c, this.f54626d));
            synchronized (this) {
                if (this.f54628f == null) {
                    this.f54628f = compileStatement;
                }
            }
            if (this.f54628f != compileStatement) {
                compileStatement.close();
            }
        }
        return this.f54628f;
    }

    public C20189d(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.f54623a = sQLiteDatabase;
        this.f54624b = str;
        this.f54625c = strArr;
        this.f54626d = strArr2;
    }
}
