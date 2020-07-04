package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.p */
public class C8683p extends C8538c {
    @C6593c(mo15949a = "message_type")

    /* renamed from: a */
    public int f23639a;
    @C6593c(mo15949a = "main_content")

    /* renamed from: b */
    public C9505f f23640b;
    @C6593c(mo15949a = "secondary_content")

    /* renamed from: c */
    public List<C8684a> f23641c;
    @C6593c(mo15949a = "icon")

    /* renamed from: d */
    public ImageModel f23642d;
    @C6593c(mo15949a = "button_content")

    /* renamed from: e */
    public C9505f f23643e;
    @C6593c(mo15949a = "button_action_schema")

    /* renamed from: f */
    public String f23644f;
    @C6593c(mo15949a = "button_icon")

    /* renamed from: g */
    public ImageModel f23645g;
    @C6593c(mo15949a = "duration")

    /* renamed from: h */
    public long f23646h;

    /* renamed from: com.bytedance.android.livesdk.message.model.p$a */
    public static class C8684a {
        @C6593c(mo15949a = "type")

        /* renamed from: a */
        public String f23647a;
        @C6593c(mo15949a = "text")

        /* renamed from: b */
        public String f23648b;
        @C6593c(mo15949a = "font_color")

        /* renamed from: c */
        public String f23649c;
        @C6593c(mo15949a = "font_size")

        /* renamed from: d */
        public int f23650d;
        @C6593c(mo15949a = "weight")

        /* renamed from: e */
        public int f23651e;
        @C6593c(mo15949a = "img")

        /* renamed from: f */
        public ImageModel f23652f;
    }

    public C8683p() {
        this.type = MessageType.COMMON_GUIDE;
    }
}
