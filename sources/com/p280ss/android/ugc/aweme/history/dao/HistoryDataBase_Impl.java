package com.p280ss.android.ugc.aweme.history.dao;

import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.p009a.C0135c;
import android.arch.persistence.p009a.C0135c.C0136a;
import android.arch.persistence.p009a.C0135c.C0137b;
import android.arch.persistence.room.C0146a;
import android.arch.persistence.room.C0156d;
import android.arch.persistence.room.C0162g;
import android.arch.persistence.room.C0162g.C0163a;
import android.arch.persistence.room.RoomDatabase.C0144b;
import android.arch.persistence.room.p012b.C0150b;
import android.arch.persistence.room.p012b.C0150b.C0151a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.history.dao.HistoryDataBase_Impl */
public class HistoryDataBase_Impl extends HistoryDataBase {
    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "historyEntity");
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(1) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `historyEntity`");
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `historyEntity` (`viewDate` TEXT NOT NULL, `viewTime` INTEGER NOT NULL, `awemeId` TEXT NOT NULL, PRIMARY KEY(`awemeId`))");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"367b0c8487a9548c2459257784bcde1d\")");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (HistoryDataBase_Impl.this.f290e != null) {
                    int size = HistoryDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        HistoryDataBase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                HistoryDataBase_Impl.this.f286a = bVar;
                HistoryDataBase_Impl.this.mo308a(bVar);
                if (HistoryDataBase_Impl.this.f290e != null) {
                    int size = HistoryDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) HistoryDataBase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                HashMap hashMap = new HashMap(3);
                hashMap.put("viewDate", new C0151a("viewDate", "TEXT", true, 0));
                hashMap.put("viewTime", new C0151a("viewTime", "INTEGER", true, 0));
                hashMap.put("awemeId", new C0151a("awemeId", "TEXT", true, 1));
                C0150b bVar2 = new C0150b("historyEntity", hashMap, new HashSet(0), new HashSet(0));
                C0150b a = C0150b.m417a(bVar, "historyEntity");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle historyEntity(com.ss.android.ugc.aweme.history.dao.HistoryEntity).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "367b0c8487a9548c2459257784bcde1d", "7fc469ceab793adfa6ce3120fd80e34d")).mo303a());
    }
}
