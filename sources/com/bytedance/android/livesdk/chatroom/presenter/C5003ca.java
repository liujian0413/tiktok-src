package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Message;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b;
import com.bytedance.android.livesdk.chatroom.p212e.C4354i;
import com.bytedance.android.livesdk.chatroom.p212e.C4356k;
import com.bytedance.android.livesdk.chatroom.p212e.C4358l;
import com.bytedance.android.livesdk.chatroom.p212e.C4372y;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.model.C8512bh;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.message.model.C8535by;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.message.model.C8548cj;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.bytedance.android.livesdkapi.message.C9499a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.message.C9521a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnInterceptListener;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ca */
public class C5003ca extends C5017ci<C5007a> implements C9521a, OnInterceptListener, OnMessageListener {

    /* renamed from: j */
    private static final String f14233j = "ca";

    /* renamed from: a */
    public int f14234a = ((Integer) LiveSettingKeys.LIVE_TEXT_WIDGET_SHOW_MSG_PER_SIZE.mo10240a()).intValue();

    /* renamed from: b */
    public int f14235b = ((Integer) LiveSettingKeys.LIVE_TEXT_WIDGET_SHOW_MSG_PER_MILLIS.mo10240a()).intValue();

    /* renamed from: c */
    public final Queue<C4343b> f14236c = new ArrayDeque(100);

    /* renamed from: d */
    public final Queue<C4343b> f14237d = new ArrayDeque(100);

    /* renamed from: e */
    public C9301a f14238e = new C9301a(new C9302a() {
        /* renamed from: a */
        public final void mo12403a(Message message) {
        }
    });

    /* renamed from: f */
    public Runnable f14239f = new Runnable() {
        public final void run() {
            if (C5003ca.this.mo9140c() != null) {
                Stack stack = new Stack();
                while (stack.size() < C5003ca.this.f14234a && (C5003ca.this.f14237d.size() != 0 || C5003ca.this.f14236c.size() != 0)) {
                    if (C5003ca.this.f14237d.size() > 0) {
                        stack.push(C5003ca.this.f14237d.poll());
                    } else if (C5003ca.this.f14236c.size() > 0) {
                        stack.push(C5003ca.this.f14236c.poll());
                    }
                }
                Iterator it = stack.iterator();
                while (it.hasNext()) {
                    C5003ca.this.mo13002a((C4343b) it.next());
                }
                C5003ca.this.f14238e.postDelayed(C5003ca.this.f14239f, (long) C5003ca.this.f14235b);
            }
        }
    };

    /* renamed from: i */
    private C4343b f14240i;

    /* renamed from: k */
    private boolean f14241k = ((Boolean) LiveSettingKeys.ENABLE_LIVE_TEXT_SCROLL_OPTIMIZE.mo10240a()).booleanValue();

    /* renamed from: l */
    private long f14242l;

    /* renamed from: m */
    private Room f14243m;

    /* renamed from: n */
    private final List<C4343b> f14244n = new ArrayList(C34943c.f91127w);

    /* renamed from: o */
    private final List<C4343b> f14245o = new ArrayList(C34943c.f91127w);

    /* renamed from: p */
    private List<ImageModel> f14246p = null;

    /* renamed from: q */
    private boolean f14247q = false;

    /* renamed from: r */
    private long f14248r;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.ca$a */
    public interface C5007a extends C5595at {
        /* renamed from: a */
        void mo13009a(int i);

        /* renamed from: a */
        void mo13010a(int i, boolean z);

        /* renamed from: a */
        void mo13011a(C8548cj cjVar);

        /* renamed from: b */
        void mo13012b(int i, boolean z);

        /* renamed from: c */
        void mo13013c(int i, boolean z);
    }

    /* renamed from: b */
    public final List<C4343b> mo13005b() {
        return this.f14244n;
    }

    /* renamed from: d */
    public final List<C4343b> mo13006d() {
        return this.f14245o;
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        if (this.f14276h != null) {
            this.f14276h.removeOnInterceptListener(this);
        }
        if (this.f14238e != null) {
            this.f14238e.removeCallbacks(this.f14239f);
        }
    }

    public void onIntercept(IMessage iMessage) {
        m16051d(C4372y.m14744a((C8538c) iMessage));
    }

    /* renamed from: b */
    private void m16047b(C4343b bVar) {
        if (bVar.mo12077p() == ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) {
            if (this.f14237d.size() < 100) {
                this.f14237d.add(bVar);
            }
        } else if (this.f14236c.size() < 100) {
            this.f14236c.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo13002a(C4343b bVar) {
        if (this.f14244n.size() >= 200) {
            this.f14244n.subList(0, 70).clear();
            ((C5007a) mo9140c()).mo13009a(70);
        }
        m16049c(bVar);
    }

    public C5003ca(long j) {
        this.f14242l = j;
    }

    /* renamed from: b */
    private static boolean m16048b(C9499a aVar) {
        if (aVar instanceof C8680m) {
            if (((C8680m) aVar).f23626c == TTLiveSDKContext.getHostService().mo22367h().mo22165a()) {
                return true;
            }
            return false;
        } else if (!(aVar instanceof C8489ao) || ((C8489ao) aVar).f23252a != TTLiveSDKContext.getHostService().mo22367h().mo22165a()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    private void m16051d(C4343b<?> bVar) {
        long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        if (b != 0 && b == bVar.mo12077p()) {
            T t = bVar.f12647a;
            if (t.getMessageType() == MessageType.CHAT || t.getMessageType() == MessageType.GIFT || t.getMessageType() == MessageType.DOODLE_GIFT || t.getMessageType() == MessageType.GIFT_GROUP || t.getMessageType() == MessageType.DIGG || t.getMessageType() == MessageType.MEMBER || t.getMessageType() == MessageType.SCREEN) {
                this.f14246p = bVar.mo12073j();
            }
        }
    }

    /* renamed from: a */
    public final void mo13004a(C9499a aVar) {
        if (mo9140c() != null) {
            for (int i = 0; i < this.f14244n.size(); i++) {
                if (aVar == ((C4343b) this.f14244n.get(i)).f12647a) {
                    this.f14244n.remove(i);
                    ((C5007a) mo9140c()).mo13010a(i, true);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r6.baseMessage.f26000j != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r6.baseMessage.f26000j != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
        if (r6.f22236g != false) goto L_0x009b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16050c(com.bytedance.android.livesdkapi.message.C9499a r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 == 0) goto L_0x009c
            long r1 = r5.f14242l
            boolean r1 = r6.isCurrentRoom(r1)
            if (r1 == 0) goto L_0x009c
            boolean r1 = r6.canText()
            if (r1 != 0) goto L_0x0013
            goto L_0x009c
        L_0x0013:
            int[] r1 = com.bytedance.android.livesdk.chatroom.presenter.C5003ca.C50063.f14251a
            com.bytedance.android.livesdkapi.depend.message.MessageType r2 = r6.getMessageType()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 0
            switch(r1) {
                case 1: goto L_0x0083;
                case 2: goto L_0x004b;
                case 3: goto L_0x0040;
                case 4: goto L_0x002e;
                case 5: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x009a
        L_0x0025:
            com.bytedance.android.livesdkapi.depend.model.live.Room r6 = r5.f14243m
            boolean r6 = r6.isOfficial()
            if (r6 == 0) goto L_0x009a
            return r0
        L_0x002e:
            r1 = r6
            com.bytedance.android.livesdk.message.model.a r1 = (com.bytedance.android.livesdk.message.model.C8472a) r1
            boolean r3 = r1.f23188c
            if (r3 == 0) goto L_0x009b
            com.bytedance.android.livesdkapi.message.b r1 = r1.baseMessage
            if (r1 == 0) goto L_0x009b
            com.bytedance.android.livesdkapi.message.b r6 = r6.baseMessage
            com.bytedance.android.livesdkapi.message.f r6 = r6.f26000j
            if (r6 != 0) goto L_0x009a
            goto L_0x009b
        L_0x0040:
            com.bytedance.android.livesdkapi.message.b r1 = r6.baseMessage
            if (r1 == 0) goto L_0x009b
            com.bytedance.android.livesdkapi.message.b r6 = r6.baseMessage
            com.bytedance.android.livesdkapi.message.f r6 = r6.f26000j
            if (r6 != 0) goto L_0x009a
            goto L_0x009b
        L_0x004b:
            com.bytedance.android.livesdk.message.model.bs r6 = (com.bytedance.android.livesdk.message.model.C8529bs) r6
            java.lang.String r6 = r6.f23446a
            r1 = -1
            int r3 = r6.hashCode()
            r4 = -984622807(0xffffffffc54fd929, float:-3325.5725)
            if (r3 == r4) goto L_0x0069
            r2 = -407856239(0xffffffffe7b09b91, float:-1.6680124E24)
            if (r3 == r2) goto L_0x005f
            goto L_0x0072
        L_0x005f:
            java.lang.String r2 = "enter_by_card"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0072
            r1 = 1
            goto L_0x0072
        L_0x0069:
            java.lang.String r3 = "buy_card"
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x0072
            r1 = 0
        L_0x0072:
            switch(r1) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0076;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x009b
        L_0x0076:
            com.bytedance.android.live.core.setting.l<java.lang.Boolean> r6 = com.bytedance.android.livesdk.config.C5864b.f17270Y
            java.lang.Object r6 = r6.mo10240a()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            goto L_0x009b
        L_0x0083:
            com.bytedance.android.livesdk.message.model.ao r6 = (com.bytedance.android.livesdk.message.model.C8489ao) r6
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r1 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.utility.C3596c.m13172a(r1)
            com.bytedance.android.live.gift.IGiftService r1 = (com.bytedance.android.live.gift.IGiftService) r1
            long r3 = r6.f23254c
            com.bytedance.android.livesdk.gift.model.d r6 = r1.findGiftById(r3)
            if (r6 == 0) goto L_0x009a
            boolean r6 = r6.f22236g
            if (r6 == 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            return r0
        L_0x009c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.presenter.C5003ca.m16050c(com.bytedance.android.livesdkapi.message.a):boolean");
    }

    public void onMessage(IMessage iMessage) {
        C8538c cVar = (C8538c) iMessage;
        if (cVar instanceof C8489ao) {
            C8489ao aoVar = (C8489ao) cVar;
            C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(aoVar.f23254c);
            if (findGiftById != null && findGiftById.f22236g && aoVar.f23258g == 0) {
                return;
            }
            if (findGiftById != null && findGiftById.f22234e == 11) {
                return;
            }
        }
        boolean booleanValue = ((Boolean) C8946b.f24374Z.mo22117a()).booleanValue();
        C4343b a = C4372y.m14744a(cVar);
        if (a != null) {
            if (this.f14243m != null) {
                a.f12649c = this.f14243m.getOrientation();
            }
            a.f12650d = ((Boolean) this.f14275g.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
            if (!booleanValue || ((Boolean) C8946b.f24408ag.mo22117a()).booleanValue() || a.f12647a.getIntType() != MessageType.CHAT.getIntType()) {
                this.f14240i = a;
            }
            if (this.f14245o.size() >= 200) {
                this.f14245o.subList(0, 70).clear();
            }
            int intType = a.f12647a.getIntType();
            if (intType == MessageType.GIFT.getIntType() || intType == MessageType.DOODLE_GIFT.getIntType() || intType == MessageType.CHAT.getIntType() || intType == MessageType.MEMBER.getIntType() || intType == MessageType.SCREEN.getIntType()) {
                this.f14245o.add(a);
            }
            if (mo9140c() != null && !m16050c((C9499a) cVar)) {
                if (cVar instanceof C8548cj) {
                    ((C5007a) mo9140c()).mo13011a((C8548cj) iMessage);
                }
                if (this.f14241k) {
                    m16047b(a);
                } else {
                    mo13002a(a);
                }
            }
        }
    }

    /* renamed from: c */
    private void m16049c(C4343b bVar) {
        if ((!(bVar instanceof C4358l) && !(bVar instanceof C4356k) && !(bVar instanceof C4354i)) || !((Boolean) LiveConfigSettingKeys.SUPPRESS_GIFT_TEXT_MESSAGES.mo10240a()).booleanValue() || this.f14243m.giftMessageStyle != 1) {
            if (m16048b((C9499a) bVar.f12647a)) {
                bVar.f12654h = this.f14246p;
            } else {
                m16051d(bVar);
            }
            if (bVar.f12647a instanceof C8535by) {
                C8535by byVar = (C8535by) bVar.f12647a;
                if (byVar.f23471j && byVar.f23472k != null && byVar.f23472k.get() != null) {
                    int indexOf = this.f14244n.indexOf((C4343b) byVar.f23472k.get());
                    if (indexOf >= 0) {
                        this.f14244n.remove(indexOf);
                        ((C5007a) mo9140c()).mo13010a(indexOf, false);
                    }
                } else if (!byVar.f23471j) {
                    byVar.f23472k = new WeakReference<>(bVar);
                }
            }
            if (bVar.f12647a instanceof C8512bh) {
                C8512bh bhVar = (C8512bh) bVar.f12647a;
                if (bhVar.f23383v && bhVar.f23386y != null) {
                    int indexOf2 = this.f14244n.indexOf((C4343b) bhVar.f23386y.get());
                    if (indexOf2 >= 0) {
                        this.f14244n.remove(indexOf2);
                        ((C5007a) mo9140c()).mo13010a(indexOf2, false);
                    }
                } else if (!bhVar.f23383v) {
                    bhVar.f23386y = new WeakReference<>(bVar);
                }
            }
            if (bVar.f12647a.getMessageType() == MessageType.DIGG || (bVar.f12647a.getMessageType() == MessageType.MEMBER && ((C8514bj) bVar.f12647a).mo21658a() == 1)) {
                this.f14244n.add(bVar);
                if (!this.f14247q || this.f14248r == 0 || System.currentTimeMillis() - this.f14248r >= 3000) {
                    ((C5007a) mo9140c()).mo13012b(this.f14244n.size() - 1, true);
                } else {
                    if (((C4343b) this.f14244n.get(this.f14244n.size() - 2)).mo12077p() != TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
                        this.f14244n.remove(this.f14244n.size() - 2);
                    }
                    ((C5007a) mo9140c()).mo13013c(this.f14244n.size() - 1, false);
                }
                this.f14248r = System.currentTimeMillis();
                this.f14247q = true;
            } else if (this.f14247q) {
                this.f14244n.add(this.f14244n.size() - 1, bVar);
                ((C5007a) mo9140c()).mo13012b(this.f14244n.size() - 2, true);
            } else {
                this.f14244n.add(bVar);
                ((C5007a) mo9140c()).mo13012b(this.f14244n.size() - 1, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo9142a(C5007a aVar) {
        super.mo9142a(aVar);
        this.f14243m = (Room) this.f14275g.get("data_room", null);
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.CHAT.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.GIFT.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.FREE_CELL_GIFT_MESSAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.MEMBER.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.DIGG.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.ROOM.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.SOCIAL.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.CONTROL.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.SCREEN.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.DOODLE_GIFT.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.DEFAULT.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.ROOM_RICH_CHAT_MESSAGE.getIntType(), this);
            if (!C9290a.f25466a) {
                this.f14276h.addMessageListener(MessageType.PROMOTION_CARD_MESSAGE.getIntType(), this);
            }
            if (this.f14243m != null && !this.f14243m.isStar()) {
                this.f14276h.addMessageListener(MessageType.LUCKY_BOX.getIntType(), this);
            }
            this.f14276h.addMessageListener(MessageType.LOTTERY_EVENT.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.COMMENT_IMAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.FANS_CLUB.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.GOODS_ORDER.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.ASSET_MESSAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.IM_DELETE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.GAME_GIFT_MESSAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.NOBLE_UPGRADE_MESSAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.PORTAL_MESSAGE.getIntType(), this);
            this.f14276h.addOnInterceptListener(this);
        }
        if (this.f14241k) {
            this.f14238e.postDelayed(this.f14239f, (long) this.f14235b);
        }
    }
}
