package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10819b;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.PhoneEmailTabAdapter;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.PhoneEmailTabAdapter.C22043a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment */
public final class PhoneEmailSignUpFragment extends BaseI18nLoginFragment {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f59112f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PhoneEmailSignUpFragment.class), "phoneTabFragment", "getPhoneTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PhoneEmailSignUpFragment.class), "emailTabFragment", "getEmailTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;"))};

    /* renamed from: i */
    public static final C22114a f59113i = new C22114a(null);

    /* renamed from: g */
    public int f59114g = -1;

    /* renamed from: h */
    public boolean f59115h = true;

    /* renamed from: k */
    private PhoneEmailTabAdapter f59116k;

    /* renamed from: l */
    private final C7541d f59117l = C7546e.m23569a(new C22117d(this));

    /* renamed from: m */
    private final C7541d f59118m = C7546e.m23569a(new C22115b(this));

    /* renamed from: n */
    private HashMap f59119n;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment$a */
    public static final class C22114a {
        private C22114a() {
        }

        public /* synthetic */ C22114a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment$b */
    static final class C22115b extends Lambda implements C7561a<C22043a> {

        /* renamed from: a */
        final /* synthetic */ PhoneEmailSignUpFragment f59120a;

        C22115b(PhoneEmailSignUpFragment phoneEmailSignUpFragment) {
            this.f59120a = phoneEmailSignUpFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22043a invoke() {
            EmailSignUpFragment emailSignUpFragment = new EmailSignUpFragment();
            emailSignUpFragment.setArguments(new Bundle(this.f59120a.getArguments()));
            Bundle arguments = emailSignUpFragment.getArguments();
            if (arguments == null) {
                C7573i.m23580a();
            }
            arguments.putInt("current_page", Step.INPUT_EMAIL_SIGN_UP.getValue());
            Bundle arguments2 = emailSignUpFragment.getArguments();
            if (arguments2 == null) {
                C7573i.m23580a();
            }
            arguments2.remove("next_page");
            Fragment fragment = emailSignUpFragment;
            String string = this.f59120a.getString(R.string.cc9);
            C7573i.m23582a((Object) string, "getString(R.string.mus_email)");
            return new C22043a(fragment, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment$c */
    static final class C22116c implements C10819b {

        /* renamed from: a */
        final /* synthetic */ PhoneEmailSignUpFragment f59121a;

        C22116c(PhoneEmailSignUpFragment phoneEmailSignUpFragment) {
            this.f59121a = phoneEmailSignUpFragment;
        }

        /* renamed from: a */
        public final void mo26115a(C10825f fVar) {
            String str;
            this.f59121a.f59115h = false;
            C7573i.m23582a((Object) fVar, "it");
            if (fVar.f29291e == 0) {
                str = "register_switch_phone";
            } else {
                str = "register_switch_email";
            }
            C6907h.m21524a(str, (Map) new C21102b().mo56946a("enter_method", this.f59121a.mo58341f()).mo56946a("enter_type", "click").f56672a);
            RtlViewPager rtlViewPager = (RtlViewPager) this.f59121a.mo58338b(R.id.car);
            C7573i.m23582a((Object) rtlViewPager, "phoneEmailSignUpPager");
            rtlViewPager.setCurrentItem(fVar.f29291e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment$d */
    static final class C22117d extends Lambda implements C7561a<C22043a> {

        /* renamed from: a */
        final /* synthetic */ PhoneEmailSignUpFragment f59122a;

        C22117d(PhoneEmailSignUpFragment phoneEmailSignUpFragment) {
            this.f59122a = phoneEmailSignUpFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22043a invoke() {
            PhoneSignUpFragment phoneSignUpFragment = new PhoneSignUpFragment();
            phoneSignUpFragment.setArguments(new Bundle(this.f59122a.getArguments()));
            Bundle arguments = phoneSignUpFragment.getArguments();
            if (arguments == null) {
                C7573i.m23580a();
            }
            arguments.putInt("current_page", Step.INPUT_PHONE_SIGN_UP.getValue());
            Bundle arguments2 = phoneSignUpFragment.getArguments();
            if (arguments2 == null) {
                C7573i.m23580a();
            }
            arguments2.remove("next_page");
            Fragment fragment = phoneSignUpFragment;
            String string = this.f59122a.getString(R.string.cev);
            C7573i.m23582a((Object) string, "getString(R.string.mus_phone)");
            return new C22043a(fragment, string);
        }
    }

    /* renamed from: u */
    private final C22043a m73519u() {
        return (C22043a) this.f59117l.getValue();
    }

    /* renamed from: v */
    private final C22043a m73520v() {
        return (C22043a) this.f59118m.getValue();
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59119n == null) {
            this.f59119n = new HashMap();
        }
        View view = (View) this.f59119n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59119n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59119n != null) {
            this.f59119n.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1m;
    }

    /* renamed from: q */
    public final void mo58418q() {
    }

    /* renamed from: r */
    public final void mo58419r() {
    }

    /* renamed from: l */
    public final boolean mo58346l() {
        KeyboardUtils.m77057c(getView());
        return super.mo58346l();
    }

    /* renamed from: a */
    public final boolean mo57299a() {
        RtlViewPager rtlViewPager = (RtlViewPager) mo58338b(R.id.car);
        C7573i.m23582a((Object) rtlViewPager, "phoneEmailSignUpPager");
        if (rtlViewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        C22047a aVar = new C22047a(getString(R.string.abj), null, false, null, null, false, "phone_sign_up_homepage", false, false, 446, null);
        return aVar;
    }

    public final void onStart() {
        int i;
        super.onStart();
        if (this.f59114g != -1) {
            i = this.f59114g;
        } else {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != Step.INPUT_EMAIL_SIGN_UP.getValue()) {
                i = 0;
            } else {
                i = 1;
            }
        }
        if (this.f59114g != i) {
            if (this.f59114g != -1) {
                this.f59115h = false;
            }
            this.f59114g = i;
            RtlViewPager rtlViewPager = (RtlViewPager) mo58338b(R.id.car);
            C7573i.m23582a((Object) rtlViewPager, "phoneEmailSignUpPager");
            rtlViewPager.setCurrentItem(i);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59116k = new PhoneEmailTabAdapter(getChildFragmentManager());
        PhoneEmailTabAdapter phoneEmailTabAdapter = this.f59116k;
        if (phoneEmailTabAdapter == null) {
            C7573i.m23583a("tabAdapter");
        }
        phoneEmailTabAdapter.mo58397a(m73519u());
        PhoneEmailTabAdapter phoneEmailTabAdapter2 = this.f59116k;
        if (phoneEmailTabAdapter2 == null) {
            C7573i.m23583a("tabAdapter");
        }
        phoneEmailTabAdapter2.mo58397a(m73520v());
        RtlViewPager rtlViewPager = (RtlViewPager) mo58338b(R.id.car);
        C7573i.m23582a((Object) rtlViewPager, "phoneEmailSignUpPager");
        PhoneEmailTabAdapter phoneEmailTabAdapter3 = this.f59116k;
        if (phoneEmailTabAdapter3 == null) {
            C7573i.m23583a("tabAdapter");
        }
        rtlViewPager.setAdapter(phoneEmailTabAdapter3);
        ((DmtTabLayout) mo58338b(R.id.cas)).setupWithViewPager((RtlViewPager) mo58338b(R.id.car));
        ((RtlViewPager) mo58338b(R.id.car)).addOnPageChangeListener(new PhoneEmailSignUpFragment$onViewCreated$1(this));
        ((DmtTabLayout) mo58338b(R.id.cas)).setOnTabClickListener(new C22116c(this));
    }
}
