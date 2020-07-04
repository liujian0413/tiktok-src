package com.p280ss.android.ugc.aweme.freeflowcard.data.p1280a;

import android.arch.persistence.p009a.C0142f;
import android.arch.persistence.room.C0155c;
import android.arch.persistence.room.C0165i;
import android.arch.persistence.room.RoomDatabase;
import com.p280ss.android.ugc.aweme.freeflowcard.data.entity.UserClickEvent;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.data.a.f */
public final class C29994f extends C29993e {

    /* renamed from: a */
    private final RoomDatabase f78810a;

    /* renamed from: b */
    private final C0155c f78811b;

    /* renamed from: c */
    private final C0165i f78812c;

    /* renamed from: a */
    public final void mo76189a() {
        C0142f b = this.f78812c.mo365b();
        this.f78810a.mo313d();
        try {
            b.mo294a();
            this.f78810a.mo315f();
        } finally {
            this.f78810a.mo314e();
            this.f78812c.mo364a(b);
        }
    }

    public C29994f(RoomDatabase roomDatabase) {
        this.f78810a = roomDatabase;
        this.f78811b = new C0155c<UserClickEvent>(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "INSERT OR ABORT INTO `tb_user_click_event`(`id`,`time`,`click_type`,`is_auto_play`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo345a(C0142f fVar, Object obj) {
                m98335a(fVar, (UserClickEvent) obj);
            }

            /* renamed from: a */
            private static void m98335a(C0142f fVar, UserClickEvent userClickEvent) {
                fVar.mo290a(1, (long) userClickEvent.f78821id);
                fVar.mo290a(2, userClickEvent.time);
                fVar.mo290a(3, (long) userClickEvent.clickType);
                fVar.mo290a(4, userClickEvent.isAutoPlay ? 1 : 0);
            }
        };
        this.f78812c = new C0165i(roomDatabase) {
            /* renamed from: a */
            public final String mo330a() {
                return "delete from tb_user_click_event";
            }
        };
    }
}
