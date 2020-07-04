package com.p280ss.android.ugc.aweme.journey;

import android.content.Context;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.journey.InterestAdapter */
public final class InterestAdapter extends C1262a<InterestViewHolder> {

    /* renamed from: a */
    public final LinkedHashSet<Integer> f84128a = new LinkedHashSet<>();

    /* renamed from: b */
    public final List<C32246j> f84129b;

    /* renamed from: c */
    public final C7562b<Integer, C7581n> f84130c;

    /* renamed from: com.ss.android.ugc.aweme.journey.InterestAdapter$InterestViewHolder */
    public final class InterestViewHolder extends C1293v {

        /* renamed from: a */
        public final int f84131a;

        /* renamed from: b */
        final /* synthetic */ InterestAdapter f84132b;

        /* renamed from: c */
        private final C32258p f84133c;

        /* renamed from: d */
        private final C32259q f84134d;

        /* renamed from: e */
        private final C32259q f84135e;

        /* renamed from: a */
        public final void mo83352a() {
            C32246j jVar = (C32246j) this.f84132b.f84129b.get(getAdapterPosition());
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.text);
            C7573i.m23582a((Object) dmtTextView, "itemView.text");
            dmtTextView.setText(jVar.f84278b);
            m104499a(this.f84132b.f84128a.contains(Integer.valueOf(getAdapterPosition())));
        }

        /* renamed from: a */
        private void m104499a(boolean z) {
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.b2n);
            C7573i.m23582a((Object) constraintLayout, "itemView.interest_root");
            constraintLayout.setSelected(z);
            if (z) {
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.b2n);
                C7573i.m23582a((Object) constraintLayout2, "itemView.interest_root");
                constraintLayout2.setBackground(this.f84135e);
                View view3 = this.itemView;
                C7573i.m23582a((Object) view3, "itemView");
                ConstraintLayout constraintLayout3 = (ConstraintLayout) view3.findViewById(R.id.b2n);
                C7573i.m23582a((Object) constraintLayout3, "itemView.interest_root");
                ((SmartImageView) constraintLayout3.findViewById(R.id.ayn)).setImageResource(R.drawable.a54);
                View view4 = this.itemView;
                C7573i.m23582a((Object) view4, "itemView");
                ConstraintLayout constraintLayout4 = (ConstraintLayout) view4.findViewById(R.id.b2n);
                C7573i.m23582a((Object) constraintLayout4, "itemView.interest_root");
                DmtTextView dmtTextView = (DmtTextView) constraintLayout4.findViewById(R.id.text);
                View view5 = this.itemView;
                C7573i.m23582a((Object) view5, "itemView");
                dmtTextView.setTextColor(view5.getResources().getColor(R.color.lt));
                return;
            }
            View view6 = this.itemView;
            C7573i.m23582a((Object) view6, "itemView");
            ConstraintLayout constraintLayout5 = (ConstraintLayout) view6.findViewById(R.id.b2n);
            C7573i.m23582a((Object) constraintLayout5, "itemView.interest_root");
            constraintLayout5.setBackground(this.f84134d);
            View view7 = this.itemView;
            C7573i.m23582a((Object) view7, "itemView");
            ConstraintLayout constraintLayout6 = (ConstraintLayout) view7.findViewById(R.id.b2n);
            C7573i.m23582a((Object) constraintLayout6, "itemView.interest_root");
            DmtTextView dmtTextView2 = (DmtTextView) constraintLayout6.findViewById(R.id.text);
            View view8 = this.itemView;
            C7573i.m23582a((Object) view8, "itemView");
            Context context = view8.getContext();
            C7573i.m23582a((Object) context, "itemView.context");
            dmtTextView2.setTextColor(context.getResources().getColor(R.color.lw));
            String str = ((C32246j) this.f84132b.f84129b.get(getAdapterPosition())).f84279c;
            if (str == null) {
                str = "";
            }
            C12139r a = C12133n.m35301a(str).mo29836a(this.f84131a, this.f84131a).mo29845a("NewUserJourneyActivity");
            View view9 = this.itemView;
            C7573i.m23582a((Object) view9, "itemView");
            ConstraintLayout constraintLayout7 = (ConstraintLayout) view9.findViewById(R.id.b2n);
            C7573i.m23582a((Object) constraintLayout7, "itemView.interest_root");
            a.mo29844a((C12128i) (SmartImageView) constraintLayout7.findViewById(R.id.ayn)).mo29848a();
        }

        public InterestViewHolder(InterestAdapter interestAdapter, View view) {
            C7573i.m23587b(view, "view");
            this.f84132b = interestAdapter;
            super(view);
            C32258p pVar = new C32258p(C9738o.m28708b(view.getContext(), 8.0f), Blur.NORMAL, 0.0f, C9738o.m28708b(view.getContext(), 2.0f), Color.parseColor("#1f000000"), C9738o.m28708b(view.getContext(), 24.0f));
            this.f84133c = pVar;
            this.f84134d = new C32259q(view.getResources().getColor(R.color.az3), this.f84133c);
            this.f84135e = new C32259q(view.getResources().getColor(R.color.lo), this.f84133c);
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            this.f84131a = (int) C9738o.m28708b(view2.getContext(), 28.0f);
            C32259q qVar = this.f84134d;
            View view3 = this.itemView;
            C7573i.m23582a((Object) view3, "itemView");
            Context context = view3.getContext();
            C7573i.m23582a((Object) context, "itemView.context");
            qVar.mo83481a(context.getResources().getColor(R.color.li));
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ InterestViewHolder f84136a;

                {
                    this.f84136a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    View view2 = this.f84136a.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.b2n);
                    C7573i.m23582a((Object) constraintLayout, "itemView.interest_root");
                    if (constraintLayout.isSelected()) {
                        this.f84136a.f84132b.f84128a.remove(Integer.valueOf(this.f84136a.getAdapterPosition()));
                    } else {
                        this.f84136a.f84132b.f84128a.add(Integer.valueOf(this.f84136a.getAdapterPosition()));
                    }
                    this.f84136a.f84132b.notifyItemChanged(this.f84136a.getAdapterPosition());
                    this.f84136a.f84132b.f84130c.invoke(Integer.valueOf(this.f84136a.f84132b.f84128a.size()));
                }
            });
            view.setLayerType(1, null);
        }
    }

    public final int getItemCount() {
        return this.f84129b.size();
    }

    public final /* synthetic */ void onBindViewHolder(C1293v vVar, int i) {
        m104498a((InterestViewHolder) vVar, i);
    }

    /* renamed from: a */
    private static void m104498a(InterestViewHolder interestViewHolder, int i) {
        C7573i.m23587b(interestViewHolder, "p0");
        interestViewHolder.mo83352a();
    }

    public InterestAdapter(List<C32246j> list, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(list, "newUserInterestStruct");
        C7573i.m23587b(bVar, "sizeListner");
        this.f84129b = list;
        this.f84130c = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public InterestViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wz, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new InterestViewHolder(this, inflate);
    }
}
