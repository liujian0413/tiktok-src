package com.p280ss.android.ugc.aweme.tools;

import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.taobao.android.dexposed.ClassUtils;
import java.io.PrintWriter;

/* renamed from: com.ss.android.ugc.aweme.tools.aa */
public final class C42134aa<T extends C42155av> implements C42159az<T> {

    /* renamed from: a */
    C42159az<T> f109650a;

    /* renamed from: b */
    PrintWriter f109651b;

    /* renamed from: a */
    private static String m134099a(Object obj) {
        String name = obj.getClass().getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    public C42134aa(C42159az<T> azVar, PrintWriter printWriter) {
        this.f109650a = azVar;
        this.f109651b = printWriter;
    }

    /* renamed from: a */
    public final void mo96096a(Object obj, T t) {
        String a = m134099a(obj);
        String a2 = m134099a(this.f109650a);
        PrintWriter printWriter = this.f109651b;
        StringBuilder sb = new StringBuilder("Dispatching ");
        sb.append(t);
        sb.append(" from ");
        sb.append(a);
        sb.append(" to ");
        sb.append(a2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        printWriter.println(sb.toString());
        try {
            this.f109650a.mo96096a(obj, t);
        } catch (RuntimeException e) {
            PrintWriter printWriter2 = this.f109651b;
            StringBuilder sb2 = new StringBuilder("RuntimeException occurred dispatching event ");
            sb2.append(t);
            sb2.append(" from ");
            sb2.append(a);
            sb2.append(" to handler ");
            sb2.append(a2);
            sb2.append(".\n");
            sb2.append(e.toString());
            printWriter2.println(sb2.toString());
            throw e;
        } catch (Error e2) {
            PrintWriter printWriter3 = this.f109651b;
            StringBuilder sb3 = new StringBuilder("Error occurred dispatching event ");
            sb3.append(t);
            sb3.append(" from ");
            sb3.append(a);
            sb3.append(" to handler ");
            sb3.append(a2);
            sb3.append(".\n");
            sb3.append(e2.toString());
            printWriter3.println(sb3.toString());
            throw e2;
        }
    }
}
