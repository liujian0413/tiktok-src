package com.p280ss.android.ugc.aweme.freeflowcard.data.p1280a;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.C0165i;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;
import com.p280ss.android.ugc.aweme.freeflowcard.data.entity.AutoPlaySetting;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.a.d */
public final class C29990d extends C29989c {

    /* renamed from: a */
    private final RoomDatabase f78805a;

    /* renamed from: b */
    private final C0155c f78806b;

    /* renamed from: c */
    private final C0165i f78807c;

    /* renamed from: b */
    public final void mo76188b() {
        C0142f b = this.f78807c.mo365b();
        this.f78805a.mo313d();
        try {
            b.mo294a();
            this.f78805a.mo315f();
        } finally {
            this.f78805a.mo314e();
            this.f78807c.mo364a(b);
        }
    }

    /* renamed from: a */
    public final List<AutoPlaySetting> mo76186a() {
        boolean z;
        boolean z2;
        C0164h a = C0164h.m457a("select * from tb_auto_play_setting", 0);
        Cursor a2 = this.f78805a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("is_open");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("change_type");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("reset_time");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("monthly_state");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("day_open");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("day_open_reset_time");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (a2.getInt(columnIndexOrThrow2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = a2.getInt(columnIndexOrThrow3);
                long j = a2.getLong(columnIndexOrThrow4);
                int i2 = a2.getInt(columnIndexOrThrow5);
                if (a2.getInt(columnIndexOrThrow6) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AutoPlaySetting autoPlaySetting = new AutoPlaySetting(z, i, j, i2, z2, a2.getLong(columnIndexOrThrow7));
                autoPlaySetting.f78820id = a2.getInt(columnIndexOrThrow);
                arrayList.add(autoPlaySetting);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    public C29990d(RoomDatabase roomDatabase) {
        this.f78805a = roomDatabase;
        this.f78806b = new C0155c<AutoPlaySetting>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR ABORT INTO `tb_auto_play_setting`(`id`,`is_open`,`change_type`,`reset_time`,`monthly_state`,`day_open`,`day_open_reset_time`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m98329a(fVar, (AutoPlaySetting) obj);
            }

            /* renamed from: a */
            private static void m98329a(C0142f fVar, AutoPlaySetting autoPlaySetting) {
                fVar.mo290a(1, (long) autoPlaySetting.f78820id);
                fVar.mo290a(2, autoPlaySetting.isOpen ? 1 : 0);
                fVar.mo290a(3, (long) autoPlaySetting.changeType);
                fVar.mo290a(4, autoPlaySetting.resetTime);
                fVar.mo290a(5, (long) autoPlaySetting.monthlyState);
                fVar.mo290a(6, autoPlaySetting.isDayOpen ? 1 : 0);
                fVar.mo290a(7, autoPlaySetting.dayOpenResetTime);
            }
        };
        this.f78807c = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "delete from tb_auto_play_setting";
            }
        };
    }

    /* renamed from: a */
    public final void mo76187a(AutoPlaySetting autoPlaySetting) {
        this.f78805a.mo313d();
        try {
            this.f78806b.mo347a(autoPlaySetting);
            this.f78805a.mo315f();
        } finally {
            this.f78805a.mo314e();
        }
    }
}
