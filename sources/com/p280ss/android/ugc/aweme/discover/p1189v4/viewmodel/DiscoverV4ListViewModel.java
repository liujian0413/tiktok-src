package com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11580m;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse;
import java.util.Collection;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel */
public final class DiscoverV4ListViewModel extends JediViewModel<DiscoverV4ListState> {

    /* renamed from: d */
    public static final C27208a f71701d = new C27208a(null);

    /* renamed from: c */
    public final ListMiddleware<DiscoverV4ListState, DiscoverCategoryStructV4, C11583n> f71702c = new ListMiddleware<>(new DiscoverV4ListViewModel$$special$$inlined$SingleListMiddleware$1(), null, new C27210c(this), C11580m.m34046b());

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$a */
    public static final class C27208a {
        private C27208a() {
        }

        public /* synthetic */ C27208a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$b */
    static final class C27209b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C27209b f71703a = new C27209b();

        C27209b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m89195a((DiscoverV4CategoryResponse) obj);
        }

        /* renamed from: a */
        private static Pair<List<DiscoverCategoryStructV4>, C11583n> m89195a(DiscoverV4CategoryResponse discoverV4CategoryResponse) {
            C7573i.m23587b(discoverV4CategoryResponse, "resp");
            List<DiscoverCategoryStructV4> list = discoverV4CategoryResponse.categoryList;
            if (list == null) {
                list = C7525m.m23461a();
            }
            List<DiscoverCategoryStructV4> d = C7525m.m23509d((Collection<? extends T>) list);
            for (DiscoverCategoryStructV4 discoverCategoryStructV4 : d) {
                discoverCategoryStructV4.logPb = discoverV4CategoryResponse.logPb;
            }
            d.add(0, new DiscoverCategoryStructV4("", ""));
            return C7579l.m23633a(d, new C11583n(false, d.size()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$c */
    static final class C27210c extends Lambda implements C7563m<List<? extends DiscoverCategoryStructV4>, List<? extends DiscoverCategoryStructV4>, List<? extends DiscoverCategoryStructV4>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4ListViewModel f71704a;

        C27210c(DiscoverV4ListViewModel discoverV4ListViewModel) {
            this.f71704a = discoverV4ListViewModel;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<DiscoverCategoryStructV4> invoke(List<DiscoverCategoryStructV4> list, List<DiscoverCategoryStructV4> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "refresh");
            return DiscoverV4ListViewModel.m89191a(list2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4ListViewModel$d */
    static final class C27211d extends Lambda implements C7563m<DiscoverV4ListState, ListState<DiscoverCategoryStructV4, C11583n>, DiscoverV4ListState> {

        /* renamed from: a */
        public static final C27211d f71705a = new C27211d();

        C27211d() {
            super(2);
        }

        /* renamed from: a */
        private static DiscoverV4ListState m89197a(DiscoverV4ListState discoverV4ListState, ListState<DiscoverCategoryStructV4, C11583n> listState) {
            C7573i.m23587b(discoverV4ListState, "$receiver");
            C7573i.m23587b(listState, "it");
            return discoverV4ListState.copy(listState);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m89197a((DiscoverV4ListState) obj, (ListState) obj2);
        }
    }

    /* renamed from: a */
    public static List<DiscoverCategoryStructV4> m89191a(List<DiscoverCategoryStructV4> list) {
        C7573i.m23587b(list, "list");
        return list;
    }

    /* renamed from: f */
    private static DiscoverV4ListState m89192f() {
        return new DiscoverV4ListState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m89192f();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        this.f71702c.mo29186a(C27228a.f71727a, (C7563m<? super S, ? super PROP, ? extends S>) C27211d.f71705a);
        mo29033a(this.f71702c);
        this.f71702c.mo29082b();
    }
}
