package com.kakao.util.apicompatibility;

import android.content.Intent;
import android.provider.Telephony.Sms.Intents;
import android.telephony.SmsMessage;
import com.kakao.util.helper.log.Logger;

class APILevel19Compatibility extends APILevel9Compatibility {
    APILevel19Compatibility() {
    }

    public String getSmsMessage(Intent intent) {
        SmsMessage[] messagesFromIntent = Intents.getMessagesFromIntent(intent);
        int length = messagesFromIntent.length;
        String str = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            SmsMessage smsMessage = messagesFromIntent[i];
            Logger.m60925d("KitKat or newer");
            if (smsMessage == null) {
                Logger.m60933e("SMS message is null -- ABORT");
                break;
            }
            str = smsMessage.getDisplayMessageBody();
            i++;
        }
        return str;
    }
}
