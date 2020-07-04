package com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a;

import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.a.d */
public final class C5571d extends C5735a {

    /* renamed from: a */
    public final int f16623a;

    /* renamed from: b */
    public final int f16624b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5571d) {
                C5571d dVar = (C5571d) obj;
                if (this.f16623a == dVar.f16623a) {
                    if (this.f16624b == dVar.f16624b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f16623a) * 31) + Integer.hashCode(this.f16624b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowMvpPunishCommand(currentCount=");
        sb.append(this.f16623a);
        sb.append(", targetCount=");
        sb.append(this.f16624b);
        sb.append(")");
        return sb.toString();
    }
}
