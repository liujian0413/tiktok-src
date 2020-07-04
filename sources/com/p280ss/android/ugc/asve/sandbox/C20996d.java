package com.p280ss.android.ugc.asve.sandbox;

import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.recorder.C20675b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.asve.sandbox.d */
public final class C20996d implements InvocationHandler {

    /* renamed from: a */
    private Object f56458a;

    public C20996d(Object obj) {
        this.f56458a = obj;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m70295a(java.lang.reflect.Method r3) {
        /*
            java.lang.reflect.Type r3 = r3.getGenericReturnType()
            java.lang.String r3 = r3.toString()
            int r0 = r3.hashCode()
            r1 = 0
            r2 = -1
            switch(r0) {
                case -1808118735: goto L_0x0058;
                case -1325958191: goto L_0x004e;
                case 104431: goto L_0x0044;
                case 3039496: goto L_0x003a;
                case 3327612: goto L_0x0030;
                case 64711720: goto L_0x0026;
                case 97526364: goto L_0x001c;
                case 109413500: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0062
        L_0x0012:
            java.lang.String r0 = "short"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0062
            r3 = 6
            goto L_0x0063
        L_0x001c:
            java.lang.String r0 = "float"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0062
            r3 = 2
            goto L_0x0063
        L_0x0026:
            java.lang.String r0 = "boolean"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0062
            r3 = 3
            goto L_0x0063
        L_0x0030:
            java.lang.String r0 = "long"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x003a:
            java.lang.String r0 = "byte"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0062
            r3 = 7
            goto L_0x0063
        L_0x0044:
            java.lang.String r0 = "int"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0062
            r3 = 0
            goto L_0x0063
        L_0x004e:
            java.lang.String r0 = "double"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0062
            r3 = 5
            goto L_0x0063
        L_0x0058:
            java.lang.String r0 = "String"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0062
            r3 = 4
            goto L_0x0063
        L_0x0062:
            r3 = -1
        L_0x0063:
            switch(r3) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0088;
                case 2: goto L_0x0081;
                case 3: goto L_0x007c;
                case 4: goto L_0x0079;
                case 5: goto L_0x0072;
                case 6: goto L_0x006d;
                case 7: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            r3 = 0
            return r3
        L_0x0068:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            return r3
        L_0x006d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            return r3
        L_0x0072:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L_0x0079:
            java.lang.String r3 = ""
            return r3
        L_0x007c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L_0x0081:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L_0x0088:
            r0 = -1
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L_0x008f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.sandbox.C20996d.m70295a(java.lang.reflect.Method):java.lang.Object");
    }

    /* renamed from: a */
    private void m70296a(Method method, Exception exc) {
        C15382b bVar = C15382b.f39669a;
        StringBuilder sb = new StringBuilder("ipc invoke: ");
        sb.append(Thread.currentThread().getName());
        sb.append("   ");
        sb.append(method.getName());
        sb.append("  return type: ");
        sb.append(method.getGenericReturnType());
        sb.append(exc.toString());
        bVar.mo38742c(sb.toString());
        C20675b d = C6855a.m21306a().mo38947d();
        if (d != null) {
            d.mo55882a((Throwable) exc, "sandbox_ipc_exception");
        }
        m70297b(method, exc);
    }

    /* renamed from: b */
    private void m70297b(Method method, Exception exc) {
        HashMap hashMap = new HashMap(8);
        if (this.f56458a != null) {
            hashMap.put("target_name", this.f56458a.toString());
        }
        hashMap.put("method_name", method.getName());
        hashMap.put("return_name", method.getGenericReturnType().toString());
        hashMap.put("exception_detail", exc.toString());
        C20675b d = C6855a.m21306a().mo38947d();
        if (d != null) {
            d.mo55881a("sandbox_ipc_invoke_exception", (Map<String, String>) hashMap);
        }
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(this.f56458a, objArr);
        } catch (Exception e) {
            m70296a(method, e);
            return m70295a(method);
        }
    }
}
