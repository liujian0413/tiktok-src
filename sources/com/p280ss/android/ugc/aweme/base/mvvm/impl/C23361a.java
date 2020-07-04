package com.p280ss.android.ugc.aweme.base.mvvm.impl;

import com.p280ss.android.ugc.aweme.base.mvvm.C23358c;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;

/* renamed from: com.ss.android.ugc.aweme.base.mvvm.impl.a */
public class C23361a<T extends C23358c> implements C23360e<T> {

    /* renamed from: a */
    protected T f61446a;

    /* renamed from: a */
    public final T mo60671a() {
        return this.f61446a;
    }

    /* renamed from: b */
    public final void mo60675b() {
        if (this.f61446a != null) {
            this.f61446a.refresh();
        }
    }

    /* renamed from: a */
    public final void mo60672a(T t) {
        this.f61446a = t;
    }
}
