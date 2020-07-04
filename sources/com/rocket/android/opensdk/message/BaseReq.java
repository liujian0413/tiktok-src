package com.rocket.android.opensdk.message;

import android.os.Bundle;

public abstract class BaseReq {
    public String transaction;

    public abstract boolean checkArgs();

    public abstract int getType();

    public void fromBundle(Bundle bundle) {
        this.transaction = bundle.getString("ROCKET_EXTRA_REQ_TRANSACTION");
    }

    public void toBundle(Bundle bundle) {
        bundle.putInt("ROCKET_EXTRA_REQ_COMMAND_TYPE", getType());
        bundle.putString("ROCKET_EXTRA_REQ_TRANSACTION", this.transaction);
    }
}
