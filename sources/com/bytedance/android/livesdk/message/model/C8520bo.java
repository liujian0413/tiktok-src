package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.bo */
public class C8520bo extends C8538c {
    @C6593c(mo15949a = "popular_card_info")

    /* renamed from: a */
    public C8521a f23421a;

    /* renamed from: com.bytedance.android.livesdk.message.model.bo$a */
    public static class C8521a {
        @C6593c(mo15949a = "status")

        /* renamed from: a */
        public int f23422a;
        @C6593c(mo15949a = "startTime")

        /* renamed from: b */
        public long f23423b;
        @C6593c(mo15949a = "end_time")

        /* renamed from: c */
        public long f23424c;
        @C6593c(mo15949a = "enter_number")

        /* renamed from: d */
        public int f23425d;
    }

    public C8520bo() {
        this.type = MessageType.POPULAR_CARD_MESSAGE;
    }
}
