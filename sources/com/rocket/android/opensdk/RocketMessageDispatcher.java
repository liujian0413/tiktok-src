package com.rocket.android.opensdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.rocket.android.opensdk.util.OpenSDKUtils;

public class RocketMessageDispatcher {
    public static boolean send(Context context, String str, Bundle bundle) {
        String str2;
        if (context == null) {
            return false;
        }
        Intent intent = new Intent();
        int i = bundle.getInt("ROCKET_EXTRA_REQ_SCENE", -1);
        if (i == 0) {
            str2 = "com.rocket.android.share.core.activity.RocketShareEntryActivity";
        } else if (i != 1) {
            return false;
        } else {
            str2 = "com.rocket.android.share.core.activity.RocketCircleShareEntryActivity";
        }
        intent.setClassName("com.feiliao.flipchat.android", str2);
        return send(context, str, bundle, intent);
    }

    private static boolean send(Context context, String str, Bundle bundle, Intent intent) {
        if (bundle == null) {
            return false;
        }
        intent.putExtras(bundle);
        String packageName = context.getPackageName();
        String mD5Signature = OpenSDKUtils.getMD5Signature(context, packageName);
        intent.putExtra("ROCKET_EXTRA_MESSAGE_SDK_VERSION", 20181222);
        intent.putExtra("ROCKET_EXTRA_MESSAGE_PACKAGE_NAME", packageName);
        intent.putExtra("ROCKET_EXTRA_MESSAGE_MD5", mD5Signature);
        intent.putExtra("ROCKET_EXTRA_MESSAGE_APP_KEY", str);
        intent.addFlags(268435456);
        intent.addFlags(134217728);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
