package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import com.bytedance.p263im.core.model.Message;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.w */
public final class C31052w {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81499a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31052w.class), "readers", "getReaders()Ljava/util/List;"))};

    /* renamed from: f */
    public static final C31053a f81500f = new C31053a(null);

    /* renamed from: b */
    public boolean f81501b;

    /* renamed from: c */
    public int f81502c = -1;

    /* renamed from: d */
    public Message f81503d;

    /* renamed from: e */
    public final SessionInfo f81504e;

    /* renamed from: g */
    private final C7541d f81505g = C7546e.m23569a(C31054b.f81506a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.w$a */
    public static final class C31053a {
        private C31053a() {
        }

        public /* synthetic */ C31053a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.w$b */
    static final class C31054b extends Lambda implements C7561a<List<String>> {

        /* renamed from: a */
        public static final C31054b f81506a = new C31054b();

        C31054b() {
            super(0);
        }

        /* renamed from: a */
        private static List<String> m101321a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m101321a();
        }
    }

    /* renamed from: a */
    public final List<String> mo81524a() {
        return (List) this.f81505g.getValue();
    }

    /* renamed from: b */
    public final boolean mo81526b() {
        if (this.f81502c == 2 || this.f81502c == 3) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpotReadState:{");
        sb.append(this.f81503d.getMsgId());
        sb.append(", ");
        sb.append(this.f81502c);
        sb.append(", [");
        sb.append(mo81524a());
        sb.append("]}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo81525a(Message message) {
        C7573i.m23587b(message, "<set-?>");
        this.f81503d = message;
    }

    public C31052w(Message message, SessionInfo sessionInfo) {
        C7573i.m23587b(message, "message");
        C7573i.m23587b(sessionInfo, "sessionInfo");
        this.f81503d = message;
        this.f81504e = sessionInfo;
    }
}
