package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.r */
public class C8686r extends C8538c {
    @C6593c(mo15949a = "discardable")

    /* renamed from: a */
    public boolean f23655a;
    @C6593c(mo15949a = "immediate")

    /* renamed from: b */
    public boolean f23656b;
    @C6593c(mo15949a = "duration")

    /* renamed from: c */
    public int f23657c;
    @C6593c(mo15949a = "background_color_start")

    /* renamed from: d */
    public String f23658d;
    @C6593c(mo15949a = "background_color_end")

    /* renamed from: e */
    public String f23659e;
    @C6593c(mo15949a = "text_color")

    /* renamed from: f */
    public String f23660f;
    @C6593c(mo15949a = "position")

    /* renamed from: g */
    public int f23661g;
    @C6593c(mo15949a = "top_img")

    /* renamed from: h */
    public ImageModel f23662h;
    @C6593c(mo15949a = "top_img_width")

    /* renamed from: i */
    public int f23663i;
    @C6593c(mo15949a = "top_img_height")

    /* renamed from: j */
    public int f23664j;
    @C6593c(mo15949a = "show_mongolia_layer")

    /* renamed from: k */
    public boolean f23665k;

    public C8686r() {
        this.f23658d = "#ff9d5c";
        this.f23659e = "#ff9d5c";
        this.f23660f = "#ffffff";
        this.f23661g = 1;
        this.type = MessageType.COMMON_TOAST;
    }
}
