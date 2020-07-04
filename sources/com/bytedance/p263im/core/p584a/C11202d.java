package com.bytedance.p263im.core.p584a;

import com.bytedance.p263im.core.proto.ConversationType;
import com.bytedance.p263im.core.proto.StatusCode;

/* renamed from: com.bytedance.im.core.a.d */
public final class C11202d {

    /* renamed from: com.bytedance.im.core.a.d$a */
    public static abstract class C11203a {

        /* renamed from: a */
        public static final int f30380a = ConversationType.ONE_TO_ONE_CHAT.getValue();

        /* renamed from: b */
        public static final int f30381b = ConversationType.GROUP_CHAT.getValue();

        /* renamed from: c */
        public static final int f30382c = ConversationType.LIVE_CHAT.getValue();
    }

    /* renamed from: com.bytedance.im.core.a.d$b */
    public static abstract class C11204b {

        /* renamed from: a */
        public static final int f30383a = StatusCode.OK.getValue();

        /* renamed from: b */
        public static final int f30384b = StatusCode.INVALID_TOKEN.getValue();

        /* renamed from: c */
        public static final int f30385c = StatusCode.EXPIRED_TOKEN.getValue();

        /* renamed from: d */
        public static final int f30386d = StatusCode.INVALID_TICKET.getValue();

        /* renamed from: e */
        public static final int f30387e = StatusCode.INVALID_REQUEST.getValue();

        /* renamed from: f */
        public static final int f30388f = StatusCode.INVALID_CMD.getValue();

        /* renamed from: g */
        public static final int f30389g = StatusCode.SERVER_ERR.getValue();

        /* renamed from: h */
        public static final int f30390h = StatusCode.MESSAGE_TARGET_CONVERSATION_NOT_EXIST.getValue();
    }
}
