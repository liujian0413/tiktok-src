package com.google.android.play.core.p766a;

import android.app.PendingIntent;

/* renamed from: com.google.android.play.core.a.a */
public final class C17081a {

    /* renamed from: a */
    public final String f47773a;

    /* renamed from: b */
    public final int f47774b;

    /* renamed from: c */
    public final int f47775c;

    /* renamed from: d */
    public final int f47776d;

    /* renamed from: e */
    private final PendingIntent f47777e;

    /* renamed from: f */
    private final PendingIntent f47778f;

    public C17081a(String str, int i, int i2, int i3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.f47773a = str;
        this.f47774b = i;
        this.f47775c = i2;
        this.f47776d = i3;
        this.f47777e = pendingIntent;
        this.f47778f = pendingIntent2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PendingIntent mo44321a(int i) {
        if (i == 0) {
            return this.f47778f;
        }
        if (i == 1) {
            return this.f47777e;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo44322b(int i) {
        return i == 0 ? this.f47778f != null : i == 1 && this.f47777e != null;
    }
}
