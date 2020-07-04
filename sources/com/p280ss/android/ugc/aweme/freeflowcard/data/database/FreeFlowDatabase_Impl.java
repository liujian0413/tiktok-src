package com.p280ss.android.ugc.aweme.freeflowcard.data.database;

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
import com.p280ss.android.ugc.aweme.freeflowcard.data.p1280a.C29985a;
import com.p280ss.android.ugc.aweme.freeflowcard.data.p1280a.C29986b;
import com.p280ss.android.ugc.aweme.freeflowcard.data.p1280a.C29989c;
import com.p280ss.android.ugc.aweme.freeflowcard.data.p1280a.C29990d;
import com.p280ss.android.ugc.aweme.freeflowcard.data.p1280a.C29993e;
import com.p280ss.android.ugc.aweme.freeflowcard.data.p1280a.C29994f;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.database.FreeFlowDatabase_Impl */
public class FreeFlowDatabase_Impl extends FreeFlowDatabase {

    /* renamed from: g */
    private volatile C29989c f78815g;

    /* renamed from: h */
    private volatile C29993e f78816h;

    /* renamed from: i */
    private volatile C29985a f78817i;

    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "tb_auto_play_setting", "tb_user_click_event", "tb_app_start_mode");
    }

    /* renamed from: h */
    public final C29989c mo76190h() {
        C29989c cVar;
        if (this.f78815g != null) {
            return this.f78815g;
        }
        synchronized (this) {
            if (this.f78815g == null) {
                this.f78815g = new C29990d(this);
            }
            cVar = this.f78815g;
        }
        return cVar;
    }

    /* renamed from: i */
    public final C29993e mo76191i() {
        C29993e eVar;
        if (this.f78816h != null) {
            return this.f78816h;
        }
        synchronized (this) {
            if (this.f78816h == null) {
                this.f78816h = new C29994f(this);
            }
            eVar = this.f78816h;
        }
        return eVar;
    }

    /* renamed from: j */
    public final C29985a mo76192j() {
        C29985a aVar;
        if (this.f78817i != null) {
            return this.f78817i;
        }
        synchronized (this) {
            if (this.f78817i == null) {
                this.f78817i = new C29986b(this);
            }
            aVar = this.f78817i;
        }
        return aVar;
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(1) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `tb_auto_play_setting`");
                bVar.mo270c("DROP TABLE IF EXISTS `tb_user_click_event`");
                bVar.mo270c("DROP TABLE IF EXISTS `tb_app_start_mode`");
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `tb_auto_play_setting` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_open` INTEGER NOT NULL, `change_type` INTEGER NOT NULL, `reset_time` INTEGER NOT NULL, `monthly_state` INTEGER NOT NULL, `day_open` INTEGER NOT NULL, `day_open_reset_time` INTEGER NOT NULL)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `tb_user_click_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `click_type` INTEGER NOT NULL, `is_auto_play` INTEGER NOT NULL)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `tb_app_start_mode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `start_mode` INTEGER NOT NULL)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"1967f4d2e5a4f7e5e76e753b06cafe2b\")");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (FreeFlowDatabase_Impl.this.f290e != null) {
                    int size = FreeFlowDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        FreeFlowDatabase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                FreeFlowDatabase_Impl.this.f286a = bVar;
                FreeFlowDatabase_Impl.this.mo308a(bVar);
                if (FreeFlowDatabase_Impl.this.f290e != null) {
                    int size = FreeFlowDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) FreeFlowDatabase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                HashMap hashMap = new HashMap(7);
                hashMap.put("id", new C0151a("id", "INTEGER", true, 1));
                hashMap.put("is_open", new C0151a("is_open", "INTEGER", true, 0));
                hashMap.put("change_type", new C0151a("change_type", "INTEGER", true, 0));
                hashMap.put("reset_time", new C0151a("reset_time", "INTEGER", true, 0));
                hashMap.put("monthly_state", new C0151a("monthly_state", "INTEGER", true, 0));
                hashMap.put("day_open", new C0151a("day_open", "INTEGER", true, 0));
                hashMap.put("day_open_reset_time", new C0151a("day_open_reset_time", "INTEGER", true, 0));
                C0150b bVar2 = new C0150b("tb_auto_play_setting", hashMap, new HashSet(0), new HashSet(0));
                C0150b a = C0150b.m417a(bVar, "tb_auto_play_setting");
                if (bVar2.equals(a)) {
                    HashMap hashMap2 = new HashMap(4);
                    hashMap2.put("id", new C0151a("id", "INTEGER", true, 1));
                    hashMap2.put("time", new C0151a("time", "INTEGER", true, 0));
                    hashMap2.put("click_type", new C0151a("click_type", "INTEGER", true, 0));
                    hashMap2.put("is_auto_play", new C0151a("is_auto_play", "INTEGER", true, 0));
                    C0150b bVar3 = new C0150b("tb_user_click_event", hashMap2, new HashSet(0), new HashSet(0));
                    C0150b a2 = C0150b.m417a(bVar, "tb_user_click_event");
                    if (bVar3.equals(a2)) {
                        HashMap hashMap3 = new HashMap(3);
                        hashMap3.put("id", new C0151a("id", "INTEGER", true, 1));
                        hashMap3.put("time", new C0151a("time", "INTEGER", true, 0));
                        hashMap3.put("start_mode", new C0151a("start_mode", "INTEGER", true, 0));
                        C0150b bVar4 = new C0150b("tb_app_start_mode", hashMap3, new HashSet(0), new HashSet(0));
                        C0150b a3 = C0150b.m417a(bVar, "tb_app_start_mode");
                        if (!bVar4.equals(a3)) {
                            StringBuilder sb = new StringBuilder("Migration didn't properly handle tb_app_start_mode(com.ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode).\n Expected:\n");
                            sb.append(bVar4);
                            sb.append("\n Found:\n");
                            sb.append(a3);
                            throw new IllegalStateException(sb.toString());
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("Migration didn't properly handle tb_user_click_event(com.ss.android.ugc.aweme.freeflowcard.data.entity.UserClickEvent).\n Expected:\n");
                    sb2.append(bVar3);
                    sb2.append("\n Found:\n");
                    sb2.append(a2);
                    throw new IllegalStateException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder("Migration didn't properly handle tb_auto_play_setting(com.ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting).\n Expected:\n");
                sb3.append(bVar2);
                sb3.append("\n Found:\n");
                sb3.append(a);
                throw new IllegalStateException(sb3.toString());
            }
        }, "1967f4d2e5a4f7e5e76e753b06cafe2b", "b3be3e5c94533db90027e813123cd689")).mo303a());
    }
}
