package androidx.work.impl;

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
import android.arch.persistence.room.p012b.C0150b.C0152b;
import android.arch.persistence.room.p012b.C0150b.C0154d;
import androidx.work.impl.p036b.C1493b;
import androidx.work.impl.p036b.C1494c;
import androidx.work.impl.p036b.C1497e;
import androidx.work.impl.p036b.C1498f;
import androidx.work.impl.p036b.C1503h;
import androidx.work.impl.p036b.C1504i;
import androidx.work.impl.p036b.C1515k;
import androidx.work.impl.p036b.C1516l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: g */
    private volatile C1503h f5677g;

    /* renamed from: h */
    private volatile C1493b f5678h;

    /* renamed from: i */
    private volatile C1515k f5679i;

    /* renamed from: j */
    private volatile C1497e f5680j;

    /* renamed from: i */
    public final C1503h mo6697i() {
        C1503h hVar;
        if (this.f5677g != null) {
            return this.f5677g;
        }
        synchronized (this) {
            if (this.f5677g == null) {
                this.f5677g = new C1504i(this);
            }
            hVar = this.f5677g;
        }
        return hVar;
    }

    /* renamed from: j */
    public final C1493b mo6698j() {
        C1493b bVar;
        if (this.f5678h != null) {
            return this.f5678h;
        }
        synchronized (this) {
            if (this.f5678h == null) {
                this.f5678h = new C1494c(this);
            }
            bVar = this.f5678h;
        }
        return bVar;
    }

    /* renamed from: k */
    public final C1515k mo6699k() {
        C1515k kVar;
        if (this.f5679i != null) {
            return this.f5679i;
        }
        synchronized (this) {
            if (this.f5679i == null) {
                this.f5679i = new C1516l(this);
            }
            kVar = this.f5679i;
        }
        return kVar;
    }

    /* renamed from: l */
    public final C1497e mo6700l() {
        C1497e eVar;
        if (this.f5680j != null) {
            return this.f5680j;
        }
        synchronized (this) {
            if (this.f5680j == null) {
                this.f5680j = new C1498f(this);
            }
            eVar = this.f5680j;
        }
        return eVar;
    }

    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(4) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `Dependency`");
                bVar.mo270c("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.mo270c("DROP TABLE IF EXISTS `WorkTag`");
                bVar.mo270c("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.mo270c("DROP TABLE IF EXISTS `WorkName`");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (WorkDatabase_Impl.this.f290e != null) {
                    int size = WorkDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        WorkDatabase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo270c("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                bVar.mo270c("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                bVar.mo270c("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo270c("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                bVar.mo270c("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c45e5fcbdf3824dead9778f19e2fd8af\")");
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                WorkDatabase_Impl.this.f286a = bVar;
                bVar.mo270c("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.mo308a(bVar);
                if (WorkDatabase_Impl.this.f290e != null) {
                    int size = WorkDatabase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) WorkDatabase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                C0134b bVar2 = bVar;
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new C0151a("work_spec_id", "TEXT", true, 1));
                hashMap.put("prerequisite_id", new C0151a("prerequisite_id", "TEXT", true, 2));
                HashSet hashSet = new HashSet(2);
                C0152b bVar3 = new C0152b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"}));
                hashSet.add(bVar3);
                C0152b bVar4 = new C0152b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"}));
                hashSet.add(bVar4);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new C0154d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                hashSet2.add(new C0154d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
                C0150b bVar5 = new C0150b("Dependency", hashMap, hashSet, hashSet2);
                C0150b a = C0150b.m417a(bVar2, "Dependency");
                if (bVar5.equals(a)) {
                    HashMap hashMap2 = new HashMap(21);
                    hashMap2.put("id", new C0151a("id", "TEXT", true, 1));
                    hashMap2.put("state", new C0151a("state", "INTEGER", true, 0));
                    hashMap2.put("worker_class_name", new C0151a("worker_class_name", "TEXT", true, 0));
                    hashMap2.put("input_merger_class_name", new C0151a("input_merger_class_name", "TEXT", false, 0));
                    hashMap2.put("input", new C0151a("input", "BLOB", true, 0));
                    hashMap2.put("output", new C0151a("output", "BLOB", true, 0));
                    hashMap2.put("initial_delay", new C0151a("initial_delay", "INTEGER", true, 0));
                    hashMap2.put("interval_duration", new C0151a("interval_duration", "INTEGER", true, 0));
                    hashMap2.put("flex_duration", new C0151a("flex_duration", "INTEGER", true, 0));
                    hashMap2.put("run_attempt_count", new C0151a("run_attempt_count", "INTEGER", true, 0));
                    hashMap2.put("backoff_policy", new C0151a("backoff_policy", "INTEGER", true, 0));
                    hashMap2.put("backoff_delay_duration", new C0151a("backoff_delay_duration", "INTEGER", true, 0));
                    hashMap2.put("period_start_time", new C0151a("period_start_time", "INTEGER", true, 0));
                    hashMap2.put("minimum_retention_duration", new C0151a("minimum_retention_duration", "INTEGER", true, 0));
                    hashMap2.put("schedule_requested_at", new C0151a("schedule_requested_at", "INTEGER", true, 0));
                    hashMap2.put("required_network_type", new C0151a("required_network_type", "INTEGER", false, 0));
                    hashMap2.put("requires_charging", new C0151a("requires_charging", "INTEGER", true, 0));
                    hashMap2.put("requires_device_idle", new C0151a("requires_device_idle", "INTEGER", true, 0));
                    hashMap2.put("requires_battery_not_low", new C0151a("requires_battery_not_low", "INTEGER", true, 0));
                    hashMap2.put("requires_storage_not_low", new C0151a("requires_storage_not_low", "INTEGER", true, 0));
                    hashMap2.put("content_uri_triggers", new C0151a("content_uri_triggers", "BLOB", false, 0));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(1);
                    hashSet4.add(new C0154d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
                    C0150b bVar6 = new C0150b("WorkSpec", hashMap2, hashSet3, hashSet4);
                    C0150b a2 = C0150b.m417a(bVar2, "WorkSpec");
                    if (bVar6.equals(a2)) {
                        HashMap hashMap3 = new HashMap(2);
                        hashMap3.put("tag", new C0151a("tag", "TEXT", true, 1));
                        hashMap3.put("work_spec_id", new C0151a("work_spec_id", "TEXT", true, 2));
                        HashSet hashSet5 = new HashSet(1);
                        C0152b bVar7 = new C0152b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"}));
                        hashSet5.add(bVar7);
                        HashSet hashSet6 = new HashSet(1);
                        hashSet6.add(new C0154d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                        C0150b bVar8 = new C0150b("WorkTag", hashMap3, hashSet5, hashSet6);
                        C0150b a3 = C0150b.m417a(bVar2, "WorkTag");
                        if (bVar8.equals(a3)) {
                            HashMap hashMap4 = new HashMap(2);
                            hashMap4.put("work_spec_id", new C0151a("work_spec_id", "TEXT", true, 1));
                            hashMap4.put("system_id", new C0151a("system_id", "INTEGER", true, 0));
                            HashSet hashSet7 = new HashSet(1);
                            C0152b bVar9 = new C0152b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"}));
                            hashSet7.add(bVar9);
                            C0150b bVar10 = new C0150b("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                            C0150b a4 = C0150b.m417a(bVar2, "SystemIdInfo");
                            if (bVar10.equals(a4)) {
                                HashMap hashMap5 = new HashMap(2);
                                hashMap5.put("name", new C0151a("name", "TEXT", true, 1));
                                hashMap5.put("work_spec_id", new C0151a("work_spec_id", "TEXT", true, 2));
                                HashSet hashSet8 = new HashSet(1);
                                C0152b bVar11 = new C0152b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"}));
                                hashSet8.add(bVar11);
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new C0154d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
                                C0150b bVar12 = new C0150b("WorkName", hashMap5, hashSet8, hashSet9);
                                C0150b a5 = C0150b.m417a(bVar2, "WorkName");
                                if (!bVar12.equals(a5)) {
                                    StringBuilder sb = new StringBuilder("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                                    sb.append(bVar12);
                                    sb.append("\n Found:\n");
                                    sb.append(a5);
                                    throw new IllegalStateException(sb.toString());
                                }
                                return;
                            }
                            StringBuilder sb2 = new StringBuilder("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                            sb2.append(bVar10);
                            sb2.append("\n Found:\n");
                            sb2.append(a4);
                            throw new IllegalStateException(sb2.toString());
                        }
                        StringBuilder sb3 = new StringBuilder("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                        sb3.append(bVar8);
                        sb3.append("\n Found:\n");
                        sb3.append(a3);
                        throw new IllegalStateException(sb3.toString());
                    }
                    StringBuilder sb4 = new StringBuilder("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    sb4.append(bVar6);
                    sb4.append("\n Found:\n");
                    sb4.append(a2);
                    throw new IllegalStateException(sb4.toString());
                }
                StringBuilder sb5 = new StringBuilder("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                sb5.append(bVar5);
                sb5.append("\n Found:\n");
                sb5.append(a);
                throw new IllegalStateException(sb5.toString());
            }
        }, "c45e5fcbdf3824dead9778f19e2fd8af", "433431a854c108416da77d9b397eaeec")).mo303a());
    }
}
