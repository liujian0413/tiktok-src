package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.du */
public class C15638du implements C15632dp {

    /* renamed from: a */
    boolean f44349a;

    /* renamed from: b */
    boolean f44350b;

    /* renamed from: c */
    public C15653ei f44351c;

    /* renamed from: d */
    private final Object f44352d = new Object();

    /* renamed from: e */
    private final C15635dr f44353e;

    /* renamed from: f */
    private final Context f44354f;

    /* renamed from: g */
    private final C15613cx f44355g;

    /* renamed from: h */
    private final JSONObject f44356h;

    /* renamed from: i */
    private final C16075tz f44357i;

    /* renamed from: j */
    private final C15636ds f44358j;

    /* renamed from: k */
    private final bdt f44359k;

    /* renamed from: l */
    private final zzbgz f44360l;

    /* renamed from: m */
    private String f44361m;

    /* renamed from: n */
    private aak f44362n;

    /* renamed from: o */
    private boolean f44363o = false;

    /* renamed from: p */
    private long f44364p = 0;

    /* renamed from: q */
    private long f44365q = 0;

    /* renamed from: r */
    private WeakReference<View> f44366r = null;

    public C15638du(Context context, C15635dr drVar, C16075tz tzVar, bdt bdt, JSONObject jSONObject, C15636ds dsVar, zzbgz zzbgz, String str) {
        this.f44354f = context;
        this.f44353e = drVar;
        this.f44357i = tzVar;
        this.f44359k = bdt;
        this.f44356h = jSONObject;
        this.f44358j = dsVar;
        this.f44360l = zzbgz;
        this.f44361m = str;
        this.f44355g = new C15613cx(this.f44357i);
    }

    /* renamed from: b */
    public void mo41580b(View view, Map<String, WeakReference<View>> map) {
    }

    /* renamed from: a */
    public View mo41571a(OnClickListener onClickListener, boolean z) {
        C15612cw d = this.f44358j.mo41483d();
        if (d == null) {
            return null;
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (!z) {
            int i = d.f44250f;
            if (i != 0) {
                switch (i) {
                    case 2:
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                        break;
                    case 3:
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                        break;
                    default:
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                        break;
                }
            } else {
                layoutParams.addRule(10);
                layoutParams.addRule(9);
            }
        }
        C15615cz czVar = new C15615cz(this.f44354f, d, layoutParams);
        czVar.setOnClickListener(onClickListener);
        czVar.setContentDescription((CharSequence) bym.m50299d().mo41272a(C15585bw.f43823bQ));
        return czVar;
    }

    /* renamed from: a */
    public boolean mo41579a() {
        C15612cw d = this.f44358j.mo41483d();
        return d != null && d.f44251g;
    }

    /* renamed from: c */
    public boolean mo41582c() {
        return this.f44356h != null && this.f44356h.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* renamed from: b */
    public boolean mo41581b() {
        return this.f44356h != null && this.f44356h.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: a */
    private final boolean m50611a(String str) {
        JSONObject optJSONObject = this.f44356h == null ? null : this.f44356h.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    public final void mo41595a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2, boolean z) {
        JSONObject jSONObject;
        View view3 = view2;
        JSONObject a = m50609a(map, view3);
        JSONObject g = m50615g(view3);
        JSONObject h = m50616h(view2);
        JSONObject i = m50617i(view3);
        JSONObject jSONObject2 = null;
        try {
            Bundle bundle2 = bundle;
            JSONObject a2 = C14793ay.m42895a().mo39169a(bundle, (JSONObject) null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a2);
                String str2 = str;
            } catch (Exception e) {
                e = e;
                String str3 = str;
                jSONObject2 = jSONObject3;
                acd.m45778b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m50610a(view, g, a, h, i, str, jSONObject, null, z);
            }
            try {
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e2) {
                e = e2;
                jSONObject2 = jSONObject3;
                acd.m45778b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m50610a(view, g, a, h, i, str, jSONObject, null, z);
            }
        } catch (Exception e3) {
            e = e3;
            String str4 = str;
            acd.m45778b("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            m50610a(view, g, a, h, i, str, jSONObject, null, z);
        }
        m50610a(view, g, a, h, i, str, jSONObject, null, z);
    }

    /* renamed from: a */
    public void mo41575a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        C15267r.m44393b("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Entry entry : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                        mo41595a(view, (String) entry.getKey(), bundle, map, view2, false);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.f44358j.mo41481b())) {
            mo41595a(view, "3099", bundle, map, view2, false);
        } else if ("2".equals(this.f44358j.mo41481b())) {
            mo41595a(view, "2099", bundle, map, view2, false);
        } else {
            if ("1".equals(this.f44358j.mo41481b())) {
                mo41595a(view, "1099", bundle, map, view2, false);
            }
        }
    }

    /* renamed from: b */
    public final void mo41597b(Bundle bundle) {
        if (bundle == null) {
            acd.m45777b("Click data is null. No click is reported.");
        } else if (!m50611a("click_reporting")) {
            acd.m45779c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            m50610a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, C14793ay.m42895a().mo39169a(bundle, (JSONObject) null), false);
        }
    }

    /* renamed from: a */
    private final void m50610a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z) {
        C15267r.m44393b("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f44356h);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            long a = C14793ay.m42901g().mo38684a();
            jSONObject8.put("time_from_last_touch_down", a - this.f44365q);
            jSONObject8.put("time_from_last_touch", a - this.f44364p);
            jSONObject7.put("touch_signal", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", this.f44358j.mo41481b());
            jSONObject9.put("is_privileged_process", acv.m45593c());
            boolean z2 = false;
            if (this.f44355g.f44254a != null && this.f44356h.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", a);
            jSONObject9.put("has_custom_click_handler", this.f44353e.mo37663c(this.f44358j.mo41482c()) != null);
            if (this.f44363o && mo41581b()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            String str2 = "has_custom_click_handler";
            if (this.f44353e.mo37663c(this.f44358j.mo41482c()) != null) {
                z2 = true;
            }
            jSONObject7.put(str2, z2);
            try {
                JSONObject optJSONObject = this.f44356h.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject9.put("click_signals", this.f44359k.f41732a.mo37774a(this.f44354f, optJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                acd.m45778b("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject9);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f44361m);
            afw.m45813a(this.f44357i.mo42006b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            acd.m45778b("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: a */
    public void mo41572a(MotionEvent motionEvent) {
        this.f44364p = C14793ay.m42901g().mo38684a();
        if (motionEvent.getAction() == 0) {
            this.f44365q = C14793ay.m42901g().mo38684a();
        }
        this.f44359k.mo40534a(motionEvent);
    }

    /* renamed from: c */
    public final void mo41599c(Bundle bundle) {
        if (bundle == null) {
            acd.m45777b("Touch event data is null. No touch event is reported.");
        } else if (!m50611a("touch_reporting")) {
            acd.m45779c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            this.f44359k.f41732a.mo37776a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41601c(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f44352d
            monitor-enter(r0)
            boolean r1 = r3.f44349a     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0009:
            boolean r1 = m50613e(r4)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0014
            r3.mo41574a(r4, r5)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15585bw.f43827bU     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x005c
            monitor-enter(r5)     // Catch:{ all -> 0x005e }
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0059 }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0059 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0059 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0059 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = m50613e(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            r3.mo41574a(r4, r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r4     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15638du.mo41601c(android.view.View, java.util.Map):void");
    }

    /* renamed from: e */
    private static boolean m50613e(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* renamed from: m */
    public void mo41592m() {
        this.f44353e.mo37643H();
    }

    /* renamed from: a */
    public void mo41574a(View view, Map<String, WeakReference<View>> map) {
        m50612a(m50615g(view), m50609a(map, view), m50616h(view), m50617i(view), (JSONObject) null);
    }

    /* renamed from: a */
    public final boolean mo41596a(Bundle bundle) {
        if (!m50611a("impression_reporting")) {
            acd.m45779c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return m50612a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, C14793ay.m42895a().mo39169a(bundle, (JSONObject) null));
    }

    /* renamed from: a */
    private final boolean m50612a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        C15267r.m44393b("Invalid call from a non-UI thread.");
        if (this.f44349a) {
            return true;
        }
        this.f44349a = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f44356h);
            jSONObject6.put("ads_id", this.f44361m);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            afw.m45813a(this.f44357i.mo42008c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f44353e.mo37659a((C15632dp) this);
            this.f44353e.mo41611z();
            mo41592m();
            return true;
        } catch (JSONException e) {
            acd.m45778b("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: e */
    public void mo41584e() {
        C15267r.m44393b("Invalid call from a non-UI thread.");
        if (!this.f44350b) {
            this.f44350b = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad", this.f44356h);
                jSONObject.put("ads_id", this.f44361m);
                afw.m45813a(this.f44357i.mo42009d(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (JSONException e) {
                afm.m45778b("", e);
            }
        }
    }

    /* renamed from: o */
    public final View mo41602o() {
        if (this.f44366r != null) {
            return (View) this.f44366r.get();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo41600c(View view) {
        this.f44366r = new WeakReference<>(view);
    }

    /* renamed from: b */
    public final void mo41598b(View view) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43854bv)).booleanValue() && this.f44359k != null) {
            bdp bdp = this.f44359k.f41732a;
            if (bdp != null) {
                bdp.mo37778a(view);
            }
        }
    }

    /* renamed from: a */
    public void mo41576a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        if (map != null) {
            synchronized (map) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                        view2.setClickable(true);
                        view2.setOnClickListener(onClickListener);
                    }
                }
            }
        }
        if (map2 != null) {
            synchronized (map2) {
                for (Entry value2 : map2.entrySet()) {
                    View view3 = (View) ((WeakReference) value2.getValue()).get();
                    if (view3 != null) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public ami mo41589j() throws zzbnv {
        if (this.f44356h == null || this.f44356h.optJSONObject("overlay") == null) {
            return null;
        }
        Context context = this.f44354f;
        zzyz a = zzyz.m53264a(this.f44354f);
        ami a2 = amo.m46434a(context, anv.m46664a(a), a.f45798a, false, false, this.f44359k, this.f44360l, null, null, null, bwl.m50206a());
        if (a2 != null) {
            a2.getView().setVisibility(8);
            new C15640dw(a2).mo41616a(this.f44357i);
        }
        return a2;
    }

    /* renamed from: a */
    public final void mo41612a(Map<String, WeakReference<View>> map) {
        if (this.f44358j.mo41484e() != null) {
            boolean z = true;
            if ("2".equals(this.f44358j.mo41481b())) {
                acf j = C14793ay.m42898d().mo39100j();
                String A = this.f44353e.mo37576A();
                String b = this.f44358j.mo41481b();
                if (map == null || (!map.containsKey("2011") && !map.containsKey("3010"))) {
                    z = false;
                }
                j.mo39137a(A, b, z);
            } else if ("1".equals(this.f44358j.mo41481b())) {
                acf j2 = C14793ay.m42898d().mo39100j();
                String A2 = this.f44353e.mo37576A();
                String b2 = this.f44358j.mo41481b();
                if (map == null || (!map.containsKey("1009") && !map.containsKey("3010"))) {
                    z = false;
                }
                j2.mo39137a(A2, b2, z);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo41613b(View view, C15630dn dnVar) {
        FrameLayout.LayoutParams layoutParams;
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43826bT)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        View e = this.f44358j.mo41484e();
        if (e == null) {
            return false;
        }
        ViewParent parent = e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(e);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(e, layoutParams);
        this.f44353e.mo37658a(dnVar);
        return true;
    }

    /* renamed from: d */
    public final void mo41614d(View view) {
        this.f44353e.mo37661b(view);
    }

    /* renamed from: a */
    public final void mo41594a(View view, C15630dn dnVar) {
        if (!mo41613b(view, dnVar)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            if (this.f44358j instanceof C15637dt) {
                C15637dt dtVar = (C15637dt) this.f44358j;
                if (dtVar.mo41500f() != null && dtVar.mo41500f().size() > 0) {
                    Object obj = dtVar.mo41500f().get(0);
                    C15658en a = obj instanceof IBinder ? C15659eo.m50701a((IBinder) obj) : null;
                    if (a != null) {
                        try {
                            C15345b a2 = a.mo41491a();
                            if (a2 != null) {
                                Drawable drawable = (Drawable) C15349d.m44669a(a2);
                                ImageView imageView = new ImageView(this.f44354f);
                                imageView.setImageDrawable(drawable);
                                imageView.setScaleType(ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            acd.m45783e("Could not get drawable from image");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo41578a(C15706gh ghVar) {
        if (!this.f44356h.optBoolean("custom_one_point_five_click_enabled", false)) {
            acd.m45783e("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.f44355g.mo41475a(ghVar);
        }
    }

    /* renamed from: d */
    public void mo41583d() {
        if (this.f44356h.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f44355g.mo41474a();
        }
    }

    /* renamed from: a */
    public void mo41573a(View view) {
        if (!this.f44356h.optBoolean("custom_one_point_five_click_enabled", false)) {
            acd.m45783e("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        C15613cx cxVar = this.f44355g;
        if (view != null) {
            view.setOnClickListener(cxVar);
            view.setClickable(true);
            cxVar.f44257d = new WeakReference<>(view);
        }
    }

    /* renamed from: f */
    public void mo41585f() {
        this.f44363o = true;
    }

    /* renamed from: g */
    public void mo41586g() {
        if (this.f44351c == null) {
            acd.m45777b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else if (!this.f44363o) {
            acd.m45777b("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!mo41581b()) {
            acd.m45777b("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            mo41595a(this.f44351c.mo41621c(), "3099", null, this.f44351c.mo41620b(), this.f44351c.mo41621c(), true);
        }
    }

    /* renamed from: l */
    public void mo41591l() {
        this.f44353e.mo37647L();
    }

    /* renamed from: n */
    public void mo41593n() {
        this.f44353e.mo37648M();
    }

    /* renamed from: k */
    public void mo41590k() {
        this.f44357i.mo42003a();
    }

    /* renamed from: p */
    public final Context mo41603p() {
        return this.f44354f;
    }

    /* renamed from: f */
    private static int[] m50614f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: a */
    private final int m50607a(int i) {
        return afb.m45731b(this.f44354f, i);
    }

    /* renamed from: a */
    private final JSONObject m50608a(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m50607a(rect.right - rect.left));
        jSONObject.put("height", m50607a(rect.bottom - rect.top));
        jSONObject.put("x", m50607a(rect.left));
        jSONObject.put("y", m50607a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: g */
    private final JSONObject m50615g(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] f = m50614f(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", m50607a(view.getMeasuredWidth()));
            jSONObject3.put("height", m50607a(view.getMeasuredHeight()));
            jSONObject3.put("x", m50607a(f[0]));
            jSONObject3.put("y", m50607a(f[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = m50608a(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                jSONObject.put("x", m50607a(f[0]));
                jSONObject.put("y", m50607a(f[1]));
                jSONObject.put("relative_to", "window");
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            acd.m45783e("Unable to get native ad view bounding box");
        }
        return jSONObject2;
    }

    /* renamed from: h */
    private static JSONObject m50616h(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("contained_in_scroll_view", acl.m45552d(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final JSONObject m50617i(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("can_show_on_lock_screen", acl.m45549c(view));
            jSONObject.put("is_keyguard_locked", acl.m45565k(this.f44354f));
        } catch (JSONException unused) {
            acd.m45783e("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONObject m50609a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] f = m50614f(view);
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] f2 = m50614f(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", m50607a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", m50607a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", m50607a(f2[0] - f[0]));
                        jSONObject4.put("y", m50607a(f2[1] - f[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = m50608a(rect);
                        } else {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", m50607a(f2[0] - f[0]));
                            jSONObject5.put("y", m50607a(f2[1] - f[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject = jSONObject5;
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", (double) textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put((String) entry.getKey(), jSONObject3);
                    } catch (JSONException unused) {
                        acd.m45783e("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: q */
    public final aak mo41615q() {
        if (!C14793ay.m42913s().mo39043a(this.f44354f)) {
            return null;
        }
        if (this.f44362n == null) {
            this.f44362n = new aak(this.f44354f, this.f44353e.mo37576A());
        }
        return this.f44362n;
    }
}
