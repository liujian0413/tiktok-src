package com.p280ss.android.ugc.aweme.freeflowcard.data.p1280a;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.C0165i;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;
import com.p280ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.a.b */
public final class C29986b extends C29985a {

    /* renamed from: a */
    private final RoomDatabase f78800a;

    /* renamed from: b */
    private final C0155c f78801b;

    /* renamed from: c */
    private final C0165i f78802c;

    /* renamed from: a */
    public final void mo76185a() {
        C0142f b = this.f78802c.mo365b();
        this.f78800a.mo313d();
        try {
            b.mo294a();
            this.f78800a.mo315f();
        } finally {
            this.f78800a.mo314e();
            this.f78802c.mo364a(b);
        }
    }

    public C29986b(RoomDatabase roomDatabase) {
        this.f78800a = roomDatabase;
        this.f78801b = new C0155c<AppStartMode>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR ABORT INTO `tb_app_start_mode`(`id`,`time`,`start_mode`) VALUES (nullif(?, 0),?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m98319a(fVar, (AppStartMode) obj);
            }

            /* renamed from: a */
            private static void m98319a(C0142f fVar, AppStartMode appStartMode) {
                fVar.mo290a(1, (long) appStartMode.f78819id);
                fVar.mo290a(2, appStartMode.time);
                fVar.mo290a(3, (long) appStartMode.mode);
            }
        };
        this.f78802c = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "delete from tb_app_start_mode";
            }
        };
    }

    /* renamed from: a */
    public final List<AppStartMode> mo76183a(long j, long j2) {
        C0164h a = C0164h.m457a("select * from tb_app_start_mode where time between ? and ?", 2);
        a.mo290a(1, j);
        a.mo290a(2, j2);
        Cursor a2 = this.f78800a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("start_mode");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                AppStartMode appStartMode = new AppStartMode();
                appStartMode.f78819id = a2.getInt(columnIndexOrThrow);
                appStartMode.time = a2.getLong(columnIndexOrThrow2);
                appStartMode.mode = a2.getInt(columnIndexOrThrow3);
                arrayList.add(appStartMode);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    /* renamed from: a */
    public final List<AppStartMode> mo76184a(long j, long j2, int i) {
        C0164h a = C0164h.m457a("select * from tb_app_start_mode where start_mode=? and time between ? and ?", 3);
        a.mo290a(1, (long) i);
        a.mo290a(2, j);
        a.mo290a(3, j2);
        Cursor a2 = this.f78800a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("start_mode");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                AppStartMode appStartMode = new AppStartMode();
                appStartMode.f78819id = a2.getInt(columnIndexOrThrow);
                appStartMode.time = a2.getLong(columnIndexOrThrow2);
                appStartMode.mode = a2.getInt(columnIndexOrThrow3);
                arrayList.add(appStartMode);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }
}
