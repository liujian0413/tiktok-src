package androidx.work.impl.p036b;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.C0165i;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.p012b.C0149a;
import android.database.Cursor;
import androidx.work.C1454c;
import androidx.work.C1458e;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.b.i */
public final class C1504i implements C1503h {

    /* renamed from: a */
    public final RoomDatabase f5750a;

    /* renamed from: b */
    private final C0155c f5751b;

    /* renamed from: c */
    private final C0165i f5752c;

    /* renamed from: d */
    private final C0165i f5753d;

    /* renamed from: e */
    private final C0165i f5754e;

    /* renamed from: f */
    private final C0165i f5755f;

    /* renamed from: g */
    private final C0165i f5756g;

    /* renamed from: h */
    private final C0165i f5757h;

    /* renamed from: i */
    private final C0165i f5758i;

    /* renamed from: j */
    private final C0165i f5759j;

    /* renamed from: a */
    public final List<String> mo6762a() {
        C0164h a = C0164h.m457a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        Cursor a2 = this.f5750a.mo306a((C0141e) a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    /* renamed from: b */
    public final int mo6766b() {
        C0142f b = this.f5758i.mo365b();
        this.f5750a.mo313d();
        try {
            int a = b.mo294a();
            this.f5750a.mo315f();
            return a;
        } finally {
            this.f5750a.mo314e();
            this.f5758i.mo364a(b);
        }
    }

    /* renamed from: c */
    public final int mo6769c(String str) {
        C0142f b = this.f5756g.mo365b();
        this.f5750a.mo313d();
        if (str == null) {
            try {
                b.mo288a(1);
            } catch (Throwable th) {
                this.f5750a.mo314e();
                this.f5756g.mo364a(b);
                throw th;
            }
        } else {
            b.mo291a(1, str);
        }
        int a = b.mo294a();
        this.f5750a.mo315f();
        this.f5750a.mo314e();
        this.f5756g.mo364a(b);
        return a;
    }

    /* renamed from: d */
    public final State mo6770d(String str) {
        State state;
        C0164h a = C0164h.m457a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.mo288a(1);
        } else {
            a.mo291a(1, str);
        }
        Cursor a2 = this.f5750a.mo306a((C0141e) a);
        try {
            if (a2.moveToFirst()) {
                state = C1518m.m7498a(a2.getInt(0));
            } else {
                state = null;
            }
            return state;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    public C1504i(RoomDatabase roomDatabase) {
        this.f5750a = roomDatabase;
        this.f5751b = new C0155c<C1501g>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m7479a(fVar, (C1501g) obj);
            }

            /* renamed from: a */
            private static void m7479a(C0142f fVar, C1501g gVar) {
                if (gVar.f5734a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, gVar.f5734a);
                }
                fVar.mo290a(2, (long) C1518m.m7497a(gVar.f5735b));
                if (gVar.f5736c == null) {
                    fVar.mo288a(3);
                } else {
                    fVar.mo291a(3, gVar.f5736c);
                }
                if (gVar.f5737d == null) {
                    fVar.mo288a(4);
                } else {
                    fVar.mo291a(4, gVar.f5737d);
                }
                byte[] a = C1458e.m7316a(gVar.f5738e);
                if (a == null) {
                    fVar.mo288a(5);
                } else {
                    fVar.mo292a(5, a);
                }
                byte[] a2 = C1458e.m7316a(gVar.f5739f);
                if (a2 == null) {
                    fVar.mo288a(6);
                } else {
                    fVar.mo292a(6, a2);
                }
                fVar.mo290a(7, gVar.f5740g);
                fVar.mo290a(8, gVar.f5741h);
                fVar.mo290a(9, gVar.f5742i);
                fVar.mo290a(10, (long) gVar.f5744k);
                fVar.mo290a(11, (long) C1518m.m7495a(gVar.f5745l));
                fVar.mo290a(12, gVar.f5746m);
                fVar.mo290a(13, gVar.f5747n);
                fVar.mo290a(14, gVar.f5748o);
                fVar.mo290a(15, gVar.f5749p);
                C1454c cVar = gVar.f5743j;
                if (cVar != null) {
                    fVar.mo290a(16, (long) C1518m.m7496a(cVar.f5657b));
                    fVar.mo290a(17, cVar.f5658c ? 1 : 0);
                    fVar.mo290a(18, cVar.f5659d ? 1 : 0);
                    fVar.mo290a(19, cVar.f5660e ? 1 : 0);
                    fVar.mo290a(20, cVar.f5661f ? 1 : 0);
                    byte[] a3 = C1518m.m7500a(cVar.f5662g);
                    if (a3 == null) {
                        fVar.mo288a(21);
                    } else {
                        fVar.mo292a(21, a3);
                    }
                } else {
                    fVar.mo288a(16);
                    fVar.mo288a(17);
                    fVar.mo288a(18);
                    fVar.mo288a(19);
                    fVar.mo288a(20);
                    fVar.mo288a(21);
                }
            }
        };
        this.f5752c = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.f5753d = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.f5754e = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f5755f = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.f5756g = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.f5757h = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.f5758i = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.f5759j = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    /* renamed from: b */
    public final int mo6767b(String str) {
        C0142f b = this.f5755f.mo365b();
        this.f5750a.mo313d();
        if (str == null) {
            try {
                b.mo288a(1);
            } catch (Throwable th) {
                this.f5750a.mo314e();
                this.f5755f.mo364a(b);
                throw th;
            }
        } else {
            b.mo291a(1, str);
        }
        int a = b.mo294a();
        this.f5750a.mo315f();
        this.f5750a.mo314e();
        this.f5755f.mo364a(b);
        return a;
    }

    /* renamed from: e */
    public final List<C1458e> mo6771e(String str) {
        C0164h a = C0164h.m457a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a.mo288a(1);
        } else {
            a.mo291a(1, str);
        }
        Cursor a2 = this.f5750a.mo306a((C0141e) a);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(C1458e.m7315a(a2.getBlob(0)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    /* renamed from: a */
    public final C1501g mo6761a(String str) {
        C0164h hVar;
        C1501g gVar;
        boolean z;
        boolean z2;
        boolean z3;
        String str2 = str;
        C0164h a = C0164h.m457a("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a.mo288a(1);
        } else {
            a.mo291a(1, str2);
        }
        Cursor a2 = this.f5750a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("minimum_retention_duration");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("content_uri_triggers");
                if (a2.moveToFirst()) {
                    String string = a2.getString(columnIndexOrThrow);
                    String string2 = a2.getString(columnIndexOrThrow3);
                    int i6 = columnIndexOrThrow9;
                    C1454c cVar = new C1454c();
                    cVar.f5657b = C1518m.m7502c(a2.getInt(columnIndexOrThrow16));
                    int i7 = a2.getInt(columnIndexOrThrow17);
                    boolean z4 = false;
                    if (i7 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f5658c = z;
                    if (a2.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f5659d = z2;
                    if (a2.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f5660e = z3;
                    if (a2.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    }
                    cVar.f5661f = z4;
                    cVar.f5662g = C1518m.m7499a(a2.getBlob(columnIndexOrThrow21));
                    gVar = new C1501g(string, string2);
                    gVar.f5735b = C1518m.m7498a(a2.getInt(columnIndexOrThrow2));
                    gVar.f5737d = a2.getString(columnIndexOrThrow4);
                    gVar.f5738e = C1458e.m7315a(a2.getBlob(columnIndexOrThrow5));
                    gVar.f5739f = C1458e.m7315a(a2.getBlob(columnIndexOrThrow6));
                    gVar.f5740g = a2.getLong(columnIndexOrThrow7);
                    gVar.f5741h = a2.getLong(columnIndexOrThrow8);
                    gVar.f5742i = a2.getLong(i6);
                    gVar.f5744k = a2.getInt(i5);
                    gVar.f5745l = C1518m.m7501b(a2.getInt(i4));
                    gVar.f5746m = a2.getLong(i3);
                    gVar.f5747n = a2.getLong(i2);
                    gVar.f5748o = a2.getLong(i);
                    gVar.f5749p = a2.getLong(columnIndexOrThrow15);
                    gVar.f5743j = cVar;
                } else {
                    gVar = null;
                }
                a2.close();
                hVar.mo362b();
                return gVar;
            } catch (Throwable th) {
                th = th;
                a2.close();
                hVar.mo362b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = a;
            a2.close();
            hVar.mo362b();
            throw th;
        }
    }

    /* renamed from: a */
    public final List<C1501g> mo6763a(int i) {
        C0164h hVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C0164h a = C0164h.m457a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a.mo290a(1, (long) i);
        Cursor a2 = this.f5750a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("minimum_retention_duration");
            hVar = a;
            try {
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("required_network_type");
                int i2 = columnIndexOrThrow14;
                int columnIndexOrThrow17 = a2.getColumnIndexOrThrow("requires_charging");
                int i3 = columnIndexOrThrow13;
                int columnIndexOrThrow18 = a2.getColumnIndexOrThrow("requires_device_idle");
                int i4 = columnIndexOrThrow12;
                int columnIndexOrThrow19 = a2.getColumnIndexOrThrow("requires_battery_not_low");
                int i5 = columnIndexOrThrow11;
                int columnIndexOrThrow20 = a2.getColumnIndexOrThrow("requires_storage_not_low");
                int i6 = columnIndexOrThrow10;
                int columnIndexOrThrow21 = a2.getColumnIndexOrThrow("content_uri_triggers");
                int i7 = columnIndexOrThrow9;
                int i8 = columnIndexOrThrow8;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(columnIndexOrThrow);
                    int i9 = columnIndexOrThrow;
                    String string2 = a2.getString(columnIndexOrThrow3);
                    int i10 = columnIndexOrThrow3;
                    C1454c cVar = new C1454c();
                    int i11 = columnIndexOrThrow16;
                    cVar.f5657b = C1518m.m7502c(a2.getInt(columnIndexOrThrow16));
                    if (a2.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f5658c = z;
                    if (a2.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f5659d = z2;
                    if (a2.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f5660e = z3;
                    if (a2.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f5661f = z4;
                    cVar.f5662g = C1518m.m7499a(a2.getBlob(columnIndexOrThrow21));
                    C1501g gVar = new C1501g(string, string2);
                    gVar.f5735b = C1518m.m7498a(a2.getInt(columnIndexOrThrow2));
                    gVar.f5737d = a2.getString(columnIndexOrThrow4);
                    gVar.f5738e = C1458e.m7315a(a2.getBlob(columnIndexOrThrow5));
                    gVar.f5739f = C1458e.m7315a(a2.getBlob(columnIndexOrThrow6));
                    int i12 = columnIndexOrThrow18;
                    gVar.f5740g = a2.getLong(columnIndexOrThrow7);
                    int i13 = columnIndexOrThrow4;
                    int i14 = columnIndexOrThrow5;
                    int i15 = i8;
                    gVar.f5741h = a2.getLong(i15);
                    int i16 = i7;
                    gVar.f5742i = a2.getLong(i16);
                    int i17 = i6;
                    gVar.f5744k = a2.getInt(i17);
                    int i18 = i5;
                    gVar.f5745l = C1518m.m7501b(a2.getInt(i18));
                    int i19 = i15;
                    int i20 = i16;
                    int i21 = i4;
                    gVar.f5746m = a2.getLong(i21);
                    int i22 = i17;
                    int i23 = i18;
                    int i24 = i3;
                    gVar.f5747n = a2.getLong(i24);
                    int i25 = i2;
                    gVar.f5748o = a2.getLong(i25);
                    int i26 = i24;
                    int i27 = i25;
                    int i28 = columnIndexOrThrow15;
                    gVar.f5749p = a2.getLong(i28);
                    gVar.f5743j = cVar;
                    arrayList.add(gVar);
                    columnIndexOrThrow15 = i28;
                    i4 = i21;
                    columnIndexOrThrow = i9;
                    columnIndexOrThrow3 = i10;
                    columnIndexOrThrow16 = i11;
                    columnIndexOrThrow18 = i12;
                    columnIndexOrThrow4 = i13;
                    columnIndexOrThrow5 = i14;
                    i8 = i19;
                    i7 = i20;
                    i6 = i22;
                    i5 = i23;
                    i3 = i26;
                    i2 = i27;
                }
                a2.close();
                hVar.mo362b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                hVar.mo362b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = a;
            a2.close();
            hVar.mo362b();
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo6760a(State state, String... strArr) {
        StringBuilder a = C0149a.m414a();
        a.append("UPDATE workspec SET state=");
        a.append("?");
        a.append(" WHERE id IN (");
        C0149a.m415a(a, 1);
        a.append(")");
        C0142f a2 = this.f5750a.mo304a(a.toString());
        a2.mo290a(1, (long) C1518m.m7497a(state));
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str == null) {
                a2.mo288a(2);
            } else {
                a2.mo291a(2, str);
            }
        }
        this.f5750a.mo313d();
        try {
            int a3 = a2.mo294a();
            this.f5750a.mo315f();
            return a3;
        } finally {
            this.f5750a.mo314e();
        }
    }

    /* renamed from: a */
    public final void mo6764a(String str, long j) {
        C0142f b = this.f5754e.mo365b();
        this.f5750a.mo313d();
        try {
            b.mo290a(1, j);
            if (str == null) {
                b.mo288a(2);
            } else {
                b.mo291a(2, str);
            }
            b.mo294a();
            this.f5750a.mo315f();
        } finally {
            this.f5750a.mo314e();
            this.f5754e.mo364a(b);
        }
    }

    /* renamed from: b */
    public final int mo6768b(String str, long j) {
        C0142f b = this.f5757h.mo365b();
        this.f5750a.mo313d();
        try {
            b.mo290a(1, j);
            if (str == null) {
                b.mo288a(2);
            } else {
                b.mo291a(2, str);
            }
            int a = b.mo294a();
            this.f5750a.mo315f();
            return a;
        } finally {
            this.f5750a.mo314e();
            this.f5757h.mo364a(b);
        }
    }

    /* renamed from: a */
    public final void mo6765a(String str, C1458e eVar) {
        C0142f b = this.f5753d.mo365b();
        this.f5750a.mo313d();
        try {
            byte[] a = C1458e.m7316a(eVar);
            if (a == null) {
                b.mo288a(1);
            } else {
                b.mo292a(1, a);
            }
            if (str == null) {
                b.mo288a(2);
            } else {
                b.mo291a(2, str);
            }
            b.mo294a();
            this.f5750a.mo315f();
        } finally {
            this.f5750a.mo314e();
            this.f5753d.mo364a(b);
        }
    }
}
