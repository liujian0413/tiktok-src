package com.facebook.react.bridge;

import android.app.Application;
import android.content.res.AssetManager;
import java.lang.ref.WeakReference;

public class RNJavaScriptRuntime {
    private static String mCommonURL = null;
    private static WeakReference<Application> mGloablAppcation = null;
    private static String mSnapshotURL = "assets://blobdata";

    public enum SplitCommonType {
        NONE,
        SPLIT_COMMONJS,
        SPLIT_SNAPSHOT
    }

    public static String getBaseJsURL() {
        return "assets://base.bundle";
    }

    public static String getCommonURL() {
        return mCommonURL;
    }

    public static String getSnapshotURL() {
        return mSnapshotURL;
    }

    public static AssetManager getAssetManager() {
        try {
            return ((Application) mGloablAppcation.get()).getAssets();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setApplication(Application application) {
        mGloablAppcation = new WeakReference<>(application);
        setCommonJsBundle("assets://common.bundle");
    }

    public static void setCommonJsBundle(String str) {
        if (mCommonURL == null || !mCommonURL.equals(str)) {
            mCommonURL = str;
        }
    }

    public static void setSnapSHotBundle(String str) {
        if (mSnapshotURL == null || !mSnapshotURL.equals(str)) {
            mSnapshotURL = str;
        }
    }
}
