package com.p280ss.android.ugc.aweme.base.component;

import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0609a;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.analysis.C6863c;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisFragmentComponent */
public class AnalysisFragmentComponent extends C0609a {

    /* renamed from: a */
    private WeakReference<C6863c> f61326a;

    public void onFragmentResumed(C0608j jVar, Fragment fragment) {
        super.onFragmentResumed(jVar, fragment);
    }

    public void onFragmentStopped(C0608j jVar, Fragment fragment) {
        super.onFragmentStopped(jVar, fragment);
    }

    public void onFragmentAttached(C0608j jVar, Fragment fragment, Context context) {
        super.onFragmentAttached(jVar, fragment, context);
        if (fragment instanceof C6863c) {
            this.f61326a = new WeakReference<>((C6863c) fragment);
        }
    }
}
