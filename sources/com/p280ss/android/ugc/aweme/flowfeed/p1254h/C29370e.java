package com.p280ss.android.ugc.aweme.flowfeed.p1254h;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.utils.C42975bi;
import com.p280ss.android.ugc.aweme.video.C43222g;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.e */
public final class C29370e {

    /* renamed from: a */
    public Aweme f77396a;

    /* renamed from: b */
    public int f77397b;

    /* renamed from: c */
    public C42975bi f77398c = new C42975bi(1);

    /* renamed from: d */
    public int f77399d;

    /* renamed from: e */
    public int f77400e;

    /* renamed from: f */
    public long f77401f = -1;

    /* renamed from: g */
    public C43222g f77402g;

    /* renamed from: h */
    public String f77403h;

    /* renamed from: i */
    public boolean f77404i = false;

    /* renamed from: j */
    private boolean f77405j;

    /* renamed from: k */
    private long f77406k = -1;

    /* renamed from: a */
    public final void mo75097a(boolean z, String str, String str2, String str3) {
        if (this.f77401f != -1) {
            C6903bc.m21486e().mo75359a(this.f77396a, System.currentTimeMillis() - this.f77401f, z, str, str2, str3);
            this.f77401f = -1;
        }
    }

    public final int hashCode() {
        return this.f77403h.hashCode();
    }

    /* renamed from: a */
    public final void mo75090a() {
        if (this.f77401f == -1) {
            this.f77401f = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo75098b(String str) {
        if (this.f77406k != -1) {
            C6903bc.m21486e().mo75357a(this.f77396a, System.currentTimeMillis() - this.f77406k, str);
            this.f77406k = -1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj || ((obj instanceof C29370e) && TextUtils.equals(this.f77403h, ((C29370e) obj).f77403h))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo75091a(long j) {
        if (j > 0) {
            this.f77401f = j;
        } else {
            mo75090a();
        }
    }

    /* renamed from: a */
    public final void mo75092a(String str) {
        if (this.f77406k == -1) {
            this.f77406k = System.currentTimeMillis();
            C6903bc.m21486e().mo75360a(this.f77396a, str);
        }
    }

    /* renamed from: a */
    public static String m96465a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo75095a(String str, boolean z) {
        if (!this.f77405j) {
            this.f77405j = true;
            C6903bc.m21486e().mo75367a(this.f77396a, str, "", "", true, "");
        }
    }

    /* renamed from: a */
    public final void mo75096a(boolean z, String str) {
        if (this.f77401f != -1) {
            C6903bc.m21486e().mo75358a(this.f77396a, System.currentTimeMillis() - this.f77401f, true, str);
            this.f77401f = -1;
        }
    }

    public C29370e(Aweme aweme, C42975bi biVar, String str) {
        this.f77396a = aweme;
        this.f77398c = biVar;
        this.f77403h = str;
    }

    /* renamed from: a */
    public final void mo75094a(String str, String str2, boolean z) {
        if (!this.f77405j) {
            this.f77405j = true;
            C6903bc.m21486e().mo75367a(this.f77396a, str, str2, "", z, "");
        }
    }

    /* renamed from: a */
    public final void mo75093a(String str, String str2, String str3, boolean z, String str4) {
        if (!this.f77405j) {
            this.f77405j = true;
            C6903bc.m21486e().mo75367a(this.f77396a, str, str2, str3, z, str4);
        }
    }
}
