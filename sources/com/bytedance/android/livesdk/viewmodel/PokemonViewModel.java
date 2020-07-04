package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.api.PokemonApi;
import com.bytedance.android.livesdk.chatroom.model.C4885ar;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4859j;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.utils.p426b.C9058c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public final class PokemonViewModel extends RxViewModel {

    /* renamed from: a */
    public PokemonApi f24832a;

    /* renamed from: b */
    public final Room f24833b;

    /* renamed from: c */
    public final C9129a f24834c;

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$a */
    public interface C9129a {
        /* renamed from: a */
        void mo13973a(C4859j jVar);

        /* renamed from: a */
        void mo13974a(C8158m mVar);

        /* renamed from: a */
        void mo13975a(Throwable th);

        /* renamed from: b */
        void mo13976b(Throwable th);

        /* renamed from: c */
        void mo13977c(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$b */
    static final class C9130b<T> implements C7326g<C3479d<C4859j>> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f24835a;

        C9130b(PokemonViewModel pokemonViewModel) {
            this.f24835a = pokemonViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C4859j> dVar) {
            C4859j jVar;
            C9129a aVar = this.f24835a.f24834c;
            if (dVar != null) {
                jVar = (C4859j) dVar.data;
            } else {
                jVar = null;
            }
            if (jVar == null) {
                C7573i.m23580a();
            }
            aVar.mo13973a(jVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$c */
    static final class C9131c<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f24836a;

        C9131c(PokemonViewModel pokemonViewModel) {
            this.f24836a = pokemonViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C9129a aVar = this.f24836a.f24834c;
            C7573i.m23582a((Object) th, "error");
            aVar.mo13976b(th);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$d */
    static final class C9132d<T> implements C7326g<C3479d<C8158m>> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f24837a;

        /* renamed from: b */
        final /* synthetic */ String f24838b;

        C9132d(PokemonViewModel pokemonViewModel, String str) {
            this.f24837a = pokemonViewModel;
            this.f24838b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C8158m> dVar) {
            PokemonViewModel pokemonViewModel = this.f24837a;
            ((C8158m) dVar.data).f22320x = this.f24838b;
            C9129a aVar = pokemonViewModel.f24834c;
            if (aVar != null) {
                aVar.mo13974a((C8158m) dVar.data);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$e */
    static final class C9133e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f24839a;

        C9133e(PokemonViewModel pokemonViewModel) {
            this.f24839a = pokemonViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C9129a aVar = this.f24839a.f24834c;
            C7573i.m23582a((Object) th, "error");
            aVar.mo13975a(th);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$f */
    static final class C9134f<T> implements C7326g<C3479d<C4885ar>> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f24840a;

        C9134f(PokemonViewModel pokemonViewModel) {
            this.f24840a = pokemonViewModel;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
            if (r3.f13995a == 1) goto L_0x001f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(com.bytedance.android.live.network.response.C3479d<com.bytedance.android.livesdk.chatroom.model.C4885ar> r3) {
            /*
                r2 = this;
                com.bytedance.android.livesdk.viewmodel.PokemonViewModel r0 = r2.f24840a
                if (r3 == 0) goto L_0x0010
                java.lang.Object r3 = r3.data
                com.bytedance.android.livesdk.chatroom.model.ar r3 = (com.bytedance.android.livesdk.chatroom.model.C4885ar) r3
                if (r3 == 0) goto L_0x0010
                int r3 = r3.f13995a
                r1 = 1
                if (r3 != r1) goto L_0x0010
                goto L_0x001f
            L_0x0010:
                com.bytedance.android.livesdk.viewmodel.PokemonViewModel$a r3 = r0.f24834c
                if (r3 == 0) goto L_0x001f
                com.bytedance.android.livesdk.gift.mvp.SendGiftFailException r0 = new com.bytedance.android.livesdk.gift.mvp.SendGiftFailException
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r3.mo13977c(r0)
                return
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.PokemonViewModel.C9134f.accept(com.bytedance.android.live.network.response.d):void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$g */
    static final class C9135g<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f24841a;

        C9135g(PokemonViewModel pokemonViewModel) {
            this.f24841a = pokemonViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C9129a aVar = this.f24841a.f24834c;
            if (aVar != null) {
                C7573i.m23582a((Object) th, "error");
                aVar.mo13977c(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$h */
    static final class C9136h<T> implements C7326g<C3479d<Object>> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f24842a;

        C9136h(PokemonViewModel pokemonViewModel) {
            this.f24842a = pokemonViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<Object> dVar) {
            C3166a.m11961b("PokemonViewModel", "trigger pokemon message success");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.PokemonViewModel$i */
    static final class C9137i<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PokemonViewModel f24843a;

        C9137i(PokemonViewModel pokemonViewModel) {
            this.f24843a = pokemonViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            StringBuilder sb = new StringBuilder("trigger pokemon message failed, ");
            sb.append(th.getMessage());
            C3166a.m11966e("PokemonViewModel", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo22326a(long j) {
        mo10158a(((C9057b) this.f24832a.showPokemonTip(j).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22249a(3).mo19280a((C7326g<? super T>) new C9136h<Object>(this), (C7326g<? super Throwable>) new C9137i<Object>(this)));
    }

    /* renamed from: b */
    public final void mo22329b(long j) {
        PokemonApi pokemonApi = this.f24832a;
        User owner = this.f24833b.getOwner();
        C7573i.m23582a((Object) owner, "room.owner");
        mo10158a(((C9057b) pokemonApi.sendPokemon(owner.getId(), j, this.f24833b.getId()).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22249a(3).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C9134f<Object>(this), (C7326g<? super Throwable>) new C9135g<Object>(this)));
    }

    public PokemonViewModel(Room room, C9129a aVar) {
        C7573i.m23587b(room, "room");
        C7573i.m23587b(aVar, "callback");
        this.f24833b = room;
        this.f24834c = aVar;
        Object a = C9178j.m27302j().mo22373b().mo10440a(PokemonApi.class);
        C7573i.m23582a(a, "LiveInternalService.inst…e(PokemonApi::class.java)");
        this.f24832a = (PokemonApi) a;
    }

    /* renamed from: a */
    public final void mo22327a(long j, long j2) {
        mo10158a(((C9057b) this.f24832a.getPokemonInfo(j, j2).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22249a(3).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C9130b<Object>(this), (C7326g<? super Throwable>) new C9131c<Object>(this)));
    }

    /* renamed from: a */
    public final void mo22328a(String str, long j, User user, int i, String str2) {
        C7573i.m23587b(str, "enterLiveSource");
        if (((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(j) != null) {
            IGiftService iGiftService = (IGiftService) C3596c.m13172a(IGiftService.class);
            long id = this.f24833b.getId();
            User owner = this.f24833b.getOwner();
            C7573i.m23582a((Object) owner, "room.owner");
            mo10158a(iGiftService.sendGift(j, id, owner.getId(), 1).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19293a(C3303k.m12371a((RxViewModel) this)).mo19280a((C7326g<? super T>) new C9132d<Object>(this, str2), (C7326g<? super Throwable>) new C9133e<Object>(this)));
        }
    }
}
