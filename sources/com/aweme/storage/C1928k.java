package com.aweme.storage;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0148b;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.aweme.storage.k */
public final class C1928k implements C1927j {

    /* renamed from: a */
    private final RoomDatabase f6950a;

    /* renamed from: b */
    private final C0155c f6951b;

    /* renamed from: c */
    private final C0148b f6952c;

    /* renamed from: d */
    private final C0148b f6953d;

    /* renamed from: a */
    public final List<C1934m> mo7548a() {
        C0164h a = C0164h.m457a("select * from black_tb", 0);
        Cursor a2 = this.f6950a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("path");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("size");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("date");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("count");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C1934m mVar = new C1934m(a2.getString(columnIndexOrThrow2), a2.getLong(columnIndexOrThrow4), a2.getInt(columnIndexOrThrow5));
                mVar.f6958a = a2.getInt(columnIndexOrThrow);
                mVar.f6960c = a2.getLong(columnIndexOrThrow3);
                arrayList.add(mVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    public C1928k(RoomDatabase roomDatabase) {
        this.f6950a = roomDatabase;
        this.f6951b = new C0155c<C1934m>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR ROLLBACK INTO `black_tb`(`id`,`path`,`size`,`date`,`count`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m8911a(fVar, (C1934m) obj);
            }

            /* renamed from: a */
            private static void m8911a(C0142f fVar, C1934m mVar) {
                fVar.mo290a(1, (long) mVar.f6958a);
                if (mVar.f6959b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo291a(2, mVar.f6959b);
                }
                fVar.mo290a(3, mVar.f6960c);
                fVar.mo290a(4, mVar.f6961d);
                fVar.mo290a(5, (long) mVar.f6962e);
            }
        };
        this.f6952c = new C0148b<C1934m>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM `black_tb` WHERE `id` = ?";
            }

            /* renamed from: a */
            private static void m8914a(C0142f fVar, C1934m mVar) {
                fVar.mo290a(1, (long) mVar.f6958a);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo331a(C0142f fVar, Object obj) {
                m8914a(fVar, (C1934m) obj);
            }
        };
        this.f6953d = new C0148b<C1934m>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "UPDATE OR REPLACE `black_tb` SET `id` = ?,`path` = ?,`size` = ?,`date` = ?,`count` = ? WHERE `id` = ?";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo331a(C0142f fVar, Object obj) {
                m8917a(fVar, (C1934m) obj);
            }

            /* renamed from: a */
            private static void m8917a(C0142f fVar, C1934m mVar) {
                fVar.mo290a(1, (long) mVar.f6958a);
                if (mVar.f6959b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo291a(2, mVar.f6959b);
                }
                fVar.mo290a(3, mVar.f6960c);
                fVar.mo290a(4, mVar.f6961d);
                fVar.mo290a(5, (long) mVar.f6962e);
                fVar.mo290a(6, (long) mVar.f6958a);
            }
        };
    }

    /* renamed from: a */
    public final void mo7549a(C1934m... mVarArr) {
        this.f6950a.mo313d();
        try {
            this.f6951b.mo348a((T[]) mVarArr);
            this.f6950a.mo315f();
        } finally {
            this.f6950a.mo314e();
        }
    }

    /* renamed from: b */
    public final void mo7550b(C1934m... mVarArr) {
        this.f6950a.mo313d();
        try {
            this.f6952c.mo329a((T[]) mVarArr);
            this.f6950a.mo315f();
        } finally {
            this.f6950a.mo314e();
        }
    }
}
