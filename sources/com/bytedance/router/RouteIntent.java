package com.bytedance.router;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.router.util.Logger;
import com.bytedance.router.util.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public class RouteIntent {
    private int enterAnim;
    private int exitAnim;
    private Bundle mAnimationBundle;
    private OpenResultCallback mCallback;
    private Uri mData;
    private Intent mExtraIntent;
    private String mHost;
    private String mOriginUrl;
    private String mPath;
    private int mRequestCode;
    private String mScheme;
    private Uri mUri;
    private String mUrl;

    public static class Builder {
        private int enterAnim = -1;
        private int exitAnim = -1;
        private Bundle mAnimationBundle;
        private OpenResultCallback mCallback = null;
        private Uri mData;
        private Intent mExtraParams = new Intent();
        private String mUrl = "";

        public Builder withParam(String str, boolean z) {
            this.mExtraParams.putExtra(str, z);
            return this;
        }

        public Builder withParam(String str, boolean[] zArr) {
            this.mExtraParams.putExtra(str, zArr);
            return this;
        }

        public Builder withParam(String str, byte[] bArr) {
            this.mExtraParams.putExtra(str, bArr);
            return this;
        }

        public Builder withParam(String str, char[] cArr) {
            this.mExtraParams.putExtra(str, cArr);
            return this;
        }

        public Builder withParam(String str, CharSequence charSequence) {
            this.mExtraParams.putExtra(str, charSequence);
            return this;
        }

        public Builder withParam(String str, CharSequence[] charSequenceArr) {
            this.mExtraParams.putExtra(str, charSequenceArr);
            return this;
        }

        public Builder withParam(String str, double[] dArr) {
            this.mExtraParams.putExtra(str, dArr);
            return this;
        }

        public Builder withParam(String str, float[] fArr) {
            this.mExtraParams.putExtra(str, fArr);
            return this;
        }

        public Builder withParam(String str, int[] iArr) {
            this.mExtraParams.putExtra(str, iArr);
            return this;
        }

        public Builder withParam(String str, long[] jArr) {
            this.mExtraParams.putExtra(str, jArr);
            return this;
        }

        public Builder withParam(String str, Parcelable parcelable) {
            this.mExtraParams.putExtra(str, parcelable);
            return this;
        }

        public Builder withParam(String str, Parcelable[] parcelableArr) {
            this.mExtraParams.putExtra(str, parcelableArr);
            return this;
        }

        public Builder withParam(String str, Serializable serializable) {
            this.mExtraParams.putExtra(str, serializable);
            return this;
        }

        public Builder withParam(String str, short s) {
            this.mExtraParams.putExtra(str, s);
            return this;
        }

        public Builder withParam(String str, short[] sArr) {
            this.mExtraParams.putExtra(str, sArr);
            return this;
        }

        public Builder withParam(String str, String str2) {
            this.mExtraParams.putExtra(str, str2);
            return this;
        }

        public Builder withParam(String str, String[] strArr) {
            this.mExtraParams.putExtra(str, strArr);
            return this;
        }

        public Builder() {
        }

        public RouteIntent build() {
            RouteIntent routeIntent = new RouteIntent();
            StringBuilder sb = new StringBuilder("Build RouteIntent url: ");
            sb.append(this.mUrl);
            Logger.m36452d(sb.toString());
            RouteIntent.sliceParams2Intent(this.mExtraParams, this.mUrl, false);
            routeIntent.setOriginUrl(this.mUrl);
            routeIntent.setExtra(this.mExtraParams);
            routeIntent.setAnimation(this.enterAnim, this.exitAnim);
            routeIntent.setAnimationBundle(this.mAnimationBundle);
            routeIntent.setData(this.mData);
            if (this.mCallback != null) {
                routeIntent.setCallback(this.mCallback);
            }
            routeIntent.parseUrl();
            return routeIntent;
        }

        public Builder withBundleAnimation(Bundle bundle) {
            this.mAnimationBundle = bundle;
            return this;
        }

        public Builder withCallback(OpenResultCallback openResultCallback) {
            this.mCallback = openResultCallback;
            return this;
        }

        public Builder withData(Uri uri) {
            this.mData = uri;
            return this;
        }

        public Builder withUrl(String str) {
            this.mUrl = str;
            return this;
        }

        public Builder addFlags(int i) {
            this.mExtraParams.addFlags(i);
            return this;
        }

        public Builder withParam(Intent intent) {
            this.mExtraParams.putExtras(intent);
            return this;
        }

        public Builder withParam(Bundle bundle) {
            this.mExtraParams.putExtras(bundle);
            return this;
        }

        public Builder(String str) {
            this.mUrl = str;
        }

        public Builder withAnimation(int i, int i2) {
            this.enterAnim = i;
            this.exitAnim = i2;
            return this;
        }

        public Builder withParamCharSequenceList(String str, ArrayList<CharSequence> arrayList) {
            this.mExtraParams.putExtra(str, arrayList);
            return this;
        }

        public Builder withParamIntegerList(String str, ArrayList<Integer> arrayList) {
            this.mExtraParams.putExtra(str, arrayList);
            return this;
        }

        public Builder withParamParcelableList(String str, ArrayList<Parcelable> arrayList) {
            this.mExtraParams.putExtra(str, arrayList);
            return this;
        }

        public Builder withParamStringList(String str, ArrayList<String> arrayList) {
            this.mExtraParams.putExtra(str, arrayList);
            return this;
        }

        public Builder withParam(String str, byte b) {
            this.mExtraParams.putExtra(str, b);
            return this;
        }

        public Builder withParam(String str, char c) {
            this.mExtraParams.putExtra(str, c);
            return this;
        }

        public Builder withParam(String str, double d) {
            this.mExtraParams.putExtra(str, d);
            return this;
        }

        public Builder withParam(String str, float f) {
            this.mExtraParams.putExtra(str, f);
            return this;
        }

        public Builder withParam(String str, int i) {
            this.mExtraParams.putExtra(str, i);
            return this;
        }

        public Builder withParam(String str, long j) {
            this.mExtraParams.putExtra(str, j);
            return this;
        }

        public Builder withParam(String str, Bundle bundle) {
            this.mExtraParams.putExtra(str, bundle);
            return this;
        }
    }

    public Bundle getAnimationBundle() {
        return this.mAnimationBundle;
    }

    public OpenResultCallback getCallback() {
        return this.mCallback;
    }

    public Uri getData() {
        return this.mData;
    }

    public int getEnterAnim() {
        return this.enterAnim;
    }

    public int getExitAnim() {
        return this.exitAnim;
    }

    public Intent getExtra() {
        return this.mExtraIntent;
    }

    public String getHost() {
        return this.mHost;
    }

    public String getOriginUrl() {
        return this.mOriginUrl;
    }

    public String getPath() {
        return this.mPath;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public String getScheme() {
        return this.mScheme;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasRequestCode() {
        if (this.mRequestCode != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    private RouteIntent() {
        this.mOriginUrl = "";
        this.mUrl = "";
        this.mScheme = "";
        this.mHost = "";
        this.mPath = "";
        this.enterAnim = -1;
        this.exitAnim = -1;
        this.mRequestCode = Integer.MIN_VALUE;
    }

    /* access modifiers changed from: 0000 */
    public void parseUrl() {
        if (!TextUtils.isEmpty(this.mUrl)) {
            this.mUri = Uri.parse(this.mUrl);
            this.mExtraIntent.setData(this.mUri);
            this.mScheme = this.mUri.getScheme();
            this.mHost = this.mUri.getHost();
            this.mPath = this.mUri.getPath();
            if (this.mScheme == null) {
                this.mScheme = "";
            }
            if (this.mHost == null) {
                this.mHost = "";
            }
            if (this.mPath == null) {
                this.mPath = "";
            }
        }
    }

    public void setAnimationBundle(Bundle bundle) {
        this.mAnimationBundle = bundle;
    }

    public void setCallback(OpenResultCallback openResultCallback) {
        this.mCallback = openResultCallback;
    }

    public void setData(Uri uri) {
        this.mData = uri;
    }

    /* access modifiers changed from: 0000 */
    public void setExtra(Intent intent) {
        this.mExtraIntent = intent;
    }

    public void setRequestCode(int i) {
        this.mRequestCode = i;
    }

    public void setOriginUrl(String str) {
        this.mOriginUrl = str;
        if (!this.mUrl.equals(this.mOriginUrl)) {
            this.mUrl = this.mOriginUrl;
        }
    }

    public void setUrl(String str) {
        if (str != null) {
            if (Util.isLegalUrl(str)) {
                if (!str.equals(this.mUrl)) {
                    this.mUrl = str;
                    parseUrl();
                    sliceParams2Intent(this.mExtraIntent, this.mUrl, true);
                }
                return;
            }
            throw new IllegalArgumentException("url is illegal!!!");
        }
    }

    public void setAnimation(int i, int i2) {
        this.enterAnim = i;
        this.exitAnim = i2;
    }

    static void sliceParams2Intent(Intent intent, String str, boolean z) {
        if (intent != null) {
            Map sliceUrlParams = Util.sliceUrlParams(str);
            if (sliceUrlParams != null && sliceUrlParams.size() != 0) {
                for (Entry entry : sliceUrlParams.entrySet()) {
                    if (z) {
                        intent.putExtra((String) entry.getKey(), (String) entry.getValue());
                    } else if (!intent.hasExtra((String) entry.getKey())) {
                        intent.putExtra((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
    }
}
