package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31859ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.u */
public final class C30999u {

    /* renamed from: a */
    public static final C31000a f81157a = new C31000a(null);

    /* renamed from: b */
    private Message f81158b;

    /* renamed from: c */
    private int f81159c = -1;

    /* renamed from: d */
    private Message f81160d;

    /* renamed from: e */
    private boolean f81161e;

    /* renamed from: f */
    private final Conversation f81162f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.u$a */
    public static final class C31000a {
        private C31000a() {
        }

        public /* synthetic */ C31000a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo81391a() {
        Object obj;
        if (this.f81158b == null || C7573i.m23585a((Object) this.f81160d, (Object) this.f81158b)) {
            StringBuilder sb = new StringBuilder("reportMessageReply lastReportMessage has been replied: ");
            Message message = this.f81158b;
            Long l = null;
            if (message != null) {
                obj = Long.valueOf(message.getMsgId());
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            Message message2 = this.f81160d;
            if (message2 != null) {
                l = Long.valueOf(message2.getMsgId());
            }
            sb.append(l);
            return;
        }
        this.f81160d = this.f81158b;
        m100859a("replied");
    }

    /* renamed from: a */
    private final void m100859a(String str) {
        C31859ae.m103518a(this.f81162f, str);
    }

    public C30999u(Conversation conversation) {
        C7573i.m23587b(conversation, "conversation");
        this.f81162f = conversation;
    }

    /* renamed from: a */
    public final void mo81393a(boolean z) {
        if (!this.f81161e && z) {
            m100859a("replied");
        }
        this.f81161e = true;
    }

    /* renamed from: a */
    public final void mo81392a(Message message, int i) {
        String str;
        C7573i.m23587b(message, "message");
        if (i != -1) {
            if (this.f81162f.isGroupChat() && i == 1) {
                i = 2;
            }
            if (!C7573i.m23585a((Object) this.f81158b, (Object) message) || this.f81159c != i) {
                this.f81158b = message;
                this.f81159c = i;
                if (i == 0) {
                    str = "send";
                } else if (i != 2) {
                    str = "";
                } else {
                    str = "read";
                }
                m100859a(str);
            }
        }
    }
}
