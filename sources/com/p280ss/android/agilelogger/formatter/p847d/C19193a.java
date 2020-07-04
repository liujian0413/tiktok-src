package com.p280ss.android.agilelogger.formatter.p847d;

/* renamed from: com.ss.android.agilelogger.formatter.d.a */
public final class C19193a implements C19194b {

    /* renamed from: a */
    private final String f51861a = "Thread: ";

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo50910a(Object obj) {
        return m62902a((Thread) obj);
    }

    /* renamed from: a */
    private static String m62902a(Thread thread) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Thread: ");
        stringBuffer.append(thread.getName());
        return stringBuffer.toString();
    }
}
