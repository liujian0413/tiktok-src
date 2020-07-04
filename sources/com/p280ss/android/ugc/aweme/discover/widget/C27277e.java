package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.C10808d;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.p280ss.android.ugc.aweme.discover.hotspot.p1180ab.HotSpotReverseExperiment;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26575b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27013b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27029ba;
import com.p280ss.android.ugc.aweme.discover.repo.fetcher.C26870c;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.e */
public final class C27277e extends ScrollView implements C10808d {

    /* renamed from: b */
    public static final C27278a f71876b = new C27278a(null);

    /* renamed from: a */
    public HotSearchWordViewHolder f71877a;

    /* renamed from: c */
    private View f71878c;

    /* renamed from: d */
    private C26870c f71879d = new C26870c();

    /* renamed from: e */
    private LinearLayout f71880e;

    /* renamed from: f */
    private DmtDefaultView f71881f;

    /* renamed from: g */
    private C10805b f71882g;

    /* renamed from: h */
    private final int f71883h;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.e$a */
    public static final class C27278a {
        private C27278a() {
        }

        public /* synthetic */ C27278a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.e$b */
    public static final class C27279b implements C27013b {

        /* renamed from: a */
        final /* synthetic */ C27277e f71884a;

        C27279b(C27277e eVar) {
            this.f71884a = eVar;
        }

        /* renamed from: a */
        public final void mo68315a(HotSearchItem hotSearchItem, int i, String str) {
            String str2;
            C7573i.m23587b(hotSearchItem, "item");
            C7573i.m23587b(str, "enterFrom");
            SearchResultParam keyword = new SearchResultParam().setKeyword(hotSearchItem.getWord());
            HotSearchAdData adData = hotSearchItem.getAdData();
            if (adData != null) {
                str2 = adData.getItemIdList();
            } else {
                str2 = null;
            }
            SearchResultParam openNewSearchContainer = keyword.setItemIdList(str2).setRealSearchWord(hotSearchItem.getRealSearchWord()).setSearchFrom(2).setEnterFrom(this.f71884a.getSearchEnterFrom()).setSource("hot_search_section").setOpenNewSearchContainer(!C6399b.m19944t());
            C7573i.m23582a((Object) openNewSearchContainer, "param");
            C42961az.m136380a(new C26575b(openNewSearchContainer));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.e$c */
    static final class C27280c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C27280c f71885a = new C27280c();

        C27280c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m89332a((HotSearchListResponse) obj);
        }

        /* renamed from: a */
        private static List<HotSearchItem> m89332a(HotSearchListResponse hotSearchListResponse) {
            C7573i.m23587b(hotSearchListResponse, "it");
            HotSearchEntity data = hotSearchListResponse.getData();
            C7573i.m23582a((Object) data, "it.data");
            return data.getList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.e$d */
    public static final class C27281d implements C47557ad<List<HotSearchItem>> {

        /* renamed from: a */
        final /* synthetic */ C27277e f71886a;

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C27281d(C27277e eVar) {
            this.f71886a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(List<HotSearchItem> list) {
            C7573i.m23587b(list, "t");
            if (this.f71886a.isAttachedToWindow()) {
                HotSearchWordViewHolder hotSearchWordViewHolder = this.f71886a.f71877a;
                if (hotSearchWordViewHolder != null) {
                    hotSearchWordViewHolder.mo67914a(list);
                }
            }
        }
    }

    public final int getPageIndex() {
        return this.f71883h;
    }

    /* renamed from: c */
    private static boolean m89327c() {
        if (!C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    private final String getHotSearchEnterFrom() {
        if (this.f71883h == C27029ba.f71319a) {
            return "general_search";
        }
        return "search_result";
    }

    public final String getSearchEnterFrom() {
        int i = this.f71883h;
        if (i == C27029ba.f71319a) {
            return "hot_search_general_search";
        }
        if (i == C27029ba.f71320b) {
            return "hot_search_video_search";
        }
        return "";
    }

    /* renamed from: b */
    private final boolean m89326b() {
        if ((this.f71883h == C27029ba.f71319a || this.f71883h == C27029ba.f71320b) && m89327c() && C6384b.m19835a().mo15287a(HotSpotReverseExperiment.class, true, "disable_hot_spot", C6384b.m19835a().mo15295d().disable_hot_spot, 0) != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final View m89329e() {
        View view = new View(getContext());
        view.setBackgroundColor(getResources().getColor(R.color.lg));
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, C23486n.m77122a(0.5d));
        marginLayoutParams.leftMargin = C23486n.m77122a(16.0d);
        marginLayoutParams.rightMargin = C23486n.m77122a(16.0d);
        view.setLayoutParams(marginLayoutParams);
        return view;
    }

    /* renamed from: f */
    private final void m89330f() {
        C7319aa.m22929a((C7496w<? extends T>) this.f71879d.mo29357c(Integer.valueOf(0))).mo19134b((C7327h<? super T, ? extends R>) C27280c.f71885a).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C27281d<Object>(this));
    }

    /* renamed from: a */
    private final void m89325a() {
        int i;
        this.f71881f = new DmtDefaultView(getContext());
        C10805b bVar = new C10806a(getContext()).mo25985a((int) R.drawable.b7c).mo25990b((int) R.string.fic).mo25993c(R.string.fid).f29135a;
        C7573i.m23582a((Object) bVar, "DmtDefaultStatus.Builder…\n                .build()");
        this.f71882g = bVar;
        if (m89327c()) {
            i = C23486n.m77122a(380.0d);
        } else {
            i = -1;
        }
        DmtDefaultView dmtDefaultView = this.f71881f;
        if (dmtDefaultView == null) {
            C7573i.m23583a("emptyDefaultView");
        }
        dmtDefaultView.setLayoutParams(new LayoutParams(-1, i));
        DmtDefaultView dmtDefaultView2 = this.f71881f;
        if (dmtDefaultView2 == null) {
            C7573i.m23583a("emptyDefaultView");
        }
        C10805b bVar2 = this.f71882g;
        if (bVar2 == null) {
            C7573i.m23583a("mStatus");
        }
        dmtDefaultView2.setStatus(bVar2);
        LinearLayout linearLayout = this.f71880e;
        DmtDefaultView dmtDefaultView3 = this.f71881f;
        if (dmtDefaultView3 == null) {
            C7573i.m23583a("emptyDefaultView");
        }
        linearLayout.addView(dmtDefaultView3);
    }

    /* renamed from: d */
    private final void m89328d() {
        this.f71877a = HotSearchWordViewHolder.m86844a(this, getHotSearchEnterFrom(), new C27279b(this));
        this.f71880e.addView(m89329e());
        HotSearchWordViewHolder hotSearchWordViewHolder = this.f71877a;
        if (hotSearchWordViewHolder == null) {
            C7573i.m23580a();
        }
        this.f71878c = hotSearchWordViewHolder.itemView;
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -2);
        marginLayoutParams.bottomMargin = C23486n.m77122a(24.0d);
        LinearLayout linearLayout = this.f71880e;
        HotSearchWordViewHolder hotSearchWordViewHolder2 = this.f71877a;
        if (hotSearchWordViewHolder2 == null) {
            C7573i.m23580a();
        }
        linearLayout.addView(hotSearchWordViewHolder2.itemView, marginLayoutParams);
    }

    public final void setStatus(C10805b bVar) {
        C7573i.m23587b(bVar, "status");
        DmtDefaultView dmtDefaultView = this.f71881f;
        if (dmtDefaultView == null) {
            C7573i.m23583a("emptyDefaultView");
        }
        dmtDefaultView.setStatus(bVar);
        this.f71882g = bVar;
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        C7573i.m23587b(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (C7573i.m23585a((Object) view, (Object) this) && i == 0 && m89326b()) {
            m89330f();
        }
    }

    public C27277e(Context context, int i) {
        C7573i.m23587b(context, "context");
        super(context);
        this.f71883h = i;
        this.f71880e = new LinearLayout(context);
        setFillViewport(true);
        this.f71880e.setOrientation(1);
        this.f71880e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f71880e);
        m89325a();
        if (m89326b()) {
            m89328d();
        }
    }
}
