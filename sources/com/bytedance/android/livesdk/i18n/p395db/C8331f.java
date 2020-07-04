package com.bytedance.android.livesdk.i18n.p395db;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.C0165i;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.i18n.db.f */
public final class C8331f implements C8330e {

    /* renamed from: a */
    private final RoomDatabase f22872a;

    /* renamed from: b */
    private final C0155c f22873b;

    /* renamed from: c */
    private final C0165i f22874c;

    /* renamed from: b */
    public final void mo21502b() {
        C0142f b = this.f22874c.mo365b();
        this.f22872a.mo313d();
        try {
            b.mo294a();
            this.f22872a.mo315f();
        } finally {
            this.f22872a.mo314e();
            this.f22874c.mo364a(b);
        }
    }

    /* renamed from: a */
    public final List<C8329d> mo21500a() {
        C0164h a = C0164h.m457a("SELECT * FROM translation", 0);
        Cursor a2 = this.f22872a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("value");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C8329d dVar = new C8329d();
                dVar.f22870a = a2.getString(columnIndexOrThrow);
                dVar.f22871b = a2.getString(columnIndexOrThrow2);
                arrayList.add(dVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    public C8331f(RoomDatabase roomDatabase) {
        this.f22872a = roomDatabase;
        this.f22873b = new C0155c<C8329d>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR REPLACE INTO `translation`(`key`,`value`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m25429a(fVar, (C8329d) obj);
            }

            /* renamed from: a */
            private static void m25429a(C0142f fVar, C8329d dVar) {
                if (dVar.f22870a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, dVar.f22870a);
                }
                if (dVar.f22871b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo291a(2, dVar.f22871b);
                }
            }
        };
        this.f22874c = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM translation";
            }
        };
    }

    /* renamed from: a */
    public final void mo21501a(List<C8329d> list) {
        this.f22872a.mo313d();
        try {
            this.f22873b.mo346a((Iterable<T>) list);
            this.f22872a.mo315f();
        } finally {
            this.f22872a.mo314e();
        }
    }
}
