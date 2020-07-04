package com.p280ss.optimizer.live.sdk.dns;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.optimizer.live.sdk.dns.j */
public final class C45921j {

    /* renamed from: a */
    public final String f117385a;

    /* renamed from: b */
    public final List<String> f117386b = new ArrayList();

    /* renamed from: c */
    public final long f117387c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("\"");
        sb.append(this.f117385a);
        sb.append("\":[");
        String sb2 = sb.toString();
        if (this.f117386b != null) {
            for (int i = 0; i < this.f117386b.size(); i++) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("\"");
                sb3.append((String) this.f117386b.get(i));
                sb3.append("\"");
                sb2 = sb3.toString();
                if (i != this.f117386b.size() - 1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append(",");
                    sb2 = sb4.toString();
                }
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append("]");
        return sb5.toString();
    }

    public C45921j(String str, List<String> list, long j) {
        this.f117385a = str;
        this.f117387c = 0;
        if (list != null) {
            this.f117386b.addAll(list);
        }
    }
}
