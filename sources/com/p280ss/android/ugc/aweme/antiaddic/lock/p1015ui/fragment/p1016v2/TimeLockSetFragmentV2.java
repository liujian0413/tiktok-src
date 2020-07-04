package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.BaseLockActivity;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.AbsTimeLockSettingFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockSetFragmentV2 */
public class TimeLockSetFragmentV2 extends AbsTimeLockSettingFragment {
    /* renamed from: b */
    public final void mo59318b(String str) {
        ((BaseLockActivity) getActivity()).mo59306a((Fragment) TimeLockConfirmFragmentV2.m74865a(str, this.f60205h));
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.dhx);
        TextView textView2 = (TextView) view.findViewById(R.id.dhw);
        if (this.f60205h) {
            textView.setText(getString(R.string.e94));
            textView2.setVisibility(4);
            return;
        }
        if (mo59327d() == 0) {
            i = R.string.e95;
        } else {
            i = R.string.e96;
        }
        textView2.setText(getString(i));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qu, viewGroup, false);
    }
}
