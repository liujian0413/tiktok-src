package com.p280ss.android.ugc.aweme.arch;

import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.arch.a */
public final class C23071a<T> implements C0053p<C23083a> {

    /* renamed from: a */
    protected C23074c<T> f60897a;

    /* renamed from: b */
    protected DataCenter f60898b;

    /* renamed from: c */
    private C23072a<T> f60899c;

    /* renamed from: com.ss.android.ugc.aweme.arch.a$a */
    public interface C23072a<T> {
        /* renamed from: a */
        C23074c<T> mo60112a(View view);

        /* renamed from: a */
        void mo60113a();

        /* renamed from: b */
        String mo60114b();

        /* renamed from: c */
        String mo60115c();

        /* renamed from: d */
        String mo60116d();

        /* renamed from: e */
        DataCenter mo60117e();
    }

    /* renamed from: a */
    private void m75823a() {
        if (this.f60898b == null) {
            this.f60898b = this.f60899c.mo60117e();
        }
        if (this.f60898b != null) {
            if (!TextUtils.isEmpty(this.f60899c.mo60114b())) {
                this.f60898b.mo60132a(this.f60899c.mo60114b(), (C0053p<C23083a>) this);
            }
            if (!TextUtils.isEmpty(this.f60899c.mo60115c())) {
                this.f60898b.mo60132a(this.f60899c.mo60115c(), (C0053p<C23083a>) this);
            }
            if (!TextUtils.isEmpty(this.f60899c.mo60116d())) {
                this.f60898b.mo60132a(this.f60899c.mo60116d(), (C0053p<C23083a>) this);
            }
        }
    }

    /* renamed from: a */
    private void m75824a(View view) {
        this.f60897a = this.f60899c.mo60112a(view);
    }

    /* renamed from: a */
    private static boolean m75826a(Object obj) {
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 1) {
                return true;
            }
            return false;
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (this.f60897a != null && aVar != null && !TextUtils.isEmpty(aVar.f60948a)) {
            String str = aVar.f60948a;
            if (TextUtils.equals(str, this.f60899c.mo60115c())) {
                if (aVar.mo60161a() != Integer.valueOf(0)) {
                    this.f60897a.mo60122b();
                }
            } else if (TextUtils.equals(str, this.f60899c.mo60116d())) {
                if (aVar.mo60161a() != Integer.valueOf(0)) {
                }
            } else if (TextUtils.equals(str, this.f60899c.mo60114b())) {
                C23073b bVar = (C23073b) this.f60898b.mo60135a(this.f60899c.mo60114b());
                int intValue = ((Integer) bVar.mo60119a("action_type")).intValue();
                if (intValue == 1) {
                    this.f60897a.mo60121a((List) bVar.mo60119a("list_data"), m75826a(bVar.mo60119a("list_hasmore")));
                } else if (intValue == 2) {
                    this.f60897a.mo60123b((List) bVar.mo60119a("list_data"), m75826a(bVar.mo60119a("list_hasmore")));
                }
            }
        }
    }

    public C23071a(Fragment fragment, C23072a<T> aVar) {
        this.f60898b = aVar.mo60117e();
        this.f60899c = aVar;
    }

    /* renamed from: a */
    public final void mo60111a(View view, Bundle bundle) {
        m75823a();
        m75824a(view);
        this.f60899c.mo60113a();
    }
}
