package com.bytedance.android.livesdk.chatroom.event;

import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent.Sender;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.aj */
public final class C4418aj implements ISendCommentEvent {

    /* renamed from: a */
    public final String f12839a;

    /* renamed from: b */
    private final Sender f12840b;

    /* renamed from: c */
    private final Map<String, Object> f12841c;

    /* renamed from: b */
    private Sender m14827b() {
        return this.f12840b;
    }

    /* renamed from: a */
    public final Map<String, Object> mo12131a() {
        return this.f12841c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) mo12131a(), (java.lang.Object) r3.mo12131a()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0031
            boolean r0 = r3 instanceof com.bytedance.android.livesdk.chatroom.event.C4418aj
            if (r0 == 0) goto L_0x002f
            com.bytedance.android.livesdk.chatroom.event.aj r3 = (com.bytedance.android.livesdk.chatroom.event.C4418aj) r3
            java.lang.String r0 = r2.f12839a
            java.lang.String r1 = r3.f12839a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x002f
            com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender r0 = r2.m14827b()
            com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender r1 = r3.m14827b()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.util.Map r0 = r2.mo12131a()
            java.util.Map r3 = r3.mo12131a()
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.event.C4418aj.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f12839a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Sender b = m14827b();
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        Map a = mo12131a();
        if (a != null) {
            i = a.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendBarrageEvent(content=");
        sb.append(this.f12839a);
        sb.append(", sender=");
        sb.append(m14827b());
        sb.append(", args=");
        sb.append(mo12131a());
        sb.append(")");
        return sb.toString();
    }

    public C4418aj(String str, Sender sender, Map<String, ? extends Object> map) {
        C7573i.m23587b(str, C38347c.f99553h);
        C7573i.m23587b(sender, "sender");
        C7573i.m23587b(map, "args");
        this.f12839a = str;
        this.f12840b = sender;
        this.f12841c = map;
    }
}
