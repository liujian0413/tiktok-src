package com.kakao.auth.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.kakao.util.apicompatibility.APICompatibility;
import com.kakao.util.helper.log.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmsReceiver extends BroadcastReceiver {
    private final ISmsReceiver listener;

    public interface ISmsReceiver {
        void onCompleteSms(String str);
    }

    public SmsReceiver(ISmsReceiver iSmsReceiver) {
        this.listener = iSmsReceiver;
    }

    private static String parsePassCode(String str) {
        Logger.m60925d(str);
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = null;
        Matcher matcher = Pattern.compile("(^\\[드림시큐리티\\]).*\\[([0-9]{6})", 107).matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(2);
            Logger.m60925d(str2);
        }
        return str2;
    }

    public void onReceive(Context context, Intent intent) {
        Logger.m60942i("SmsReceiver:onReceive()", new Object[0]);
        if (intent.getExtras() == null) {
            Logger.m60955w("BroadcastReceiver failed, no intent data to process.");
            return;
        }
        if (intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
            Logger.m60925d("SMS_RECEIVED");
            this.listener.onCompleteSms(parsePassCode(APICompatibility.getInstance().getSmsMessage(intent)));
        }
    }
}
