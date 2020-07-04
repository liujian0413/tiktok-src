package com.bytedance.android.livesdk.chatroom.presenter;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.event.C4418aj;
import com.bytedance.android.livesdk.chatroom.event.C4419ak;
import com.bytedance.android.livesdk.chatroom.event.C4420al;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent.Sender;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.p209bl.C4273e;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5572e;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8547ci;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.b */
public final class C4967b extends C5017ci<C4969a> implements OnMessageListener {

    /* renamed from: a */
    private boolean f14179a = true;

    /* renamed from: b */
    private boolean f14180b = true;

    /* renamed from: c */
    private Room f14181c;

    /* renamed from: d */
    private boolean f14182d = true;

    /* renamed from: e */
    private boolean f14183e = true;

    /* renamed from: f */
    private C47562b f14184f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.b$1 */
    static /* synthetic */ class C49681 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14185a = new int[MessageType.values().length];

        static {
            try {
                f14185a[MessageType.ROOM_VERIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.b$a */
    public interface C4969a extends C5595at {
        /* renamed from: a */
        void mo12966a(Barrage barrage);

        /* renamed from: a */
        void mo12967a(C8680m mVar);

        /* renamed from: a */
        void mo12968a(Exception exc);

        /* renamed from: a */
        void mo12969a(boolean z);

        /* renamed from: b */
        void mo12970b(Exception exc);
    }

    /* renamed from: a */
    public final void mo9142a(C4969a aVar) {
        super.mo9142a(aVar);
        this.f14181c = (Room) this.f14275g.get("data_room");
        this.f14179a = true;
        this.f14180b = true;
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.ROOM_VERIFY.getIntType(), this);
        }
        if (this.f14184f != null) {
            this.f14184f.dispose();
        }
        this.f14184f = new C47562b();
        this.f14184f.mo119661a(C9097a.m27146a().mo22266a(ISendCommentEvent.class).mo19325f((C7326g<? super T>) new C5002c<Object>(this)));
    }

    /* renamed from: a */
    public final void mo12964a(String str, Sender sender, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("live.intent.extra.ENTER_LIVE_SOURCE", str2);
        m15981a(new C4420al(str, sender, hashMap));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C4420al alVar, Throwable th) throws Exception {
        C9097a.m27146a().mo22267a((Object) new C4419ak(alVar, false));
        this.f14180b = true;
        if (mo9140c() != null && (th instanceof Exception)) {
            ((C4969a) mo9140c()).mo12970b((Exception) th);
        }
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        if (this.f14184f != null) {
            this.f14184f.dispose();
        }
        this.f14184f = null;
    }

    /* renamed from: b */
    private static void m15982b(int i) {
        C5572e eVar = new C5572e(i);
        C5747j.m18105c().mo14164a(ToolbarButton.EMOTION, (C5735a) eVar);
        C5747j.m18105c().mo14164a(ToolbarButton.DIVIDER, (C5735a) eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12958a(ISendCommentEvent iSendCommentEvent) throws Exception {
        if (!(mo9140c() == null || iSendCommentEvent == null)) {
            if (iSendCommentEvent instanceof C4420al) {
                m15981a((C4420al) iSendCommentEvent);
            } else if (iSendCommentEvent instanceof C4418aj) {
                m15980a((C4418aj) iSendCommentEvent);
            }
        }
    }

    /* renamed from: a */
    private static void m15979a(int i) {
        boolean z;
        C5747j.m18105c().mo14164a(ToolbarButton.GIFT, (C5735a) new C5572e(i));
        C8444d.m25673b();
        String str = "ttlive_gift";
        StringBuilder sb = new StringBuilder("Gift icon status changed, visiable:");
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", reason:CommentPresenter sendGiftVisibilityCommand");
        C8444d.m11971b(str, sb.toString());
    }

    /* renamed from: a */
    private void m15980a(C4418aj ajVar) {
        if (this.f14184f == null || TextUtils.isEmpty(ajVar.f12839a) || !this.f14179a) {
            C9097a.m27146a().mo22267a((Object) new C4419ak(ajVar, false));
            return;
        }
        String str = null;
        if (ajVar.mo12131a().get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) ajVar.mo12131a().get("live.intent.extra.ENTER_LIVE_SOURCE");
        }
        String str2 = str;
        this.f14179a = false;
        this.f14184f.mo119661a(C4273e.m14429b(ajVar.f12839a, this.f14181c.getId(), this.f14181c.getRequestId(), this.f14181c.getLabels(), str2).mo19280a((C7326g<? super T>) new C5020f<Object>(this, ajVar), (C7326g<? super Throwable>) new C5021g<Object>(this, ajVar)));
    }

    /* renamed from: a */
    private void m15981a(C4420al alVar) {
        if (this.f14184f == null || TextUtils.isEmpty(alVar.f12844a) || !this.f14180b) {
            C9097a.m27146a().mo22267a((Object) new C4419ak(alVar, false));
            return;
        }
        String str = null;
        if (alVar.mo12138a().get("live.intent.extra.ENTER_LIVE_SOURCE") instanceof String) {
            str = (String) alVar.mo12138a().get("live.intent.extra.ENTER_LIVE_SOURCE");
        }
        String str2 = str;
        this.f14180b = false;
        this.f14184f.mo119661a(C4273e.m14428a(alVar.f12844a, this.f14181c.getId(), this.f14181c.getRequestId(), this.f14181c.getLabels(), str2).mo19280a((C7326g<? super T>) new C5018d<Object>(this, alVar), (C7326g<? super Throwable>) new C5019e<Object>(this, alVar)));
    }

    public final void onMessage(IMessage iMessage) {
        if (!(mo9140c() == null || iMessage == null || !(iMessage instanceof C8538c))) {
            if (C49681.f14185a[((C8538c) iMessage).getMessageType().ordinal()] == 1 && (iMessage instanceof C8547ci)) {
                switch (((C8547ci) iMessage).f23540a) {
                    case 3:
                        this.f14182d = false;
                        if (!(this.f14181c == null || this.f14181c.mRoomAuthStatus == null)) {
                            this.f14181c.mRoomAuthStatus.enableChat = false;
                        }
                        return;
                    case 4:
                        this.f14182d = true;
                        if (!(this.f14181c == null || this.f14181c.mRoomAuthStatus == null)) {
                            this.f14181c.mRoomAuthStatus.enableChat = true;
                        }
                        return;
                    case 5:
                        this.f14183e = false;
                        if (!(this.f14181c == null || this.f14181c.mRoomAuthStatus == null)) {
                            this.f14181c.mRoomAuthStatus.enableDanmaku = false;
                        }
                        ((C4969a) mo9140c()).mo12969a(this.f14183e);
                        return;
                    case 6:
                        this.f14183e = true;
                        if (!(this.f14181c == null || this.f14181c.mRoomAuthStatus == null)) {
                            this.f14181c.mRoomAuthStatus.enableDanmaku = true;
                        }
                        ((C4969a) mo9140c()).mo12969a(this.f14183e);
                        return;
                    case 7:
                        if (!(this.f14181c == null || this.f14181c.mRoomAuthStatus == null)) {
                            this.f14181c.mRoomAuthStatus.enableGift = false;
                        }
                        m15979a(8);
                        return;
                    case 8:
                        if (!(this.f14181c == null || this.f14181c.mRoomAuthStatus == null)) {
                            this.f14181c.mRoomAuthStatus.enableGift = true;
                        }
                        m15979a(0);
                        return;
                    case 12:
                        if (!(this.f14181c == null || this.f14181c.mRoomAuthStatus == null)) {
                            this.f14181c.mRoomAuthStatus.enableDigg = false;
                        }
                        m15982b(8);
                        return;
                    case 13:
                        if (!(this.f14181c == null || this.f14181c.mRoomAuthStatus == null)) {
                            this.f14181c.mRoomAuthStatus.enableDigg = true;
                        }
                        m15982b(0);
                        break;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12959a(C4418aj ajVar, C3479d dVar) throws Exception {
        C9097a.m27146a().mo22267a((Object) new C4419ak(ajVar, true));
        this.f14179a = true;
        if (mo9140c() != null) {
            ((C4969a) mo9140c()).mo12966a((Barrage) dVar.data);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12960a(C4418aj ajVar, Throwable th) throws Exception {
        C9097a.m27146a().mo22267a((Object) new C4419ak(ajVar, false));
        this.f14179a = true;
        if (mo9140c() != null && (th instanceof Exception)) {
            ((C4969a) mo9140c()).mo12968a((Exception) th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12961a(C4420al alVar, C3479d dVar) throws Exception {
        C9097a.m27146a().mo22267a((Object) new C4419ak(alVar, true));
        this.f14180b = true;
        if (mo9140c() != null) {
            ChatResult chatResult = (ChatResult) dVar.data;
            C8680m a = C4270b.m14425a(this.f14181c.getId(), chatResult, chatResult.getUser());
            a.f23630g = String.valueOf(chatResult.getMsgId());
            ((C4969a) mo9140c()).mo12967a(a);
        }
    }

    /* renamed from: b */
    public final void mo12965b(String str, Sender sender, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("live.intent.extra.ENTER_LIVE_SOURCE", str2);
        m15980a(new C4418aj(str, sender, hashMap));
    }
}
