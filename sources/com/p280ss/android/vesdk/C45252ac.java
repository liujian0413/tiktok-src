package com.p280ss.android.vesdk;

import android.content.Context;
import com.bef.effectsdk.C1942b;
import com.p280ss.android.medialib.common.C19706c;
import com.p280ss.android.ttve.log.C20456a;
import com.p280ss.android.ttve.monitor.C20469a;
import com.p280ss.android.ttve.monitor.C20477e;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.ttve.nativePort.TEEffectUtils;
import com.p280ss.android.vesdk.VEListener.C45206b;
import com.p280ss.android.vesdk.VEListener.C45222r;
import com.p280ss.android.vesdk.runtime.C45341a;
import com.p280ss.android.vesdk.runtime.VERuntime;
import com.p280ss.android.vesdk.runtime.p1778a.C45342a;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.ac */
public final class C45252ac {

    /* renamed from: a */
    public static int f116423a = C20479f.f55342a;

    /* renamed from: a */
    public static void m142757a() {
        C20479f.m67945a();
    }

    /* renamed from: a */
    public static void m142767a(boolean z) {
        VERuntime.m143285a().f116770i = true;
    }

    /* renamed from: a */
    public static void m142768a(boolean z, int i) throws VEException {
        int a = VERuntime.m143285a().mo108546a(z, i);
        if (a == -108) {
            throw new VEException(a, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: b */
    public static String m142769b() {
        return TEEffectUtils.getEffectVersion();
    }

    /* renamed from: b */
    public static void m142770b(int i) {
        C20477e.m67932a(i);
    }

    /* renamed from: c */
    public static void m142774c(boolean z) {
        C20477e.f55335c = z;
    }

    /* renamed from: f */
    public static void m142777f(boolean z) {
        VERuntime.m143287a(z);
    }

    /* renamed from: g */
    public static void m142778g(boolean z) {
        VERuntime.m143290d(z);
    }

    /* renamed from: a */
    public static void m142759a(int i) {
        C20479f.m67946a(i);
    }

    /* renamed from: c */
    public static int m142773c(String str) {
        C45251ab.m142754a(str);
        return 0;
    }

    /* renamed from: a */
    public static void m142758a(byte b) {
        C45372t.m143402a((String) null, b);
        C45276c.m142924a(C19706c.m64966a(b));
    }

    /* renamed from: b */
    public static void m142771b(String str) {
        VERuntime.m143289b(str);
    }

    /* renamed from: b */
    public static void m142772b(boolean z) {
        VERuntime.m143285a().f116767f = z;
        C45276c.m142930b(z);
    }

    /* renamed from: d */
    public static void m142775d(boolean z) throws VEException {
        int c = VERuntime.m143285a().mo108553c(z);
        if (c == -108) {
            throw new VEException(c, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: e */
    public static void m142776e(boolean z) {
        int b = VERuntime.m143285a().mo108552b(z);
        if (b == -108) {
            throw new VEException(b, "please set VEEnv or VEEnv#init");
        }
    }

    /* renamed from: a */
    public static void m142761a(C1942b bVar) {
        VERuntime.m143285a().mo108551a(bVar);
    }

    /* renamed from: a */
    public static void m142762a(C45206b bVar) {
        VERuntime.m143285a().mo108548a(bVar);
    }

    /* renamed from: a */
    public static void m142763a(C45222r rVar) {
        VERuntime.m143285a().mo108549a(rVar);
    }

    /* renamed from: a */
    public static void m142764a(C45321i iVar) {
        C20477e.m67935a(iVar.f116728b);
        C20477e.m67941b(iVar.f116729c);
        C45342a.m143305a().mo108559a("KEY_DEVICEID", iVar.f116729c, true);
        C20477e.m67942c(iVar.f116727a);
    }

    /* renamed from: a */
    public static void m142765a(C45366s sVar) {
        C20456a.m67877a(sVar);
        C20456a.m67875a();
        C20456a.m67878a(true);
    }

    /* renamed from: a */
    public static void m142766a(String str) {
        VERuntime.m143286a(str);
    }

    /* renamed from: a */
    public static void m142760a(Context context, String str) {
        VERuntime.m143285a().mo108547a(context, str);
        C45341a.m143301a().mo108556a(str);
        C20469a.m67906a("vesdk_event_init", (JSONObject) null, "behavior");
    }
}
