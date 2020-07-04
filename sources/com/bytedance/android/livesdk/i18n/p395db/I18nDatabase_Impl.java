package com.bytedance.android.livesdk.i18n.p395db;

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

/* renamed from: com.bytedance.android.livesdk.i18n.db.I18nDatabase_Impl */
public class I18nDatabase_Impl extends I18nDatabase {

    /* renamed from: g */
    private volatile C8330e f22862g;

    /* renamed from: h */
    private volatile C8326b f22863h;

    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "translation", "information");
    }

    /* renamed from: h */
    public final C8330e mo21496h() {
        C8330e eVar;
        if (this.f22862g != null) {
            return this.f22862g;
        }
        synchronized (this) {
            if (this.f22862g == null) {
                this.f22862g = new C8331f(this);
            }
            eVar = this.f22862g;
        }
        return eVar;
    }

    /* renamed from: i */
    public final C8326b mo21497i() {
        C8326b bVar;
        if (this.f22863h != null) {
            return this.f22863h;
        }
        synchronized (this) {
            if (this.f22863h == null) {
                this.f22863h = new C8327c(this);
            }
            bVar = this.f22863h;
        }
        return bVar;
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(1) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `translation`");
                bVar.mo270c("DROP TABLE IF EXISTS `information`");
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `translation` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `information` (`key` TEXT NOT NULL, `value` TEXT, PRIMARY KEY(`key`))");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"db08c04e8a10c6c1ddb9d9ab384c2f17\")");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (I18nDatabase_Impl.this.f290e != null) {
                    int size = I18nDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        I18nDatabase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                I18nDatabase_Impl.this.f286a = bVar;
                I18nDatabase_Impl.this.mo308a(bVar);
                if (I18nDatabase_Impl.this.f290e != null) {
                    int size = I18nDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) I18nDatabase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("key", new C0151a("key", "TEXT", true, 1));
                hashMap.put("value", new C0151a("value", "TEXT", false, 0));
                C0150b bVar2 = new C0150b("translation", hashMap, new HashSet(0), new HashSet(0));
                C0150b a = C0150b.m417a(bVar, "translation");
                if (bVar2.equals(a)) {
                    HashMap hashMap2 = new HashMap(2);
                    hashMap2.put("key", new C0151a("key", "TEXT", true, 1));
                    hashMap2.put("value", new C0151a("value", "TEXT", false, 0));
                    C0150b bVar3 = new C0150b("information", hashMap2, new HashSet(0), new HashSet(0));
                    C0150b a2 = C0150b.m417a(bVar, "information");
                    if (!bVar3.equals(a2)) {
                        StringBuilder sb = new StringBuilder("Migration didn't properly handle information(com.bytedance.android.livesdk.i18n.db.I18nInformation).\n Expected:\n");
                        sb.append(bVar3);
                        sb.append("\n Found:\n");
                        sb.append(a2);
                        throw new IllegalStateException(sb.toString());
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Migration didn't properly handle translation(com.bytedance.android.livesdk.i18n.db.I18nTranslation).\n Expected:\n");
                sb2.append(bVar2);
                sb2.append("\n Found:\n");
                sb2.append(a);
                throw new IllegalStateException(sb2.toString());
            }
        }, "db08c04e8a10c6c1ddb9d9ab384c2f17", "e3af7f9b450df7204a5f65d0fd2a1eaa")).mo303a());
    }
}
