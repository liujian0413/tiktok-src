package com.p280ss.android.ugc.aweme.poi.p335ui.detail.multirows;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.BaseDetailFragment;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.DetailAwemeListFragment;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.p280ss.android.ugc.aweme.detail.C26065h;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.C35086h.C35087a;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle.C35003a;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35025a;
import com.p280ss.android.ugc.aweme.poi.event.FinishMapEvent;
import com.p280ss.android.ugc.aweme.poi.map.C35096i;
import com.p280ss.android.ugc.aweme.poi.map.C35097j;
import com.p280ss.android.ugc.aweme.poi.map.MapLayout;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.PoiRouteActivity;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35308e;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.component.PoiHeaderWidgetGroup;
import com.p280ss.android.ugc.aweme.poi.p335ui.p1473a.C35281k;
import com.p280ss.android.ugc.aweme.poi.p335ui.p1473a.C35283l;
import com.p280ss.android.ugc.aweme.poi.p335ui.p1473a.C35284m;
import com.p280ss.android.ugc.aweme.poi.p335ui.p1473a.C35285n;
import com.p280ss.android.ugc.aweme.poi.utils.C35440a;
import com.p280ss.android.ugc.aweme.poi.utils.C35456o;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileFragmentAdapter;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.multirows.PoiDetailMultiRowsFragment */
public final class PoiDetailMultiRowsFragment extends BaseDetailFragment implements C35025a, C35096i, C35097j, C35285n, C35308e {

    /* renamed from: h */
    static final /* synthetic */ C7595j[] f92652h = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PoiDetailMultiRowsFragment.class), "mHandler", "getMHandler()Lcom/bytedance/common/utility/collection/WeakHandler;"))};

    /* renamed from: J */
    private boolean f92653J;

    /* renamed from: K */
    private DetailAwemeListFragment f92654K;

    /* renamed from: L */
    private C35357b f92655L;

    /* renamed from: M */
    private C35283l f92656M;

    /* renamed from: N */
    private C35284m f92657N;

    /* renamed from: O */
    private float f92658O;

    /* renamed from: P */
    private float f92659P;

    /* renamed from: Q */
    private final C7541d f92660Q = C7546e.m23569a(new C35351a(this));

    /* renamed from: R */
    private HashMap f92661R;

    /* renamed from: i */
    private PoiBundle f92662i;

    /* renamed from: j */
    private PoiSimpleBundle f92663j;

    /* renamed from: k */
    private String f92664k = "";

    /* renamed from: l */
    private String f92665l;

    /* renamed from: m */
    private String f92666m;

    /* renamed from: n */
    private PoiDetail f92667n;

    /* renamed from: o */
    private PoiStruct f92668o;

    /* renamed from: p */
    private String f92669p;

    /* renamed from: q */
    private boolean f92670q;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.multirows.PoiDetailMultiRowsFragment$a */
    static final class C35351a extends Lambda implements C7561a<C6309f> {

        /* renamed from: a */
        final /* synthetic */ PoiDetailMultiRowsFragment f92671a;

        C35351a(PoiDetailMultiRowsFragment poiDetailMultiRowsFragment) {
            this.f92671a = poiDetailMultiRowsFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C6309f invoke() {
            return new C6309f(this.f92671a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.multirows.PoiDetailMultiRowsFragment$b */
    static final class C35352b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiDetailMultiRowsFragment f92672a;

        C35352b(PoiDetailMultiRowsFragment poiDetailMultiRowsFragment) {
            this.f92672a = poiDetailMultiRowsFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f92672a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.multirows.PoiDetailMultiRowsFragment$c */
    static final class C35353c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiDetailMultiRowsFragment f92673a;

        C35353c(PoiDetailMultiRowsFragment poiDetailMultiRowsFragment) {
            this.f92673a = poiDetailMultiRowsFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92673a.mo88804a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.multirows.PoiDetailMultiRowsFragment$d */
    public static final class C35354d implements C43154a {

        /* renamed from: a */
        final /* synthetic */ PoiDetailMultiRowsFragment f92674a;

        /* renamed from: b */
        public final void mo71376b() {
            this.f92674a.mo29060a();
        }

        /* renamed from: a */
        public final void mo71375a() {
            if (C32640a.m105721a().mo84026b(null) != null) {
                C32640a.m105721a().mo84027b();
            }
            this.f92674a.mo29060a();
        }

        C35354d(PoiDetailMultiRowsFragment poiDetailMultiRowsFragment) {
            this.f92674a = poiDetailMultiRowsFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.multirows.PoiDetailMultiRowsFragment$e */
    static final class C35355e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiDetailMultiRowsFragment f92675a;

        C35355e(PoiDetailMultiRowsFragment poiDetailMultiRowsFragment) {
            this.f92675a = poiDetailMultiRowsFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92675a.mo29060a();
        }
    }

    /* renamed from: b */
    private View m114069b(int i) {
        if (this.f92661R == null) {
            this.f92661R = new HashMap();
        }
        View view = (View) this.f92661R.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f92661R.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    private final C6309f m114070e() {
        return (C6309f) this.f92660Q.getValue();
    }

    /* renamed from: o */
    private void m114075o() {
        if (this.f92661R != null) {
            this.f92661R.clear();
        }
    }

    /* renamed from: H */
    public final Fragment mo89718H() {
        return this;
    }

    /* renamed from: a */
    public final C26065h mo67554a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "viewGroup");
        return null;
    }

    /* renamed from: a */
    public final String mo61693a(int i) {
        return "poi_page";
    }

    /* renamed from: a */
    public final void mo89725a(String str, int i) {
        C7573i.m23587b(str, "poiId");
    }

    /* renamed from: c */
    public final CheckableImageView mo88806c() {
        return null;
    }

    /* renamed from: m */
    public final int mo61706m() {
        return R.layout.px;
    }

    /* renamed from: n */
    public final String mo61707n() {
        return this.f92664k;
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        C7573i.m23587b(anVar, "event");
    }

    /* renamed from: t */
    public final boolean mo67559t() {
        return false;
    }

    /* renamed from: b */
    public final PoiBundle mo88805b() {
        PoiBundle poiBundle = this.f92662i;
        if (poiBundle == null) {
            C7573i.m23580a();
        }
        return poiBundle;
    }

    /* renamed from: f */
    private final void m114071f() {
        StringBuilder sb = new StringBuilder(this.f92664k);
        sb.append(System.currentTimeMillis());
        this.f92669p = C43734f.m138605a(sb.toString());
    }

    /* renamed from: d */
    public final void mo29173d() {
        this.f92653J = true;
        if (this.f92668o != null && isViewValid()) {
            C35357b bVar = this.f92655L;
            if (bVar == null) {
                C7573i.m23583a("mPoiRoutePresenter");
            }
            bVar.mo89929a(this.f92668o);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (m114070e() != null) {
            m114070e().removeCallbacksAndMessages(null);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        MapLayout mapLayout = (MapLayout) m114069b(R.id.cci);
        if (mapLayout != null) {
            mapLayout.mo88960e();
        }
        m114075o();
    }

    public final void onLowMemory() {
        MapLayout mapLayout = (MapLayout) m114069b(R.id.cci);
        if (mapLayout != null) {
            mapLayout.mo88961f();
        }
        super.onLowMemory();
    }

    public final void onPause() {
        super.onPause();
        MapLayout mapLayout = (MapLayout) m114069b(R.id.cci);
        if (mapLayout != null) {
            mapLayout.mo88957c();
        }
        FinishMapEvent.pageKey = this.f92669p;
    }

    public final void onResume() {
        super.onResume();
        MapLayout mapLayout = (MapLayout) m114069b(R.id.cci);
        if (mapLayout != null) {
            mapLayout.mo88947a();
        }
    }

    public final void onStart() {
        super.onStart();
        MapLayout mapLayout = (MapLayout) m114069b(R.id.cci);
        if (mapLayout != null) {
            mapLayout.mo88956b();
        }
    }

    public final void onStop() {
        super.onStop();
        MapLayout mapLayout = (MapLayout) m114069b(R.id.cci);
        if (mapLayout != null) {
            mapLayout.mo88958d();
        }
    }

    public final void bw_() {
        C35456o.m114535a();
        if (isViewValid()) {
            m114070e().removeMessages(TextExtraStruct.TYPE_CUSTOM);
            ((DmtStatusView) m114069b(R.id.daj)).mo25944h();
        }
    }

    /* renamed from: j */
    private final PoiSimpleBundle m114072j() {
        PoiBundle poiBundle = this.f92662i;
        if (poiBundle == null) {
            return null;
        }
        this.f92663j = new C35003a().mo88730a(poiBundle.poiId).mo88732b(poiBundle.poiType).mo88733c(C33230ac.m107214b()).mo88736f(poiBundle.from).mo88735e(poiBundle.awemeid).mo88734d(poiBundle.activityId).mo88737g(poiBundle.backendType).mo88738h(poiBundle.cityCode).mo88731a();
        return this.f92663j;
    }

    /* renamed from: k */
    private final DetailAwemeListFragment m114073k() {
        C0608j childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractDetailFragment.f68818r);
        boolean z = false;
        sb.append(0);
        Fragment a = childFragmentManager.mo2644a(sb.toString());
        if (!(a instanceof DetailAwemeListFragment)) {
            a = DetailAwemeListFragment.m77808a(4, "poi_page", this.f92664k, false, "", "poi_page", new PoiDetailAwemeListProvider(this.f92663j));
            DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) a;
            if (this.f68820B == 0) {
                z = true;
            }
            detailAwemeListFragment.f62597p = z;
            detailAwemeListFragment.f62598q = true;
        }
        if (a != null) {
            return (DetailAwemeListFragment) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment");
    }

    /* renamed from: q */
    public final FragmentPagerAdapter mo61713q() {
        this.f68822D = new ArrayList();
        this.f68823E = new ArrayList();
        this.f62485e = new ArrayList();
        this.f92654K = m114073k();
        List list = this.f68822D;
        DetailAwemeListFragment detailAwemeListFragment = this.f92654K;
        if (detailAwemeListFragment == null) {
            C7573i.m23583a("mListFragment");
        }
        list.add(detailAwemeListFragment);
        List list2 = this.f68823E;
        DetailAwemeListFragment detailAwemeListFragment2 = this.f92654K;
        if (detailAwemeListFragment2 == null) {
            C7573i.m23583a("mListFragment");
        }
        list2.add(detailAwemeListFragment2);
        this.f62485e.add(Integer.valueOf(4));
        return new ProfileFragmentAdapter(getChildFragmentManager(), this.f68823E, this.f62485e);
    }

    /* renamed from: l */
    private final void m114074l() {
        long j;
        int i;
        boolean z;
        C35284m mVar = this.f92657N;
        if (mVar != null) {
            C35284m mVar2 = this.f92657N;
            if (mVar2 != null) {
                i = mVar2.mo89822a();
            } else {
                i = 0;
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                mVar = null;
            }
            if (mVar != null) {
                Object obj = mVar.f92496a.get(0);
                if (obj != null) {
                    PoiDetail poiDetail = (PoiDetail) obj;
                    m114068a(poiDetail);
                    PoiHeaderWidgetGroup poiHeaderWidgetGroup = (PoiHeaderWidgetGroup) m114069b(R.id.ccm);
                    List<C34145b> list = mVar.f92496a;
                    C7573i.m23582a((Object) list, "feeds");
                    poiHeaderWidgetGroup.mo89896a(list, this.f92663j, (C35025a) this, (C35308e) this);
                    if (poiDetail != null) {
                        TextView textView = this.f68830u;
                        C7573i.m23582a((Object) textView, "mTitle");
                        textView.setText(poiDetail.getPoiName());
                        this.f92667n = poiDetail;
                        this.f92668o = poiDetail.poiStruct;
                        if (this.f92653J) {
                            C35357b bVar = this.f92655L;
                            if (bVar == null) {
                                C7573i.m23583a("mPoiRoutePresenter");
                            }
                            bVar.mo89929a(poiDetail.poiStruct);
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiDetail");
                }
            }
        }
        PoiDetail poiDetail2 = this.f92667n;
        PoiDetail poiDetail3 = this.f92667n;
        if (poiDetail3 != null) {
            j = poiDetail3.getDuration();
        } else {
            j = 0;
        }
        C35456o.m114537a(poiDetail2, j);
    }

    /* renamed from: a */
    public final void mo29060a() {
        String str;
        if (isViewValid()) {
            if (!C35356a.m114095a(getContext())) {
                ((DmtStatusView) m114069b(R.id.daj)).mo25944h();
                return;
            }
            m114070e().sendEmptyMessageDelayed(TextExtraStruct.TYPE_CUSTOM, 500);
            String str2 = "";
            String str3 = "";
            LocationResult a = C32640a.m105721a().mo84021a();
            if (a != null) {
                String[] a2 = C35440a.m114452a(a);
                String str4 = a2[0];
                str3 = a2[1];
                str2 = str4;
            }
            C35283l lVar = this.f92656M;
            if (lVar == null) {
                C7573i.m23583a("mPoiDetailPresenter");
            }
            if (lVar != null) {
                Object[] objArr = new Object[1];
                C35087a aVar = new C35087a();
                PoiBundle poiBundle = this.f92662i;
                String str5 = null;
                if (poiBundle != null) {
                    str = poiBundle.poiId;
                } else {
                    str = null;
                }
                C35087a a3 = aVar.mo88937a(str);
                if (str2 == null) {
                    str2 = "";
                }
                C35087a b = a3.mo88942b(str2);
                if (str3 == null) {
                    str3 = "";
                }
                C35087a c = b.mo88944c(str3);
                PoiBundle poiBundle2 = this.f92662i;
                if (poiBundle2 != null) {
                    str5 = poiBundle2.awemeid;
                }
                objArr[0] = c.mo88945d(str5).mo88939a();
                lVar.mo56976a(objArr);
            }
        }
    }

    /* renamed from: a */
    private final void m114068a(PoiDetail poiDetail) {
        PoiSimpleBundle poiSimpleBundle = this.f92663j;
        if (poiSimpleBundle != null) {
            poiSimpleBundle.setPoiType(poiDetail.getPoiTypeStr());
            poiSimpleBundle.setBackendType(poiDetail.getBackendType());
            poiSimpleBundle.setPoiCity(poiDetail.getCityCode());
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        MapLayout mapLayout = (MapLayout) m114069b(R.id.cci);
        if (mapLayout != null) {
            mapLayout.mo88951a(bundle);
        }
    }

    /* renamed from: a */
    public final void mo61696a(Bundle bundle) {
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("poi_bundle");
            if (serializable != null) {
                this.f92662i = (PoiBundle) serializable;
                this.f92663j = m114072j();
                PoiBundle poiBundle = this.f92662i;
                if (poiBundle != null) {
                    String str = poiBundle.poiId;
                    C7573i.m23582a((Object) str, "poiId");
                    this.f92664k = str;
                    this.f92665l = poiBundle.poiName;
                    this.f92666m = poiBundle.poiType;
                    poiBundle.fromQrScan = this.f92670q;
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiBundle");
        }
    }

    public final void handleMsg(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 65281) {
            ((DmtStatusView) m114069b(R.id.daj)).mo25942f();
            View b = m114069b(R.id.dai);
            C7573i.m23582a((Object) b, "statusBg");
            b.setVisibility(8);
        }
    }

    @C7709l
    public final void onAntiCrawlerEvent(C23281a aVar) {
        C7573i.m23587b(aVar, "event");
        String str = aVar.f61317a;
        if (isVisible() && isViewValid() && str != null && C7634n.m23776c((CharSequence) str, (CharSequence) "/aweme/v1/poi/aweme/?", false)) {
            C42961az.m136385f(aVar);
            DetailAwemeListFragment detailAwemeListFragment = this.f92654K;
            if (detailAwemeListFragment == null) {
                C7573i.m23583a("mListFragment");
            }
            detailAwemeListFragment.mo61748d();
        }
    }

    /* renamed from: a */
    public final void mo89811a(C35284m mVar) {
        if (isViewValid()) {
            if (mVar != null && !C6307b.m19566a((Collection<T>) mVar.f92496a) && (mVar.f92496a.get(0) instanceof PoiDetail)) {
                m114070e().removeCallbacksAndMessages(null);
                this.f92657N = mVar;
                m114074l();
                if (isViewValid()) {
                    View b = m114069b(R.id.dai);
                    C7573i.m23582a((Object) b, "statusBg");
                    b.setVisibility(8);
                    ((DmtStatusView) m114069b(R.id.daj)).mo25939d();
                }
            } else if (isViewValid()) {
                m114070e().removeMessages(TextExtraStruct.TYPE_CUSTOM);
                ((DmtStatusView) m114069b(R.id.daj)).mo25944h();
            }
        }
    }

    /* renamed from: a */
    public final void mo88804a(boolean z) {
        String str;
        int i;
        Context context = getContext();
        PoiStruct poiStruct = this.f92668o;
        String str2 = "poi_page";
        PoiBundle poiBundle = this.f92662i;
        if (poiBundle != null) {
            str = poiBundle.awemeid;
        } else {
            str = null;
        }
        String str3 = str;
        PoiDetail poiDetail = this.f92667n;
        if (poiDetail != null) {
            i = poiDetail.aroundHotPoiCount;
        } else {
            i = 0;
        }
        PoiRouteActivity.m113823a(context, poiStruct, str2, str3, true, i);
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        super.mo61702b(i, i2);
        if (this.f92659P == 0.0f) {
            TextView textView = this.f68830u;
            C7573i.m23582a((Object) textView, "mTitle");
            if (textView.getVisibility() == 0) {
                TextView textView2 = this.f68830u;
                C7573i.m23582a((Object) textView2, "mTitle");
                int bottom = textView2.getBottom();
                View view = this.f68831v;
                C7573i.m23582a((Object) view, "mTitleColorCtrl");
                this.f92659P = (float) (bottom - view.getBottom());
            }
        }
        if (this.f92658O == 0.0f) {
            LinearLayout linearLayout = (LinearLayout) m114069b(R.id.aue);
            C7573i.m23582a((Object) linearLayout, "head_layout");
            int bottom2 = linearLayout.getBottom();
            View view2 = this.f68831v;
            C7573i.m23582a((Object) view2, "mTitleColorCtrl");
            this.f92658O = (float) (bottom2 - view2.getBottom());
        }
        float f = (float) i;
        float f2 = (f - this.f92659P) / (this.f92658O - this.f92659P);
        if (((double) f2) <= 0.2d) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        View view3 = this.f68831v;
        C7573i.m23582a((Object) view3, "mTitleColorCtrl");
        view3.setAlpha(f2);
        View b = m114069b(R.id.dal);
        C7573i.m23582a((Object) b, "status_bar");
        b.setAlpha(f2);
        if (C6399b.m19944t()) {
            TextView textView3 = this.f68830u;
            C7573i.m23582a((Object) textView3, "mTitle");
            textView3.setAlpha(f2);
            LinearLayout linearLayout2 = (LinearLayout) m114069b(R.id.aue);
            C7573i.m23582a((Object) linearLayout2, "head_layout");
            linearLayout2.setAlpha(1.0f - (f / this.f92658O));
            return;
        }
        TextView textView4 = this.f68830u;
        C7573i.m23582a((Object) textView4, "mTitle");
        textView4.setAlpha(f2 * f2 * f2);
        LinearLayout linearLayout3 = (LinearLayout) m114069b(R.id.aue);
        C7573i.m23582a((Object) linearLayout3, "head_layout");
        linearLayout3.setAlpha((float) Math.pow((double) (1.0f - (f / this.f92658O)), 3.0d));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(this.f92664k)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            View b = m114069b(R.id.dal);
            C7573i.m23582a((Object) b, "status_bar");
            LayoutParams layoutParams = b.getLayoutParams();
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                C7573i.m23580a();
            }
            layoutParams.height = C10994a.m32204a((Context) activity2);
        }
        this.f92656M = new C35283l();
        C35283l lVar = this.f92656M;
        if (lVar == null) {
            C7573i.m23583a("mPoiDetailPresenter");
        }
        lVar.mo66537a(this);
        C35283l lVar2 = this.f92656M;
        if (lVar2 == null) {
            C7573i.m23583a("mPoiDetailPresenter");
        }
        lVar2.mo66536a(new C35281k(65441));
        ((AutoRTLImageView) m114069b(R.id.jo)).setOnClickListener(new C35352b(this));
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        ((DmtStatusView) m114069b(R.id.daj)).setBuilder(C10803a.m31631a(getContext()).mo25964b(new C10806a(context).mo25985a((int) R.drawable.b7_).mo25990b((int) R.string.fi5).mo25993c(R.string.fi2).mo25986a(ButtonStyle.BORDER, R.string.fia, new C35355e(this)).f29135a));
        this.f92655L = new C35357b();
        C35357b bVar = this.f92655L;
        if (bVar == null) {
            C7573i.m23583a("mPoiRoutePresenter");
        }
        AmeBaseFragment ameBaseFragment = this;
        MapLayout mapLayout = (MapLayout) m114069b(R.id.cci);
        C7573i.m23582a((Object) mapLayout, "poiMap");
        bVar.mo89928a(ameBaseFragment, mapLayout);
        ((MapLayout) m114069b(R.id.cci)).mo88952a(bundle, this);
        ((MapLayout) m114069b(R.id.cci)).f91774a = this;
        m114069b(R.id.ccj).setOnClickListener(new C35353c(this));
        String str = this.f92665l;
        if (str != null) {
            TextView textView = this.f68830u;
            C7573i.m23582a((Object) textView, "mTitle");
            textView.setText(str);
        }
        m114071f();
        if (!C32640a.m105723a(C6399b.m19921a())) {
            C32640a.m105722a(getActivity(), new C35354d(this));
            ((DmtStatusView) m114069b(R.id.daj)).mo25942f();
            return;
        }
        if (C32640a.m105721a().mo84026b(null) != null) {
            C32640a.m105721a().mo84027b();
        }
        mo29060a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C25713b.m84475a(m114069b(R.id.dal));
        return onCreateView;
    }
}
