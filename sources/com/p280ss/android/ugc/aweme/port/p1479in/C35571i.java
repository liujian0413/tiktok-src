package com.p280ss.android.ugc.aweme.port.p1479in;

import android.app.Activity;

/* renamed from: com.ss.android.ugc.aweme.port.in.i */
public final class C35571i {

    /* renamed from: a */
    public final Activity f93272a;

    /* renamed from: b */
    public final byte f93273b;

    /* renamed from: a */
    public static C35571i m114851a(Activity activity) {
        return new C35571i(activity, 1);
    }

    /* renamed from: b */
    public static C35571i m114852b(Activity activity) {
        return new C35571i(activity, 3);
    }

    /* renamed from: c */
    public static C35571i m114853c(Activity activity) {
        return new C35571i(activity, 5);
    }

    /* renamed from: d */
    public static C35571i m114854d(Activity activity) {
        return new C35571i(activity, 2);
    }

    private C35571i(Activity activity, byte b) {
        this.f93272a = activity;
        this.f93273b = b;
    }
}
