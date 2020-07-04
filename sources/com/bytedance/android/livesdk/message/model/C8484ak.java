package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.ak */
public class C8484ak extends C8538c {
    @C6593c(mo15949a = "gift_id")

    /* renamed from: a */
    public long f23233a;
    @C6593c(mo15949a = "fan_ticket_count")

    /* renamed from: b */
    public long f23234b;
    @C6593c(mo15949a = "user")

    /* renamed from: c */
    public User f23235c;
    @C6593c(mo15949a = "to_user")

    /* renamed from: d */
    public User f23236d;
    @C6593c(mo15949a = "normal_content")

    /* renamed from: e */
    public String f23237e;
    @C6593c(mo15949a = "monkey_data")

    /* renamed from: f */
    public C8485a f23238f;

    /* renamed from: com.bytedance.android.livesdk.message.model.ak$a */
    public static class C8485a {
        @C6593c(mo15949a = "score")

        /* renamed from: a */
        public int f23239a;
        @C6593c(mo15949a = "break_record")

        /* renamed from: b */
        public boolean f23240b;
        @C6593c(mo15949a = "need_popup")

        /* renamed from: c */
        public boolean f23241c;
        @C6593c(mo15949a = "popup_content")

        /* renamed from: d */
        public String f23242d;
    }

    public C8484ak() {
        this.type = MessageType.GAME_GIFT_MESSAGE;
    }

    public boolean canText() {
        if (this.f23235c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C8489ao m25749a(C8484ak akVar) {
        if (akVar == null) {
            return null;
        }
        C8489ao aoVar = new C8489ao();
        aoVar.baseMessage = akVar.baseMessage;
        aoVar.f23254c = akVar.f23233a;
        aoVar.f23252a = akVar.f23235c;
        aoVar.f23253b = akVar.f23236d;
        aoVar.f23258g = 0;
        return aoVar;
    }
}
