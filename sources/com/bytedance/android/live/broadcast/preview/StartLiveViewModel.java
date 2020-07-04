package com.bytedance.android.live.broadcast.preview;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.content.Context;
import android.os.Message;
import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.model.C2750b;
import com.bytedance.android.live.broadcast.model.C2755e;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.preview.p139a.C2848a;
import com.bytedance.android.live.broadcast.preview.p139a.p140a.C2849a;
import com.bytedance.android.live.broadcast.preview.p139a.p140a.C2851c;
import com.bytedance.android.live.broadcast.preview.p139a.p140a.C2852d;
import com.bytedance.android.live.broadcast.preview.p139a.p140a.C2854e;
import com.bytedance.android.live.broadcast.preview.p139a.p140a.C2855f;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.network.response.C3480e;
import com.bytedance.android.livesdk.chatroom.model.C4884aq;
import com.bytedance.android.livesdkapi.C9402f.C9404b;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9349d;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import java.util.ArrayList;
import java.util.HashMap;
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
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public final class StartLiveViewModel extends C0063u {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f9015a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "liveParamsListener", "getLiveParamsListener()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "roomCreateInfo", "getRoomCreateInfo()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "locationChoose", "getLocationChoose()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "titleMaxCount", "getTitleMaxCount()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "liveMode", "getLiveMode()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "cameraType", "getCameraType()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "currentGame", "getCurrentGame()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "titleType", "getTitleType()Lcom/bytedance/ies/sdk/widgets/NextLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "title", "getTitle()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "cover", "getCover()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "roomTag", "getRoomTag()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "isCommodity", "isCommodity()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "douPlus", "getDouPlus()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "verifyParams", "getVerifyParams()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "startLiveStatus", "getStartLiveStatus()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "room", "getRoom()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveViewModel.class), "banUserInfoResult", "getBanUserInfoResult()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: c */
    public static final C2824a f9016c = new C2824a(null);

    /* renamed from: b */
    public C2848a f9017b;

    /* renamed from: d */
    private C7321c f9018d;

    /* renamed from: e */
    private C7321c f9019e;

    /* renamed from: f */
    private final C7541d f9020f = C7546e.m23569a(C2834k.f9047a);

    /* renamed from: g */
    private final C7541d f9021g = C7546e.m23569a(C2839p.f9052a);

    /* renamed from: h */
    private final C7541d f9022h = C7546e.m23569a(C2835l.f9048a);

    /* renamed from: i */
    private final C7541d f9023i = C7546e.m23569a(C2843t.f9056a);

    /* renamed from: j */
    private final C7541d f9024j = C7546e.m23569a(C2833j.f9046a);

    /* renamed from: k */
    private final C7541d f9025k = C7546e.m23569a(C2826c.f9039a);

    /* renamed from: l */
    private final C7541d f9026l = C7546e.m23569a(C2830g.f9043a);

    /* renamed from: m */
    private final C7541d f9027m = C7546e.m23569a(C2844u.f9057a);

    /* renamed from: n */
    private final C7541d f9028n = C7546e.m23569a(C2842s.f9055a);

    /* renamed from: o */
    private final C7541d f9029o = C7546e.m23569a(C2827d.f9040a);

    /* renamed from: p */
    private final C7541d f9030p = C7546e.m23569a(C2840q.f9053a);

    /* renamed from: q */
    private final C7541d f9031q = C7546e.m23569a(C2832i.f9045a);

    /* renamed from: r */
    private final C7541d f9032r = C7546e.m23569a(C2831h.f9044a);

    /* renamed from: s */
    private final C7541d f9033s = C7546e.m23569a(C2845v.f9058a);

    /* renamed from: t */
    private final C7541d f9034t = C7546e.m23569a(C2841r.f9054a);

    /* renamed from: u */
    private final C7541d f9035u = C7546e.m23569a(C2838o.f9051a);

    /* renamed from: v */
    private final C7541d f9036v = C7546e.m23569a(C2825b.f9038a);

    /* renamed from: w */
    private C2848a f9037w;

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$a */
    public static final class C2824a {
        private C2824a() {
        }

        public /* synthetic */ C2824a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Message m11335a(int i, Object obj) {
            Message message = new Message();
            message.what = i;
            message.obj = obj;
            return message;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$b */
    static final class C2825b extends Lambda implements C7561a<C0052o<C3479d<C2750b>>> {

        /* renamed from: a */
        public static final C2825b f9038a = new C2825b();

        C2825b() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C3479d<C2750b>> m11336a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m11336a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$c */
    static final class C2826c extends Lambda implements C7561a<C0052o<Integer>> {

        /* renamed from: a */
        public static final C2826c f9039a = new C2826c();

        C2826c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11337a();
        }

        /* renamed from: a */
        private static C0052o<Integer> m11337a() {
            C0052o<Integer> oVar = new C0052o<>();
            oVar.setValue(Integer.valueOf(1));
            return oVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$d */
    static final class C2827d extends Lambda implements C7561a<C0052o<String>> {

        /* renamed from: a */
        public static final C2827d f9040a = new C2827d();

        C2827d() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<String> m11338a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m11338a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$e */
    static final class C2828e<T> implements C7326g<C3480e<Room>> {

        /* renamed from: a */
        final /* synthetic */ StartLiveViewModel f9041a;

        C2828e(StartLiveViewModel startLiveViewModel) {
            this.f9041a = startLiveViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3480e<Room> eVar) {
            this.f9041a.mo9607n().setValue(C2824a.m11335a(3, eVar.f10307b));
            C2848a aVar = this.f9041a.f9017b;
            if (aVar != null) {
                aVar.mo9613a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$f */
    static final class C2829f<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ StartLiveViewModel f9042a;

        C2829f(StartLiveViewModel startLiveViewModel) {
            this.f9042a = startLiveViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            this.f9042a.mo9607n().setValue(C2824a.m11335a(4, th));
            C2848a aVar = this.f9042a.f9017b;
            if (aVar != null) {
                aVar.mo9613a();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$g */
    static final class C2830g extends Lambda implements C7561a<C0052o<Game>> {

        /* renamed from: a */
        public static final C2830g f9043a = new C2830g();

        C2830g() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Game> m11341a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m11341a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$h */
    static final class C2831h extends Lambda implements C7561a<C0052o<DouPlusEntry>> {

        /* renamed from: a */
        public static final C2831h f9044a = new C2831h();

        C2831h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11342a();
        }

        /* renamed from: a */
        private static C0052o<DouPlusEntry> m11342a() {
            C0052o<DouPlusEntry> oVar = new C0052o<>();
            oVar.setValue(DouPlusEntry.defaultOne());
            return oVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$i */
    static final class C2832i extends Lambda implements C7561a<C0052o<Boolean>> {

        /* renamed from: a */
        public static final C2832i f9045a = new C2832i();

        C2832i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11343a();
        }

        /* renamed from: a */
        private static C0052o<Boolean> m11343a() {
            C0052o<Boolean> oVar = new C0052o<>();
            oVar.setValue(Boolean.valueOf(false));
            return oVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$j */
    static final class C2833j extends Lambda implements C7561a<C0052o<LiveMode>> {

        /* renamed from: a */
        public static final C2833j f9046a = new C2833j();

        C2833j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11344a();
        }

        /* renamed from: a */
        private static C0052o<LiveMode> m11344a() {
            C0052o<LiveMode> oVar = new C0052o<>();
            oVar.setValue(LiveMode.VIDEO);
            return oVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$k */
    static final class C2834k extends Lambda implements C7561a<C0052o<C9349d>> {

        /* renamed from: a */
        public static final C2834k f9047a = new C2834k();

        C2834k() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<C9349d> m11345a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m11345a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$l */
    static final class C2835l extends Lambda implements C7561a<NextLiveData<Boolean>> {

        /* renamed from: a */
        public static final C2835l f9048a = new C2835l();

        C2835l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11346a();
        }

        /* renamed from: a */
        private static NextLiveData<Boolean> m11346a() {
            NextLiveData<Boolean> nextLiveData = new NextLiveData<>();
            nextLiveData.setValue(Boolean.valueOf(false));
            return nextLiveData;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$m */
    static final class C2836m<T> implements C7326g<C3479d<C2750b>> {

        /* renamed from: a */
        final /* synthetic */ StartLiveViewModel f9049a;

        C2836m(StartLiveViewModel startLiveViewModel) {
            this.f9049a = startLiveViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C2750b> dVar) {
            this.f9049a.mo9609p().postValue(dVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$n */
    static final class C2837n<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C2837n f9050a = new C2837n();

        C2837n() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m11348a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m11348a(Throwable th) {
            C7573i.m23582a((Object) th, "it");
            C3166a.m11955a(6, "StartLiveViewModel", th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$o */
    static final class C2838o extends Lambda implements C7561a<C0052o<Room>> {

        /* renamed from: a */
        public static final C2838o f9051a = new C2838o();

        C2838o() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Room> m11349a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m11349a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$p */
    static final class C2839p extends Lambda implements C7561a<NextLiveData<C2755e>> {

        /* renamed from: a */
        public static final C2839p f9052a = new C2839p();

        C2839p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11350a();
        }

        /* renamed from: a */
        private static NextLiveData<C2755e> m11350a() {
            NextLiveData<C2755e> nextLiveData = new NextLiveData<>();
            nextLiveData.setValue(new C2755e());
            return nextLiveData;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$q */
    static final class C2840q extends Lambda implements C7561a<C0052o<C4884aq>> {

        /* renamed from: a */
        public static final C2840q f9053a = new C2840q();

        C2840q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11351a();
        }

        /* renamed from: a */
        private static C0052o<C4884aq> m11351a() {
            C0052o<C4884aq> oVar = new C0052o<>();
            oVar.setValue(new C4884aq());
            return oVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$r */
    static final class C2841r extends Lambda implements C7561a<C0052o<Message>> {

        /* renamed from: a */
        public static final C2841r f9054a = new C2841r();

        C2841r() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Message> m11352a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m11352a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$s */
    static final class C2842s extends Lambda implements C7561a<C0052o<String>> {

        /* renamed from: a */
        public static final C2842s f9055a = new C2842s();

        C2842s() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11353a();
        }

        /* renamed from: a */
        private static C0052o<String> m11353a() {
            C0052o<String> oVar = new C0052o<>();
            oVar.setValue("");
            return oVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$t */
    static final class C2843t extends Lambda implements C7561a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C2843t f9056a = new C2843t();

        C2843t() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11354a();
        }

        /* renamed from: a */
        private static NextLiveData<Integer> m11354a() {
            NextLiveData<Integer> nextLiveData = new NextLiveData<>();
            nextLiveData.setValue(Integer.valueOf(20));
            return nextLiveData;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$u */
    static final class C2844u extends Lambda implements C7561a<NextLiveData<Integer>> {

        /* renamed from: a */
        public static final C2844u f9057a = new C2844u();

        C2844u() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11355a();
        }

        /* renamed from: a */
        private static NextLiveData<Integer> m11355a() {
            NextLiveData<Integer> nextLiveData = new NextLiveData<>();
            nextLiveData.setValue(Integer.valueOf(0));
            return nextLiveData;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveViewModel$v */
    static final class C2845v extends Lambda implements C7561a<C0052o<HashMap<String, String>>> {

        /* renamed from: a */
        public static final C2845v f9058a = new C2845v();

        C2845v() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m11356a();
        }

        /* renamed from: a */
        private static C0052o<HashMap<String, String>> m11356a() {
            C0052o<HashMap<String, String>> oVar = new C0052o<>();
            oVar.setValue(new HashMap());
            return oVar;
        }
    }

    /* renamed from: a */
    public final NextLiveData<C2755e> mo9592a() {
        return (NextLiveData) this.f9021g.getValue();
    }

    /* renamed from: b */
    public final NextLiveData<Boolean> mo9595b() {
        return (NextLiveData) this.f9022h.getValue();
    }

    /* renamed from: c */
    public final NextLiveData<Integer> mo9596c() {
        return (NextLiveData) this.f9023i.getValue();
    }

    /* renamed from: d */
    public final C0052o<LiveMode> mo9597d() {
        return (C0052o) this.f9024j.getValue();
    }

    /* renamed from: e */
    public final C0052o<Integer> mo9598e() {
        return (C0052o) this.f9025k.getValue();
    }

    /* renamed from: f */
    public final C0052o<Game> mo9599f() {
        return (C0052o) this.f9026l.getValue();
    }

    /* renamed from: g */
    public final NextLiveData<Integer> mo9600g() {
        return (NextLiveData) this.f9027m.getValue();
    }

    /* renamed from: h */
    public final C0052o<String> mo9601h() {
        return (C0052o) this.f9028n.getValue();
    }

    /* renamed from: i */
    public final C0052o<String> mo9602i() {
        return (C0052o) this.f9029o.getValue();
    }

    /* renamed from: j */
    public final C0052o<C4884aq> mo9603j() {
        return (C0052o) this.f9030p.getValue();
    }

    /* renamed from: k */
    public final C0052o<Boolean> mo9604k() {
        return (C0052o) this.f9031q.getValue();
    }

    /* renamed from: l */
    public final C0052o<DouPlusEntry> mo9605l() {
        return (C0052o) this.f9032r.getValue();
    }

    /* renamed from: m */
    public final C0052o<HashMap<String, String>> mo9606m() {
        return (C0052o) this.f9033s.getValue();
    }

    /* renamed from: n */
    public final C0052o<Message> mo9607n() {
        return (C0052o) this.f9034t.getValue();
    }

    /* renamed from: o */
    public final C0052o<Room> mo9608o() {
        return (C0052o) this.f9035u.getValue();
    }

    /* renamed from: p */
    public final C0052o<C3479d<C2750b>> mo9609p() {
        return (C0052o) this.f9036v.getValue();
    }

    /* renamed from: q */
    public final void mo9610q() {
        mo9607n().postValue(C2824a.m11335a(0, null));
        C2848a aVar = this.f9037w;
        if (aVar != null) {
            aVar.mo9613a();
        }
    }

    public final void onCleared() {
        super.onCleared();
        C7321c cVar = this.f9019e;
        if (cVar != null && !cVar.isDisposed()) {
            C7321c cVar2 = this.f9019e;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
        this.f9019e = null;
        C7321c cVar3 = this.f9018d;
        if (cVar3 != null && !cVar3.isDisposed()) {
            C7321c cVar4 = this.f9018d;
            if (cVar4 != null) {
                cVar4.dispose();
            }
        }
        this.f9018d = null;
    }

    /* renamed from: r */
    public final void mo9611r() {
        this.f9018d = C2515f.m10417f().mo9076c().mo9167b().getBanUserInfo().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2836m<Object>(this), (C7326g<? super Throwable>) C2837n.f9050a);
    }

    /* renamed from: a */
    public final void mo9594a(HashMap<String, String> hashMap) {
        C7573i.m23587b(hashMap, "params");
        this.f9019e = C2515f.m10417f().mo9076c().mo9169d().createRoom(hashMap).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2828e<Object>(this), (C7326g<? super Throwable>) new C2829f<Object>(this));
    }

    /* renamed from: a */
    public final void mo9593a(Context context, StartLiveViewModel startLiveViewModel, StartLiveEventViewModel startLiveEventViewModel) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(startLiveViewModel, "viewModel");
        C7573i.m23587b(startLiveEventViewModel, "eventViewModel");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2849a());
        C2855f fVar = new C2855f();
        fVar.mo9619a(startLiveViewModel, startLiveEventViewModel);
        arrayList.add(fVar);
        C2854e eVar = new C2854e();
        eVar.mo9618a(startLiveViewModel, startLiveEventViewModel);
        arrayList.add(eVar);
        C2852d dVar = new C2852d();
        dVar.mo9617a(startLiveViewModel);
        arrayList.add(dVar);
        this.f9037w = new C2848a(0, arrayList, new C9404b(context, null));
        ArrayList arrayList2 = new ArrayList();
        C2851c cVar = new C2851c();
        cVar.mo9616a(startLiveViewModel);
        arrayList2.add(cVar);
        this.f9017b = new C2848a(0, arrayList2, new C9404b(context, null));
    }
}
