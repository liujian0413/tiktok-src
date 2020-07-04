package com.bytedance.android.livesdk.chatroom.viewmodule;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dw */
public final class C5679dw {

    /* renamed from: a */
    public final LinkPkTaskWidget f16768a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f16768a, (java.lang.Object) ((com.bytedance.android.livesdk.chatroom.viewmodule.C5679dw) r2).f16768a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.android.livesdk.chatroom.viewmodule.C5679dw
            if (r0 == 0) goto L_0x0013
            com.bytedance.android.livesdk.chatroom.viewmodule.dw r2 = (com.bytedance.android.livesdk.chatroom.viewmodule.C5679dw) r2
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget r0 = r1.f16768a
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget r2 = r2.f16768a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.C5679dw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        LinkPkTaskWidget linkPkTaskWidget = this.f16768a;
        if (linkPkTaskWidget != null) {
            return linkPkTaskWidget.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadPkTaskWidgetEvent(widget=");
        sb.append(this.f16768a);
        sb.append(")");
        return sb.toString();
    }

    public C5679dw(LinkPkTaskWidget linkPkTaskWidget) {
        this.f16768a = linkPkTaskWidget;
    }
}
