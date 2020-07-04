package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.viewmodel.C9145h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.er */
public final class C5704er {

    /* renamed from: a */
    public final C7563m<C9145h, Room, C7581n> f16796a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f16796a, (java.lang.Object) ((com.bytedance.android.livesdk.chatroom.viewmodule.C5704er) r2).f16796a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.android.livesdk.chatroom.viewmodule.C5704er
            if (r0 == 0) goto L_0x0013
            com.bytedance.android.livesdk.chatroom.viewmodule.er r2 = (com.bytedance.android.livesdk.chatroom.viewmodule.C5704er) r2
            kotlin.jvm.a.m<com.bytedance.android.livesdk.viewmodel.h, com.bytedance.android.livesdkapi.depend.model.live.Room, kotlin.n> r0 = r1.f16796a
            kotlin.jvm.a.m<com.bytedance.android.livesdk.viewmodel.h, com.bytedance.android.livesdkapi.depend.model.live.Room, kotlin.n> r2 = r2.f16796a
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.C5704er.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C7563m<C9145h, Room, C7581n> mVar = this.f16796a;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestPortalViewModelEvent(callback=");
        sb.append(this.f16796a);
        sb.append(")");
        return sb.toString();
    }

    public C5704er(C7563m<? super C9145h, ? super Room, C7581n> mVar) {
        C7573i.m23587b(mVar, "callback");
        this.f16796a = mVar;
    }
}
