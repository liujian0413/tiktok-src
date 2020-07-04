package com.p280ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;
import com.bytedance.sdk.account.p650b.p653c.C12743a;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.base.DYBaseRequest */
public abstract class DYBaseRequest extends C12743a {
    public Bundle extras;
    public String mCallerPackage;
    public String mCallerSDKVersion;
    public String mClientKey;
    public String mState;

    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    public String getCallerPackage() {
        return this.mCallerPackage;
    }

    public String getCallerVersion() {
        return this.mCallerSDKVersion;
    }

    public abstract int getType();

    public void fromBundle(Bundle bundle) {
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.mCallerSDKVersion = bundle.getString("_aweme_open_sdk_params_caller_sdk_version");
        this.extras = bundle.getBundle("_bytedance_params_extra");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
        bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_params_client_key", this.mClientKey);
        bundle.putString("_aweme_open_sdk_params_caller_sdk_version", this.mCallerSDKVersion);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.mCallerPackage);
        bundle.putString("_aweme_open_sdk_params_state", this.mState);
    }
}
