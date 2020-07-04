package com.bytedance.android.livesdk.share;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostShare.C9431a;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p354j.C47850e;

/* renamed from: com.bytedance.android.livesdk.share.c */
public final class C8942c implements C8940a {

    /* renamed from: a */
    public C47850e<Object> f24335a;

    /* renamed from: b */
    public C47850e<String> f24336b;

    /* renamed from: c */
    private IHostShare f24337c;

    /* renamed from: d */
    private C9388a f24338d = new C9388a() {
        /* renamed from: a */
        public final void mo11627a(Throwable th) {
            if (C8942c.this.f24335a != null) {
                C8942c.this.f24335a.onError(th);
                C8942c.this.f24335a = null;
            }
        }

        /* renamed from: a */
        public final void mo11626a(String str, String str2) {
            if (C8942c.this.f24335a != null) {
                C8942c.this.f24335a.onSuccess(new Object());
                C8942c.this.f24335a = null;
            }
        }
    };

    /* renamed from: e */
    private C9431a f24339e = new C9431a() {
        /* renamed from: a */
        public final void mo22112a(String str) {
            if (C8942c.this.f24336b != null) {
                C8942c.this.f24336b.onSuccess(str);
                C8942c.this.f24336b = null;
            }
        }
    };

    C8942c(IHostShare iHostShare) {
        this.f24337c = iHostShare;
    }

    /* renamed from: a */
    public final C7319aa<String> mo22109a(String str) {
        this.f24337c.getShortUrl(str, this.f24339e);
        this.f24336b = C47850e.m148766c();
        return this.f24336b;
    }

    /* renamed from: a */
    public final C7319aa<Object> mo22108a(Activity activity, C9389b bVar) {
        this.f24337c.share(activity, bVar, this.f24338d);
        this.f24335a = C47850e.m148766c();
        return this.f24335a;
    }

    /* renamed from: a */
    public final void mo22110a(Activity activity, C9389b bVar, C9388a aVar) {
        this.f24337c.showShareDialog(activity, bVar, aVar);
    }

    /* renamed from: a */
    public final void mo22111a(Activity activity, C9389b bVar, String str) {
        this.f24337c.showReportDialog(activity, bVar, str);
    }
}
