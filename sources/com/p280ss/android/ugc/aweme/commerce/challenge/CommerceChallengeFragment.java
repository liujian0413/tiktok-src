package com.p280ss.android.ugc.aweme.commerce.challenge;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView;
import com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.detail.C26060f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36344am;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment */
public final class CommerceChallengeFragment extends AmeBaseFragment implements C26060f, C36344am {

    /* renamed from: e */
    public String f64491e;

    /* renamed from: f */
    private final Rect f64492f = new Rect();

    /* renamed from: g */
    private boolean f64493g = true;

    /* renamed from: h */
    private String f64494h;

    /* renamed from: i */
    private String f64495i;

    /* renamed from: j */
    private EnterpriseTabAdapter f64496j;

    /* renamed from: k */
    private HashMap f64497k;

    /* renamed from: com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment$a */
    static final class C24429a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceChallengeFragment f64498a;

        C24429a(CommerceChallengeFragment commerceChallengeFragment) {
            this.f64498a = commerceChallengeFragment;
        }

        public final void run() {
            this.f64498a.mo63415i();
        }
    }

    /* renamed from: a */
    private View m80334a(int i) {
        if (this.f64497k == null) {
            this.f64497k = new HashMap();
        }
        View view = (View) this.f64497k.get(Integer.valueOf(R.id.cqp));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.cqp);
            this.f64497k.put(Integer.valueOf(R.id.cqp), view);
        }
        return view;
    }

    /* renamed from: n */
    private void m80337n() {
        if (this.f64497k != null) {
            this.f64497k.clear();
        }
    }

    /* renamed from: b */
    public final void mo61746b(boolean z) {
    }

    /* renamed from: g */
    public final void mo61749g() {
    }

    /* renamed from: a */
    public final boolean mo61744a() {
        return this.f64493g;
    }

    /* renamed from: l */
    public final String mo63416l() {
        String str = this.f64495i;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    private CrossPlatformWebView m80336m() {
        EnterpriseTabAdapter enterpriseTabAdapter = this.f64496j;
        if (enterpriseTabAdapter != null) {
            return enterpriseTabAdapter.f66056a;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo63413e() {
        String str;
        CrossPlatformWebView m = m80336m();
        if (m != null) {
            String str2 = "brand_room_left";
            JSONObject jSONObject = new JSONObject();
            CrossPlatformWebView m2 = m80336m();
            if (m2 != null) {
                str = m2.getReactId();
            } else {
                str = null;
            }
            m.mo67473a(str2, jSONObject, str);
        }
    }

    /* renamed from: f */
    public final void mo63414f() {
        new Handler().postDelayed(new C24429a(this), 100);
    }

    /* renamed from: j */
    public final View mo61750j() {
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m80334a((int) R.id.cqp);
        C7573i.m23582a((Object) enterpriseRecyclerView, "recycler_view");
        return enterpriseRecyclerView;
    }

    /* renamed from: k */
    public final void mo61751k() {
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m80334a((int) R.id.cqp);
        if (enterpriseRecyclerView != null) {
            C1273i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo5437e(0);
            }
        }
    }

    /* renamed from: d */
    public final void mo61748d() {
        this.f64493g = false;
        String str = this.f64491e;
        if (str != null) {
            C33787a a = C33786f.m108941a(str);
            String str2 = "challenge_id";
            String str3 = this.f64494h;
            if (str3 == null) {
                str3 = "";
            }
            String uri = a.mo86195a(str2, str3).mo86194a().toString();
            C7573i.m23582a((Object) uri, "RnSchemeHelper.parseRnSc…      .build().toString()");
            EnterpriseTabAdapter enterpriseTabAdapter = this.f64496j;
            if (enterpriseTabAdapter != null) {
                enterpriseTabAdapter.mo65513a(uri);
            }
            EnterpriseTabAdapter enterpriseTabAdapter2 = this.f64496j;
            if (enterpriseTabAdapter2 != null) {
                enterpriseTabAdapter2.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: i */
    public final void mo63415i() {
        String str;
        CrossPlatformWebView m = m80336m();
        if (m != null && m.getGlobalVisibleRect(this.f64492f)) {
            CrossPlatformWebView m2 = m80336m();
            if (m2 != null) {
                String str2 = "brand_room_show";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("height", C23486n.m77125b((double) this.f64492f.height()));
                CrossPlatformWebView m3 = m80336m();
                if (m3 != null) {
                    str = m3.getReactId();
                } else {
                    str = null;
                }
                m2.mo67473a(str2, jSONObject, str);
            }
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m80334a((int) R.id.cqp);
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
        m80337n();
    }

    public final void onPause() {
        super.onPause();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m80334a((int) R.id.cqp);
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
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m80334a((int) R.id.cqp);
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

    /* renamed from: c */
    private void m80335c(String str) {
        this.f64495i = str;
    }

    /* renamed from: a */
    public final void mo61741a(String str) {
        this.f64494h = str;
    }

    /* renamed from: b */
    public final void mo63412b(String str) {
        m80335c(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r7.getGlobalVisibleRect(r6.f64492f) == true) goto L_0x0043;
     */
    @org.greenrobot.eventbus.C7709l(mo20400a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onJsBroadcast(com.p280ss.android.ugc.aweme.p1216fe.method.C27994k r7) {
        /*
            r6 = this;
            java.lang.String r0 = "broadCastEvent"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            org.json.JSONObject r0 = r7.f73730b
            java.lang.String r1 = "eventName"
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = "brand_room_loaded"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r6.m80336m()
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = r1.getReactId()
            goto L_0x0025
        L_0x0024:
            r1 = r3
        L_0x0025:
            org.json.JSONObject r7 = r7.f73730b
            java.lang.String r4 = "reactId"
            java.lang.String r7 = r7.getString(r4)
            boolean r7 = kotlin.jvm.internal.C7573i.m23585a(r1, r7)
            if (r7 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r7 = r6.m80336m()
            if (r7 == 0) goto L_0x0042
            android.graphics.Rect r1 = r6.f64492f
            boolean r7 = r7.getGlobalVisibleRect(r1)
            if (r7 != r2) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r2 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r0 = r3
        L_0x0047:
            if (r0 == 0) goto L_0x0075
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r7 = r6.m80336m()
            if (r7 == 0) goto L_0x0074
            java.lang.String r0 = "brand_room_show"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "height"
            android.graphics.Rect r4 = r6.f64492f
            int r4 = r4.height()
            double r4 = (double) r4
            int r4 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77125b(r4)
            r1.put(r2, r4)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = r6.m80336m()
            if (r2 == 0) goto L_0x0070
            java.lang.String r3 = r2.getReactId()
        L_0x0070:
            r7.mo67473a(r0, r1, r3)
            goto L_0x0075
        L_0x0074:
            return
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment.onJsBroadcast(com.ss.android.ugc.aweme.fe.method.k):void");
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
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter r3 = r5.f64496j
            if (r3 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r3.f66056a
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
            android.view.View r6 = r5.m80334a(r4)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r6 = (com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r6
            com.ss.android.ugc.aweme.commercialize.profile.a r6 = r6.getEnterTabManager()
            r6.f66069a = r2
            goto L_0x00cf
        L_0x00ba:
            java.lang.String r0 = "mp_tab_top_arrived"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00cf
            android.view.View r6 = r5.m80334a(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment.top(com.ss.android.ugc.aweme.fe.method.k):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m80334a((int) R.id.cqp);
        C7573i.m23582a((Object) enterpriseRecyclerView, "recycler_view");
        enterpriseRecyclerView.setLayoutManager(new CommerceChallengeFragment$onViewCreated$1(this, getActivity(), 0, false));
        this.f64496j = new EnterpriseTabAdapter(this, null, false);
        EnterpriseRecyclerView enterpriseRecyclerView2 = (EnterpriseRecyclerView) m80334a((int) R.id.cqp);
        C7573i.m23582a((Object) enterpriseRecyclerView2, "recycler_view");
        enterpriseRecyclerView2.setAdapter(this.f64496j);
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
