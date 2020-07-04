package com.p280ss.android.message.p885a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.p280ss.android.message.p885a.C19810a.C19812b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.message.a.e */
public class C19819e {

    /* renamed from: a */
    private static List<String> f53776a;

    /* renamed from: b */
    private static List<ServiceInfo> f53777b;

    /* renamed from: c */
    private static List<ActivityInfo> f53778c;

    /* renamed from: d */
    private static List<ActivityInfo> f53779d;

    /* renamed from: e */
    private static List<ProviderInfo> f53780e;

    /* renamed from: a */
    private static List<String> m65425a(Context context) throws NameNotFoundException {
        if (f53776a == null) {
            synchronized (C19819e.class) {
                if (f53776a == null) {
                    String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                    if (strArr != null) {
                        f53776a = Arrays.asList(strArr);
                    }
                }
            }
        }
        return f53776a;
    }

    /* renamed from: b */
    private static List<ServiceInfo> m65428b(Context context) throws NameNotFoundException {
        if (f53777b == null) {
            synchronized (C19819e.class) {
                if (f53777b == null) {
                    ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services;
                    if (serviceInfoArr != null) {
                        f53777b = Arrays.asList(serviceInfoArr);
                    }
                }
            }
        }
        return f53777b;
    }

    /* renamed from: c */
    private static List<ActivityInfo> m65431c(Context context) throws NameNotFoundException {
        if (f53778c == null) {
            synchronized (C19819e.class) {
                if (f53778c == null) {
                    ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 514).receivers;
                    if (activityInfoArr != null) {
                        f53778c = Arrays.asList(activityInfoArr);
                    }
                }
            }
        }
        return f53778c;
    }

    /* renamed from: d */
    private static List<ActivityInfo> m65434d(Context context) throws NameNotFoundException {
        if (f53779d == null) {
            synchronized (C19819e.class) {
                if (f53779d == null) {
                    ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 513).activities;
                    if (activityInfoArr != null) {
                        f53779d = Arrays.asList(activityInfoArr);
                    }
                }
            }
        }
        return f53779d;
    }

    /* renamed from: e */
    private static List<ProviderInfo> m65436e(Context context) throws NameNotFoundException {
        if (f53780e == null) {
            synchronized (C19819e.class) {
                if (f53780e == null) {
                    ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 520).providers;
                    if (providerInfoArr != null) {
                        f53780e = Arrays.asList(providerInfoArr);
                    }
                }
            }
        }
        return f53780e;
    }

    /* renamed from: a */
    private static boolean m65426a(Context context, String str, C19812b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f53771b != null) {
            for (String addCategory : bVar.f53771b) {
                intent.addCategory(addCategory);
            }
        }
        intent.setAction(str2);
        if (bVar.f53772c != null) {
            intent.setData(bVar.f53772c);
        }
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 64);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                if (resolveInfo.activityInfo != null && TextUtils.equals(resolveInfo.activityInfo.name, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m65429b(Context context, String str, C19812b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f53771b != null) {
            for (String addCategory : bVar.f53771b) {
                intent.addCategory(addCategory);
            }
        }
        intent.setAction(str2);
        if (bVar.f53772c != null) {
            intent.setData(bVar.f53772c);
        }
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (resolveInfo.serviceInfo != null && (TextUtils.isEmpty(str) || TextUtils.equals(resolveInfo.serviceInfo.name, str))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m65432c(Context context, String str, C19812b bVar, String str2) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        if (bVar.f53771b != null) {
            for (String addCategory : bVar.f53771b) {
                intent.addCategory(addCategory);
            }
        }
        intent.setAction(str2);
        if (bVar.f53772c != null) {
            intent.setData(bVar.f53772c);
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && TextUtils.equals(resolveInfo.activityInfo.name, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m65427a(Context context, String str, String str2, List<String> list) throws NameNotFoundException {
        List a = m65425a(context);
        if (a == null || a.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            if (!a.contains(str3)) {
                arrayList.add(str3);
            }
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m65430b(Context context, String str, String str2, List<C19810a> list) throws NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List b = m65428b(context);
        if (b == null || b.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (C19810a aVar : list) {
            Iterator it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z4;
                    z2 = false;
                    break;
                }
                ServiceInfo serviceInfo = (ServiceInfo) it.next();
                if (TextUtils.equals(serviceInfo.name, aVar.f53765b)) {
                    boolean equals = TextUtils.equals(aVar.f53766c, serviceInfo.processName);
                    if (!TextUtils.isEmpty(aVar.f53767d)) {
                        z3 = TextUtils.equals(serviceInfo.permission, aVar.f53767d);
                    } else {
                        z3 = true;
                    }
                    if (!equals) {
                        z4 = false;
                    }
                    if (!z3) {
                        z4 = false;
                    }
                    if (aVar.f53764a != null) {
                        boolean z5 = true;
                        for (C19812b bVar : aVar.f53764a) {
                            if (bVar.f53770a != null) {
                                for (String b2 : bVar.f53770a) {
                                    if (!m65429b(context, aVar.f53765b, bVar, b2)) {
                                        z5 = false;
                                    }
                                }
                            }
                        }
                        if (!z5) {
                            z4 = false;
                        }
                    }
                    z = z4;
                    z2 = true;
                }
            }
            if (!z2) {
                arrayList.add(aVar);
            }
            z4 = z;
        }
        arrayList.isEmpty();
        if (!z4 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m65433c(Context context, String str, String str2, List<C19810a> list) throws NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List c = m65431c(context);
        if (c == null || c.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (C19810a aVar : list) {
            Iterator it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z4;
                    z2 = false;
                    break;
                }
                ActivityInfo activityInfo = (ActivityInfo) it.next();
                if (TextUtils.equals(activityInfo.name, aVar.f53765b)) {
                    if (!TextUtils.equals(aVar.f53766c, activityInfo.processName)) {
                        z4 = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f53767d)) {
                        z3 = TextUtils.equals(activityInfo.permission, aVar.f53767d);
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        z4 = false;
                    }
                    if (aVar.f53764a != null) {
                        boolean z5 = true;
                        for (C19812b bVar : aVar.f53764a) {
                            if (bVar.f53770a != null) {
                                for (String a : bVar.f53770a) {
                                    if (!m65426a(context, aVar.f53765b, bVar, a)) {
                                        z5 = false;
                                    }
                                }
                            }
                        }
                        if (!z5) {
                            z4 = false;
                        }
                    }
                    z = z4;
                    z2 = true;
                }
            }
            if (!z2) {
                arrayList.add(aVar);
            }
            z4 = z;
        }
        arrayList.isEmpty();
        if (!z4 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m65435d(Context context, String str, String str2, List<C19810a> list) throws NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List d = m65434d(context);
        if (d == null || d.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (C19810a aVar : list) {
            Iterator it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z4;
                    z2 = false;
                    break;
                }
                ActivityInfo activityInfo = (ActivityInfo) it.next();
                if (TextUtils.equals(activityInfo.name, aVar.f53765b)) {
                    if (!TextUtils.equals(aVar.f53766c, activityInfo.processName)) {
                        z4 = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f53767d)) {
                        z3 = TextUtils.equals(activityInfo.permission, aVar.f53767d);
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        z4 = false;
                    }
                    if (aVar.f53764a != null) {
                        boolean z5 = true;
                        for (C19812b bVar : aVar.f53764a) {
                            if (bVar.f53770a != null) {
                                for (String c : bVar.f53770a) {
                                    if (!m65432c(context, aVar.f53765b, bVar, c)) {
                                        z5 = false;
                                    }
                                }
                            }
                        }
                        if (!z5) {
                            z4 = false;
                        }
                    }
                    z = z4;
                    z2 = true;
                }
            }
            if (!z2) {
                arrayList.add(aVar);
            }
            z4 = z;
        }
        arrayList.isEmpty();
        if (!z4 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m65437e(Context context, String str, String str2, List<C19810a> list) throws NameNotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List e = m65436e(context);
        if (e == null || e.size() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        boolean z4 = true;
        for (C19810a aVar : list) {
            Iterator it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = z4;
                    z2 = false;
                    break;
                }
                ProviderInfo providerInfo = (ProviderInfo) it.next();
                if (TextUtils.equals(providerInfo.name, aVar.f53765b)) {
                    if (!TextUtils.equals(aVar.f53766c, providerInfo.processName)) {
                        z4 = false;
                    }
                    if (!TextUtils.isEmpty(aVar.f53768e)) {
                        z3 = TextUtils.equals(providerInfo.authority, aVar.f53768e);
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        z2 = true;
                        z = false;
                    } else {
                        z = z4;
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                arrayList.add(aVar);
            }
            z4 = z;
        }
        arrayList.isEmpty();
        if (!z4 || !arrayList.isEmpty()) {
            return false;
        }
        return true;
    }
}
