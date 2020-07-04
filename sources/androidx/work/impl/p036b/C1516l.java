package androidx.work.impl.p036b;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.b.l */
public final class C1516l implements C1515k {

    /* renamed from: a */
    private final RoomDatabase f5771a;

    /* renamed from: b */
    private final C0155c f5772b;

    public C1516l(RoomDatabase roomDatabase) {
        this.f5771a = roomDatabase;
        this.f5772b = new C0155c<C1514j>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m7492a(fVar, (C1514j) obj);
            }

            /* renamed from: a */
            private static void m7492a(C0142f fVar, C1514j jVar) {
                if (jVar.f5769a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, jVar.f5769a);
                }
                if (jVar.f5770b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo291a(2, jVar.f5770b);
                }
            }
        };
    }

    /* renamed from: a */
    public final List<String> mo6772a(String str) {
        C0164h a = C0164h.m457a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a.mo288a(1);
        } else {
            a.mo291a(1, str);
        }
        Cursor a2 = this.f5771a.mo306a((C0141e) a);
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
