package androidx.work.impl.p036b;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.b.c */
public final class C1494c implements C1493b {

    /* renamed from: a */
    private final RoomDatabase f5723a;

    /* renamed from: b */
    private final C0155c f5724b;

    public C1494c(RoomDatabase roomDatabase) {
        this.f5723a = roomDatabase;
        this.f5724b = new C0155c<C1492a>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m7438a(fVar, (C1492a) obj);
            }

            /* renamed from: a */
            private static void m7438a(C0142f fVar, C1492a aVar) {
                if (aVar.f5721a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, aVar.f5721a);
                }
                if (aVar.f5722b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo291a(2, aVar.f5722b);
                }
            }
        };
    }

    /* renamed from: a */
    public final boolean mo6746a(String str) {
        C0164h a = C0164h.m457a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a.mo288a(1);
        } else {
            a.mo291a(1, str);
        }
        Cursor a2 = this.f5723a.mo306a((C0141e) a);
        try {
            boolean z = false;
            if (a2.moveToFirst() && a2.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    /* renamed from: b */
    public final List<String> mo6747b(String str) {
        C0164h a = C0164h.m457a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.mo288a(1);
        } else {
            a.mo291a(1, str);
        }
        Cursor a2 = this.f5723a.mo306a((C0141e) a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }
}
