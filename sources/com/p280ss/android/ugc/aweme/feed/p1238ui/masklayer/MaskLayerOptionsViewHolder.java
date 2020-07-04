package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.C28927a.C28928a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsViewHolder */
public final class MaskLayerOptionsViewHolder extends C1293v {

    /* renamed from: c */
    public static final C28926a f76258c = new C28926a(null);

    /* renamed from: a */
    public ImageView f76259a;

    /* renamed from: b */
    public TextView f76260b;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsViewHolder$a */
    public static final class C28926a {
        private C28926a() {
        }

        /* renamed from: a */
        private static int m95140a() {
            if (C28928a.m95144b()) {
                return R.layout.lm;
            }
            return R.layout.ll;
        }

        public /* synthetic */ C28926a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final MaskLayerOptionsViewHolder mo74222a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(m95140a(), viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new MaskLayerOptionsViewHolder(inflate);
        }
    }

    public MaskLayerOptionsViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.d4_);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.shade_item_icon)");
        this.f76259a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.d4a);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.shade_item_name)");
        this.f76260b = (TextView) findViewById2;
    }
}
