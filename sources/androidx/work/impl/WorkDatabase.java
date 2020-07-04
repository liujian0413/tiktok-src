package androidx.work.impl;

import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.room.C0160e;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomDatabase.C0143a;
import android.arch.persistence.room.RoomDatabase.C0144b;
import android.content.Context;
import androidx.work.impl.C1540e.C1543a;
import androidx.work.impl.p036b.C1493b;
import androidx.work.impl.p036b.C1497e;
import androidx.work.impl.p036b.C1503h;
import androidx.work.impl.p036b.C1515k;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: g */
    private static final long f5676g = TimeUnit.DAYS.toMillis(7);

    /* renamed from: i */
    public abstract C1503h mo6697i();

    /* renamed from: j */
    public abstract C1493b mo6698j();

    /* renamed from: k */
    public abstract C1515k mo6699k();

    /* renamed from: l */
    public abstract C1497e mo6700l();

    /* renamed from: m */
    private static C0144b m7337m() {
        return new C0144b() {
            /* renamed from: a */
            public final void mo323a(C0134b bVar) {
                super.mo323a(bVar);
                bVar.mo266a();
                try {
                    bVar.mo270c("UPDATE workspec SET state=0, schedule_requested_at=-1 WHERE state=1");
                    bVar.mo270c(WorkDatabase.m7336h());
                    bVar.mo269c();
                } finally {
                    bVar.mo268b();
                }
            }
        };
    }

    /* renamed from: n */
    private static long m7338n() {
        return System.currentTimeMillis() - f5676g;
    }

    /* renamed from: h */
    static String m7336h() {
        StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        sb.append(m7338n());
        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return sb.toString();
    }

    /* renamed from: a */
    public static WorkDatabase m7335a(Context context, boolean z) {
        C0143a aVar;
        if (z) {
            aVar = C0160e.m440a(context, WorkDatabase.class).mo318a();
        } else {
            aVar = C0160e.m441a(context, WorkDatabase.class, "androidx.work.workdb");
        }
        return (WorkDatabase) aVar.mo319a(m7337m()).mo320a(C1540e.f5828a).mo320a(new C1543a(context, 2, 3)).mo320a(C1540e.f5829b).mo321b().mo322c();
    }
}
