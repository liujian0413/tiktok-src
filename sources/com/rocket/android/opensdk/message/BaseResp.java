package com.rocket.android.opensdk.message;

import android.os.Bundle;

public abstract class BaseResp {
    public int errorCode;
    public String errorStr;
    public String transaction;

    public interface ErrCode {
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean checkArgs();

    public abstract int getType();

    public void fromBundle(Bundle bundle) {
        this.errorCode = bundle.getInt("ROCKET_RESP_ERROR_CODE");
        this.errorStr = bundle.getString("ROCKET_RESP_ERROR_STR");
        this.transaction = bundle.getString("ROCKET_RESP_TRANSACTION");
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt("ROCKET_RESP_COMMAND_TYPE", getType());
        bundle.putInt("ROCKET_RESP_ERROR_CODE", this.errorCode);
        bundle.putString("ROCKET_RESP_ERROR_STR", this.errorStr);
        bundle.putString("ROCKET_RESP_TRANSACTION", this.transaction);
    }
}
