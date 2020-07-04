package com.bytedance.sdk.account.p650b.p653c;

import android.os.Bundle;

/* renamed from: com.bytedance.sdk.account.b.c.b */
public abstract class C12744b {
    public int errorCode;
    public String errorMsg;
    public Bundle extras;

    public boolean checkArgs() {
        return true;
    }

    public abstract int getType();

    public boolean isSuccess() {
        if (this.errorCode == 0) {
            return true;
        }
        return false;
    }

    public boolean isCancel() {
        if (this.errorCode == -2) {
            return true;
        }
        return false;
    }

    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("_bytedance_params_error_code");
        this.errorMsg = bundle.getString("_bytedance_params_error_msg");
        this.extras = bundle.getBundle("_bytedance_params_extra");
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt("_bytedance_params_error_code", this.errorCode);
        bundle.putString("_bytedance_params_error_msg", this.errorMsg);
        bundle.putInt("_bytedance_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
    }
}
