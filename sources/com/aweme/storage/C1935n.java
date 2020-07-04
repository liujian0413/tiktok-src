package com.aweme.storage;

import android.text.TextUtils;
import java.io.File;
import java.util.List;

/* renamed from: com.aweme.storage.n */
public final class C1935n {

    /* renamed from: a */
    public String f6963a;

    /* renamed from: b */
    public String f6964b;

    /* renamed from: c */
    public long f6965c;

    /* renamed from: d */
    public List<C1936a> f6966d;

    /* renamed from: com.aweme.storage.n$a */
    public static class C1936a {

        /* renamed from: a */
        public String f6967a;

        /* renamed from: b */
        public String f6968b;

        /* renamed from: c */
        public long f6969c;

        /* renamed from: a */
        public final void mo7554a(String str) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f6967a)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                sb.append(this.f6967a);
                String sb2 = sb.toString();
                if (new File(sb2).exists()) {
                    this.f6969c = C1921e.m8888a(sb2);
                }
            }
        }

        public C1936a(String str, String str2) {
            this.f6968b = str2;
            this.f6967a = str;
        }
    }

    /* renamed from: a */
    public final void mo7553a() {
        if (!TextUtils.isEmpty(this.f6963a) && this.f6966d != null && !this.f6966d.isEmpty()) {
            for (C1936a aVar : this.f6966d) {
                if (aVar != null) {
                    aVar.mo7554a(this.f6963a);
                }
            }
            this.f6965c = C1921e.m8888a(this.f6963a);
        }
    }

    public C1935n(String str, String str2) {
        this.f6964b = str;
        this.f6963a = str2;
    }

    public C1935n(String str, String str2, List<C1936a> list) {
        this.f6964b = str;
        this.f6963a = str2;
        this.f6966d = list;
    }
}
