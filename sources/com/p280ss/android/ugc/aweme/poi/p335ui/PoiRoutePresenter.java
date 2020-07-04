package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.poi.map.C35094g;
import com.p280ss.android.ugc.aweme.poi.map.C35095h;
import com.p280ss.android.ugc.aweme.poi.map.C35098k;
import com.p280ss.android.ugc.aweme.poi.map.C35102o;
import com.p280ss.android.ugc.aweme.poi.map.MapLayout;
import com.p280ss.android.ugc.aweme.poi.map.MapRoutePlan;
import com.p280ss.android.ugc.aweme.poi.model.PoiLatLng;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.utils.C35441aa;
import com.p280ss.android.ugc.aweme.poi.utils.C35442b;
import com.p280ss.android.ugc.aweme.poi.utils.C35462r;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRoutePresenter */
public class PoiRoutePresenter implements C35098k {

    /* renamed from: a */
    protected MapLayout f92435a;

    /* renamed from: b */
    protected MapRoutePlan f92436b;

    /* renamed from: c */
    public Context f92437c;

    /* renamed from: d */
    protected PoiStruct f92438d;

    /* renamed from: e */
    protected double[] f92439e;

    /* renamed from: f */
    protected double f92440f;

    /* renamed from: g */
    protected double f92441g;

    /* renamed from: h */
    protected boolean f92442h;

    /* renamed from: i */
    public Unbinder f92443i;

    /* renamed from: j */
    private AmeBaseFragment f92444j;

    /* renamed from: k */
    private Keva f92445k;

    /* renamed from: l */
    private boolean f92446l;

    /* renamed from: m */
    private LocationResult f92447m;
    TextView mRouteBus;
    TextView mRouteDrive;
    View mRouteTab;
    TextView mRouteWalking;
    TextView mTitle;

    /* renamed from: n */
    private boolean f92448n = true;

    /* renamed from: f */
    public boolean mo89772f() {
        return true;
    }

    /* renamed from: g */
    public C35102o mo89773g() {
        return null;
    }

    /* renamed from: h */
    public int mo89774h() {
        return R.layout.a0l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0154  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo89767a(com.p280ss.android.ugc.aweme.poi.model.PoiStruct r24) {
        /*
            r23 = this;
            r7 = r23
            r1 = r24
            r8 = 0
            if (r1 != 0) goto L_0x002d
            java.lang.String r0 = "poi_crash_log"
            com.ss.android.ugc.aweme.app.g.c r1 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
            java.lang.String r2 = "poi_service"
            java.lang.String r3 = "poi_map"
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            java.lang.String r2 = "errorDesc"
            java.lang.String r3 = "poidetail is null"
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            java.lang.String r2 = "poitype"
            java.lang.String r3 = "map"
            com.ss.android.ugc.aweme.app.g.c r1 = r1.mo16887a(r2, r3)
            org.json.JSONObject r1 = r1.mo16888b()
            com.p280ss.android.ugc.aweme.app.C6877n.m21447a(r0, r1)
            return r8
        L_0x002d:
            r7.f92438d = r1
            android.widget.TextView r0 = r7.mTitle
            if (r0 == 0) goto L_0x0042
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x0042
            android.widget.TextView r0 = r7.mTitle
            java.lang.String r2 = r24.getPoiName()
            r0.setText(r2)
        L_0x0042:
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Throwable -> 0x004f }
            java.lang.String r2 = "PoiPreferences"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepoFromSp(r0, r2, r8)     // Catch:{ Throwable -> 0x004f }
            r7.f92445k = r0     // Catch:{ Throwable -> 0x004f }
            goto L_0x0065
        L_0x004f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SharedPreferencesAnnotatedManager getSP failed "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p280ss.android.ugc.aweme.util.C42880h.m136156a(r0)
        L_0x0065:
            java.lang.String r0 = r24.getPoiLatitude()
            java.lang.String r2 = r24.getPoiLongitude()
            double[] r0 = com.p280ss.android.ugc.aweme.poi.utils.C35442b.m114470a(r0, r2)
            r7.f92439e = r0
            com.ss.android.ugc.aweme.location.p r0 = com.p280ss.android.ugc.aweme.location.C32639p.C32640a.m105721a()
            com.ss.android.ugc.aweme.location.LocationResult r0 = r0.mo84021a()
            r7.f92447m = r0
            boolean r0 = r7.f92448n
            r9 = 1
            if (r0 == 0) goto L_0x014f
            android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r2 = "PoiPreferences"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepoFromSp(r0, r2, r8)     // Catch:{ Throwable -> 0x008f }
            r7.f92445k = r0     // Catch:{ Throwable -> 0x008f }
            goto L_0x00a5
        L_0x008f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SharedPreferencesAnnotatedManager getSP failed "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p280ss.android.ugc.aweme.util.C42880h.m136156a(r0)
        L_0x00a5:
            com.ss.android.ugc.aweme.location.LocationResult r0 = r7.f92447m
            if (r0 == 0) goto L_0x014f
            com.ss.android.ugc.aweme.location.LocationResult r0 = r7.f92447m
            double r2 = r0.getLatitude()
            r7.f92440f = r2
            com.ss.android.ugc.aweme.location.LocationResult r0 = r7.f92447m
            double r2 = r0.getLongitude()
            r7.f92441g = r2
            com.ss.android.ugc.aweme.location.LocationResult r0 = r7.f92447m
            boolean r0 = r0.isGaode()
            if (r0 != 0) goto L_0x00d1
            double r2 = r7.f92441g
            double r4 = r7.f92440f
            double[] r0 = com.p280ss.android.ugc.aweme.poi.utils.C35440a.m114454b(r2, r4)
            r2 = r0[r8]
            r7.f92441g = r2
            r2 = r0[r9]
            r7.f92440f = r2
        L_0x00d1:
            com.ss.android.ugc.aweme.location.LocationResult r0 = r7.f92447m
            boolean r0 = com.p280ss.android.ugc.aweme.poi.utils.C35441aa.m114462a(r1, r0)
            if (r0 == 0) goto L_0x00e4
            r7.f92442h = r9
            boolean r0 = r23.mo89772f()
            if (r0 == 0) goto L_0x00e4
            r23.mo89798l()
        L_0x00e4:
            double[] r0 = r7.f92439e
            if (r0 == 0) goto L_0x014f
            double[] r0 = r7.f92439e
            r10 = r0[r8]
            double[] r0 = r7.f92439e
            r12 = r0[r9]
            double r14 = r7.f92440f
            double r2 = r7.f92441g
            r16 = r2
            double r2 = com.p280ss.android.ugc.aweme.poi.utils.C35442b.m114465a(r10, r12, r14, r16)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0106
            com.ss.android.ugc.aweme.poi.map.MapRoutePlan r0 = com.p280ss.android.ugc.aweme.poi.map.MapRoutePlan.RouteWalking
            r7.f92436b = r0
        L_0x0104:
            r0 = 1
            goto L_0x0126
        L_0x0106:
            com.ss.android.ugc.aweme.location.LocationResult r0 = r7.f92447m
            boolean r0 = com.p280ss.android.ugc.aweme.poi.utils.C35441aa.m114462a(r1, r0)
            if (r0 == 0) goto L_0x0125
            r7.f92446l = r9
            com.bytedance.keva.Keva r0 = r7.f92445k
            if (r0 == 0) goto L_0x011d
            com.bytedance.keva.Keva r0 = r7.f92445k
            java.lang.String r1 = "poi_route_type"
            int r0 = r0.getInt(r1, r8)
            goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            com.ss.android.ugc.aweme.poi.map.MapRoutePlan r0 = m113847b(r0)
            r7.f92436b = r0
            goto L_0x0104
        L_0x0125:
            r0 = 0
        L_0x0126:
            if (r0 == 0) goto L_0x014f
            com.ss.android.ugc.aweme.poi.map.MapLayout r1 = r7.f92435a
            com.ss.android.ugc.aweme.poi.model.PoiLatLng r2 = new com.ss.android.ugc.aweme.poi.model.PoiLatLng
            double r3 = r7.f92440f
            double r5 = r7.f92441g
            r2.<init>(r3, r5)
            com.ss.android.ugc.aweme.poi.model.PoiLatLng r3 = new com.ss.android.ugc.aweme.poi.model.PoiLatLng
            double[] r0 = r7.f92439e
            r4 = r0[r8]
            double[] r0 = r7.f92439e
            r10 = r0[r9]
            r3.<init>(r4, r10)
            com.ss.android.ugc.aweme.poi.map.MapRoutePlan r4 = r7.f92436b
            com.ss.android.ugc.aweme.location.LocationResult r0 = r7.f92447m
            java.lang.String r5 = r0.getCity()
            r6 = r23
            r1.mo88955a(r2, r3, r4, r5, r6)
            r0 = 1
            goto L_0x0150
        L_0x014f:
            r0 = 0
        L_0x0150:
            double[] r1 = r7.f92439e
            if (r1 == 0) goto L_0x01a7
            boolean r1 = r23.mo89772f()
            if (r1 == 0) goto L_0x0165
            double[] r1 = r7.f92439e
            r2 = r1[r8]
            double[] r1 = r7.f92439e
            r4 = r1[r9]
            r7.mo89786a(r2, r4)
        L_0x0165:
            boolean r1 = r7.f92442h
            if (r1 == 0) goto L_0x018e
            double r1 = r7.f92440f
            double r3 = r7.f92441g
            boolean r1 = com.p280ss.android.ugc.aweme.poi.utils.C35462r.m114566a(r1, r3)
            if (r1 == 0) goto L_0x018e
            boolean r1 = r23.mo89772f()
            if (r1 == 0) goto L_0x018e
            com.ss.android.ugc.aweme.poi.map.MapLayout r10 = r7.f92435a
            double[] r1 = r7.f92439e
            r11 = r1[r8]
            double[] r1 = r7.f92439e
            r13 = r1[r9]
            double r1 = r7.f92440f
            double r3 = r7.f92441g
            r15 = r1
            r17 = r3
            r10.mo88948a(r11, r13, r15, r17)
            goto L_0x01a7
        L_0x018e:
            com.ss.android.ugc.aweme.poi.map.MapLayout r15 = r7.f92435a
            android.content.Context r1 = r7.f92437c
            android.graphics.Bitmap r16 = com.p280ss.android.ugc.aweme.poi.utils.C35462r.m114549a(r1)
            double[] r1 = r7.f92439e
            r17 = r1[r8]
            double[] r1 = r7.f92439e
            r19 = r1[r9]
            float r21 = r23.mo88971a()
            r22 = 0
            r15.mo88950a(r16, r17, r19, r21, r22)
        L_0x01a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.PoiRoutePresenter.mo89767a(com.ss.android.ugc.aweme.poi.model.PoiStruct):boolean");
    }

    /* renamed from: a */
    public final void mo89792a(PoiLatLng poiLatLng) {
        if (this.mTitle != null && C6399b.m19944t()) {
            this.mTitle.setText(poiLatLng.name);
        }
        if (poiLatLng != null) {
            this.f92439e = C35442b.m114469a(poiLatLng.latitude, poiLatLng.longitude);
        }
        if (this.f92439e != null) {
            this.f92435a.mo88950a(BitmapFactory.decodeResource(this.f92437c.getResources(), R.drawable.axv), this.f92439e[0], this.f92439e[1], m113846b(poiLatLng), (C35095h) null);
            m113844a(this.f92439e[0], this.f92439e[1], poiLatLng);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo89791a(MapRoutePlan mapRoutePlan) {
        if (this.f92445k != null && this.f92446l) {
            this.f92445k.storeInt("poi_route_type", mapRoutePlan == MapRoutePlan.RouteDrive ? 1 : 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo89766a(MapRoutePlan mapRoutePlan, boolean z) {
        if (mapRoutePlan != null) {
            switch (mapRoutePlan) {
                case RouteDrive:
                    m113845a(this.mRouteDrive, z ? R.drawable.aqs : R.drawable.aqr, z);
                    return;
                case RouteTransit:
                    m113845a(this.mRouteBus, z ? R.drawable.apn : R.drawable.apm, z);
                    return;
                case RouteWalking:
                    m113845a(this.mRouteWalking, z ? R.drawable.b2r : R.drawable.b2q, z);
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Resources mo89797k() {
        return this.f92437c.getResources();
    }

    /* renamed from: m */
    public final void mo89799m() {
        C35462r.m114560a(this.f92437c, this.f92439e);
    }

    /* renamed from: i */
    public final void mo89795i() {
        if (this.f92443i != null) {
            this.f92443i.unbind();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo89796j() {
        if (this.f92444j != null) {
            return this.f92444j.isViewValid();
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo89800n() {
        if (mo89773g() != null) {
            mo89773g().mo88971a();
        }
    }

    /* renamed from: a */
    private float mo88971a() {
        if (C35441aa.m114462a(this.f92438d, this.f92447m)) {
            return this.f92435a.getZoomBig();
        }
        return this.f92435a.getZoomSmall();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo89768b() {
        Object tag = this.mRouteDrive.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo89793b(MapRoutePlan.RouteDrive);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo89769c() {
        Object tag = this.mRouteBus.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo89793b(MapRoutePlan.RouteTransit);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo89770d() {
        Object tag = this.mRouteWalking.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo89793b(MapRoutePlan.RouteWalking);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo89798l() {
        if (this.f92440f > 0.0d && this.f92441g > 0.0d) {
            this.f92435a.mo88949a(BitmapFactory.decodeResource(mo89797k(), R.drawable.avl), this.f92440f, this.f92441g);
        }
    }

    /* renamed from: b */
    private static MapRoutePlan m113847b(int i) {
        return MapRoutePlan.RouteDrive;
    }

    /* renamed from: a */
    public final void mo89787a(float f) {
        if (this.mTitle != null && C6399b.m19944t()) {
            this.mTitle.setAlpha(f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo89793b(MapRoutePlan mapRoutePlan) {
        mo89794c(mapRoutePlan);
        if (mapRoutePlan != MapRoutePlan.RouteWalking) {
            mo89791a(mapRoutePlan);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cgi) {
            mo89768b();
        } else if (id == R.id.cgf) {
            mo89769c();
        } else {
            if (id == R.id.cgt) {
                mo89770d();
            }
        }
    }

    /* renamed from: b */
    private float m113846b(PoiLatLng poiLatLng) {
        if (poiLatLng.zoom > 0.0f) {
            return poiLatLng.zoom;
        }
        if (C35441aa.m114460a(this.f92447m, String.valueOf(poiLatLng.latitude), String.valueOf(poiLatLng.longitude), (String) null)) {
            return this.f92435a.getZoomBig();
        }
        return this.f92435a.getZoomSmall();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo89794c(MapRoutePlan mapRoutePlan) {
        if (mapRoutePlan == this.f92436b) {
            mo89766a(mapRoutePlan, true);
        } else if (this.f92436b == null) {
            mo89766a(mapRoutePlan, true);
            this.f92436b = mapRoutePlan;
        } else {
            mo89766a(this.f92436b, false);
            this.f92436b = mapRoutePlan;
            mo89766a(mapRoutePlan, true);
        }
    }

    /* renamed from: a */
    public final void mo89788a(int i) {
        if (this.mTitle != null && C6399b.m19944t()) {
            this.mTitle.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89789a(View view) {
        if (mo89773g() != null) {
            mo89773g().mo88971a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo89786a(double d, double d2) {
        View inflate = LayoutInflater.from(this.f92437c).inflate(mo89774h(), null);
        TextView textView = (TextView) inflate.findViewById(R.id.cfg);
        TextView textView2 = (TextView) inflate.findViewById(R.id.cff);
        if (this.f92438d != null) {
            textView.setText(this.f92438d.getPoiName());
            String addressStr = this.f92438d.getAddressStr();
            if (TextUtils.isEmpty(addressStr)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(addressStr);
            }
        }
        this.f92435a.mo88953a(inflate, new PoiLatLng(d, d2), C35462r.m114549a(this.f92437c), (C35094g) new C35290ae(this));
        inflate.setOnClickListener(new C35291af(this));
    }

    /* renamed from: a */
    private void m113845a(TextView textView, int i, boolean z) {
        int i2;
        Drawable drawable = mo89797k().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        textView.setCompoundDrawables(null, drawable, null, null);
        Resources k = mo89797k();
        if (z) {
            i2 = R.color.a71;
        } else {
            i2 = R.color.a5d;
        }
        textView.setTextColor(k.getColor(i2));
        textView.setSelected(z);
    }

    /* renamed from: a */
    private void m113844a(double d, double d2, PoiLatLng poiLatLng) {
        View view;
        if (TextUtils.isEmpty(poiLatLng.name)) {
            view = new View(this.f92437c);
            view.setBackgroundColor(0);
        } else {
            View inflate = LayoutInflater.from(this.f92437c).inflate(mo89774h(), null);
            TextView textView = (TextView) inflate.findViewById(R.id.cff);
            ((TextView) inflate.findViewById(R.id.cfg)).setText(poiLatLng.name);
            String str = poiLatLng.address;
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            view = inflate;
        }
        this.f92435a.mo88953a(view, new PoiLatLng(d, d2), BitmapFactory.decodeResource(this.f92437c.getResources(), R.drawable.axv), (C35094g) null);
    }

    /* renamed from: a */
    public final void mo89790a(AmeBaseFragment ameBaseFragment, View view, MapLayout mapLayout, boolean z) {
        this.f92443i = ButterKnife.bind((Object) this, view);
        this.f92444j = ameBaseFragment;
        this.f92435a = mapLayout;
        this.f92437c = mapLayout.getContext();
        this.f92448n = z;
    }
}
