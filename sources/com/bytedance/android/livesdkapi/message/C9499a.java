package com.bytedance.android.livesdkapi.message;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6591a;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdkapi.message.a */
public class C9499a {
    @C6593c(mo15949a = "common")
    public C9500b baseMessage;
    public volatile long localTimestamp = SystemClock.elapsedRealtime();
    public transient long timestamp;
    @C6591a
    public MessageType type = MessageType.DEFAULT;

    public boolean canText() {
        return false;
    }

    public MessageType getMessageType() {
        return this.type;
    }

    public boolean isCurrentRoom(long j) {
        long j2;
        if (this.baseMessage != null) {
            j2 = this.baseMessage.f25993c;
        } else {
            j2 = 0;
        }
        if (j == 0 || j != j2) {
            return false;
        }
        return true;
    }
}
