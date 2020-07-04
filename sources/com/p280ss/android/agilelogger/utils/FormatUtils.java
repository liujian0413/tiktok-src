package com.p280ss.android.agilelogger.utils;

import android.content.Intent;
import android.os.Bundle;
import com.p280ss.android.agilelogger.formatter.C19180a;
import com.p280ss.android.agilelogger.formatter.p841a.C19182b;
import com.p280ss.android.agilelogger.formatter.p842b.C19183a;
import com.p280ss.android.agilelogger.formatter.p842b.p843a.C19184a;
import com.p280ss.android.agilelogger.formatter.p842b.p844b.C19186a;
import com.p280ss.android.agilelogger.formatter.p842b.p844b.C19187b;
import com.p280ss.android.agilelogger.formatter.p842b.p845c.C19189a;
import com.p280ss.android.agilelogger.formatter.p846c.C19191a;
import com.p280ss.android.agilelogger.formatter.p847d.C19193a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.agilelogger.utils.FormatUtils */
public final class FormatUtils {

    /* renamed from: a */
    private static ConcurrentHashMap<TYPE, C19180a> f51862a;

    /* renamed from: com.ss.android.agilelogger.utils.FormatUtils$TYPE */
    public enum TYPE {
        MSG,
        JSON,
        BUNDLE,
        INTENT,
        THROWABLE,
        BORDER,
        STACKTRACE,
        THREAD,
        STACKTRACE_STR
    }

    static {
        ConcurrentHashMap<TYPE, C19180a> concurrentHashMap = new ConcurrentHashMap<>();
        f51862a = concurrentHashMap;
        concurrentHashMap.put(TYPE.MSG, new C19183a());
        f51862a.put(TYPE.JSON, new C19184a());
        f51862a.put(TYPE.BUNDLE, new C19186a());
        f51862a.put(TYPE.INTENT, new C19187b());
        f51862a.put(TYPE.BORDER, new C19182b());
        f51862a.put(TYPE.STACKTRACE, new C19191a());
        f51862a.put(TYPE.THREAD, new C19193a());
        f51862a.put(TYPE.THROWABLE, new C19189a());
    }

    /* renamed from: a */
    public static String m62904a(TYPE type, Intent intent) {
        f51862a.get(type);
        return C19187b.m62896a(intent);
    }

    /* renamed from: a */
    public static String m62905a(TYPE type, Bundle bundle) {
        f51862a.get(type);
        return C19186a.m62894a(bundle);
    }

    /* renamed from: a */
    public static String m62906a(TYPE type, String str) {
        C19180a aVar = (C19180a) f51862a.get(type);
        if (aVar == null) {
            return str;
        }
        if (type != TYPE.BORDER) {
            return aVar.mo50910a(str);
        }
        return aVar.mo50910a(new String[]{str});
    }

    /* renamed from: a */
    public static String m62907a(TYPE type, Thread thread) {
        return ((C19180a) f51862a.get(type)).mo50910a(thread);
    }

    /* renamed from: a */
    public static String m62908a(TYPE type, Throwable th) {
        return ((C19180a) f51862a.get(type)).mo50910a(th);
    }

    /* renamed from: a */
    public static String m62909a(TYPE type, StackTraceElement[] stackTraceElementArr) {
        return ((C19180a) f51862a.get(type)).mo50910a(stackTraceElementArr);
    }
}
