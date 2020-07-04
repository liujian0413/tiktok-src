package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.message.C9500b;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.bp */
public class C8522bp extends C8538c {
    @C6593c(mo15949a = "type")

    /* renamed from: a */
    public int f23426a;
    @C6593c(mo15949a = "portal_id")

    /* renamed from: b */
    public long f23427b;
    @C6593c(mo15949a = "room_id")

    /* renamed from: c */
    public long f23428c;
    @C6593c(mo15949a = "portal_buy")

    /* renamed from: d */
    protected C8524b f23429d;
    @C6593c(mo15949a = "portal_invite")

    /* renamed from: e */
    protected C8526d f23430e;
    @C6593c(mo15949a = "portal_finish")

    /* renamed from: f */
    protected C8525c f23431f;
    @C6593c(mo15949a = "payload")

    /* renamed from: g */
    public C8523a f23432g;

    /* renamed from: com.bytedance.android.livesdk.message.model.bp$a */
    public interface C8523a {
    }

    /* renamed from: com.bytedance.android.livesdk.message.model.bp$b */
    public static class C8524b implements C8523a {
        @C6593c(mo15949a = "sugar_daddy")

        /* renamed from: a */
        public User f23433a;
    }

    /* renamed from: com.bytedance.android.livesdk.message.model.bp$c */
    public static class C8525c implements C8523a {
        @C6593c(mo15949a = "lucky_person")

        /* renamed from: a */
        public User f23434a;
    }

    /* renamed from: com.bytedance.android.livesdk.message.model.bp$d */
    public static class C8526d implements C8523a {
        @C6593c(mo15949a = "invite_count_down")

        /* renamed from: a */
        public long f23435a;
        @C6593c(mo15949a = "reward_count_down")

        /* renamed from: b */
        public long f23436b;
        @C6593c(mo15949a = "sugar_daddy")

        /* renamed from: c */
        public User f23437c;
        @C6593c(mo15949a = "anchor")

        /* renamed from: d */
        public User f23438d;
    }

    public boolean supportDisplayText() {
        return true;
    }

    public C8522bp() {
        this.type = MessageType.PORTAL_MESSAGE;
    }

    public boolean canText() {
        C9500b bVar = this.baseMessage;
        if (bVar == null || bVar.f26000j == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21666a() {
        switch (this.f23426a) {
            case 1:
                this.f23432g = this.f23429d;
                return;
            case 2:
                this.f23432g = this.f23430e;
                return;
            case 3:
                this.f23432g = this.f23431f;
                break;
        }
    }
}
