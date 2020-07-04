package com.p280ss.android.ugc.aweme.shortvideo.p1571f;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f.h */
public final class C39849h {

    /* renamed from: a */
    public String f103559a;

    /* renamed from: b */
    public boolean f103560b;

    /* renamed from: c */
    public String f103561c;

    /* renamed from: d */
    public long f103562d;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f103559a);
        sb.append(": ");
        sb.append(this.f103561c);
        sb.append("  存在?");
        sb.append(this.f103560b);
        sb.append(" size: ");
        sb.append(this.f103562d);
        return sb.toString();
    }

    public C39849h(String str, String str2) {
        this.f103559a = str;
        this.f103561c = str2;
        if (!TextUtils.isEmpty(str2)) {
            File file = new File(str2);
            if (file.exists() && file.isFile()) {
                this.f103560b = true;
                this.f103562d = file.length();
                return;
            }
        }
        this.f103560b = false;
        this.f103562d = 0;
    }
}
