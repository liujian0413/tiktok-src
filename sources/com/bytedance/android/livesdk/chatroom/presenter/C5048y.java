package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.TaskGiftApi;
import com.bytedance.android.livesdk.chatroom.model.TaskGiftEvent;
import com.bytedance.android.livesdk.chatroom.viewmodule.C5595at;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.assets.C7872f;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.mvp.SendGiftFailException;
import com.bytedance.android.livesdk.message.model.C8472a;
import com.bytedance.android.livesdk.message.model.C8483aj;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.message.model.C8490ap;
import com.bytedance.android.livesdk.message.model.C8623f;
import com.bytedance.android.livesdk.message.model.C8696z;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p451g.C9409a;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C6609h;
import com.google.gson.C6711m;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.y */
public final class C5048y extends C5017ci<C5050a> implements OnMessageListener {

    /* renamed from: a */
    private C7321c f14340a;

    /* renamed from: b */
    private boolean f14341b;

    /* renamed from: c */
    private Room f14342c;

    /* renamed from: d */
    private boolean f14343d;

    /* renamed from: e */
    private boolean f14344e;

    /* renamed from: f */
    private boolean f14345f;

    /* renamed from: i */
    private LinkedList<C8489ao> f14346i = new LinkedList<>();

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.y$a */
    public interface C5050a extends C5595at {
        /* renamed from: a */
        void mo13097a(C8158m mVar);

        /* renamed from: a */
        void mo13098a(C8472a aVar);

        /* renamed from: a */
        void mo13099a(C8489ao aoVar, boolean z);

        /* renamed from: a */
        void mo13100a(C8696z zVar, boolean z);

        /* renamed from: a */
        void mo13101a(List<TaskGiftEvent> list);

        /* renamed from: b */
        void mo13102b(Throwable th);
    }

    /* renamed from: a */
    public final void mo8963a() {
        if (this.f14340a != null && !this.f14340a.isDisposed()) {
            this.f14340a.dispose();
        }
        super.mo8963a();
    }

    /* renamed from: b */
    public final void mo13095b() {
        if (!this.f14341b) {
            this.f14341b = true;
            ((TaskGiftApi) C3458e.m12798a().mo10440a(TaskGiftApi.class)).getHotsoonTaskGiftEvent().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4937ab<Object>(this), (C7326g<? super Throwable>) new C4938ac<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13094a(Throwable th) throws Exception {
        this.f14341b = false;
    }

    public final void onEvent(C9409a aVar) {
        if (aVar.f25901b == 3) {
            this.f14343d = true;
            return;
        }
        if (aVar.f25901b == 4) {
            this.f14343d = false;
        }
    }

    /* renamed from: a */
    private void m16191a(int i) {
        if (i == 1) {
            GiftManager.inst().syncGiftList(null, this.f14342c.getId(), 5, this.f14345f);
            return;
        }
        if (i == 2) {
            C7872f.m24128a("effects").mo20654a(5, this.f14345f);
        }
    }

    /* renamed from: b */
    private static List<TaskGiftEvent> m16192b(C6711m mVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        C6609h d = mVar.mo16151d("data");
        for (int i = 0; i < d.mo15994a(); i++) {
            C6711m m = d.mo15995a(i).mo16136m();
            TaskGiftEvent taskGiftEvent = new TaskGiftEvent();
            taskGiftEvent.setData(m.mo16149b("data").toString());
            taskGiftEvent.setType(m.mo16149b("type").mo16003g());
            taskGiftEvent.setSubtitle(m.mo16149b("subtitle").mo15998c());
            arrayList.add(taskGiftEvent);
        }
        return arrayList;
    }

    public final void onMessage(IMessage iMessage) {
        if (mo9140c() != null) {
            if (iMessage instanceof C8490ap) {
                m16191a(((C8490ap) iMessage).f23267a);
                return;
            }
            boolean z = true;
            if (iMessage instanceof C8489ao) {
                C8489ao aoVar = (C8489ao) iMessage;
                C5050a aVar = (C5050a) mo9140c();
                if (this.f14344e || !this.f14343d) {
                    z = false;
                }
                aVar.mo13099a(aoVar, z);
            } else if (iMessage instanceof C8696z) {
                C8696z zVar = (C8696z) iMessage;
                C5050a aVar2 = (C5050a) mo9140c();
                if (this.f14344e || !this.f14343d) {
                    z = false;
                }
                aVar2.mo13100a(zVar, z);
            } else if (iMessage instanceof C8483aj) {
                C8489ao a = C8483aj.m25748a((C8483aj) iMessage);
                if (a != null) {
                    C5050a aVar3 = (C5050a) mo9140c();
                    if (this.f14344e || !this.f14343d) {
                        z = false;
                    }
                    aVar3.mo13099a(a, z);
                }
            } else if (iMessage instanceof C8472a) {
                ((C5050a) mo9140c()).mo13098a((C8472a) iMessage);
            } else {
                if (iMessage instanceof C8623f) {
                    C8623f fVar = (C8623f) iMessage;
                    if (fVar.f23602a != null) {
                        C5050a aVar4 = (C5050a) mo9140c();
                        C8489ao aoVar2 = fVar.f23602a;
                        if (this.f14344e || !this.f14343d) {
                            z = false;
                        }
                        aVar4.mo13099a(aoVar2, z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9142a(C5050a aVar) {
        super.mo9142a(aVar);
        this.f14342c = (Room) this.f14275g.get("data_room");
        this.f14345f = ((Boolean) this.f14275g.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        this.f14344e = ((Boolean) this.f14275g.get("data_is_portrait", Boolean.valueOf(true))).booleanValue();
        if (this.f14276h != null) {
            this.f14276h.addMessageListener(MessageType.GIFT_UPDATE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.GIFT.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.DOODLE_GIFT.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.FREE_CELL_GIFT_MESSAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.ASSET_MESSAGE.getIntType(), this);
            this.f14276h.addMessageListener(MessageType.BINDING_GIFT_MESSAGE.getIntType(), this);
        }
        if (this.f14340a != null && !this.f14340a.isDisposed()) {
            this.f14340a.dispose();
        }
        this.f14340a = C9097a.m27146a().mo22266a(C9409a.class).mo19325f((C7326g<? super T>) new C7326g<C9409a>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C9409a aVar) throws Exception {
                C5048y.this.onEvent(aVar);
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13092a(C6711m mVar) throws Exception {
        this.f14341b = false;
        try {
            List b = m16192b(mVar);
            if (!C6307b.m19566a((Collection<T>) b) && b.size() >= 3 && mo9140c() != null) {
                ((C5050a) mo9140c()).mo13101a(b);
            }
        } catch (Exception e) {
            C3166a.m11966e("GiftPresenter", e.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13090a(long j, Throwable th) throws Exception {
        if (mo9140c() != null) {
            ((C5050a) mo9140c()).mo13102b(th);
        }
        C8282s.m25315a(j, this.f14342c.getId(), th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13089a(long j, long j2, String str, C3479d dVar) throws Exception {
        C8282s.m25314a(j, this.f14342c.getId(), SystemClock.uptimeMillis() - j2);
        if (mo9140c() != null) {
            C8158m mVar = (C8158m) dVar.data;
            if (mVar != null) {
                mVar.f22320x = str;
                ((C5050a) mo9140c()).mo13097a((C8158m) dVar.data);
                return;
            }
            ((C5050a) mo9140c()).mo13102b(new SendGiftFailException());
        }
    }

    /* renamed from: a */
    public final void mo13093a(String str, long j, User user, int i, String str2) {
        long j2 = j;
        if (GiftManager.inst().findGiftById(j2) != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            C7492s a = ((GiftRetrofitApi) C3458e.m12798a().mo10440a(GiftRetrofitApi.class)).send(j, this.f14342c.getId(), this.f14342c.getOwner().getId(), i).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
            long j3 = j2;
            C5051z zVar = new C5051z(this, j, uptimeMillis, str2);
            a.mo19280a((C7326g<? super T>) zVar, (C7326g<? super Throwable>) new C4936aa<Object>(this, j3));
        }
    }
}
