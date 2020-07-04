package com.gyf.barlibrary;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;

public abstract class SimpleImmersionFragment extends Fragment implements SimpleImmersionOwner {
    private SimpleImmersionProxy mSimpleImmersionProxy = new SimpleImmersionProxy(this);

    public boolean immersionBarEnabled() {
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mSimpleImmersionProxy.onDestroy();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mSimpleImmersionProxy.onActivityCreated(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mSimpleImmersionProxy.onConfigurationChanged(configuration);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.mSimpleImmersionProxy.onHiddenChanged(z);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.mSimpleImmersionProxy.setUserVisibleHint(z);
    }
}
