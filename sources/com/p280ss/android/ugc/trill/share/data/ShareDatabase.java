package com.p280ss.android.ugc.trill.share.data;

import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.room.C0160e;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.p011a.C0147a;
import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;

/* renamed from: com.ss.android.ugc.trill.share.data.ShareDatabase */
public abstract class ShareDatabase extends RoomDatabase {

    /* renamed from: g */
    private static volatile ShareDatabase f115942g;

    /* renamed from: h */
    private static final C0147a f115943h = new C0147a(1, 2) {
        /* renamed from: a */
        public final void mo327a(C0134b bVar) {
            C7163a.m22363a();
            bVar.mo270c("CREATE TABLE IF NOT EXISTS `quick_share_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mutual_follow_status` INTEGER NOT NULL, `friends_list` TEXT, `timestamp` INTEGER NOT NULL)");
            bVar.mo270c("CREATE TABLE IF NOT EXISTS `quick_share_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hashed_phone_number` TEXT NOT NULL, `created_time` INTEGER)");
            bVar.mo270c("CREATE UNIQUE INDEX `index_quick_share_history_hashed_phone_number` ON `quick_share_history` (`hashed_phone_number`)");
            bVar.mo270c("CREATE TRIGGER delete_oldest_record AFTER INSERT ON quick_share_history BEGIN DELETE FROM quick_share_history WHERE id NOT IN (SELECT id FROM quick_share_history ORDER BY created_time DESC LIMIT 10); END");
        }
    };

    /* renamed from: i */
    private static final C0147a f115944i = new C0147a(2, 3) {
        /* renamed from: a */
        public final void mo327a(C0134b bVar) {
            C7163a.m22363a();
            bVar.mo270c("DROP TABLE IF EXISTS `quick_share_data`");
            bVar.mo270c("DROP TABLE IF EXISTS `quick_share_history`");
        }
    };

    /* renamed from: h */
    public abstract C45112b mo107673h();

    /* renamed from: a */
    public static ShareDatabase m142253a(Context context) {
        boolean z;
        if (f115942g == null) {
            synchronized (ShareDatabase.class) {
                StringBuilder sb = new StringBuilder("Creating ShareDatabase instance, WRITE_EXTERNAL_STORAGE: ");
                if (C43162f.m136888c(context) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                C6921a.m21555a(sb.toString());
                try {
                    if (f115942g == null) {
                        f115942g = (ShareDatabase) C0160e.m441a(context.getApplicationContext(), ShareDatabase.class, "share.db").mo320a(f115943h, f115944i).mo318a().mo322c();
                    }
                } catch (Throwable th) {
                    StringBuilder sb2 = new StringBuilder("Error creating ShareDatabase: ");
                    sb2.append(th.toString());
                    C6921a.m21555a(sb2.toString());
                }
            }
        }
        return f115942g;
    }
}
