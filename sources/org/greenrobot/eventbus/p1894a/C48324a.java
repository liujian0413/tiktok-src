package org.greenrobot.eventbus.p1894a;

import org.greenrobot.eventbus.C48342n;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: org.greenrobot.eventbus.a.a */
public abstract class C48324a implements C48326c {

    /* renamed from: a */
    private final Class f123379a;

    /* renamed from: b */
    private final Class<? extends C48326c> f123380b = null;

    /* renamed from: c */
    private final boolean f123381c;

    /* renamed from: a */
    public final Class mo121762a() {
        return this.f123379a;
    }

    /* renamed from: b */
    public final C48326c mo121764b() {
        if (this.f123380b == null) {
            return null;
        }
        try {
            return (C48326c) this.f123380b.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    protected C48324a(Class cls, Class<? extends C48326c> cls2, boolean z) {
        this.f123379a = cls;
        this.f123381c = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C48342n mo121763a(String str, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        try {
            C48342n nVar = new C48342n(this.f123379a.getDeclaredMethod(str, new Class[]{cls}), cls, threadMode, i, z);
            return nVar;
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder("Could not find subscriber method in ");
            sb.append(this.f123379a);
            sb.append(". Maybe a missing ProGuard rule?");
            throw new EventBusException(sb.toString(), e);
        }
    }
}
