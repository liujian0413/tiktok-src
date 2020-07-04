package com.p280ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.DouyinFeBusiness;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.profile.model.AggregationTab;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AggregationTabFragment */
public final class AggregationTabFragment extends ProfileListFragment {

    /* renamed from: g */
    public static final C25033a f66037g = new C25033a(null);

    /* renamed from: e */
    public AggregationTab f66038e;

    /* renamed from: f */
    public boolean f66039f;

    /* renamed from: h */
    private AggregationTabAdapter f66040h;

    /* renamed from: i */
    private String f66041i;

    /* renamed from: j */
    private HashMap f66042j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AggregationTabFragment$a */
    public static final class C25033a {
        private C25033a() {
        }

        public /* synthetic */ C25033a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    private View m82421b(int i) {
        if (this.f66042j == null) {
            this.f66042j = new HashMap();
        }
        View view = (View) this.f66042j.get(Integer.valueOf(R.id.cqp));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.cqp);
            this.f66042j.put(Integer.valueOf(R.id.cqp), view);
        }
        return view;
    }

    /* renamed from: i */
    private void m82422i() {
        if (this.f66042j != null) {
            this.f66042j.clear();
        }
    }

    public final boolean aO_() {
        return true;
    }

    public final void aT_() {
    }

    /* renamed from: j */
    public final View mo61750j() {
        return (EnterpriseRecyclerView) m82421b(R.id.cqp);
    }

    public final void aS_() {
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82421b(R.id.cqp);
        if (enterpriseRecyclerView != null) {
            C1273i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo5437e(0);
            }
        }
    }

    /* renamed from: g */
    public final String mo65506g() {
        boolean z;
        AggregationTab aggregationTab = this.f66038e;
        if (aggregationTab != null) {
            String title = aggregationTab.getTitle();
            if (title != null) {
                if (title.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    AggregationTab aggregationTab2 = this.f66038e;
                    if (aggregationTab2 != null) {
                        return aggregationTab2.getTitle();
                    }
                    return null;
                }
            }
        }
        return C23481i.m77089a().getString(R.string.b1h);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82421b(R.id.cqp);
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
        m82422i();
    }

    public final void onPause() {
        super.onPause();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82421b(R.id.cqp);
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
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82421b(R.id.cqp);
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

    public final void aQ_() {
        String str;
        String str2;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            DouyinFeBusiness douyinFeBusiness = a.getDouyinFeBusiness();
            C7573i.m23582a((Object) douyinFeBusiness, "SettingsReader.get().douyinFeBusiness");
            str = douyinFeBusiness.getAggregationTab();
        } catch (Exception unused) {
            str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fpage_challenge_brand_tab%2Fmention%3Fmodule_name%3Dpage_challenge_mention%26hide_nav_bar%3D1%26loading_bgcolor%3D161823&module_name=page_challenge_mention&hide_nav_bar=1&loading_bgcolor=161823&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fmodule_name%3Dpage_challenge_mention%26hide_nav_bar%3D1%26loading_bgcolor%3D161823%26bundle%3Dindex.js%26channel%3Dfe_rn_lyon_challenge_brand_tab";
        }
        C7573i.m23582a((Object) str, "rawUrl");
        C33787a a2 = C33786f.m108941a(str);
        String b = C43077dz.m136657a().mo104733b(this.f66041i);
        a2.mo86195a("user_id", String.valueOf(this.f66041i));
        if (!TextUtils.isEmpty(b)) {
            a2.mo86195a("sec_user_id", String.valueOf(b));
        }
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (C7573i.m23585a((Object) f.getCurUserId(), (Object) this.f66041i)) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        String jSONObject = new JSONObject(C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("tab_name", "content_aggregation"), C7579l.m23633a("enter_from", str2)})).toString();
        C7573i.m23582a((Object) jSONObject, "JSONObject(mapOf(\"tab_na…to enterFrom)).toString()");
        a2.mo86195a("log_extra", jSONObject);
        String uri = a2.mo86194a().toString();
        C7573i.m23582a((Object) uri, "urlBuilder.build().toString()");
        AggregationTabAdapter aggregationTabAdapter = this.f66040h;
        if (aggregationTabAdapter != null) {
            aggregationTabAdapter.mo65500a(uri);
        }
        AggregationTabAdapter aggregationTabAdapter2 = this.f66040h;
        if (aggregationTabAdapter2 != null) {
            aggregationTabAdapter2.notifyDataSetChanged();
        }
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
            com.ss.android.ugc.aweme.commercialize.profile.AggregationTabAdapter r3 = r5.f66040h
            if (r3 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r3.f66033a
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
            android.view.View r6 = r5.m82421b(r4)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r6 = (com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r6
            com.ss.android.ugc.aweme.commercialize.profile.a r6 = r6.getEnterTabManager()
            r6.f66069a = r2
            goto L_0x00cf
        L_0x00ba:
            java.lang.String r0 = "mp_tab_top_arrived"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00cf
            android.view.View r6 = r5.m82421b(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.profile.AggregationTabFragment.top(com.ss.android.ugc.aweme.fe.method.k):void");
    }

    /* renamed from: a */
    public final void mo65501a(String str, String str2) {
        super.mo65501a(str, str2);
        this.f66041i = str;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82421b(R.id.cqp);
        C7573i.m23582a((Object) enterpriseRecyclerView, "recycler_view");
        enterpriseRecyclerView.setLayoutManager(new AggregationTabFragment$onViewCreated$1(this, getActivity(), 0, false));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        this.f66040h = new AggregationTabAdapter(activity, null, this.f66039f);
        EnterpriseRecyclerView enterpriseRecyclerView2 = (EnterpriseRecyclerView) m82421b(R.id.cqp);
        C7573i.m23582a((Object) enterpriseRecyclerView2, "recycler_view");
        enterpriseRecyclerView2.setAdapter(this.f66040h);
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
