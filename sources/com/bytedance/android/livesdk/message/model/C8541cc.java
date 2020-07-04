package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.cc */
public class C8541cc extends C8538c {
    @C6593c(mo15949a = "content")

    /* renamed from: a */
    public String f23502a;
    @C6593c(mo15949a = "color")

    /* renamed from: b */
    public String f23503b;
    @C6593c(mo15949a = "traceid")

    /* renamed from: c */
    public String f23504c;
    @C6593c(mo15949a = "icon")

    /* renamed from: d */
    public ImageModel f23505d;
    @C6593c(mo15949a = "action_content")

    /* renamed from: e */
    public String f23506e;
    @C6593c(mo15949a = "action_type")

    /* renamed from: f */
    public String f23507f;
    @C6593c(mo15949a = "push_message_display_time")

    /* renamed from: g */
    public long f23508g;

    /* renamed from: h */
    public ImageModel f23509h;

    /* renamed from: i */
    public transient ImageModel f23510i;

    /* renamed from: j */
    public transient CharSequence f23511j;

    /* renamed from: k */
    public transient int f23512k;

    public boolean canText() {
        return true;
    }

    public C8541cc() {
        this.type = MessageType.ROOM_RICH_CHAT_MESSAGE;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }
}
