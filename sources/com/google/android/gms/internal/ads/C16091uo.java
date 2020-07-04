package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.ads.uo */
public class C16091uo extends bqk<String> {

    /* renamed from: g */
    private final Object f45120g = new Object();

    /* renamed from: h */
    private byb<String> f45121h;

    public C16091uo(int i, String str, byb<String> byb, bxd bxd) {
        super(i, str, bxd);
        this.f45121h = byb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo39252a(String str) {
        byb<String> byb;
        synchronized (this.f45120g) {
            byb = this.f45121h;
        }
        if (byb != null) {
            byb.mo39256a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bwf<String> mo39257a(bor bor) {
        String str;
        try {
            byte[] bArr = bor.f43049b;
            String str2 = "ISO-8859-1";
            String str3 = (String) bor.f43050c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bor.f43049b);
        }
        return bwf.m50203a(str, C15904nq.m51392a(bor));
    }
}
