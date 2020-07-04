package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24132c;
import com.p280ss.android.ugc.aweme.common.C25640a;
import java.util.Arrays;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.e.b */
public abstract class C24102b<T> extends C25640a<T> {

    /* renamed from: a */
    public final C24132c f63733a = new C24132c();

    /* renamed from: a */
    public abstract void mo62511a(T t);

    public void handleData(T t) {
        super.handleData(t);
        if (t instanceof BaseResponse) {
            this.f63733a.mo62548a((BaseResponse) t);
        }
        mo62511a(t);
    }

    public boolean sendRequest(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        this.f63733a.mo62545a();
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        return true;
    }
}
