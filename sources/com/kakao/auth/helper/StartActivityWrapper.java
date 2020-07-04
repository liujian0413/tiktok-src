package com.kakao.auth.helper;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;

public class StartActivityWrapper {
    private Activity activity;
    private Fragment fragment;
    private android.support.p022v4.app.Fragment supportFragment;

    public Activity getActivity() {
        return this.activity;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    public android.support.p022v4.app.Fragment getSupportFragment() {
        return this.supportFragment;
    }

    public Context getContext() {
        if (this.activity != null) {
            return this.activity;
        }
        if (this.fragment != null) {
            return this.fragment.getActivity();
        }
        if (this.supportFragment != null) {
            return this.supportFragment.getActivity();
        }
        throw new IllegalStateException("StartActivityWrapper does not contain any activity or fragment.");
    }

    public StartActivityWrapper(Activity activity2) {
        this.activity = activity2;
    }

    public StartActivityWrapper(Fragment fragment2) {
        this.fragment = fragment2;
    }

    public StartActivityWrapper(android.support.p022v4.app.Fragment fragment2) {
        this.supportFragment = fragment2;
    }

    public void startActivity(Intent intent) {
        if (this.activity != null) {
            this.activity.startActivity(intent);
        } else if (this.fragment != null) {
            this.fragment.startActivity(intent);
        } else if (this.supportFragment != null) {
            this.supportFragment.startActivity(intent);
        } else {
            throw new IllegalStateException("StartActivityWrapper does not contain any activity or fragment.");
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        if (this.activity != null) {
            this.activity.startActivityForResult(intent, i);
        } else if (this.fragment != null) {
            this.fragment.startActivityForResult(intent, i);
        } else if (this.supportFragment != null) {
            this.supportFragment.startActivityForResult(intent, i);
        } else {
            throw new IllegalStateException("StartActivityWrapper does not contain any activity or fragment.");
        }
    }
}
