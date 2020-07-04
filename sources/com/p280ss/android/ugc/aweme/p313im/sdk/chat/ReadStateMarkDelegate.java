package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.os.Message;
import com.bytedance.p263im.core.model.C11469m;
import com.bytedance.p263im.core.model.C6417a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateMarkDelegate */
public final class ReadStateMarkDelegate extends AbsReadStateDelegate {

    /* renamed from: b */
    public static final C30720a f80447b = new C30720a(null);

    /* renamed from: c */
    private boolean f80448c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateMarkDelegate$a */
    public static final class C30720a {
        private C30720a() {
        }

        public /* synthetic */ C30720a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo80371b() {
        m100055g();
    }

    /* renamed from: c */
    public final void mo80372c() {
        m100055g();
    }

    public final void onResume() {
        m100053e();
    }

    public final void onStop() {
        m100053e();
    }

    /* renamed from: f */
    private final void m100054f() {
        sendEmptyMessageDelayed(0, 2000);
    }

    /* renamed from: g */
    private final void m100055g() {
        sendEmptyMessageDelayed(0, 1000);
    }

    /* renamed from: d */
    public final void mo80373d() {
        this.f80448c = true;
        m100054f();
    }

    /* renamed from: e */
    private final void m100053e() {
        if (this.f80333a.mo80517e().getChatType() == 1) {
            C11469m.m33840a().mo27687a(this.f80333a.mo80517e().getConversationId(), null);
            return;
        }
        C6417a.m20015a();
        C6417a.m20025c(this.f80333a.mo80516d().f30971b);
    }

    public ReadStateMarkDelegate(C30739d dVar) {
        C7573i.m23587b(dVar, "dataCenter");
        super(dVar);
    }

    public final void handleMessage(Message message) {
        ReadStateMarkDelegate readStateMarkDelegate;
        if (message != null && message.what == 0) {
            removeMessages(0);
            if (this.f80448c) {
                readStateMarkDelegate = this;
            } else {
                readStateMarkDelegate = null;
            }
            ReadStateMarkDelegate readStateMarkDelegate2 = readStateMarkDelegate;
            if (readStateMarkDelegate2 != null) {
                readStateMarkDelegate2.m100053e();
            }
            this.f80448c = false;
        }
    }
}
