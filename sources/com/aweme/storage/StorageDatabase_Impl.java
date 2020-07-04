package com.aweme.storage;

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

public class StorageDatabase_Impl extends StorageDatabase {

    /* renamed from: g */
    private volatile C1927j f6896g;

    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "black_tb");
    }

    /* renamed from: h */
    public final C1927j mo7527h() {
        C1927j jVar;
        if (this.f6896g != null) {
            return this.f6896g;
        }
        synchronized (this) {
            if (this.f6896g == null) {
                this.f6896g = new C1928k(this);
            }
            jVar = this.f6896g;
        }
        return jVar;
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(1) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `black_tb`");
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `black_tb` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `path` TEXT, `size` INTEGER NOT NULL, `date` INTEGER NOT NULL, `count` INTEGER NOT NULL)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"9da1db0d9f35b616dc4fd53e8847a569\")");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (StorageDatabase_Impl.this.f290e != null) {
                    int size = StorageDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        StorageDatabase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                StorageDatabase_Impl.this.f286a = bVar;
                StorageDatabase_Impl.this.mo308a(bVar);
                if (StorageDatabase_Impl.this.f290e != null) {
                    int size = StorageDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) StorageDatabase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                HashMap hashMap = new HashMap(5);
                hashMap.put("id", new C0151a("id", "INTEGER", true, 1));
                hashMap.put("path", new C0151a("path", "TEXT", false, 0));
                hashMap.put("size", new C0151a("size", "INTEGER", true, 0));
                hashMap.put("date", new C0151a("date", "INTEGER", true, 0));
                hashMap.put("count", new C0151a("count", "INTEGER", true, 0));
                C0150b bVar2 = new C0150b("black_tb", hashMap, new HashSet(0), new HashSet(0));
                C0150b a = C0150b.m417a(bVar, "black_tb");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle black_tb(com.aweme.storage.StorageItem).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "9da1db0d9f35b616dc4fd53e8847a569", "49c93119ba969cd899aa69d0a2419483")).mo303a());
    }
}
