package com.p280ss.android.ugc.aweme.base.mvvm.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.mvvm.C23359d;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;

/* renamed from: com.ss.android.ugc.aweme.base.mvvm.impl.IViewDefault */
public abstract class IViewDefault<K extends C23360e> implements C23359d<K> {
    protected View mView;

    public View getAndroidView() {
        return this.mView;
    }

    public void refresh() {
    }

    public Activity getActivity() {
        return (Activity) getAndroidView().getContext();
    }

    public Context getContext() {
        return getAndroidView().getContext();
    }

    public IViewDefault(Context context) {
    }
}
