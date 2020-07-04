package com.bytedance.android.livesdk.chatroom.event;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.ak */
public final class C4419ak {

    /* renamed from: a */
    public final ISendCommentEvent f12842a;

    /* renamed from: b */
    public final boolean f12843b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4419ak) {
                C4419ak akVar = (C4419ak) obj;
                if (C7573i.m23585a((Object) this.f12842a, (Object) akVar.f12842a)) {
                    if (this.f12843b == akVar.f12843b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ISendCommentEvent iSendCommentEvent = this.f12842a;
        int hashCode = (iSendCommentEvent != null ? iSendCommentEvent.hashCode() : 0) * 31;
        boolean z = this.f12843b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendCommentResult(subject=");
        sb.append(this.f12842a);
        sb.append(", success=");
        sb.append(this.f12843b);
        sb.append(")");
        return sb.toString();
    }

    public C4419ak(ISendCommentEvent iSendCommentEvent, boolean z) {
        C7573i.m23587b(iSendCommentEvent, "subject");
        this.f12842a = iSendCommentEvent;
        this.f12843b = z;
    }
}
