package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.facebook.appevents.C13192m;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.utils.de */
public final class C43053de {

    /* renamed from: a */
    public static final C43053de f111651a = new C43053de();

    /* renamed from: b */
    private static Object f111652b;

    private C43053de() {
    }

    /* renamed from: a */
    private static int m136581a() {
        Object obj = f111652b;
        if (obj == null) {
            C7573i.m23583a("obMSimTelephonyManager");
        }
        Class cls = Class.forName(obj.getClass().getName());
        Class[] clsArr = new Class[1];
        if (VERSION.SDK_INT == 21) {
            clsArr[0] = Long.TYPE;
        } else {
            clsArr[0] = Integer.TYPE;
        }
        Method method = cls.getMethod("getDataState", (Class[]) Arrays.copyOf(clsArr, 1));
        Object[] objArr = new Object[1];
        if (VERSION.SDK_INT == 21) {
            objArr[0] = Long.valueOf(m136583a(1));
        } else {
            objArr[0] = Integer.valueOf(m136588b(1));
        }
        Object obj2 = f111652b;
        if (obj2 == null) {
            C7573i.m23583a("obMSimTelephonyManager");
        }
        boolean a = C7573i.m23585a(method.invoke(obj2, Arrays.copyOf(objArr, 1)), (Object) Integer.valueOf(2));
        if (a) {
            return 1;
        }
        if (!a) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final void m136586a(Object obj) {
        C7573i.m23587b(obj, "obMSimTelephonyManager");
        f111652b = obj;
    }

    /* renamed from: a */
    private int m136582a(TelephonyManager telephonyManager) {
        C7573i.m23587b(telephonyManager, "tm");
        String deviceId = telephonyManager.getDeviceId();
        String e = m136595e(0);
        String e2 = m136595e(1);
        if (e != null && C7573i.m23585a((Object) e, (Object) deviceId)) {
            return 0;
        }
        if (e2 == null || !C7573i.m23585a((Object) e2, (Object) deviceId)) {
            return -1;
        }
        return 1;
    }

    /* renamed from: b */
    public static final int m136588b(int i) {
        if (VERSION.SDK_INT <= 21) {
            return i;
        }
        try {
            Object a = m136584a("android.telephony.SubscriptionManager", "getSubId", (Class<?>[]) new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
            if (!(a instanceof int[])) {
                a = null;
            }
            int[] iArr = (int[]) a;
            if (iArr != null) {
                i = iArr[0];
            } else {
                i = -1;
            }
        } catch (Exception unused) {
        }
        return i;
    }

    /* renamed from: c */
    public static final int m136591c(Context context) {
        C7573i.m23587b(context, "context");
        if (m136587a(context)) {
            int b = f111651a.mo104721b(context);
            if (b != -1) {
                return m136590c(b);
            }
        }
        Object systemService = context.getSystemService("phone");
        if (systemService != null) {
            return ((TelephonyManager) systemService).getNetworkType();
        }
        throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    /* renamed from: c */
    private static int m136590c(int i) {
        int i2;
        Object obj = f111652b;
        if (obj == null) {
            C7573i.m23583a("obMSimTelephonyManager");
        }
        if (obj == null) {
            return -1;
        }
        try {
            Object obj2 = f111652b;
            if (obj2 == null) {
                C7573i.m23583a("obMSimTelephonyManager");
            }
            Class cls = Class.forName(obj2.getClass().getName());
            Class[] clsArr = new Class[1];
            if (VERSION.SDK_INT == 21) {
                clsArr[0] = Long.TYPE;
            } else {
                clsArr[0] = Integer.TYPE;
            }
            Method method = cls.getMethod("getNetworkType", (Class[]) Arrays.copyOf(clsArr, 1));
            Object[] objArr = new Object[1];
            if (VERSION.SDK_INT == 21) {
                objArr[0] = Long.valueOf(m136583a(i));
            } else {
                objArr[0] = Integer.valueOf(m136588b(i));
            }
            Object obj3 = f111652b;
            if (obj3 == null) {
                C7573i.m23583a("obMSimTelephonyManager");
            }
            Object invoke = method.invoke(obj3, Arrays.copyOf(objArr, 1));
            if (invoke != null) {
                i2 = ((Integer) invoke).intValue();
                return i2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception unused) {
            i2 = -1;
        }
    }

    /* renamed from: a */
    public static final long m136583a(int i) {
        long j;
        if (VERSION.SDK_INT <= 20) {
            return (long) i;
        }
        try {
            Object a = m136584a("android.telephony.SubscriptionManager", "getSubId", (Class<?>[]) new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
            if (!(a instanceof long[])) {
                a = null;
            }
            long[] jArr = (long[]) a;
            if (jArr != null) {
                j = jArr[0];
            } else {
                j = -1;
            }
        } catch (Exception unused) {
            j = (long) i;
        }
        return j;
    }

    /* renamed from: b */
    private static int m136589b(TelephonyManager telephonyManager) {
        C7573i.m23587b(telephonyManager, "tm");
        String str = Build.BRAND;
        C7573i.m23582a((Object) str, "Build.BRAND");
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            int i = 0;
            int i2 = 1;
            if (!C7634n.m23776c((CharSequence) lowerCase, (CharSequence) "huawei", false)) {
                String str2 = Build.BRAND;
                C7573i.m23582a((Object) str2, "Build.BRAND");
                if (str2 != null) {
                    String lowerCase2 = str2.toLowerCase();
                    C7573i.m23582a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                    if (!C7634n.m23776c((CharSequence) lowerCase2, (CharSequence) "xiaomi", false)) {
                        String str3 = Build.BRAND;
                        C7573i.m23582a((Object) str3, "Build.BRAND");
                        if (str3 != null) {
                            String lowerCase3 = str3.toLowerCase();
                            C7573i.m23582a((Object) lowerCase3, "(this as java.lang.String).toLowerCase()");
                            if (!C7634n.m23776c((CharSequence) lowerCase3, (CharSequence) "honor", false)) {
                                String str4 = Build.BRAND;
                                C7573i.m23582a((Object) str4, "Build.BRAND");
                                if (str4 != null) {
                                    String lowerCase4 = str4.toLowerCase();
                                    C7573i.m23582a((Object) lowerCase4, "(this as java.lang.String).toLowerCase()");
                                    if (!C7634n.m23776c((CharSequence) lowerCase4, (CharSequence) "oppo", false)) {
                                        String str5 = Build.BRAND;
                                        C7573i.m23582a((Object) str5, "Build.BRAND");
                                        if (str5 != null) {
                                            String lowerCase5 = str5.toLowerCase();
                                            C7573i.m23582a((Object) lowerCase5, "(this as java.lang.String).toLowerCase()");
                                            if (!C7634n.m23776c((CharSequence) lowerCase5, (CharSequence) "vivo", false)) {
                                                return -1;
                                            }
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                        }
                                    }
                                    if (telephonyManager.getNetworkType() != 0 ? telephonyManager.getNetworkType() != m136590c(0) : m136590c(0) == 0) {
                                        i = 1;
                                    }
                                    return i;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            if (telephonyManager.getNetworkType() == m136590c(0)) {
                i2 = 0;
            }
            return i2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[Catch:{ Exception -> 0x00b6 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m136592d(int r9) {
        /*
            java.lang.Object r0 = f111652b
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "obMSimTelephonyManager"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            r1 = 0
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.lang.Object r0 = f111652b     // Catch:{ Exception -> 0x00b6 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "obMSimTelephonyManager"
            kotlin.jvm.internal.C7573i.m23583a(r2)     // Catch:{ Exception -> 0x00b6 }
        L_0x0016:
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x00b6 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00b6 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00b6 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b6 }
            r5 = 21
            r6 = 0
            if (r4 != r5) goto L_0x0031
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x00b6 }
            r3[r6] = r4     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0035
        L_0x0031:
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x00b6 }
            r3[r6] = r4     // Catch:{ Exception -> 0x00b6 }
        L_0x0035:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b6 }
            if (r4 <= r5) goto L_0x0074
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b6 }
            r7 = 24
            if (r4 >= r7) goto L_0x0074
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r7 = "Build.BRAND"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)     // Catch:{ Exception -> 0x00b6 }
            if (r4 == 0) goto L_0x006c
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r7 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)     // Catch:{ Exception -> 0x00b6 }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r7 = "xiaomi"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x00b6 }
            r8 = 2
            boolean r4 = kotlin.text.C7634n.m23776c(r4, r7, false)     // Catch:{ Exception -> 0x00b6 }
            if (r4 == 0) goto L_0x005f
            goto L_0x0074
        L_0x005f:
            java.lang.String r4 = "getNetworkOperatorForSubscription"
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch:{ Exception -> 0x00b6 }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r3)     // Catch:{ Exception -> 0x00b6 }
            goto L_0x0080
        L_0x006c:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r0)     // Catch:{ Exception -> 0x00b6 }
            throw r9     // Catch:{ Exception -> 0x00b6 }
        L_0x0074:
            java.lang.String r4 = "getNetworkOperator"
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch:{ Exception -> 0x00b6 }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r3)     // Catch:{ Exception -> 0x00b6 }
        L_0x0080:
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00b6 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b6 }
            if (r4 != r5) goto L_0x0091
            long r4 = m136583a(r9)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x00b6 }
            r3[r6] = r9     // Catch:{ Exception -> 0x00b6 }
            goto L_0x009b
        L_0x0091:
            int r9 = m136588b(r9)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x00b6 }
            r3[r6] = r9     // Catch:{ Exception -> 0x00b6 }
        L_0x009b:
            if (r0 != 0) goto L_0x00a0
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x00b6 }
        L_0x00a0:
            java.lang.Object r9 = f111652b     // Catch:{ Exception -> 0x00b6 }
            if (r9 != 0) goto L_0x00a9
            java.lang.String r4 = "obMSimTelephonyManager"
            kotlin.jvm.internal.C7573i.m23583a(r4)     // Catch:{ Exception -> 0x00b6 }
        L_0x00a9:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Exception -> 0x00b6 }
            java.lang.Object r9 = r0.invoke(r9, r2)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00b7
        L_0x00b6:
            r9 = r1
        L_0x00b7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43053de.m136592d(int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m136595e(int r9) {
        /*
            java.lang.Object r0 = f111652b
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "obMSimTelephonyManager"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            r1 = 0
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.lang.Object r0 = f111652b     // Catch:{ Exception -> 0x007f }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "obMSimTelephonyManager"
            kotlin.jvm.internal.C7573i.m23583a(r2)     // Catch:{ Exception -> 0x007f }
        L_0x0016:
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x007f }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x007f }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x007f }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x007f }
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x007f }
            java.lang.String r4 = "getDeviceId"
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Exception -> 0x007f }
            java.lang.Class[] r6 = (java.lang.Class[]) r6     // Catch:{ Exception -> 0x007f }
            java.lang.reflect.Method r4 = r0.getMethod(r4, r6)     // Catch:{ Exception -> 0x007f }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x007f }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x007f }
            r8 = 21
            if (r7 != r8) goto L_0x0049
            long r7 = m136583a(r9)     // Catch:{ Exception -> 0x007f }
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x007f }
            r6[r5] = r9     // Catch:{ Exception -> 0x007f }
            goto L_0x0053
        L_0x0049:
            int r9 = m136588b(r9)     // Catch:{ Exception -> 0x007f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x007f }
            r6[r5] = r9     // Catch:{ Exception -> 0x007f }
        L_0x0053:
            java.lang.Object r9 = f111652b     // Catch:{ Exception -> 0x007f }
            if (r9 != 0) goto L_0x005c
            java.lang.String r5 = "obMSimTelephonyManager"
            kotlin.jvm.internal.C7573i.m23583a(r5)     // Catch:{ Exception -> 0x007f }
        L_0x005c:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r2)     // Catch:{ Exception -> 0x007f }
            java.lang.Object r9 = r4.invoke(r9, r5)     // Catch:{ Exception -> 0x007f }
            if (r9 == 0) goto L_0x006b
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x007f }
            r1 = r9
        L_0x006b:
            if (r1 == 0) goto L_0x0081
            java.lang.String r9 = r1.toLowerCase()     // Catch:{ Exception -> 0x007f }
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r9, r4)     // Catch:{ Exception -> 0x007f }
            java.lang.String r4 = "null"
            boolean r9 = kotlin.jvm.internal.C7573i.m23585a(r9, r4)     // Catch:{ Exception -> 0x007f }
            if (r9 == 0) goto L_0x00a8
            goto L_0x0081
        L_0x007f:
            goto L_0x00a8
        L_0x0081:
            java.lang.String r9 = "getImei"
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ Exception -> 0x007f }
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch:{ Exception -> 0x007f }
            java.lang.reflect.Method r9 = r0.getMethod(r9, r3)     // Catch:{ Exception -> 0x007f }
            java.lang.Object r0 = f111652b     // Catch:{ Exception -> 0x007f }
            if (r0 != 0) goto L_0x0096
            java.lang.String r3 = "obMSimTelephonyManager"
            kotlin.jvm.internal.C7573i.m23583a(r3)     // Catch:{ Exception -> 0x007f }
        L_0x0096:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r2)     // Catch:{ Exception -> 0x007f }
            java.lang.Object r9 = r9.invoke(r0, r2)     // Catch:{ Exception -> 0x007f }
            if (r9 != 0) goto L_0x00a3
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x007f }
        L_0x00a3:
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x007f }
            r1 = r9
        L_0x00a8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "imei is :"
            r9.<init>(r0)
            if (r1 != 0) goto L_0x00b4
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00b4:
            r9.append(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43053de.m136595e(int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r6 == null) goto L_0x004b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.Integer> m136593d(android.content.Context r6) {
        /*
            r0 = 2
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            java.lang.String r1 = "cellId"
            r2 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r3)
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "lac"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r3)
            r3 = 1
            r0[r3] = r1
            java.util.Map r0 = kotlin.collections.C7507ae.m23400b((kotlin.Pair<? extends K, ? extends V>[]) r0)
            if (r6 == 0) goto L_0x0116
            boolean r1 = r6 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0116
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 18
            if (r1 >= r3) goto L_0x0030
            goto L_0x0116
        L_0x0030:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            int r1 = android.support.p022v4.app.ActivityCompat.m2909b(r6, r1)
            if (r1 == 0) goto L_0x0039
            return r0
        L_0x0039:
            java.lang.String r1 = "phone"
            java.lang.Object r6 = r6.getSystemService(r1)
            if (r6 == 0) goto L_0x010e
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6
            if (r6 == 0) goto L_0x004b
            java.util.List r6 = r6.getAllCellInfo()     // Catch:{ Exception -> 0x00fa }
            if (r6 != 0) goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            if (r6 == 0) goto L_0x00fa
            int r1 = r6.size()     // Catch:{ Exception -> 0x00fa }
            if (r1 <= 0) goto L_0x00fa
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00fa }
            r1 = -1
            r3 = -1
        L_0x005a:
            boolean r4 = r6.hasNext()     // Catch:{ Exception -> 0x00fa }
            if (r4 == 0) goto L_0x00f8
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellInfo r4 = (android.telephony.CellInfo) r4     // Catch:{ Exception -> 0x00fa }
            java.lang.String r5 = "info"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)     // Catch:{ Exception -> 0x00fa }
            boolean r5 = r4.isRegistered()     // Catch:{ Exception -> 0x00fa }
            if (r5 != 0) goto L_0x0072
            goto L_0x005a
        L_0x0072:
            boolean r1 = r4 instanceof android.telephony.CellInfoLte     // Catch:{ Exception -> 0x00fa }
            if (r1 == 0) goto L_0x0096
            r1 = r4
            android.telephony.CellInfoLte r1 = (android.telephony.CellInfoLte) r1     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityLte r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = "info.cellIdentity"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)     // Catch:{ Exception -> 0x00fa }
            int r1 = r1.getCi()     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellInfoLte r4 = (android.telephony.CellInfoLte) r4     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityLte r3 = r4.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r4 = "info.cellIdentity"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)     // Catch:{ Exception -> 0x00fa }
            int r3 = r3.getTac()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00f4
        L_0x0096:
            boolean r1 = r4 instanceof android.telephony.CellInfoCdma     // Catch:{ Exception -> 0x00fa }
            if (r1 == 0) goto L_0x00aa
            android.telephony.CellInfoCdma r4 = (android.telephony.CellInfoCdma) r4     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityCdma r1 = r4.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r4 = "info.cellIdentity"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)     // Catch:{ Exception -> 0x00fa }
            int r1 = r1.getBasestationId()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00f4
        L_0x00aa:
            boolean r1 = r4 instanceof android.telephony.CellInfoGsm     // Catch:{ Exception -> 0x00fa }
            if (r1 == 0) goto L_0x00ce
            r1 = r4
            android.telephony.CellInfoGsm r1 = (android.telephony.CellInfoGsm) r1     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityGsm r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = "info.cellIdentity"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)     // Catch:{ Exception -> 0x00fa }
            int r1 = r1.getCid()     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellInfoGsm r4 = (android.telephony.CellInfoGsm) r4     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityGsm r3 = r4.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r4 = "info.cellIdentity"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)     // Catch:{ Exception -> 0x00fa }
            int r3 = r3.getLac()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00f4
        L_0x00ce:
            boolean r1 = r4 instanceof android.telephony.CellInfoWcdma     // Catch:{ Exception -> 0x00fa }
            if (r1 == 0) goto L_0x00f2
            r1 = r4
            android.telephony.CellInfoWcdma r1 = (android.telephony.CellInfoWcdma) r1     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityWcdma r1 = r1.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r3 = "info.cellIdentity"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)     // Catch:{ Exception -> 0x00fa }
            int r1 = r1.getCid()     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellInfoWcdma r4 = (android.telephony.CellInfoWcdma) r4     // Catch:{ Exception -> 0x00fa }
            android.telephony.CellIdentityWcdma r3 = r4.getCellIdentity()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r4 = "info.cellIdentity"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)     // Catch:{ Exception -> 0x00fa }
            int r3 = r3.getLac()     // Catch:{ Exception -> 0x00fa }
            goto L_0x00f4
        L_0x00f2:
            r1 = -1
            r3 = -1
        L_0x00f4:
            if (r1 != r2) goto L_0x00f8
            goto L_0x005a
        L_0x00f8:
            r2 = r3
            goto L_0x00fb
        L_0x00fa:
            r1 = -1
        L_0x00fb:
            java.lang.String r6 = "cellId"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r6, r1)
            java.lang.String r6 = "lac"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r6, r1)
            return r0
        L_0x010e:
            kotlin.TypeCastException r6 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r6.<init>(r0)
            throw r6
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43053de.m136593d(android.content.Context):java.util.Map");
    }

    /* renamed from: e */
    private int m136594e(Context context) {
        C7573i.m23587b(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            C7573i.m23582a((Object) activeNetworkInfo, "networkWorkerInfo");
            String extraInfo = activeNetworkInfo.getExtraInfo();
            String d = m136592d(0);
            String d2 = m136592d(1);
            if (extraInfo != null) {
                CharSequence charSequence = extraInfo;
                if (C7634n.m23776c(charSequence, (CharSequence) "3gnet", false) || C7634n.m23776c(charSequence, (CharSequence) "3gwap", false)) {
                    if (d != null && (C7573i.m23585a((Object) d, (Object) "46001") || C7573i.m23585a((Object) d, (Object) "46006"))) {
                        return 0;
                    }
                    if (d2 != null && (C7573i.m23585a((Object) d2, (Object) "46001") || C7573i.m23585a((Object) d2, (Object) "46006"))) {
                        return 1;
                    }
                    return -1;
                }
            }
            if (extraInfo != null) {
                CharSequence charSequence2 = extraInfo;
                if (C7634n.m23776c(charSequence2, (CharSequence) "cmnet", false) || C7634n.m23776c(charSequence2, (CharSequence) "cmwap", false)) {
                    if (d != null && (C7573i.m23585a((Object) d, (Object) "46000") || C7573i.m23585a((Object) d, (Object) "46002") || C7573i.m23585a((Object) d, (Object) "46007"))) {
                        return 0;
                    }
                    if (d2 != null && (C7573i.m23585a((Object) d2, (Object) "46000") || C7573i.m23585a((Object) d2, (Object) "46002") || C7573i.m23585a((Object) d2, (Object) "46007"))) {
                        return 1;
                    }
                    return -1;
                }
            }
            if (extraInfo != null) {
                CharSequence charSequence3 = extraInfo;
                if (C7634n.m23776c(charSequence3, (CharSequence) "ctnet", false) || C7634n.m23776c(charSequence3, (CharSequence) "ctwap", false)) {
                    if (d != null && (C7573i.m23585a((Object) d, (Object) "46003") || C7573i.m23585a((Object) d, (Object) "46005") || C7573i.m23585a((Object) d, (Object) "46011"))) {
                        return 0;
                    }
                    if (d2 != null && (C7573i.m23585a((Object) d2, (Object) "46003") || C7573i.m23585a((Object) d2, (Object) "46005") || C7573i.m23585a((Object) d2, (Object) "46011"))) {
                        return 1;
                    }
                }
            }
            return -1;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: b */
    public final int mo104721b(Context context) {
        C7573i.m23587b(context, "context");
        Object obj = f111652b;
        if (obj == null) {
            C7573i.m23583a("obMSimTelephonyManager");
        }
        int i = 0;
        if (obj == null) {
            return 0;
        }
        Object systemService = context.getSystemService("phone");
        if (systemService != null) {
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            if (VERSION.SDK_INT >= 21) {
                try {
                    if (VERSION.SDK_INT >= 26 && telephonyManager.getNetworkType() == 13 && m136590c(0) == 13 && m136590c(1) == 13) {
                        int e = m136594e(context);
                        if (e != -1) {
                            return e;
                        }
                        int a = m136582a(telephonyManager);
                        if (a != -1) {
                            return a;
                        }
                    }
                    int b = m136589b(telephonyManager);
                    if (b != -1) {
                        return b;
                    }
                    return m136581a();
                } catch (Exception unused) {
                    if (telephonyManager.getNetworkType() != m136590c(0)) {
                        i = 1;
                    }
                    return i;
                }
            } else {
                try {
                    Object obj2 = f111652b;
                    if (obj2 == null) {
                        C7573i.m23583a("obMSimTelephonyManager");
                    }
                    Method method = Class.forName(obj2.getClass().getName()).getMethod("getPreferredDataSubscription", new Class[0]);
                    Object obj3 = f111652b;
                    if (obj3 == null) {
                        C7573i.m23583a("obMSimTelephonyManager");
                    }
                    Object invoke = method.invoke(obj3, new Object[0]);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                } catch (Exception unused2) {
                    if (telephonyManager.getNetworkType() != m136590c(0)) {
                        i = 1;
                    }
                    return i;
                }
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
    }

    /* renamed from: a */
    public static final boolean m136587a(Context context) {
        C7573i.m23587b(context, "context");
        Object systemService = context.getSystemService("phone");
        if (systemService != null) {
            try {
                Object invoke = TelephonyManager.class.getMethod("getDefault", new Class[0]).invoke((TelephonyManager) systemService, new Object[0]);
                if (invoke == null) {
                    return false;
                }
                Object invoke2 = Class.forName(invoke.getClass().getName()).getMethod("isMultiSimEnabled", new Class[]{null}).invoke(invoke, new Object[]{null});
                if (invoke2 != null) {
                    return ((Boolean) invoke2).booleanValue();
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
            } catch (Exception unused) {
                return false;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
    }

    /* renamed from: a */
    private static Object m136584a(String str, String str2, Class<?>[] clsArr, Object[] objArr) throws Exception {
        C7573i.m23587b(str, "clazz");
        C7573i.m23587b(str2, "method");
        C7573i.m23587b(clsArr, "parameterType");
        C7573i.m23587b(objArr, "parameters");
        Class cls = Class.forName(str);
        Method declaredMethod = cls.getDeclaredMethod(str2, (Class[]) Arrays.copyOf(clsArr, 1));
        C7573i.m23582a((Object) declaredMethod, C13192m.f34940a);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(cls, Arrays.copyOf(objArr, 1));
    }

    /* renamed from: a */
    public static final void m136585a(Class<?> cls, String str, Object obj, Object obj2) throws Exception {
        C7573i.m23587b(cls, "clazz");
        C7573i.m23587b(str, "field");
        C7573i.m23587b(obj, "key");
        C7573i.m23587b(obj2, "value");
        Field declaredField = cls.getDeclaredField(str);
        C7573i.m23582a((Object) declaredField, "f");
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
