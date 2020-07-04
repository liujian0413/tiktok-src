package androidx.work.impl;

import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.room.p011a.C0147a;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.utils.C1571c;

/* renamed from: androidx.work.impl.e */
public final class C1540e {

    /* renamed from: a */
    public static C0147a f5828a = new C0147a(1, 2) {
        /* renamed from: a */
        public final void mo327a(C0134b bVar) {
            bVar.mo270c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo270c("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.mo270c("DROP TABLE IF EXISTS alarmInfo");
            bVar.mo270c("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    };

    /* renamed from: b */
    public static C0147a f5829b = new C0147a(3, 4) {
        /* renamed from: a */
        public final void mo327a(C0134b bVar) {
            if (VERSION.SDK_INT >= 23) {
                bVar.mo270c("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    };

    /* renamed from: androidx.work.impl.e$a */
    public static class C1543a extends C0147a {

        /* renamed from: c */
        final Context f5830c;

        /* renamed from: a */
        public final void mo327a(C0134b bVar) {
            new C1571c(this.f5830c).mo6846a(true);
        }

        public C1543a(Context context, int i, int i2) {
            super(2, 3);
            this.f5830c = context;
        }
    }
}
