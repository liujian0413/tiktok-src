package com.p280ss.android.ugc.aweme.emoji.emojichoose.indicator;

import android.content.res.Resources;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.p280ss.android.ugc.aweme.emoji.base.BaseViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.indicator.EmojiIndicatorAdapter */
public class EmojiIndicatorAdapter extends C1262a<IndicatorViewHolder> {

    /* renamed from: a */
    public int f72718a;

    /* renamed from: b */
    public int f72719b;

    /* renamed from: c */
    private List<C27593a> f72720c = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.indicator.EmojiIndicatorAdapter$IndicatorViewHolder */
    public static class IndicatorViewHolder extends BaseViewHolder<C27593a> {

        /* renamed from: a */
        private ImageView f72721a;

        /* renamed from: b */
        private int f72722b;

        /* renamed from: c */
        private int f72723c;

        /* renamed from: b */
        private void m90438b(C27593a aVar) {
            int i;
            LayoutParams layoutParams = (LayoutParams) this.f72721a.getLayoutParams();
            if (aVar.f72725b == R.drawable.zv) {
                i = this.f72723c;
            } else {
                i = this.f72722b;
            }
            layoutParams.height = i;
            layoutParams.width = i;
            this.f72721a.setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        public final void mo70724a(C27593a aVar) {
            super.mo70724a(aVar);
            m90438b(aVar);
            this.f72721a.setSelected(aVar.f72724a);
            this.f72721a.setImageResource(aVar.f72725b);
        }

        IndicatorViewHolder(View view) {
            super(view);
            Resources resources = view.getResources();
            this.f72721a = (ImageView) view.findViewById(R.id.b_e);
            this.f72722b = resources.getDimensionPixelSize(R.dimen.gn);
            this.f72723c = resources.getDimensionPixelSize(R.dimen.go);
        }
    }

    public int getItemCount() {
        return this.f72720c.size();
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m90435a(viewGroup, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(IndicatorViewHolder indicatorViewHolder, int i) {
        indicatorViewHolder.mo70724a((C27593a) this.f72720c.get(i));
    }

    /* renamed from: a */
    private static IndicatorViewHolder m90435a(ViewGroup viewGroup, int i) {
        return new IndicatorViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lx, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo70837a(int i, int i2, int i3) {
        this.f72718a = i;
        this.f72720c.clear();
        for (int i4 = 0; i4 < i; i4++) {
            C27593a aVar = new C27593a();
            if (i4 == 0 && i3 == 4) {
                aVar.f72725b = R.drawable.zv;
            } else {
                aVar.f72725b = R.drawable.zs;
            }
            this.f72720c.add(aVar);
            if (i4 == i2) {
                this.f72719b = i2;
                ((C27593a) this.f72720c.get(i2)).f72724a = true;
            }
        }
        notifyDataSetChanged();
    }
}
