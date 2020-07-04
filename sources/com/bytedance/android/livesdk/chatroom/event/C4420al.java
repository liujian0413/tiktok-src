package com.bytedance.android.livesdk.chatroom.event;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent.Sender;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.al */
public final class C4420al implements ISendCommentEvent {

    /* renamed from: a */
    public final String f12844a;

    /* renamed from: b */
    private final Sender f12845b;

    /* renamed from: c */
    private final Map<String, Object> f12846c;

    /* renamed from: b */
    private Sender m14829b() {
        return this.f12845b;
    }

    /* renamed from: a */
    public final Map<String, Object> mo12138a() {
        return this.f12846c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) mo12138a(), (java.lang.Object) r3.mo12138a()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0031
            boolean r0 = r3 instanceof com.bytedance.android.livesdk.chatroom.event.C4420al
            if (r0 == 0) goto L_0x002f
            com.bytedance.android.livesdk.chatroom.event.al r3 = (com.bytedance.android.livesdk.chatroom.event.C4420al) r3
            java.lang.String r0 = r2.f12844a
            java.lang.String r1 = r3.f12844a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x002f
            com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender r0 = r2.m14829b()
            com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender r1 = r3.m14829b()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.util.Map r0 = r2.mo12138a()
            java.util.Map r3 = r3.mo12138a()
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 0
            return r3
        L_0x0031:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.event.C4420al.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f12844a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Sender b = m14829b();
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        Map a = mo12138a();
        if (a != null) {
            i = a.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendTextEvent(content=");
        sb.append(this.f12844a);
        sb.append(", sender=");
        sb.append(m14829b());
        sb.append(", args=");
        sb.append(mo12138a());
        sb.append(")");
        return sb.toString();
    }

    public C4420al(String str, Sender sender, Map<String, ? extends Object> map) {
        C7573i.m23587b(str, C38347c.f99553h);
        C7573i.m23587b(sender, "sender");
        C7573i.m23587b(map, "args");
        this.f12844a = str;
        this.f12845b = sender;
        this.f12846c = map;
    }
}
