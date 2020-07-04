package com.adm.push;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.p280ss.android.message.p885a.C19810a.C19811a;
import com.p280ss.android.message.p885a.C19810a.C19812b;
import com.p280ss.android.message.p885a.C19819e;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.adm.push.c */
final class C1655c {
    /* renamed from: a */
    static boolean m8061a(String str, Context context) throws NameNotFoundException {
        return m8060a(context, str) & m8063b(str, context) & m8062b(context, str);
    }

    /* renamed from: b */
    private static boolean m8063b(String str, Context context) {
        try {
            InputStream open = context.getAssets().open("api_key.txt");
            if (open == null) {
                return true;
            }
            try {
                open.close();
                return true;
            } catch (IOException unused) {
                return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m8062b(Context context, String str) throws NameNotFoundException {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".permission.RECEIVE_ADM_MESSAGE");
        String[] strArr = {sb.toString(), "com.amazon.device.messaging.permission.RECEIVE", "android.permission.WAKE_LOCK"};
        return C19819e.m65427a(context, str, "ADMPush 错误,", Arrays.asList(strArr));
    }

    /* renamed from: a */
    private static boolean m8060a(Context context, String str) throws NameNotFoundException {
        boolean b = C19819e.m65430b(context, str, "Adm Push 错误", Collections.singletonList(C19811a.m65411d("com.adm.push.ADMMessageHandler").mo53157a(context.getPackageName()).f53769a));
        if (!C19819e.m65433c(context, str, "Adm Push 错误", Collections.singletonList(C19811a.m65411d("com.adm.push.ADMMessageHandler$Receiver").mo53157a(context.getPackageName()).mo53158b("com.amazon.device.messaging.permission.SEND").mo53156a(new C19812b(Arrays.asList(new String[]{"com.amazon.device.messaging.intent.REGISTRATION", "com.amazon.device.messaging.intent.RECEIVE"}), Collections.singletonList(context.getPackageName()))).f53769a)) || !b) {
            return false;
        }
        return true;
    }
}
