package com.bytedance.android.livesdk.chatroom.p208b;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.message.model.C8695y;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.chatroom.b.a */
public final class C4261a implements OnMessageListener {

    /* renamed from: a */
    private long f12423a;

    /* renamed from: b */
    private final Set<C4263a> f12424b = new HashSet();

    /* renamed from: c */
    private long f12425c;

    /* renamed from: d */
    private long f12426d;

    /* renamed from: e */
    private long f12427e;

    /* renamed from: f */
    private long f12428f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.b.a$a */
    public interface C4263a {
        /* renamed from: a */
        void mo11940a(MessageType messageType, long j);
    }

    /* renamed from: b */
    public final void mo11939b() {
        if (C9038ag.m26996a() != null) {
            C9038ag.m26996a().removeMessageListener(this);
        }
    }

    public C4261a() {
        IMessageManager a = C9038ag.m26996a();
        a.addMessageListener(MessageType.GIFT.getIntType(), this);
        a.addMessageListener(MessageType.CHAT.getIntType(), this);
        a.addMessageListener(MessageType.DIGG.getIntType(), this);
        a.addMessageListener(MessageType.MEMBER.getIntType(), this);
    }

    /* renamed from: a */
    public static boolean m14409a() {
        if (TTLiveSDKContext.getHostService() == null || TTLiveSDKContext.getHostService().mo22361b() == null || TTLiveSDKContext.getHostService().mo22361b().mo23189a() == null) {
            return false;
        }
        TTLiveSDKContext.getHostService().mo22361b();
        return false;
    }

    /* renamed from: a */
    public final void mo11938a(C4263a aVar) {
        this.f12424b.add(aVar);
    }

    /* renamed from: b */
    private boolean m14410b(long j) {
        if (j == this.f12423a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11937a(long j) {
        this.f12423a = j;
        this.f12425c = 0;
        this.f12426d = 0;
        this.f12427e = 0;
        this.f12428f = 0;
        m14408a(MessageType.GIFT, this.f12425c);
        m14408a(MessageType.CHAT, this.f12426d);
        m14408a(MessageType.DIGG, this.f12427e);
        m14408a(MessageType.MEMBER, this.f12428f);
    }

    public final void onMessage(IMessage iMessage) {
        if (m14409a()) {
            C8538c cVar = (C8538c) iMessage;
            switch (cVar.getMessageType()) {
                case GIFT:
                    if (m14410b(((C8489ao) iMessage).f23252a.getId())) {
                        this.f12425c++;
                        m14408a(MessageType.GIFT, this.f12425c);
                        return;
                    }
                    break;
                case DIGG:
                    User user = ((C8695y) iMessage).f23698d;
                    if (user != null && m14410b(user.getId())) {
                        this.f12427e++;
                        m14408a(MessageType.DIGG, this.f12427e);
                        return;
                    }
                case CHAT:
                    if (m14410b(((C8680m) iMessage).f23626c.getId())) {
                        this.f12426d++;
                        m14408a(MessageType.CHAT, this.f12426d);
                        return;
                    }
                    break;
                case MEMBER:
                    User user2 = ((C8514bj) iMessage).f23390b;
                    if (user2 != null && m14410b(user2.getId())) {
                        this.f12428f++;
                        m14408a(MessageType.MEMBER, this.f12428f);
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    private void m14408a(MessageType messageType, long j) {
        for (C4263a a : this.f12424b) {
            a.mo11940a(messageType, j);
        }
    }
}
