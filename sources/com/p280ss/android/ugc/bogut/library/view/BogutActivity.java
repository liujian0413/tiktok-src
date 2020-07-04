package com.p280ss.android.ugc.bogut.library.view;

import android.app.Activity;
import android.os.Bundle;
import com.p280ss.android.ugc.bogut.library.factory.C43671a;
import com.p280ss.android.ugc.bogut.library.p1721a.C43668a;

/* renamed from: com.ss.android.ugc.bogut.library.view.BogutActivity */
public abstract class BogutActivity<P extends C43668a> extends Activity {

    /* renamed from: a */
    private C43674b<P> f113025a = new C43674b<>(C43671a.m138354a(getClass()));

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f113025a.mo105649a(!isChangingConfigurations());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f113025a.mo105651c();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f113025a.mo105648a((Object) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("presenter_state", this.f113025a.mo105650b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f113025a.mo105647a(bundle.getBundle("presenter_state"));
        }
    }
}
