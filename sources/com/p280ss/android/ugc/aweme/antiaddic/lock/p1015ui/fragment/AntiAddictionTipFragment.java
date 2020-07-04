package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.antiaddic.p1011b.C22559a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.AntiAddictionTipFragment */
public final class AntiAddictionTipFragment extends TimeLockCheckFragment {

    /* renamed from: h */
    public static final C22620a f60210h = new C22620a(null);

    /* renamed from: i */
    private HashMap f60211i;

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.AntiAddictionTipFragment$a */
    public static final class C22620a {
        private C22620a() {
        }

        /* renamed from: a */
        public static Fragment m74791a() {
            return new AntiAddictionTipFragment();
        }

        public /* synthetic */ C22620a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: e */
    public final void mo59331e() {
        if (this.f60211i != null) {
            this.f60211i.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo59331e();
    }

    public final void onDestroy() {
        super.onDestroy();
        if (C22603f.m74729e()) {
            C22603f.m74721a(false);
        }
    }

    /* renamed from: d */
    public final void mo59330d() {
        mo59317a((View) this.f60193e);
        C10761a.m31383a(C6399b.m19921a(), (int) R.string.e9a).mo25750a();
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl aj = a.mo60066aj();
        C7573i.m23582a((Object) aj, "CommonSharePrefCache.ins…hownAntiAddictionTipToday");
        aj.mo59871a(Boolean.valueOf(true));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onCloseAntiAddictionEvent(C22559a aVar) {
        C7573i.m23587b(aVar, "event");
        mo59317a((View) this.f60193e);
    }

    /* renamed from: d */
    private static boolean m74786d(String str) {
        if (TimeLockRuler.getUserSetting() != null) {
            CharSequence charSequence = str;
            TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
            C7573i.m23582a((Object) userSetting, "TimeLockRuler.getUserSetting()");
            if (TextUtils.equals(charSequence, userSetting.getPassword())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo59318b(String str) {
        if (C22598e.m74687f()) {
            mo59335c(str);
        } else if (m74786d(str)) {
            mo59330d();
        } else {
            C10761a.m31399c(C6399b.m19921a(), (int) R.string.fsw).mo25750a();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        C22603f.m74718a(view, "teen_mode", true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.n7, viewGroup, false);
    }
}
