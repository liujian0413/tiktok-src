package com.bytedance.sdk.account.p650b.p653c;

import android.os.Bundle;

/* renamed from: com.bytedance.sdk.account.b.c.a */
public abstract class C12743a {
    public String callerLocalEntry;
    public String callerPackage;
    public String callerVersion;
    public Bundle extras;

    public boolean checkArgs() {
        return true;
    }

    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    public String getCallerPackage() {
        return this.callerPackage;
    }

    public String getCallerVersion() {
        return this.callerVersion;
    }

    public abstract int getType();

    public void toBundle(Bundle bundle) {
        bundle.putInt("_bytedance_params_type", getType());
        bundle.putBundle("_bytedance_params_extra", this.extras);
        bundle.putString("_bytedance_params_from_entry", this.callerLocalEntry);
    }

    public void fromBundle(Bundle bundle) {
        this.callerPackage = bundle.getString("_bytedance_params_type_caller_package");
        this.callerVersion = bundle.getString("__bytedance_base_caller_version");
        this.extras = bundle.getBundle("_bytedance_params_extra");
        this.callerLocalEntry = bundle.getString("_bytedance_params_from_entry");
    }
}
