package com.p280ss.android.ugc.aweme.runtime.behavior;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.C0165i;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.runtime.behavior.b */
public final class C37291b implements C37290a {

    /* renamed from: a */
    private final RoomDatabase f97414a;

    /* renamed from: b */
    private final C0155c f97415b;

    /* renamed from: c */
    private final C0165i f97416c;

    /* renamed from: d */
    private final C0165i f97417d;

    public C37291b(RoomDatabase roomDatabase) {
        this.f97414a = roomDatabase;
        this.f97415b = new C0155c<C37295c>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR ABORT INTO `runtimeBehaviorEntity`(`id`,`type`,`time`,`msg`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m119776a(fVar, (C37295c) obj);
            }

            /* renamed from: a */
            private static void m119776a(C0142f fVar, C37295c cVar) {
                fVar.mo290a(1, (long) cVar.f97421a);
                if (cVar.f97422b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo291a(2, cVar.f97422b);
                }
                fVar.mo290a(3, cVar.f97423c);
                if (cVar.f97424d == null) {
                    fVar.mo288a(4);
                } else {
                    fVar.mo291a(4, cVar.f97424d);
                }
            }
        };
        this.f97416c = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM runtimeBehaviorEntity where type = ? and time < ?";
            }
        };
        this.f97417d = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM runtimeBehaviorEntity";
            }
        };
    }

    /* renamed from: a */
    public final void mo93891a(C37295c cVar) {
        this.f97414a.mo313d();
        try {
            this.f97415b.mo347a(cVar);
            this.f97414a.mo315f();
        } finally {
            this.f97414a.mo314e();
        }
    }

    /* renamed from: b */
    public final void mo93892b(String str, long j) {
        C0142f b = this.f97416c.mo365b();
        this.f97414a.mo313d();
        if (str == null) {
            try {
                b.mo288a(1);
            } catch (Throwable th) {
                this.f97414a.mo314e();
                this.f97416c.mo364a(b);
                throw th;
            }
        } else {
            b.mo291a(1, str);
        }
        b.mo290a(2, j);
        b.mo294a();
        this.f97414a.mo315f();
        this.f97414a.mo314e();
        this.f97416c.mo364a(b);
    }

    /* renamed from: a */
    public final List<C37295c> mo93890a(String str, long j) {
        C0164h a = C0164h.m457a("SELECT * FROM runtimeBehaviorEntity where type = ?  and time > ?", 2);
        if (str == null) {
            a.mo288a(1);
        } else {
            a.mo291a(1, str);
        }
        a.mo290a(2, j);
        Cursor a2 = this.f97414a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("type");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("msg");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C37295c cVar = new C37295c();
                cVar.f97421a = a2.getInt(columnIndexOrThrow);
                cVar.mo93893a(a2.getString(columnIndexOrThrow2));
                cVar.f97423c = a2.getLong(columnIndexOrThrow3);
                cVar.mo93894b(a2.getString(columnIndexOrThrow4));
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }
}
