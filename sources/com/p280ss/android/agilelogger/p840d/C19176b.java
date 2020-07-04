package com.p280ss.android.agilelogger.p840d;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.C1642a;
import com.p280ss.android.agilelogger.C19178e;
import com.p280ss.android.agilelogger.C19179f;
import com.p280ss.android.agilelogger.utils.C19207k;
import com.p280ss.android.agilelogger.utils.FormatUtils;
import java.util.Locale;

/* renamed from: com.ss.android.agilelogger.d.b */
public final class C19176b {
    /* renamed from: a */
    public static void m62881a(C19178e eVar) {
        String str;
        String str2 = "";
        switch (eVar.f51852g) {
            case MSG:
                str2 = (String) eVar.f51853h;
                break;
            case STACKTRACE_STR:
                if (eVar.f51854i != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(eVar.f51854i);
                    sb.append(C19207k.m62944a((Throwable) eVar.f51853h));
                    str2 = sb.toString();
                    break;
                } else {
                    str2 = C19207k.m62944a((Throwable) eVar.f51853h);
                    break;
                }
            case BORDER:
                str2 = FormatUtils.m62906a(eVar.f51852g, (String) eVar.f51853h);
                break;
            case JSON:
                str2 = FormatUtils.m62906a(eVar.f51852g, (String) eVar.f51853h);
                break;
            case BUNDLE:
                str2 = FormatUtils.m62905a(eVar.f51852g, (Bundle) eVar.f51853h);
                break;
            case INTENT:
                str2 = FormatUtils.m62904a(eVar.f51852g, (Intent) eVar.f51853h);
                break;
            case THROWABLE:
                str2 = FormatUtils.m62908a(eVar.f51852g, (Throwable) eVar.f51853h);
                break;
            case THREAD:
                str2 = FormatUtils.m62907a(eVar.f51852g, (Thread) eVar.f51853h);
                break;
            case STACKTRACE:
                str2 = FormatUtils.m62909a(eVar.f51852g, (StackTraceElement[]) eVar.f51853h);
                break;
        }
        eVar.f51849d = str2;
        Locale locale = Locale.getDefault();
        String str3 = "[%s][%d:%d%s][%s][%s][%s, %s, %s]%s\n";
        Object[] objArr = new Object[10];
        objArr[0] = "";
        objArr[1] = Integer.valueOf(Process.myPid());
        objArr[2] = Long.valueOf(eVar.f51850e);
        if (eVar.f51851f) {
            str = "*";
        } else {
            str = "";
        }
        objArr[3] = str;
        objArr[4] = C19179f.m62885a(eVar.f51847b);
        objArr[5] = "";
        objArr[6] = eVar.f51855j;
        objArr[7] = eVar.f51856k;
        objArr[8] = eVar.f51857l;
        objArr[9] = eVar.f51849d;
        C1642a.m8035a(locale, str3, objArr);
    }
}
