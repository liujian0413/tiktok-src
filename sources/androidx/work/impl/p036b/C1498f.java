package androidx.work.impl.p036b;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.C0165i;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;

/* renamed from: androidx.work.impl.b.f */
public final class C1498f implements C1497e {

    /* renamed from: a */
    private final RoomDatabase f5728a;

    /* renamed from: b */
    private final C0155c f5729b;

    /* renamed from: c */
    private final C0165i f5730c;

    public C1498f(RoomDatabase roomDatabase) {
        this.f5728a = roomDatabase;
        this.f5729b = new C0155c<C1496d>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m7447a(fVar, (C1496d) obj);
            }

            /* renamed from: a */
            private static void m7447a(C0142f fVar, C1496d dVar) {
                if (dVar.f5726a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, dVar.f5726a);
                }
                fVar.mo290a(2, (long) dVar.f5727b);
            }
        };
        this.f5730c = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    /* renamed from: a */
    public final void mo6751a(C1496d dVar) {
        this.f5728a.mo313d();
        try {
            this.f5729b.mo347a(dVar);
            this.f5728a.mo315f();
        } finally {
            this.f5728a.mo314e();
        }
    }

    /* renamed from: b */
    public final void mo6752b(String str) {
        C0142f b = this.f5730c.mo365b();
        this.f5728a.mo313d();
        if (str == null) {
            try {
                b.mo288a(1);
            } catch (Throwable th) {
                this.f5728a.mo314e();
                this.f5730c.mo364a(b);
                throw th;
            }
        } else {
            b.mo291a(1, str);
        }
        b.mo294a();
        this.f5728a.mo315f();
        this.f5728a.mo314e();
        this.f5730c.mo364a(b);
    }

    /* renamed from: a */
    public final C1496d mo6750a(String str) {
        C1496d dVar;
        C0164h a = C0164h.m457a("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a.mo288a(1);
        } else {
            a.mo291a(1, str);
        }
        Cursor a2 = this.f5728a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("work_spec_id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("system_id");
            if (a2.moveToFirst()) {
                dVar = new C1496d(a2.getString(columnIndexOrThrow), a2.getInt(columnIndexOrThrow2));
            } else {
                dVar = null;
            }
            return dVar;
        } finally {
            a2.close();
            a.mo362b();
        }
    }
}
