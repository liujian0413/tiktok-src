package com.google.api.client.http;

import com.google.api.client.util.C17350ae;
import com.google.api.client.util.C17366i;
import com.google.api.client.util.C17371k;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.p782a.C17340a;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.http.ab */
public final class C17239ab extends C17231a {

    /* renamed from: b */
    public Object f48049b;

    /* renamed from: a */
    private C17239ab m57309a(Object obj) {
        this.f48049b = C17384w.m57847a(obj);
        return this;
    }

    public C17239ab(Object obj) {
        super(C17240ac.f48050a);
        m57309a(obj);
    }

    /* renamed from: a */
    public static C17239ab m57308a(C17266o oVar) {
        C17257h hVar = oVar.f48103h;
        if (hVar != null) {
            return (C17239ab) hVar;
        }
        C17239ab abVar = new C17239ab(new HashMap());
        oVar.mo44643a((C17257h) abVar);
        return abVar;
    }

    /* renamed from: a */
    public final void mo44591a(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, mo44565b()));
        boolean z = true;
        for (Entry entry : C17366i.m57815b(this.f48049b).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String a = C17340a.m57752a((String) entry.getKey());
                Class cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object a2 : C17350ae.m57777a(value)) {
                        z = m57310a(z, bufferedWriter, a, a2);
                    }
                } else {
                    z = m57310a(z, bufferedWriter, a, value);
                }
            }
        }
        bufferedWriter.flush();
    }

    /* renamed from: a */
    private static boolean m57310a(boolean z, Writer writer, String str, Object obj) throws IOException {
        String str2;
        if (obj == null || C17366i.m57811a(obj)) {
            return z;
        }
        if (z) {
            z = false;
        } else {
            writer.write("&");
        }
        writer.write(str);
        if (obj instanceof Enum) {
            str2 = C17371k.m57823a((Enum) obj).f48314c;
        } else {
            str2 = obj.toString();
        }
        String a = C17340a.m57752a(str2);
        if (a.length() != 0) {
            writer.write("=");
            writer.write(a);
        }
        return z;
    }
}
