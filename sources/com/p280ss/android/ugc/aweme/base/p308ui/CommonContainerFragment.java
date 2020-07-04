package com.p280ss.android.ugc.aweme.base.p308ui;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.CommonContainerFragment */
public abstract class CommonContainerFragment extends CommonPageFragment {

    /* renamed from: e */
    public Fragment f61679e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo60917a();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Fragment mo60918d();

    /* renamed from: f */
    private void m76811f() {
        if (this.f61679e == null) {
            this.f61679e = getChildFragmentManager().mo2644a(mo60917a());
            if (this.f61679e == null) {
                this.f61679e = mo60918d();
            }
            m76810a(this.f61679e, mo60917a());
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (isViewValid()) {
            if (z) {
                m76811f();
            }
            if (this.f61679e != null) {
                this.f61679e.setUserVisibleHint(z);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* renamed from: a */
    private void m76810a(Fragment fragment, String str) {
        C0633q a = getChildFragmentManager().mo2645a();
        a.mo2600b(R.id.a19, fragment, str);
        a.mo2606d();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ps, viewGroup, false);
    }
}
