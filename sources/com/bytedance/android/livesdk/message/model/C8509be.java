package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.interact.data.C4762d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.be */
public class C8509be extends C8538c {
    @C6593c(mo15949a = "content")

    /* renamed from: a */
    public String f23345a;

    /* renamed from: b */
    private C4762d f23346b;

    public C8509be() {
        this.type = MessageType.LINK_MIC_SIGNAL;
    }

    /* renamed from: a */
    public final C4762d mo21655a() {
        if (this.f23346b != null) {
            return this.f23346b;
        }
        try {
            this.f23346b = (C4762d) C9178j.m27302j().mo22372a().mo15974a(this.f23345a.replaceAll("\\\\", ""), C4762d.class);
            return this.f23346b;
        } catch (Exception unused) {
            return null;
        }
    }
}
