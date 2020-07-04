package com.rocket.android.opensdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.rocket.android.opensdk.message.BaseReq;
import com.rocket.android.opensdk.message.RocketShareMessage.Resp;
import com.rocket.android.opensdk.util.OpenSDKUtils;

public class RocketAPI implements IRocketAPI {
    private String mAppId;
    private Context mContext;
    private boolean mNeedSignatureCheck;

    public boolean sendResp(BaseReq baseReq) {
        return false;
    }

    public int getRocketSupportSDKVersion() {
        if (isRocketInstalled()) {
            return OpenSDKUtils.getSDKVersionFromMetaData(this.mContext, 0);
        }
        return 0;
    }

    public boolean isRocketSupportAPI() {
        if (getRocketSupportSDKVersion() >= 20181221) {
            return true;
        }
        return false;
    }

    public boolean isRocketInstalled() {
        boolean z = false;
        try {
            if (this.mContext.getPackageManager().getPackageInfo("com.feiliao.flipchat.android", 64) != null && checkSignature("com.feiliao.flipchat.android")) {
                z = true;
            }
            return z;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    public boolean openRocketApp() {
        if (!isRocketInstalled()) {
            return false;
        }
        try {
            this.mContext.startActivity(this.mContext.getPackageManager().getLaunchIntentForPackage("com.feiliao.flipchat.android"));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean checkSignature(String str) {
        if (!this.mNeedSignatureCheck) {
            return true;
        }
        return TextUtils.equals(OpenSDKUtils.getMD5Signature(this.mContext, str), "42540af5617d9f60d5485d98fe649676");
    }

    public boolean sendReq(BaseReq baseReq) {
        if (!checkSignature("com.feiliao.flipchat.android") || !baseReq.checkArgs()) {
            return false;
        }
        Bundle bundle = new Bundle();
        baseReq.toBundle(bundle);
        if (baseReq.getType() == 1) {
            return RocketMessageDispatcher.send(this.mContext, this.mAppId, bundle);
        }
        return false;
    }

    public RocketAPI(Context context, String str) {
        this(context, str, false);
    }

    public boolean handleIntent(Intent intent, IRocketAPIEventHandler iRocketAPIEventHandler) {
        if (!TextUtils.equals("com.feiliao.flipchat.android", intent.getStringExtra("ROCKET_RESP_PACKAGE_NAME")) || iRocketAPIEventHandler == null || intent.getIntExtra("ROCKET_RESP_COMMAND_TYPE", 0) != 1) {
            return false;
        }
        iRocketAPIEventHandler.onResp(new Resp(intent.getExtras()));
        return true;
    }

    public RocketAPI(Context context, String str, boolean z) {
        this.mContext = context;
        this.mAppId = str;
        this.mNeedSignatureCheck = z;
    }
}
