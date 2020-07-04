package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.BaseLockActivity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22612c;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22658a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a.C23469a;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23470b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.AbsOptionsFragmentV2 */
public abstract class AbsOptionsFragmentV2 extends AmeBaseFragment {

    /* renamed from: e */
    protected Button f60260e;

    /* renamed from: f */
    protected Button f60261f;

    /* renamed from: g */
    protected View f60262g;

    /* renamed from: h */
    protected TimeLockUserSetting f60263h;

    /* renamed from: i */
    private DmtStatusView f60264i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo59360a();

    /* renamed from: f */
    private void mo59374f() {
        if (mo59364d() != null) {
            ParentalPlatformManager.m74629a(((C22658a) mo59364d().getValue()).f60316b.f60317a, getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final LiveData<C22658a> mo59364d() {
        if (getActivity() == null) {
            return null;
        }
        return ((SetLockParamViewModel) C0069x.m159a(getActivity()).mo147a(SetLockParamViewModel.class)).f60313a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo59365e() {
        if (mo59364d() == null || ((C22658a) mo59364d().getValue()).f60316b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo59362a(Fragment fragment) {
        ((BaseLockActivity) getActivity()).mo59306a(fragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59361a(final int i) {
        HashMap hashMap = new HashMap();
        if (i == 1) {
            hashMap.put("teen_mode", "0");
        } else {
            hashMap.put("screen_time_management", "0");
        }
        if (mo59364d() != null) {
            C18253l a = ParentalPlatformApi.m74659a(((C22658a) mo59364d().getValue()).f60316b.f60317a, hashMap);
            if (a != null) {
                C18246h.m60213a(a, new C18245g<BaseResponse>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onSuccess(BaseResponse baseResponse) {
                        C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                            public final Object call() throws Exception {
                                int i;
                                if (i == 1) {
                                    i = R.string.dgr;
                                } else {
                                    i = R.string.e8l;
                                }
                                String string = C6399b.m19921a().getString(i);
                                if (AbsOptionsFragmentV2.this.getActivity() != null) {
                                    string = AbsOptionsFragmentV2.this.getActivity().getString(i);
                                }
                                C10761a.m31387a(C6399b.m19921a(), string).mo25750a();
                                C22603f.m74727c(AbsOptionsFragmentV2.this.getActivity(), i);
                                return null;
                            }
                        }, C1592h.f5958b);
                    }

                    public final void onFailure(final Throwable th) {
                        C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
                            public final Object call() throws Exception {
                                C22814a.m75244a(AbsOptionsFragmentV2.this.getContext(), th);
                                return null;
                            }
                        }, C1592h.f5958b);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59363a(View view) {
        if (mo59365e()) {
            mo59374f();
            return;
        }
        Fragment b = C22612c.m74772b(2);
        C23470b.m77051a().mo61084a("TimeLockEnterFragmentV2", Boolean.class).mo61079a((C0043i) b).mo61081a(this, new C23469a<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo59227a(Boolean bool) {
                AbsOptionsFragmentV2.this.mo59362a(C22612c.m74771a(true));
            }
        });
        mo59362a(b);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f60260e = (Button) view.findViewById(R.id.qk);
        this.f60262g = view.findViewById(R.id.jo);
        this.f60262g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                AbsOptionsFragmentV2.this.getActivity().onBackPressed();
            }
        });
        this.f60264i = (DmtStatusView) view.findViewById(R.id.dav);
        this.f60264i.setBuilder(C10803a.m31631a((Context) getActivity()));
        this.f60263h = TimeLockRuler.getUserSetting();
        this.f60261f = (Button) view.findViewById(R.id.qj);
        this.f60260e.setOnClickListener(new C22654c(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(mo59360a(), viewGroup, false);
    }
}
