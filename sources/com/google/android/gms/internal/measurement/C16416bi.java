package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C15267r;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.bi */
public class C16416bi extends C16695r {

    /* renamed from: b */
    private static C16416bi f45962b;

    public C16416bi(C16697t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42476a() {
        synchronized (C16416bi.class) {
            f45962b = this;
        }
    }

    /* renamed from: b */
    public static C16416bi m53484b() {
        return f45962b;
    }

    /* renamed from: a */
    public final void mo42538a(C16412be beVar, String str) {
        String beVar2 = beVar != null ? beVar.toString() : "no hit data";
        String str2 = "Discarding hit. ";
        String valueOf = String.valueOf(str);
        mo43198d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), beVar2);
    }

    /* renamed from: a */
    public final void mo42539a(Map<String, String> map, String str) {
        String str2;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append((String) entry.getKey());
                sb.append('=');
                sb.append((String) entry.getValue());
            }
            str2 = sb.toString();
        } else {
            str2 = "no hit data";
        }
        String str3 = "Discarding hit. ";
        String valueOf = String.valueOf(str);
        mo43198d(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), str2);
    }

    /* renamed from: a */
    public final synchronized void mo42537a(int i, String str, Object obj, Object obj2, Object obj3) {
        C15267r.m44384a(str);
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        char c = mo43206j().mo42519a() ? 'C' : 'c';
        char charAt = "01VDIWEA?".charAt(i);
        String str2 = C16696s.f46636a;
        String c2 = m54832c(str, m53483a(obj), m53483a(obj2), m53483a(obj3));
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(c2).length());
        sb.append("3");
        sb.append(charAt);
        sb.append(c);
        sb.append(str2);
        sb.append(":");
        sb.append(c2);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = sb2.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
        }
        C16421bn h = this.f46634a.mo43223h();
        if (h != null) {
            h.f45973b.mo42557a(sb2);
        }
    }

    /* renamed from: a */
    private static String m53483a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            sb.append("...");
            sb.append(str);
            sb.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d));
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
    }
}
