package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.vast.p673a.C13015c;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.crossplatform.RNPreloadHelper;
import com.p280ss.android.ugc.aweme.crossplatform.RNPreloadHelper.C25807a;
import com.p280ss.android.ugc.aweme.crossplatform.RNPreloadHelper.PreloadResult;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26027e;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.discover.abtest.RNViewDestroyExperiment;
import com.p280ss.android.ugc.aweme.discover.abtest.RNViewPrerenderExperiment;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26584k;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27075b;
import com.p280ss.android.ugc.aweme.discover.presenter.C26819e;
import com.p280ss.android.ugc.aweme.discover.presenter.SearchIntermediateDataPreload;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C27244a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.RNSingleIntermediateFragment */
public final class RNSingleIntermediateFragment extends AmeBaseFragment {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f71072e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RNSingleIntermediateFragment.class), "mBaseUrl", "getMBaseUrl()Ljava/lang/String;"))};

    /* renamed from: h */
    public static final C26927a f71073h = new C26927a(null);

    /* renamed from: f */
    protected SearchIntermediateViewModel f71074f;

    /* renamed from: g */
    public boolean f71075g;

    /* renamed from: i */
    private CrossPlatformWebView f71076i;

    /* renamed from: j */
    private C27075b f71077j;

    /* renamed from: k */
    private final C7541d f71078k = C7546e.m23569a(C26931d.f71081a);

    /* renamed from: l */
    private HashMap f71079l;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.RNSingleIntermediateFragment$a */
    public static final class C26927a {

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.RNSingleIntermediateFragment$a$a */
        public static final class C26928a implements C25807a {
            C26928a() {
            }

            /* renamed from: a */
            public final C26027e mo67080a(String str) {
                C7573i.m23587b(str, "baseUrl");
                AwemeApplication c = AwemeApplication.m21344c();
                C7573i.m23582a((Object) c, "AwemeApplication.getInst()");
                return new C26027e(str, c);
            }
        }

        private C26927a() {
        }

        /* renamed from: a */
        public static String m88470a() {
            String str = "";
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                FeConfigCollection feConfigCollection = a.getFeConfigCollection();
                C7573i.m23582a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
                FEConfig searchTransfer = feConfigCollection.getSearchTransfer();
                C7573i.m23582a((Object) searchTransfer, "SettingsReader.get().feC…Collection.searchTransfer");
                String schema = searchTransfer.getSchema();
                C7573i.m23582a((Object) schema, "SettingsReader.get().feC…ion.searchTransfer.schema");
                str = schema;
            } catch (Exception unused) {
            }
            if (C13015c.m37973a(str)) {
                return "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fdouyin%2Fsearch_transfer%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_search_transfer%26bundle%3Dindex.js%26module_name%3Dpage_search_transfer%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1";
            }
            return str;
        }

        /* renamed from: b */
        public final PreloadResult mo69650b() {
            return RNPreloadHelper.m84812a(m88470a(), m88472a(m88470a(), C7507ae.m23400b((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("is_cached_view", "1")})), (C25807a) new C26928a());
        }

        public /* synthetic */ C26927a(C7571f fVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static String m88472a(String str, Map<String, String> map) {
            String str2;
            String str3;
            String str4;
            String str5;
            C7573i.m23587b(str, "url");
            C33787a a = C33786f.m108941a(str);
            String str6 = "gs_preload";
            if (C26819e.f70769b.mo69480b()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            a.mo86195a(str6, str2);
            String str7 = "is_full_screen";
            if (C21085a.m71117a().f56622i) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            a.mo86195a(str7, str3);
            String str8 = "is_prerender";
            if (C6384b.m19835a().mo15287a(RNViewPrerenderExperiment.class, true, "search_transfer_is_prerender", C6384b.m19835a().mo15295d().search_transfer_is_prerender, 0) == 1) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            a.mo86195a(str8, str4);
            String str9 = "is_not_destroy";
            if (C6384b.m19835a().mo15287a(RNViewDestroyExperiment.class, true, "search_transfer_is_not_destroy", C6384b.m19835a().mo15295d().search_transfer_is_not_destroy, 0) == 1) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            a.mo86195a(str9, str5);
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    a.mo86195a((String) entry.getKey(), (String) entry.getValue());
                }
            }
            String uri = a.mo86194a().toString();
            C7573i.m23582a((Object) uri, "scheme.build().toString()");
            return uri;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.RNSingleIntermediateFragment$b */
    static final class C26929b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ RNSingleIntermediateFragment f71080a;

        C26929b(RNSingleIntermediateFragment rNSingleIntermediateFragment) {
            this.f71080a = rNSingleIntermediateFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m88475a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88475a() {
            if (!C26654b.m87576d()) {
                return;
            }
            if (C6384b.m19835a().mo15287a(RNViewPrerenderExperiment.class, true, "search_transfer_is_prerender", C6384b.m19835a().mo15295d().search_transfer_is_prerender, 0) == 1 || C6384b.m19835a().mo15287a(RNViewDestroyExperiment.class, true, "search_transfer_is_not_destroy", C6384b.m19835a().mo15295d().search_transfer_is_not_destroy, 0) == 1) {
                this.f71080a.f71075g = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.RNSingleIntermediateFragment$c */
    public static final class C26930c implements OnAttachStateChangeListener {
        C26930c() {
        }

        public final void onViewAttachedToWindow(View view) {
            C7573i.m23587b(view, "v");
            C27064b.m88834a(System.currentTimeMillis());
        }

        public final void onViewDetachedFromWindow(View view) {
            C7573i.m23587b(view, "v");
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.RNSingleIntermediateFragment$d */
    static final class C26931d extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C26931d f71081a = new C26931d();

        C26931d() {
            super(0);
        }

        /* renamed from: a */
        private static String m88476a() {
            return C26927a.m88470a();
        }

        public final /* synthetic */ Object invoke() {
            return m88476a();
        }
    }

    /* renamed from: d */
    private final String m88465d() {
        return (String) this.f71078k.getValue();
    }

    /* renamed from: g */
    private void m88468g() {
        if (this.f71079l != null) {
            this.f71079l.clear();
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            CrossPlatformWebView crossPlatformWebView = this.f71076i;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("mWebView");
            }
            crossPlatformWebView.mo67491f(activity2);
        }
        m88468g();
    }

    public final void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            CrossPlatformWebView crossPlatformWebView = this.f71076i;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("mWebView");
            }
            crossPlatformWebView.mo67488d(activity2);
        }
    }

    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            CrossPlatformWebView crossPlatformWebView = this.f71076i;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("mWebView");
            }
            crossPlatformWebView.mo67484c(activity2);
        }
    }

    public final void onStart() {
        super.onStart();
        CrossPlatformWebView crossPlatformWebView = this.f71076i;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("mWebView");
        }
        m88464a(crossPlatformWebView.getCurrentUrl());
    }

    /* renamed from: a */
    public final void mo69648a() {
        if (isViewValid()) {
            CrossPlatformWebView crossPlatformWebView = this.f71076i;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("mWebView");
            }
            String str = "search_middle_refresh";
            JSONObject f = m88467f();
            CrossPlatformWebView crossPlatformWebView2 = this.f71076i;
            if (crossPlatformWebView2 == null) {
                C7573i.m23583a("mWebView");
            }
            crossPlatformWebView.mo67473a(str, f, crossPlatformWebView2.getReactId());
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C7705c.m23799a().mo20393c((Object) this);
        C27075b bVar = this.f71077j;
        if (bVar != null) {
            bVar.mo69866b();
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            CrossPlatformWebView crossPlatformWebView = this.f71076i;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("mWebView");
            }
            crossPlatformWebView.mo67493g(activity2);
        }
    }

    /* renamed from: f */
    private JSONObject m88467f() {
        Object obj;
        String str;
        SearchEnterParam b = C27244a.m89253b(getActivity());
        String str2 = null;
        if (b != null) {
            obj = b.getEnterSearchFrom();
        } else {
            obj = null;
        }
        if (C7573i.m23585a(obj, (Object) "homepage_hot")) {
            str = "magnify";
        } else {
            str = "result";
        }
        if (b != null) {
            str2 = b.consumeGid();
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71074f;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("mIntermediateViewModel");
        }
        Integer num = (Integer) searchIntermediateViewModel.getSearchTabIndex().getValue();
        if (num == null) {
            num = Integer.valueOf(0);
        }
        C7573i.m23582a((Object) num, "mIntermediateViewModel.searchTabIndex.value ?: 0");
        int intValue = num.intValue();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("placeholder_keyword", "");
        jSONObject.put("gid", str2);
        jSONObject.put("index", intValue);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", jSONObject);
        return jSONObject2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m88466e() {
        /*
            r5 = this;
            android.support.v4.app.FragmentActivity r0 = r5.getActivity()
            com.ss.android.ugc.aweme.search.model.SearchEnterParam r0 = com.p280ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C27244a.m89253b(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.getEnterSearchFrom()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            java.lang.String r2 = "homepage_hot"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = "magnify"
            goto L_0x001e
        L_0x001c:
            java.lang.String r0 = "result"
        L_0x001e:
            com.ss.android.ugc.aweme.discover.ui.RNSingleIntermediateFragment$a r2 = f71073h
            java.lang.String r3 = r5.m88465d()
            r4 = 2
            java.lang.String r1 = com.p280ss.android.ugc.aweme.discover.p1185ui.RNSingleIntermediateFragment.C26927a.m88472a(r3, null)
            com.ss.android.ugc.aweme.music.c.f$a r1 = com.p280ss.android.ugc.aweme.music.p1409c.C33786f.m108941a(r1)
            java.lang.String r2 = "enter_from"
            r1.mo86195a(r2, r0)
            java.lang.String r0 = "gid"
            android.support.v4.app.FragmentActivity r2 = r5.getActivity()
            com.ss.android.ugc.aweme.search.model.SearchEnterParam r2 = com.p280ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel.C27244a.m89253b(r2)
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = r2.consumeGid()
            if (r2 != 0) goto L_0x0046
        L_0x0044:
            java.lang.String r2 = ""
        L_0x0046:
            r1.mo86195a(r0, r2)
            java.lang.String r0 = "is_cached_view"
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = r5.f71076i
            if (r2 != 0) goto L_0x0054
            java.lang.String r3 = "mWebView"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0054:
            boolean r2 = r2 instanceof com.p280ss.android.ugc.aweme.crossplatform.view.C26027e
            if (r2 == 0) goto L_0x005b
            java.lang.String r2 = "1"
            goto L_0x005d
        L_0x005b:
            java.lang.String r2 = "0"
        L_0x005d:
            r1.mo86195a(r0, r2)
            m88463a(r1)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r5.f71076i
            if (r0 != 0) goto L_0x006c
            java.lang.String r2 = "mWebView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x006c:
            r2 = 0
            r0.setVisibility(r2)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r5.f71076i
            if (r0 != 0) goto L_0x0079
            java.lang.String r3 = "mWebView"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0079:
            android.net.Uri r1 = r1.mo86194a()
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "scheme.build().toString()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            r0.mo67475a(r1, r2, r2)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r5.f71076i
            if (r0 != 0) goto L_0x0092
            java.lang.String r1 = "mWebView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0092:
            com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b.m88845d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1185ui.RNSingleIntermediateFragment.m88466e():void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C0063u a = C0069x.m159a(activity).mo147a(SearchIntermediateViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f71074f = (SearchIntermediateViewModel) a;
        C7705c.m23799a().mo20389a((Object) this);
    }

    /* renamed from: a */
    private static void m88463a(C33787a aVar) {
        if (C26654b.m87576d()) {
            int a = C6384b.m19835a().mo15287a(RNViewPrerenderExperiment.class, true, "search_transfer_is_prerender", C6384b.m19835a().mo15295d().search_transfer_is_prerender, 0);
            int a2 = C6384b.m19835a().mo15287a(RNViewDestroyExperiment.class, true, "search_transfer_is_not_destroy", C6384b.m19835a().mo15295d().search_transfer_is_not_destroy, 0);
            boolean a3 = C6384b.m19835a().mo15292a(SearchIntermediateDataPreload.class, true, "rn_search_transfer_preload_data", C6384b.m19835a().mo15295d().rn_search_transfer_preload_data, true);
            StringBuilder sb = new StringBuilder("search_transfer_");
            sb.append(a);
            sb.append(a2);
            sb.append(a3 ? 1 : 0);
            aVar.mo86195a("hybrid_report_source", sb.toString());
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onMessageEvent(C26584k kVar) {
        C7573i.m23587b(kVar, "event");
        if (C7573i.m23585a((Object) kVar.f70110b, (Object) "history")) {
            SearchResultParam openNewSearchContainer = new SearchResultParam().setKeyword(kVar.f70109a.getWord()).setSearchFrom(1).setEnterFrom("search_history").setOpenNewSearchContainer(true ^ C6399b.m19944t());
            SearchIntermediateViewModel searchIntermediateViewModel = this.f71074f;
            if (searchIntermediateViewModel == null) {
                C7573i.m23583a("mIntermediateViewModel");
            }
            C7573i.m23582a((Object) openNewSearchContainer, "param");
            searchIntermediateViewModel.openSearch(openNewSearchContainer);
            return;
        }
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f71074f;
        if (searchIntermediateViewModel2 == null) {
            C7573i.m23583a("mIntermediateViewModel");
        }
        searchIntermediateViewModel2.handleGuessWordItemClick(kVar.f70109a, 0);
    }

    /* renamed from: a */
    private final void m88462a(View view) {
        RNPreloadHelper rNPreloadHelper = RNPreloadHelper.f68232a;
        String d = m88465d();
        View findViewById = view.findViewById(R.id.egh);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.webview)");
        this.f71076i = rNPreloadHelper.mo67079a(d, (CrossPlatformWebView) findViewById, (C7561a<C7581n>) new C26929b<C7581n>(this));
        CrossPlatformWebView crossPlatformWebView = this.f71076i;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("mWebView");
        }
        C27064b.m88835a(crossPlatformWebView);
        FragmentActivity activity = getActivity();
        if (!(activity instanceof Activity)) {
            activity = null;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            CrossPlatformWebView crossPlatformWebView2 = this.f71076i;
            if (crossPlatformWebView2 == null) {
                C7573i.m23583a("mWebView");
            }
            crossPlatformWebView2.mo67490e(activity2);
        }
        CrossPlatformWebView crossPlatformWebView3 = this.f71076i;
        if (crossPlatformWebView3 == null) {
            C7573i.m23583a("mWebView");
        }
        crossPlatformWebView3.setSearchEnterParam(C27244a.m89253b(getActivity()));
        CrossPlatformWebView crossPlatformWebView4 = this.f71076i;
        if (crossPlatformWebView4 == null) {
            C7573i.m23583a("mWebView");
        }
        crossPlatformWebView4.addOnAttachStateChangeListener(new C26930c());
        CrossPlatformWebView crossPlatformWebView5 = this.f71076i;
        if (crossPlatformWebView5 == null) {
            C7573i.m23583a("mWebView");
        }
        this.f71077j = new C27075b(crossPlatformWebView5, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (r1 == false) goto L_0x004f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m88464a(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r0 = "rn_schema"
            java.lang.String r0 = r5.getQueryParameter(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r0 = 0
            goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            java.lang.String r0 = r5.getScheme()
            java.lang.String r3 = "http"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = r5.getScheme()
            java.lang.String r3 = "https"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "url"
            java.lang.String r5 = r5.getQueryParameter(r0)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x004c
            int r5 = r5.length()
            if (r5 != 0) goto L_0x004d
        L_0x004c:
            r1 = 1
        L_0x004d:
            if (r1 != 0) goto L_0x006d
        L_0x004f:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r5 = r4.f71076i
            if (r5 != 0) goto L_0x0058
            java.lang.String r0 = "mWebView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0058:
            android.view.ViewParent r5 = r5.getParent()
        L_0x005c:
            if (r5 == 0) goto L_0x006d
            boolean r0 = r5 instanceof com.p280ss.android.ugc.aweme.discover.p1185ui.NestedWebScrollView
            if (r0 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.discover.ui.NestedWebScrollView r5 = (com.p280ss.android.ugc.aweme.discover.p1185ui.NestedWebScrollView) r5
            r5.setWebViewDisplaying(r2)
            return
        L_0x0068:
            android.view.ViewParent r5 = r5.getParent()
            goto L_0x005c
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1185ui.RNSingleIntermediateFragment.m88464a(java.lang.String):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f71075g) {
            f71073h.mo69650b();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.ql, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        m88462a(inflate);
        m88466e();
        return inflate;
    }
}
