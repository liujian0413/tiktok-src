package com.p280ss.android.ugc.aweme.mobile;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import android.widget.Button;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.mobile.d */
public final class C33606d {

    /* renamed from: b */
    private static final boolean f87721b = C7163a.m22363a();

    /* renamed from: a */
    public String f87722a = "";

    /* renamed from: c */
    private C33614k f87723c;

    /* renamed from: d */
    private boolean f87724d;

    /* renamed from: com.ss.android.ugc.aweme.mobile.d$a */
    public interface C33607a {
        /* renamed from: a */
        void mo76540a(Dialog dialog);

        /* renamed from: b */
        void mo76541b(Dialog dialog);
    }

    /* renamed from: a */
    public final void mo85938a() {
        C42951au.m136342a(this.f87723c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo85943b() {
        C42951au.m136343b(this.f87723c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo85944c() {
        C42951au.m136343b(this.f87723c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85939a(Activity activity, View view) {
        C6861a.m21335d().bindMobile(activity, this.f87722a, null, null);
        this.f87724d = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85941a(C33607a aVar, View view) {
        if (aVar != null) {
            aVar.mo76541b(this.f87723c);
        }
        C43173w.m136924a((Runnable) new C33613j(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85942a(C33607a aVar, boolean z) {
        if (z && this.f87724d) {
            this.f87724d = false;
            if (aVar != null) {
                aVar.mo76540a(this.f87723c);
            }
            C43173w.m136924a((Runnable) new C33610g(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85940a(Activity activity, C33607a aVar, DialogInterface dialogInterface) {
        Button a = this.f87723c.mo26627a(-1);
        if (a != null) {
            a.setOnClickListener(new C33611h(this, activity));
        }
        Button a2 = this.f87723c.mo26627a(-2);
        if (a2 != null) {
            a2.setOnClickListener(new C33612i(this, aVar));
        }
    }

    public C33606d(Activity activity, C33607a aVar, OnDismissListener onDismissListener) {
        this.f87723c = new C33614k(activity);
        this.f87723c.setCancelable(false);
        this.f87723c.setCanceledOnTouchOutside(false);
        this.f87723c.setTitle(R.string.bzr);
        this.f87723c.mo26629a((CharSequence) activity.getString(R.string.bzq));
        this.f87723c.mo26628a(-2, activity.getString(R.string.duy), null);
        this.f87723c.mo26628a(-1, activity.getString(R.string.bzp), null);
        this.f87723c.setOnDismissListener(null);
        this.f87723c.setOnShowListener(new C33608e(this, activity, aVar));
        this.f87723c.f87736b = new C33609f(this, aVar);
    }
}
