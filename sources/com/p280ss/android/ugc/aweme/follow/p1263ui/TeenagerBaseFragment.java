package com.p280ss.android.ugc.aweme.follow.p1263ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.SetTimeLockActivity;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.follow.ui.TeenagerBaseFragment */
public abstract class TeenagerBaseFragment extends AmeBaseFragment {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo75552a();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo75554d();

    /* renamed from: b */
    private void m97073b(View view) {
        if (!C6399b.m19944t()) {
            View findViewById = view.findViewById(R.id.xp);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new C29547b(this));
        }
    }

    /* renamed from: c */
    private void m97074c(View view) {
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.e33);
        if (dmtTextView != null) {
            dmtTextView.setText(mo75552a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo75553a(View view) {
        if (getActivity() != null && !getActivity().isFinishing()) {
            C6907h.m21524a("enter_teen_mode", (Map) C22984d.m75611a().mo59973a("enter_from", mo75554d()).f60753a);
            if (TimeLockRuler.isParentalPlatformContentFilterOn()) {
                ParentalPlatformManager.m74625a((Activity) getActivity());
            } else if (TimeLockRuler.isSelfContentFilterOn() || ((Boolean) C23060u.m75742a().mo60079i().mo59877d()).booleanValue()) {
                SetTimeLockActivity.m74746a(getActivity(), 1);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.r_, viewGroup, false);
        m97073b(inflate);
        m97074c(inflate);
        return inflate;
    }
}
