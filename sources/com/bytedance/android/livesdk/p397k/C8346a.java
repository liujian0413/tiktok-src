package com.bytedance.android.livesdk.p397k;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.k.a */
public abstract class C8346a {

    /* renamed from: i */
    public String f22890i;

    /* renamed from: j */
    public int f22891j;

    /* renamed from: k */
    public final List<String> f22892k = new ArrayList();

    /* renamed from: a */
    public abstract String mo14416a();

    /* renamed from: b */
    public final boolean mo21504b() {
        String a = mo14416a();
        if (!TextUtils.isEmpty(a)) {
            return new File(a).exists();
        }
        return false;
    }

    public C8346a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(".zip");
        this.f22890i = sb.toString();
    }
}
