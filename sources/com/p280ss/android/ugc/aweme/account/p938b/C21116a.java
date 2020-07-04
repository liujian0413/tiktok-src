package com.p280ss.android.ugc.aweme.account.p938b;

import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.C25672e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.b.a */
public class C21116a<T extends C25640a, K extends C25672e> extends C25652b<T, K> {

    /* renamed from: a */
    private List<Object> f56691a;

    /* renamed from: b */
    public void mo56977b() {
        super.mo56977b();
        this.f56691a = null;
    }

    /* renamed from: R_ */
    public final void mo56975R_() {
        if (this.f56691a != null) {
            mo56976a(this.f56691a.toArray());
        }
    }

    /* renamed from: a */
    public boolean mo56976a(Object... objArr) {
        this.f56691a = new ArrayList();
        for (Object add : objArr) {
            this.f56691a.add(add);
        }
        return super.mo56976a(objArr);
    }
}
