package com.bytedance.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent.Builder;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class SmartRoute {
    private int enterAnim = -1;
    private int exitAnim = -1;
    private Bundle mAnimationBundle;
    private OpenResultCallback mCallback;
    private Context mContext;
    private Uri mData;
    private Intent mExtraParams;
    private String mUrl = "";

    public SmartRoute withParam(String str, boolean z) {
        this.mExtraParams.putExtra(str, z);
        return this;
    }

    public SmartRoute withParam(String str, boolean[] zArr) {
        this.mExtraParams.putExtra(str, zArr);
        return this;
    }

    public SmartRoute withParam(String str, byte[] bArr) {
        this.mExtraParams.putExtra(str, bArr);
        return this;
    }

    public SmartRoute withParam(String str, char[] cArr) {
        this.mExtraParams.putExtra(str, cArr);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence charSequence) {
        this.mExtraParams.putExtra(str, charSequence);
        return this;
    }

    public SmartRoute withParam(String str, CharSequence[] charSequenceArr) {
        this.mExtraParams.putExtra(str, charSequenceArr);
        return this;
    }

    public SmartRoute withParam(String str, double[] dArr) {
        this.mExtraParams.putExtra(str, dArr);
        return this;
    }

    public SmartRoute withParam(String str, float[] fArr) {
        this.mExtraParams.putExtra(str, fArr);
        return this;
    }

    public SmartRoute withParam(String str, int[] iArr) {
        this.mExtraParams.putExtra(str, iArr);
        return this;
    }

    public SmartRoute withParam(String str, long[] jArr) {
        this.mExtraParams.putExtra(str, jArr);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable parcelable) {
        this.mExtraParams.putExtra(str, parcelable);
        return this;
    }

    public SmartRoute withParam(String str, Parcelable[] parcelableArr) {
        this.mExtraParams.putExtra(str, parcelableArr);
        return this;
    }

    public SmartRoute withParam(String str, Serializable serializable) {
        this.mExtraParams.putExtra(str, serializable);
        return this;
    }

    public SmartRoute withParam(String str, short s) {
        this.mExtraParams.putExtra(str, s);
        return this;
    }

    public SmartRoute withParam(String str, short[] sArr) {
        this.mExtraParams.putExtra(str, sArr);
        return this;
    }

    public SmartRoute withParam(String str, String str2) {
        this.mExtraParams.putExtra(str, str2);
        return this;
    }

    public SmartRoute withParam(String str, String[] strArr) {
        this.mExtraParams.putExtra(str, strArr);
        return this;
    }

    public Intent buildIntent() {
        return buildIntent(null);
    }

    public void open() {
        open((String) null);
    }

    private RouteIntent buildRouteIntent() {
        return new Builder().withUrl(this.mUrl).withParam(this.mExtraParams).addFlags(this.mExtraParams.getFlags()).withAnimation(this.enterAnim, this.exitAnim).withBundleAnimation(this.mAnimationBundle).withCallback(this.mCallback).withData(this.mData).build();
    }

    public SmartRoute withBundleAnimation(Bundle bundle) {
        this.mAnimationBundle = bundle;
        return this;
    }

    public SmartRoute withCallback(OpenResultCallback openResultCallback) {
        this.mCallback = openResultCallback;
        return this;
    }

    public SmartRoute withParam(Uri uri) {
        this.mData = uri;
        return this;
    }

    public SmartRoute withUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public SmartRoute addFlags(int i) {
        this.mExtraParams.addFlags(i);
        return this;
    }

    public SmartRoute withParam(Bundle bundle) {
        this.mExtraParams.putExtras(bundle);
        return this;
    }

    public void open(int i) {
        open(i, null);
    }

    public SmartRoute(Context context) {
        this.mContext = context;
        this.mExtraParams = new Intent();
    }

    public SmartRoute withParam(Intent intent) {
        if (intent.getExtras() != null) {
            if (this.mExtraParams.getExtras() == null) {
                this.mExtraParams.putExtras(new Bundle());
            }
            this.mExtraParams.getExtras().putAll(intent.getExtras());
        }
        return this;
    }

    public Intent buildIntent(String str) {
        if (TextUtils.isEmpty(this.mUrl)) {
            Logger.m36454e("SmartRoute#url is null!!!");
            if (this.mCallback != null) {
                this.mCallback.onFail(this.mUrl, "SmartRoute#url is null!");
            }
            return null;
        } else if (!Util.isLegalUrl(this.mUrl)) {
            if (this.mCallback != null) {
                this.mCallback.onFail(this.mUrl, "SmartRoute#url is illegal");
            }
            StringBuilder sb = new StringBuilder("SmartRoute#url is illegal and url is ");
            sb.append(this.mUrl);
            Logger.m36454e(sb.toString());
            return null;
        } else {
            return RouteManager.getInstance().buildIntent(this.mContext, buildRouteIntent(), str);
        }
    }

    public void open(String str) {
        if (this.mContext == null) {
            Logger.m36454e("SmartRoute#open context is null!!!");
            if (this.mCallback != null) {
                this.mCallback.onFail(this.mUrl, "context is null!");
            }
        } else if (TextUtils.isEmpty(this.mUrl)) {
            Logger.m36454e("SmartRoute#url is null!!!");
            if (this.mCallback != null) {
                this.mCallback.onFail(this.mUrl, "SmartRoute#url is null!");
            }
        } else if (!Util.isLegalUrl(this.mUrl)) {
            StringBuilder sb = new StringBuilder("SmartRoute#url is illegal and url is ");
            sb.append(this.mUrl);
            Logger.m36454e(sb.toString());
            if (this.mCallback != null) {
                this.mCallback.onFail(this.mUrl, "SmartRoute#url is illegal");
            }
        } else {
            RouteManager.getInstance().open(this.mContext, buildRouteIntent(), str);
        }
    }

    public SmartRoute withAnimation(int i, int i2) {
        this.enterAnim = i;
        this.exitAnim = i2;
        return this;
    }

    public SmartRoute withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
        this.mExtraParams.putCharSequenceArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamIntegerList(String str, ArrayList<Integer> arrayList) {
        this.mExtraParams.putIntegerArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamParcelableList(String str, ArrayList<? extends Parcelable> arrayList) {
        this.mExtraParams.putParcelableArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParamStringList(String str, ArrayList<String> arrayList) {
        this.mExtraParams.putStringArrayListExtra(str, arrayList);
        return this;
    }

    public SmartRoute withParam(String str, byte b) {
        this.mExtraParams.putExtra(str, b);
        return this;
    }

    public SmartRoute withParam(String str, char c) {
        this.mExtraParams.putExtra(str, c);
        return this;
    }

    private void sliceParams2Intent(Intent intent, String str) {
        Map sliceUrlParams = Util.sliceUrlParams(str);
        if (sliceUrlParams != null && sliceUrlParams.size() != 0) {
            for (Entry entry : sliceUrlParams.entrySet()) {
                intent.putExtra((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public SmartRoute withParam(String str, double d) {
        this.mExtraParams.putExtra(str, d);
        return this;
    }

    public void open(int i, String str) {
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("requestCode must not be Integer.MIN_VALUE:-2147483648 !!!");
        } else if (this.mContext == null) {
            if (this.mCallback != null) {
                this.mCallback.onFail(this.mUrl, "Open context is null!");
            }
            Logger.m36454e("SmartRoute#open context is null!!!");
        } else if (TextUtils.isEmpty(this.mUrl)) {
            if (this.mCallback != null) {
                this.mCallback.onFail(this.mUrl, "url is null!");
            }
            Logger.m36454e("SmartRoute#url is null!!!");
        } else if (!Util.isLegalUrl(this.mUrl)) {
            if (this.mCallback != null) {
                this.mCallback.onFail(this.mUrl, "SmartRoute#url is illegal");
            }
            StringBuilder sb = new StringBuilder("SmartRoute#url is illegal and url is ");
            sb.append(this.mUrl);
            Logger.m36454e(sb.toString());
        } else if (!(this.mContext instanceof Activity)) {
            if (this.mCallback != null) {
                this.mCallback.onFail(this.mUrl, "SmartRoute#context is not Activity!");
            }
            Logger.m36454e("SmartRoute#context is not Activity!!!");
        } else {
            RouteIntent buildRouteIntent = buildRouteIntent();
            buildRouteIntent.setRequestCode(i);
            RouteManager.getInstance().open(this.mContext, buildRouteIntent, str);
        }
    }

    public SmartRoute withParam(String str, float f) {
        this.mExtraParams.putExtra(str, f);
        return this;
    }

    public SmartRoute withParam(String str, int i) {
        this.mExtraParams.putExtra(str, i);
        return this;
    }

    public SmartRoute withParam(String str, long j) {
        this.mExtraParams.putExtra(str, j);
        return this;
    }

    public SmartRoute withParam(String str, Bundle bundle) {
        this.mExtraParams.putExtra(str, bundle);
        return this;
    }
}
