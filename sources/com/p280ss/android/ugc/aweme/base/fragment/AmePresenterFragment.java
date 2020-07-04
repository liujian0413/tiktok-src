package com.p280ss.android.ugc.aweme.base.fragment;

import android.os.Bundle;
import com.p280ss.android.ugc.bogut.library.factory.C43671a;
import com.p280ss.android.ugc.bogut.library.p1721a.C43668a;
import com.p280ss.android.ugc.bogut.library.view.C43674b;

/* renamed from: com.ss.android.ugc.aweme.base.fragment.AmePresenterFragment */
public abstract class AmePresenterFragment<P extends C43668a> extends AmeBaseFragment {

    /* renamed from: e */
    private C43674b<P> f61414e = new C43674b<>(C43671a.m138354a(getClass()));

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f61414e.mo105648a((Object) this);
    }

    public void onDestroy() {
        this.f61414e.mo105651c();
        super.onDestroy();
        this.f61414e.mo105649a(!getActivity().isChangingConfigurations());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("presenter_state", this.f61414e.mo105650b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f61414e.mo105647a(bundle.getBundle("presenter_state"));
        }
    }
}
