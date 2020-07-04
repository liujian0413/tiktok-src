package com.p280ss.android.ugc.aweme.challenge.p1086ui.header.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.adapter.HorizontalSlideVideoViewHolder */
public final class HorizontalSlideVideoViewHolder extends C1293v {

    /* renamed from: c */
    public static final C23762a f62709c = new C23762a(null);

    /* renamed from: a */
    public Aweme f62710a;

    /* renamed from: b */
    public final C23763b f62711b;

    /* renamed from: d */
    private final AnimatedImageView f62712d;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.adapter.HorizontalSlideVideoViewHolder$a */
    public static final class C23762a {
        private C23762a() {
        }

        public /* synthetic */ C23762a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static HorizontalSlideVideoViewHolder m77911a(ViewGroup viewGroup, C23763b bVar) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(bVar, "listener");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tm, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new HorizontalSlideVideoViewHolder(inflate, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.adapter.HorizontalSlideVideoViewHolder$b */
    public interface C23763b {
        /* renamed from: a */
        void mo61795a(Aweme aweme, int i);
    }

    /* renamed from: a */
    public final void mo61799a(Aweme aweme) {
        if (aweme != null && aweme.getVideo() != null) {
            RemoteImageView remoteImageView = this.f62712d;
            Video video = aweme.getVideo();
            C7573i.m23582a((Object) video, "aweme.video");
            C23323e.m76524b(remoteImageView, video.getCover());
            this.f62710a = aweme;
        }
    }

    public HorizontalSlideVideoViewHolder(View view, C23763b bVar) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(bVar, "listener");
        super(view);
        this.f62711b = bVar;
        View findViewById = view.findViewById(R.id.d7m);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.slide_aiv)");
        this.f62712d = (AnimatedImageView) findViewById;
        this.f62712d.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ HorizontalSlideVideoViewHolder f62713a;

            {
                this.f62713a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f62713a.f62710a != null && !C27326a.m89578a(view)) {
                    C23763b bVar = this.f62713a.f62711b;
                    Aweme aweme = this.f62713a.f62710a;
                    if (aweme == null) {
                        C7573i.m23580a();
                    }
                    bVar.mo61795a(aweme, this.f62713a.getAdapterPosition() + 1);
                }
            }
        });
    }
}
