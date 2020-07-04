package com.gyf.barlibrary;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;

public class ImmersionProxy {
    private Fragment mFragment;
    private ImmersionOwner mImmersionOwner;
    private boolean mIsActivityCreated;
    private boolean mIsLazyAfterView;
    private boolean mIsLazyBeforeView;

    public boolean isUserVisibleHint() {
        if (this.mFragment != null) {
            return this.mFragment.mUserVisibleHint;
        }
        return false;
    }

    public void onPause() {
        if (this.mFragment != null) {
            this.mImmersionOwner.onInvisible();
        }
    }

    public void onResume() {
        if (this.mFragment != null && this.mFragment.mUserVisibleHint) {
            this.mImmersionOwner.onVisible();
        }
    }

    public void onDestroy() {
        if (!(this.mFragment == null || this.mFragment.getActivity() == null || !this.mImmersionOwner.immersionBarEnabled())) {
            ImmersionBar.with(this.mFragment).destroy();
        }
        this.mFragment = null;
        this.mImmersionOwner = null;
    }

    public void onHiddenChanged(boolean z) {
        if (this.mFragment != null) {
            this.mFragment.setUserVisibleHint(!z);
        }
    }

    public ImmersionProxy(Fragment fragment) {
        this.mFragment = fragment;
        if (fragment instanceof ImmersionOwner) {
            this.mImmersionOwner = (ImmersionOwner) fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment请实现ImmersionOwner接口");
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.mFragment != null && this.mFragment.mUserVisibleHint) {
            if (this.mImmersionOwner.immersionBarEnabled()) {
                this.mImmersionOwner.initImmersionBar();
            }
            this.mImmersionOwner.onVisible();
        }
    }

    public void onCreate(Bundle bundle) {
        if (this.mFragment != null && this.mFragment.mUserVisibleHint && !this.mIsLazyBeforeView) {
            this.mImmersionOwner.onLazyBeforeView();
            this.mIsLazyBeforeView = true;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        this.mIsActivityCreated = true;
        if (this.mFragment != null && this.mFragment.mUserVisibleHint) {
            if (this.mImmersionOwner.immersionBarEnabled()) {
                this.mImmersionOwner.initImmersionBar();
            }
            if (!this.mIsLazyAfterView) {
                this.mImmersionOwner.onLazyAfterView();
                this.mIsLazyAfterView = true;
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (this.mFragment != null) {
            if (this.mFragment.mUserVisibleHint) {
                if (!this.mIsLazyBeforeView) {
                    this.mImmersionOwner.onLazyBeforeView();
                    this.mIsLazyBeforeView = true;
                }
                if (this.mIsActivityCreated && this.mFragment.mUserVisibleHint) {
                    if (this.mImmersionOwner.immersionBarEnabled()) {
                        this.mImmersionOwner.initImmersionBar();
                    }
                    if (!this.mIsLazyAfterView) {
                        this.mImmersionOwner.onLazyAfterView();
                        this.mIsLazyAfterView = true;
                    }
                    this.mImmersionOwner.onVisible();
                }
            } else if (this.mIsActivityCreated) {
                this.mImmersionOwner.onInvisible();
            }
        }
    }
}
