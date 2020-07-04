package com.fcm;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.p280ss.android.message.p885a.C19810a;
import com.p280ss.android.message.p885a.C19810a.C19811a;
import com.p280ss.android.message.p885a.C19810a.C19812b;
import com.p280ss.android.message.p885a.C19819e;
import com.p280ss.android.push.push_3rd_fcm.R$string;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.fcm.a */
final class C14684a {
    /* renamed from: a */
    static boolean m42497a(String str, Context context) throws NameNotFoundException {
        return m42496a(context, str) & m42498b(str, context);
    }

    /* renamed from: b */
    private static boolean m42498b(String str, Context context) {
        String string = context.getResources().getString(R$string.google_api_key);
        String string2 = context.getResources().getString(R$string.google_app_id);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m42496a(Context context, String str) throws NameNotFoundException {
        return C19819e.m65430b(context, str, "Fcm Push 错误", Arrays.asList(new C19810a[]{C19811a.m65411d("com.fcm.service.SSGcmListenerService").mo53157a(context.getPackageName()).mo53156a(new C19812b(Collections.singletonList("com.google.firebase.MESSAGING_EVENT"))).f53769a, C19811a.m65411d("com.fcm.service.FcmRegistrationJobIntentService").mo53157a(context.getPackageName()).mo53158b("android.permission.BIND_JOB_SERVICE").f53769a}));
    }
}
