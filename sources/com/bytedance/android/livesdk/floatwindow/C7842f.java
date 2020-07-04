package com.bytedance.android.livesdk.floatwindow;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.facebook.ads.AdError;

/* renamed from: com.bytedance.android.livesdk.floatwindow.f */
public final class C7842f extends C7837a {

    /* renamed from: a */
    private final Context f21162a;

    /* renamed from: b */
    private final WindowManager f21163b;

    /* renamed from: c */
    private final LayoutParams f21164c;

    /* renamed from: d */
    private C7840d f21165d;

    /* renamed from: e */
    private View f21166e;

    /* renamed from: f */
    private int f21167f;

    /* renamed from: g */
    private int f21168g;

    /* renamed from: h */
    private boolean f21169h;

    /* renamed from: b */
    public final int mo20548b() {
        return this.f21167f;
    }

    /* renamed from: c */
    public final int mo20550c() {
        return this.f21168g;
    }

    /* access modifiers changed from: 0000 */
    public final void dismiss() {
        this.f21169h = true;
        this.f21163b.removeView(this.f21166e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20543a() {
        if (VERSION.SDK_INT >= 26) {
            this.f21164c.type = 2038;
        } else {
            this.f21164c.type = AdError.CACHE_ERROR_CODE;
        }
        this.f21163b.addView(this.f21166e, this.f21164c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20547a(View view) {
        this.f21166e = view;
    }

    /* renamed from: b */
    public final void mo20549b(int i) {
        if (!this.f21169h) {
            this.f21164c.y = i;
            this.f21168g = i;
            this.f21163b.updateViewLayout(this.f21166e, this.f21164c);
        }
    }

    /* renamed from: a */
    public final void mo20544a(int i) {
        if (!this.f21169h) {
            this.f21164c.x = i;
            this.f21167f = i;
            this.f21163b.updateViewLayout(this.f21166e, this.f21164c);
        }
    }

    /* renamed from: b */
    public final void mo20558b(int i, int i2) {
        this.f21164c.width = i;
        this.f21164c.height = i2;
    }

    /* renamed from: c */
    public final void mo20559c(int i, int i2) {
        this.f21164c.width = i;
        this.f21164c.height = i2;
        this.f21163b.updateViewLayout(this.f21166e, this.f21164c);
    }

    public C7842f(Context context, C7840d dVar) {
        this.f21162a = context;
        this.f21165d = dVar;
        this.f21163b = (WindowManager) context.getSystemService("window");
        this.f21164c = new LayoutParams();
        this.f21164c.format = 1;
        this.f21164c.flags = 552;
        this.f21164c.windowAnimations = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20545a(int i, int i2) {
        if (!this.f21169h) {
            this.f21164c.x = i;
            this.f21167f = i;
            this.f21164c.y = i2;
            this.f21168g = i2;
            this.f21163b.updateViewLayout(this.f21166e, this.f21164c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo20546a(int i, int i2, int i3) {
        this.f21164c.gravity = i;
        this.f21164c.x = i2;
        this.f21167f = i2;
        this.f21164c.y = i3;
        this.f21168g = i3;
    }
}
