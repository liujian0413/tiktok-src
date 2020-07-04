package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1013a.C22587a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1014b.C22595a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.BaseLockActivity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22612c;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockAboutFragmentV2.C22647a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22658a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a.C23469a;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23470b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.AbsAboutFragmentV2 */
public abstract class AbsAboutFragmentV2 extends AmeBaseFragment implements C22595a {

    /* renamed from: e */
    protected Button f60249e;

    /* renamed from: f */
    protected View f60250f;

    /* renamed from: g */
    protected DmtTextView f60251g;

    /* renamed from: h */
    protected C22587a f60252h;

    /* renamed from: i */
    private DmtStatusView f60253i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo59351a();

    /* renamed from: f */
    public final void mo59247f() {
        m74827n();
    }

    /* renamed from: k */
    private void m74824k() {
        this.f60252h = new C22587a();
        this.f60252h.mo59229a((C22595a) this);
    }

    /* renamed from: n */
    private void m74827n() {
        if (this.f60253i != null) {
            this.f60253i.mo25939d();
        }
    }

    /* renamed from: d */
    public final int mo59354d() {
        return ((C22658a) ((SetLockParamViewModel) C0069x.m159a(getActivity()).mo147a(SetLockParamViewModel.class)).f60313a.getValue()).f60315a;
    }

    /* renamed from: g */
    public final void mo59248g() {
        m74827n();
        C22598e.f60167a.mo59252a(getActivity(), mo59354d(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final LiveData<C22658a> mo59356i() {
        if (getActivity() == null) {
            return null;
        }
        return ((SetLockParamViewModel) C0069x.m159a(getActivity()).mo147a(SetLockParamViewModel.class)).f60313a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo59357j() {
        if (mo59356i() == null || ((C22658a) mo59356i().getValue()).f60316b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m74825l() {
        Fragment fragment;
        if (!C22598e.m74687f()) {
            return false;
        }
        if (!C22598e.f60167a.mo59257g()) {
            fragment = C22612c.m74771a(false);
        } else {
            fragment = C22612c.m74769a();
            C23470b.m77051a().mo61084a("TimeLockEnterFragmentV2", Boolean.class).mo61079a((C0043i) fragment).mo61081a(this, new C23469a() {
                /* renamed from: a */
                public final void mo59227a(Object obj) {
                    C22598e.f60167a.mo59252a(AbsAboutFragmentV2.this.getActivity(), AbsAboutFragmentV2.this.mo59354d(), false);
                }
            });
        }
        m74822a(fragment);
        return true;
    }

    /* renamed from: m */
    private void m74826m() {
        HashMap hashMap = new HashMap();
        if (mo59354d() == 0) {
            hashMap.put("screen_time_management", String.valueOf(((C22647a) ((TimeLockOptionViewModel) C0069x.m159a(getActivity()).mo147a(TimeLockOptionViewModel.class)).f60314a.getValue()).f60283b));
        } else {
            hashMap.put("teen_mode", "1");
        }
        if (mo59356i() != null) {
            C18253l a = ParentalPlatformApi.m74659a(((C22658a) mo59356i().getValue()).f60316b.f60317a, hashMap);
            if (a != null) {
                C18246h.m60213a(a, new C18245g<BaseResponse>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onSuccess(BaseResponse baseResponse) {
                        C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                            public final Object call() throws Exception {
                                C22603f.m74716a(AbsAboutFragmentV2.this.getActivity(), AbsAboutFragmentV2.this.mo59354d());
                                return null;
                            }
                        }, C1592h.f5958b);
                    }

                    public final void onFailure(final Throwable th) {
                        C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                            public final Object call() throws Exception {
                                C22814a.m75244a(AbsAboutFragmentV2.this.getContext(), th);
                                return null;
                            }
                        }, C1592h.f5958b);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo59355e() {
        if (mo59357j()) {
            m74826m();
        } else if (!m74825l()) {
            if (TimeLockRuler.getUserSetting() == null) {
                m74822a(C22612c.m74771a(false));
                return;
            }
            if (!C6399b.m19944t()) {
                TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                if (!userSetting.isContentFilterOn() && !userSetting.isTimeLockOn()) {
                    TimeLockRuler.removeUserSetting();
                    m74822a(C22612c.m74771a(false));
                    return;
                }
            }
            Fragment a = C22612c.m74769a();
            C23470b.m77051a().mo61084a("TimeLockEnterFragmentV2", Boolean.class).mo61079a((C0043i) a).mo61081a(this, new C23469a() {
                /* renamed from: a */
                public final void mo59227a(Object obj) {
                    C22603f.m74717a(AbsAboutFragmentV2.this.getActivity(), AbsAboutFragmentV2.this.mo59354d(), TimeLockRuler.getUserSetting());
                }
            });
            m74822a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59352a(View view) {
        mo59355e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo59353b(View view) {
        getActivity().onBackPressed();
    }

    /* renamed from: a */
    private void m74822a(Fragment fragment) {
        ((BaseLockActivity) getActivity()).mo59306a(fragment);
    }

    /* renamed from: c */
    private void m74823c(View view) {
        this.f60249e.setOnClickListener(new C22653b(this));
        this.f60253i = (DmtStatusView) view.findViewById(R.id.dav);
        this.f60253i.setBuilder(C10803a.m31631a((Context) getActivity()));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60249e = (Button) view.findViewById(R.id.qk);
        this.f60251g = (DmtTextView) view.findViewById(R.id.dj9);
        this.f60250f = view.findViewById(R.id.jo);
        this.f60250f.setOnClickListener(new C22652a(this));
        m74823c(view);
        m74824k();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(mo59351a(), viewGroup, false);
    }
}
