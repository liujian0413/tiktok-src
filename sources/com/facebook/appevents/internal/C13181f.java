package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C13499h;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.internal.f */
class C13181f {

    /* renamed from: a */
    private static final String f34909a = C13181f.class.getCanonicalName();

    /* renamed from: b */
    private static final HashMap<String, Method> f34910b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<String, Class<?>> f34911c = new HashMap<>();

    /* renamed from: d */
    private static final String f34912d = C13499h.m39721g().getPackageName();

    /* renamed from: e */
    private static final SharedPreferences f34913e = C7285c.m22838a(C13499h.m39721g(), "com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f */
    private static final SharedPreferences f34914f = C7285c.m22838a(C13499h.m39721g(), "com.facebook.internal.PURCHASE", 0);

    C13181f() {
    }

    /* renamed from: a */
    private static void m38515a(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Editor edit = f34913e.edit();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            sb.append(";");
            sb.append((String) entry.getValue());
            edit.putString(str, sb.toString());
        }
        edit.apply();
    }

    /* renamed from: a */
    static boolean m38516a(String str) {
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            if (optString == null || optString.isEmpty()) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static void m38514a() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j = f34913e.getLong("LAST_CLEARED_TIME", 0);
        if (j == 0) {
            f34913e.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            return;
        }
        if (currentTimeMillis - j > 604800) {
            f34913e.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        }
    }

    /* renamed from: b */
    private static ArrayList<String> m38519b(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Editor edit = f34914f.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!f34914f.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    /* renamed from: a */
    private static Map<String, String> m38513a(ArrayList<String> arrayList) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String string = f34913e.getString(str, null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(str, split[1]);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    static Object m38508a(Context context, IBinder iBinder) {
        return m38509a(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    /* renamed from: b */
    static ArrayList<String> m38517b(Context context, Object obj) {
        return m38519b(m38518b(context, obj, "subs"));
    }

    /* renamed from: a */
    private static Class<?> m38507a(Context context, String str) {
        Class<?> cls;
        Class<?> cls2 = (Class) f34911c.get(str);
        if (cls2 != null) {
            return cls2;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            try {
                f34911c.put(str, cls);
            } catch (ClassNotFoundException unused) {
            }
        } catch (ClassNotFoundException unused2) {
            cls = cls2;
        }
        return cls;
    }

    /* renamed from: c */
    static ArrayList<String> m38521c(Context context, Object obj) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj == null) {
            return arrayList;
        }
        Class a = m38507a(context, "com.android.vending.billing.IInAppBillingService");
        if (a == null || m38510a(a, "getPurchaseHistory") == null) {
            return arrayList;
        }
        return m38519b(m38522c(context, obj, "inapp"));
    }

    /* renamed from: a */
    private static Method m38510a(Class<?> cls, String str) {
        Method method;
        Method method2 = (Method) f34910b.get(str);
        if (method2 != null) {
            return method2;
        }
        Class[] clsArr = null;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        c = 0;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        c = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    clsArr = new Class[]{IBinder.class};
                    break;
                case 1:
                    clsArr = new Class[]{Integer.TYPE, String.class, String.class, Bundle.class};
                    break;
                case 2:
                    clsArr = new Class[]{Integer.TYPE, String.class, String.class};
                    break;
                case 3:
                    clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class};
                    break;
                case 4:
                    clsArr = new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class};
                    break;
            }
            method = cls.getDeclaredMethod(str, clsArr);
            try {
                f34910b.put(str, method);
            } catch (NoSuchMethodException unused) {
            }
        } catch (NoSuchMethodException unused2) {
            method = method2;
        }
        return method;
    }

    /* renamed from: a */
    static ArrayList<String> m38511a(Context context, Object obj) {
        return m38519b(m38518b(context, obj, "inapp"));
    }

    /* renamed from: a */
    private static Boolean m38506a(Context context, Object obj, String str) {
        boolean z = false;
        if (obj == null) {
            return Boolean.valueOf(false);
        }
        Object a = m38509a(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{Integer.valueOf(3), f34912d, str});
        if (a != null && ((Integer) a).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[EDGE_INSN: B:19:0x005c->B:17:0x005c ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<java.lang.String> m38518b(android.content.Context r9, java.lang.Object r10, java.lang.String r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r10 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.Boolean r1 = m38506a(r9, r10, r11)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005c
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = 0
        L_0x0016:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5[r1] = r7
            r7 = 1
            java.lang.String r8 = f34912d
            r5[r7] = r8
            r7 = 2
            r5[r7] = r11
            r5[r6] = r3
            java.lang.String r3 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r6 = "getPurchases"
            java.lang.Object r3 = m38509a(r9, r3, r6, r10, r5)
            if (r3 == 0) goto L_0x0055
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)
            if (r5 == 0) goto L_0x005c
            int r6 = r5.size()
            int r4 = r4 + r6
            r0.addAll(r5)
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            r5 = 30
            if (r4 >= r5) goto L_0x005c
            if (r3 != 0) goto L_0x0016
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.C13181f.m38518b(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: c */
    private static ArrayList<String> m38522c(Context context, Object obj, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (m38506a(context, obj, str).booleanValue()) {
            char c = 0;
            Object obj2 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                Object[] objArr = new Object[5];
                objArr[c] = Integer.valueOf(6);
                objArr[1] = f34912d;
                objArr[2] = str;
                objArr[3] = obj2;
                objArr[4] = new Bundle();
                Object a = m38509a(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                if (a != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) a;
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        if (stringArrayList != null) {
                            Iterator it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String str2 = (String) it.next();
                                try {
                                    if (currentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / 1000) > 1200) {
                                        z = true;
                                        break;
                                    }
                                    arrayList.add(str2);
                                    i++;
                                } catch (JSONException unused) {
                                }
                            }
                            obj2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i >= 30 || obj2 == null || z) {
                                break;
                            }
                            c = 0;
                        }
                    }
                }
                obj2 = null;
                c = 0;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Map<String, String> m38520b(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (obj == null || arrayList.isEmpty()) {
            return hashMap;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(3);
        objArr[1] = f34912d;
        if (z) {
            str = "subs";
        } else {
            str = "inapp";
        }
        objArr[2] = str;
        objArr[3] = bundle;
        Object a = m38509a(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
        if (a != null) {
            Bundle bundle2 = (Bundle) a;
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        hashMap.put(arrayList.get(i), stringArrayList.get(i));
                    }
                }
                m38515a((Map<String, String>) hashMap);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    static Map<String, String> m38512a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        Map<String, String> a = m38513a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!a.containsKey(str)) {
                arrayList2.add(str);
            }
        }
        a.putAll(m38520b(context, arrayList2, obj, z));
        return a;
    }

    /* renamed from: a */
    private static Object m38509a(Context context, String str, String str2, Object obj, Object[] objArr) {
        Class a = m38507a(context, str);
        if (a == null) {
            return null;
        }
        Method a2 = m38510a(a, str2);
        if (a2 == null) {
            return null;
        }
        if (obj != null) {
            obj = a.cast(obj);
        }
        try {
            return a2.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
