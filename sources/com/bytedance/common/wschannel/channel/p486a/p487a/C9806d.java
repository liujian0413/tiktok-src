package com.bytedance.common.wschannel.channel.p486a.p487a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.wschannel.channel.p486a.p487a.p488a.C9771c;
import com.bytedance.common.wschannel.channel.p486a.p487a.p488a.C9773e;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Response;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.d */
final class C9806d {

    /* renamed from: a */
    private final List<String> f26692a = new ArrayList();

    /* renamed from: b */
    private final C9771c f26693b;

    /* renamed from: c */
    private C9773e f26694c;

    /* renamed from: d */
    private int f26695d;

    /* renamed from: e */
    private String f26696e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo24268a() {
        this.f26694c.mo24198c();
        this.f26696e = null;
        this.f26695d = 0;
    }

    /* renamed from: c */
    private synchronized String m28915c() {
        int i = this.f26695d + 1;
        this.f26695d = i;
        if (this.f26692a.size() > i) {
            this.f26696e = (String) this.f26692a.get(i);
            return this.f26696e;
        }
        return "";
    }

    /* renamed from: b */
    public final synchronized String mo24269b() {
        if (C6319n.m19593a(this.f26696e) && this.f26692a.size() > this.f26695d) {
            this.f26696e = (String) this.f26692a.get(this.f26695d);
        }
        return this.f26696e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized Pair<String, Long> mo24267a(Response response) {
        String b;
        long a;
        b = mo24269b();
        a = this.f26694c.mo24196a(response);
        if (a == -1) {
            this.f26694c.mo24198c();
            b = m28915c();
            if (!TextUtils.isEmpty(b)) {
                a = this.f26694c.mo24197b();
            }
        }
        return new Pair<>(b, Long.valueOf(a));
    }

    C9806d(List<String> list, C9773e eVar, C9771c cVar) {
        if (list != null) {
            this.f26692a.addAll(list);
        }
        this.f26694c = eVar;
        this.f26693b = cVar;
        mo24268a();
    }
}
