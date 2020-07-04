package com.ixigua.p795a.p796a;

import android.text.TextUtils;
import com.ixigua.downloader.p797a.C18464b;
import com.ixigua.downloader.pojo.Task;
import com.ixigua.downloader.pojo.Task.C18490a;
import java.io.File;
import java.net.URI;

/* renamed from: com.ixigua.a.a.d */
public final class C18456d {

    /* renamed from: a */
    public final String f50032a;

    /* renamed from: b */
    public final String f50033b;

    /* renamed from: c */
    public final String f50034c;

    /* renamed from: d */
    public final boolean f50035d;

    /* renamed from: e */
    public final boolean f50036e;

    /* renamed from: f */
    public final int f50037f;

    /* renamed from: g */
    public final boolean f50038g;

    /* renamed from: h */
    public final boolean f50039h;

    /* renamed from: i */
    public final boolean f50040i;

    /* renamed from: j */
    private Task f50041j;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo47925c() {
        return C18464b.m60807a(new File(mo47924b()));
    }

    /* renamed from: e */
    private String m60769e() {
        try {
            String path = new URI(this.f50034c).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return this.f50034c;
        }
    }

    /* renamed from: a */
    public final boolean mo47923a() {
        if (TextUtils.isEmpty(this.f50033b) || TextUtils.isEmpty(this.f50034c) || TextUtils.isEmpty(this.f50032a)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo47924b() {
        StringBuilder sb = new StringBuilder();
        sb.append(C18453c.f50025a);
        sb.append(File.separator);
        sb.append(this.f50032a);
        sb.append(File.separator);
        sb.append(this.f50033b);
        sb.append(File.separator);
        sb.append(m60769e());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final synchronized Task mo47926d() {
        if (this.f50041j == null) {
            this.f50041j = new C18490a().mo48011a(mo47924b()).mo48014b(this.f50034c).mo48012a(this.f50038g).mo48016c(this.f50039h).mo48015b(this.f50040i).mo48010a(this.f50037f).mo48013a();
        }
        return this.f50041j;
    }

    C18456d(C18457e eVar) {
        this.f50032a = eVar.f50042a;
        this.f50033b = eVar.f50043b;
        this.f50034c = eVar.f50044c;
        this.f50035d = eVar.f50045d;
        this.f50036e = eVar.f50046e;
        this.f50037f = eVar.f50047f;
        this.f50038g = eVar.f50048g;
        this.f50039h = eVar.f50049h;
        this.f50040i = eVar.f50050i;
    }
}
