package com.p280ss.android.ugc.aweme.feedback.runtime.behavior;

import android.arch.persistence.room.C0160e;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.runtime.behavior.C37295c;
import com.p280ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b */
public final class C29093b {

    /* renamed from: a */
    public static C29093b f76839a = C29095b.m95442a();

    /* renamed from: b */
    public static final C29094a f76840b = new C29094a(null);

    /* renamed from: c */
    private final RuntimeBehaviorDataBase f76841c;

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b$a */
    public static final class C29094a {
        private C29094a() {
        }

        /* renamed from: a */
        public static C29093b m95441a() {
            return C29093b.f76839a;
        }

        public /* synthetic */ C29094a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.b$b */
    static final class C29095b {

        /* renamed from: a */
        public static final C29095b f76842a = new C29095b();

        /* renamed from: b */
        private static final C29093b f76843b = new C29093b(C6399b.m19921a(), null);

        private C29095b() {
        }

        /* renamed from: a */
        public static C29093b m95442a() {
            return f76843b;
        }
    }

    private C29093b(Context context) {
        RoomDatabase c = C0160e.m441a(context, RuntimeBehaviorDataBase.class, "runtimeBehavior").mo322c();
        C7573i.m23582a((Object) c, "Room.databaseBuilder(con…runtimeBehavior\").build()");
        this.f76841c = (RuntimeBehaviorDataBase) c;
    }

    /* renamed from: a */
    public final void mo74530a(C37295c cVar) {
        C7573i.m23587b(cVar, "entity");
        this.f76841c.mo93889h().mo93891a(cVar);
    }

    public /* synthetic */ C29093b(Context context, C7571f fVar) {
        this(context);
    }

    /* renamed from: a */
    public final List<C37295c> mo74529a(String str, long j) {
        C7573i.m23587b(str, "type");
        return this.f76841c.mo93889h().mo93890a(str, j);
    }

    /* renamed from: b */
    public final void mo74531b(String str, long j) {
        C7573i.m23587b(str, "type");
        this.f76841c.mo93889h().mo93892b(str, j);
    }
}
