package com.p280ss.android.ugc.aweme.journey;

import android.content.Context;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Color;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.journey.ContentLanguageAdapter */
public final class ContentLanguageAdapter extends C1262a<ContentLanguageViewHolder> {

    /* renamed from: a */
    public final LinkedHashSet<Integer> f84085a = new LinkedHashSet<>();

    /* renamed from: b */
    public final C7562b<Integer, C7581n> f84086b;

    /* renamed from: c */
    private final List<C32232e> f84087c;

    /* renamed from: com.ss.android.ugc.aweme.journey.ContentLanguageAdapter$ContentLanguageViewHolder */
    public final class ContentLanguageViewHolder extends C1293v {

        /* renamed from: a */
        final /* synthetic */ ContentLanguageAdapter f84088a;

        /* renamed from: b */
        private final C32258p f84089b;

        /* renamed from: c */
        private final C32259q f84090c;

        public ContentLanguageViewHolder(ContentLanguageAdapter contentLanguageAdapter, View view) {
            C7573i.m23587b(view, "view");
            this.f84088a = contentLanguageAdapter;
            super(view);
            C32258p pVar = new C32258p(C9738o.m28708b(view.getContext(), 8.0f), Blur.NORMAL, 0.0f, C9738o.m28708b(view.getContext(), 2.0f), Color.parseColor("#1f000000"), C9738o.m28708b(view.getContext(), 2.0f));
            this.f84089b = pVar;
            this.f84090c = new C32259q(view.getResources().getColor(R.color.az3), this.f84089b);
            C32259q qVar = this.f84090c;
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            Context context = view2.getContext();
            C7573i.m23582a((Object) context, "itemView.context");
            qVar.mo83481a(context.getResources().getColor(R.color.li));
            view.setBackground(this.f84090c);
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ ContentLanguageViewHolder f84091a;

                {
                    this.f84091a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    View view2 = this.f84091a.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    ImageView imageView = (ImageView) view2.findViewById(R.id.vf);
                    C7573i.m23582a((Object) imageView, "itemView.check_img");
                    if (imageView.isSelected()) {
                        this.f84091a.f84088a.f84085a.remove(Integer.valueOf(this.f84091a.getAdapterPosition()));
                    } else {
                        this.f84091a.f84088a.f84085a.add(Integer.valueOf(this.f84091a.getAdapterPosition()));
                    }
                    View view3 = this.f84091a.itemView;
                    C7573i.m23582a((Object) view3, "itemView");
                    ImageView imageView2 = (ImageView) view3.findViewById(R.id.vf);
                    C7573i.m23582a((Object) imageView2, "itemView.check_img");
                    View view4 = this.f84091a.itemView;
                    C7573i.m23582a((Object) view4, "itemView");
                    ImageView imageView3 = (ImageView) view4.findViewById(R.id.vf);
                    C7573i.m23582a((Object) imageView3, "itemView.check_img");
                    imageView2.setSelected(!imageView3.isSelected());
                    this.f84091a.f84088a.f84086b.invoke(Integer.valueOf(this.f84091a.f84088a.f84085a.size()));
                }
            });
            view.setLayerType(1, null);
        }

        /* renamed from: a */
        public final void mo83335a(C32232e eVar, boolean z) {
            C7573i.m23587b(eVar, "contentLanguage");
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            ImageView imageView = (ImageView) view.findViewById(R.id.vf);
            C7573i.m23582a((Object) imageView, "itemView.check_img");
            imageView.setSelected(z);
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.aev);
            C7573i.m23582a((Object) dmtTextView, "itemView.english");
            dmtTextView.setText(eVar.f84180b);
            View view3 = this.itemView;
            C7573i.m23582a((Object) view3, "itemView");
            DmtTextView dmtTextView2 = (DmtTextView) view3.findViewById(R.id.bud);
            C7573i.m23582a((Object) dmtTextView2, "itemView.local_language");
            dmtTextView2.setText(eVar.f84181c);
            View view4 = this.itemView;
            C7573i.m23582a((Object) view4, "itemView");
            LayoutParams layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (getAdapterPosition() <= 1) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    View view5 = this.itemView;
                    C7573i.m23582a((Object) view5, "itemView");
                    marginLayoutParams.topMargin = -((int) C9738o.m28708b(view5.getContext(), 8.0f));
                }
                if (getAdapterPosition() % 2 == 0) {
                    marginLayoutParams.leftMargin = 0;
                } else {
                    View view6 = this.itemView;
                    C7573i.m23582a((Object) view6, "itemView");
                    marginLayoutParams.leftMargin = -((int) C9738o.m28708b(view6.getContext(), 8.0f));
                }
                View view7 = this.itemView;
                C7573i.m23582a((Object) view7, "itemView");
                view7.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final int getItemCount() {
        return this.f84087c.size();
    }

    public ContentLanguageAdapter(List<C32232e> list, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(list, "contentLanguage");
        C7573i.m23587b(bVar, "sizeListner");
        this.f84087c = list;
        this.f84086b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ContentLanguageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wy, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new ContentLanguageViewHolder(this, inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ContentLanguageViewHolder contentLanguageViewHolder, int i) {
        C7573i.m23587b(contentLanguageViewHolder, "p0");
        contentLanguageViewHolder.mo83335a((C32232e) this.f84087c.get(i), this.f84085a.contains(Integer.valueOf(i)));
    }
}
