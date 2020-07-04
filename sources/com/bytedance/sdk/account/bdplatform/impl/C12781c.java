package com.bytedance.sdk.account.bdplatform.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.account.bdplatform.p655a.C12757d;
import com.bytedance.sdk.account.p650b.p651a.C12740a;
import com.bytedance.sdk.account.p650b.p651a.C12741b;
import com.bytedance.sdk.account.p650b.p652b.C12742a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.c */
final class C12781c implements C12757d {

    /* renamed from: a */
    private Context f33816a;

    /* renamed from: b */
    private List<C12741b> f33817b;

    public C12781c(Context context) {
        this(context, null);
    }

    private C12781c(Context context, List<C12741b> list) {
        this.f33817b = new ArrayList();
        this.f33816a = context;
        this.f33817b.add(new C12742a());
    }

    /* renamed from: a */
    public final boolean mo31280a(Intent intent, C12740a aVar) {
        if (aVar == null) {
            return false;
        }
        if (intent == null) {
            aVar.onErrorIntent(intent);
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            aVar.onErrorIntent(intent);
            return false;
        }
        int i = extras.getInt("_bytedance_params_type");
        for (C12741b a : this.f33817b) {
            if (a.mo31238a(i, extras, aVar)) {
                return true;
            }
        }
        aVar.onErrorIntent(intent);
        return false;
    }
}
