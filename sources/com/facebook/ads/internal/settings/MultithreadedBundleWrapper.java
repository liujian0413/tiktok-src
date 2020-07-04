package com.facebook.ads.internal.settings;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

public class MultithreadedBundleWrapper {
    private final Bundle mBundle = new Bundle();

    public Bundle toBundle() {
        return new Bundle(this.mBundle);
    }

    public synchronized boolean getBoolean(String str) {
        return this.mBundle.getBoolean(str);
    }

    public synchronized Serializable getSerializable(String str) {
        return this.mBundle.getSerializable(str);
    }

    public synchronized ArrayList<String> getStringArrayList(String str) {
        return this.mBundle.getStringArrayList(str);
    }

    public synchronized void reset(Bundle bundle) {
        this.mBundle.clear();
        this.mBundle.putAll(bundle);
    }

    public synchronized String getString(String str, String str2) {
        return this.mBundle.getString(str, str2);
    }

    public synchronized void putBoolean(String str, boolean z) {
        this.mBundle.putBoolean(str, z);
    }

    public synchronized void putSerializable(String str, Serializable serializable) {
        this.mBundle.putSerializable(str, serializable);
    }

    public synchronized void putString(String str, String str2) {
        this.mBundle.putString(str, str2);
    }

    public synchronized void putStringArrayList(String str, ArrayList<String> arrayList) {
        this.mBundle.putStringArrayList(str, arrayList);
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        return this.mBundle.getBoolean(str, z);
    }
}
