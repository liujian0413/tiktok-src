package com.p280ss.android.ugc.aweme.profile.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.bytedance.jedi.arch.C11500c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$manyMixesInit$3 */
public final class MediaMixListViewHolder$manyMixesInit$3 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ MediaMixListViewHolder f93635a;

    /* renamed from: b */
    private int f93636b;

    /* renamed from: c */
    private int f93637c;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$manyMixesInit$3$a */
    static final class C35702a extends Lambda implements C7562b<MediaMixListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f93638a;

        C35702a(String str) {
            this.f93638a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115391a((MediaMixListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115391a(MediaMixListState mediaMixListState) {
            C7573i.m23587b(mediaMixListState, "it");
            C6907h.m21524a("slide_compilation_list", (Map) C22984d.m75611a().mo59973a("enter_from", mediaMixListState.getEnterFrom()).mo59973a("direction", this.f93638a).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$manyMixesInit$3$b */
    static final class C35703b extends Lambda implements C7562b<MediaMixListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewHolder$manyMixesInit$3 f93639a;

        C35703b(MediaMixListViewHolder$manyMixesInit$3 mediaMixListViewHolder$manyMixesInit$3) {
            this.f93639a = mediaMixListViewHolder$manyMixesInit$3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115392a((MediaMixListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115392a(MediaMixListState mediaMixListState) {
            C7573i.m23587b(mediaMixListState, "it");
            if (mediaMixListState.getListState().getLoadMore() instanceof C11500c) {
                this.f93639a.f93635a.mo62390p().f96521e.mo29085c();
            }
        }
    }

    MediaMixListViewHolder$manyMixesInit$3(MediaMixListViewHolder mediaMixListViewHolder) {
        this.f93635a = mediaMixListViewHolder;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        String str;
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (this.f93636b == 1) {
            if (this.f93637c < recyclerView.computeHorizontalScrollOffset()) {
                str = "left";
            } else {
                str = "right";
            }
            this.f93635a.mo29066a(this.f93635a.mo62390p(), (C7562b<? super S1, ? extends R>) new C35702a<Object,Object>(str));
        }
        this.f93636b = i;
        this.f93637c = recyclerView.computeHorizontalScrollOffset();
        this.f93635a.mo29066a(this.f93635a.mo62390p(), (C7562b<? super S1, ? extends R>) new C35703b<Object,Object>(this));
    }
}
