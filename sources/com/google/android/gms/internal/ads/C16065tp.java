package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C14772ad;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.tp */
public final class C16065tp {

    /* renamed from: a */
    private final Object f45053a = new Object();

    /* renamed from: b */
    private final Context f45054b;

    /* renamed from: c */
    private final bdt f45055c;

    /* renamed from: d */
    private final abk f45056d;

    /* renamed from: e */
    private final C15600ck f45057e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C14772ad f45058f;

    /* renamed from: g */
    private OnGlobalLayoutListener f45059g;

    /* renamed from: h */
    private OnScrollChangedListener f45060h;

    /* renamed from: i */
    private final DisplayMetrics f45061i;

    /* renamed from: j */
    private aeq f45062j;

    /* renamed from: k */
    private int f45063k = -1;

    /* renamed from: l */
    private int f45064l = -1;

    public C16065tp(Context context, bdt bdt, abk abk, C15600ck ckVar, C14772ad adVar) {
        this.f45054b = context;
        this.f45055c = bdt;
        this.f45056d = abk;
        this.f45057e = ckVar;
        this.f45058f = adVar;
        this.f45062j = new aeq(200);
        this.f45061i = acl.m45514a((WindowManager) context.getSystemService("window"));
    }

    /* renamed from: a */
    private final void m52193a(ami ami, boolean z) {
        ami.mo39721a("/video", C15726ha.f44463l);
        ami.mo39721a("/videoMeta", C15726ha.f44464m);
        ami.mo39721a("/precache", (C15742hq<? super ami>) new alk<Object>());
        ami.mo39721a("/delayPageLoaded", C15726ha.f44467p);
        ami.mo39721a("/instrument", C15726ha.f44465n);
        ami.mo39721a("/log", C15726ha.f44458g);
        ami.mo39721a("/videoClicked", C15726ha.f44459h);
        ami.mo39721a("/trackActiveViewUnit", (C15742hq<? super ami>) new C16071tv<Object>(this));
        ami.mo39721a("/untrackActiveViewUnit", (C15742hq<? super ami>) new C16072tw<Object>(this));
        if (z) {
            ami.mo39721a("/open", (C15742hq<? super ami>) new C15757ie<Object>(null, null));
        }
    }

    /* renamed from: a */
    private final OnGlobalLayoutListener m52190a(WeakReference<ami> weakReference) {
        if (this.f45059g == null) {
            this.f45059g = new C16073tx(this, weakReference);
        }
        return this.f45059g;
    }

    /* renamed from: b */
    private final OnScrollChangedListener m52196b(WeakReference<ami> weakReference) {
        if (this.f45060h == null) {
            this.f45060h = new C16074ty(this, weakReference);
        }
        return this.f45060h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52195a(WeakReference<ami> weakReference, boolean z) {
        if (weakReference != null) {
            ami ami = (ami) weakReference.get();
            if (ami != null && ami.getView() != null) {
                if (!z || this.f45062j.mo39263a()) {
                    int[] iArr = new int[2];
                    ami.getView().getLocationOnScreen(iArr);
                    int b = afb.m45732b(this.f45061i, iArr[0]);
                    int b2 = afb.m45732b(this.f45061i, iArr[1]);
                    synchronized (this.f45053a) {
                        if (!(this.f45063k == b && this.f45064l == b2)) {
                            this.f45063k = b;
                            this.f45064l = b2;
                            ami.mo39761w().mo39768a(this.f45063k, this.f45064l, !z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final ami m52192a() throws zzbnv {
        return amo.m46434a(this.f45054b, anv.m46662a(), "native-video", false, false, this.f45055c, this.f45056d.f39887a.f45581k, this.f45057e, null, this.f45058f.f38144i, this.f45056d.f39895i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo41995a(boolean z, agu agu, String str, String str2) {
        try {
            ami a = m52192a();
            if (z) {
                a.mo39717a(anv.m46666c());
            } else {
                a.mo39717a(anv.m46665b());
            }
            this.f45058f.f38154k = a;
            WeakReference weakReference = new WeakReference(a);
            a.mo39761w().mo39769a(m52190a(weakReference), m52196b(weakReference));
            m52193a(a, z);
            a.mo39761w().mo39771a((anq) new C16068ts(this, agu, a));
            a.mo39722a(str, str2, null);
        } catch (Exception e) {
            acd.m45780c("Exception occurred while getting video view", e);
            agu.mo39333b(null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo41994a(agu agu, ami ami, boolean z) {
        this.f45058f.mo37649N();
        agu.mo39333b(ami);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo41996a(boolean z, JSONObject jSONObject, agu agu) {
        try {
            ami a = m52192a();
            if (z) {
                a.mo39717a(anv.m46666c());
            } else {
                a.mo39717a(anv.m46665b());
            }
            this.f45058f.f38154k = a;
            WeakReference weakReference = new WeakReference(a);
            a.mo39761w().mo39769a(m52190a(weakReference), m52196b(weakReference));
            m52193a(a, z);
            a.mo39761w().mo39772a((anr) new C16069tt(a, jSONObject));
            a.mo39761w().mo39771a((anq) new C16070tu(this, agu, a));
            a.loadUrl((String) bym.m50299d().mo41272a(C15585bw.f43819bM));
        } catch (Exception e) {
            acd.m45780c("Exception occurred while getting video view", e);
            agu.mo39333b(null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo41997b(agu agu, ami ami, boolean z) {
        this.f45058f.mo37649N();
        agu.mo39333b(ami);
    }
}
