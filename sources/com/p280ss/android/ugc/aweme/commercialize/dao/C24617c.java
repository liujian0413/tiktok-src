package com.p280ss.android.ugc.aweme.commercialize.dao;

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

/* renamed from: com.ss.android.ugc.aweme.commercialize.dao.c */
public final class C24617c implements C24616b {

    /* renamed from: a */
    private final RoomDatabase f64928a;

    /* renamed from: b */
    private final C0155c f64929b;

    /* renamed from: c */
    private final C0148b f64930c;

    /* renamed from: d */
    private final C0165i f64931d;

    /* renamed from: a */
    public final void mo64468a() {
        C0142f b = this.f64931d.mo365b();
        this.f64928a.mo313d();
        try {
            b.mo294a();
            this.f64928a.mo315f();
        } finally {
            this.f64928a.mo314e();
            this.f64931d.mo364a(b);
        }
    }

    public C24617c(RoomDatabase roomDatabase) {
        this.f64928a = roomDatabase;
        this.f64929b = new C0155c<C24615a>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR ABORT INTO `showAd`(`awemeId`) VALUES (?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m80708a(fVar, (C24615a) obj);
            }

            /* renamed from: a */
            private static void m80708a(C0142f fVar, C24615a aVar) {
                if (aVar.f64927a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, aVar.f64927a);
                }
            }
        };
        this.f64930c = new C0148b<C24615a>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "DELETE FROM `showAd` WHERE `awemeId` = ?";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo331a(C0142f fVar, Object obj) {
                m80711a(fVar, (C24615a) obj);
            }

            /* renamed from: a */
            private static void m80711a(C0142f fVar, C24615a aVar) {
                if (aVar.f64927a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, aVar.f64927a);
                }
            }
        };
        this.f64931d = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "delete from showAd";
            }
        };
    }

    /* renamed from: a */
    public final void mo64469a(C24615a aVar) {
        this.f64928a.mo313d();
        try {
            this.f64929b.mo347a(aVar);
            this.f64928a.mo315f();
        } finally {
            this.f64928a.mo314e();
        }
    }

    /* renamed from: a */
    public final List<C24615a> mo64467a(String str) {
        C0164h a = C0164h.m457a("SELECT * FROM showAd where awemeId = ?", 1);
        if (str == null) {
            a.mo288a(1);
        } else {
            a.mo291a(1, str);
        }
        Cursor a2 = this.f64928a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("awemeId");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(new C24615a(a2.getString(columnIndexOrThrow)));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo362b();
        }
    }
}
