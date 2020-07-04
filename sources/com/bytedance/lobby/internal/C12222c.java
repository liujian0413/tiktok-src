package com.bytedance.lobby.internal;

import android.content.Context;
import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.p614a.C12192a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lobby.internal.c */
public final class C12222c {

    /* renamed from: com.bytedance.lobby.internal.c$a */
    public static final class C12224a {

        /* renamed from: a */
        final List<C12203b> f32506a;

        /* renamed from: b */
        final Context f32507b;

        /* renamed from: c */
        public boolean f32508c;

        /* renamed from: com.bytedance.lobby.internal.c$a$a */
        public static class C12225a {

            /* renamed from: a */
            public List<C12203b> f32509a;

            /* renamed from: b */
            public Context f32510b;

            /* renamed from: c */
            public boolean f32511c;

            /* renamed from: a */
            public final C12224a mo29965a() {
                return new C12224a(this);
            }

            /* renamed from: a */
            public final C12225a mo29964a(boolean z) {
                this.f32511c = z;
                return this;
            }

            /* renamed from: a */
            public final C12225a mo29962a(Context context) {
                this.f32510b = context.getApplicationContext();
                return this;
            }

            /* renamed from: a */
            public final C12225a mo29963a(List<C12203b> list) {
                if (this.f32509a == null) {
                    this.f32509a = new ArrayList(list);
                } else {
                    this.f32509a.clear();
                    this.f32509a.addAll(list);
                }
                return this;
            }
        }

        private C12224a(C12225a aVar) {
            this.f32507b = aVar.f32510b;
            this.f32506a = aVar.f32509a;
            this.f32508c = aVar.f32511c;
        }
    }

    /* renamed from: a */
    public static C12226d m35539a() {
        return C12226d.m35546a();
    }

    /* renamed from: b */
    public static C12192a m35541b() {
        return C12192a.m35449a();
    }

    /* renamed from: a */
    public static void m35540a(C12224a aVar) {
        LobbyCore.initialize(aVar);
    }
}
