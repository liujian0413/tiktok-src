package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.ads.lp */
final class C15849lp {

    /* renamed from: a */
    long f44605a;

    /* renamed from: b */
    final String f44606b;

    /* renamed from: c */
    final String f44607c;

    /* renamed from: d */
    final long f44608d;

    /* renamed from: e */
    final long f44609e;

    /* renamed from: f */
    final long f44610f;

    /* renamed from: g */
    final long f44611g;

    /* renamed from: h */
    final List<bky> f44612h;

    private C15849lp(String str, String str2, long j, long j2, long j3, long j4, List<bky> list) {
        this.f44606b = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        this.f44607c = str2;
        this.f44608d = j;
        this.f44609e = j2;
        this.f44610f = j3;
        this.f44611g = j4;
        this.f44612h = list;
    }

    C15849lp(String str, aux aux) {
        List list;
        String str2 = aux.f41067b;
        long j = aux.f41068c;
        long j2 = aux.f41069d;
        long j3 = aux.f41070e;
        long j4 = aux.f41071f;
        if (aux.f41073h != null) {
            list = aux.f41073h;
        } else {
            Map<String, String> map = aux.f41072g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new bky((String) entry.getKey(), (String) entry.getValue()));
            }
            list = arrayList;
        }
        this(str, str2, j, j2, j3, j4, list);
    }

    /* renamed from: a */
    static C15849lp m51291a(C15877mq mqVar) throws IOException {
        if (C15821ko.m51157a((InputStream) mqVar) == 538247942) {
            C15849lp lpVar = new C15849lp(C15821ko.m51159a(mqVar), C15821ko.m51159a(mqVar), C15821ko.m51165b((InputStream) mqVar), C15821ko.m51165b((InputStream) mqVar), C15821ko.m51165b((InputStream) mqVar), C15821ko.m51165b((InputStream) mqVar), C15821ko.m51166b(mqVar));
            return lpVar;
        }
        throw new IOException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo41738a(OutputStream outputStream) {
        try {
            C15821ko.m51160a(outputStream, 538247942);
            C15821ko.m51162a(outputStream, this.f44606b);
            C15821ko.m51162a(outputStream, this.f44607c == null ? "" : this.f44607c);
            C15821ko.m51161a(outputStream, this.f44608d);
            C15821ko.m51161a(outputStream, this.f44609e);
            C15821ko.m51161a(outputStream, this.f44610f);
            C15821ko.m51161a(outputStream, this.f44611g);
            List<bky> list = this.f44612h;
            if (list != null) {
                C15821ko.m51160a(outputStream, list.size());
                for (bky bky : list) {
                    C15821ko.m51162a(outputStream, bky.f42430a);
                    C15821ko.m51162a(outputStream, bky.f42431b);
                }
            } else {
                C15821ko.m51160a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            new Object[1][0] = e.toString();
            return false;
        }
    }
}
