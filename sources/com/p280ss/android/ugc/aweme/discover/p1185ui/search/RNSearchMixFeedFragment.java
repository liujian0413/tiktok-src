package com.p280ss.android.ugc.aweme.discover.p1185ui.search;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchBaseFragment;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27076c;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.RNSearchMixFeedFragment */
public final class RNSearchMixFeedFragment extends SearchBaseFragment {

    /* renamed from: e */
    public InterceptCrossPlatformWebView f71394e;

    /* renamed from: f */
    private HashMap f71395f;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.RNSearchMixFeedFragment$a */
    static final class C27062a<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ RNSearchMixFeedFragment f71396a;

        C27062a(RNSearchMixFeedFragment rNSearchMixFeedFragment) {
            this.f71396a = rNSearchMixFeedFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null && num.intValue() == 3) {
                InterceptCrossPlatformWebView interceptCrossPlatformWebView = this.f71396a.f71394e;
                if (interceptCrossPlatformWebView != null) {
                    FragmentActivity activity = this.f71396a.getActivity();
                    if (activity != null) {
                        interceptCrossPlatformWebView.mo67488d(activity);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
            } else if (num != null && num.intValue() == 2) {
                InterceptCrossPlatformWebView interceptCrossPlatformWebView2 = this.f71396a.f71394e;
                if (interceptCrossPlatformWebView2 != null) {
                    FragmentActivity activity2 = this.f71396a.getActivity();
                    if (activity2 != null) {
                        interceptCrossPlatformWebView2.mo67484c((Activity) activity2);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }
    }

    /* renamed from: a */
    public final View mo68429a(int i) {
        if (this.f71395f == null) {
            this.f71395f = new HashMap();
        }
        View view = (View) this.f71395f.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71395f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo68430g() {
        if (this.f71395f != null) {
            this.f71395f.clear();
        }
    }

    /* renamed from: k */
    public final String mo68437k() {
        return "general_search";
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C27063a.m88823a(null);
        mo68430g();
    }

    /* renamed from: d */
    private final void m88815d() {
        String str;
        InterceptCrossPlatformWebView interceptCrossPlatformWebView = this.f71394e;
        if (interceptCrossPlatformWebView != null) {
            String c = C27076c.m88873c();
            JSONObject e = m88816e();
            InterceptCrossPlatformWebView interceptCrossPlatformWebView2 = this.f71394e;
            if (interceptCrossPlatformWebView2 != null) {
                str = interceptCrossPlatformWebView2.getReactId();
            } else {
                str = null;
            }
            interceptCrossPlatformWebView.mo67473a(c, e, str);
        }
    }

    public final void onPause() {
        super.onPause();
        InterceptCrossPlatformWebView interceptCrossPlatformWebView = this.f71394e;
        if (interceptCrossPlatformWebView != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                interceptCrossPlatformWebView.mo67488d(activity);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public final void onResume() {
        super.onResume();
        InterceptCrossPlatformWebView interceptCrossPlatformWebView = this.f71394e;
        if (interceptCrossPlatformWebView != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                interceptCrossPlatformWebView.mo67484c((Activity) activity);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: e */
    private final JSONObject m88816e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enterFrom", "");
        jSONObject.put("searchFrom", 0);
        jSONObject.put(POIService.KEY_KEYWORD, this.f71090i);
        jSONObject.put("enter_method", this.f71094m);
        return jSONObject;
    }

    /* renamed from: a */
    private final void m88813a() {
        String str = "";
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            FeConfigCollection feConfigCollection = a.getFeConfigCollection();
            C7573i.m23582a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
            FEConfig generalSearch = feConfigCollection.getGeneralSearch();
            C7573i.m23582a((Object) generalSearch, "SettingsReader.get().feC…gCollection.generalSearch");
            String schema = generalSearch.getSchema();
            C7573i.m23582a((Object) schema, "SettingsReader.get().feC…tion.generalSearch.schema");
            str = schema;
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fdouyin%2Fgeneral_search%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_general_search%26bundle%3Dindex.js%26module_name%3Dpage_general_search%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1%26dynamic%3D1";
        }
        C33787a a2 = C33786f.m108941a(str);
        a2.mo86195a(POIService.KEY_KEYWORD, this.f71090i);
        a2.mo86195a("enter_method", this.f71094m);
        InterceptCrossPlatformWebView interceptCrossPlatformWebView = this.f71394e;
        if (interceptCrossPlatformWebView != null) {
            interceptCrossPlatformWebView.setVisibility(0);
        }
        InterceptCrossPlatformWebView interceptCrossPlatformWebView2 = this.f71394e;
        if (interceptCrossPlatformWebView2 != null) {
            String uri = a2.mo86194a().toString();
            C7573i.m23582a((Object) uri, "scheme.build().toString()");
            interceptCrossPlatformWebView2.mo67475a(uri, false, false);
        }
    }

    /* renamed from: c */
    public final void mo69655c(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "searchResultParam");
        super.mo69655c(searchResultParam);
        m88814a(searchResultParam);
        m88815d();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(SearchBaseFragment.f71083r);
            if (serializable != null) {
                m88814a((SearchResultParam) serializable);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            InterceptCrossPlatformWebView interceptCrossPlatformWebView = this.f71394e;
            if (interceptCrossPlatformWebView != null) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    interceptCrossPlatformWebView.mo67484c((Activity) activity);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        } else {
            InterceptCrossPlatformWebView interceptCrossPlatformWebView2 = this.f71394e;
            if (interceptCrossPlatformWebView2 != null) {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    interceptCrossPlatformWebView2.mo67488d(activity2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    /* renamed from: a */
    private void m88814a(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "param");
        mo69653b(searchResultParam);
        String keyword = searchResultParam.getKeyword();
        C7573i.m23582a((Object) keyword, "param.keyword");
        mo69654b(keyword);
        this.f71093l = searchResultParam.getSearchFrom();
        if (8 == this.f71093l) {
            this.f71097p = 0;
        } else {
            this.f71097p = 1;
        }
        String enterFrom = searchResultParam.getEnterFrom();
        C7573i.m23582a((Object) enterFrom, "param.enterFrom");
        mo69657d(enterFrom);
        if (this.f71093l == 2 || this.f71093l == 5) {
            String keyword2 = searchResultParam.getKeyword();
            C7573i.m23582a((Object) keyword2, "param.keyword");
            mo69656c(keyword2);
        }
        C27063a.m88822a(this.f71090i);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.qk, viewGroup, false);
        this.f71394e = (InterceptCrossPlatformWebView) inflate.findViewById(R.id.egh);
        m88813a();
        C27063a.m88823a(new WeakReference<>(this.f71394e));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        ((SearchStateViewModel) C0069x.m159a(activity).mo147a(SearchStateViewModel.class)).searchState.observe(this, new C27062a(this));
        return inflate;
    }
}
