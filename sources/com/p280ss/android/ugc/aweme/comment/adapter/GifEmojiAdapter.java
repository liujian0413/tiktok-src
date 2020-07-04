package com.p280ss.android.ugc.aweme.comment.adapter;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.view.C1156d;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.p280ss.android.ugc.aweme.comment.model.GifEmoji;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.GifEmojiAdapter */
public final class GifEmojiAdapter extends JediBaseSingleTypeAdapter<GifEmoji> {

    /* renamed from: c */
    private final C24081l f63666c;

    /* renamed from: a */
    public final JediViewHolder<? extends C11501d, GifEmoji> mo60559a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        return new SearchGifViewHolder<>(viewGroup, this.f63666c);
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        C1293v a_ = super.mo61886a_(viewGroup);
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            if (context != null) {
                View view = a_.itemView;
                if (!(view instanceof DmtStatusView)) {
                    view = null;
                }
                DmtStatusView dmtStatusView = (DmtStatusView) view;
                if (dmtStatusView != null) {
                    dmtStatusView.setLayoutParams(new LayoutParams(-2, -1));
                    int c = C0683b.m2912c(context, R.color.abk);
                    DmtTextView dmtTextView = new DmtTextView(new C1156d(context, R.style.ss));
                    dmtTextView.setTextColor(c);
                    dmtTextView.setText(R.string.b0i);
                    DmtTextView dmtTextView2 = new DmtTextView(new C1156d(context, R.style.ss));
                    dmtTextView2.setTextColor(c);
                    dmtTextView2.setText(R.string.am0);
                    dmtStatusView.setBuilder(C10803a.m31631a(context).mo25963b((View) dmtTextView2).mo25966c((View) dmtTextView));
                }
            }
        }
        C7573i.m23582a((Object) a_, "holder");
        return a_;
    }

    private GifEmojiAdapter(C0043i iVar, C24081l lVar, C11569b bVar) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(lVar, "gifEmojiActionListener");
        super(iVar, (C1147c<T>) new GifEmojiDiffer<T>(), bVar);
        this.f63666c = lVar;
    }

    public /* synthetic */ GifEmojiAdapter(C0043i iVar, C24081l lVar, C11569b bVar, int i, C7571f fVar) {
        this(iVar, lVar, null);
    }
}
