package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.C15323f;
import java.util.Set;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.rg */
public final class C16002rg extends C16014rs {

    /* renamed from: a */
    private static final Set<String> f44907a = C15323f.m44571b("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: b */
    private String f44908b = "top-right";

    /* renamed from: c */
    private boolean f44909c = true;

    /* renamed from: d */
    private int f44910d;

    /* renamed from: e */
    private int f44911e;

    /* renamed from: f */
    private int f44912f = -1;

    /* renamed from: g */
    private int f44913g;

    /* renamed from: h */
    private int f44914h;

    /* renamed from: i */
    private int f44915i = -1;

    /* renamed from: j */
    private final Object f44916j = new Object();

    /* renamed from: k */
    private final ami f44917k;

    /* renamed from: l */
    private final Activity f44918l;

    /* renamed from: m */
    private anv f44919m;

    /* renamed from: n */
    private ImageView f44920n;

    /* renamed from: o */
    private LinearLayout f44921o;

    /* renamed from: p */
    private C16015rt f44922p;

    /* renamed from: q */
    private PopupWindow f44923q;

    /* renamed from: r */
    private RelativeLayout f44924r;

    /* renamed from: s */
    private ViewGroup f44925s;

    public C16002rg(ami ami, C16015rt rtVar) {
        super(ami, "resize");
        this.f44917k = ami;
        this.f44918l = ami.mo39466d();
        this.f44922p = rtVar;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41933a(java.util.Map<java.lang.String, java.lang.String> r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f44916j
            monitor-enter(r0)
            android.app.Activity r1 = r13.f44918l     // Catch:{ all -> 0x02fc }
            if (r1 != 0) goto L_0x000e
            java.lang.String r14 = "Not an activity context. Cannot resize."
            r13.mo41951a(r14)     // Catch:{ all -> 0x02fc }
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x000e:
            com.google.android.gms.internal.ads.ami r1 = r13.f44917k     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.anv r1 = r1.mo39759u()     // Catch:{ all -> 0x02fc }
            if (r1 != 0) goto L_0x001d
            java.lang.String r14 = "Webview is not yet available, size is not set."
            r13.mo41951a(r14)     // Catch:{ all -> 0x02fc }
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.ami r1 = r13.f44917k     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.anv r1 = r1.mo39759u()     // Catch:{ all -> 0x02fc }
            boolean r1 = r1.mo39849e()     // Catch:{ all -> 0x02fc }
            if (r1 == 0) goto L_0x0030
            java.lang.String r14 = "Is interstitial. Cannot resize an interstitial."
            r13.mo41951a(r14)     // Catch:{ all -> 0x02fc }
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x0030:
            com.google.android.gms.internal.ads.ami r1 = r13.f44917k     // Catch:{ all -> 0x02fc }
            boolean r1 = r1.mo39702B()     // Catch:{ all -> 0x02fc }
            if (r1 == 0) goto L_0x003f
            java.lang.String r14 = "Cannot resize an expanded banner."
            r13.mo41951a(r14)     // Catch:{ all -> 0x02fc }
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x003f:
            java.lang.String r1 = "width"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x02fc }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02fc }
            if (r1 != 0) goto L_0x005b
            java.lang.String r1 = "width"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x02fc }
            int r1 = com.google.android.gms.internal.ads.acl.m45540b(r1)     // Catch:{ all -> 0x02fc }
            r13.f44915i = r1     // Catch:{ all -> 0x02fc }
        L_0x005b:
            java.lang.String r1 = "height"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x02fc }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02fc }
            if (r1 != 0) goto L_0x0077
            java.lang.String r1 = "height"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x02fc }
            int r1 = com.google.android.gms.internal.ads.acl.m45540b(r1)     // Catch:{ all -> 0x02fc }
            r13.f44912f = r1     // Catch:{ all -> 0x02fc }
        L_0x0077:
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x02fc }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02fc }
            if (r1 != 0) goto L_0x0093
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x02fc }
            int r1 = com.google.android.gms.internal.ads.acl.m45540b(r1)     // Catch:{ all -> 0x02fc }
            r13.f44913g = r1     // Catch:{ all -> 0x02fc }
        L_0x0093:
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x02fc }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02fc }
            if (r1 != 0) goto L_0x00af
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x02fc }
            int r1 = com.google.android.gms.internal.ads.acl.m45540b(r1)     // Catch:{ all -> 0x02fc }
            r13.f44914h = r1     // Catch:{ all -> 0x02fc }
        L_0x00af:
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x02fc }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02fc }
            if (r1 != 0) goto L_0x00cb
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x02fc }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ all -> 0x02fc }
            r13.f44909c = r1     // Catch:{ all -> 0x02fc }
        L_0x00cb:
            java.lang.String r1 = "customClosePosition"
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x02fc }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x02fc }
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x02fc }
            if (r1 != 0) goto L_0x00db
            r13.f44908b = r14     // Catch:{ all -> 0x02fc }
        L_0x00db:
            int r14 = r13.f44915i     // Catch:{ all -> 0x02fc }
            r1 = 1
            r2 = 0
            if (r14 < 0) goto L_0x00e7
            int r14 = r13.f44912f     // Catch:{ all -> 0x02fc }
            if (r14 < 0) goto L_0x00e7
            r14 = 1
            goto L_0x00e8
        L_0x00e7:
            r14 = 0
        L_0x00e8:
            if (r14 != 0) goto L_0x00f1
            java.lang.String r14 = "Invalid width and height options. Cannot resize."
            r13.mo41951a(r14)     // Catch:{ all -> 0x02fc }
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x00f1:
            android.app.Activity r14 = r13.f44918l     // Catch:{ all -> 0x02fc }
            android.view.Window r14 = r14.getWindow()     // Catch:{ all -> 0x02fc }
            if (r14 == 0) goto L_0x02f5
            android.view.View r3 = r14.getDecorView()     // Catch:{ all -> 0x02fc }
            if (r3 != 0) goto L_0x0101
            goto L_0x02f5
        L_0x0101:
            int[] r3 = r13.m52039b()     // Catch:{ all -> 0x02fc }
            if (r3 != 0) goto L_0x010e
            java.lang.String r14 = "Resize location out of screen or close button is not visible."
            r13.mo41951a(r14)     // Catch:{ all -> 0x02fc }
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x010e:
            android.app.Activity r4 = r13.f44918l     // Catch:{ all -> 0x02fc }
            int r5 = r13.f44915i     // Catch:{ all -> 0x02fc }
            int r4 = com.google.android.gms.internal.ads.afb.m45721a(r4, r5)     // Catch:{ all -> 0x02fc }
            android.app.Activity r5 = r13.f44918l     // Catch:{ all -> 0x02fc }
            int r6 = r13.f44912f     // Catch:{ all -> 0x02fc }
            int r5 = com.google.android.gms.internal.ads.afb.m45721a(r5, r6)     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.ami r6 = r13.f44917k     // Catch:{ all -> 0x02fc }
            android.view.View r6 = r6.getView()     // Catch:{ all -> 0x02fc }
            android.view.ViewParent r6 = r6.getParent()     // Catch:{ all -> 0x02fc }
            if (r6 == 0) goto L_0x02ee
            boolean r7 = r6 instanceof android.view.ViewGroup     // Catch:{ all -> 0x02fc }
            if (r7 == 0) goto L_0x02ee
            r7 = r6
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.ami r8 = r13.f44917k     // Catch:{ all -> 0x02fc }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x02fc }
            r7.removeView(r8)     // Catch:{ all -> 0x02fc }
            android.widget.PopupWindow r7 = r13.f44923q     // Catch:{ all -> 0x02fc }
            if (r7 != 0) goto L_0x016a
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x02fc }
            r13.f44925s = r6     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.ami r6 = r13.f44917k     // Catch:{ all -> 0x02fc }
            android.view.View r6 = r6.getView()     // Catch:{ all -> 0x02fc }
            android.graphics.Bitmap r6 = com.google.android.gms.internal.ads.acl.m45512a(r6)     // Catch:{ all -> 0x02fc }
            android.widget.ImageView r7 = new android.widget.ImageView     // Catch:{ all -> 0x02fc }
            android.app.Activity r8 = r13.f44918l     // Catch:{ all -> 0x02fc }
            r7.<init>(r8)     // Catch:{ all -> 0x02fc }
            r13.f44920n = r7     // Catch:{ all -> 0x02fc }
            android.widget.ImageView r7 = r13.f44920n     // Catch:{ all -> 0x02fc }
            r7.setImageBitmap(r6)     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.ami r6 = r13.f44917k     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.anv r6 = r6.mo39759u()     // Catch:{ all -> 0x02fc }
            r13.f44919m = r6     // Catch:{ all -> 0x02fc }
            android.view.ViewGroup r6 = r13.f44925s     // Catch:{ all -> 0x02fc }
            android.widget.ImageView r7 = r13.f44920n     // Catch:{ all -> 0x02fc }
            r6.addView(r7)     // Catch:{ all -> 0x02fc }
            goto L_0x016f
        L_0x016a:
            android.widget.PopupWindow r6 = r13.f44923q     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.C16003rh.m52045a(r6)     // Catch:{ all -> 0x02fc }
        L_0x016f:
            android.widget.RelativeLayout r6 = new android.widget.RelativeLayout     // Catch:{ all -> 0x02fc }
            android.app.Activity r7 = r13.f44918l     // Catch:{ all -> 0x02fc }
            r6.<init>(r7)     // Catch:{ all -> 0x02fc }
            r13.f44924r = r6     // Catch:{ all -> 0x02fc }
            android.widget.RelativeLayout r6 = r13.f44924r     // Catch:{ all -> 0x02fc }
            r6.setBackgroundColor(r2)     // Catch:{ all -> 0x02fc }
            android.widget.RelativeLayout r6 = r13.f44924r     // Catch:{ all -> 0x02fc }
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x02fc }
            r7.<init>(r4, r5)     // Catch:{ all -> 0x02fc }
            r6.setLayoutParams(r7)     // Catch:{ all -> 0x02fc }
            android.widget.RelativeLayout r6 = r13.f44924r     // Catch:{ all -> 0x02fc }
            android.widget.PopupWindow r6 = com.google.android.gms.internal.ads.acl.m45516a(r6, r4, r5, r2)     // Catch:{ all -> 0x02fc }
            r13.f44923q = r6     // Catch:{ all -> 0x02fc }
            android.widget.PopupWindow r6 = r13.f44923q     // Catch:{ all -> 0x02fc }
            r6.setOutsideTouchable(r1)     // Catch:{ all -> 0x02fc }
            android.widget.PopupWindow r6 = r13.f44923q     // Catch:{ all -> 0x02fc }
            r6.setTouchable(r1)     // Catch:{ all -> 0x02fc }
            android.widget.PopupWindow r6 = r13.f44923q     // Catch:{ all -> 0x02fc }
            boolean r7 = r13.f44909c     // Catch:{ all -> 0x02fc }
            r7 = r7 ^ r1
            r6.setClippingEnabled(r7)     // Catch:{ all -> 0x02fc }
            android.widget.RelativeLayout r6 = r13.f44924r     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.ami r7 = r13.f44917k     // Catch:{ all -> 0x02fc }
            android.view.View r7 = r7.getView()     // Catch:{ all -> 0x02fc }
            r8 = -1
            r6.addView(r7, r8, r8)     // Catch:{ all -> 0x02fc }
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch:{ all -> 0x02fc }
            android.app.Activity r7 = r13.f44918l     // Catch:{ all -> 0x02fc }
            r6.<init>(r7)     // Catch:{ all -> 0x02fc }
            r13.f44921o = r6     // Catch:{ all -> 0x02fc }
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x02fc }
            android.app.Activity r7 = r13.f44918l     // Catch:{ all -> 0x02fc }
            r9 = 50
            int r7 = com.google.android.gms.internal.ads.afb.m45721a(r7, r9)     // Catch:{ all -> 0x02fc }
            android.app.Activity r10 = r13.f44918l     // Catch:{ all -> 0x02fc }
            int r9 = com.google.android.gms.internal.ads.afb.m45721a(r10, r9)     // Catch:{ all -> 0x02fc }
            r6.<init>(r7, r9)     // Catch:{ all -> 0x02fc }
            java.lang.String r7 = r13.f44908b     // Catch:{ all -> 0x02fc }
            int r9 = r7.hashCode()     // Catch:{ all -> 0x02fc }
            switch(r9) {
                case -1364013995: goto L_0x0205;
                case -1012429441: goto L_0x01fb;
                case -655373719: goto L_0x01f1;
                case 1163912186: goto L_0x01e7;
                case 1288627767: goto L_0x01dd;
                case 1755462605: goto L_0x01d3;
                default: goto L_0x01d2;
            }     // Catch:{ all -> 0x02fc }
        L_0x01d2:
            goto L_0x020f
        L_0x01d3:
            java.lang.String r9 = "top-center"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x02fc }
            if (r7 == 0) goto L_0x020f
            r7 = 1
            goto L_0x0210
        L_0x01dd:
            java.lang.String r9 = "bottom-center"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x02fc }
            if (r7 == 0) goto L_0x020f
            r7 = 4
            goto L_0x0210
        L_0x01e7:
            java.lang.String r9 = "bottom-right"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x02fc }
            if (r7 == 0) goto L_0x020f
            r7 = 5
            goto L_0x0210
        L_0x01f1:
            java.lang.String r9 = "bottom-left"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x02fc }
            if (r7 == 0) goto L_0x020f
            r7 = 3
            goto L_0x0210
        L_0x01fb:
            java.lang.String r9 = "top-left"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x02fc }
            if (r7 == 0) goto L_0x020f
            r7 = 0
            goto L_0x0210
        L_0x0205:
            java.lang.String r9 = "center"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x02fc }
            if (r7 == 0) goto L_0x020f
            r7 = 2
            goto L_0x0210
        L_0x020f:
            r7 = -1
        L_0x0210:
            r8 = 14
            r9 = 9
            r10 = 11
            r11 = 12
            r12 = 10
            switch(r7) {
                case 0: goto L_0x0243;
                case 1: goto L_0x023c;
                case 2: goto L_0x0236;
                case 3: goto L_0x022f;
                case 4: goto L_0x0228;
                case 5: goto L_0x0221;
                default: goto L_0x021d;
            }     // Catch:{ all -> 0x02fc }
        L_0x021d:
            r6.addRule(r12)     // Catch:{ all -> 0x02fc }
            goto L_0x024a
        L_0x0221:
            r6.addRule(r11)     // Catch:{ all -> 0x02fc }
            r6.addRule(r10)     // Catch:{ all -> 0x02fc }
            goto L_0x024d
        L_0x0228:
            r6.addRule(r11)     // Catch:{ all -> 0x02fc }
            r6.addRule(r8)     // Catch:{ all -> 0x02fc }
            goto L_0x024d
        L_0x022f:
            r6.addRule(r11)     // Catch:{ all -> 0x02fc }
            r6.addRule(r9)     // Catch:{ all -> 0x02fc }
            goto L_0x024d
        L_0x0236:
            r7 = 13
            r6.addRule(r7)     // Catch:{ all -> 0x02fc }
            goto L_0x024d
        L_0x023c:
            r6.addRule(r12)     // Catch:{ all -> 0x02fc }
            r6.addRule(r8)     // Catch:{ all -> 0x02fc }
            goto L_0x024d
        L_0x0243:
            r6.addRule(r12)     // Catch:{ all -> 0x02fc }
            r6.addRule(r9)     // Catch:{ all -> 0x02fc }
            goto L_0x024d
        L_0x024a:
            r6.addRule(r10)     // Catch:{ all -> 0x02fc }
        L_0x024d:
            android.widget.LinearLayout r7 = r13.f44921o     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.ri r8 = new com.google.android.gms.internal.ads.ri     // Catch:{ all -> 0x02fc }
            r8.<init>(r13)     // Catch:{ all -> 0x02fc }
            r7.setOnClickListener(r8)     // Catch:{ all -> 0x02fc }
            android.widget.LinearLayout r7 = r13.f44921o     // Catch:{ all -> 0x02fc }
            java.lang.String r8 = "Close button"
            r7.setContentDescription(r8)     // Catch:{ all -> 0x02fc }
            android.widget.RelativeLayout r7 = r13.f44924r     // Catch:{ all -> 0x02fc }
            android.widget.LinearLayout r8 = r13.f44921o     // Catch:{ all -> 0x02fc }
            r7.addView(r8, r6)     // Catch:{ all -> 0x02fc }
            android.widget.PopupWindow r6 = r13.f44923q     // Catch:{ RuntimeException -> 0x02a6 }
            android.view.View r14 = r14.getDecorView()     // Catch:{ RuntimeException -> 0x02a6 }
            android.app.Activity r7 = r13.f44918l     // Catch:{ RuntimeException -> 0x02a6 }
            r8 = r3[r2]     // Catch:{ RuntimeException -> 0x02a6 }
            int r7 = com.google.android.gms.internal.ads.afb.m45721a(r7, r8)     // Catch:{ RuntimeException -> 0x02a6 }
            android.app.Activity r8 = r13.f44918l     // Catch:{ RuntimeException -> 0x02a6 }
            r9 = r3[r1]     // Catch:{ RuntimeException -> 0x02a6 }
            int r8 = com.google.android.gms.internal.ads.afb.m45721a(r8, r9)     // Catch:{ RuntimeException -> 0x02a6 }
            r6.showAtLocation(r14, r2, r7, r8)     // Catch:{ RuntimeException -> 0x02a6 }
            r14 = r3[r2]     // Catch:{ all -> 0x02fc }
            r6 = r3[r1]     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.rt r7 = r13.f44922p     // Catch:{ all -> 0x02fc }
            if (r7 == 0) goto L_0x028f
            com.google.android.gms.internal.ads.rt r7 = r13.f44922p     // Catch:{ all -> 0x02fc }
            int r8 = r13.f44915i     // Catch:{ all -> 0x02fc }
            int r9 = r13.f44912f     // Catch:{ all -> 0x02fc }
            r7.mo37738a(r14, r6, r8, r9)     // Catch:{ all -> 0x02fc }
        L_0x028f:
            com.google.android.gms.internal.ads.ami r14 = r13.f44917k     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.anv r4 = com.google.android.gms.internal.ads.anv.m46663a(r4, r5)     // Catch:{ all -> 0x02fc }
            r14.mo39717a(r4)     // Catch:{ all -> 0x02fc }
            r14 = r3[r2]     // Catch:{ all -> 0x02fc }
            r1 = r3[r1]     // Catch:{ all -> 0x02fc }
            r13.m52038b(r14, r1)     // Catch:{ all -> 0x02fc }
            java.lang.String r14 = "resized"
            r13.mo41954c(r14)     // Catch:{ all -> 0x02fc }
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x02a6:
            r14 = move-exception
            java.lang.String r1 = "Cannot show popup window: "
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x02fc }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x02fc }
            int r2 = r14.length()     // Catch:{ all -> 0x02fc }
            if (r2 == 0) goto L_0x02bc
            java.lang.String r14 = r1.concat(r14)     // Catch:{ all -> 0x02fc }
            goto L_0x02c1
        L_0x02bc:
            java.lang.String r14 = new java.lang.String     // Catch:{ all -> 0x02fc }
            r14.<init>(r1)     // Catch:{ all -> 0x02fc }
        L_0x02c1:
            r13.mo41951a(r14)     // Catch:{ all -> 0x02fc }
            android.widget.RelativeLayout r14 = r13.f44924r     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.ami r1 = r13.f44917k     // Catch:{ all -> 0x02fc }
            android.view.View r1 = r1.getView()     // Catch:{ all -> 0x02fc }
            r14.removeView(r1)     // Catch:{ all -> 0x02fc }
            android.view.ViewGroup r14 = r13.f44925s     // Catch:{ all -> 0x02fc }
            if (r14 == 0) goto L_0x02ec
            android.view.ViewGroup r14 = r13.f44925s     // Catch:{ all -> 0x02fc }
            android.widget.ImageView r1 = r13.f44920n     // Catch:{ all -> 0x02fc }
            r14.removeView(r1)     // Catch:{ all -> 0x02fc }
            android.view.ViewGroup r14 = r13.f44925s     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.ami r1 = r13.f44917k     // Catch:{ all -> 0x02fc }
            android.view.View r1 = r1.getView()     // Catch:{ all -> 0x02fc }
            r14.addView(r1)     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.ami r14 = r13.f44917k     // Catch:{ all -> 0x02fc }
            com.google.android.gms.internal.ads.anv r1 = r13.f44919m     // Catch:{ all -> 0x02fc }
            r14.mo39717a(r1)     // Catch:{ all -> 0x02fc }
        L_0x02ec:
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x02ee:
            java.lang.String r14 = "Webview is detached, probably in the middle of a resize or expand."
            r13.mo41951a(r14)     // Catch:{ all -> 0x02fc }
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x02f5:
            java.lang.String r14 = "Activity context is not ready, cannot get window or decor view."
            r13.mo41951a(r14)     // Catch:{ all -> 0x02fc }
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            return
        L_0x02fc:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02fc }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16002rg.mo41933a(java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo41934a(boolean z) {
        synchronized (this.f44916j) {
            if (this.f44923q != null) {
                C16003rh.m52045a(this.f44923q);
                this.f44924r.removeView(this.f44917k.getView());
                if (this.f44925s != null) {
                    this.f44925s.removeView(this.f44920n);
                    this.f44925s.addView(this.f44917k.getView());
                    this.f44917k.mo39717a(this.f44919m);
                }
                if (z) {
                    mo41954c("default");
                    if (this.f44922p != null) {
                        this.f44922p.mo37736K();
                    }
                }
                this.f44923q = null;
                this.f44924r = null;
                this.f44925s = null;
                this.f44921o = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010b, code lost:
        if ((r5 + 50) <= r1[1]) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int[] m52039b() {
        /*
            r9 = this;
            android.app.Activity r0 = r9.f44918l
            int[] r0 = com.google.android.gms.internal.ads.acl.m45545b(r0)
            android.app.Activity r1 = r9.f44918l
            int[] r1 = com.google.android.gms.internal.ads.acl.m45551c(r1)
            r2 = 0
            r3 = r0[r2]
            r4 = 1
            r0 = r0[r4]
            int r5 = r9.f44915i
            r6 = 2
            r7 = 50
            if (r5 < r7) goto L_0x0116
            int r5 = r9.f44915i
            if (r5 <= r3) goto L_0x001f
            goto L_0x0116
        L_0x001f:
            int r5 = r9.f44912f
            if (r5 < r7) goto L_0x0110
            int r5 = r9.f44912f
            if (r5 <= r0) goto L_0x0029
            goto L_0x0110
        L_0x0029:
            int r5 = r9.f44912f
            if (r5 != r0) goto L_0x0038
            int r0 = r9.f44915i
            if (r0 != r3) goto L_0x0038
            java.lang.String r0 = "Cannot resize to a full-screen ad."
            com.google.android.gms.internal.ads.acd.m45783e(r0)
            goto L_0x011b
        L_0x0038:
            boolean r0 = r9.f44909c
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = r9.f44908b
            r5 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case -1364013995: goto L_0x0079;
                case -1012429441: goto L_0x006f;
                case -655373719: goto L_0x0065;
                case 1163912186: goto L_0x005b;
                case 1288627767: goto L_0x0051;
                case 1755462605: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0083
        L_0x0047:
            java.lang.String r8 = "top-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0084
        L_0x0051:
            java.lang.String r8 = "bottom-center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 4
            goto L_0x0084
        L_0x005b:
            java.lang.String r8 = "bottom-right"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 5
            goto L_0x0084
        L_0x0065:
            java.lang.String r8 = "bottom-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 3
            goto L_0x0084
        L_0x006f:
            java.lang.String r8 = "top-left"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0084
        L_0x0079:
            java.lang.String r8 = "center"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0083
            r0 = 2
            goto L_0x0084
        L_0x0083:
            r0 = -1
        L_0x0084:
            switch(r0) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00be;
                case 4: goto L_0x00a9;
                case 5: goto L_0x0096;
                default: goto L_0x0087;
            }
        L_0x0087:
            int r0 = r9.f44910d
            int r5 = r9.f44913g
            int r0 = r0 + r5
            int r5 = r9.f44915i
            int r0 = r0 + r5
            int r0 = r0 - r7
            int r5 = r9.f44911e
            int r8 = r9.f44914h
            int r5 = r5 + r8
            goto L_0x00ff
        L_0x0096:
            int r0 = r9.f44910d
            int r5 = r9.f44913g
            int r0 = r0 + r5
            int r5 = r9.f44915i
            int r0 = r0 + r5
            int r0 = r0 - r7
            int r5 = r9.f44911e
            int r8 = r9.f44914h
            int r5 = r5 + r8
            int r8 = r9.f44912f
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x00ff
        L_0x00a9:
            int r0 = r9.f44910d
            int r5 = r9.f44913g
            int r0 = r0 + r5
            int r5 = r9.f44915i
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f44911e
            int r8 = r9.f44914h
            int r5 = r5 + r8
            int r8 = r9.f44912f
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x00ff
        L_0x00be:
            int r0 = r9.f44910d
            int r5 = r9.f44913g
            int r0 = r0 + r5
            int r5 = r9.f44911e
            int r8 = r9.f44914h
            int r5 = r5 + r8
            int r8 = r9.f44912f
            int r5 = r5 + r8
            int r5 = r5 - r7
            goto L_0x00ff
        L_0x00cd:
            int r0 = r9.f44910d
            int r5 = r9.f44913g
            int r0 = r0 + r5
            int r5 = r9.f44915i
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f44911e
            int r8 = r9.f44914h
            int r5 = r5 + r8
            int r8 = r9.f44912f
            int r8 = r8 / r6
            int r5 = r5 + r8
            int r5 = r5 + -25
            goto L_0x00ff
        L_0x00e4:
            int r0 = r9.f44910d
            int r5 = r9.f44913g
            int r0 = r0 + r5
            int r5 = r9.f44915i
            int r5 = r5 / r6
            int r0 = r0 + r5
            int r0 = r0 + -25
            int r5 = r9.f44911e
            int r8 = r9.f44914h
            int r5 = r5 + r8
            goto L_0x00ff
        L_0x00f5:
            int r0 = r9.f44910d
            int r5 = r9.f44913g
            int r0 = r0 + r5
            int r5 = r9.f44911e
            int r8 = r9.f44914h
            int r5 = r5 + r8
        L_0x00ff:
            if (r0 < 0) goto L_0x011b
            int r0 = r0 + r7
            if (r0 > r3) goto L_0x011b
            r0 = r1[r2]
            if (r5 < r0) goto L_0x011b
            int r5 = r5 + r7
            r0 = r1[r4]
            if (r5 <= r0) goto L_0x010e
            goto L_0x011b
        L_0x010e:
            r0 = 1
            goto L_0x011c
        L_0x0110:
            java.lang.String r0 = "Height is too small or too large."
            com.google.android.gms.internal.ads.acd.m45783e(r0)
            goto L_0x011b
        L_0x0116:
            java.lang.String r0 = "Width is too small or too large."
            com.google.android.gms.internal.ads.acd.m45783e(r0)
        L_0x011b:
            r0 = 0
        L_0x011c:
            if (r0 != 0) goto L_0x0120
            r0 = 0
            return r0
        L_0x0120:
            boolean r0 = r9.f44909c
            if (r0 == 0) goto L_0x0135
            int[] r0 = new int[r6]
            int r1 = r9.f44910d
            int r3 = r9.f44913g
            int r1 = r1 + r3
            r0[r2] = r1
            int r1 = r9.f44911e
            int r2 = r9.f44914h
            int r1 = r1 + r2
            r0[r4] = r1
            return r0
        L_0x0135:
            android.app.Activity r0 = r9.f44918l
            int[] r0 = com.google.android.gms.internal.ads.acl.m45545b(r0)
            android.app.Activity r1 = r9.f44918l
            int[] r1 = com.google.android.gms.internal.ads.acl.m45551c(r1)
            r0 = r0[r2]
            int r3 = r9.f44910d
            int r5 = r9.f44913g
            int r3 = r3 + r5
            int r5 = r9.f44911e
            int r7 = r9.f44914h
            int r5 = r5 + r7
            if (r3 >= 0) goto L_0x0151
            r0 = 0
            goto L_0x015b
        L_0x0151:
            int r7 = r9.f44915i
            int r7 = r7 + r3
            if (r7 <= r0) goto L_0x015a
            int r3 = r9.f44915i
            int r0 = r0 - r3
            goto L_0x015b
        L_0x015a:
            r0 = r3
        L_0x015b:
            r3 = r1[r2]
            if (r5 >= r3) goto L_0x0162
            r5 = r1[r2]
            goto L_0x016f
        L_0x0162:
            int r3 = r9.f44912f
            int r3 = r3 + r5
            r7 = r1[r4]
            if (r3 <= r7) goto L_0x016f
            r1 = r1[r4]
            int r3 = r9.f44912f
            int r5 = r1 - r3
        L_0x016f:
            int[] r1 = new int[r6]
            r1[r2] = r0
            r1[r4] = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16002rg.m52039b():int[]");
    }

    /* renamed from: a */
    public final void mo41932a(int i, int i2, boolean z) {
        synchronized (this.f44916j) {
            this.f44910d = i;
            this.f44911e = i2;
            if (this.f44923q != null && z) {
                int[] b = m52039b();
                if (b != null) {
                    this.f44923q.update(afb.m45721a((Context) this.f44918l, b[0]), afb.m45721a((Context) this.f44918l, b[1]), this.f44923q.getWidth(), this.f44923q.getHeight());
                    m52038b(b[0], b[1]);
                } else {
                    mo41934a(true);
                }
            }
        }
    }

    /* renamed from: b */
    private final void m52038b(int i, int i2) {
        mo41949a(i, i2 - acl.m45551c(this.f44918l)[0], this.f44915i, this.f44912f);
    }

    /* renamed from: a */
    public final boolean mo41935a() {
        boolean z;
        synchronized (this.f44916j) {
            z = this.f44923q != null;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo41931a(int i, int i2) {
        this.f44910d = i;
        this.f44911e = i2;
    }
}
