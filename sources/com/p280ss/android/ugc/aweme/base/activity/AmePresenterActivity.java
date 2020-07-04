package com.p280ss.android.ugc.aweme.base.activity;

import android.os.Bundle;
import com.p280ss.android.ugc.bogut.library.factory.C43671a;
import com.p280ss.android.ugc.bogut.library.p1721a.C43668a;
import com.p280ss.android.ugc.bogut.library.view.C43674b;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmePresenterActivity */
public abstract class AmePresenterActivity<P extends C43668a> extends AmeSSActivity {

    /* renamed from: a */
    private C43674b<P> f61262a = new C43674b<>(C43671a.m138354a(getClass()));

    public void onPause() {
        super.onPause();
    }

    /* renamed from: a */
    public final P mo60496a() {
        return this.f61262a.mo105646a();
    }

    public void onResume() {
        super.onResume();
        this.f61262a.mo105648a((Object) this);
    }

    public void onDestroy() {
        this.f61262a.mo105651c();
        super.onDestroy();
        this.f61262a.mo105649a(!isChangingConfigurations());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("presenter_state", this.f61262a.mo105650b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f61262a.mo105647a(bundle.getBundle("presenter_state"));
        }
    }
}
