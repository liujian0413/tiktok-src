package com.p280ss.android.ugc.aweme.tools.music.music;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.aweme.tools.music.p1672a.C42395b;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.music.MusicLibViewHolder */
public final class MusicLibViewHolder extends C1293v {

    /* renamed from: b */
    public static final C42468a f110398b = new C42468a(null);

    /* renamed from: a */
    public final C42612j f110399a;

    /* renamed from: c */
    private AVDmtImageTextView f110400c;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.MusicLibViewHolder$a */
    public static final class C42468a {
        private C42468a() {
        }

        public /* synthetic */ C42468a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static View m134954a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            int i;
            C7573i.m23587b(layoutInflater, "inflater");
            C7573i.m23587b(viewGroup, "parent");
            if (C42395b.m134788a() == 0) {
                i = R.layout.gd;
            } else {
                i = R.layout.ge;
            }
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            C7573i.m23582a((Object) inflate, "inflater.inflate(if (ABM…th_search, parent, false)");
            return inflate;
        }
    }

    public MusicLibViewHolder(final View view, C42612j jVar) {
        C7573i.m23587b(view, "itemView");
        super(view);
        this.f110399a = jVar;
        this.f110400c = (AVDmtImageTextView) view.findViewById(R.id.b5e);
        if (C42395b.m134788a() == 0) {
            AVDmtImageTextView aVDmtImageTextView = this.f110400c;
            if (aVDmtImageTextView != null) {
                aVDmtImageTextView.setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ MusicLibViewHolder f110401a;

                    {
                        this.f110401a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        C42612j jVar = this.f110401a.f110399a;
                        if (jVar != null) {
                            jVar.mo97305a(view, this.f110401a.getAdapterPosition());
                        }
                    }
                });
            }
        } else {
            AVDmtImageTextView aVDmtImageTextView2 = this.f110400c;
            if (aVDmtImageTextView2 != null) {
                aVDmtImageTextView2.setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ MusicLibViewHolder f110403a;

                    {
                        this.f110403a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        C42612j jVar = this.f110403a.f110399a;
                        if (jVar != null) {
                            jVar.mo97305a(view, this.f110403a.getAdapterPosition());
                        }
                    }
                });
            }
        }
    }
}
