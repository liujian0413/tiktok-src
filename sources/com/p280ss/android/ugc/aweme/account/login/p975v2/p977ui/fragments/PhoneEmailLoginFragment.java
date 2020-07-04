package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10819b;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.p280ss.android.ugc.aweme.account.login.C21642z;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.PhoneEmailTabAdapter;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.PhoneEmailTabAdapter.C22043a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment */
public final class PhoneEmailLoginFragment extends BaseI18nLoginFragment {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f59100f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PhoneEmailLoginFragment.class), "phoneTabFragment", "getPhoneTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PhoneEmailLoginFragment.class), "emailTabFragment", "getEmailTabFragment()Lcom/ss/android/ugc/aweme/account/login/v2/ui/PhoneEmailTabAdapter$TabFragment;"))};

    /* renamed from: i */
    public static final C22110a f59101i = new C22110a(null);

    /* renamed from: g */
    public int f59102g = -1;

    /* renamed from: h */
    public boolean f59103h = true;

    /* renamed from: k */
    private PhoneEmailTabAdapter f59104k;

    /* renamed from: l */
    private final C7541d f59105l = C7546e.m23569a(new C22113d(this));

    /* renamed from: m */
    private final C7541d f59106m = C7546e.m23569a(new C22111b(this));

    /* renamed from: n */
    private HashMap f59107n;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment$a */
    public static final class C22110a {
        private C22110a() {
        }

        public /* synthetic */ C22110a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment$b */
    static final class C22111b extends Lambda implements C7561a<C22043a> {

        /* renamed from: a */
        final /* synthetic */ PhoneEmailLoginFragment f59108a;

        C22111b(PhoneEmailLoginFragment phoneEmailLoginFragment) {
            this.f59108a = phoneEmailLoginFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22043a invoke() {
            EmailPasswordLoginFragment emailPasswordLoginFragment = new EmailPasswordLoginFragment();
            emailPasswordLoginFragment.setArguments(new Bundle(this.f59108a.getArguments()));
            Bundle arguments = emailPasswordLoginFragment.getArguments();
            if (arguments == null) {
                C7573i.m23580a();
            }
            arguments.putInt("current_page", Step.INPUT_EMAIL_LOGIN.getValue());
            Bundle arguments2 = emailPasswordLoginFragment.getArguments();
            if (arguments2 == null) {
                C7573i.m23580a();
            }
            arguments2.remove("next_page");
            Fragment fragment = emailPasswordLoginFragment;
            String string = this.f59108a.getString(R.string.cc9);
            C7573i.m23582a((Object) string, "getString(R.string.mus_email)");
            return new C22043a(fragment, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment$c */
    static final class C22112c implements C10819b {

        /* renamed from: a */
        final /* synthetic */ PhoneEmailLoginFragment f59109a;

        C22112c(PhoneEmailLoginFragment phoneEmailLoginFragment) {
            this.f59109a = phoneEmailLoginFragment;
        }

        /* renamed from: a */
        public final void mo26115a(C10825f fVar) {
            String str;
            this.f59109a.f59103h = false;
            C7573i.m23582a((Object) fVar, "it");
            if (fVar.f29291e == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            C6907h.m21524a(str, (Map) new C21102b().mo56946a("enter_method", this.f59109a.mo58341f()).mo56946a("enter_type", "click").f56672a);
            RtlViewPager rtlViewPager = (RtlViewPager) this.f59109a.mo58338b(R.id.cap);
            C7573i.m23582a((Object) rtlViewPager, "phoneEmailLoginPager");
            rtlViewPager.setCurrentItem(fVar.f29291e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment$d */
    static final class C22113d extends Lambda implements C7561a<C22043a> {

        /* renamed from: a */
        final /* synthetic */ PhoneEmailLoginFragment f59110a;

        C22113d(PhoneEmailLoginFragment phoneEmailLoginFragment) {
            this.f59110a = phoneEmailLoginFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22043a invoke() {
            PhoneLoginFragment phoneLoginFragment = new PhoneLoginFragment();
            phoneLoginFragment.setArguments(new Bundle(this.f59110a.getArguments()));
            Bundle arguments = phoneLoginFragment.getArguments();
            if (arguments == null) {
                C7573i.m23580a();
            }
            arguments.putInt("current_page", Step.INPUT_PHONE_LOGIN.getValue());
            Bundle arguments2 = phoneLoginFragment.getArguments();
            if (arguments2 == null) {
                C7573i.m23580a();
            }
            arguments2.remove("next_page");
            Fragment fragment = phoneLoginFragment;
            String string = this.f59110a.getString(R.string.cev);
            C7573i.m23582a((Object) string, "getString(R.string.mus_phone)");
            return new C22043a(fragment, string);
        }
    }

    /* renamed from: v */
    private final C22043a m73505v() {
        return (C22043a) this.f59105l.getValue();
    }

    /* renamed from: w */
    private final C22043a m73506w() {
        return (C22043a) this.f59106m.getValue();
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59107n == null) {
            this.f59107n = new HashMap();
        }
        View view = (View) this.f59107n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59107n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59107n != null) {
            this.f59107n.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1l;
    }

    /* renamed from: q */
    public final void mo58418q() {
    }

    /* renamed from: r */
    public final void mo58419r() {
    }

    /* renamed from: a */
    public final boolean mo57299a() {
        C22043a aVar;
        if (this.f59102g == 0) {
            aVar = m73505v();
        } else {
            aVar = m73506w();
        }
        Fragment fragment = aVar.f58954a;
        if (fragment != null) {
            return ((C21642z) fragment).mo57516X_();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.NeedCancelThisLoginMethod");
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        C22047a aVar = new C22047a(getString(R.string.ad9), null, false, null, null, false, "phone_login_homepage", false, false, 446, null);
        return aVar;
    }

    /* renamed from: u */
    public final boolean mo58451u() {
        RtlViewPager rtlViewPager = (RtlViewPager) mo58338b(R.id.cap);
        C7573i.m23582a((Object) rtlViewPager, "phoneEmailLoginPager");
        if (rtlViewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    public final void onStart() {
        int i;
        super.onStart();
        if (this.f59102g != -1) {
            i = this.f59102g;
        } else {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != Step.INPUT_EMAIL_LOGIN.getValue()) {
                i = 0;
            } else {
                i = 1;
            }
        }
        if (this.f59102g != i) {
            if (this.f59102g != -1) {
                this.f59103h = false;
            }
            this.f59102g = i;
            RtlViewPager rtlViewPager = (RtlViewPager) mo58338b(R.id.cap);
            C7573i.m23582a((Object) rtlViewPager, "phoneEmailLoginPager");
            rtlViewPager.setCurrentItem(i);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f59104k = new PhoneEmailTabAdapter(getChildFragmentManager());
        PhoneEmailTabAdapter phoneEmailTabAdapter = this.f59104k;
        if (phoneEmailTabAdapter == null) {
            C7573i.m23583a("tabAdapter");
        }
        phoneEmailTabAdapter.mo58397a(m73505v());
        PhoneEmailTabAdapter phoneEmailTabAdapter2 = this.f59104k;
        if (phoneEmailTabAdapter2 == null) {
            C7573i.m23583a("tabAdapter");
        }
        phoneEmailTabAdapter2.mo58397a(m73506w());
        RtlViewPager rtlViewPager = (RtlViewPager) mo58338b(R.id.cap);
        C7573i.m23582a((Object) rtlViewPager, "phoneEmailLoginPager");
        PhoneEmailTabAdapter phoneEmailTabAdapter3 = this.f59104k;
        if (phoneEmailTabAdapter3 == null) {
            C7573i.m23583a("tabAdapter");
        }
        rtlViewPager.setAdapter(phoneEmailTabAdapter3);
        ((DmtTabLayout) mo58338b(R.id.caq)).setupWithViewPager((RtlViewPager) mo58338b(R.id.cap));
        ((RtlViewPager) mo58338b(R.id.cap)).addOnPageChangeListener(new PhoneEmailLoginFragment$onViewCreated$1(this));
        ((DmtTabLayout) mo58338b(R.id.caq)).setOnTabClickListener(new C22112c(this));
    }
}
