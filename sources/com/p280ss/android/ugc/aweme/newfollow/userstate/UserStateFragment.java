package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0688e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29359f;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.C29400c;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36341a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43076dy;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateFragment */
public class UserStateFragment extends ProfileListFragment implements C25676d, C25766a {

    /* renamed from: e */
    public C34186g f89104e;

    /* renamed from: f */
    public boolean f89105f;

    /* renamed from: g */
    public C36341a f89106g;

    /* renamed from: h */
    protected long f89107h = -1;

    /* renamed from: i */
    public String f89108i;

    /* renamed from: j */
    public int f89109j;

    /* renamed from: k */
    public String f89110k;

    /* renamed from: l */
    protected String f89111l;

    /* renamed from: m */
    public boolean f89112m = true;

    /* renamed from: n */
    private C34185f f89113n;

    /* renamed from: o */
    private C34180a f89114o;

    /* renamed from: p */
    private C29359f f89115p;

    /* renamed from: q */
    private BroadcastReceiver f89116q;

    /* renamed from: r */
    private boolean f89117r;

    /* renamed from: s */
    private boolean f89118s;

    /* renamed from: t */
    private boolean f89119t;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo61742a(List list, int i) {
    }

    public final boolean aO_() {
        return this.f89112m;
    }

    public final void aT_() {
    }

    /* renamed from: c_ */
    public final void mo61747c_(int i) {
    }

    public void onDetach() {
        super.onDetach();
    }

    /* renamed from: l */
    public final boolean mo86908l() {
        return TextUtils.equals(this.f89110k, C21115b.m71197a().getCurUserId());
    }

    public void onStop() {
        super.onStop();
        if (this.f89104e != null) {
            this.f89104e.mo75169g();
        }
        this.f89105f = false;
    }

    /* renamed from: m */
    private C34185f m110247m() {
        if (this.f89113n == null) {
            this.f89113n = new C34185f(this);
            this.f89113n.f89153p = this.f89108i;
            this.f89113n.f89154q = this.f89110k;
        }
        return this.f89113n;
    }

    public final void aS_() {
        if (isViewValid() && this.f89104e != null && this.f89104e.f77423b.getChildCount() > 0) {
            this.f89104e.f77423b.mo5561d(0);
        }
    }

    /* renamed from: i */
    public final void mo86906i() {
        if (this.f89104e != null && this.f89104e.f77427f != null) {
            ((UserStateFeedAdapter) this.f89104e.f77427f).ai_();
            ((UserStateFeedAdapter) this.f89104e.f77427f).mo66502g();
        }
    }

    /* renamed from: j */
    public final View mo61750j() {
        if (!isViewValid() || this.f89104e == null) {
            return null;
        }
        return this.f89104e.f77423b;
    }

    public void onPause() {
        super.onPause();
        this.f18760c_ = false;
        if (this.f89104e != null) {
            this.f89104e.mo75171h();
        }
        this.f89105f = false;
    }

    public void onResume() {
        super.onResume();
        if (this.mUserVisibleHint && !C43076dy.m136656a()) {
            if (this.f89104e != null) {
                this.f89104e.mo75168f();
            }
            this.f89105f = true;
        }
    }

    public final void aQ_() {
        if (this.f89117r) {
            mo86907k();
            return;
        }
        if (!this.f89119t && !TimeLockRuler.isTeenModeON()) {
            mo86905g();
        } else if (this.f89104e != null) {
            this.f89104e.mo86920l();
        }
    }

    /* renamed from: k */
    public final void mo86907k() {
        if (isViewValid()) {
            if (this.f89104e != null) {
                this.f89104e.mo86921m();
            }
            if (this.f89106g != null) {
                this.f89106g.mo91881a("personal_homepage".equals(this.f89108i), 5);
            }
        }
    }

    /* renamed from: g */
    public final boolean mo86905g() {
        if (!isViewValid() || TimeLockRuler.isTeenModeON()) {
            return false;
        }
        if (!C34192k.m110388a(getActivity())) {
            if (!this.f89112m) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            }
            this.f89112m = true;
            return false;
        }
        this.f89112m = false;
        boolean z = !this.f89113n.mo66540i();
        if (!TextUtils.isEmpty(C21115b.m71197a().getCurUserId()) && this.f89104e != null) {
            this.f89104e.mo60744a();
        }
        return z;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f89113n != null) {
            this.f89113n.mo59134U_();
            this.f89113n.mo66535W_();
            this.f89113n.mo75070g();
            this.f89113n.mo75069f();
        }
        if (this.f89115p != null) {
            this.f89115p.mo59134U_();
            this.f89115p.mo66535W_();
            this.f89115p.mo75087g();
        }
        if (this.f89104e != null) {
            this.f89104e.mo75173j();
        }
        C0688e.m2941a(getContext()).mo2837a(this.f89116q);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    /* renamed from: c_ */
    public final void mo86064c_(boolean z) {
        this.f89119t = z;
    }

    /* renamed from: b */
    public final void mo86903b(boolean z) {
        this.f89117r = z;
        if (this.f89104e != null) {
            this.f89104e.f89161q = z;
        }
    }

    /* renamed from: c */
    public final void mo86904c(boolean z) {
        this.f89118s = z;
        if (this.f89104e != null) {
            this.f89104e.f89162r = z;
        }
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str != null && str.contains("/aweme/v1/forward/list/?")) {
            C42961az.m136385f(aVar);
            mo86905g();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f89108i = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE");
        this.f89110k = arguments.getString("uid");
        this.f89111l = arguments.getString("sec_user_id");
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f89104e != null) {
            this.f89104e.mo75165c(z);
        }
        if (z) {
            if (this.f89104e != null) {
                this.f89104e.mo75168f();
            }
        } else if (this.f89104e != null) {
            this.f89104e.mo75171h();
        }
    }

    /* renamed from: a */
    public final void mo65501a(String str, String str2) {
        if (!TextUtils.isEmpty(str) || this.f89104e != null) {
            this.f89110k = str;
            this.f89111l = str2;
            if (this.f89104e != null) {
                this.f89104e.mo86918b(str, str2);
            }
            this.f89112m = true;
            if (this.f89113n != null) {
                this.f89113n.f89154q = this.f89110k;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f89115p = new C29359f(this.f89108i, this.f89109j);
        this.f89115p.mo75086f();
        this.f89104e = new C34186g(this.f89110k, this.f89111l, mo86908l());
        this.f89115p.mo66536a(new C28471v());
        this.f89115p.mo66537a((C29400c) this.f89104e);
        this.f89116q = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && UserStateFragment.this.mUserVisibleHint && UserStateFragment.this.f18760c_ && !UserStateFragment.this.f89105f) {
                    if (UserStateFragment.this.f89104e != null) {
                        UserStateFragment.this.f89104e.mo75168f();
                    }
                    UserStateFragment.this.f89105f = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0688e.m2941a(getContext()).mo2838a(this.f89116q, intentFilter);
        this.f89113n = m110247m();
        this.f89113n.mo75055a((Fragment) this, this.f89109j);
        this.f89113n.mo66537a(this.f89104e);
        this.f89104e.mo86916a(this, view, this.f89113n, this.f89115p);
        this.f89114o = new C34180a();
        this.f89113n.mo66536a(this.f89114o);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rr, viewGroup, false);
    }

    /* renamed from: a */
    public static UserStateFragment m110246a(String str, String str2, String str3) {
        UserStateFragment userStateFragment = new UserStateFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", str);
        bundle.putString("uid", str2);
        bundle.putString("sec_user_id", str3);
        userStateFragment.setArguments(bundle);
        return userStateFragment;
    }
}
