package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2.TimeLockAboutFragmentV2.C22647a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.setting.p337ui.RadioSettingItem;
import com.p280ss.android.ugc.aweme.setting.p337ui.RadioSettingItem.C37804a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockSelectTimeFragmentV2 */
public class TimeLockSelectTimeFragmentV2 extends AmeBaseFragment {
    ViewGroup mContainerLayout;
    TextView mTitle;

    public void back() {
        getActivity().onBackPressed();
    }

    /* renamed from: a */
    private void m74882a() {
        final C0052o<C22647a> oVar = ((TimeLockOptionViewModel) C0069x.m159a(getActivity()).mo147a(TimeLockOptionViewModel.class)).f60314a;
        this.mTitle.setText(getString(R.string.e84));
        Iterator it = C22647a.f60282a.iterator();
        while (it.hasNext()) {
            final C22647a aVar = (C22647a) it.next();
            RadioSettingItem radioSettingItem = new RadioSettingItem(getContext());
            boolean z = false;
            radioSettingItem.setStartText(getString(R.string.e8w, Integer.valueOf(aVar.f60283b)));
            radioSettingItem.setOnSettingItemClickListener(new C37804a() {
                /* renamed from: a */
                public final boolean mo59376a(View view) {
                    oVar.setValue(aVar);
                    return false;
                }
            });
            if (((C22647a) oVar.getValue()).f60283b == aVar.f60283b) {
                z = true;
            }
            radioSettingItem.setChecked(z);
            radioSettingItem.setRippleColor(getResources().getColor(R.color.yu));
            radioSettingItem.setRippleDelayClick(true);
            radioSettingItem.setRippleOverlay(true);
            radioSettingItem.setRippleHover(true);
            this.mContainerLayout.addView(radioSettingItem, this.mContainerLayout.getChildCount());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m74882a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rl, viewGroup, false);
    }
}
