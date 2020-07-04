package com.p280ss.android.ugc.trill.share.data;

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

/* renamed from: com.ss.android.ugc.trill.share.data.ShareDatabase_Impl */
public class ShareDatabase_Impl extends ShareDatabase {

    /* renamed from: g */
    private volatile C45112b f115945g;

    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "Record");
    }

    /* renamed from: h */
    public final C45112b mo107673h() {
        C45112b bVar;
        if (this.f115945g != null) {
            return this.f115945g;
        }
        synchronized (this) {
            if (this.f115945g == null) {
                this.f115945g = new C45113c(this);
            }
            bVar = this.f115945g;
        }
        return bVar;
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(3) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `Record`");
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `Record` (`rid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER, `channel` TEXT, `share_type` INTEGER)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"4e670bbb58b1cec9bfaaeb409ecedc0d\")");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (ShareDatabase_Impl.this.f290e != null) {
                    int size = ShareDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ShareDatabase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                ShareDatabase_Impl.this.f286a = bVar;
                ShareDatabase_Impl.this.mo308a(bVar);
                if (ShareDatabase_Impl.this.f290e != null) {
                    int size = ShareDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) ShareDatabase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("rid", new C0151a("rid", "INTEGER", true, 1));
                hashMap.put("time", new C0151a("time", "INTEGER", false, 0));
                hashMap.put("channel", new C0151a("channel", "TEXT", false, 0));
                hashMap.put("share_type", new C0151a("share_type", "INTEGER", false, 0));
                C0150b bVar2 = new C0150b("Record", hashMap, new HashSet(0), new HashSet(0));
                C0150b a = C0150b.m417a(bVar, "Record");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle Record(com.ss.android.ugc.trill.share.data.Record).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "4e670bbb58b1cec9bfaaeb409ecedc0d", "c53d71306862fad59b3a3fe103512963")).mo303a());
    }
}
