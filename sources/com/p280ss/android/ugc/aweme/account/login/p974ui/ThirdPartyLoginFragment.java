package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.mobilelib.present.CommonPresent;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.C21642z;
import com.p280ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p280ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21319a;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22176d;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22176d.C22179a;
import com.p280ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse.SettingInfo;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.ThirdPartyLoginFragment */
public final class ThirdPartyLoginFragment extends BaseFragment<Object> implements C21319a, C21642z {

    /* renamed from: e */
    public boolean f58521e = true;

    /* renamed from: l */
    public List<? extends SettingInfo> f58522l = new ArrayList();

    /* renamed from: m */
    private ThirdPartyLoginView f58523m;

    /* renamed from: n */
    private boolean f58524n = true;

    /* renamed from: o */
    private HashMap f58525o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.ThirdPartyLoginFragment$a */
    static final class C21854a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyLoginFragment f58526a;

        /* renamed from: b */
        final /* synthetic */ TPLoginMethod f58527b;

        C21854a(ThirdPartyLoginFragment thirdPartyLoginFragment, TPLoginMethod tPLoginMethod) {
            this.f58526a = thirdPartyLoginFragment;
            this.f58527b = tPLoginMethod;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C6307b.m19566a((Collection<T>) this.f58526a.f58522l)) {
                ThirdPartyLoginFragment thirdPartyLoginFragment = this.f58526a;
                List<? extends SettingInfo> m = C22345t.m73987m();
                C7573i.m23582a((Object) m, "SharePreferencesUtil.getLoginSettingCache()");
                thirdPartyLoginFragment.f58522l = m;
            }
            if (!C22176d.m73608a(this.f58526a.f58522l, this.f58527b.getPlatform(), 0, true, this.f58526a.getActivity(), new C22179a(this) {

                /* renamed from: a */
                final /* synthetic */ C21854a f58528a;

                {
                    this.f58528a = r1;
                }

                /* renamed from: a */
                public final void mo58264a() {
                    this.f58528a.f58526a.mo58262a(this.f58528a.f58527b);
                }
            })) {
                this.f58526a.mo58262a(this.f58527b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.ThirdPartyLoginFragment$b */
    static final class C21856b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyLoginFragment f58529a;

        C21856b(ThirdPartyLoginFragment thirdPartyLoginFragment) {
            this.f58529a = thirdPartyLoginFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("switch_login_account", (Map) new C21102b().mo56946a("enter_method", this.f58529a.f58305i).mo56946a("enter_from", this.f58529a.f58304h).f56672a);
            this.f58529a.f58521e = false;
            FragmentActivity activity = this.f58529a.getActivity();
            if (activity != null) {
                activity.finish();
            }
            C21671bd.m72545m().retryLogin(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.ThirdPartyLoginFragment$c */
    static final class C21857c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyLoginFragment f58530a;

        C21857c(ThirdPartyLoginFragment thirdPartyLoginFragment) {
            this.f58530a = thirdPartyLoginFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f58530a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    private View m73019a(int i) {
        if (this.f58525o == null) {
            this.f58525o = new HashMap();
        }
        View view = (View) this.f58525o.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f58525o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    private void m73020d() {
        if (this.f58525o != null) {
            this.f58525o.clear();
        }
    }

    public final boolean ac_() {
        return false;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ CommonPresent mo58129g() {
        return null;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m73020d();
    }

    /* renamed from: X_ */
    public final boolean mo57516X_() {
        int i;
        if (this.f58524n && !C21671bd.m72539g()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i = arguments.getInt("bundle_flow_type", C21578r.f57928p);
            } else {
                i = C21578r.f57928p;
            }
            if (i == C21578r.f57932t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo58262a(TPLoginMethod tPLoginMethod) {
        this.f58524n = false;
        if (this.f58523m != null) {
            tPLoginMethod.getPlatform();
        }
        Intent intent = new Intent(getContext(), AuthorizeActivity.class);
        Bundle arguments = getArguments();
        if (arguments != null) {
            intent.putExtras(arguments);
        }
        intent.putExtra("platform", tPLoginMethod.getPlatform());
        intent.putExtra("is_login", true);
        startActivityForResult(intent, 1001);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TPLoginMethod tPLoginMethod;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f58523m = new ThirdPartyLoginView(getContext());
        Bundle arguments = getArguments();
        if (arguments != null) {
            tPLoginMethod = (TPLoginMethod) arguments.getParcelable("bundle_login_method");
        } else {
            tPLoginMethod = null;
        }
        if (tPLoginMethod == null) {
            C7573i.m23580a();
        }
        C23323e.m76514a((RemoteImageView) (AvatarImageView) m73019a((int) R.id.ic), tPLoginMethod.getUserInfo().getAvatarUrl());
        DmtTextView dmtTextView = (DmtTextView) m73019a((int) R.id.e8k);
        C7573i.m23582a((Object) dmtTextView, "userName");
        dmtTextView.setText(tPLoginMethod.getUserInfo().getUserName());
        ((DmtTextView) m73019a((int) R.id.bvc)).setOnClickListener(new C21854a(this, tPLoginMethod));
        ((DmtTextView) m73019a((int) R.id.dek)).setOnClickListener(new C21856b(this));
        ((AutoRTLImageView) m73019a((int) R.id.x_)).setOnClickListener(new C21857c(this));
        ThirdPartyLoginView thirdPartyLoginView = this.f58523m;
        if (thirdPartyLoginView != null) {
            thirdPartyLoginView.setEventType(this.f58304h);
        }
        ThirdPartyLoginView thirdPartyLoginView2 = this.f58523m;
        if (thirdPartyLoginView2 != null) {
            thirdPartyLoginView2.setPosition(this.f58305i);
        }
        ThirdPartyLoginView thirdPartyLoginView3 = this.f58523m;
        if (thirdPartyLoginView3 != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            thirdPartyLoginView3.setBundle(arguments2);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.or, viewGroup, false);
    }
}
