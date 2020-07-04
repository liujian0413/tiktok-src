package com.bytedance.android.livesdk.viewmodel;

import android.arch.lifecycle.C0063u;
import com.bytedance.android.live.core.rxutils.C3299h;
import com.bytedance.android.live.core.rxutils.C3302j;
import com.bytedance.android.live.core.rxutils.C3306n;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.LotteryApi;
import com.bytedance.android.livesdk.chatroom.model.C4924t;
import com.bytedance.android.livesdk.chatroom.model.C4925u;
import com.bytedance.android.livesdk.chatroom.model.C4926v;
import com.bytedance.android.livesdk.log.C8444d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

public final class LotteryViewModel extends C0063u {

    /* renamed from: a */
    public final C9143f f24818a = new C9143f();

    /* renamed from: b */
    public final C47562b f24819b = new C47562b();

    /* renamed from: c */
    private final C47562b f24820c = new C47562b();

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$a */
    static final class C9123a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C9123a f24822a = new C9123a();

        C9123a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m27178a((C3479d) obj));
        }

        /* renamed from: a */
        private static boolean m27178a(C3479d<C4925u> dVar) {
            C7573i.m23587b(dVar, "it");
            C4925u uVar = (C4925u) dVar.data;
            if (uVar == null) {
                return false;
            }
            List<Object> list = uVar.f14084b;
            if (list == null || list.isEmpty()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$b */
    static final class C9124b<T, R> implements C7327h<Throwable, Boolean> {

        /* renamed from: a */
        public static final C9124b f24823a = new C9124b();

        C9124b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m27179a((Throwable) obj));
        }

        /* renamed from: a */
        private static boolean m27179a(Throwable th) {
            C7573i.m23587b(th, "t");
            C8444d.m25673b();
            C8444d.m11969a(6, th.getStackTrace());
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$c */
    static final class C9125c<T> implements C7326g<C3479d<C4924t>> {

        /* renamed from: a */
        final /* synthetic */ LotteryViewModel f24824a;

        /* renamed from: b */
        final /* synthetic */ long f24825b;

        C9125c(LotteryViewModel lotteryViewModel, long j) {
            this.f24824a = lotteryViewModel;
            this.f24825b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C4924t> dVar) {
            if (dVar != null) {
                C4924t tVar = (C4924t) dVar.data;
                if (tVar != null) {
                    C4926v vVar = tVar.f14079b;
                    if (vVar != null && vVar.f14090f == 1) {
                        long a = C9144g.m27208a(vVar.f14097m);
                        C9143f fVar = this.f24824a.f24818a;
                        StartLottery startLottery = new StartLottery(vVar.f14085a, vVar.f14089e, vVar.f14087c, this.f24825b, a);
                        fVar.mo22345a((ILotteryAction) startLottery);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$d */
    static final class C9126d<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ LotteryViewModel f24826a;

        /* renamed from: b */
        final /* synthetic */ int f24827b;

        /* renamed from: c */
        final /* synthetic */ long f24828c;

        /* renamed from: d */
        final /* synthetic */ long f24829d;

        C9126d(LotteryViewModel lotteryViewModel, int i, long j, long j2) {
            this.f24826a = lotteryViewModel;
            this.f24827b = i;
            this.f24828c = j;
            this.f24829d = j2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C8444d.m25673b();
            C7573i.m23582a((Object) th, "t");
            C8444d.m11969a(6, th.getStackTrace());
            if (this.f24827b > 0) {
                LotteryViewModel lotteryViewModel = this.f24826a;
                C7321c f = C7492s.m23295b(1, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C9126d f24830a;

                    {
                        this.f24830a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Long l) {
                        this.f24830a.f24826a.mo22309a(this.f24830a.f24828c, this.f24830a.f24829d, this.f24830a.f24827b - 1);
                    }
                });
                C7573i.m23582a((Object) f, "Observable.timer(INIT_LO…                        }");
                lotteryViewModel.mo22311a(f);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.LotteryViewModel$e */
    static final class C9128e<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ LotteryViewModel f24831a;

        C9128e(LotteryViewModel lotteryViewModel) {
            this.f24831a = lotteryViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            this.f24831a.f24818a.mo22345a((ILotteryAction) new FinishLottery());
        }
    }

    public final void onCleared() {
        this.f24819b.dispose();
        this.f24820c.dispose();
        C8444d.m25673b();
        C8444d.m11970a("ttlive_lottery", "viewModel cleared");
    }

    /* renamed from: b */
    private final boolean m27173b(C7321c cVar) {
        return this.f24820c.mo119661a(cVar);
    }

    /* renamed from: a */
    public final boolean mo22311a(C7321c cVar) {
        return this.f24819b.mo119661a(cVar);
    }

    /* renamed from: a */
    public final void mo22310a(ILotteryState iLotteryState) {
        if (iLotteryState instanceof LotteryWaiting) {
            C7321c f = C7492s.m23295b((((LotteryWaiting) iLotteryState).getLocalDrawTime() * 1000) - System.currentTimeMillis(), TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C9128e<Object>(this));
            C7573i.m23582a((Object) f, "Observable.timer(localDr…mutate(FinishLottery()) }");
            mo22311a(f);
        }
    }

    public LotteryViewModel(long j, long j2) {
        C7321c f = C3306n.m12381a(this.f24818a.mo22346b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C7326g<Pair<? extends ILotteryState, ? extends ILotteryState>>(this) {

            /* renamed from: a */
            final /* synthetic */ LotteryViewModel f24821a;

            {
                this.f24821a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Pair<? extends ILotteryState, ? extends ILotteryState> pair) {
                ILotteryState iLotteryState = (ILotteryState) pair.component1();
                ILotteryState iLotteryState2 = (ILotteryState) pair.component2();
                if (iLotteryState != null) {
                    this.f24821a.f24819b.mo119660a();
                }
                this.f24821a.mo22310a(iLotteryState2);
            }
        });
        C7573i.m23582a((Object) f, "dataModel.stateChanged()…tateChanged(to)\n        }");
        m27173b(f);
        mo22309a(j, j2, 15);
    }

    /* renamed from: a */
    public static C7319aa<Boolean> m27172a(long j, long j2) {
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("checkLotteryPermission roomId=");
        sb.append(j);
        sb.append(" anchorId=");
        sb.append(j2);
        C8444d.m11971b("ttlive_lottery", sb.toString());
        C7492s a = ((LotteryApi) C3458e.m12798a().mo10440a(LotteryApi.class)).getConfig(j, j2).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "LiveClient.get().getServ…dSchedulers.mainThread())");
        C7319aa<Boolean> c = C3302j.m12365a(a, new C3299h(5, 3000)).mo19317d((C7327h<? super T, ? extends R>) C9123a.f24822a).mo19313d(Boolean.valueOf(false)).mo19139c((C7327h<Throwable, ? extends T>) C9124b.f24823a);
        C7573i.m23582a((Object) c, "LiveClient.get().getServ…n false\n                }");
        return c;
    }

    /* renamed from: a */
    public final void mo22309a(long j, long j2, int i) {
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("handleInit roomId=");
        sb.append(j);
        sb.append(" userId=");
        sb.append(j2);
        sb.append(" retriesLeft=");
        sb.append(i);
        C8444d.m11971b("ttlive_lottery", sb.toString());
        C7492s a = ((LotteryApi) C3458e.m12798a().mo10440a(LotteryApi.class)).checkUserRightWithRoomId(j).mo19294a(C47549a.m148327a());
        C7326g cVar = new C9125c(this, j2);
        C9126d dVar = new C9126d(this, i, j, j2);
        C7321c a2 = a.mo19280a(cVar, (C7326g<? super Throwable>) dVar);
        C7573i.m23582a((Object) a2, "LiveClient.get().getServ…     }\n                })");
        mo22311a(a2);
    }
}
