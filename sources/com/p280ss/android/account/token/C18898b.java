package com.p280ss.android.account.token;

import android.webkit.URLUtil;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.ss.android.account.token.b */
public final class C18898b {

    /* renamed from: a */
    public String f50942a;

    /* renamed from: b */
    public Set<String> f50943b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public C18907h f50944c;

    /* renamed from: d */
    public String f50945d;

    /* renamed from: e */
    public boolean f50946e = false;

    /* renamed from: f */
    public long f50947f = 600000;

    /* renamed from: g */
    public long f50948g = 300000;

    /* renamed from: h */
    public C18899a f50949h;

    /* renamed from: com.ss.android.account.token.b$a */
    public interface C18899a {
        /* renamed from: a */
        boolean mo50267a(String str);
    }

    /* renamed from: a */
    public final C18898b mo50262a(C18907h hVar) {
        this.f50944c = hVar;
        return this;
    }

    /* renamed from: a */
    public final C18898b mo50261a(long j) {
        this.f50947f = 600000;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo50266b(Collection<String> collection) {
        this.f50943b.addAll(collection);
    }

    /* renamed from: a */
    public final C18898b mo50264a(Collection<String> collection) {
        this.f50943b.addAll(collection);
        return this;
    }

    /* renamed from: a */
    public final C18898b mo50265a(boolean z) {
        this.f50946e = true;
        return this;
    }

    /* renamed from: a */
    public final C18898b mo50263a(String str) {
        if (URLUtil.isNetworkUrl(str)) {
            if (URLUtil.isHttpUrl(str)) {
                str = str.replace(WebKitApi.SCHEME_HTTP, WebKitApi.SCHEME_HTTPS);
            }
            this.f50942a = str;
            String a = C18906g.m61718a(str);
            if (a != null) {
                this.f50943b.add(a);
            }
        }
        return this;
    }
}
