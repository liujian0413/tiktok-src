package com.p280ss.android.ugc.aweme.tools.music.music;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.aweme.tools.music.p1672a.C42395b;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.music.MusicItemViewHolder */
public class MusicItemViewHolder extends C1293v {

    /* renamed from: d */
    public static final C42465a f110391d = new C42465a(null);

    /* renamed from: a */
    public AVDmtImageTextView f110392a;

    /* renamed from: b */
    public RemoteImageView f110393b;

    /* renamed from: c */
    public final C42612j f110394c;

    /* renamed from: e */
    private Animation f110395e = new AlphaAnimation(0.0f, 1.0f);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.MusicItemViewHolder$a */
    public static final class C42465a {
        private C42465a() {
        }

        public /* synthetic */ C42465a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static View m134953a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            int i;
            C7573i.m23587b(layoutInflater, "inflater");
            C7573i.m23587b(viewGroup, "parent");
            if (C42395b.m134788a() == 0) {
                i = R.layout.gb;
            } else {
                i = R.layout.gc;
            }
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            C7573i.m23582a((Object) inflate, "inflater.inflate(if (ABM…music_new, parent, false)");
            return inflate;
        }
    }

    /* renamed from: a */
    public static void m134947a() {
        C42395b.m134788a();
    }

    /* renamed from: b */
    public static void m134948b() {
        C42395b.m134788a();
    }

    /* renamed from: c */
    public final void mo103986c() {
        AVDmtImageTextView aVDmtImageTextView = this.f110392a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo103493a(0.66f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f110392a;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.mo103508c(true);
        }
    }

    /* renamed from: d */
    public final void mo103987d() {
        AVDmtImageTextView aVDmtImageTextView = this.f110392a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo103493a(1.0f);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f110392a;
        if (aVDmtImageTextView2 != null) {
            aVDmtImageTextView2.mo103508c(false);
        }
    }

    /* renamed from: a */
    public final void mo103985a(boolean z) {
        AVDmtImageTextView aVDmtImageTextView = this.f110392a;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.mo103501a(z);
        }
    }

    public MusicItemViewHolder(final View view, C42612j jVar) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f110394c = jVar;
        this.f110392a = (AVDmtImageTextView) view.findViewById(R.id.b3n);
        this.f110393b = (RemoteImageView) view.findViewById(R.id.bdv);
        Animation animation = this.f110395e;
        if (animation != null) {
            animation.setDuration(1000);
        }
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ MusicItemViewHolder f110396a;

            {
                this.f110396a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C42612j jVar = this.f110396a.f110394c;
                if (jVar != null) {
                    jVar.mo97305a(view, this.f110396a.getAdapterPosition());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo103984a(MusicModel musicModel, boolean z, boolean z2, boolean z3) {
        String str;
        AVDmtImageTextView aVDmtImageTextView = this.f110392a;
        String str2 = null;
        if (aVDmtImageTextView != null) {
            if (musicModel != null) {
                str = musicModel.getName();
            } else {
                str = null;
            }
            aVDmtImageTextView.setText(str);
        }
        AVDmtImageTextView aVDmtImageTextView2 = this.f110392a;
        if (aVDmtImageTextView2 != null) {
            if (musicModel != null) {
                str2 = musicModel.getPicPremium();
            }
            aVDmtImageTextView2.mo103499a(str2);
        }
        mo103985a(z);
        if (musicModel == null) {
            RemoteImageView remoteImageView = this.f110393b;
            if (remoteImageView == null) {
                C7573i.m23580a();
            }
            remoteImageView.setVisibility(8);
        } else if (musicModel.isMvThemeMusic()) {
            RemoteImageView remoteImageView2 = this.f110393b;
            if (remoteImageView2 == null) {
                C7573i.m23580a();
            }
            remoteImageView2.setVisibility(0);
        } else {
            RemoteImageView remoteImageView3 = this.f110393b;
            if (remoteImageView3 == null) {
                C7573i.m23580a();
            }
            remoteImageView3.setVisibility(8);
        }
        if (z2) {
            AVDmtImageTextView aVDmtImageTextView3 = this.f110392a;
            if (aVDmtImageTextView3 != null) {
                aVDmtImageTextView3.mo103493a(0.66f);
            }
            AVDmtImageTextView aVDmtImageTextView4 = this.f110392a;
            if (aVDmtImageTextView4 != null) {
                aVDmtImageTextView4.mo103508c(true);
            }
        } else {
            AVDmtImageTextView aVDmtImageTextView5 = this.f110392a;
            if (aVDmtImageTextView5 != null) {
                aVDmtImageTextView5.mo103493a(1.0f);
            }
            AVDmtImageTextView aVDmtImageTextView6 = this.f110392a;
            if (aVDmtImageTextView6 != null) {
                aVDmtImageTextView6.mo103508c(false);
            }
        }
    }
}
