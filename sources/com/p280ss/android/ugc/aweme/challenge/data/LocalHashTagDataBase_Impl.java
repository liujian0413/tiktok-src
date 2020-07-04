package com.p280ss.android.ugc.aweme.challenge.data;

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

/* renamed from: com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase_Impl */
public class LocalHashTagDataBase_Impl extends LocalHashTagDataBase {

    /* renamed from: g */
    private volatile C23687a f62438g;

    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "localHashTag");
    }

    /* renamed from: h */
    public final C23687a mo61616h() {
        C23687a aVar;
        if (this.f62438g != null) {
            return this.f62438g;
        }
        synchronized (this) {
            if (this.f62438g == null) {
                this.f62438g = new C23688b(this);
            }
            aVar = this.f62438g;
        }
        return aVar;
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(1) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `localHashTag`");
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `localHashTag` (`name` TEXT NOT NULL, `time` INTEGER, PRIMARY KEY(`name`))");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"0fdb23fe113307f93af74ceea527f0a9\")");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (LocalHashTagDataBase_Impl.this.f290e != null) {
                    int size = LocalHashTagDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        LocalHashTagDataBase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                LocalHashTagDataBase_Impl.this.f286a = bVar;
                LocalHashTagDataBase_Impl.this.mo308a(bVar);
                if (LocalHashTagDataBase_Impl.this.f290e != null) {
                    int size = LocalHashTagDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) LocalHashTagDataBase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("name", new C0151a("name", "TEXT", true, 1));
                hashMap.put("time", new C0151a("time", "INTEGER", false, 0));
                C0150b bVar2 = new C0150b("localHashTag", hashMap, new HashSet(0), new HashSet(0));
                C0150b a = C0150b.m417a(bVar, "localHashTag");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle localHashTag(com.ss.android.ugc.aweme.challenge.data.LocalHashTagItem).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "0fdb23fe113307f93af74ceea527f0a9", "606e3395020db78e36e0b235c6657129")).mo303a());
    }
}
