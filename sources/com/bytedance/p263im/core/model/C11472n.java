package com.bytedance.p263im.core.model;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p587a.p588a.C11283p;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.model.n */
public final class C11472n {
    @C6593c(mo15949a = "inbox_type")

    /* renamed from: a */
    public int f31040a;
    @C6593c(mo15949a = "conversation_id")

    /* renamed from: b */
    public String f31041b;
    @C6593c(mo15949a = "conversation_type")

    /* renamed from: c */
    public int f31042c;
    @C6593c(mo15949a = "action_type")

    /* renamed from: d */
    public int f31043d;
    @C6593c(mo15949a = "extra")

    /* renamed from: e */
    public Serializable f31044e;
    @C6593c(mo15949a = "command_type")

    /* renamed from: f */
    private int f31045f;

    /* renamed from: com.bytedance.im.core.model.n$a */
    public static final class C11474a {

        /* renamed from: a */
        public final C11472n f31046a = new C11472n();

        /* renamed from: a */
        public final void mo27695a() {
            C11283p.m33057a();
            C11283p.m33071a(this.f31046a, null);
        }

        /* renamed from: a */
        public final C11474a mo27692a(int i) {
            this.f31046a.f31043d = i;
            return this;
        }

        /* renamed from: a */
        public final C11474a mo27694a(Serializable serializable) {
            this.f31046a.f31044e = serializable;
            return this;
        }

        /* renamed from: a */
        public final C11474a mo27693a(Conversation conversation) {
            this.f31046a.f31041b = conversation.getConversationId();
            this.f31046a.f31042c = conversation.getConversationType();
            this.f31046a.f31040a = conversation.getInboxType();
            return this;
        }
    }

    private C11472n() {
        this.f31045f = 12;
    }

    /* renamed from: a */
    public final boolean mo27691a() {
        if (!TextUtils.isEmpty(this.f31041b)) {
            return true;
        }
        return false;
    }
}
