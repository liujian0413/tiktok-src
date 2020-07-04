package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.ScrollView;
import com.google.android.gms.ads.internal.C14793ay;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
public final class btf implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: b */
    private static final long f43518b = ((Long) bym.m50299d().mo41272a(C15585bw.f43839bg)).longValue();

    /* renamed from: a */
    protected final btd f43519a;

    /* renamed from: c */
    private final Object f43520c = new Object();

    /* renamed from: d */
    private final WeakReference<abj> f43521d;

    /* renamed from: e */
    private WeakReference<ViewTreeObserver> f43522e;

    /* renamed from: f */
    private final buq f43523f;

    /* renamed from: g */
    private final Context f43524g;

    /* renamed from: h */
    private final WindowManager f43525h;

    /* renamed from: i */
    private final PowerManager f43526i;

    /* renamed from: j */
    private final KeyguardManager f43527j;

    /* renamed from: k */
    private final DisplayMetrics f43528k;

    /* renamed from: l */
    private btm f43529l;

    /* renamed from: m */
    private boolean f43530m;

    /* renamed from: n */
    private boolean f43531n = false;

    /* renamed from: o */
    private boolean f43532o = false;

    /* renamed from: p */
    private boolean f43533p;

    /* renamed from: q */
    private boolean f43534q;

    /* renamed from: r */
    private boolean f43535r;

    /* renamed from: s */
    private BroadcastReceiver f43536s;

    /* renamed from: t */
    private final HashSet<Object> f43537t = new HashSet<>();

    /* renamed from: u */
    private aeq f43538u;

    /* renamed from: v */
    private final HashSet<bua> f43539v = new HashSet<>();

    /* renamed from: w */
    private final Rect f43540w = new Rect();

    /* renamed from: x */
    private final bti f43541x;

    /* renamed from: y */
    private float f43542y;

    public btf(Context context, zzyz zzyz, abj abj, zzbgz zzbgz, buq buq) {
        this.f43521d = new WeakReference<>(abj);
        this.f43523f = buq;
        this.f43522e = new WeakReference<>(null);
        this.f43533p = true;
        this.f43535r = false;
        this.f43538u = new aeq(f43518b);
        btd btd = new btd(UUID.randomUUID().toString(), zzbgz, zzyz.f45798a, abj.f39871k, abj.mo39073a(), zzyz.f45805h);
        this.f43519a = btd;
        this.f43525h = (WindowManager) context.getSystemService("window");
        this.f43526i = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f43527j = (KeyguardManager) context.getSystemService("keyguard");
        this.f43524g = context;
        this.f43541x = new bti(this, new apn());
        this.f43524g.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.f43541x);
        this.f43528k = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f43525h.getDefaultDisplay();
        this.f43540w.right = defaultDisplay.getWidth();
        this.f43540w.bottom = defaultDisplay.getHeight();
        mo41288a();
    }

    /* renamed from: a */
    public final void mo41288a() {
        this.f43542y = adh.m45630a(this.f43524g);
    }

    /* renamed from: b */
    public final void mo41295b() {
        synchronized (this.f43520c) {
            if (this.f43533p) {
                this.f43534q = true;
                try {
                    JSONObject j = m50028j();
                    j.put("doneReasonCode", "u");
                    m50025a(j, true);
                } catch (JSONException e) {
                    acd.m45778b("JSON failure while processing active view data.", e);
                } catch (RuntimeException e2) {
                    acd.m45778b("Failure while processing active view data.", e2);
                }
                String str = "Untracking ad unit: ";
                String valueOf = String.valueOf(this.f43519a.f43508c);
                acd.m45777b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c9, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41289a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f43520c
            monitor-enter(r0)
            java.util.HashSet<com.google.android.gms.internal.ads.bua> r1 = r7.f43539v     // Catch:{ all -> 0x00ca }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ca }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ca }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ca }
            com.google.android.gms.internal.ads.bua r2 = (com.google.android.gms.internal.ads.bua) r2     // Catch:{ all -> 0x00ca }
            boolean r2 = r2.mo41312a()     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x0009
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r7.f43533p     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x0028
            goto L_0x00c8
        L_0x0028:
            com.google.android.gms.internal.ads.buq r1 = r7.f43523f     // Catch:{ all -> 0x00ca }
            android.view.View r1 = r1.mo41307a()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x003c
            android.os.PowerManager r2 = r7.f43526i     // Catch:{ all -> 0x00ca }
            android.app.KeyguardManager r5 = r7.f43527j     // Catch:{ all -> 0x00ca }
            boolean r2 = com.google.android.gms.internal.ads.acl.m45536a(r1, r2, r5)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r1 == 0) goto L_0x004f
            if (r2 == 0) goto L_0x004f
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ all -> 0x00ca }
            r5.<init>()     // Catch:{ all -> 0x00ca }
            r6 = 0
            boolean r5 = r1.getGlobalVisibleRect(r5, r6)     // Catch:{ all -> 0x00ca }
            if (r5 == 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            com.google.android.gms.internal.ads.buq r6 = r7.f43523f     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.mo41308b()     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x005d
            r7.mo41295b()     // Catch:{ all -> 0x00ca }
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x005d:
            if (r8 != r4) goto L_0x006d
            com.google.android.gms.internal.ads.aeq r6 = r7.f43538u     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.mo39263a()     // Catch:{ all -> 0x00ca }
            if (r6 != 0) goto L_0x006d
            boolean r6 = r7.f43535r     // Catch:{ all -> 0x00ca }
            if (r5 != r6) goto L_0x006d
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x006d:
            if (r5 != 0) goto L_0x0077
            boolean r6 = r7.f43535r     // Catch:{ all -> 0x00ca }
            if (r6 != 0) goto L_0x0077
            if (r8 != r4) goto L_0x0077
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x0077:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch:{ RuntimeException | JSONException -> 0x0085 }
            org.json.JSONObject r8 = r7.m50023a(r1, r8)     // Catch:{ RuntimeException | JSONException -> 0x0085 }
            r7.m50025a(r8, r3)     // Catch:{ RuntimeException | JSONException -> 0x0085 }
            r7.f43535r = r5     // Catch:{ RuntimeException | JSONException -> 0x0085 }
            goto L_0x008b
        L_0x0085:
            r8 = move-exception
            java.lang.String r1 = "Active view update failed."
            com.google.android.gms.internal.ads.acd.m45775a(r1, r8)     // Catch:{ all -> 0x00ca }
        L_0x008b:
            com.google.android.gms.internal.ads.buq r8 = r7.f43523f     // Catch:{ all -> 0x00ca }
            com.google.android.gms.internal.ads.buq r8 = r8.mo41309c()     // Catch:{ all -> 0x00ca }
            android.view.View r8 = r8.mo41307a()     // Catch:{ all -> 0x00ca }
            if (r8 == 0) goto L_0x00c3
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r7.f43522e     // Catch:{ all -> 0x00ca }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00ca }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ all -> 0x00ca }
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()     // Catch:{ all -> 0x00ca }
            if (r8 == r1) goto L_0x00c3
            r7.m50027i()     // Catch:{ all -> 0x00ca }
            boolean r2 = r7.f43530m     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00b4
            if (r1 == 0) goto L_0x00bc
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x00bc
        L_0x00b4:
            r7.f43530m = r4     // Catch:{ all -> 0x00ca }
            r8.addOnScrollChangedListener(r7)     // Catch:{ all -> 0x00ca }
            r8.addOnGlobalLayoutListener(r7)     // Catch:{ all -> 0x00ca }
        L_0x00bc:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00ca }
            r1.<init>(r8)     // Catch:{ all -> 0x00ca }
            r7.f43522e = r1     // Catch:{ all -> 0x00ca }
        L_0x00c3:
            r7.m50026h()     // Catch:{ all -> 0x00ca }
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return
        L_0x00ca:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.btf.mo41289a(int):void");
    }

    /* renamed from: h */
    private final void m50026h() {
        if (this.f43529l != null) {
            this.f43529l.mo41280a(this);
        }
    }

    /* renamed from: c */
    public final boolean mo41299c() {
        boolean z;
        synchronized (this.f43520c) {
            z = this.f43533p;
        }
        return z;
    }

    /* renamed from: a */
    private static int m50021a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo41294a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(this.f43519a.f43508c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo41297b(Map<String, String> map) {
        mo41289a(3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41293a(bua bua, Map<String, String> map) {
        String str = "Received request to untrack: ";
        String valueOf = String.valueOf(this.f43519a.f43508c);
        acd.m45777b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        mo41296b(bua);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo41298c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            if (!"1".equals(map.get("isVisible"))) {
                "true".equals(map.get("isVisible"));
            }
            Iterator it = this.f43537t.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: i */
    private final void m50027i() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f43522e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    /* renamed from: j */
    private final JSONObject m50028j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f43519a.f43509d).put("activeViewJSON", this.f43519a.f43507b).put("timestamp", C14793ay.m42901g().mo38685b()).put("adFormat", this.f43519a.f43506a).put("hashCode", this.f43519a.f43508c).put("isMraid", this.f43519a.f43510e).put("isStopped", this.f43532o).put("isPaused", this.f43531n).put("isNative", this.f43519a.f43511f).put("isScreenOn", m50029k()).put("appMuted", C14793ay.m42899e().mo39212b()).put("appVolume", (double) C14793ay.m42899e().mo39209a()).put("deviceVolume", (double) this.f43542y);
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m50024a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m50025a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a = m50024a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f43539v);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((bua) obj).mo41311a(a, z);
            }
        } catch (Throwable th) {
            acd.m45778b("Skipping active view message.", th);
        }
    }

    /* renamed from: a */
    public final void mo41292a(bua bua) {
        if (this.f43539v.isEmpty()) {
            synchronized (this.f43520c) {
                if (this.f43536s == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f43536s = new btg(this);
                    C14793ay.m42911q().mo39267a(this.f43524g, this.f43536s, intentFilter);
                }
            }
            mo41289a(3);
        }
        this.f43539v.add(bua);
        try {
            bua.mo41311a(m50024a(m50023a(this.f43523f.mo41307a(), (Boolean) null)), false);
        } catch (JSONException e) {
            acd.m45778b("Skipping measurement update for new client.", e);
        }
    }

    /* renamed from: b */
    public final void mo41296b(bua bua) {
        this.f43539v.remove(bua);
        bua.mo41313b();
        if (this.f43539v.isEmpty()) {
            synchronized (this.f43520c) {
                m50027i();
                synchronized (this.f43520c) {
                    if (this.f43536s != null) {
                        try {
                            C14793ay.m42911q().mo39266a(this.f43524g, this.f43536s);
                        } catch (IllegalStateException e) {
                            acd.m45778b("Failed trying to unregister the receiver", e);
                        } catch (Exception e2) {
                            C14793ay.m42898d().mo39089a((Throwable) e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.f43536s = null;
                    }
                }
                this.f43524g.getContentResolver().unregisterContentObserver(this.f43541x);
                int i = 0;
                this.f43533p = false;
                m50026h();
                ArrayList arrayList = new ArrayList(this.f43539v);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mo41296b((bua) obj);
                }
            }
        }
    }

    /* renamed from: a */
    private final JSONObject m50023a(View view, Boolean bool) throws JSONException {
        if (view == null) {
            return m50028j().put("isAttachedToWindow", false).put("isScreenOn", m50029k()).put("isVisible", false);
        }
        boolean a = C14793ay.m42896b().mo39201a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e) {
            acd.m45778b("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject j = m50028j();
        j.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m50021a(this.f43540w.top, this.f43528k)).put("bottom", m50021a(this.f43540w.bottom, this.f43528k)).put("left", m50021a(this.f43540w.left, this.f43528k)).put("right", m50021a(this.f43540w.right, this.f43528k))).put("adBox", new JSONObject().put("top", m50021a(rect.top, this.f43528k)).put("bottom", m50021a(rect.bottom, this.f43528k)).put("left", m50021a(rect.left, this.f43528k)).put("right", m50021a(rect.right, this.f43528k))).put("globalVisibleBox", new JSONObject().put("top", m50021a(rect2.top, this.f43528k)).put("bottom", m50021a(rect2.bottom, this.f43528k)).put("left", m50021a(rect2.left, this.f43528k)).put("right", m50021a(rect2.right, this.f43528k))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m50021a(rect3.top, this.f43528k)).put("bottom", m50021a(rect3.bottom, this.f43528k)).put("left", m50021a(rect3.left, this.f43528k)).put("right", m50021a(rect3.right, this.f43528k))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m50021a(rect4.top, this.f43528k)).put("bottom", m50021a(rect4.bottom, this.f43528k)).put("left", m50021a(rect4.left, this.f43528k)).put("right", m50021a(rect4.right, this.f43528k))).put("screenDensity", (double) this.f43528k.density);
        if (bool == null) {
            bool = Boolean.valueOf(acl.m45536a(view, this.f43526i, this.f43527j));
        }
        j.put("isVisible", bool.booleanValue());
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43842bj)).booleanValue()) {
            JSONArray jSONArray = new JSONArray();
            List<Rect> a2 = m50022a(view);
            if (a2 != null) {
                for (Rect rect5 : a2) {
                    jSONArray.put(new JSONObject().put("top", m50021a(rect5.top, this.f43528k)).put("bottom", m50021a(rect5.bottom, this.f43528k)).put("left", m50021a(rect5.left, this.f43528k)).put("right", m50021a(rect5.right, this.f43528k)));
                }
            }
            j.put("scrollableContainerBoxes", jSONArray);
        }
        return j;
    }

    /* renamed from: k */
    private final boolean m50029k() {
        if (VERSION.SDK_INT >= 20) {
            return this.f43526i.isInteractive();
        }
        return this.f43526i.isScreenOn();
    }

    /* renamed from: a */
    private static List<Rect> m50022a(View view) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (VERSION.SDK_INT >= 16) {
                    z = view2.isScrollContainer();
                } else {
                    if (!(view2 instanceof ScrollView)) {
                        if (!(view2 instanceof ListView)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(rect);
                }
            }
            return arrayList;
        } catch (Exception e) {
            C14793ay.m42898d().mo39089a((Throwable) e, "ActiveViewUnit.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    public final void onScrollChanged() {
        mo41289a(1);
    }

    public final void onGlobalLayout() {
        mo41289a(2);
    }

    /* renamed from: a */
    public final void mo41291a(btm btm) {
        synchronized (this.f43520c) {
            this.f43529l = btm;
        }
    }

    /* renamed from: d */
    public final void mo41300d() {
        synchronized (this.f43520c) {
            this.f43532o = true;
            mo41289a(3);
        }
    }

    /* renamed from: e */
    public final void mo41301e() {
        synchronized (this.f43520c) {
            this.f43531n = true;
            mo41289a(3);
        }
    }

    /* renamed from: f */
    public final void mo41302f() {
        synchronized (this.f43520c) {
            this.f43531n = false;
            mo41289a(3);
        }
    }

    /* renamed from: a */
    public final void mo41290a(long j) {
        this.f43538u.mo39262a(j);
    }

    /* renamed from: g */
    public final void mo41303g() {
        this.f43538u.mo39262a(f43518b);
    }
}
