package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.co */
public class C8554co extends C8538c {
    @C6593c(mo15949a = "director_icon")

    /* renamed from: a */
    public ImageModel f23576a;
    @C6593c(mo15949a = "cur_round_index")

    /* renamed from: b */
    public int f23577b;
    @C6593c(mo15949a = "status")

    /* renamed from: c */
    public int f23578c;
    @C6593c(mo15949a = "director_schema_url")

    /* renamed from: d */
    public String f23579d;

    public C8554co() {
        this.type = MessageType.UPDATE_KOI_ROOM_STATUS_MESSAGE;
    }
}
