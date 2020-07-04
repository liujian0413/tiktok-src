package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.BaseLockActivity;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.mobile.p1400a.C33598a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.TimeLockAboutFragment */
public class TimeLockAboutFragment extends AmeBaseFragment {

    /* renamed from: e */
    private Button f60212e;

    /* renamed from: f */
    private View f60213f;

    /* renamed from: g */
    private TextView f60214g;

    /* renamed from: h */
    private ViewGroup f60215h;

    /* renamed from: i */
    private TextView f60216i;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo59334b(View view) {
        getActivity().onBackPressed();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59333a(View view) {
        C6907h.m21524a("open_teen_protection", (Map) C22984d.m75611a().f60753a);
        ((BaseLockActivity) getActivity()).mo59306a(C33598a.m108487a(TimeLockSetFragment.class).mo85932a());
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f60212e = (Button) view.findViewById(R.id.qk);
        this.f60216i = (TextView) view.findViewById(R.id.ap8);
        TextView textView = this.f60216i;
        if (C7213d.m22500a().mo18769ag() == 0 || C6399b.m19947w() || C6399b.m19946v()) {
            i = R.string.agk;
        } else {
            i = R.string.agl;
        }
        textView.setText(i);
        this.f60213f = view.findViewById(R.id.jo);
        this.f60213f.setOnClickListener(new C22624a(this));
        this.f60214g = (TextView) view.findViewById(R.id.title);
        this.f60214g.setText(getResources().getText(R.string.e9_));
        this.f60215h = (ViewGroup) view.findViewById(R.id.dke);
        if (C6399b.m19946v()) {
            this.f60215h.setBackgroundColor(getResources().getColor(R.color.a6c));
        }
        this.f60212e.setOnClickListener(new C22625b(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rh, viewGroup, false);
    }
}
