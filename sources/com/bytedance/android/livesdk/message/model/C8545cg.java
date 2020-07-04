package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.FlexImageModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.cg */
public class C8545cg extends C8538c {
    @C6593c(mo15949a = "content")

    /* renamed from: a */
    public String f23523a;
    @C6593c(mo15949a = "color")

    /* renamed from: b */
    public String f23524b;
    @C6593c(mo15949a = "traceid")

    /* renamed from: c */
    public String f23525c;
    @C6593c(mo15949a = "icon")

    /* renamed from: d */
    public ImageModel f23526d;
    @C6593c(mo15949a = "action_content")

    /* renamed from: e */
    public String f23527e;
    @C6593c(mo15949a = "action_type")

    /* renamed from: f */
    public String f23528f;
    @C6593c(mo15949a = "push_message_display_time")

    /* renamed from: g */
    public long f23529g;
    @C6593c(mo15949a = "background_image")

    /* renamed from: h */
    public FlexImageModel f23530h;
    @C6593c(mo15949a = "new_background_image")

    /* renamed from: i */
    public FlexImageModel f23531i;
    @C6593c(mo15949a = "action_icon")

    /* renamed from: j */
    public ImageModel f23532j;
    @C6593c(mo15949a = "source")

    /* renamed from: k */
    public String f23533k;

    /* renamed from: l */
    public transient int f23534l;

    public C8545cg() {
        this.f23528f = "0";
        this.type = MessageType.ROOM_PUSH;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }
}
