package com.p280ss.android.ugc.aweme.proaccount;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.C21663aw;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct;
import com.p280ss.android.ugc.aweme.p1216fe.p1217a.C27864b;
import com.p280ss.android.ugc.aweme.p1216fe.p1217a.C27865c;
import com.p280ss.android.ugc.aweme.proaccount.ProAccountCategoryAdapter.C35625b;
import com.p280ss.android.ugc.aweme.profile.UserResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.p1687b.C42804a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.proaccount.ProCategoryFragment */
public final class ProCategoryFragment extends AmeBaseFragment implements C6310a, C35625b {

    /* renamed from: h */
    public static final C35626a f93324h = new C35626a(null);

    /* renamed from: e */
    public C6309f f93325e;

    /* renamed from: f */
    public String f93326f;

    /* renamed from: g */
    public long f93327g = -1;

    /* renamed from: i */
    private WrapLinearLayoutManager f93328i;

    /* renamed from: j */
    private ProAccountCategoryAdapter f93329j;

    /* renamed from: k */
    private List<CategoryStruct> f93330k;

    /* renamed from: l */
    private HashMap f93331l;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProCategoryFragment$a */
    public static final class C35626a {
        private C35626a() {
        }

        /* renamed from: a */
        public static ProCategoryFragment m115103a() {
            ProCategoryFragment proCategoryFragment = new ProCategoryFragment();
            proCategoryFragment.setArguments(new Bundle());
            return proCategoryFragment;
        }

        public /* synthetic */ C35626a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProCategoryFragment$b */
    static final class C35627b implements C21083g {

        /* renamed from: a */
        final /* synthetic */ ProCategoryFragment f93332a;

        C35627b(ProCategoryFragment proCategoryFragment) {
            this.f93332a = proCategoryFragment;
        }

        /* renamed from: a */
        public final void mo56868a(int i, int i2, Object obj) {
            if (i == 14 && i2 == 1) {
                IAccountUserService a = C21115b.m71197a();
                C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                User curUser = a.getCurUser();
                C7573i.m23582a((Object) curUser, "user");
                if (curUser.isSecret()) {
                    C42804a.m135841a((Handler) ProCategoryFragment.m115094b(this.f93332a), "secret", "0", 0, 122);
                    return;
                }
                C21115b.m71197a().queryUser();
                C6907h.m21524a("switch_to_pro_account_success", (Map) C22984d.m75611a().mo59973a("classes", ProCategoryFragment.m115093a(this.f93332a)).f60753a);
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openSettingFragment(this.f93332a.getContext());
                return;
            }
            this.f93332a.mo90440d();
            if (this.f93332a.getContext() != null) {
                C10761a.m31399c(this.f93332a.getContext(), (int) R.string.cjt).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProCategoryFragment$c */
    static final class C35628c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProCategoryFragment f93333a;

        /* renamed from: b */
        final /* synthetic */ User f93334b;

        C35628c(ProCategoryFragment proCategoryFragment, User user) {
            this.f93333a = proCategoryFragment;
            this.f93334b = user;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x005e, code lost:
            if (r7.isEmailVerified() != false) goto L_0x0148;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r7)
                long r0 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment r7 = r6.f93333a
                long r2 = r7.f93327g
                long r0 = r0 - r2
                java.lang.String r7 = "click_choose_done"
                com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r3 = "is_success"
                java.lang.String r4 = "1"
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.lang.String r3 = "classes"
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment r4 = r6.f93333a
                java.lang.String r4 = com.p280ss.android.ugc.aweme.proaccount.ProCategoryFragment.m115093a(r4)
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.lang.String r3 = "duration"
                java.lang.String r0 = java.lang.String.valueOf(r0)
                com.ss.android.ugc.aweme.app.g.d r0 = r2.mo59973a(r3, r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r7, r0)
                com.ss.android.ugc.aweme.profile.model.User r7 = r6.f93334b
                java.lang.String r0 = "user"
                kotlin.jvm.internal.C7573i.m23582a(r7, r0)
                boolean r7 = r7.isPhoneBinded()
                if (r7 != 0) goto L_0x0148
                com.ss.android.ugc.aweme.profile.model.User r7 = r6.f93334b
                java.lang.String r0 = "user"
                kotlin.jvm.internal.C7573i.m23582a(r7, r0)
                java.lang.String r7 = r7.getEmail()
                boolean r7 = com.bytedance.vast.p673a.C13015c.m37973a(r7)
                if (r7 != 0) goto L_0x0062
                com.ss.android.ugc.aweme.profile.model.User r7 = r6.f93334b
                java.lang.String r0 = "user"
                kotlin.jvm.internal.C7573i.m23582a(r7, r0)
                boolean r7 = r7.isEmailVerified()
                if (r7 == 0) goto L_0x0062
                goto L_0x0148
            L_0x0062:
                com.ss.android.ugc.aweme.profile.model.User r7 = r6.f93334b
                java.lang.String r0 = "user"
                kotlin.jvm.internal.C7573i.m23582a(r7, r0)
                java.lang.String r7 = r7.getEmail()
                boolean r7 = com.bytedance.vast.p673a.C13015c.m37973a(r7)
                if (r7 != 0) goto L_0x0108
                com.ss.android.ugc.aweme.profile.model.User r7 = r6.f93334b
                java.lang.String r0 = "user"
                kotlin.jvm.internal.C7573i.m23582a(r7, r0)
                boolean r7 = r7.isEmailVerified()
                if (r7 != 0) goto L_0x0108
                com.ss.android.common.util.j r7 = new com.ss.android.common.util.j
                boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
                if (r0 == 0) goto L_0x008b
                java.lang.String r0 = "https://m.tiktok.com/passport/email/email_bind_index/"
                goto L_0x008d
            L_0x008b:
                java.lang.String r0 = "https://www.tiktok.com/passport/email/email_bind_index/"
            L_0x008d:
                r7.<init>(r0)
                java.lang.String r0 = "lang"
                com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.language.I18nManagerService> r2 = com.p280ss.android.ugc.aweme.language.I18nManagerService.class
                java.lang.Object r1 = r1.getService(r2)
                java.lang.String r2 = "ServiceManager.get().get…nagerService::class.java)"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                com.ss.android.ugc.aweme.language.I18nManagerService r1 = (com.p280ss.android.ugc.aweme.language.I18nManagerService) r1
                java.lang.String r1 = r1.getAppLanguage()
                r7.mo51188a(r0, r1)
                java.lang.String r0 = "aid"
                r1 = 1233(0x4d1, float:1.728E-42)
                r7.mo51186a(r0, r1)
                java.lang.String r0 = "locale"
                java.lang.String r1 = com.p280ss.android.ugc.aweme.i18n.language.C30476b.m99553b()
                r7.mo51188a(r0, r1)
                java.lang.String r0 = "email"
                com.ss.android.ugc.aweme.profile.model.User r1 = r6.f93334b
                java.lang.String r2 = "user"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.String r1 = r1.getEmail()
                r7.mo51188a(r0, r1)
                java.lang.String r0 = "enterfrom"
                java.lang.String r1 = "switchtoproaccount"
                r7.mo51188a(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r7 = r7.mo51184a()
                r0.append(r7)
                java.lang.String r7 = "#verify-email"
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                android.content.Intent r0 = new android.content.Intent
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment r1 = r6.f93333a
                android.support.v4.app.FragmentActivity r1 = r1.getActivity()
                android.content.Context r1 = (android.content.Context) r1
                java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r2 = com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
                r0.<init>(r1, r2)
                android.net.Uri r7 = android.net.Uri.parse(r7)
                r0.setData(r7)
                java.lang.String r7 = "hide_nav_bar"
                r1 = 1
                r0.putExtra(r7, r1)
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment r7 = r6.f93333a
                r7.startActivity(r0)
                return
            L_0x0108:
                com.ss.android.ugc.aweme.profile.model.User r7 = r6.f93334b
                java.lang.String r0 = "user"
                kotlin.jvm.internal.C7573i.m23582a(r7, r0)
                boolean r7 = r7.isPhoneBinded()
                if (r7 != 0) goto L_0x0147
                com.ss.android.ugc.aweme.profile.model.User r7 = r6.f93334b
                java.lang.String r0 = "user"
                kotlin.jvm.internal.C7573i.m23582a(r7, r0)
                java.lang.String r7 = r7.getEmail()
                boolean r7 = com.bytedance.vast.p673a.C13015c.m37973a(r7)
                if (r7 == 0) goto L_0x0147
                com.ss.android.ugc.aweme.aw r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21339h()
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment r7 = r6.f93333a
                android.support.v4.app.FragmentActivity r7 = r7.getActivity()
                r1 = r7
                android.app.Activity r1 = (android.app.Activity) r1
                java.lang.String r2 = "setting"
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment$c$1 r7 = new com.ss.android.ugc.aweme.proaccount.ProCategoryFragment$c$1
                r7.<init>(r6)
                r3 = r7
                com.ss.android.ugc.aweme.IAccountService$g r3 = (com.p280ss.android.ugc.aweme.IAccountService.C21083g) r3
                r4 = 1
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment r7 = r6.f93333a
                java.lang.String r5 = com.p280ss.android.ugc.aweme.proaccount.ProCategoryFragment.m115093a(r7)
                r0.bindProAccountMobile(r1, r2, r3, r4, r5)
            L_0x0147:
                return
            L_0x0148:
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment r7 = r6.f93333a
                r7.mo90438a()
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment r7 = r6.f93333a
                com.ss.android.ugc.aweme.proaccount.ProCategoryFragment r0 = r6.f93333a
                java.lang.String r0 = com.p280ss.android.ugc.aweme.proaccount.ProCategoryFragment.m115093a(r0)
                r7.mo90439a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.proaccount.ProCategoryFragment.C35628c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProCategoryFragment$d */
    static final class C35630d implements C21083g {

        /* renamed from: a */
        final /* synthetic */ ProCategoryFragment f93336a;

        C35630d(ProCategoryFragment proCategoryFragment) {
            this.f93336a = proCategoryFragment;
        }

        /* renamed from: a */
        public final void mo56868a(int i, int i2, Object obj) {
            if (i == 7 && i2 == 1) {
                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openSettingFragment(this.f93336a.getContext());
                C6907h.m21524a("switch_to_pro_account_success", (Map) C22984d.m75611a().mo59973a("classes", ProCategoryFragment.m115093a(this.f93336a)).f60753a);
            }
        }
    }

    /* renamed from: a */
    private View m115092a(int i) {
        if (this.f93331l == null) {
            this.f93331l = new HashMap();
        }
        View view = (View) this.f93331l.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f93331l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: i */
    private void m115098i() {
        if (this.f93331l != null) {
            this.f93331l.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m115098i();
    }

    public final void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    public final void mo90438a() {
        DmtStatusView dmtStatusView = (DmtStatusView) m115092a((int) R.id.th);
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(0);
        }
        DmtStatusView dmtStatusView2 = (DmtStatusView) m115092a((int) R.id.th);
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo25942f();
        }
    }

    /* renamed from: d */
    public final void mo90440d() {
        DmtStatusView dmtStatusView = (DmtStatusView) m115092a((int) R.id.th);
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        DmtStatusView dmtStatusView2 = (DmtStatusView) m115092a((int) R.id.th);
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo25950n();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f93327g = System.currentTimeMillis();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ProWelcomeActivity) activity).f93339b = System.currentTimeMillis();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity");
    }

    /* renamed from: g */
    private final void m115097g() {
        boolean z;
        String str = this.f93326f;
        if (str == null) {
            C7573i.m23583a("mCheckedCategory");
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DmtTextView dmtTextView = (DmtTextView) m115092a((int) R.id.ti);
            C7573i.m23582a((Object) dmtTextView, "category_tv_next");
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            dmtTextView.setBackground(C0683b.m2903a((Context) activity, (int) R.drawable.qk));
            DmtTextView dmtTextView2 = (DmtTextView) m115092a((int) R.id.ti);
            C7573i.m23582a((Object) dmtTextView2, "category_tv_next");
            dmtTextView2.setEnabled(true);
        }
    }

    /* renamed from: e */
    private final void m115095e() {
        this.f93328i = new WrapLinearLayoutManager(getContext());
        if (this.f93330k != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            Context context = activity;
            List<CategoryStruct> list = this.f93330k;
            if (list == null) {
                C7573i.m23580a();
            }
            this.f93329j = new ProAccountCategoryAdapter(context, list);
        }
        RecyclerView recyclerView = (RecyclerView) m115092a((int) R.id.tg);
        C7573i.m23582a((Object) recyclerView, "category_rv");
        WrapLinearLayoutManager wrapLinearLayoutManager = this.f93328i;
        if (wrapLinearLayoutManager == null) {
            C7573i.m23583a("mLinearLayout");
        }
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) m115092a((int) R.id.tg);
        C7573i.m23582a((Object) recyclerView2, "category_rv");
        ProAccountCategoryAdapter proAccountCategoryAdapter = this.f93329j;
        if (proAccountCategoryAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        recyclerView2.setAdapter(proAccountCategoryAdapter);
        ProAccountCategoryAdapter proAccountCategoryAdapter2 = this.f93329j;
        if (proAccountCategoryAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        proAccountCategoryAdapter2.mo90435a((C35625b) this);
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        C7573i.m23582a((Object) curUser, "user");
        if (curUser.isPhoneBinded()) {
            ((DmtTextView) m115092a((int) R.id.ti)).setText(R.string.un);
        } else {
            ((DmtTextView) m115092a((int) R.id.ti)).setText(R.string.uo);
        }
        DmtTextView dmtTextView = (DmtTextView) m115092a((int) R.id.ti);
        C7573i.m23582a((Object) dmtTextView, "category_tv_next");
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C7573i.m23580a();
        }
        dmtTextView.setBackground(C0683b.m2903a((Context) activity2, (int) R.drawable.qj));
        DmtTextView dmtTextView2 = (DmtTextView) m115092a((int) R.id.ti);
        C7573i.m23582a((Object) dmtTextView2, "category_tv_next");
        dmtTextView2.setEnabled(false);
        DmtStatusView dmtStatusView = (DmtStatusView) m115092a((int) R.id.th);
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10803a.m31631a(getContext()).mo25953a());
        }
        ((DmtTextView) m115092a((int) R.id.ti)).setFontType(C10834d.f29332b);
        ((DmtTextView) m115092a((int) R.id.ti)).setOnClickListener(new C35628c(this, curUser));
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e5  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m115096f() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ NullValueException -> 0x0018 }
            java.lang.String r1 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ NullValueException -> 0x0018 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo r0 = r0.getProAccountEnableDetailInfo()     // Catch:{ NullValueException -> 0x0018 }
            java.lang.String r1 = "SettingsReader.get().proAccountEnableDetailInfo"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ NullValueException -> 0x0018 }
            java.util.List r0 = r0.getCategoryList()     // Catch:{ NullValueException -> 0x0018 }
            r6.f93330k = r0     // Catch:{ NullValueException -> 0x0018 }
        L_0x0018:
            java.util.List<com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct> r0 = r6.f93330k
            if (r0 != 0) goto L_0x0255
            r0 = 19
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct[] r0 = new com.p280ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct[r0]
            r1 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            r4 = 0
            if (r3 == 0) goto L_0x0038
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0038
            r5 = 2131821452(0x7f11038c, float:1.9275648E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 1
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x0055
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0055
            r5 = 2131821466(0x7f11039a, float:1.9275676E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0056
        L_0x0055:
            r3 = r4
        L_0x0056:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 2
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x0072
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0072
            r5 = 2131821464(0x7f110398, float:1.9275672E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0073
        L_0x0072:
            r3 = r4
        L_0x0073:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 3
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x008f
            r5 = 2131821458(0x7f110392, float:1.927566E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0090
        L_0x008f:
            r3 = r4
        L_0x0090:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 4
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x00ac
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x00ac
            r5 = 2131821453(0x7f11038d, float:1.927565E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x00ad
        L_0x00ac:
            r3 = r4
        L_0x00ad:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 5
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x00c9
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x00c9
            r5 = 2131821459(0x7f110393, float:1.9275662E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x00ca
        L_0x00c9:
            r3 = r4
        L_0x00ca:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 6
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x00e6
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x00e6
            r5 = 2131821461(0x7f110395, float:1.9275666E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x00e7
        L_0x00e6:
            r3 = r4
        L_0x00e7:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 7
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x0103
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0103
            r5 = 2131821468(0x7f11039c, float:1.927568E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0104
        L_0x0103:
            r3 = r4
        L_0x0104:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 8
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x0121
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0121
            r5 = 2131821457(0x7f110391, float:1.9275658E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0122
        L_0x0121:
            r3 = r4
        L_0x0122:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 9
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x013f
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x013f
            r5 = 2131821460(0x7f110394, float:1.9275664E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0140
        L_0x013f:
            r3 = r4
        L_0x0140:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 10
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x015d
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x015d
            r5 = 2131821469(0x7f11039d, float:1.9275682E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x015e
        L_0x015d:
            r3 = r4
        L_0x015e:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 11
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x017b
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x017b
            r5 = 2131821451(0x7f11038b, float:1.9275646E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x017c
        L_0x017b:
            r3 = r4
        L_0x017c:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 12
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x0199
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0199
            r5 = 2131821467(0x7f11039b, float:1.9275678E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x019a
        L_0x0199:
            r3 = r4
        L_0x019a:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 13
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x01b7
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x01b7
            r5 = 2131821455(0x7f11038f, float:1.9275654E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x01b8
        L_0x01b7:
            r3 = r4
        L_0x01b8:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 14
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x01d5
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x01d5
            r5 = 2131821470(0x7f11039e, float:1.9275684E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x01d6
        L_0x01d5:
            r3 = r4
        L_0x01d6:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 15
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x01f3
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x01f3
            r5 = 2131821462(0x7f110396, float:1.9275668E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x01f4
        L_0x01f3:
            r3 = r4
        L_0x01f4:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 16
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x0211
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0211
            r5 = 2131821456(0x7f110390, float:1.9275656E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0212
        L_0x0211:
            r3 = r4
        L_0x0212:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 17
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x022f
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x022f
            r5 = 2131821465(0x7f110399, float:1.9275674E38)
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0230
        L_0x022f:
            r3 = r4
        L_0x0230:
            r2.<init>(r3)
            r0[r1] = r2
            r1 = 18
            com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x024c
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x024c
            r4 = 2131821463(0x7f110397, float:1.927567E38)
            java.lang.String r4 = r3.getString(r4)
        L_0x024c:
            r2.<init>(r4)
            r0[r1] = r2
            java.util.List r0 = kotlin.collections.C7525m.m23466c(r0)
        L_0x0255:
            r6.f93330k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.proaccount.ProCategoryFragment.m115096f():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ String m115093a(ProCategoryFragment proCategoryFragment) {
        String str = proCategoryFragment.f93326f;
        if (str == null) {
            C7573i.m23583a("mCheckedCategory");
        }
        return str;
    }

    /* renamed from: b */
    public static final /* synthetic */ C6309f m115094b(ProCategoryFragment proCategoryFragment) {
        C6309f fVar = proCategoryFragment.f93325e;
        if (fVar == null) {
            C7573i.m23583a("mHandler");
        }
        return fVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f93325e = new C6309f(this);
        C42961az.m136382c(this);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void switchToProAccountAfterEmail(C27865c cVar) {
        C7573i.m23587b(cVar, "proAccount");
        String str = this.f93326f;
        if (str == null) {
            C7573i.m23583a("mCheckedCategory");
        }
        mo90439a(str);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void switchToBindMobile(C27864b bVar) {
        C7573i.m23587b(bVar, "phone");
        C21663aw h = C6861a.m21339h();
        Activity activity = getActivity();
        String str = "setting";
        C21083g dVar = new C35630d(this);
        String str2 = this.f93326f;
        if (str2 == null) {
            C7573i.m23583a("mCheckedCategory");
        }
        h.bindProAccountMobile(activity, str, dVar, 1, str2);
    }

    /* renamed from: a */
    public final void mo90439a(String str) {
        C6861a.m21339h().switchProAccount(1, str, new C35627b(this));
    }

    public final void handleMsg(Message message) {
        if (message == null) {
            C7573i.m23580a();
        }
        if (message.obj instanceof Exception) {
            mo90440d();
            if (getContext() != null) {
                C10761a.m31399c(getContext(), (int) R.string.cjt).mo25750a();
            }
            return;
        }
        if (message.obj instanceof UserResponse) {
            Object obj = message.obj;
            if (obj != null) {
                UserResponse userResponse = (UserResponse) obj;
                if (message.what == 122) {
                    C7573i.m23582a((Object) userResponse.getUser(), "resp.user");
                    C21115b.m71197a().queryUser();
                    String str = "switch_to_pro_account_success";
                    C22984d a = C22984d.m75611a();
                    String str2 = "classes";
                    String str3 = this.f93326f;
                    if (str3 == null) {
                        C7573i.m23583a("mCheckedCategory");
                    }
                    C6907h.m21524a(str, (Map) a.mo59973a(str2, str3).f60753a);
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openSettingFragment(getContext());
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m115096f();
        m115095e();
    }

    /* renamed from: a */
    public final void mo90437a(String str, boolean z) {
        C7573i.m23587b(str, "itemName");
        this.f93326f = str;
        m115097g();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.q3, viewGroup, false);
    }
}
