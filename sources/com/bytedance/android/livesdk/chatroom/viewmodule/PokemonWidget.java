package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3693c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.p199a.C4035e;
import com.bytedance.android.livesdk.chatroom.event.C4414af;
import com.bytedance.android.livesdk.chatroom.event.C4425aq;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4859j;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.mvp.SendGiftFailException;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.viewmodel.PokemonViewModel;
import com.bytedance.android.livesdk.viewmodel.PokemonViewModel.C9129a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;

public final class PokemonWidget extends LiveRecyclableWidget {

    /* renamed from: d */
    public static final C5492a f16326d = new C5492a(null);

    /* renamed from: a */
    public PokemonViewModel f16327a;

    /* renamed from: b */
    public Room f16328b;

    /* renamed from: c */
    public boolean f16329c;

    /* renamed from: e */
    private C0053p<KVData> f16330e = new C5493b(this);

    /* renamed from: f */
    private C5496e f16331f = new C5496e(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$a */
    public static final class C5492a {
        private C5492a() {
        }

        public /* synthetic */ C5492a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$b */
    static final class C5493b<T> implements C0053p<KVData> {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f16332a;

        C5493b(PokemonWidget pokemonWidget) {
            this.f16332a = pokemonWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(KVData kVData) {
            String str;
            Object obj = null;
            if (kVData != null) {
                str = kVData.getKey();
            } else {
                str = null;
            }
            if (str != null) {
                if (kVData != null) {
                    obj = kVData.getData();
                }
                if (obj != null && C7573i.m23585a((Object) kVData.getKey(), (Object) "data_link_state")) {
                    Integer num = (Integer) kVData.getData();
                    if (num != null && num.intValue() == 1) {
                        View view = this.f16332a.contentView;
                        C7573i.m23582a((Object) view, "contentView");
                        view.setVisibility(8);
                        return;
                    }
                    View view2 = this.f16332a.contentView;
                    C7573i.m23582a((Object) view2, "contentView");
                    view2.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$c */
    static final class C5494c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f16333a;

        C5494c(PokemonWidget pokemonWidget) {
            this.f16333a = pokemonWidget;
        }

        public final void onClick(View view) {
            C8984e h = TTLiveSDKContext.getHostService().mo22367h();
            C7573i.m23582a((Object) h, "TTLiveSDKContext.getHostService().user()");
            if (!h.mo22182c()) {
                TTLiveSDKContext.getHostService().mo22367h().mo22167a((FragmentActivity) this.f16333a.context, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f6a)).mo22188a(0).mo22190a()).mo19293a((C7497x<? super T, ? extends R>) this.f16333a.getAutoUnbindTransformer()).mo19189a((C7498y<? super T>) new C8986g<Object>());
            } else if (!TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.GIFT)) {
                C19290j jVar = new C19290j("https://hotsoon.snssdk.com/falcon/live_inroom/page/magic_baby/pokemon/");
                User owner = this.f16333a.mo13969a().getOwner();
                C7573i.m23582a((Object) owner, "mRoom.owner");
                jVar.mo51187a("anchor_id", owner.getId());
                jVar.mo51187a("room_id", this.f16333a.mo13969a().getId());
                C8984e h2 = TTLiveSDKContext.getHostService().mo22367h();
                C7573i.m23582a((Object) h2, "TTLiveSDKContext.getHostService().user()");
                IUser a = h2.mo22165a();
                C7573i.m23582a((Object) a, "TTLiveSDKContext.getHost…vice().user().currentUser");
                if (a != null) {
                    jVar.mo51187a("user_id", a.getId());
                }
                C4414af afVar = new C4414af(jVar.mo51184a(), "", 17, 0, 0, 8);
                afVar.f12832h = true;
                C9097a.m27146a().mo22267a((Object) afVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$d */
    static final class C5495d<T> implements C7326g<C4035e> {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f16334a;

        C5495d(PokemonWidget pokemonWidget) {
            this.f16334a = pokemonWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C4035e eVar) {
            PokemonWidget pokemonWidget = this.f16334a;
            C7573i.m23582a((Object) eVar, "it");
            pokemonWidget.onEvent(eVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$e */
    public static final class C5496e implements C9129a {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f16335a;

        /* renamed from: a */
        private final void m17759a() {
            C9049ap.m27022a((int) R.string.fc7);
            this.f16335a.dataCenter.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new C4425aq(1, (String) this.f16335a.dataCenter.get("log_enter_live_source"), "pokemon"));
        }

        C5496e(PokemonWidget pokemonWidget) {
            this.f16335a = pokemonWidget;
        }

        /* renamed from: b */
        public final void mo13976b(Throwable th) {
            C7573i.m23587b(th, "error");
            C9076n.m27095a(this.f16335a.context, th);
        }

        /* renamed from: c */
        public final void mo13977c(Throwable th) {
            C7573i.m23587b(th, "error");
            C9076n.m27095a(this.f16335a.context, th);
        }

        /* renamed from: a */
        public final void mo13973a(C4859j jVar) {
            C7573i.m23587b(jVar, "pokemonInfo");
            if (jVar.f13893a && this.f16335a.isViewValid) {
                View view = this.f16335a.contentView;
                if (view != null) {
                    ((ImageView) view).setBackground(null);
                    C5343e.m17030a((ImageView) this.f16335a.contentView, jVar.f13902j);
                    ViewGroup viewGroup = this.f16335a.containerView;
                    C7573i.m23582a((Object) viewGroup, "containerView");
                    viewGroup.setVisibility(0);
                    this.f16335a.mo13970a(jVar.f13901i);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
            }
        }

        /* renamed from: b */
        private final void m17760b(C8158m mVar) {
            String str;
            this.f16335a.dataCenter.get("log_enter_live_source");
            this.f16335a.mo13969a().getUserFrom();
            C7285c.m22838a(this.f16335a.context, "feed_live_span", 0).getInt("span_count", 0);
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(mVar.f22320x)) {
                String str2 = mVar.f22320x;
                C7573i.m23582a((Object) str2, "result.giftType");
                hashMap.put("request_page", str2);
            }
            C8443c a = C8443c.m25663a();
            String str3 = "send_gift";
            Map map = hashMap;
            Object[] objArr = new Object[3];
            C8438j jVar = new C8438j();
            if (this.f16335a.f16329c) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr[0] = jVar.mo21598a(str).mo21600c("bottom_tab").mo21599b("live_interact").mo21603f("other");
            objArr[1] = Room.class;
            objArr[2] = ((IGiftService) C3596c.m13172a(IGiftService.class)).getSendGiftResultLog(mVar);
            a.mo21606a(str3, map, objArr);
        }

        /* renamed from: a */
        public final void mo13974a(C8158m mVar) {
            if (mVar != null && this.f16335a.isViewValid) {
                C3693c walletCenter = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter();
                C7573i.m23582a((Object) walletCenter, "ServiceManager.getServic…          .walletCenter()");
                walletCenter.mo11154a(mVar.f22299c);
                if (C9038ag.m26996a() != null && this.f16335a.isViewValid) {
                    C9038ag.m26996a().insertMessage(((IGiftService) C3596c.m13172a(IGiftService.class)).getGiftMessage(this.f16335a.mo13969a().getId(), mVar, (User) this.f16335a.dataCenter.get("data_user_in_room")));
                }
                m17760b(mVar);
                this.f16335a.dataCenter.lambda$put$1$DataCenter("cmd_close_h5_dialog", new Object());
                PokemonViewModel pokemonViewModel = this.f16335a.f16327a;
                if (pokemonViewModel != null) {
                    pokemonViewModel.mo22329b(mVar.f22301e);
                }
            }
        }

        /* renamed from: a */
        public final void mo13975a(Throwable th) {
            C7573i.m23587b(th, "error");
            if (th instanceof SendGiftFailException) {
                m17759a();
            } else if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                if (40001 == apiServerException.getErrorCode()) {
                    m17759a();
                } else {
                    C9049ap.m27028a(apiServerException.getPrompt());
                }
            } else {
                C9049ap.m27022a((int) R.string.es1);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PokemonWidget$f */
    static final class C5497f<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ PokemonWidget f16336a;

        C5497f(PokemonWidget pokemonWidget) {
            this.f16336a = pokemonWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            PokemonViewModel pokemonViewModel = this.f16336a.f16327a;
            if (pokemonViewModel != null) {
                User owner = this.f16336a.mo13969a().getOwner();
                C7573i.m23582a((Object) owner, "mRoom.owner");
                pokemonViewModel.mo22326a(owner.getId());
            }
        }
    }

    public final int getLayoutId() {
        return R.layout.au8;
    }

    /* renamed from: a */
    public final Room mo13969a() {
        Room room = this.f16328b;
        if (room == null) {
            C7573i.m23583a("mRoom");
        }
        return room;
    }

    public final void onUnload() {
        ViewGroup viewGroup = this.containerView;
        C7573i.m23582a((Object) viewGroup, "containerView");
        viewGroup.setVisibility(8);
        this.dataCenter.removeObserver(this.f16330e);
    }

    public final void onInit(Object[] objArr) {
        this.contentView.setOnClickListener(new C5494c(this));
    }

    /* renamed from: a */
    public final void mo13970a(int i) {
        if (i <= 0) {
            i = 30;
        }
        ((C3245ad) C7492s.m23295b((long) (i * 1000), TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C5497f<Object>(this));
    }

    public final void onEvent(C4035e eVar) {
        C7573i.m23587b(eVar, "event");
        if (((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(eVar.f12014a) != null) {
            PokemonViewModel pokemonViewModel = this.f16327a;
            if (pokemonViewModel != null) {
                Object obj = this.dataCenter.get("log_enter_live_source");
                C7573i.m23582a(obj, "dataCenter.get(WidgetCon…nt.LOG_ENTER_LIVE_SOURCE)");
                pokemonViewModel.mo22328a((String) obj, eVar.f12014a, null, 1, "pokemon_task");
            }
        }
    }

    public final void onLoad(Object[] objArr) {
        ViewGroup viewGroup = this.containerView;
        C7573i.m23582a((Object) viewGroup, "containerView");
        viewGroup.setVisibility(8);
        C9097a.m27146a().mo22266a(C4035e.class).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C5495d<Object>(this));
        Object obj = this.dataCenter.get("data_room");
        C7573i.m23582a(obj, "dataCenter.get(WidgetConstant.DATA_ROOM)");
        this.f16328b = (Room) obj;
        Object obj2 = this.dataCenter.get("data_is_anchor");
        C7573i.m23582a(obj2, "dataCenter.get(WidgetConstant.DATA_IS_ANCHOR)");
        this.f16329c = ((Boolean) obj2).booleanValue();
        Room room = this.f16328b;
        if (room == null) {
            C7573i.m23583a("mRoom");
        }
        this.f16327a = new PokemonViewModel(room, this.f16331f);
        long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        if (b > 0) {
            PokemonViewModel pokemonViewModel = this.f16327a;
            if (pokemonViewModel != null) {
                Room room2 = this.f16328b;
                if (room2 == null) {
                    C7573i.m23583a("mRoom");
                }
                User owner = room2.getOwner();
                C7573i.m23582a((Object) owner, "mRoom.owner");
                pokemonViewModel.mo22327a(owner.getId(), b);
            }
        } else {
            PokemonViewModel pokemonViewModel2 = this.f16327a;
            if (pokemonViewModel2 != null) {
                Room room3 = this.f16328b;
                if (room3 == null) {
                    C7573i.m23583a("mRoom");
                }
                User owner2 = room3.getOwner();
                C7573i.m23582a((Object) owner2, "mRoom.owner");
                long id = owner2.getId();
                Room room4 = this.f16328b;
                if (room4 == null) {
                    C7573i.m23583a("mRoom");
                }
                User owner3 = room4.getOwner();
                C7573i.m23582a((Object) owner3, "mRoom.owner");
                pokemonViewModel2.mo22327a(id, owner3.getId());
            }
        }
        this.dataCenter.observe("data_link_state", this.f16330e);
    }
}
