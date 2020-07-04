package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.cd */
public class C8542cd extends C8538c {
    @C6593c(mo15949a = "action")

    /* renamed from: a */
    public long f23513a;
    @C6593c(mo15949a = "bg_img_url")

    /* renamed from: b */
    public String f23514b;
    @C6593c(mo15949a = "content")

    /* renamed from: c */
    public String f23515c;

    public C8542cd() {
        this.type = MessageType.ROOM_IMG_MESSAGE;
    }
}
