package com.p280ss.android.ugc.aweme.poi.search;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.app.ActivityCompat;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.location.C32624f;
import com.p280ss.android.ugc.aweme.location.C32639p;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.poi.model.C35126o;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35408q;
import com.p280ss.android.ugc.aweme.poi.utils.C35440a;
import com.p280ss.android.ugc.aweme.poi.utils.C35445e;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.poi.search.a */
public class C35228a extends FrameLayout implements C6905a, C25675c<PoiStruct>, C32624f {

    /* renamed from: a */
    protected boolean f92280a;

    /* renamed from: b */
    public String f92281b = "";

    /* renamed from: c */
    private RecyclerView f92282c;

    /* renamed from: d */
    private BaseAdapter f92283d;

    /* renamed from: e */
    private DmtStatusView f92284e;

    /* renamed from: f */
    private C35241k f92285f;

    /* renamed from: g */
    private C35243m f92286g;

    /* renamed from: h */
    private boolean f92287h;

    /* renamed from: i */
    private String f92288i;

    /* renamed from: j */
    private String f92289j;

    /* renamed from: k */
    private String f92290k;

    /* renamed from: l */
    private C35126o f92291l;

    /* renamed from: m */
    private C35231a f92292m;

    /* renamed from: n */
    private C47562b f92293n;

    /* renamed from: o */
    private boolean f92294o;

    /* renamed from: p */
    private long f92295p;

    /* renamed from: q */
    private boolean f92296q;

    /* renamed from: r */
    private boolean f92297r = true;

    /* renamed from: s */
    private boolean f92298s;

    /* renamed from: t */
    private boolean f92299t;

    /* renamed from: com.ss.android.ugc.aweme.poi.search.a$a */
    public interface C35231a {
        /* renamed from: a */
        void mo89666a();
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<PoiStruct> list, boolean z) {
    }

    public String getPoiSearchRegionType() {
        return "domestic";
    }

    /* access modifiers changed from: protected */
    public int getSearchType() {
        return 0;
    }

    public final void aD_() {
        this.f92283d.ag_();
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        this.f92282c.setVisibility(4);
        this.f92284e.mo25942f();
    }

    /* renamed from: g */
    public final void mo89693g() {
        if (this.f92292m != null) {
            this.f92292m.mo89666a();
        }
    }

    /* renamed from: n */
    private void m113671n() {
        for (int i = 0; i < this.f92284e.getChildCount(); i++) {
            this.f92284e.getChildAt(i).setOnClickListener(new C35235e(this));
        }
    }

    public final void bd_() {
        this.f92285f.mo56976a(Integer.valueOf(4));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C32640a.m105721a().mo84024a((C32624f) this);
        if (this.f92293n != null && !this.f92293n.isDisposed()) {
            this.f92293n.dispose();
        }
        super.onDetachedFromWindow();
    }

    private String getCreationId() {
        Map b = C6903bc.m21499r().mo88921b(getContext());
        String str = "";
        if (b == null || !b.containsKey("creation_id")) {
            return str;
        }
        return (String) b.get("creation_id");
    }

    private int getLocationAccuracy() {
        LocationBundle a = C35445e.m114497a(C32640a.m105721a().mo84021a());
        if (a == null) {
            return 0;
        }
        float f = a.accuracy;
        if (f > 5000.0f) {
            return 0;
        }
        if (f > 1000.0f) {
            return 1;
        }
        if (f > 100.0f) {
            return 2;
        }
        if (f > 15.0f) {
            return 3;
        }
        if (f > 5.0f) {
            return 4;
        }
        return 5;
    }

    /* renamed from: j */
    private void m113667j() {
        this.f92285f = new C35241k();
        this.f92286g = new C35243m();
        this.f92285f.mo66537a(this);
        this.f92285f.mo66536a(this.f92286g);
        this.f92284e.mo25942f();
        this.f92293n = new C47562b();
    }

    /* renamed from: k */
    private void m113668k() {
        if (!this.f92284e.mo25945i()) {
            mo59098S_();
        }
        this.f92298s = false;
        this.f92299t = false;
        this.f92293n.mo119661a(C7492s.m23295b(2, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C35233c<Object>(this)));
    }

    /* renamed from: p */
    private void m113673p() {
        if (!this.f92294o && C6399b.m19944t()) {
            this.f92294o = true;
            C6877n.m21407a("location_log", "gps_duration", C6869c.m21381a().mo16886a("wait_duration", Long.valueOf(System.currentTimeMillis() - this.f92295p)).mo16888b());
        }
    }

    public final void ae_() {
        if (this.f92283d.f67566v) {
            this.f92283d.mo66516d(false);
            this.f92283d.notifyDataSetChanged();
            this.f92283d.ah_();
        }
        this.f92282c.setVisibility(4);
        this.f92284e.mo25943g();
        m113672o();
        m113664a(false);
    }

    public final void bv_() {
        m113673p();
        boolean t = C6399b.m19944t();
        if (!this.f92299t || !t) {
            LocationBundle a = C35445e.m114497a(C32640a.m105721a().mo84021a());
            this.f92298s = true;
            if (a != null) {
                m113663a(a);
            }
            mo89688a(true, this.f92281b);
        }
    }

    /* renamed from: e */
    public final void mo89691e() {
        String str;
        C35241k kVar = this.f92285f;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(1);
        objArr[1] = this.f92281b;
        objArr[2] = this.f92288i;
        objArr[3] = this.f92289j;
        objArr[4] = Integer.valueOf(getSearchType());
        if (TextUtils.isEmpty(this.f92290k)) {
            str = "";
        } else {
            str = this.f92290k;
        }
        objArr[5] = str;
        kVar.mo56976a(objArr);
        m113669l();
    }

    /* renamed from: f */
    public final void mo89692f() {
        this.f92296q = true;
        C32640a.m105721a();
        if (!C32639p.m105712a(getContext())) {
            C32640a.m105721a();
            C32639p.m105711a((Activity) getContext(), (C43154a) new C43154a() {
                /* renamed from: a */
                public final void mo71375a() {
                    C35228a.this.getLocation();
                }

                /* renamed from: b */
                public final void mo71376b() {
                    boolean z = true;
                    String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
                    if (ActivityCompat.m2242a((Activity) C35228a.this.getContext(), strArr[0]) && ActivityCompat.m2242a((Activity) C35228a.this.getContext(), strArr[1])) {
                        z = false;
                    }
                    if (z && C6399b.m19944t()) {
                        if (!C35408q.m114371a().mo90150c().booleanValue()) {
                            C6903bc.m21499r().mo88920a(C35228a.this.getContext(), new C35236f(this));
                        }
                        C35408q.m114371a().mo90145a(Boolean.valueOf(false));
                    }
                    if (!C6399b.m19944t() || !TextUtils.isEmpty(C35228a.this.f92281b)) {
                        C35228a.this.mo89691e();
                    } else {
                        C35228a.this.ae_();
                    }
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo89700a(DialogInterface dialogInterface, int i) {
                    StringBuilder sb = new StringBuilder("package:");
                    sb.append(C35228a.this.getContext().getPackageName());
                    C35228a.this.getContext().startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString())));
                }
            });
            return;
        }
        getLocation();
    }

    public void getLocation() {
        LocationBundle a = C35445e.m114497a(C32640a.m105721a().mo84026b(this));
        this.f92295p = System.currentTimeMillis();
        if (a != null) {
            m113663a(a);
        } else if (C6399b.m19944t()) {
            m113668k();
            return;
        }
        mo89691e();
    }

    /* renamed from: l */
    private void m113669l() {
        String str;
        if (!m113670m()) {
            C6907h.onEvent(new MobClick().setLabelName("video_publish_page").setEventName("search_poi").setJsonObject(new C6909j().mo16966a("key_word", this.f92281b).mo16967a()));
            String str2 = "search_poi";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "video_publish_page");
            String str3 = "enter_method";
            if (TextUtils.isEmpty(this.f92281b)) {
                str = "default_search_poi";
            } else {
                str = "search_poi";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("key_word", this.f92281b).mo59972a("has_gps", (Object) Boolean.valueOf(this.f92287h)).mo59970a("location_accuracy", getLocationAccuracy()).mo59973a("search_region_type", getPoiSearchRegionType()).f60753a);
        }
    }

    /* renamed from: m */
    private boolean m113670m() {
        String str;
        String a = C6903bc.m21499r().mo88919a(getContext());
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        String str2 = "search_poi";
        C22984d a2 = C22984d.m75611a().mo59973a("creation_id", getCreationId()).mo59973a("enter_from", a);
        String str3 = "enter_method";
        if (TextUtils.isEmpty(this.f92281b)) {
            str = "default_search_poi";
        } else {
            str = "search_poi";
        }
        C6907h.m21524a(str2, (Map) a2.mo59973a(str3, str).mo59973a("key_word", this.f92281b).mo59972a("has_gps", (Object) Boolean.valueOf(this.f92287h)).mo59970a("location_accuracy", getLocationAccuracy()).mo59973a("search_region_type", getPoiSearchRegionType()).f60753a);
        return true;
    }

    /* renamed from: o */
    private void m113672o() {
        C6877n.m21407a("location_log", "", C6869c.m21381a().mo16887a("service", "search_location").mo16887a("errorDesc", "no available locations near by").mo16887a("action", this.f92281b).mo16887a("longitude", this.f92288i).mo16887a("latitude", this.f92289j).mo16887a("type", String.valueOf(getSearchType())).mo16888b());
    }

    /* renamed from: h */
    private void m113666h() {
        LayoutInflater.from(getContext()).inflate(R.layout.q0, this, true);
        this.f92282c = (RecyclerView) findViewById(R.id.ch0);
        this.f92284e = (DmtStatusView) findViewById(R.id.dav);
        this.f92284e.setBuilder(C10803a.m31631a(getContext()).mo25958a(R.string.fic, R.string.fid, new C35232b(this)).mo25964b(m113662a(getContext().getString(R.string.fi2))));
        this.f92283d = new POISearchAdapterSuper();
        this.f92282c.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.f92283d.mo66504a((C6905a) this);
        this.f92283d.ah_();
        this.f92283d.mo66516d(true);
        this.f92282c.setAdapter(this.f92283d);
        this.f92282c.mo5528a((C1281m) new C1281m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                C35228a.this.mo89693g();
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89686a(View view) {
        mo89693g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo89690c(View view) {
        mo89693g();
    }

    public void setHideImmListener(C35231a aVar) {
        this.f92292m = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo89689b(View view) {
        mo89688a(true, this.f92281b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89687a(Long l) throws Exception {
        this.f92299t = true;
        if (!this.f92298s) {
            mo89691e();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f92283d.mo66507h();
    }

    public void setNotShowNoMyLocation(boolean z) {
        if (this.f92283d instanceof POISearchAdapterSuper) {
            ((POISearchAdapterSuper) this.f92283d).f92237a = z;
        }
    }

    /* renamed from: a */
    private void m113663a(LocationBundle locationBundle) {
        this.f92287h = locationBundle.isValid();
        String[] a = C35440a.m114453a(locationBundle);
        this.f92289j = a[0];
        this.f92288i = a[1];
    }

    /* renamed from: a */
    private C10805b m113662a(String str) {
        return new C10806a(getContext()).mo25990b((int) R.string.fi5).mo25991b(str).mo25986a(ButtonStyle.BORDER, R.string.fia, new C35234d(this)).f29135a;
    }

    /* renamed from: a */
    private void m113664a(boolean z) {
        String str;
        if (!m113665b(z)) {
            String str2 = "search_poi_result";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "video_publish_page");
            String str3 = "enter_method";
            if (TextUtils.isEmpty(this.f92281b)) {
                str = "default_search_poi";
            } else {
                str = "search_poi";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("key_word", this.f92281b).mo59970a("is_success", z ? 1 : 0).mo59973a("log_pb", this.f92285f.mo89705e()).mo59973a("search_region_type", getPoiSearchRegionType()).f60753a);
        }
    }

    /* renamed from: b */
    private boolean m113665b(boolean z) {
        String str;
        String a = C6903bc.m21499r().mo88919a(getContext());
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        String str2 = "search_poi_result";
        C22984d a2 = C22984d.m75611a().mo59973a("creation_id", getCreationId()).mo59973a("enter_from", a);
        String str3 = "enter_method";
        if (TextUtils.isEmpty(this.f92281b)) {
            str = "default_search_poi";
        } else {
            str = "search_poi";
        }
        C6907h.m21524a(str2, (Map) a2.mo59973a(str3, str).mo59973a("key_word", this.f92281b).mo59970a("is_success", z ? 1 : 0).mo59973a("log_pb", this.f92285f.mo89705e()).mo59973a("search_region_type", getPoiSearchRegionType()).f60753a);
        return true;
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        this.f92282c.setVisibility(4);
        if (this.f92283d.f67566v) {
            this.f92283d.mo66516d(false);
            this.f92283d.notifyDataSetChanged();
        }
        if (exc instanceof ApiServerException) {
            this.f92284e.setBuilder(this.f92284e.mo25937c().mo25964b(m113662a(((ApiServerException) exc).getErrorMsg())));
            m113671n();
        }
        this.f92284e.mo25944h();
        m113664a(false);
        m113672o();
    }

    /* renamed from: b */
    public final void mo59108b(List<PoiStruct> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f92283d.ah_();
        } else {
            this.f92283d.ai_();
        }
        if (TextUtils.isEmpty(this.f92281b)) {
            this.f92291l = C35126o.m113337a((C35126o) this.f92286g.getData());
        }
        this.f92283d.mo61577b(list);
    }

    /* renamed from: a */
    public final void mo59099a(List<PoiStruct> list, boolean z) {
        this.f92283d.mo66516d(true);
        if (!z) {
            this.f92283d.ah_();
        } else {
            this.f92283d.ai_();
        }
        if (this.f92286g != null) {
            ((C35239i) this.f92283d).mo89664a(this.f92286g.mo89708a());
        }
        if (TextUtils.isEmpty(this.f92281b)) {
            if (this.f92291l == null) {
                this.f92291l = C35126o.m113337a((C35126o) this.f92286g.getData());
            } else {
                mo89693g();
                this.f92282c.mo5541b(0);
            }
        }
        this.f92283d.mo58045a(list);
        this.f92282c.setVisibility(0);
        this.f92284e.mo25939d();
        m113664a(true);
    }

    /* renamed from: a */
    public final void mo89688a(boolean z, String str) {
        if (this.f92283d instanceof C35239i) {
            ((C35239i) this.f92283d).mo89665a(str);
        }
        if (C6399b.m19944t() && TextUtils.isEmpty(str)) {
            C32640a.m105721a();
            if (!C32639p.m105712a(getContext())) {
                ae_();
                return;
            }
        }
        if (TextUtils.isEmpty(str) && this.f92291l != null) {
            this.f92286g.mData = this.f92291l;
            this.f92286g.f92307a = str;
            this.f92281b = "";
            mo59099a(this.f92291l.f91883a, this.f92291l.f91884b);
        } else if (TextUtils.isEmpty(str) || !TextUtils.equals(this.f92281b, str) || this.f92284e.mo25947k()) {
            this.f92281b = str;
            if (C6319n.m19593a(this.f92288i) || C6319n.m19593a(this.f92289j)) {
                if (!this.f92296q) {
                    mo89692f();
                }
                if (!z) {
                    return;
                }
            }
            mo89691e();
        }
    }

    public C35228a(Context context, AttributeSet attributeSet, int i, String str, boolean z) {
        super(context, attributeSet, i);
        this.f92290k = str;
        this.f92280a = z;
        m113666h();
        m113667j();
    }
}
