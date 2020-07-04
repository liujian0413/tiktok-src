package com.p280ss.android.agilelogger.formatter.p842b;

import com.p280ss.android.agilelogger.formatter.C19180a;
import java.util.Date;

/* renamed from: com.ss.android.agilelogger.formatter.b.a */
public final class C19183a implements C19180a<String> {

    /* renamed from: a */
    private Date f51860a;

    /* renamed from: a */
    private static String m62890a(String str) {
        return str;
    }

    public C19183a() {
        this("MM-dd HH:mm:ss");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo50910a(Object obj) {
        return m62890a((String) obj);
    }

    private C19183a(String str) {
        this.f51860a = new Date();
    }
}
