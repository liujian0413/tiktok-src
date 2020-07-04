package org.greenrobot.eventbus.util;

import android.content.res.Resources;
import org.greenrobot.eventbus.C7705c;

/* renamed from: org.greenrobot.eventbus.util.a */
public final class C48346a {

    /* renamed from: a */
    final Resources f123453a;

    /* renamed from: b */
    final int f123454b;

    /* renamed from: c */
    final int f123455c;

    /* renamed from: d */
    final C48348c f123456d;

    /* renamed from: e */
    public C7705c f123457e;

    /* renamed from: f */
    public int f123458f;

    /* renamed from: g */
    public Class<?> f123459g;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C7705c mo121792a() {
        if (this.f123457e != null) {
            return this.f123457e;
        }
        return C7705c.m23799a();
    }

    /* renamed from: a */
    public final int mo121791a(Throwable th) {
        Integer a = this.f123456d.mo121795a(th);
        if (a != null) {
            return a.intValue();
        }
        return this.f123455c;
    }
}
