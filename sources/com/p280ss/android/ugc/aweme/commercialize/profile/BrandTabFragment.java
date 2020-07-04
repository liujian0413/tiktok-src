package com.p280ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.profile.model.BrandTab;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.BrandTabFragment */
public final class BrandTabFragment extends ProfileListFragment {

    /* renamed from: g */
    public static final C25034a f66048g = new C25034a(null);

    /* renamed from: e */
    public BrandTab f66049e;

    /* renamed from: f */
    public boolean f66050f;

    /* renamed from: h */
    private BrandTabAdapter f66051h;

    /* renamed from: i */
    private String f66052i;

    /* renamed from: j */
    private HashMap f66053j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.BrandTabFragment$a */
    public static final class C25034a {
        private C25034a() {
        }

        public /* synthetic */ C25034a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    private View m82431b(int i) {
        if (this.f66053j == null) {
            this.f66053j = new HashMap();
        }
        View view = (View) this.f66053j.get(Integer.valueOf(R.id.cqp));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.cqp);
            this.f66053j.put(Integer.valueOf(R.id.cqp), view);
        }
        return view;
    }

    /* renamed from: i */
    private void m82432i() {
        if (this.f66053j != null) {
            this.f66053j.clear();
        }
    }

    public final boolean aO_() {
        return true;
    }

    public final void aT_() {
    }

    /* renamed from: j */
    public final View mo61750j() {
        return (EnterpriseRecyclerView) m82431b(R.id.cqp);
    }

    public final void aS_() {
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82431b(R.id.cqp);
        if (enterpriseRecyclerView != null) {
            C1273i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo5437e(0);
            }
        }
    }

    /* renamed from: g */
    public final String mo65509g() {
        boolean z;
        BrandTab brandTab = this.f66049e;
        if (brandTab != null) {
            String title = brandTab.getTitle();
            if (title != null) {
                if (title.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    BrandTab brandTab2 = this.f66049e;
                    if (brandTab2 != null) {
                        return brandTab2.getTitle();
                    }
                    return null;
                }
            }
        }
        return C23481i.m77089a().getString(R.string.b1h);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82431b(R.id.cqp);
        if (enterpriseRecyclerView != null) {
            C1273i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c = layoutManager.mo5432c(0);
                if (c != null) {
                    if (c != null) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) c;
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            C7573i.m23580a();
                        }
                        crossPlatformWebView.mo67493g(activity);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
                    }
                }
            }
        }
        C42961az.m136383d(this);
        m82432i();
    }

    public final void onPause() {
        super.onPause();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82431b(R.id.cqp);
        if (enterpriseRecyclerView != null) {
            C1273i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c = layoutManager.mo5432c(0);
                if (c != null) {
                    if (c != null) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) c;
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            C7573i.m23580a();
                        }
                        C7573i.m23582a((Object) activity, "activity!!");
                        crossPlatformWebView.mo67488d(activity);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82431b(R.id.cqp);
        if (enterpriseRecyclerView != null) {
            C1273i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c = layoutManager.mo5432c(0);
                if (c != null) {
                    if (c != null) {
                        CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) c;
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            C7573i.m23580a();
                        }
                        C7573i.m23582a((Object) activity, "activity!!");
                        crossPlatformWebView.mo67484c((Activity) activity);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r2 == null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void aQ_() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ Exception -> 0x0017 }
            java.lang.String r1 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ Exception -> 0x0017 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.DouyinFeBusiness r0 = r0.getDouyinFeBusiness()     // Catch:{ Exception -> 0x0017 }
            java.lang.String r1 = "SettingsReader.get().douyinFeBusiness"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ Exception -> 0x0017 }
            java.lang.String r0 = r0.getBrandTab()     // Catch:{ Exception -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            java.lang.String r0 = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fpage_challenge_car%2FcarList%3Fhide_nav_bar%3D1%26module_name%3Dpage_challenge_car_list%26loading_bgcolor%3D161823%26hide_source%3D1&hide_nav_bar=1&module_name=page_challenge_car_list&loading_bgcolor=161823&hide_source=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_rn_lyon_challenge_brand_tab%26bundle%3Dindex.js%26module_name%3Dpage_challenge_car_list%26loading_bgcolor%3D161823%26hide_nav_bar%3D1"
        L_0x0019:
            java.lang.String r1 = "rawUrl"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.music.c.f$a r0 = com.p280ss.android.ugc.aweme.music.p1409c.C33786f.m108941a(r0)
            com.ss.android.ugc.aweme.utils.dz r1 = com.p280ss.android.ugc.aweme.utils.C43077dz.m136657a()
            java.lang.String r2 = r4.f66052i
            java.lang.String r1 = r1.mo104733b(r2)
            java.lang.String r2 = "user_id"
            java.lang.String r3 = r4.f66052i
            if (r3 != 0) goto L_0x0035
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0035:
            r0.mo86195a(r2, r3)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = "sec_user_id"
            if (r1 != 0) goto L_0x0048
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0048:
            r0.mo86195a(r2, r1)
        L_0x004b:
            java.lang.String r1 = "industry_type"
            com.ss.android.ugc.aweme.profile.model.BrandTab r2 = r4.f66049e
            if (r2 == 0) goto L_0x005b
            int r2 = r2.getIndustryType()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r2 != 0) goto L_0x005d
        L_0x005b:
            java.lang.String r2 = "0"
        L_0x005d:
            r0.mo86195a(r1, r2)
            android.net.Uri r0 = r0.mo86194a()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "urlBuilder.build().toString()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.commercialize.profile.BrandTabAdapter r1 = r4.f66051h
            if (r1 == 0) goto L_0x0074
            r1.mo65508a(r0)
        L_0x0074:
            com.ss.android.ugc.aweme.commercialize.profile.BrandTabAdapter r0 = r4.f66051h
            if (r0 == 0) goto L_0x007c
            r0.notifyDataSetChanged()
            return
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.profile.BrandTabFragment.aQ_():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d1 A[RETURN] */
    @org.greenrobot.eventbus.C7709l(mo20400a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void top(com.p280ss.android.ugc.aweme.p1216fe.method.C27994k r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            com.google.gson.n r0 = new com.google.gson.n
            r0.<init>()
            org.json.JSONObject r6 = r6.f73730b
            java.lang.String r6 = r6.toString()
            com.google.gson.k r6 = r0.mo47346a(r6)
            java.lang.String r0 = "JsonParser().parse(event.params.toString())"
            kotlin.jvm.internal.C7573i.m23582a(r6, r0)
            com.google.gson.m r6 = r6.mo16136m()
            java.lang.String r0 = "data"
            com.google.gson.k r0 = r6.mo16149b(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0058
            boolean r3 = r0.mo16135l()
            if (r3 == 0) goto L_0x002e
            goto L_0x0058
        L_0x002e:
            com.google.gson.m r0 = r0.mo16136m()
            java.lang.String r3 = "reactId"
            com.google.gson.k r0 = r0.mo16149b(r3)
            if (r0 == 0) goto L_0x0058
            boolean r3 = r0.mo16135l()
            if (r3 == 0) goto L_0x0041
            goto L_0x0058
        L_0x0041:
            java.lang.String r0 = r0.mo15998c()
            com.ss.android.ugc.aweme.commercialize.profile.BrandTabAdapter r3 = r5.f66051h
            if (r3 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r3.f66044a
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = r3.getReactId()
            goto L_0x0053
        L_0x0052:
            r3 = r1
        L_0x0053:
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r3 = r0.booleanValue()
            if (r3 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r0 = r1
        L_0x0065:
            if (r0 == 0) goto L_0x00d1
            r0.booleanValue()
            java.lang.String r0 = "eventName"
            com.google.gson.k r6 = r6.mo16149b(r0)
            if (r6 == 0) goto L_0x00d0
            java.lang.String r6 = r6.mo15998c()
            if (r6 == 0) goto L_0x00d0
            java.lang.String r0 = "mp_tab_top_arrived"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r6, r0)
            r3 = 1
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "mp_tab_top_left"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r6, r0)
            if (r0 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r0 = 0
            goto L_0x008d
        L_0x008c:
            r0 = 1
        L_0x008d:
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r6 = r1
        L_0x0091:
            if (r6 == 0) goto L_0x00d0
            int r0 = r6.hashCode()
            r1 = -917484739(0xffffffffc9504b3d, float:-853171.8)
            r4 = 2131301005(0x7f09128d, float:1.8220056E38)
            if (r0 == r1) goto L_0x00ba
            r1 = -853202121(0xffffffffcd252b37, float:-1.73192048E8)
            if (r0 == r1) goto L_0x00a5
            goto L_0x00cf
        L_0x00a5:
            java.lang.String r0 = "mp_tab_top_left"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00cf
            android.view.View r6 = r5.m82431b(r4)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r6 = (com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r6
            com.ss.android.ugc.aweme.commercialize.profile.a r6 = r6.getEnterTabManager()
            r6.f66069a = r2
            goto L_0x00cf
        L_0x00ba:
            java.lang.String r0 = "mp_tab_top_arrived"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00cf
            android.view.View r6 = r5.m82431b(r4)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r6 = (com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r6
            com.ss.android.ugc.aweme.commercialize.profile.a r6 = r6.getEnterTabManager()
            r6.f66069a = r3
            goto L_0x00d0
        L_0x00cf:
            return
        L_0x00d0:
            return
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.profile.BrandTabFragment.top(com.ss.android.ugc.aweme.fe.method.k):void");
    }

    /* renamed from: a */
    public final void mo65501a(String str, String str2) {
        super.mo65501a(str, str2);
        this.f66052i = str;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82431b(R.id.cqp);
        C7573i.m23582a((Object) enterpriseRecyclerView, "recycler_view");
        enterpriseRecyclerView.setLayoutManager(new BrandTabFragment$onViewCreated$1(this, getActivity(), 0, false));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        this.f66051h = new BrandTabAdapter(activity, null, this.f66050f);
        EnterpriseRecyclerView enterpriseRecyclerView2 = (EnterpriseRecyclerView) m82431b(R.id.cqp);
        C7573i.m23582a((Object) enterpriseRecyclerView2, "recycler_view");
        enterpriseRecyclerView2.setAdapter(this.f66051h);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C42961az.m136382c(this);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        return LayoutInflater.from(activity).inflate(R.layout.o2, null);
    }
}
