package com.p280ss.android.ttve.log;

import com.p280ss.android.vesdk.C45366s;

/* renamed from: com.ss.android.ttve.log.a */
public final class C20456a {

    /* renamed from: a */
    private static C45366s f55250a;

    /* renamed from: a */
    public static void m67875a() {
        TELog2ClientInvoker.nativeInit();
    }

    /* renamed from: a */
    public static void m67877a(C45366s sVar) {
        f55250a = sVar;
    }

    /* renamed from: a */
    public static void m67878a(boolean z) {
        TELog2ClientInvoker.nativeSetLog2ClientSwitch(true);
    }

    /* renamed from: a */
    public static void m67876a(int i, String str) {
        if (f55250a != null) {
            C45366s sVar = f55250a;
            StringBuilder sb = new StringBuilder("[VESDK]");
            sb.append(str);
            sVar.mo38990a(i, sb.toString());
        }
    }
}
