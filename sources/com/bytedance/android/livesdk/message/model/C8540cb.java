package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.cb */
public class C8540cb extends C8538c {
    @C6593c(mo15949a = "content")

    /* renamed from: a */
    public String f23494a;
    @C6593c(mo15949a = "notice_type")

    /* renamed from: b */
    public int f23495b;
    @C6593c(mo15949a = "style")

    /* renamed from: c */
    public String f23496c;
    @C6593c(mo15949a = "title")

    /* renamed from: d */
    public C9505f f23497d;
    @C6593c(mo15949a = "violation_reason")

    /* renamed from: e */
    public C9505f f23498e;
    @C6593c(mo15949a = "display_text")

    /* renamed from: f */
    public C9505f f23499f;
    @C6593c(mo15949a = "tips_title")

    /* renamed from: g */
    public C9505f f23500g;
    @C6593c(mo15949a = "tips_url")

    /* renamed from: h */
    public String f23501h;

    public C8540cb() {
        this.type = MessageType.REMIND;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }
}
