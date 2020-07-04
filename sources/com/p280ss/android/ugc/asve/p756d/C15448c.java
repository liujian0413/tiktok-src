package com.p280ss.android.ugc.asve.p756d;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;

/* renamed from: com.ss.android.ugc.asve.d.c */
public final class C15448c {

    /* renamed from: b */
    public static volatile C15448c f39748b;

    /* renamed from: c */
    public static final C15449a f39749c = new C15449a(null);

    /* renamed from: a */
    public final SharedPreferences f39750a;

    /* renamed from: com.ss.android.ugc.asve.d.c$a */
    public static final class C15449a {
        private C15449a() {
        }

        public /* synthetic */ C15449a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C15448c m45247a(Context context) {
            C7573i.m23587b(context, "context");
            if (C15448c.f39748b == null) {
                synchronized (C7575l.m23595a(C15448c.class)) {
                    if (C15448c.f39748b == null) {
                        C15448c.f39748b = new C15448c(context, null);
                    }
                }
            }
            C15448c cVar = C15448c.f39748b;
            if (cVar == null) {
                C7573i.m23580a();
            }
            return cVar;
        }
    }

    /* renamed from: a */
    public static final C15448c m45237a(Context context) {
        return C15449a.m45247a(context);
    }

    /* renamed from: a */
    public final int mo38999a() {
        return this.f39750a.getInt("key_camera_wide_mode", 0);
    }

    /* renamed from: b */
    public final int mo39003b() {
        return this.f39750a.getInt("key_camera_shake_mode", 0);
    }

    /* renamed from: c */
    public final long mo39005c() {
        return this.f39750a.getLong("key_sandbox_crash_time", -1);
    }

    /* renamed from: d */
    public final boolean mo39006d() {
        if (!this.f39750a.getBoolean("key_force_forbid_sandbox", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo39007e() {
        return this.f39750a.getBoolean("key_force_enable_sandbox", false);
    }

    private C15448c(Context context) {
        SharedPreferences a = C7285c.m22838a(context.getApplicationContext(), "asve_sp", 0);
        C7573i.m23582a((Object) a, "context.applicationConte…p\", Context.MODE_PRIVATE)");
        this.f39750a = a;
    }

    /* renamed from: a */
    public final void mo39000a(int i) {
        this.f39750a.edit().putInt("key_camera_wide_mode", i).apply();
    }

    /* renamed from: b */
    public final void mo39004b(int i) {
        this.f39750a.edit().putInt("key_camera_shake_mode", i).apply();
    }

    /* renamed from: a */
    public final void mo39001a(long j) {
        this.f39750a.edit().putLong("key_sandbox_crash_time", j).apply();
    }

    /* renamed from: a */
    public final void mo39002a(boolean z) {
        this.f39750a.edit().putBoolean("key_force_forbid_sandbox", z).apply();
    }

    public /* synthetic */ C15448c(Context context, C7571f fVar) {
        this(context);
    }
}
