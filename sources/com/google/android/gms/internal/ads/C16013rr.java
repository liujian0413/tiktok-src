package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.rr */
public final class C16013rr extends C16014rs implements C15742hq<ami> {

    /* renamed from: a */
    private final ami f44947a;

    /* renamed from: b */
    private final Context f44948b;

    /* renamed from: c */
    private final WindowManager f44949c;

    /* renamed from: d */
    private final C15569bh f44950d;

    /* renamed from: e */
    private DisplayMetrics f44951e;

    /* renamed from: f */
    private float f44952f;

    /* renamed from: g */
    private int f44953g = -1;

    /* renamed from: h */
    private int f44954h = -1;

    /* renamed from: i */
    private int f44955i;

    /* renamed from: j */
    private int f44956j = -1;

    /* renamed from: k */
    private int f44957k = -1;

    /* renamed from: l */
    private int f44958l = -1;

    /* renamed from: m */
    private int f44959m = -1;

    public C16013rr(ami ami, Context context, C15569bh bhVar) {
        super(ami);
        this.f44947a = ami;
        this.f44948b = context;
        this.f44950d = bhVar;
        this.f44949c = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public final void mo41948a(int i, int i2) {
        int i3 = 0;
        if (this.f44948b instanceof Activity) {
            i3 = acl.m45551c((Activity) this.f44948b)[0];
        }
        if (this.f44947a.mo39759u() == null || !this.f44947a.mo39759u().mo39849e()) {
            this.f44958l = afb.m45731b(this.f44948b, this.f44947a.getWidth());
            this.f44959m = afb.m45731b(this.f44948b, this.f44947a.getHeight());
        }
        mo41952b(i, i2 - i3, this.f44958l, this.f44959m);
        this.f44947a.mo39761w().mo39767a(i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        this.f44951e = new DisplayMetrics();
        Display defaultDisplay = this.f44949c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f44951e);
        this.f44952f = this.f44951e.density;
        this.f44955i = defaultDisplay.getRotation();
        this.f44953g = afb.m45732b(this.f44951e, this.f44951e.widthPixels);
        this.f44954h = afb.m45732b(this.f44951e, this.f44951e.heightPixels);
        Activity d = this.f44947a.mo39466d();
        if (d == null || d.getWindow() == null) {
            this.f44956j = this.f44953g;
            this.f44957k = this.f44954h;
        } else {
            int[] a = acl.m45539a(d);
            this.f44956j = afb.m45732b(this.f44951e, a[0]);
            this.f44957k = afb.m45732b(this.f44951e, a[1]);
        }
        if (this.f44947a.mo39759u().mo39849e()) {
            this.f44958l = this.f44953g;
            this.f44959m = this.f44954h;
        } else {
            this.f44947a.measure(0, 0);
        }
        mo41950a(this.f44953g, this.f44954h, this.f44956j, this.f44957k, this.f44952f, this.f44955i);
        this.f44947a.mo39810a("onDeviceFeaturesReceived", new C16010ro(new C16012rq().mo41944b(this.f44950d.mo40680a()).mo41943a(this.f44950d.mo40681b()).mo41945c(this.f44950d.mo40683d()).mo41946d(this.f44950d.mo40682c()).mo41947e(true)).mo41942a());
        int[] iArr = new int[2];
        this.f44947a.getLocationOnScreen(iArr);
        mo41948a(afb.m45731b(this.f44948b, iArr[0]), afb.m45731b(this.f44948b, iArr[1]));
        if (acd.m45776a(2)) {
            acd.m45781d("Dispatching Ready Event.");
        }
        mo41953b(this.f44947a.mo39472k().f45677a);
    }
}
