package com.gyf.barlibrary;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;

public class SimpleImmersionProxy {
    private Fragment mFragment;
    private boolean mIsActivityCreated;
    private SimpleImmersionOwner mSimpleImmersionOwner;

    public boolean isUserVisibleHint() {
        if (this.mFragment != null) {
            return this.mFragment.mUserVisibleHint;
        }
        return false;
    }

    private void setImmersionBar() {
        if (this.mFragment != null && this.mIsActivityCreated && this.mFragment.mUserVisibleHint && this.mSimpleImmersionOwner.immersionBarEnabled()) {
            this.mSimpleImmersionOwner.initImmersionBar();
        }
    }

    public void onDestroy() {
        if (!(this.mFragment == null || this.mFragment.getActivity() == null || !this.mSimpleImmersionOwner.immersionBarEnabled())) {
            ImmersionBar.with(this.mFragment).destroy();
        }
        this.mFragment = null;
        this.mSimpleImmersionOwner = null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        setImmersionBar();
    }

    public void setUserVisibleHint(boolean z) {
        setImmersionBar();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mIsActivityCreated = true;
        setImmersionBar();
    }

    public void onHiddenChanged(boolean z) {
        if (this.mFragment != null) {
            this.mFragment.setUserVisibleHint(!z);
        }
    }

    public SimpleImmersionProxy(Fragment fragment) {
        this.mFragment = fragment;
        if (fragment instanceof SimpleImmersionOwner) {
            this.mSimpleImmersionOwner = (SimpleImmersionOwner) fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment请实现SimpleImmersionOwner接口");
    }
}
