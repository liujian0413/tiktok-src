package com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverTrendingReponseV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse;
import com.p280ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1 */
public final class C27223xa6d6cacc extends Lambda implements C7562b<DiscoverStateV4, C7492s<Pair<? extends List<? extends DiscoverPlayListStructV4>, ? extends C11583n>>> {
    final /* synthetic */ DiscoverV4PlayListViewModel this$0;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1$a */
    static final class C27224a<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ C27223xa6d6cacc f71724a;

        C27224a(C27223xa6d6cacc discoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1) {
            this.f71724a = discoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1;
        }

        public final void subscribe(C47870u<DiscoverV4PlayListResponse> uVar) {
            C7573i.m23587b(uVar, "it");
            DiscoverV4PlayListResponse data = this.f71724a.this$0.f71707c.getData(this.f71724a.this$0.f71708d);
            if (data == null) {
                C7573i.m23580a();
            }
            uVar.mo19239a((Object) data);
            uVar.mo19238a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1$b */
    static final class C27225b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C27223xa6d6cacc f71725a;

        C27225b(C27223xa6d6cacc discoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1) {
            this.f71725a = discoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<List<DiscoverPlayListStructV4>, C11583n> apply(DiscoverTrendingReponseV4 discoverTrendingReponseV4) {
            C7573i.m23587b(discoverTrendingReponseV4, "resp");
            List arrayList = new ArrayList();
            List<Aweme> list = discoverTrendingReponseV4.cells;
            if (list == null) {
                list = C7525m.m23461a();
            }
            boolean z = false;
            int i = 0;
            for (Aweme aweme : list) {
                Video video = aweme.getVideo();
                if (video != null) {
                    video.setSourceId(aweme.getAid());
                }
                String desc = aweme.getDesc();
                C7573i.m23582a((Object) desc, "it.desc");
                DiscoverPlayListStructV4 discoverPlayListStructV4 = new DiscoverPlayListStructV4("", desc, aweme, 2);
                discoverPlayListStructV4.logPb = discoverTrendingReponseV4.logPb;
                arrayList.add(discoverPlayListStructV4);
                aweme.setRequestId(discoverTrendingReponseV4.logPb.getImprId());
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sb = new StringBuilder();
                sb.append(aweme.getAid());
                sb.append(9001);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), aweme.getRequestId(), i);
                i++;
            }
            DiscoverV4PlayListDataCenter.Companion.getINSTANCE().refreshData(this.f71725a.this$0.f71708d, new DiscoverV4PlayListResponse(discoverTrendingReponseV4.nextCursor, discoverTrendingReponseV4.hasMore, arrayList, discoverTrendingReponseV4.logPb));
            if (discoverTrendingReponseV4.hasMore == 1) {
                z = true;
            }
            return C7579l.m23633a(arrayList, new C11583n(z, discoverTrendingReponseV4.nextCursor));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1$c */
    static final class C27226c<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C27223xa6d6cacc f71726a;

        C27226c(C27223xa6d6cacc discoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1) {
            this.f71726a = discoverV4PlayListViewModel$$special$$inlined$SingleListMiddleware$1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<List<DiscoverPlayListStructV4>, C11583n> apply(DiscoverV4PlayListResponse discoverV4PlayListResponse) {
            C7573i.m23587b(discoverV4PlayListResponse, "resp");
            List<DiscoverPlayListStructV4> list = discoverV4PlayListResponse.cells;
            if (list == null) {
                list = C7525m.m23461a();
            }
            for (DiscoverPlayListStructV4 discoverPlayListStructV4 : list) {
                discoverPlayListStructV4.logPb = discoverV4PlayListResponse.logPb;
                List<Aweme> list2 = discoverPlayListStructV4.awemes;
                if (list2 != null) {
                    for (Aweme aweme : list2) {
                        Video video = aweme.getVideo();
                        if (video != null) {
                            video.setSourceId(aweme.getAid());
                        }
                        aweme.setRequestId(discoverV4PlayListResponse.logPb.getImprId());
                        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                    }
                }
                DiscoverV4PlayListDataCenter.Companion.getINSTANCE().refreshData(this.f71726a.this$0.f71708d, discoverV4PlayListResponse);
            }
            boolean z = true;
            if (discoverV4PlayListResponse.hasMore != 1) {
                z = false;
            }
            return C7579l.m23633a(list, new C11583n(z, discoverV4PlayListResponse.nextCursor));
        }
    }

    public C27223xa6d6cacc(DiscoverV4PlayListViewModel discoverV4PlayListViewModel) {
        this.this$0 = discoverV4PlayListViewModel;
        super(1);
    }

    public final C7492s<Pair<List<DiscoverPlayListStructV4>, C11583n>> invoke(DiscoverStateV4 discoverStateV4) {
        C7319aa aaVar;
        C7573i.m23587b(discoverStateV4, "it");
        if (this.this$0.f71707c.getData(this.this$0.f71708d) != null) {
            aaVar = C7319aa.m22929a((C7496w<? extends T>) C7492s.m23282a((C7495v<T>) new C27224a<T>(this)).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C27213b.f71711a));
            C7573i.m23582a((Object) aaVar, "Single.fromObservable(\n …                        )");
        } else if (C7573i.m23585a((Object) this.this$0.f71708d, (Object) DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            aaVar = C7319aa.m22929a((C7496w<? extends T>) DiscoverApi.m87295a().trendingListV4(0, 0, 8).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19317d((C7327h<? super T, ? extends R>) new C27225b<Object,Object>(this)));
            C7573i.m23582a((Object) aaVar, "Single.fromObservable(\n …                        )");
        } else {
            aaVar = C7319aa.m22929a((C7496w<? extends T>) DiscoverApi.m87295a().cellListV4(0, 8, this.this$0.f71708d, C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19317d((C7327h<? super T, ? extends R>) new C27226c<Object,Object>(this)));
            C7573i.m23582a((Object) aaVar, "Single.fromObservable(\n …                       })");
        }
        C7492s<Pair<List<DiscoverPlayListStructV4>, C11583n>> b = aaVar.mo19136b();
        C7573i.m23582a((Object) b, "actualRefresh(it).toObservable()");
        return b;
    }
}
