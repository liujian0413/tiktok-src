package com.p280ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.C42495a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRvAdapter */
public final class MvThumbnailRvAdapter extends C1262a<MvIconViewHolder> {

    /* renamed from: f */
    public static final C42553a f110629f = new C42553a(null);

    /* renamed from: a */
    public final List<MvThemeData> f110630a = new ArrayList();

    /* renamed from: b */
    public C42495a f110631b;

    /* renamed from: c */
    public C42554b f110632c;

    /* renamed from: d */
    public boolean f110633d = true;

    /* renamed from: e */
    public boolean f110634e = true;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRvAdapter$MvIconViewHolder */
    public static final class MvIconViewHolder extends C1293v {

        /* renamed from: a */
        public final RemoteImageView f110635a;

        /* renamed from: b */
        public final View f110636b;

        public MvIconViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.b7v);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.iv_content)");
            this.f110635a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.bu9);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.loading_view)");
            this.f110636b = findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRvAdapter$a */
    public static final class C42553a {
        private C42553a() {
        }

        public /* synthetic */ C42553a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRvAdapter$b */
    public interface C42554b {
        /* renamed from: a */
        void mo104040a(int i, View view);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRvAdapter$c */
    static final class C42555c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42554b f110637a;

        /* renamed from: b */
        final /* synthetic */ MvIconViewHolder f110638b;

        /* renamed from: c */
        final /* synthetic */ int f110639c;

        C42555c(C42554b bVar, MvIconViewHolder mvIconViewHolder, int i) {
            this.f110637a = bVar;
            this.f110638b = mvIconViewHolder;
            this.f110639c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42554b bVar = this.f110637a;
            int i = this.f110639c - 1;
            C7573i.m23582a((Object) view, "it");
            bVar.mo104040a(i, view);
        }
    }

    public final int getItemCount() {
        return this.f110630a.size() + 2;
    }

    public final int getItemViewType(int i) {
        if (i == 0 || i == getItemCount() - 1) {
            return 0;
        }
        return 1;
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m135228a(viewGroup, i);
    }

    /* renamed from: a */
    private static MvIconViewHolder m135228a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zq, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…toom_lidt, parent, false)");
        return new MvIconViewHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(MvIconViewHolder mvIconViewHolder, int i) {
        C7573i.m23587b(mvIconViewHolder, "holder");
        if (this.f110633d && getItemCount() - i <= 5) {
            C42495a aVar = this.f110631b;
            if (aVar != null) {
                aVar.mo104039a();
            }
        }
        int i2 = 0;
        if (i == 0) {
            Context context = mvIconViewHolder.f110635a.getContext();
            C7573i.m23582a((Object) context, "context");
            LayoutParams layoutParams = new LayoutParams((C39805en.m127447b(context) / 2) - (C42556a.m135231a(context) / 2), 0);
            View view = mvIconViewHolder.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            view.setLayoutParams(layoutParams);
        } else if (i == getItemCount() - 1) {
            Context context2 = mvIconViewHolder.f110635a.getContext();
            C7573i.m23582a((Object) context2, "context");
            LayoutParams layoutParams2 = new LayoutParams((C39805en.m127447b(context2) / 2) - (C42556a.m135231a(context2) / 2), -1);
            View view2 = mvIconViewHolder.itemView;
            C7573i.m23582a((Object) view2, "holder.itemView");
            view2.setLayoutParams(layoutParams2);
            mvIconViewHolder.f110635a.setVisibility(8);
            View view3 = mvIconViewHolder.f110636b;
            if (!this.f110634e) {
                i2 = 8;
            }
            view3.setVisibility(i2);
        } else {
            mvIconViewHolder.f110635a.setImageURI(((MvThemeData) this.f110630a.get(i - 1)).mo104054i());
            C42554b bVar = this.f110632c;
            if (bVar != null) {
                mvIconViewHolder.f110635a.setOnClickListener(new C42555c(bVar, mvIconViewHolder, i));
            }
        }
    }
}
