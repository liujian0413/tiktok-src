package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.j */
public class C8677j extends C8538c {

    /* renamed from: a */
    public static long f23613a = 1;

    /* renamed from: b */
    public static long f23614b = 2;
    @C6593c(mo15949a = "action_type")

    /* renamed from: c */
    public long f23615c;
    @C6593c(mo15949a = "series_id")

    /* renamed from: d */
    public long f23616d;
    @C6593c(mo15949a = "series_name")

    /* renamed from: e */
    public String f23617e;
    @C6593c(mo15949a = "official_price")

    /* renamed from: f */
    public String f23618f;
    @C6593c(mo15949a = "image_url")

    /* renamed from: g */
    public String f23619g;

    public C8677j() {
        this.type = MessageType.CAR_SERIES_INFO_MESSAGE;
    }
}
