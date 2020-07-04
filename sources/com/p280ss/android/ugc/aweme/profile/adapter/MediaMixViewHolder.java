package com.p280ss.android.ugc.aweme.profile.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixViewHolder */
public final class MediaMixViewHolder extends JediSimpleViewHolder<MixStruct> {

    /* renamed from: f */
    public final TextView f93640f;

    /* renamed from: g */
    public final MediaMixListViewModel f93641g;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixViewHolder$a */
    static final class C35704a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaMixViewHolder f93642a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f93643b;

        C35704a(MediaMixViewHolder mediaMixViewHolder, MixStruct mixStruct) {
            this.f93642a = mediaMixViewHolder;
            this.f93643b = mixStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f93642a.mo29066a(this.f93642a.f93641g, (C7562b<? super S1, ? extends R>) new C7562b<MediaMixListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C35704a f93644a;

                {
                    this.f93644a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m115395a((MediaMixListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m115395a(MediaMixListState mediaMixListState) {
                    C7573i.m23587b(mediaMixListState, "it");
                    View view = this.f93644a.f93642a.itemView;
                    C7573i.m23582a((Object) view, "itemView");
                    SmartRouter.buildRoute(view.getContext(), "aweme://mix/detail").withParam("mix_id", this.f93644a.f93643b.mixId).withParam("uid", mediaMixListState.getUid()).withParam("event_type", mediaMixListState.getEnterFrom()).withParam("enter_method", "direct_click").withParam(C42914ab.m136242a().mo104633a("uid", mediaMixListState.getUid()).mo104633a(C22689a.f60407a, mediaMixListState.getSuid()).f111445a).open();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(MixStruct mixStruct) {
        C7573i.m23587b(mixStruct, "item");
        this.f93640f.setText(mixStruct.mixName);
        this.itemView.setOnClickListener(new C35704a(this, mixStruct));
        this.f93641g.mo93121a(mixStruct);
    }

    private MediaMixViewHolder(ViewGroup viewGroup, MediaMixListViewModel mediaMixListViewModel, View view) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(mediaMixListViewModel, "mMediaMixListViewModel");
        C7573i.m23587b(view, "view");
        super(view);
        this.f93641g = mediaMixListViewModel;
        View findViewById = this.itemView.findViewById(R.id.bzk);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.mix_name)");
        this.f93640f = (TextView) findViewById;
    }

    public /* synthetic */ MediaMixViewHolder(ViewGroup viewGroup, MediaMixListViewModel mediaMixListViewModel, View view, int i, C7571f fVar) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xp, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…media_mix, parent, false)");
        this(viewGroup, mediaMixListViewModel, inflate);
    }
}
