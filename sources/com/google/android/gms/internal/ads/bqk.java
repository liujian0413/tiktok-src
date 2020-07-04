package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class bqk<T> implements Comparable<bqk<T>> {

    /* renamed from: a */
    public final int f43251a;

    /* renamed from: b */
    public final String f43252b;

    /* renamed from: c */
    public final int f43253c;

    /* renamed from: d */
    public boolean f43254d;

    /* renamed from: e */
    public C15467ab f43255e;

    /* renamed from: f */
    public aux f43256f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C15634a f43257g;

    /* renamed from: h */
    private final Object f43258h;

    /* renamed from: i */
    private bxd f43259i;

    /* renamed from: j */
    private Integer f43260j;

    /* renamed from: k */
    private bug f43261k;

    /* renamed from: l */
    private boolean f43262l;

    /* renamed from: m */
    private boolean f43263m;

    /* renamed from: n */
    private boolean f43264n;

    /* renamed from: o */
    private bsj f43265o;

    public bqk(int i, String str, bxd bxd) {
        this.f43257g = C15634a.f44346a ? new C15634a() : null;
        this.f43258h = new Object();
        this.f43254d = true;
        int i2 = 0;
        this.f43262l = false;
        this.f43263m = false;
        this.f43264n = false;
        this.f43256f = null;
        this.f43251a = i;
        this.f43252b = str;
        this.f43259i = bxd;
        this.f43255e = new bhc();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    i2 = host.hashCode();
                }
            }
        }
        this.f43253c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bwf<T> mo39257a(bor bor);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39252a(T t);

    /* renamed from: a */
    public byte[] mo39254a() throws zza {
        return null;
    }

    /* renamed from: b */
    public final void mo41150b(String str) {
        if (C15634a.f44346a) {
            this.f43257g.mo41605a(str, Thread.currentThread().getId());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo41152c(String str) {
        if (this.f43261k != null) {
            this.f43261k.mo41337b(this);
        }
        if (C15634a.f44346a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new brk(this, str, id));
            } else {
                this.f43257g.mo41605a(str, id);
                this.f43257g.mo41604a(toString());
            }
        }
    }

    /* renamed from: a */
    public final bqk<?> mo41146a(bug bug) {
        this.f43261k = bug;
        return this;
    }

    /* renamed from: a */
    public final bqk<?> mo41144a(int i) {
        this.f43260j = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final String mo41151c() {
        String str = this.f43252b;
        int i = this.f43251a;
        if (i == 0 || i == -1) {
            return str;
        }
        String num = Integer.toString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final bqk<?> mo41145a(aux aux) {
        this.f43256f = aux;
        return this;
    }

    /* renamed from: b */
    public Map<String, String> mo39255b() throws zza {
        return Collections.emptyMap();
    }

    /* renamed from: d */
    public final int mo41154d() {
        return this.f43255e.mo39064a();
    }

    /* renamed from: e */
    public final void mo41155e() {
        synchronized (this.f43258h) {
            this.f43263m = true;
        }
    }

    /* renamed from: f */
    public final boolean mo41156f() {
        boolean z;
        synchronized (this.f43258h) {
            z = this.f43263m;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo41149a(zzae zzae) {
        bxd bxd;
        synchronized (this.f43258h) {
            bxd = this.f43259i;
        }
        if (bxd != null) {
            bxd.mo39251a(zzae);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41147a(bsj bsj) {
        synchronized (this.f43258h) {
            this.f43265o = bsj;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41148a(bwf<?> bwf) {
        bsj bsj;
        synchronized (this.f43258h) {
            bsj = this.f43265o;
        }
        if (bsj != null) {
            bsj.mo40583a(this, bwf);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo41157g() {
        bsj bsj;
        synchronized (this.f43258h) {
            bsj = this.f43265o;
        }
        if (bsj != null) {
            bsj.mo40582a(this);
        }
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(this.f43253c));
        String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        String str2 = "[ ] ";
        String str3 = this.f43252b;
        String valueOf2 = String.valueOf(zzu.NORMAL);
        String valueOf3 = String.valueOf(this.f43260j);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(str3).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(str2);
        sb.append(str3);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    public /* synthetic */ int compareTo(Object obj) {
        bqk bqk = (bqk) obj;
        zzu zzu = zzu.NORMAL;
        zzu zzu2 = zzu.NORMAL;
        return zzu == zzu2 ? this.f43260j.intValue() - bqk.f43260j.intValue() : zzu2.ordinal() - zzu.ordinal();
    }
}
