package com.p280ss.android.ugc.aweme.challenge.data;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0148b;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.C0165i;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.data.b */
public final class C23688b implements C23687a {

    /* renamed from: a */
    private final RoomDatabase f62440a;

    /* renamed from: b */
    private final C0155c f62441b;

    /* renamed from: c */
    private final C0148b f62442c;

    /* renamed from: d */
    private final C0165i f62443d;

    /* renamed from: b */
    public final int mo61620b() {
        int i = 0;
        C0164h a = C0164h.m457a("SELECT count(*) FROM localHashTag", 0);
        Cursor a2 = this.f62440a.mo306a((C0141e) a);
        try {
            if (a2.moveToFirst()) {
                i = a2.getInt(0);
            }
            return i;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    /* renamed from: a */
    public final List<C23692c> mo61617a() {
        Long l;
        C0164h a = C0164h.m457a("SELECT * FROM localHashTag order by time desc", 0);
        Cursor a2 = this.f62440a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("name");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("time");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                C23692c cVar = new C23692c();
                cVar.f62447a = a2.getString(columnIndexOrThrow);
                if (a2.isNull(columnIndexOrThrow2)) {
                    l = null;
                } else {
                    l = Long.valueOf(a2.getLong(columnIndexOrThrow2));
                }
                cVar.f62448b = l;
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }

    public C23688b(RoomDatabase roomDatabase) {
        this.f62440a = roomDatabase;
        this.f62441b = new C0155c<C23692c>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR FAIL INTO `localHashTag`(`name`,`time`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m77655a(fVar, (C23692c) obj);
            }

            /* renamed from: a */
            private static void m77655a(C0142f fVar, C23692c cVar) {
                if (cVar.f62447a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, cVar.f62447a);
                }
                if (cVar.f62448b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo290a(2, cVar.f62448b.longValue());
                }
            }
        };
        this.f62442c = new C0148b<C23692c>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "UPDATE OR FAIL `localHashTag` SET `name` = ?,`time` = ? WHERE `name` = ?";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo331a(C0142f fVar, Object obj) {
                m77658a(fVar, (C23692c) obj);
            }

            /* renamed from: a */
            private static void m77658a(C0142f fVar, C23692c cVar) {
                if (cVar.f62447a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, cVar.f62447a);
                }
                if (cVar.f62448b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo290a(2, cVar.f62448b.longValue());
                }
                if (cVar.f62447a == null) {
                    fVar.mo288a(3);
                } else {
                    fVar.mo291a(3, cVar.f62447a);
                }
            }
        };
        this.f62443d = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM localHashTag WHERE time in(SELECT time FROM localHashTag ORDER BY time ASC LIMIT ?)";
            }
        };
    }

    /* renamed from: a */
    public final void mo61619a(C23692c cVar) {
        this.f62440a.mo313d();
        try {
            this.f62441b.mo347a(cVar);
            this.f62440a.mo315f();
        } finally {
            this.f62440a.mo314e();
        }
    }

    /* renamed from: b */
    public final void mo61621b(C23692c cVar) {
        this.f62440a.mo313d();
        try {
            this.f62442c.mo328a(cVar);
            this.f62440a.mo315f();
        } finally {
            this.f62440a.mo314e();
        }
    }

    /* renamed from: a */
    public final void mo61618a(int i) {
        C0142f b = this.f62443d.mo365b();
        this.f62440a.mo313d();
        try {
            b.mo290a(1, (long) i);
            b.mo294a();
            this.f62440a.mo315f();
        } finally {
            this.f62440a.mo314e();
            this.f62443d.mo364a(b);
        }
    }
}
