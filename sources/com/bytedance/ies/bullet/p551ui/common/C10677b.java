package com.bytedance.ies.bullet.p551ui.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.bullet.core.common.YieldError;
import com.bytedance.ies.bullet.core.p538a.C10329b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.ui.common.b */
public abstract class C10677b implements C10689d {

    /* renamed from: a */
    private final WeakReference<Activity> f28553a;

    /* renamed from: b */
    private final List<C10329b> f28554b = new ArrayList();

    /* renamed from: b */
    private List<C10329b> m31183b() {
        return C7525m.m23516h((Iterable<? extends T>) this.f28554b);
    }

    /* renamed from: a */
    public final Activity mo25551a() {
        return (Activity) this.f28553a.get();
    }

    public C10677b(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.f28553a = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public final void mo25552a(C10329b bVar) {
        C7573i.m23587b(bVar, "delegate");
        this.f28554b.add(bVar);
    }

    /* renamed from: b */
    public final void mo25553b(C10329b bVar) {
        C7573i.m23587b(bVar, "delegate");
        this.f28554b.remove(bVar);
    }

    /* renamed from: a */
    public final void mo25087a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        for (C10329b a : m31183b()) {
            try {
                a.mo25087a(activity);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo25091b(Activity activity) {
        C7573i.m23587b(activity, "activity");
        for (C10329b b : m31183b()) {
            try {
                b.mo25091b(activity);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo25093c(Activity activity) {
        C7573i.m23587b(activity, "activity");
        for (C10329b c : m31183b()) {
            try {
                c.mo25093c(activity);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: d */
    public final void mo25095d(Activity activity) {
        C7573i.m23587b(activity, "activity");
        for (C10329b d : m31183b()) {
            try {
                d.mo25095d(activity);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: e */
    public final void mo25096e(Activity activity) {
        C7573i.m23587b(activity, "activity");
        for (C10329b e : m31183b()) {
            try {
                e.mo25096e(activity);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: f */
    public final boolean mo25097f(Activity activity) {
        C7573i.m23587b(activity, "activity");
        for (C10329b f : m31183b()) {
            try {
                return f.mo25097f(activity);
            } catch (YieldError unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo25092b(Activity activity, Bundle bundle) {
        C7573i.m23587b(activity, "activity");
        for (C10329b b : m31183b()) {
            try {
                b.mo25092b(activity, bundle);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo25094c(Activity activity, Bundle bundle) {
        C7573i.m23587b(activity, "activity");
        for (C10329b c : m31183b()) {
            try {
                c.mo25094c(activity, bundle);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo25089a(Activity activity, Bundle bundle) {
        C7573i.m23587b(activity, "activity");
        for (C10329b a : m31183b()) {
            try {
                a.mo25089a(activity, bundle);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo25090a(Activity activity, boolean z) {
        C7573i.m23587b(activity, "activity");
        for (C10329b a : m31183b()) {
            try {
                a.mo25090a(activity, z);
            } catch (YieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo25088a(Activity activity, int i, int i2, Intent intent) {
        C7573i.m23587b(activity, "activity");
        for (C10329b a : m31183b()) {
            try {
                a.mo25088a(activity, i, i2, intent);
            } catch (YieldError unused) {
            }
        }
    }
}
