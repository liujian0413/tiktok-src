package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a;

import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.IViewInfo;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a.a */
public final class C31547a<T> {

    /* renamed from: a */
    public final T f82581a;

    /* renamed from: b */
    public final Message f82582b;

    /* renamed from: c */
    public final IViewInfo f82583c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f82583c, (java.lang.Object) r3.f82583c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a.C31547a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.im.sdk.msgdetail.a.a r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a.C31547a) r3
            T r0 = r2.f82581a
            T r1 = r3.f82581a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.bytedance.im.core.model.Message r0 = r2.f82582b
            com.bytedance.im.core.model.Message r1 = r3.f82582b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$IViewInfo r0 = r2.f82583c
            com.ss.android.ugc.aweme.im.sdk.widget.DragView$IViewInfo r3 = r3.f82583c
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a.C31547a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        T t = this.f82581a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        Message message = this.f82582b;
        int hashCode2 = (hashCode + (message != null ? message.hashCode() : 0)) * 31;
        IViewInfo iViewInfo = this.f82583c;
        if (iViewInfo != null) {
            i = iViewInfo.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaContent(content=");
        sb.append(this.f82581a);
        sb.append(", msg=");
        sb.append(this.f82582b);
        sb.append(", dragInfo=");
        sb.append(this.f82583c);
        sb.append(")");
        return sb.toString();
    }

    public C31547a(T t, Message message, IViewInfo iViewInfo) {
        C7573i.m23587b(message, "msg");
        this.f82581a = t;
        this.f82582b = message;
        this.f82583c = iViewInfo;
    }
}
