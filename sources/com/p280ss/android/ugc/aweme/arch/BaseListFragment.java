package com.p280ss.android.ugc.aweme.arch;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;

/* renamed from: com.ss.android.ugc.aweme.arch.BaseListFragment */
public abstract class BaseListFragment<T> extends AmeBaseFragment implements C0053p<C23083a> {

    /* renamed from: e */
    protected C23074c<T> f60895e;

    /* renamed from: f */
    protected DataCenter f60896f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C23074c<T> mo60106a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo60107a();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo60108d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo60109e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo60110f();

    /* renamed from: g */
    private void m75817g() {
        if (this.f60896f == null) {
            this.f60896f = DataCenter.m75849a(C23087c.m75886a((Fragment) this), (C0043i) this);
        }
        if (!TextUtils.isEmpty(mo60107a())) {
            this.f60896f.mo60132a(mo60107a(), (C0053p<C23083a>) this);
        }
        if (!TextUtils.isEmpty(mo60108d())) {
            this.f60896f.mo60132a(mo60108d(), (C0053p<C23083a>) this);
        }
        if (!TextUtils.isEmpty(mo60109e())) {
            this.f60896f.mo60132a(mo60109e(), (C0053p<C23083a>) this);
        }
    }

    /* renamed from: b */
    private void m75816b(View view) {
        this.f60895e = mo60106a(view);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m75817g();
        m75816b(view);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(mo60110f(), viewGroup, false);
    }
}
