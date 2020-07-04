package com.p280ss.android.ugc.aweme.profile.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.C11673w;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.C11714g;
import com.bytedance.jedi.ext.adapter.C11714g.C11715a;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.base.arch.C23273a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeListState;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel;
import com.p280ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder */
public class MediaMixListViewHolder extends JediBaseViewHolder<MediaMixListViewHolder, Object> {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f93605g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaMixListViewHolder.class), "awemeListViewModel", "getAwemeListViewModel()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/JediAwemeListViewModel;"))};

    /* renamed from: q */
    public static final C35691a f93606q = new C35691a(null);

    /* renamed from: j */
    public MediaMixAdapter f93607j;

    /* renamed from: k */
    public final RecyclerView f93608k;

    /* renamed from: l */
    public View f93609l;

    /* renamed from: m */
    public String f93610m = "";

    /* renamed from: n */
    public String f93611n = "";

    /* renamed from: o */
    public String f93612o;

    /* renamed from: p */
    public MediaMixList f93613p;

    /* renamed from: r */
    private final ViewStub f93614r;

    /* renamed from: s */
    private final C7541d f93615s;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$a */
    public static final class C35691a {
        private C35691a() {
        }

        public /* synthetic */ C35691a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$b */
    public static final class C35692b implements C11557c<MixStruct, MediaMixListViewHolder> {

        /* renamed from: a */
        final /* synthetic */ C7562b f93616a;

        /* renamed from: b */
        final /* synthetic */ C7563m f93617b;

        /* renamed from: c */
        final /* synthetic */ C7563m f93618c;

        /* renamed from: d */
        private final C7562b<MediaMixListViewHolder, C7581n> f93619d;

        /* renamed from: e */
        private final C7563m<MediaMixListViewHolder, Throwable, C7581n> f93620e;

        /* renamed from: f */
        private final C7563m<MediaMixListViewHolder, List<? extends MixStruct>, C7581n> f93621f;

        /* renamed from: a */
        public final C7562b<MediaMixListViewHolder, C7581n> mo29138a() {
            return this.f93619d;
        }

        /* renamed from: b */
        public final C7563m<MediaMixListViewHolder, Throwable, C7581n> mo29139b() {
            return this.f93620e;
        }

        /* renamed from: c */
        public final C7563m<MediaMixListViewHolder, List<? extends MixStruct>, C7581n> mo29140c() {
            return this.f93621f;
        }

        public C35692b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f93616a = bVar;
            this.f93617b = mVar;
            this.f93618c = mVar2;
            this.f93619d = bVar;
            this.f93620e = mVar;
            this.f93621f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$c */
    static final class C35693c implements C6905a {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder f93622a;

        C35693c(MediaMixListViewHolder mediaMixListViewHolder) {
            this.f93622a = mediaMixListViewHolder;
        }

        public final void bd_() {
            this.f93622a.mo62390p().f96521e.mo29085c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$d */
    static final class C35694d extends Lambda implements C7562b<MediaMixListViewHolder, C7581n> {

        /* renamed from: a */
        public static final C35694d f93623a = new C35694d();

        C35694d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115384a((MediaMixListViewHolder) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115384a(MediaMixListViewHolder mediaMixListViewHolder) {
            C7573i.m23587b(mediaMixListViewHolder, "$receiver");
            MediaMixListViewHolder.m115373a(mediaMixListViewHolder).ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$e */
    static final class C35695e extends Lambda implements C7563m<MediaMixListViewHolder, List<? extends MixStruct>, C7581n> {

        /* renamed from: a */
        public static final C35695e f93624a = new C35695e();

        C35695e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115385a((MediaMixListViewHolder) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115385a(MediaMixListViewHolder mediaMixListViewHolder, List<? extends MixStruct> list) {
            C7573i.m23587b(mediaMixListViewHolder, "$receiver");
            C7573i.m23587b(list, "it");
            MediaMixListViewHolder.m115373a(mediaMixListViewHolder).ai_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$f */
    static final class C35696f extends Lambda implements C7563m<MediaMixListViewHolder, Throwable, C7581n> {

        /* renamed from: a */
        public static final C35696f f93625a = new C35696f();

        C35696f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115386a((MediaMixListViewHolder) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115386a(MediaMixListViewHolder mediaMixListViewHolder, Throwable th) {
            C7573i.m23587b(mediaMixListViewHolder, "$receiver");
            C7573i.m23587b(th, "it");
            MediaMixListViewHolder.m115373a(mediaMixListViewHolder).ai_();
            C6921a.m21559a(th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$g */
    static final class C35697g extends Lambda implements C7562b<MediaMixListState, MediaMixListState> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder f93626a;

        C35697g(MediaMixListViewHolder mediaMixListViewHolder) {
            this.f93626a = mediaMixListViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MediaMixListState invoke(MediaMixListState mediaMixListState) {
            C7573i.m23587b(mediaMixListState, "$receiver");
            String str = this.f93626a.f93610m;
            String str2 = this.f93626a.f93611n;
            MediaMixList mediaMixList = this.f93626a.f93613p;
            if (mediaMixList == null) {
                Object o = this.f93626a.mo29309o();
                if (o != null) {
                    mediaMixList = (MediaMixList) o;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.MediaMixList");
                }
            }
            MediaMixList mediaMixList2 = mediaMixList;
            String str3 = this.f93626a.f93612o;
            if (str3 == null) {
                str3 = "";
            }
            return MediaMixListState.copy$default(mediaMixListState, str, str2, str3, mediaMixList2, null, 16, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$h */
    static final class C35698h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder f93627a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f93628b;

        C35698h(MediaMixListViewHolder mediaMixListViewHolder, MixStruct mixStruct) {
            this.f93627a = mediaMixListViewHolder;
            this.f93628b = mixStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f93627a.mo29066a(this.f93627a.mo62390p(), (C7562b<? super S1, ? extends R>) new C7562b<MediaMixListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C35698h f93629a;

                {
                    this.f93629a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m115388a((MediaMixListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m115388a(MediaMixListState mediaMixListState) {
                    C7573i.m23587b(mediaMixListState, "it");
                    View view = this.f93629a.f93627a.itemView;
                    C7573i.m23582a((Object) view, "itemView");
                    SmartRouter.buildRoute(view.getContext(), "aweme://mix/detail").withParam("mix_id", this.f93629a.f93628b.mixId).withParam("uid", mediaMixListState.getUid()).withParam("event_type", mediaMixListState.getEnterFrom()).withParam("enter_method", "direct_click").withParam(C42914ab.m136242a().mo104633a("uid", mediaMixListState.getUid()).mo104633a(C22689a.f60407a, mediaMixListState.getSuid()).f111445a).open();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$i */
    static final class C35700i extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder f93630a;

        C35700i(MediaMixListViewHolder mediaMixListViewHolder) {
            this.f93630a = mediaMixListViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115389a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115389a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            MediaMixListViewHolder mediaMixListViewHolder = this.f93630a;
            String label = awemeListState.getLabel();
            if (label == null) {
                label = "";
            }
            mediaMixListViewHolder.f93612o = label;
            MediaMixListViewHolder mediaMixListViewHolder2 = this.f93630a;
            String userId = awemeListState.getUserId();
            if (userId == null) {
                userId = "";
            }
            mediaMixListViewHolder2.mo90550a(userId);
            MediaMixListViewHolder mediaMixListViewHolder3 = this.f93630a;
            String secUserId = awemeListState.getSecUserId();
            if (secUserId == null) {
                secUserId = "";
            }
            mediaMixListViewHolder3.mo90551b(secUserId);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$j */
    static final class C35701j extends Lambda implements C7563m<MediaMixListViewHolder, MediaMixList, C7581n> {

        /* renamed from: a */
        public static final C35701j f93631a = new C35701j();

        C35701j() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115390a((MediaMixListViewHolder) obj, (MediaMixList) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115390a(MediaMixListViewHolder mediaMixListViewHolder, MediaMixList mediaMixList) {
            C7573i.m23587b(mediaMixListViewHolder, "$receiver");
            C7573i.m23587b(mediaMixList, "it");
            List<MixStruct> list = mediaMixList.mixInfos;
            if (list == null || list.size() != 1) {
                View view = mediaMixListViewHolder.f93609l;
                if (view != null) {
                    view.setVisibility(8);
                }
                mediaMixListViewHolder.mo69905q();
                mediaMixListViewHolder.f93608k.mo5541b(0);
                mediaMixListViewHolder.mo62390p().f96521e.mo29082b();
                return;
            }
            mediaMixListViewHolder.f93608k.setVisibility(8);
            mediaMixListViewHolder.f93608k.setAdapter(null);
            mediaMixListViewHolder.mo69906r();
            mediaMixListViewHolder.mo90549a((MixStruct) C7525m.m23511f(mediaMixList.mixInfos));
        }
    }

    /* renamed from: s */
    private final JediAwemeListViewModel m115374s() {
        return (JediAwemeListViewModel) this.f93615s.getValue();
    }

    /* renamed from: r */
    public final void mo69906r() {
        View view = this.f93609l;
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.f93609l == null) {
            View view2 = this.f93609l;
            if (view2 == null) {
                view2 = this.f93614r.inflate();
            }
            this.f93609l = view2;
        }
    }

    public final void bA_() {
        super.bA_();
        if (this.f93612o == null) {
            mo29066a(m115374s(), (C7562b<? super S1, ? extends R>) new C35700i<Object,Object>(this));
        }
        mo29062a(mo62390p(), C35716i.f93667a, C11673w.m34159a(true), C35701j.f93631a);
    }

    /* renamed from: p */
    public final MediaMixListViewModel mo62390p() {
        C7562b gVar = new C35697g(this);
        Class<MediaMixListViewModel> cls = MediaMixListViewModel.class;
        C11679b d = mo29218d();
        if (d != null) {
            C11714g a = C11715a.m34329a(mo29056f(), d.mo29232b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo29268a(sb.toString(), cls);
            C11664n a2 = jediViewModel.f31065b.mo29189a(MediaMixListViewModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo29034a(gVar);
            return (MediaMixListViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: q */
    public final void mo69905q() {
        this.f93608k.setVisibility(0);
        if (this.f93607j != null) {
            RecyclerView recyclerView = this.f93608k;
            MediaMixAdapter mediaMixAdapter = this.f93607j;
            if (mediaMixAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            recyclerView.setAdapter(mediaMixAdapter);
            return;
        }
        this.f93607j = new MediaMixAdapter(mo29227n(), mo62390p());
        RecyclerView recyclerView2 = this.f93608k;
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        recyclerView2.setLayoutManager(new WrapLinearLayoutManager(view.getContext(), 0, false));
        RecyclerView recyclerView3 = this.f93608k;
        MediaMixAdapter mediaMixAdapter2 = this.f93607j;
        if (mediaMixAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        recyclerView3.setAdapter(mediaMixAdapter2);
        this.f93608k.mo5525a((C1272h) new MediaMixListViewHolder$manyMixesInit$2(this));
        this.f93608k.mo5528a((C1281m) new MediaMixListViewHolder$manyMixesInit$3(this));
        MediaMixAdapter mediaMixAdapter3 = this.f93607j;
        if (mediaMixAdapter3 == null) {
            C7573i.m23583a("mAdapter");
        }
        mediaMixAdapter3.mo66504a((C6905a) new C35693c(this));
        ListMiddleware<MediaMixListState, MixStruct, C23273a> listMiddleware = mo62390p().f96521e;
        C11502e eVar = this;
        C1262a adapter = this.f93608k.getAdapter();
        if (adapter != null) {
            ListMiddleware.m33938a(listMiddleware, eVar, (MediaMixAdapter) adapter, false, false, null, new C35692b(C35694d.f93623a, C35696f.f93625a, C35695e.f93624a), null, null, null, null, 988, null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.adapter.MediaMixAdapter");
    }

    /* renamed from: a */
    public final void mo90550a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f93610m = str;
    }

    /* renamed from: b */
    public final void mo90551b(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f93611n = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ MediaMixAdapter m115373a(MediaMixListViewHolder mediaMixListViewHolder) {
        MediaMixAdapter mediaMixAdapter = mediaMixListViewHolder.f93607j;
        if (mediaMixAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        return mediaMixAdapter;
    }

    /* renamed from: a */
    public final void mo90549a(MixStruct mixStruct) {
        C7573i.m23587b(mixStruct, "item");
        View view = this.f93609l;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.bzk);
            if (textView != null) {
                textView.setText(mixStruct.mixName);
            }
        }
        View view2 = this.f93609l;
        if (view2 != null) {
            view2.setOnClickListener(new C35698h(this, mixStruct));
        }
        mo62390p().mo93121a(mixStruct);
    }

    public MediaMixListViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xq, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…_mix_list, parent, false)");
        super(inflate);
        View findViewById = this.itemView.findViewById(R.id.bn5);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.listView)");
        this.f93608k = (RecyclerView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.bxk);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.media_mix_span_whole)");
        this.f93614r = (ViewStub) findViewById2;
        C7584c a = C7575l.m23595a(JediAwemeListViewModel.class);
        this.f93615s = C7546e.m23569a(new MediaMixListViewHolder$$special$$inlined$hostViewModel$1(this, a, a));
    }
}
