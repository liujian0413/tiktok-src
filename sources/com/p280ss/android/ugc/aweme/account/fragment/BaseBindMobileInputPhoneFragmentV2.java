package com.p280ss.android.ugc.aweme.account.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.account.p982ui.BindMobileInputPhoneFragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.fragment.BaseBindMobileInputPhoneFragmentV2 */
public abstract class BaseBindMobileInputPhoneFragmentV2 extends BindMobileInputPhoneFragment {

    /* renamed from: e */
    DmtTextView f56949e;

    /* renamed from: a */
    public abstract void mo57105a();

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f56949e.setTextColor(getResources().getColor(R.color.ab6));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.n9, viewGroup, false);
        this.f58332m = inflate.findViewById(R.id.br0);
        this.f58333n = (TextView) inflate.findViewById(R.id.dsy);
        this.f58334o = (EditText) inflate.findViewById(R.id.acd);
        this.f58335p = inflate.findViewById(R.id.cb0);
        this.f56949e = (DmtTextView) inflate.findViewById(R.id.di4);
        if (this.f56949e != null) {
            this.f56949e.setOnClickListener(new C21177a(this));
        }
        return inflate;
    }
}
