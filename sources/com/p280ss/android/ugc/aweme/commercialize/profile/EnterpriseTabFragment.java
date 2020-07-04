package com.p280ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25250au;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment */
public final class EnterpriseTabFragment extends ProfileListFragment {

    /* renamed from: e */
    public User f66062e;

    /* renamed from: f */
    public boolean f66063f;

    /* renamed from: g */
    private EnterpriseTabAdapter f66064g;

    /* renamed from: h */
    private String f66065h;

    /* renamed from: i */
    private Aweme f66066i;

    /* renamed from: j */
    private HashMap f66067j;

    /* renamed from: b */
    private View m82449b(int i) {
        if (this.f66067j == null) {
            this.f66067j = new HashMap();
        }
        View view = (View) this.f66067j.get(Integer.valueOf(R.id.cqp));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(R.id.cqp);
            this.f66067j.put(Integer.valueOf(R.id.cqp), view);
        }
        return view;
    }

    /* renamed from: k */
    private void m82450k() {
        if (this.f66067j != null) {
            this.f66067j.clear();
        }
    }

    public final boolean aO_() {
        return true;
    }

    public final void aQ_() {
        mo65515g();
    }

    public final void aT_() {
    }

    /* renamed from: j */
    public final View mo61750j() {
        return (EnterpriseRecyclerView) m82449b(R.id.cqp);
    }

    public final void aS_() {
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82449b(R.id.cqp);
        if (enterpriseRecyclerView != null) {
            C1273i layoutManager = enterpriseRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo5437e(0);
            }
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82449b(R.id.cqp);
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
        m82450k();
    }

    public final void onPause() {
        super.onPause();
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82449b(R.id.cqp);
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
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82449b(R.id.cqp);
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

    /* renamed from: g */
    public final void mo65515g() {
        String c = C25250au.m82999c(this.f66062e);
        C7573i.m23582a((Object) c, "EnterpriseUtils.getEnterpriseTabUrl(user)");
        C33787a a = C33786f.m108941a(c);
        String b = C43077dz.m136657a().mo104733b(this.f66065h);
        String str = "mp_user_id";
        String str2 = this.f66065h;
        if (str2 == null) {
            str2 = "";
        }
        a.mo86195a(str, str2);
        if (!TextUtils.isEmpty(b)) {
            String str3 = "mp_sec_uid";
            if (b == null) {
                C7573i.m23580a();
            }
            a.mo86195a(str3, b);
        }
        String uri = a.mo86194a().toString();
        C7573i.m23582a((Object) uri, "urlBuilder.build().toString()");
        EnterpriseTabAdapter enterpriseTabAdapter = this.f66064g;
        if (enterpriseTabAdapter != null) {
            enterpriseTabAdapter.mo65513a(uri);
        }
        EnterpriseTabAdapter enterpriseTabAdapter2 = this.f66064g;
        if (enterpriseTabAdapter2 != null) {
            enterpriseTabAdapter2.notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public final Bundle mo65516i() {
        boolean z;
        Bundle bundle = new Bundle();
        Aweme aweme = this.f66066i;
        if (aweme != null) {
            z = aweme.isAd();
        } else {
            z = false;
        }
        if (!z) {
            return bundle;
        }
        Aweme aweme2 = this.f66066i;
        if (aweme2 == null) {
            C7573i.m23580a();
        }
        AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
        if (awemeRawAd == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) awemeRawAd, "aweme!!.awemeRawAd!!");
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null || creativeId.longValue() != 0) {
            Long creativeId2 = awemeRawAd.getCreativeId();
            C7573i.m23582a((Object) creativeId2, "awemeRawAd.creativeId");
            bundle.putLong("ad_id", creativeId2.longValue());
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putInt("ad_system_origin", awemeRawAd.getSystemOrigin());
            bundle.putString("aweme_creative_id", String.valueOf(awemeRawAd.getCreativeId().longValue()));
            bundle.putString("bundle_download_app_log_extra", awemeRawAd.getLogExtra());
        }
        if (!TextUtils.isEmpty(awemeRawAd.getDownloadUrl())) {
            bundle.putString("bundle_download_url", awemeRawAd.getDownloadUrl());
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo65514a(Aweme aweme) {
        this.f66066i = aweme;
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
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabAdapter r3 = r5.f66064g
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
            android.view.View r6 = r5.m82449b(r4)
            com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView r6 = (com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView) r6
            com.ss.android.ugc.aweme.commercialize.profile.a r6 = r6.getEnterTabManager()
            r6.f66069a = r2
            goto L_0x00cf
        L_0x00ba:
            java.lang.String r0 = "mp_tab_top_arrived"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00cf
            android.view.View r6 = r5.m82449b(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment.top(com.ss.android.ugc.aweme.fe.method.k):void");
    }

    /* renamed from: a */
    public final void mo65501a(String str, String str2) {
        super.mo65501a(str, str2);
        this.f66065h = str;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m82449b(R.id.cqp);
        C7573i.m23582a((Object) enterpriseRecyclerView, "recycler_view");
        enterpriseRecyclerView.setLayoutManager(new EnterpriseTabFragment$onViewCreated$1(this, getActivity(), 0, false));
        this.f66064g = new EnterpriseTabAdapter(this, null, this.f66063f);
        EnterpriseRecyclerView enterpriseRecyclerView2 = (EnterpriseRecyclerView) m82449b(R.id.cqp);
        C7573i.m23582a((Object) enterpriseRecyclerView2, "recycler_view");
        enterpriseRecyclerView2.setAdapter(this.f66064g);
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
