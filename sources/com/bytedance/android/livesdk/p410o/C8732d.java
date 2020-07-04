package com.bytedance.android.livesdk.p410o;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.android.livesdk.p410o.p411a.C8711e;
import com.bytedance.android.livesdk.p410o.p413c.C8727e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.d */
public final class C8732d {

    /* renamed from: a */
    private static final Map<String, Integer> f23739a;

    static {
        HashMap hashMap = new HashMap();
        f23739a = hashMap;
        hashMap.put("android.permission.READ_CALENDAR", Integer.valueOf(R.string.f9y));
        f23739a.put("android.permission.WRITE_CALENDAR", Integer.valueOf(R.string.f9y));
        f23739a.put("android.permission.CAMERA", Integer.valueOf(R.string.f_1));
        f23739a.put("android.permission.READ_CONTACTS", Integer.valueOf(R.string.f_2));
        f23739a.put("android.permission.WRITE_CONTACTS", Integer.valueOf(R.string.f_2));
        f23739a.put("android.permission.GET_ACCOUNTS", Integer.valueOf(R.string.f_2));
        f23739a.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(R.string.f_7));
        f23739a.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(R.string.f_7));
        f23739a.put("android.permission.RECORD_AUDIO", Integer.valueOf(R.string.f_9));
        f23739a.put("android.permission.READ_PHONE_STATE", Integer.valueOf(R.string.f_8));
        f23739a.put("android.permission.CALL_PHONE", Integer.valueOf(R.string.f9z));
        f23739a.put("android.permission.READ_CALL_LOG", Integer.valueOf(R.string.f_0));
        f23739a.put("android.permission.WRITE_CALL_LOG", Integer.valueOf(R.string.f_0));
        f23739a.put("com.android.voicemail.permission.ADD_VOICEMAIL", Integer.valueOf(R.string.f9z));
        f23739a.put("android.permission.USE_SIP", Integer.valueOf(R.string.f9z));
        f23739a.put("android.permission.PROCESS_OUTGOING_CALLS", Integer.valueOf(R.string.f9z));
        f23739a.put("android.permission.BODY_SENSORS", Integer.valueOf(R.string.f__));
        f23739a.put("android.permission.SEND_SMS", Integer.valueOf(R.string.f_a));
        f23739a.put("android.permission.RECEIVE_SMS", Integer.valueOf(R.string.f_a));
        f23739a.put("android.permission.READ_SMS", Integer.valueOf(R.string.f_a));
        f23739a.put("android.permission.RECEIVE_WAP_PUSH", Integer.valueOf(R.string.f_a));
        f23739a.put("android.permission.RECEIVE_MMS", Integer.valueOf(R.string.f_a));
        f23739a.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(R.string.f_6));
        f23739a.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(R.string.f_6));
    }

    /* renamed from: b */
    public static boolean m26097b(Activity activity, String... strArr) {
        if (strArr == null) {
            return false;
        }
        return C8722c.m26068a(activity, strArr);
    }

    /* renamed from: b */
    public static boolean m26098b(Context context, String... strArr) {
        if (strArr == null) {
            return true;
        }
        if (VERSION.SDK_INT < 23 || C8727e.m26082c().mo21730a()) {
            return C8711e.m26032a().mo21712a(context, strArr);
        }
        return C8722c.m26070a(context, strArr);
    }

    /* renamed from: a */
    public static String m26094a(Context context, String... strArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (f23739a.containsKey(str)) {
                Integer num = (Integer) f23739a.get(str);
                if (!arrayList.contains(num)) {
                    arrayList.add(num);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num2 : arrayList) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(context.getString(num2.intValue()));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String[] m26096a(Activity activity, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!m26098b((Context) activity, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static boolean m26095a(Activity activity, String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        if (C8727e.m26082c().mo21730a()) {
            return m26098b((Context) activity, strArr);
        }
        return true;
    }
}
