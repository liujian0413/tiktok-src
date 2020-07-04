package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeUnlockFragment */
public class TimeUnlockFragment extends TimeLockCheckFragment {
    TextView desc;

    /* renamed from: h */
    private String f60235h;
    TextView title;

    /* renamed from: g */
    public final void mo59248g() {
        super.mo59248g();
        mo59330d();
    }

    /* renamed from: i */
    private String m74814i() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("from");
        }
        return "";
    }

    /* renamed from: j */
    private boolean m74815j() {
        if (TextUtils.equals(this.f60235h, "logout") || TextUtils.equals(this.f60235h, "add_account") || TextUtils.equals(this.f60235h, "switch_account")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo59330d() {
        if (getActivity() != null) {
            getActivity().finish();
        }
        mo59317a((View) this.f60193e);
        C23468a c = C22603f.m74726c();
        if (c != null) {
            c.mo61083a(Boolean.valueOf(true));
            return;
        }
        if (m74815j()) {
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.e9a).mo25750a();
            SharePrefCache.inst().getLastUnlockTime().mo59871a(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: d */
    private void m74813d(String str) {
        C18246h.m60213a(ParentalPlatformApi.m74658a(str), new C18245g<BaseResponse>() {
            /* renamed from: a */
            static final /* synthetic */ Object m74819a() throws Exception {
                C23468a c = C22603f.m74726c();
                if (c != null) {
                    c.mo61083a(Boolean.valueOf(true));
                } else {
                    C10761a.m31383a(C6399b.m19921a(), (int) R.string.e9a).mo25750a();
                    SharePrefCache.inst().getLastUnlockTime().mo59871a(Long.valueOf(System.currentTimeMillis()));
                }
                return null;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Object mo59343a(Throwable th) throws Exception {
                C22814a.m75244a(TimeUnlockFragment.this.getContext(), th);
                return null;
            }

            public final void onFailure(Throwable th) {
                C1592h.m7855a((Callable<TResult>) new C22632i<TResult>(this, th), C1592h.f5958b);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(BaseResponse baseResponse) {
                TimeUnlockFragment.this.getActivity().finish();
                TimeUnlockFragment.this.mo59317a((View) TimeUnlockFragment.this.f60193e);
                C1592h.m7855a(C22631h.f60246a, C1592h.f5958b);
            }
        });
    }

    /* renamed from: a */
    private static String m74812a(C23468a<Boolean> aVar) {
        if (aVar == null) {
            return "time_lock";
        }
        if (TimeLockRuler.isContentFilterOn()) {
            return "teen_mode";
        }
        return "time_lock";
    }

    /* renamed from: a */
    private int m74811a(boolean z) {
        if (!z) {
            return R.string.e9d;
        }
        if (TextUtils.equals(this.f60235h, "add_account")) {
            return R.string.ej;
        }
        if (TextUtils.equals(this.f60235h, "switch_account")) {
            return R.string.e4h;
        }
        if (!C21115b.m71197a().isLogin()) {
            return R.string.doi;
        }
        return R.string.e9c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo59318b(String str) {
        if (ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD) {
            m74813d(str);
        } else if (C22598e.m74687f()) {
            mo59335c(str);
        } else if (str == null || TimeLockRuler.getUserSetting() == null || !str.equals(TimeLockRuler.getUserSetting().getPassword())) {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.e9i).mo25750a();
        } else {
            mo59330d();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        C23468a c = C22603f.m74726c();
        C22603f.m74718a(view, m74812a(c), false);
        this.f60235h = m74814i();
        if (c != null) {
            boolean isContentFilterOn = TimeLockRuler.isContentFilterOn();
            this.desc.setText(getString(m74811a(isContentFilterOn)));
            TextView textView = this.title;
            if (isContentFilterOn) {
                i = R.string.e9g;
            } else {
                i = R.string.e9h;
            }
            textView.setText(getString(i));
            ImageView imageView = (ImageView) view.findViewById(R.id.dji);
            if (C6399b.m19946v()) {
                imageView.setImageResource(R.drawable.adc);
            }
            imageView.setVisibility(0);
            imageView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (TimeUnlockFragment.this.f60193e != null) {
                        TimeUnlockFragment.this.mo59317a((View) TimeUnlockFragment.this.f60193e);
                    }
                    if (TimeUnlockFragment.this.getActivity() != null) {
                        TimeUnlockFragment.this.getActivity().finish();
                    }
                }
            });
            return;
        }
        int lockTimeInMin = TimeLockRuler.getLockTimeInMin();
        String string = getString(R.string.e9e, getString(R.string.e8w, Integer.valueOf(lockTimeInMin)));
        if (C6399b.m19944t()) {
            this.desc.setText(string);
            return;
        }
        Spannable newSpannable = Factory.getInstance().newSpannable(string);
        String string2 = getString(R.string.e8w, Integer.valueOf(lockTimeInMin));
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            int indexOf = string.indexOf(string2);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.a72));
            if (string2.length() + indexOf < string.length()) {
                newSpannable.setSpan(foregroundColorSpan, indexOf, string2.length() + indexOf, 17);
                if (this.desc != null) {
                    this.desc.setText(newSpannable);
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.og, viewGroup, false);
    }
}
