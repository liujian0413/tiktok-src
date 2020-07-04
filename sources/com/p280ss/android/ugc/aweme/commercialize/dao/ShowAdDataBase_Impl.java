package com.p280ss.android.ugc.aweme.commercialize.dao;

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

/* renamed from: com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase_Impl */
public class ShowAdDataBase_Impl extends ShowAdDataBase {

    /* renamed from: g */
    private volatile C24616b f64925g;

    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "showAd");
    }

    /* renamed from: h */
    public final C24616b mo64464h() {
        C24616b bVar;
        if (this.f64925g != null) {
            return this.f64925g;
        }
        synchronized (this) {
            if (this.f64925g == null) {
                this.f64925g = new C24617c(this);
            }
            bVar = this.f64925g;
        }
        return bVar;
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(1) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `showAd`");
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `showAd` (`awemeId` TEXT NOT NULL, PRIMARY KEY(`awemeId`))");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"b390b3c8ccd346d851c56d8fb78f29df\")");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (ShowAdDataBase_Impl.this.f290e != null) {
                    int size = ShowAdDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ShowAdDataBase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                ShowAdDataBase_Impl.this.f286a = bVar;
                ShowAdDataBase_Impl.this.mo308a(bVar);
                if (ShowAdDataBase_Impl.this.f290e != null) {
                    int size = ShowAdDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) ShowAdDataBase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("awemeId", new C0151a("awemeId", "TEXT", true, 1));
                C0150b bVar2 = new C0150b("showAd", hashMap, new HashSet(0), new HashSet(0));
                C0150b a = C0150b.m417a(bVar, "showAd");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle showAd(com.ss.android.ugc.aweme.commercialize.dao.ShowAd).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "b390b3c8ccd346d851c56d8fb78f29df", "ad22cd0c0878f7d44a84485b85a127f7")).mo303a());
    }
}
