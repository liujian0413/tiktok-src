package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.HollowTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.HollowTextView.C23418a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.FollowFeedTagGroup;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.experiment.PoiAreaFilterExperiment;
import com.p280ss.android.ugc.aweme.poi.model.Address;
import com.p280ss.android.ugc.aweme.poi.model.C35109e;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.utils.C35441aa;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.poi.utils.C35469y;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.j */
public final class C23453j extends C23443b {

    /* renamed from: a */
    public final DmtTextView f61883a;

    /* renamed from: b */
    public final FollowFeedTagGroup f61884b;

    /* renamed from: l */
    public HollowTextView f61885l;

    /* renamed from: m */
    public String f61886m = "list";

    /* renamed from: n */
    public C28343z<C28318an> f61887n;

    /* renamed from: o */
    public final Activity f61888o;

    /* renamed from: p */
    public final String f61889p;

    /* renamed from: q */
    private final ImageView f61890q;

    /* renamed from: r */
    private final DmtTextView f61891r;

    /* renamed from: s */
    private final LinearLayout f61892s;

    /* renamed from: t */
    private final float f61893t = (((float) C9738o.m28691a((Context) this.f61888o)) - C9738o.m28708b((Context) this.f61888o, 160.0f));

    /* renamed from: u */
    private PoiStruct f61894u;

    /* renamed from: v */
    private LocationBundle f61895v;

    /* renamed from: w */
    private JSONObject f61896w;

    /* renamed from: x */
    private String f61897x;

    /* renamed from: y */
    private String f61898y;

    /* renamed from: z */
    private String f61899z;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.a.j$a */
    public static final class C23454a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C23453j f61900a;

        public final void onGlobalLayout() {
            int i;
            String str;
            if (this.f61900a.f61885l == null) {
                this.f61900a.f61884b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            TextPaint paint = this.f61900a.f61883a.getPaint();
            HollowTextView hollowTextView = this.f61900a.f61885l;
            if (hollowTextView != null) {
                i = hollowTextView.getWidth();
            } else {
                i = 0;
            }
            int b = i - ((int) C9738o.m28708b((Context) this.f61900a.f61888o, 4.0f));
            if (b <= 0) {
                b = 0;
            }
            HollowTextView hollowTextView2 = this.f61900a.f61885l;
            if (hollowTextView2 != null) {
                str = hollowTextView2.getText();
            } else {
                str = null;
            }
            String obj = TextUtils.ellipsize(str, paint, (float) b, TruncateAt.MIDDLE, false, null).toString();
            HollowTextView hollowTextView3 = this.f61900a.f61885l;
            if (hollowTextView3 != null) {
                hollowTextView3.setText(obj);
            }
            this.f61900a.f61856h.setVisibility(8);
            this.f61900a.f61884b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        C23454a(C23453j jVar) {
            this.f61900a = jVar;
        }
    }

    /* renamed from: f */
    public final void mo61062f() {
        this.f61856h.setVisibility(8);
    }

    /* renamed from: k */
    private final void m76993k() {
        this.f61883a.setVisibility(8);
        this.f61890q.setVisibility(8);
    }

    /* renamed from: t */
    private final boolean m77002t() {
        return C7634n.m23717a("poi_map", this.f61889p, true);
    }

    /* renamed from: a */
    public final void mo59065a() {
        C6907h.m21525a("anchor_entrance_show", m77004v());
    }

    /* renamed from: g */
    private final void m76989g() {
        this.f61883a.setVisibility(0);
        this.f61890q.setVisibility(0);
        this.f61891r.setVisibility(0);
        this.f61892s.setVisibility(8);
    }

    /* renamed from: n */
    private final void m76996n() {
        if (this.f61885l != null) {
            this.f61856h.setVisibility(4);
            this.f61884b.getViewTreeObserver().addOnGlobalLayoutListener(new C23454a(this));
        }
    }

    /* renamed from: h */
    private final String m76990h() {
        if (m77002t()) {
            return m76992j();
        }
        if (C35441aa.m114459a((Context) this.f61888o, this.f61894u)) {
            PoiStruct poiStruct = this.f61894u;
            if ((poiStruct == null || !poiStruct.isAdminArea) && !C6399b.m19944t()) {
                if (m77001s()) {
                    return m76991i();
                }
                PoiStruct poiStruct2 = this.f61894u;
                if (poiStruct2 != null) {
                    return poiStruct2.getCity();
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: l */
    private final void m76994l() {
        this.f61891r.setText(C35452k.m114509a((Context) this.f61888o, this.f61894u));
        if (C35469y.m114575a(this.f61895v, this.f61894u)) {
            this.f61892s.removeAllViews();
            this.f61892s.setVisibility(8);
            this.f61885l = null;
            return;
        }
        this.f61892s.setVisibility(0);
        m76995m();
    }

    /* renamed from: q */
    private final boolean m76999q() {
        Address address;
        if (this.f61894u != null) {
            PoiStruct poiStruct = this.f61894u;
            String str = null;
            if (poiStruct != null) {
                address = poiStruct.address;
            } else {
                address = null;
            }
            if (address != null) {
                PoiStruct poiStruct2 = this.f61894u;
                if (poiStruct2 != null) {
                    Address address2 = poiStruct2.address;
                    if (address2 != null) {
                        str = address2.getCity();
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    private final boolean m77000r() {
        CharSequence charSequence;
        if (this.f61894u != null) {
            PoiStruct poiStruct = this.f61894u;
            String str = null;
            if (poiStruct != null) {
                charSequence = poiStruct.poiLatitude;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                PoiStruct poiStruct2 = this.f61894u;
                if (poiStruct2 != null) {
                    str = poiStruct2.poiLongitude;
                }
                if (!TextUtils.isEmpty(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo61061e() {
        if (C6384b.m19835a().mo15287a(PoiAreaFilterExperiment.class, true, "poi_city_tag_optimize", C6384b.m19835a().mo15295d().poi_city_tag_optimize, 0) != 2) {
            PoiStruct poiStruct = this.f61894u;
            if (poiStruct != null && poiStruct.isAdminArea) {
                return;
            }
        }
        this.f61855g.setVisibility(8);
        this.f61856h.setVisibility(0);
        m77003u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        if (r0.isGaode == false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m76991i() {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r14.f61894u
            r1 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.poiLatitude
            if (r0 == 0) goto L_0x0010
            double r3 = java.lang.Double.parseDouble(r0)
            r6 = r3
            goto L_0x0011
        L_0x0010:
            r6 = r1
        L_0x0011:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r14.f61894u
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r0.poiLongitude
            if (r0 == 0) goto L_0x001f
            double r3 = java.lang.Double.parseDouble(r0)
            r8 = r3
            goto L_0x0020
        L_0x001f:
            r8 = r1
        L_0x0020:
            com.ss.android.ugc.aweme.poi.LocationBundle r0 = r14.f61895v
            if (r0 == 0) goto L_0x0027
            double r3 = r0.latitude
            goto L_0x0028
        L_0x0027:
            r3 = r1
        L_0x0028:
            com.ss.android.ugc.aweme.poi.LocationBundle r0 = r14.f61895v
            if (r0 == 0) goto L_0x002e
            double r1 = r0.longitude
        L_0x002e:
            com.ss.android.ugc.aweme.poi.LocationBundle r0 = r14.f61895v
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.isGaode
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.poi.LocationBundle r0 = r14.f61895v
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.isGaode
            if (r0 != 0) goto L_0x004e
        L_0x0044:
            double[] r0 = com.p280ss.android.ugc.aweme.poi.utils.C35440a.m114454b(r1, r3)
            r1 = 0
            r1 = r0[r1]
            r3 = 1
            r3 = r0[r3]
        L_0x004e:
            r12 = r1
            r10 = r3
            android.app.Activity r0 = r14.f61888o
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r0 = com.p280ss.android.ugc.aweme.poi.utils.C35442b.m114467a(r5, r6, r8, r10, r12)
            java.lang.String r1 = "DistanceComputer.getDist…at, poiLng, myLat, myLng)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23453j.m76991i():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m76992j() {
        /*
            r14 = this;
            java.lang.String r0 = r14.f61897x
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = r14.f61898y
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0015
            goto L_0x0058
        L_0x0015:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r14.f61894u
            r1 = 0
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.poiLatitude
            if (r0 == 0) goto L_0x0025
            double r3 = java.lang.Double.parseDouble(r0)
            r10 = r3
            goto L_0x0026
        L_0x0025:
            r10 = r1
        L_0x0026:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r14.f61894u
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.poiLongitude
            if (r0 == 0) goto L_0x0034
            double r3 = java.lang.Double.parseDouble(r0)
            r12 = r3
            goto L_0x0035
        L_0x0034:
            r12 = r1
        L_0x0035:
            java.lang.String r0 = r14.f61897x
            if (r0 == 0) goto L_0x003f
            double r3 = java.lang.Double.parseDouble(r0)
            r6 = r3
            goto L_0x0040
        L_0x003f:
            r6 = r1
        L_0x0040:
            java.lang.String r0 = r14.f61898y
            if (r0 == 0) goto L_0x0048
            double r1 = java.lang.Double.parseDouble(r0)
        L_0x0048:
            r8 = r1
            android.app.Activity r0 = r14.f61888o
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r0 = com.p280ss.android.ugc.aweme.poi.utils.C35442b.m114467a(r5, r6, r8, r10, r12)
            java.lang.String r1 = "DistanceComputer.getDist…, curLng, poiLat, poiLng)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            return r0
        L_0x0058:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23453j.m76992j():java.lang.String");
    }

    /* renamed from: m */
    private final void m76995m() {
        String str;
        this.f61892s.removeAllViews();
        C23418a aVar = new C23418a();
        aVar.f61714b = (int) C9738o.m28708b((Context) this.f61888o, 11.0f);
        aVar.f61715c = C23481i.m77088a(R.color.a53);
        aVar.f61716d = (int) C9738o.m28708b((Context) this.f61888o, 2.0f);
        aVar.f61719g = true;
        aVar.f61718f = true;
        aVar.f61720h = true;
        aVar.f61717e = true;
        this.f61885l = new HollowTextView((Context) this.f61888o, aVar);
        int b = (int) C9738o.m28708b((Context) this.f61888o, 2.0f);
        HollowTextView hollowTextView = this.f61885l;
        if (hollowTextView != null) {
            hollowTextView.setPadding(b, b, b, b);
        }
        HollowTextView hollowTextView2 = this.f61885l;
        if (hollowTextView2 != null) {
            PoiStruct poiStruct = this.f61894u;
            if (poiStruct != null) {
                str = poiStruct.getPoiSubTitle();
            } else {
                str = null;
            }
            hollowTextView2.setText(str);
        }
        this.f61892s.addView(this.f61885l);
    }

    /* renamed from: o */
    private final void m76997o() {
        String str;
        DmtTextView dmtTextView;
        this.f61854f.setVisibility(8);
        this.f61853e.setVisibility(8);
        if (C35441aa.m114463a(this.f61894u, this.f61895v) && !m77000r()) {
            dmtTextView = this.f61883a;
            str = m76991i();
        } else if (m76999q()) {
            m76993k();
            return;
        } else {
            dmtTextView = this.f61883a;
            PoiStruct poiStruct = this.f61894u;
            if (poiStruct != null) {
                Address address = poiStruct.address;
                if (address != null) {
                    str = address.getCity();
                }
            }
            str = null;
        }
        dmtTextView.setText(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (((com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r0).isChannelSubTabNearby() != false) goto L_0x0045;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m77001s() {
        /*
            r3 = this;
            java.lang.String r0 = "homepage_fresh"
            java.lang.String r1 = r3.f61889p
            if (r1 != 0) goto L_0x0008
            java.lang.String r1 = ""
        L_0x0008:
            r2 = 1
            boolean r0 = kotlin.text.C7634n.m23717a(r0, r1, r2)
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "homepage_fresh_feed"
            java.lang.String r1 = r3.f61889p
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = ""
        L_0x0017:
            boolean r0 = kotlin.text.C7634n.m23717a(r0, r1, r2)
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "homepage_channel"
            java.lang.String r1 = r3.f61889p
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = ""
        L_0x0025:
            boolean r0 = kotlin.text.C7634n.m23717a(r0, r1, r2)
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r1)
            java.lang.String r1 = "ServiceManager.get().get…ridgeService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            boolean r0 = r0.isChannelSubTabNearby()
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r0 = 0
            return r0
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23453j.m77001s():boolean");
    }

    /* renamed from: u */
    private final void m77003u() {
        String str;
        int i;
        Aweme aweme = this.f61858j;
        String str2 = "poi_label_show";
        C22984d a = C22984d.m75611a();
        String str3 = "enter_from";
        String str4 = this.f61889p;
        if (str4 == null) {
            str4 = "";
        }
        C22984d a2 = a.mo59973a(str3, str4);
        String str5 = "group_id";
        Aweme aweme2 = this.f61858j;
        String str6 = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        C22984d a3 = a2.mo59973a(str5, str);
        String str7 = "author_id";
        Aweme aweme3 = this.f61858j;
        if (aweme3 != null) {
            str6 = aweme3.getAuthorUid();
        }
        C22984d a4 = a3.mo59973a(str7, str6).mo59973a("poi_id", C33230ac.m107223e(this.f61858j));
        String str8 = "poi_label_type";
        Aweme aweme4 = this.f61858j;
        if (aweme4 != null) {
            PoiStruct poiStruct = aweme4.getPoiStruct();
            if (poiStruct != null) {
                i = poiStruct.getPoiSubTitleType();
                C35452k.m114511a(aweme, str2, a4.mo59970a(str8, i));
            }
        }
        i = 0;
        C35452k.m114511a(aweme, str2, a4.mo59970a(str8, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject m77004v() {
        /*
            r6 = this;
            org.json.JSONObject r0 = r6.f61896w
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = "request_id"
            java.lang.String r0 = r0.optString(r1)
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.f61858j
            java.lang.String r1 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107223e(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f61858j
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107238m(r2)
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r3.<init>()
            r3.setImprId(r0)
            com.ss.android.ugc.aweme.common.j r0 = new com.ss.android.ugc.aweme.common.j
            r0.<init>()
            java.lang.String r4 = "log_pb"
            com.ss.android.ugc.aweme.feed.ae r5 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            java.lang.String r3 = r5.mo71790a(r3)
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r4, r3)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.f61858j
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = r4.getAuthorUid()
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r3, r4)
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r3, r2)
            java.lang.String r2 = "impr_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f61858j
            java.lang.String r3 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107245t(r3)
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r2, r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r6.f61889p
            if (r3 != 0) goto L_0x005f
            java.lang.String r3 = ""
        L_0x005f:
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r2, r3)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r2, r1)
            java.lang.String r1 = "anchor_type"
            java.lang.String r2 = "poi"
            com.ss.android.ugc.aweme.common.j r0 = r0.mo16966a(r1, r2)
            org.json.JSONObject r0 = r0.mo16967a()
            java.lang.String r1 = "MobJsonHelper()\n        …\n                .build()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23453j.m77004v():org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a3  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m76998p() {
        /*
            r7 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f61883a
            android.text.TextPaint r0 = r0.getPaint()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f61883a
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x001f
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f61883a
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            float r1 = r0.measureText(r1)
            int r1 = (int) r1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r7.f61891r
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            float r3 = r0.measureText(r3)
            int r3 = (int) r3
            com.ss.android.ugc.aweme.base.ui.HollowTextView r4 = r7.f61885l
            if (r4 == 0) goto L_0x0052
            java.lang.String r4 = r4.getText()
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0052
            float r0 = r0.measureText(r4)
            int r0 = (int) r0
            android.app.Activity r4 = r7.f61888o
            android.content.Context r4 = (android.content.Context) r4
            r5 = 1104150528(0x41d00000, float:26.0)
            float r4 = com.bytedance.common.utility.C9738o.m28708b(r4, r5)
            int r4 = (int) r4
            int r0 = r0 + r4
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            android.app.Activity r4 = r7.f61888o
            android.content.Context r4 = (android.content.Context) r4
            int r4 = com.bytedance.common.utility.C9738o.m28691a(r4)
            android.app.Activity r5 = r7.f61888o
            android.content.Context r5 = (android.content.Context) r5
            r6 = 1123811328(0x42fc0000, float:126.0)
            float r5 = com.bytedance.common.utility.C9738o.m28708b(r5, r6)
            int r5 = (int) r5
            int r4 = r4 - r5
            int r4 = r4 - r0
            int r0 = r4 - r1
            android.app.Activity r5 = r7.f61888o
            android.content.Context r5 = (android.content.Context) r5
            r6 = 1109393408(0x42200000, float:40.0)
            float r5 = com.bytedance.common.utility.C9738o.m28708b(r5, r6)
            int r5 = (int) r5
            int r0 = r0 - r5
            android.app.Activity r5 = r7.f61888o
            android.content.Context r5 = (android.content.Context) r5
            r6 = 1101004800(0x41a00000, float:20.0)
            float r5 = com.bytedance.common.utility.C9738o.m28708b(r5, r6)
            int r5 = (int) r5
            int r4 = r4 - r5
            r5 = 8
            if (r0 >= r3) goto L_0x0091
            android.widget.ImageView r0 = r7.f61890q
            r0.setVisibility(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f61891r
            r0.setVisibility(r5)
            goto L_0x009b
        L_0x0091:
            android.widget.ImageView r0 = r7.f61890q
            r0.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f61891r
            r0.setVisibility(r2)
        L_0x009b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f61883a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00b4
            if (r4 > r1) goto L_0x00af
            com.ss.android.ugc.aweme.base.ui.HollowTextView r0 = r7.f61885l
            if (r0 == 0) goto L_0x00af
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f61883a
            r0.setVisibility(r5)
            goto L_0x00b4
        L_0x00af:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f61883a
            r0.setMaxWidth(r4)
        L_0x00b4:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f61883a
            int r0 = r0.getVisibility()
            if (r0 == r5) goto L_0x00ce
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f61883a
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d3
        L_0x00ce:
            android.widget.ImageView r0 = r7.f61890q
            r0.setVisibility(r5)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23453j.m76998p():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r3 == null) goto L_0x001e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59068b() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f61858j
            java.lang.String r0 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107223e(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f61858j
            java.lang.String r1 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107229h(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.f61858j
            java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107238m(r2)
            org.json.JSONObject r3 = r7.f61896w     // Catch:{ Exception -> 0x009a }
            if (r3 == 0) goto L_0x001e
            java.lang.String r4 = "request_id"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ Exception -> 0x009a }
            if (r3 != 0) goto L_0x0020
        L_0x001e:
            java.lang.String r3 = ""
        L_0x0020:
            com.ss.android.ugc.aweme.common.MobClick r4 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x009a }
            java.lang.String r5 = "poi_click"
            com.ss.android.ugc.aweme.common.MobClick r4 = r4.setEventName(r5)     // Catch:{ Exception -> 0x009a }
            java.lang.String r5 = r7.f61889p     // Catch:{ Exception -> 0x009a }
            if (r5 != 0) goto L_0x0030
            java.lang.String r5 = ""
        L_0x0030:
            com.ss.android.ugc.aweme.common.MobClick r4 = r4.setLabelName(r5)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.common.MobClick r4 = r4.setValue(r2)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.app.g.c r5 = new com.ss.android.ugc.aweme.app.g.c     // Catch:{ Exception -> 0x009a }
            r5.<init>()     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = "poi_id"
            com.ss.android.ugc.aweme.app.g.c r5 = r5.mo16887a(r6, r0)     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = "poi_type"
            com.ss.android.ugc.aweme.app.g.c r5 = r5.mo16887a(r6, r1)     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = "request_id"
            com.ss.android.ugc.aweme.app.g.c r5 = r5.mo16887a(r6, r3)     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = "group_id"
            com.ss.android.ugc.aweme.app.g.c r2 = r5.mo16887a(r6, r2)     // Catch:{ Exception -> 0x009a }
            java.lang.String r5 = "content_type"
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r7.f61858j     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107240o(r6)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r5, r6)     // Catch:{ Exception -> 0x009a }
            org.json.JSONObject r2 = r2.mo16888b()     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.common.MobClick r2 = r4.setJsonObject(r2)     // Catch:{ Exception -> 0x009a }
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r2)     // Catch:{ Exception -> 0x009a }
            java.lang.String r2 = "anchor_entrance_click"
            org.json.JSONObject r4 = r7.m77004v()     // Catch:{ Exception -> 0x009a }
            com.p280ss.android.ugc.aweme.common.C6907h.m21525a(r2, r4)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.metrics.j r2 = new com.ss.android.ugc.aweme.metrics.j     // Catch:{ Exception -> 0x009a }
            r2.<init>()     // Catch:{ Exception -> 0x009a }
            java.lang.String r4 = r7.f61889p     // Catch:{ Exception -> 0x009a }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = ""
        L_0x0080:
            com.ss.android.ugc.aweme.metrics.j r2 = r2.mo85276a(r4)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r7.f61858j     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.metrics.j r2 = r2.mo85281f(r4)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.metrics.j r2 = r2.mo85277b(r3)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.metrics.j r0 = r2.mo85278c(r0)     // Catch:{ Exception -> 0x009a }
            com.ss.android.ugc.aweme.metrics.j r0 = r0.mo85279d(r1)     // Catch:{ Exception -> 0x009a }
            r0.mo85252e()     // Catch:{ Exception -> 0x009a }
            return
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23453j.mo59068b():void");
    }

    /* renamed from: a */
    public final void mo61059a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f61886m = str;
    }

    /* renamed from: c */
    private final void m76987c(String str) {
        this.f61854f.setVisibility(0);
        this.f61853e.setVisibility(0);
        this.f61854f.setText(str);
    }

    /* renamed from: d */
    private final void m76988d(String str) {
        this.f61854f.setVisibility(8);
        this.f61853e.setVisibility(8);
        this.f61855g.setVisibility(0);
        CharSequence charSequence = str;
        this.f61855g.setText(charSequence);
        this.f61883a.setText(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1 == null) goto L_0x0018;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m76986b(java.lang.String r4) {
        /*
            r3 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r3.f61854f
            android.text.TextPaint r0 = r0.getPaint()
            float r4 = r0.measureText(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r3.f61852d
            android.text.TextPaint r0 = r0.getPaint()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r1 = r3.f61894u
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r1.poiName
            if (r1 != 0) goto L_0x001a
        L_0x0018:
            java.lang.String r1 = ""
        L_0x001a:
            float r0 = r0.measureText(r1)
            float r0 = r0 + r4
            float r1 = r3.f61893t
            r2 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0027
            return r2
        L_0x0027:
            r0 = 1127219200(0x43300000, float:176.0)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x002e
            return r2
        L_0x002e:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23453j.m76986b(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo59066a(View view) {
        String str;
        PoiStruct poiStruct;
        super.mo59066a(view);
        String e = C33230ac.m107223e(this.f61858j);
        String g = C33230ac.m107227g(this.f61858j);
        String h = C33230ac.m107229h(this.f61858j);
        C24976t.m82263o((Context) this.f61888o, this.f61858j, e);
        if (C35469y.m114575a(this.f61895v, this.f61894u) || !C35469y.m114576a(this.f61894u)) {
            str = "0";
        } else {
            str = "1";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) this.f61888o, "//poi/detail");
        String str2 = "poi_bundle";
        C35109e j = new C35109e().mo89342c(e).mo89350k(g).mo89349j(h);
        Aweme aweme = this.f61858j;
        String str3 = null;
        if (aweme != null) {
            poiStruct = aweme.getPoiStruct();
        } else {
            poiStruct = null;
        }
        C35109e o = j.mo89336a(poiStruct).mo89333a(this.f61858j).mo89338a(C29893a.m97889b(this.f61858j, this.f61886m)).mo89354o(this.f61886m);
        String str4 = this.f61889p;
        if (str4 == null) {
            str4 = "";
        }
        C35109e u = o.mo89352m(str4).mo89360u(str);
        PoiStruct poiStruct2 = this.f61894u;
        if (poiStruct2 != null) {
            str3 = String.valueOf(poiStruct2.getPoiSubTitleType());
        }
        buildRoute.withParam(str2, (Serializable) u.mo89363x(str3).mo89343d(this.f61899z).mo89331a()).open();
        C28343z<C28318an> zVar = this.f61887n;
        if (zVar != null) {
            zVar.mo64929a(new C28318an(33, this.f61858j));
        }
    }

    /* renamed from: a */
    public final void mo59067a(Aweme aweme, JSONObject jSONObject) {
        PoiStruct poiStruct;
        super.mo59067a(aweme, jSONObject);
        this.f61896w = jSONObject;
        String str = null;
        if (aweme != null) {
            poiStruct = aweme.getPoiStruct();
        } else {
            poiStruct = null;
        }
        this.f61894u = poiStruct;
        if (this.f61894u != null) {
            m76989g();
            C35469y.m114573a(this.f61851c, this.f61894u);
            DmtTextView dmtTextView = this.f61852d;
            PoiStruct poiStruct2 = this.f61894u;
            if (poiStruct2 != null) {
                str = poiStruct2.poiName;
            }
            dmtTextView.setText(str);
            this.f61895v = C32630h.m105696b(AwemeApplication.m21341a()).mo83993a();
            String h = m76990h();
            if (!TextUtils.isEmpty(h)) {
                if (h == null) {
                    C7573i.m23580a();
                }
                if (m76986b(h)) {
                    m76987c(h);
                    m76993k();
                } else {
                    m76988d(h);
                }
            } else {
                m76997o();
            }
            m76994l();
            m76998p();
            m76996n();
            if (C6384b.m19835a().mo15287a(PoiAreaFilterExperiment.class, true, "poi_city_tag_optimize", C6384b.m19835a().mo15295d().poi_city_tag_optimize, 0) != 2) {
                PoiStruct poiStruct3 = this.f61894u;
                if (poiStruct3 != null && poiStruct3.isAdminArea) {
                    this.f61854f.setVisibility(8);
                    this.f61853e.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61060a(String str, String str2, String str3) {
        this.f61897x = str;
        this.f61898y = str2;
        this.f61899z = str3;
    }

    public C23453j(ViewGroup viewGroup, Activity activity, String str) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(activity, "activity");
        super(viewGroup);
        this.f61888o = activity;
        this.f61889p = str;
        View findViewById = viewGroup.findViewById(R.id.w3);
        C7573i.m23582a((Object) findViewById, "parent.findViewById(R.id.city_name_or_distance)");
        this.f61883a = (DmtTextView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.a9q);
        C7573i.m23582a((Object) findViewById2, "parent.findViewById(R.id.divider)");
        this.f61890q = (ImageView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.b3d);
        C7573i.m23582a((Object) findViewById3, "parent.findViewById(R.id.item_count)");
        this.f61891r = (DmtTextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.a40);
        C7573i.m23582a((Object) findViewById4, "parent.findViewById(R.id.coupon_container)");
        this.f61892s = (LinearLayout) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.ch8);
        C7573i.m23582a((Object) findViewById5, "parent.findViewById(R.id.poi_top_info_layout)");
        this.f61884b = (FollowFeedTagGroup) findViewById5;
    }
}
