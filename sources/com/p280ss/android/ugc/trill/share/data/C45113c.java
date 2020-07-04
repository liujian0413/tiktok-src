package com.p280ss.android.ugc.trill.share.data;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.C0165i;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.trill.share.data.c */
public final class C45113c implements C45112b {

    /* renamed from: a */
    private final RoomDatabase f115951a;

    /* renamed from: b */
    private final C0155c f115952b;

    /* renamed from: c */
    private final C0165i f115953c;

    public C45113c(RoomDatabase roomDatabase) {
        this.f115951a = roomDatabase;
        this.f115952b = new C0155c<C45111a>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR ABORT INTO `Record`(`rid`,`time`,`channel`,`share_type`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m142275a(fVar, (C45111a) obj);
            }

            /* renamed from: a */
            private static void m142275a(C0142f fVar, C45111a aVar) {
                fVar.mo290a(1, (long) aVar.f115947a);
                if (aVar.f115948b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo290a(2, aVar.f115948b.longValue());
                }
                if (aVar.f115949c == null) {
                    fVar.mo288a(3);
                } else {
                    fVar.mo291a(3, aVar.f115949c);
                }
                if (aVar.f115950d == null) {
                    fVar.mo288a(4);
                } else {
                    fVar.mo290a(4, (long) aVar.f115950d.intValue());
                }
            }
        };
        this.f115953c = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM record WHERE rid = ?";
            }
        };
    }

    /* renamed from: a */
    public final void mo107676a(C45111a aVar) {
        this.f115951a.mo313d();
        try {
            this.f115952b.mo347a(aVar);
            this.f115951a.mo315f();
        } finally {
            this.f115951a.mo314e();
        }
    }

    /* renamed from: b */
    public final void mo107677b(Integer num) {
        C0142f b = this.f115953c.mo365b();
        this.f115951a.mo313d();
        if (num == null) {
            try {
                b.mo288a(1);
            } catch (Throwable th) {
                this.f115951a.mo314e();
                this.f115953c.mo364a(b);
                throw th;
            }
        } else {
            b.mo290a(1, (long) num.intValue());
        }
        b.mo294a();
        this.f115951a.mo315f();
        this.f115951a.mo314e();
        this.f115953c.mo364a(b);
    }

    /* renamed from: c */
    public final long mo107678c(Integer num) {
        long j;
        C0164h a = C0164h.m457a("SELECT count(*) FROM record WHERE share_type = ?", 1);
        if (num == null) {
            a.mo288a(1);
        } else {
            a.mo290a(1, (long) num.intValue());
        }
        Cursor a2 = this.f115951a.mo306a((C0141e) a);
        try {
            if (a2.moveToFirst()) {
                j = a2.getLong(0);
            } else {
                j = 0;
            }
            return j;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    /* renamed from: a */
    public final List<C45111a> mo107674a(Integer num) {
        Long l;
        C0164h a = C0164h.m457a("SELECT * FROM record where share_type = ? order by time desc limit 10", 1);
        if (num == null) {
            a.mo288a(1);
        } else {
            a.mo290a(1, (long) num.intValue());
        }
        Cursor a2 = this.f115951a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("rid");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("channel");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("share_type");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C45111a aVar = new C45111a();
                aVar.f115947a = a2.getInt(columnIndexOrThrow);
                Integer num2 = null;
                if (a2.isNull(columnIndexOrThrow2)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(columnIndexOrThrow2));
                }
                aVar.f115948b = l;
                aVar.f115949c = a2.getString(columnIndexOrThrow3);
                if (!a2.isNull(columnIndexOrThrow4)) {
                    num2 = Integer.valueOf(a2.getInt(columnIndexOrThrow4));
                }
                aVar.f115950d = num2;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    /* renamed from: a */
    public final List<C45111a> mo107675a(Integer num, Integer num2) {
        Long l;
        C0164h a = C0164h.m457a("SELECT * FROM record where share_type = ? order by time desc limit ?", 2);
        if (num == null) {
            a.mo288a(1);
        } else {
            a.mo290a(1, (long) num.intValue());
        }
        if (num2 == null) {
            a.mo288a(2);
        } else {
            a.mo290a(2, (long) num2.intValue());
        }
        Cursor a2 = this.f115951a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("rid");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("channel");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("share_type");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C45111a aVar = new C45111a();
                aVar.f115947a = a2.getInt(columnIndexOrThrow);
                Integer num3 = null;
                if (a2.isNull(columnIndexOrThrow2)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(columnIndexOrThrow2));
                }
                aVar.f115948b = l;
                aVar.f115949c = a2.getString(columnIndexOrThrow3);
                if (!a2.isNull(columnIndexOrThrow4)) {
                    num3 = Integer.valueOf(a2.getInt(columnIndexOrThrow4));
                }
                aVar.f115950d = num3;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }
}
