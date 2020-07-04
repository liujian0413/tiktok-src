package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.cf */
public class C8544cf extends C8538c {
    @C6593c(mo15949a = "content")

    /* renamed from: a */
    public String f23517a;
    @C6593c(mo15949a = "notify_type")

    /* renamed from: b */
    public long f23518b;
    @C6593c(mo15949a = "notify_class")

    /* renamed from: c */
    public int f23519c;
    @C6593c(mo15949a = "schema")

    /* renamed from: d */
    public String f23520d;
    @C6593c(mo15949a = "extra")

    /* renamed from: e */
    public RoomNotifyMessageExtra f23521e;
    @C6593c(mo15949a = "user")

    /* renamed from: f */
    public User f23522f;

    public C8544cf() {
        this.type = MessageType.ROOM_NOTIFY;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }
}
