package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.proto.Response;
import com.bytedance.p263im.core.proto.ResponseBody;

/* renamed from: com.bytedance.im.core.internal.a.a.b */
abstract class C11240b extends C11280o {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27275a(int i, ResponseBody responseBody);

    C11240b(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (!eVar.mo27431g() || eVar.f30858g == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        if (eVar.mo27431g() && eVar.f30858g.body != null) {
            Response response = eVar.f30858g;
            mo27275a(response.inbox_type.intValue(), response.body);
        }
    }
}
