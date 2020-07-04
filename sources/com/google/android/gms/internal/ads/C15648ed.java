package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.util.C15333p;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ed */
public final class C15648ed extends C15664et implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener, C15653ei {

    /* renamed from: b */
    private static final String[] f44382b = {"2011", "1009", "3010"};

    /* renamed from: a */
    private final String f44383a;

    /* renamed from: c */
    private final Object f44384c = new Object();

    /* renamed from: d */
    private final FrameLayout f44385d;

    /* renamed from: e */
    private FrameLayout f44386e;

    /* renamed from: f */
    private View f44387f;

    /* renamed from: g */
    private Map<String, WeakReference<View>> f44388g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    private View f44389h;

    /* renamed from: i */
    private C15632dp f44390i;

    /* renamed from: j */
    private boolean f44391j = false;

    /* renamed from: k */
    private Point f44392k = new Point();

    /* renamed from: l */
    private Point f44393l = new Point();

    /* renamed from: m */
    private WeakReference<bub> f44394m = new WeakReference<>(null);

    public C15648ed(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        this.f44385d = frameLayout;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f44383a = str;
        this.f44386e = frameLayout2;
        ahd.m45860a((View) this.f44385d, (OnGlobalLayoutListener) this);
        ahd.m45861a((View) this.f44385d, (OnScrollChangedListener) this);
        this.f44385d.setOnTouchListener(this);
        this.f44385d.setOnClickListener(this);
        if (frameLayout2 != null && C15333p.m44600g()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        C15585bw.m50188a(this.f44385d.getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40520a(java.lang.String r4, com.google.android.gms.dynamic.C15345b r5) {
        /*
            r3 = this;
            java.lang.Object r5 = com.google.android.gms.dynamic.C15349d.m44669a(r5)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r3.f44384c
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f44388g     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000f:
            if (r5 != 0) goto L_0x0017
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r3.f44388g     // Catch:{ all -> 0x0040 }
            r5.remove(r4)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.f44388g     // Catch:{ all -> 0x0040 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0040 }
            r2.<init>(r5)     // Catch:{ all -> 0x0040 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "1098"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = "3011"
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            r5.setOnTouchListener(r3)     // Catch:{ all -> 0x0040 }
            r4 = 1
            r5.setClickable(r4)     // Catch:{ all -> 0x0040 }
            r5.setOnClickListener(r3)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15648ed.mo40520a(java.lang.String, com.google.android.gms.dynamic.b):void");
    }

    /* renamed from: a */
    public final C15345b mo40516a(String str) {
        synchronized (this.f44384c) {
            View view = null;
            if (this.f44388g == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.f44388g.get(str);
            if (weakReference != null) {
                view = (View) weakReference.get();
            }
            C15345b a = C15349d.m44668a(view);
            return a;
        }
    }

    /* renamed from: a */
    private final void m50664a(View view) {
        C15632dp dpVar;
        if (this.f44390i != null) {
            if (this.f44390i instanceof C15631do) {
                dpVar = ((C15631do) this.f44390i).mo41588i();
            } else {
                dpVar = this.f44390i;
            }
            if (dpVar != null) {
                dpVar.mo41600c(view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0200, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40518a(com.google.android.gms.dynamic.C15345b r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f44384c
            monitor-enter(r0)
            r1 = 0
            r11.m50664a(r1)     // Catch:{ all -> 0x0204 }
            java.lang.Object r12 = com.google.android.gms.dynamic.C15349d.m44669a(r12)     // Catch:{ all -> 0x0204 }
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.C15638du     // Catch:{ all -> 0x0204 }
            if (r2 != 0) goto L_0x0016
            java.lang.String r12 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.acd.m45783e(r12)     // Catch:{ all -> 0x0204 }
            monitor-exit(r0)     // Catch:{ all -> 0x0204 }
            return
        L_0x0016:
            r2 = 1
            r11.f44391j = r2     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.du r12 = (com.google.android.gms.internal.ads.C15638du) r12     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.dp r3 = r11.f44390i     // Catch:{ all -> 0x0204 }
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.dp r3 = r11.f44390i     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r4 = r11.f44385d     // Catch:{ all -> 0x0204 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f44388g     // Catch:{ all -> 0x0204 }
            r3.mo41580b(r4, r5)     // Catch:{ all -> 0x0204 }
        L_0x0028:
            com.google.android.gms.internal.ads.dp r3 = r11.f44390i     // Catch:{ all -> 0x0204 }
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.C15638du     // Catch:{ all -> 0x0204 }
            r9 = 0
            if (r3 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.dp r3 = r11.f44390i     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.du r3 = (com.google.android.gms.internal.ads.C15638du) r3     // Catch:{ all -> 0x0204 }
            if (r3 == 0) goto L_0x0063
            android.content.Context r4 = r3.mo41603p()     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.aal r4 = com.google.android.gms.ads.internal.C14793ay.m42913s()     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r5 = r11.f44385d     // Catch:{ all -> 0x0204 }
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x0204 }
            boolean r4 = r4.mo39043a(r5)     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.aak r3 = r3.mo41615q()     // Catch:{ all -> 0x0204 }
            if (r3 == 0) goto L_0x0054
            r3.mo39037a(r9)     // Catch:{ all -> 0x0204 }
        L_0x0054:
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.bub> r4 = r11.f44394m     // Catch:{ all -> 0x0204 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.bub r4 = (com.google.android.gms.internal.ads.bub) r4     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x0063
            if (r3 == 0) goto L_0x0063
            r4.mo41321b(r3)     // Catch:{ all -> 0x0204 }
        L_0x0063:
            com.google.android.gms.internal.ads.dp r3 = r11.f44390i     // Catch:{ all -> 0x0204 }
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.C15631do     // Catch:{ all -> 0x0204 }
            if (r3 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.dp r3 = r11.f44390i     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.do r3 = (com.google.android.gms.internal.ads.C15631do) r3     // Catch:{ all -> 0x0204 }
            boolean r3 = r3.mo41587h()     // Catch:{ all -> 0x0204 }
            if (r3 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.dp r3 = r11.f44390i     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.do r3 = (com.google.android.gms.internal.ads.C15631do) r3     // Catch:{ all -> 0x0204 }
            r3.mo41577a(r12)     // Catch:{ all -> 0x0204 }
            goto L_0x0087
        L_0x007b:
            r11.f44390i = r12     // Catch:{ all -> 0x0204 }
            boolean r3 = r12 instanceof com.google.android.gms.internal.ads.C15631do     // Catch:{ all -> 0x0204 }
            if (r3 == 0) goto L_0x0087
            r3 = r12
            com.google.android.gms.internal.ads.do r3 = (com.google.android.gms.internal.ads.C15631do) r3     // Catch:{ all -> 0x0204 }
            r3.mo41577a(r1)     // Catch:{ all -> 0x0204 }
        L_0x0087:
            android.widget.FrameLayout r3 = r11.f44386e     // Catch:{ all -> 0x0204 }
            if (r3 != 0) goto L_0x008d
            monitor-exit(r0)     // Catch:{ all -> 0x0204 }
            return
        L_0x008d:
            android.widget.FrameLayout r3 = r11.f44386e     // Catch:{ all -> 0x0204 }
            r3.setClickable(r9)     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r3 = r11.f44386e     // Catch:{ all -> 0x0204 }
            r3.removeAllViews()     // Catch:{ all -> 0x0204 }
            boolean r3 = r12.mo41579a()     // Catch:{ all -> 0x0204 }
            if (r3 == 0) goto L_0x00cd
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.f44388g     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x00c5
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x0204 }
            java.lang.String r6 = "1098"
            r5[r9] = r6     // Catch:{ all -> 0x0204 }
            java.lang.String r6 = "3011"
            r5[r2] = r6     // Catch:{ all -> 0x0204 }
            r6 = 0
        L_0x00ad:
            if (r6 >= r4) goto L_0x00c5
            r7 = r5[r6]     // Catch:{ all -> 0x0204 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r8 = r11.f44388g     // Catch:{ all -> 0x0204 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x0204 }
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7     // Catch:{ all -> 0x0204 }
            if (r7 == 0) goto L_0x00c2
            java.lang.Object r4 = r7.get()     // Catch:{ all -> 0x0204 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x0204 }
            goto L_0x00c6
        L_0x00c2:
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00c5:
            r4 = r1
        L_0x00c6:
            boolean r5 = r4 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0204 }
            if (r5 == 0) goto L_0x00cd
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x0204 }
            goto L_0x00ce
        L_0x00cd:
            r4 = r1
        L_0x00ce:
            if (r3 == 0) goto L_0x00d3
            if (r4 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r2 = 0
        L_0x00d4:
            android.view.View r3 = r12.mo41571a(r11, r2)     // Catch:{ all -> 0x0204 }
            r11.f44389h = r3     // Catch:{ all -> 0x0204 }
            android.view.View r3 = r11.f44389h     // Catch:{ all -> 0x0204 }
            r10 = -1
            if (r3 == 0) goto L_0x011b
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.f44388g     // Catch:{ all -> 0x0204 }
            if (r3 == 0) goto L_0x00f1
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.f44388g     // Catch:{ all -> 0x0204 }
            java.lang.String r5 = r11.f44383a     // Catch:{ all -> 0x0204 }
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0204 }
            android.view.View r7 = r11.f44389h     // Catch:{ all -> 0x0204 }
            r6.<init>(r7)     // Catch:{ all -> 0x0204 }
            r3.put(r5, r6)     // Catch:{ all -> 0x0204 }
        L_0x00f1:
            if (r2 == 0) goto L_0x00fc
            r4.removeAllViews()     // Catch:{ all -> 0x0204 }
            android.view.View r2 = r11.f44389h     // Catch:{ all -> 0x0204 }
            r4.addView(r2)     // Catch:{ all -> 0x0204 }
            goto L_0x011b
        L_0x00fc:
            android.content.Context r2 = r12.mo41603p()     // Catch:{ all -> 0x0204 }
            com.google.android.gms.ads.formats.AdChoicesView r3 = new com.google.android.gms.ads.formats.AdChoicesView     // Catch:{ all -> 0x0204 }
            r3.<init>(r2)     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0204 }
            r2.<init>(r10, r10)     // Catch:{ all -> 0x0204 }
            r3.setLayoutParams(r2)     // Catch:{ all -> 0x0204 }
            android.view.View r2 = r11.f44389h     // Catch:{ all -> 0x0204 }
            r3.addView(r2)     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r2 = r11.f44386e     // Catch:{ all -> 0x0204 }
            if (r2 == 0) goto L_0x011b
            android.widget.FrameLayout r2 = r11.f44386e     // Catch:{ all -> 0x0204 }
            r2.addView(r3)     // Catch:{ all -> 0x0204 }
        L_0x011b:
            android.widget.FrameLayout r4 = r11.f44385d     // Catch:{ all -> 0x0204 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.f44388g     // Catch:{ all -> 0x0204 }
            r6 = 0
            r3 = r12
            r7 = r11
            r8 = r11
            r3.mo41576a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0204 }
            android.view.View r2 = r11.f44387f     // Catch:{ all -> 0x0204 }
            if (r2 != 0) goto L_0x0141
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r3 = r11.f44385d     // Catch:{ all -> 0x0204 }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x0204 }
            r2.<init>(r3)     // Catch:{ all -> 0x0204 }
            r11.f44387f = r2     // Catch:{ all -> 0x0204 }
            android.view.View r2 = r11.f44387f     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0204 }
            r3.<init>(r10, r9)     // Catch:{ all -> 0x0204 }
            r2.setLayoutParams(r3)     // Catch:{ all -> 0x0204 }
        L_0x0141:
            android.widget.FrameLayout r2 = r11.f44385d     // Catch:{ all -> 0x0204 }
            android.view.View r3 = r11.f44387f     // Catch:{ all -> 0x0204 }
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x0204 }
            if (r2 == r3) goto L_0x0152
            android.widget.FrameLayout r2 = r11.f44385d     // Catch:{ all -> 0x0204 }
            android.view.View r3 = r11.f44387f     // Catch:{ all -> 0x0204 }
            r2.addView(r3)     // Catch:{ all -> 0x0204 }
        L_0x0152:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.C15585bw.f43941dc     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.bt r3 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x0204 }
            java.lang.Object r2 = r3.mo41272a(r2)     // Catch:{ all -> 0x0204 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0204 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0204 }
            if (r2 != 0) goto L_0x0167
            r11.m50665a(r12)     // Catch:{ all -> 0x0204 }
        L_0x0167:
            java.lang.Object r2 = r11.f44384c     // Catch:{ all -> 0x0204 }
            monitor-enter(r2)     // Catch:{ all -> 0x0204 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.f44388g     // Catch:{ all -> 0x0201 }
            r12.mo41612a(r3)     // Catch:{ all -> 0x0201 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.f44388g     // Catch:{ all -> 0x0201 }
            if (r3 == 0) goto L_0x018e
            java.lang.String[] r3 = f44382b     // Catch:{ all -> 0x0201 }
            int r4 = r3.length     // Catch:{ all -> 0x0201 }
        L_0x0176:
            if (r9 >= r4) goto L_0x018e
            r5 = r3[r9]     // Catch:{ all -> 0x0201 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.f44388g     // Catch:{ all -> 0x0201 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x0201 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ all -> 0x0201 }
            if (r5 == 0) goto L_0x018b
            java.lang.Object r1 = r5.get()     // Catch:{ all -> 0x0201 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0201 }
            goto L_0x018e
        L_0x018b:
            int r9 = r9 + 1
            goto L_0x0176
        L_0x018e:
            boolean r3 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x0201 }
            if (r3 != 0) goto L_0x0194
            monitor-exit(r2)     // Catch:{ all -> 0x0201 }
            goto L_0x01a5
        L_0x0194:
            com.google.android.gms.internal.ads.ee r3 = new com.google.android.gms.internal.ads.ee     // Catch:{ all -> 0x0201 }
            r3.<init>(r11, r1)     // Catch:{ all -> 0x0201 }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.C15631do     // Catch:{ all -> 0x0201 }
            if (r4 == 0) goto L_0x01a1
            r12.mo41613b(r1, r3)     // Catch:{ all -> 0x0201 }
            goto L_0x01a4
        L_0x01a1:
            r12.mo41594a(r1, r3)     // Catch:{ all -> 0x0201 }
        L_0x01a4:
            monitor-exit(r2)     // Catch:{ all -> 0x0201 }
        L_0x01a5:
            r12.f44351c = r11     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r1 = r11.f44385d     // Catch:{ all -> 0x0204 }
            r12.mo41614d(r1)     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r12 = r11.f44385d     // Catch:{ all -> 0x0204 }
            r11.m50664a(r12)     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.dp r12 = r11.f44390i     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r1 = r11.f44385d     // Catch:{ all -> 0x0204 }
            r12.mo41598b(r1)     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.dp r12 = r11.f44390i     // Catch:{ all -> 0x0204 }
            boolean r12 = r12 instanceof com.google.android.gms.internal.ads.C15638du     // Catch:{ all -> 0x0204 }
            if (r12 == 0) goto L_0x01ff
            com.google.android.gms.internal.ads.dp r12 = r11.f44390i     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.du r12 = (com.google.android.gms.internal.ads.C15638du) r12     // Catch:{ all -> 0x0204 }
            if (r12 == 0) goto L_0x01ff
            android.content.Context r1 = r12.mo41603p()     // Catch:{ all -> 0x0204 }
            if (r1 == 0) goto L_0x01ff
            com.google.android.gms.internal.ads.aal r1 = com.google.android.gms.ads.internal.C14793ay.m42913s()     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r2 = r11.f44385d     // Catch:{ all -> 0x0204 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0204 }
            boolean r1 = r1.mo39043a(r2)     // Catch:{ all -> 0x0204 }
            if (r1 == 0) goto L_0x01ff
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.bub> r1 = r11.f44394m     // Catch:{ all -> 0x0204 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0204 }
            com.google.android.gms.internal.ads.bub r1 = (com.google.android.gms.internal.ads.bub) r1     // Catch:{ all -> 0x0204 }
            if (r1 != 0) goto L_0x01f8
            com.google.android.gms.internal.ads.bub r1 = new com.google.android.gms.internal.ads.bub     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r2 = r11.f44385d     // Catch:{ all -> 0x0204 }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x0204 }
            android.widget.FrameLayout r3 = r11.f44385d     // Catch:{ all -> 0x0204 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0204 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0204 }
            r2.<init>(r1)     // Catch:{ all -> 0x0204 }
            r11.f44394m = r2     // Catch:{ all -> 0x0204 }
        L_0x01f8:
            com.google.android.gms.internal.ads.aak r12 = r12.mo41615q()     // Catch:{ all -> 0x0204 }
            r1.mo41319a(r12)     // Catch:{ all -> 0x0204 }
        L_0x01ff:
            monitor-exit(r0)     // Catch:{ all -> 0x0204 }
            return
        L_0x0201:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0201 }
            throw r12     // Catch:{ all -> 0x0204 }
        L_0x0204:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0204 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15648ed.mo40518a(com.google.android.gms.dynamic.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f44384c
            monitor-enter(r0)
            com.google.android.gms.internal.ads.dp r1 = r9.f44390i     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0009:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15585bw.f43941dc     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ all -> 0x00b3 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.dp r1 = r9.f44390i     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C15638du     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.dp r1 = r9.f44390i     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.du r1 = (com.google.android.gms.internal.ads.C15638du) r1     // Catch:{ all -> 0x00b3 }
            r9.m50665a(r1)     // Catch:{ all -> 0x00b3 }
        L_0x0028:
            com.google.android.gms.internal.ads.dp r1 = r9.f44390i     // Catch:{ all -> 0x00b3 }
            r1.mo41583d()     // Catch:{ all -> 0x00b3 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x00b3 }
            r5.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r9.f44392k     // Catch:{ all -> 0x00b3 }
            int r2 = r2.x     // Catch:{ all -> 0x00b3 }
            int r2 = r9.m50663a(r2)     // Catch:{ all -> 0x00b3 }
            float r2 = (float) r2     // Catch:{ all -> 0x00b3 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r9.f44392k     // Catch:{ all -> 0x00b3 }
            int r2 = r2.y     // Catch:{ all -> 0x00b3 }
            int r2 = r9.m50663a(r2)     // Catch:{ all -> 0x00b3 }
            float r2 = (float) r2     // Catch:{ all -> 0x00b3 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r9.f44393l     // Catch:{ all -> 0x00b3 }
            int r2 = r2.x     // Catch:{ all -> 0x00b3 }
            int r2 = r9.m50663a(r2)     // Catch:{ all -> 0x00b3 }
            float r2 = (float) r2     // Catch:{ all -> 0x00b3 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r9.f44393l     // Catch:{ all -> 0x00b3 }
            int r2 = r2.y     // Catch:{ all -> 0x00b3 }
            int r2 = r9.m50663a(r2)     // Catch:{ all -> 0x00b3 }
            float r2 = (float) r2     // Catch:{ all -> 0x00b3 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x00b3 }
            android.view.View r1 = r9.f44389h     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a8
            android.view.View r1 = r9.f44389h     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.dp r1 = r9.f44390i     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.C15631do     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.dp r1 = r9.f44390i     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.do r1 = (com.google.android.gms.internal.ads.C15631do) r1     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.dp r1 = r1.mo41588i()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.dp r1 = r9.f44390i     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.do r1 = (com.google.android.gms.internal.ads.C15631do) r1     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.ads.dp r2 = r1.mo41588i()     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = r9.f44383a     // Catch:{ all -> 0x00b3 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f44388g     // Catch:{ all -> 0x00b3 }
            android.widget.FrameLayout r7 = r9.f44385d     // Catch:{ all -> 0x00b3 }
            r8 = 0
            r3 = r10
            r2.mo41595a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b1
        L_0x009a:
            com.google.android.gms.internal.ads.dp r2 = r9.f44390i     // Catch:{ all -> 0x00b3 }
            java.lang.String r4 = r9.f44383a     // Catch:{ all -> 0x00b3 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.f44388g     // Catch:{ all -> 0x00b3 }
            android.widget.FrameLayout r7 = r9.f44385d     // Catch:{ all -> 0x00b3 }
            r8 = 0
            r3 = r10
            r2.mo41595a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b1
        L_0x00a8:
            com.google.android.gms.internal.ads.dp r1 = r9.f44390i     // Catch:{ all -> 0x00b3 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r9.f44388g     // Catch:{ all -> 0x00b3 }
            android.widget.FrameLayout r3 = r9.f44385d     // Catch:{ all -> 0x00b3 }
            r1.mo41575a(r10, r2, r5, r3)     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00b3:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15648ed.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final void m50665a(C15638du duVar) {
        ami ami;
        if (this.f44386e != null) {
            try {
                ami = duVar.mo41589j();
            } catch (zzbnv e) {
                if (acv.m45593c()) {
                    acd.m45783e("Privileged processes cannot create HTML overlays.");
                } else {
                    acd.m45778b("Error obtaining overlay.", e);
                }
                ami = null;
            }
            if (ami != null) {
                this.f44386e.addView(ami.getView());
            }
        }
    }

    public final void onGlobalLayout() {
        synchronized (this.f44384c) {
            if (this.f44390i != null) {
                this.f44390i.mo41601c(this.f44385d, this.f44388g);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f44384c) {
            if (this.f44390i != null) {
                this.f44390i.mo41601c(this.f44385d, this.f44388g);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f44384c) {
            if (this.f44390i == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.f44385d.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f44392k = point;
            if (motionEvent.getAction() == 0) {
                this.f44393l = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.f44390i.mo41572a(obtain);
            obtain.recycle();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo40517a() {
        synchronized (this.f44384c) {
            if (this.f44386e != null) {
                this.f44386e.removeAllViews();
            }
            this.f44386e = null;
            this.f44388g = null;
            this.f44389h = null;
            this.f44390i = null;
            this.f44392k = null;
            this.f44393l = null;
            this.f44394m = null;
            this.f44387f = null;
        }
    }

    /* renamed from: a */
    public final void mo40519a(C15345b bVar, int i) {
        if (C14793ay.m42913s().mo39043a(this.f44385d.getContext()) && this.f44394m != null) {
            bub bub = (bub) this.f44394m.get();
            if (bub != null) {
                bub.mo41317a();
            }
        }
    }

    /* renamed from: b */
    public final void mo40521b(C15345b bVar) {
        this.f44390i.mo41573a((View) C15349d.m44669a(bVar));
    }

    /* renamed from: b */
    public final synchronized Map<String, WeakReference<View>> mo41620b() {
        return this.f44388g;
    }

    /* renamed from: c */
    public final View mo41621c() {
        return this.f44385d;
    }

    /* renamed from: a */
    private final int m50663a(int i) {
        return afb.m45731b(this.f44390i.mo41603p(), i);
    }
}
