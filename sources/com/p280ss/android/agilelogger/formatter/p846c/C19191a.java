package com.p280ss.android.agilelogger.formatter.p846c;

import com.p280ss.android.agilelogger.utils.C19209m;

/* renamed from: com.ss.android.agilelogger.formatter.c.a */
public final class C19191a implements C19192b {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo50910a(Object obj) {
        return m62900a((StackTraceElement[]) obj);
    }

    /* renamed from: a */
    private static String m62900a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder(256);
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        if (stackTraceElementArr.length == 1) {
            StringBuilder sb2 = new StringBuilder("\t─ ");
            sb2.append(stackTraceElementArr[0].toString());
            return sb2.toString();
        }
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                sb.append("\t├ ");
                sb.append(stackTraceElementArr[i].toString());
                sb.append(C19209m.f51871a);
            } else {
                sb.append("\t└ ");
                sb.append(stackTraceElementArr[i].toString());
            }
        }
        return sb.toString();
    }
}
