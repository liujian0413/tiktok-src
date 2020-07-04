package com.p280ss.android.pushmanager;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import com.p280ss.android.message.p885a.C19810a;
import com.p280ss.android.message.p885a.C19810a.C19811a;
import com.p280ss.android.message.p885a.C19810a.C19812b;
import com.p280ss.android.message.p885a.C19819e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.pushmanager.f */
public final class C20073f {
    /* renamed from: a */
    private static boolean m66097a(Context context, String str) throws NameNotFoundException {
        C19811a a = C19811a.m65411d("com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider").mo53157a(context.getPackageName());
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".push.SHARE_PROVIDER_AUTHORITY");
        C19810a[] aVarArr = {a.mo53159c(sb.toString()).f53769a};
        return C19819e.m65437e(context, str, "Push", Arrays.asList(aVarArr));
    }

    /* renamed from: b */
    private static boolean m66099b(Context context, String str) throws NameNotFoundException {
        C19811a d = C19811a.m65411d("com.ss.android.message.sswo.SswoActivity");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(":push");
        C19810a[] aVarArr = {d.mo53157a(sb.toString()).f53769a};
        return C19819e.m65435d(context, str, "Push", Arrays.asList(aVarArr));
    }

    /* renamed from: c */
    private static boolean m66101c(Context context, String str) throws NameNotFoundException {
        C19811a d = C19811a.m65411d("com.ss.android.message.MessageReceiver");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(":push");
        C19811a a = d.mo53157a(sb.toString()).mo53156a(new C19812b(Arrays.asList(new String[]{"android.intent.action.BOOT_COMPLETED", "android.net.conn.CONNECTIVITY_CHANGE", "android.intent.action.MEDIA_MOUNTED", "android.intent.action.MEDIA_UNMOUNTED", "android.intent.action.USER_PRESENT", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED"})));
        List asList = Arrays.asList(new String[]{"android.intent.action.PACKAGE_ADDED", "android.intent.action.PACKAGE_REMOVED"});
        StringBuilder sb2 = new StringBuilder("package://");
        sb2.append(context.getPackageName());
        C19811a d2 = C19811a.m65411d("com.ss.android.push.daemon.PushReceiver");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getPackageName());
        sb3.append(":pushservice");
        C19811a d3 = C19811a.m65411d("com.baidu.android.pushservice.RegistrationReceiver");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(context.getPackageName());
        sb4.append(":push");
        C19811a a2 = d3.mo53157a(sb4.toString()).mo53156a(new C19812b(Arrays.asList(new String[]{"com.baidu.android.pushservice.action.METHOD", "com.baidu.android.pushservice.action.BIND_SYNC"})));
        List asList2 = Arrays.asList(new String[]{"android.intent.action.PACKAGE_REMOVED"});
        StringBuilder sb5 = new StringBuilder("package://");
        sb5.append(context.getPackageName());
        C19811a d4 = C19811a.m65411d("com.igexin.sdk.PushReceiver");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(context.getPackageName());
        sb6.append(":push");
        C19811a a3 = d4.mo53157a(sb6.toString());
        String[] strArr = {"com.igexin.sdk.action.refreshls"};
        C19811a d5 = C19811a.m65411d("com.ss.android.message.sswo.SswoReceiver");
        StringBuilder sb7 = new StringBuilder();
        sb7.append(context.getPackageName());
        sb7.append(":push");
        return C19819e.m65433c(context, str, "Push", Arrays.asList(new C19810a[]{a.mo53156a(new C19812b(asList, null, Uri.parse(sb2.toString()))).f53769a, d2.mo53157a(sb3.toString()).f53769a, a2.mo53156a(new C19812b(asList2, null, Uri.parse(sb5.toString()))).f53769a, a3.mo53156a(new C19812b(Arrays.asList(strArr))).f53769a, C19811a.m65411d("com.ss.android.push.DefaultReceiver").mo53157a(context.getPackageName()).f53769a, d5.mo53157a(sb7.toString()).mo53156a(new C19812b(Arrays.asList(new String[]{"android.intent.action.USER_PRESENT", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON"}))).f53769a}));
    }

    /* renamed from: a */
    public static boolean m66098a(Context context, String str, Set<Integer> set) throws NameNotFoundException {
        return m66097a(context, str) & m66100b(context, str, set) & m66101c(context, str) & m66099b(context, str);
    }

    /* renamed from: b */
    private static boolean m66100b(Context context, String str, Set<Integer> set) throws NameNotFoundException {
        String str2;
        C19811a d = C19811a.m65411d("com.ss.android.message.NotifyService");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(":push");
        C19811a a = d.mo53157a(sb.toString());
        String[] strArr = {"com.ss.android.message.action.PUSH_SERVICE"};
        C19811a d2 = C19811a.m65411d("com.ss.android.message.NotifyIntentService");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getPackageName());
        sb2.append(":push");
        C19811a d3 = C19811a.m65411d("com.ss.android.message.PushJobService");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getPackageName());
        sb3.append(":push");
        C19811a d4 = C19811a.m65411d("com.ss.android.message.log.LogService");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(context.getPackageName());
        sb4.append(":push");
        C19811a d5 = C19811a.m65411d("com.ss.android.push.daemon.PushService");
        StringBuilder sb5 = new StringBuilder();
        sb5.append(context.getPackageName());
        sb5.append(":pushservice");
        C19811a d6 = C19811a.m65411d("com.baidu.android.pushservice.CommandService");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(context.getPackageName());
        sb6.append(":push");
        C19811a d7 = C19811a.m65411d("com.igexin.sdk.PushService");
        StringBuilder sb7 = new StringBuilder();
        sb7.append(context.getPackageName());
        sb7.append(":push");
        C19810a[] aVarArr = {a.mo53156a(new C19812b(Arrays.asList(strArr))).f53769a, d2.mo53157a(sb2.toString()).f53769a, d3.mo53157a(sb3.toString()).mo53158b("android.permission.BIND_JOB_SERVICE").f53769a, d4.mo53157a(sb4.toString()).f53769a, d5.mo53157a(sb5.toString()).f53769a, C19811a.m65411d("com.ss.android.push.DefaultService").mo53157a(context.getPackageName()).f53769a, d6.mo53157a(sb6.toString()).f53769a, d7.mo53157a(sb7.toString()).mo53156a(new C19812b(Arrays.asList(new String[]{"com.igexin.sdk.action.service.message"}))).f53769a};
        boolean b = C19819e.m65430b(context, str, "Push", Arrays.asList(aVarArr));
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("com.ss.android.message");
        if (set != null) {
            for (Integer intValue : set) {
                int intValue2 = intValue.intValue();
                if (intValue2 == 1) {
                    str2 = "com.ss.android.xiaomi.message";
                } else if (intValue2 != 14) {
                    switch (intValue2) {
                        case 5:
                            str2 = "com.ss.android.fcm.message";
                            break;
                        case 6:
                            str2 = "com.ss.android.umeng.message";
                            break;
                        case 7:
                            str2 = "com.ss.android.hw.message";
                            break;
                        case 8:
                            str2 = "com.ss.android.mz.message";
                            break;
                        default:
                            switch (intValue2) {
                                case 10:
                                    str2 = "com.ss.android.oppo.message";
                                    break;
                                case 11:
                                    str2 = "com.ss.android.vivo.message";
                                    break;
                                default:
                                    throw new IllegalArgumentException("not supported push channel");
                            }
                    }
                } else {
                    str2 = "com.ss.android.adm.message";
                }
                arrayList.add(str2);
            }
        }
        boolean z = true;
        for (String str3 : arrayList) {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction(str3);
            List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                z = false;
            }
        }
        if (!b || !z) {
            return false;
        }
        return true;
    }
}
