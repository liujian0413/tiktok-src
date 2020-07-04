package com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1622a.C41591b;
import com.p280ss.android.ugc.aweme.utils.C42993bx;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryViewHolder */
public final class VideoCategoryViewHolder extends C1293v {

    /* renamed from: a */
    private final DmtTextView f108199a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryViewHolder$a */
    public static final class C41631a extends C42993bx {

        /* renamed from: a */
        final /* synthetic */ VideoCategoryViewHolder f108200a;

        /* renamed from: b */
        final /* synthetic */ C7563m f108201b;

        /* renamed from: c */
        final /* synthetic */ C41591b f108202c;

        /* renamed from: a */
        public final void mo101783a(View view) {
            C7573i.m23587b(view, "v");
            this.f108201b.invoke(Integer.valueOf(this.f108200a.getAdapterPosition()), this.f108202c.f108090c);
        }

        C41631a(VideoCategoryViewHolder videoCategoryViewHolder, C7563m mVar, C41591b bVar, int i) {
            this.f108200a = videoCategoryViewHolder;
            this.f108201b = mVar;
            this.f108202c = bVar;
            super(600, false, 2, null);
        }
    }

    public VideoCategoryViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.dq8);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tvVideoCategory)");
        this.f108199a = (DmtTextView) findViewById;
    }

    /* renamed from: a */
    public final void mo102255a(C41591b bVar, C7563m<? super Integer, ? super VideoCategoryParam, C7581n> mVar) {
        C7573i.m23587b(bVar, "model");
        C7573i.m23587b(mVar, "onSelected");
        if (bVar.f108090c != null) {
            this.f108199a.setText(bVar.f108090c.getCategoryName());
            this.f108199a.setOnClickListener(new C41631a(this, mVar, bVar, 600));
        }
    }
}
