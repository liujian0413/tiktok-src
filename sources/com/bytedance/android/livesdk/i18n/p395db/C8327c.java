package com.bytedance.android.livesdk.i18n.p395db;

import android.arch.persistence.p009a.C0141e;
import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0164h;
import android.arch.persistence.room.RoomDatabase;
import android.database.Cursor;

/* renamed from: com.bytedance.android.livesdk.i18n.db.c */
public final class C8327c implements C8326b {

    /* renamed from: a */
    private final RoomDatabase f22867a;

    /* renamed from: b */
    private final C0155c f22868b;

    public C8327c(RoomDatabase roomDatabase) {
        this.f22867a = roomDatabase;
        this.f22868b = new C0155c<C8325a>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR REPLACE INTO `information`(`key`,`value`) VALUES (?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m25420a(fVar, (C8325a) obj);
            }

            /* renamed from: a */
            private static void m25420a(C0142f fVar, C8325a aVar) {
                if (aVar.f22865a == null) {
                    fVar.mo288a(1);
                } else {
                    fVar.mo291a(1, aVar.f22865a);
                }
                if (aVar.f22866b == null) {
                    fVar.mo288a(2);
                } else {
                    fVar.mo291a(2, aVar.f22866b);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo21499a(C8325a aVar) {
        this.f22867a.mo313d();
        try {
            this.f22868b.mo347a(aVar);
            this.f22867a.mo315f();
        } finally {
            this.f22867a.mo314e();
        }
    }

    /* renamed from: a */
    public final C8325a mo21498a(String str) {
        C8325a aVar;
        C0164h a = C0164h.m457a("SELECT * FROM information WHERE `key` = ?", 1);
        a.mo291a(1, str);
        Cursor a2 = this.f22867a.mo306a((C0141e) a);
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("key");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("value");
            if (a2.moveToFirst()) {
                aVar = new C8325a();
                aVar.f22865a = a2.getString(columnIndexOrThrow);
                aVar.f22866b = a2.getString(columnIndexOrThrow2);
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            a2.close();
            a.mo362b();
        }
    }
}
