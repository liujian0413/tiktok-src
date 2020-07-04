package com.p280ss.android.ugc.aweme.runtime.behavior;

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

/* renamed from: com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase_Impl */
public class RuntimeBehaviorDataBase_Impl extends RuntimeBehaviorDataBase {

    /* renamed from: g */
    private volatile C37290a f97412g;

    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "runtimeBehaviorEntity");
    }

    /* renamed from: h */
    public final C37290a mo93889h() {
        C37290a aVar;
        if (this.f97412g != null) {
            return this.f97412g;
        }
        synchronized (this) {
            if (this.f97412g == null) {
                this.f97412g = new C37291b(this);
            }
            aVar = this.f97412g;
        }
        return aVar;
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(1) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `runtimeBehaviorEntity`");
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `runtimeBehaviorEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `time` INTEGER NOT NULL, `msg` TEXT NOT NULL)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"977ffca18b985d80d9f488e58c9d7da9\")");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (RuntimeBehaviorDataBase_Impl.this.f290e != null) {
                    int size = RuntimeBehaviorDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        RuntimeBehaviorDataBase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                RuntimeBehaviorDataBase_Impl.this.f286a = bVar;
                RuntimeBehaviorDataBase_Impl.this.mo308a(bVar);
                if (RuntimeBehaviorDataBase_Impl.this.f290e != null) {
                    int size = RuntimeBehaviorDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) RuntimeBehaviorDataBase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("id", new C0151a("id", "INTEGER", true, 1));
                hashMap.put("type", new C0151a("type", "TEXT", true, 0));
                hashMap.put("time", new C0151a("time", "INTEGER", true, 0));
                hashMap.put("msg", new C0151a("msg", "TEXT", true, 0));
                C0150b bVar2 = new C0150b("runtimeBehaviorEntity", hashMap, new HashSet(0), new HashSet(0));
                C0150b a = C0150b.m417a(bVar, "runtimeBehaviorEntity");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle runtimeBehaviorEntity(com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorEntity).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "977ffca18b985d80d9f488e58c9d7da9", "3d4bcb8798a8e5184ae76e79c3f54456")).mo303a());
    }
}
