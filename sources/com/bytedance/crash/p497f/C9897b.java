package com.bytedance.crash.p497f;

import com.bytedance.crash.C9918j;
import com.bytedance.crash.p504l.C9972a;

/* renamed from: com.bytedance.crash.f.b */
public final class C9897b extends C9896a {

    /* renamed from: d */
    private String f26987d;

    private C9897b(String str) {
        this.f26987d = str;
    }

    /* renamed from: a */
    public static C9897b m29246a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4) {
        C9897b bVar = new C9897b("core_exception_monitor");
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        bVar.mo24492a("event_type", (Object) "exception");
        bVar.mo24492a("log_type", (Object) "core_exception_monitor");
        bVar.mo24492a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo24492a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo24492a("class_ref", (Object) className);
        bVar.mo24492a("method", (Object) methodName);
        bVar.mo24492a("line_num", (Object) Integer.valueOf(lineNumber));
        bVar.mo24492a("stack", (Object) str);
        bVar.mo24492a("exception_type", (Object) Integer.valueOf(1));
        bVar.mo24492a("ensure_type", (Object) str4);
        bVar.mo24492a("is_core", (Object) Integer.valueOf(z ? 1 : 0));
        bVar.mo24492a("message", (Object) str2);
        bVar.mo24492a("process_name", (Object) C9972a.m29507c(C9918j.m29342g()));
        bVar.mo24492a("crash_thread_name", (Object) str3);
        return bVar;
    }

    /* renamed from: a */
    public static C9897b m29247a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C9897b bVar = new C9897b(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        bVar.mo24492a("event_type", (Object) "exception");
        bVar.mo24492a("log_type", (Object) str5);
        bVar.mo24492a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo24492a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo24492a("class_ref", (Object) className);
        bVar.mo24492a("method", (Object) methodName);
        bVar.mo24492a("line_num", (Object) Integer.valueOf(lineNumber));
        bVar.mo24492a("stack", (Object) str);
        bVar.mo24492a("exception_type", (Object) Integer.valueOf(1));
        bVar.mo24492a("ensure_type", (Object) str4);
        bVar.mo24492a("is_core", (Object) Integer.valueOf(z ? 1 : 0));
        bVar.mo24492a("message", (Object) str2);
        bVar.mo24492a("process_name", (Object) C9972a.m29507c(C9918j.m29342g()));
        bVar.mo24492a("crash_thread_name", (Object) str3);
        return bVar;
    }
}
