package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder */
public final class DiscoverExpandViewHolder extends C1293v {

    /* renamed from: b */
    public static final C26382a f69481b = new C26382a(null);

    /* renamed from: a */
    public RemoteImageView f69482a;

    /* renamed from: c */
    private RemoteImageView f69483c;

    /* renamed from: d */
    private View f69484d;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder$a */
    public static final class C26382a {
        private C26382a() {
        }

        public /* synthetic */ C26382a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static View m86805a(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uf, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…pand_view, parent, false)");
            return inflate;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder$b */
    public interface C26383b {
        /* renamed from: a */
        void mo67953a(View view, int i);
    }

    /* renamed from: a */
    public final void mo67956a(boolean z) {
        if (z) {
            View view = this.f69484d;
            if (view != null) {
                view.setVisibility(0);
            }
            return;
        }
        View view2 = this.f69484d;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    public DiscoverExpandViewHolder(View view, final C26383b bVar) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f69482a = (RemoteImageView) view.findViewById(R.id.bdp);
        this.f69483c = (RemoteImageView) view.findViewById(R.id.bdr);
        this.f69484d = view.findViewById(R.id.ef8);
        RemoteImageView remoteImageView = this.f69482a;
        if (remoteImageView != null) {
            remoteImageView.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ DiscoverExpandViewHolder f69485a;

                {
                    this.f69485a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C26383b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo67953a(this.f69485a.f69482a, this.f69485a.getAdapterPosition());
                    }
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67955a(com.p280ss.android.ugc.aweme.feed.model.Aweme r3, boolean r4) {
        /*
            r2 = this;
            r2.mo67956a(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r2.f69482a
            r0 = 0
            if (r3 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.feed.model.Video r1 = r3.getVideo()
            if (r1 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getOriginCover()
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r4, r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = r2.f69483c
            if (r3 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x0025
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.getAvatarThumb()
        L_0x0025:
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder.mo67955a(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }
}
