package com.bytedance.android.livesdk.banner;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.BannerRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.C4899c;
import com.bytedance.android.livesdk.message.model.C8496av;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p354j.C47844a;

public final class InRoomBannerManager implements C0042h, OnMessageListener {

    /* renamed from: d */
    public static final C3923a f11744d = new C3923a(null);

    /* renamed from: a */
    public long f11745a = -1;

    /* renamed from: b */
    public boolean f11746b;

    /* renamed from: c */
    public final C47844a<C3924b> f11747c;

    /* renamed from: e */
    private final C0043i f11748e;

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$a */
    static final class C3923a {
        private C3923a() {
        }

        public /* synthetic */ C3923a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$b */
    public static final class C3924b {

        /* renamed from: a */
        public final long f11749a;

        /* renamed from: b */
        public final C4899c f11750b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3924b) {
                    C3924b bVar = (C3924b) obj;
                    if (!(this.f11749a == bVar.f11749a) || !C7573i.m23585a((Object) this.f11750b, (Object) bVar.f11750b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f11749a) * 31;
            C4899c cVar = this.f11750b;
            return hashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(roomId=");
            sb.append(this.f11749a);
            sb.append(", data=");
            sb.append(this.f11750b);
            sb.append(")");
            return sb.toString();
        }

        public C3924b(long j, C4899c cVar) {
            C7573i.m23587b(cVar, "data");
            this.f11749a = j;
            this.f11750b = cVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$c */
    static final class C3925c<T> implements C7326g<C3479d<C4899c>> {

        /* renamed from: a */
        final /* synthetic */ InRoomBannerManager f11751a;

        /* renamed from: b */
        final /* synthetic */ long f11752b;

        C3925c(InRoomBannerManager inRoomBannerManager, long j) {
            this.f11751a = inRoomBannerManager;
            this.f11752b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C4899c> dVar) {
            C47844a<C3924b> aVar = this.f11751a.f11747c;
            long j = this.f11752b;
            Object obj = dVar.data;
            C7573i.m23582a(obj, "response.data");
            aVar.onNext(new C3924b(j, (C4899c) obj));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$d */
    static final class C3926d<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C3926d f11753a = new C3926d();

        C3926d() {
        }

        /* renamed from: a */
        private static void m13827a(Throwable th) {
            C3166a.m11963b("InRoomBannerManager", th);
        }

        public final /* synthetic */ void accept(Object obj) {
            m13827a((Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$e */
    static final class C3927e<T> implements C7326g<C3479d<C4899c>> {

        /* renamed from: a */
        final /* synthetic */ InRoomBannerManager f11754a;

        /* renamed from: b */
        final /* synthetic */ long f11755b;

        C3927e(InRoomBannerManager inRoomBannerManager, long j) {
            this.f11754a = inRoomBannerManager;
            this.f11755b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C4899c> dVar) {
            C47844a<C3924b> aVar = this.f11754a.f11747c;
            long j = this.f11755b;
            Object obj = dVar.data;
            C7573i.m23582a(obj, "response.data");
            aVar.onNext(new C3924b(j, (C4899c) obj));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$f */
    static final class C3928f<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C3928f f11756a = new C3928f();

        C3928f() {
        }

        /* renamed from: a */
        private static void m13829a(Throwable th) {
            C3166a.m11963b("InRoomBannerManager", th);
        }

        public final /* synthetic */ void accept(Object obj) {
            m13829a((Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$g */
    static final class C3929g<T> implements C7328l<C3924b> {

        /* renamed from: a */
        final /* synthetic */ Long f11757a;

        C3929g(Long l) {
            this.f11757a = l;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo9283a(C3924b bVar) {
            C7573i.m23587b(bVar, "data");
            long j = bVar.f11749a;
            Long l = this.f11757a;
            if (l != null && j == l.longValue()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.banner.InRoomBannerManager$h */
    static final class C3930h<T> implements C7326g<Integer> {

        /* renamed from: a */
        final /* synthetic */ InRoomBannerManager f11758a;

        C3930h(InRoomBannerManager inRoomBannerManager) {
            this.f11758a = inRoomBannerManager;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Integer num) {
            this.f11758a.mo11476b(this.f11758a.f11745a, this.f11758a.f11746b);
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        IMessageManager a = C9038ag.m26996a();
        if (a != null) {
            a.removeMessageListener(this);
        }
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
        IMessageManager a = C9038ag.m26996a();
        if (a != null) {
            a.addMessageListener(MessageType.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType(), this);
        }
    }

    /* renamed from: a */
    public final C7492s<C3924b> mo11475a(Long l) {
        C7492s<C3924b> a = this.f11747c.mo19291a((C7328l<? super T>) new C3929g<Object>(l));
        C7573i.m23582a((Object) a, "bannerSubject.filter { d…> data.roomId == roomId }");
        return a;
    }

    public InRoomBannerManager(C0043i iVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        this.f11748e = iVar;
        C47844a<C3924b> a = C47844a.m148742a();
        C7573i.m23582a((Object) a, "BehaviorSubject.create<Data>()");
        this.f11747c = a;
        this.f11748e.getLifecycle().mo55a(this);
    }

    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && iMessage.getIntType() == MessageType.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType() && (iMessage instanceof C8496av)) {
            C8496av avVar = (C8496av) iMessage;
            if (avVar.f23283a > 0) {
                ((C3245ad) C7492s.m23301b(Integer.valueOf(1)).mo19320e((long) new Random().nextInt(avVar.f23283a), TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19304b(C47549a.m148327a()).mo19316d((C7326g<? super T>) new C3930h<Object>(this)).mo19297a((C7494t<T, ? extends R>) C3255e.m12293a(this.f11748e))).mo10181a();
            }
        }
    }

    /* renamed from: b */
    public final void mo11476b(long j, boolean z) {
        int i;
        BannerRetrofitApi bannerRetrofitApi = (BannerRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(BannerRetrofitApi.class);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        ((C3245ad) bannerRetrofitApi.queryLiveRoomBanner(j, i).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12293a(this.f11748e))).mo10183a(new C3927e(this, j), C3928f.f11756a);
    }

    /* renamed from: a */
    public final C7492s<C3924b> mo11474a(long j, boolean z) {
        int i;
        if (j == this.f11745a) {
            return mo11475a(Long.valueOf(j));
        }
        this.f11745a = j;
        this.f11746b = z;
        BannerRetrofitApi bannerRetrofitApi = (BannerRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(BannerRetrofitApi.class);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        ((C3245ad) bannerRetrofitApi.queryLiveRoomBanner(j, i).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12293a(this.f11748e))).mo10183a(new C3925c(this, j), C3926d.f11753a);
        return mo11475a(Long.valueOf(j));
    }
}
