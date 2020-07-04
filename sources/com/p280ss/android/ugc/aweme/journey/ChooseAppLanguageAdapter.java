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
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.journey.ChooseAppLanguageAdapter */
public final class ChooseAppLanguageAdapter extends C1262a<ChooseAppLanguageViewHolder> {

    /* renamed from: a */
    public C7120e f84077a;

    /* renamed from: b */
    public final List<C7120e> f84078b;

    /* renamed from: c */
    public final C7562b<C7120e, C7581n> f84079c;

    /* renamed from: com.ss.android.ugc.aweme.journey.ChooseAppLanguageAdapter$ChooseAppLanguageViewHolder */
    public final class ChooseAppLanguageViewHolder extends C1293v {

        /* renamed from: a */
        final /* synthetic */ ChooseAppLanguageAdapter f84080a;

        /* renamed from: b */
        private final C32258p f84081b;

        /* renamed from: c */
        private final C32259q f84082c;

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00ad  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo83333a() {
            /*
                r4 = this;
                android.view.View r0 = r4.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                r1 = 2131296541(0x7f09011d, float:1.8211002E38)
                android.view.View r0 = r0.findViewById(r1)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
                java.lang.String r1 = "itemView.applanguage_name"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.ss.android.ugc.aweme.journey.ChooseAppLanguageAdapter r1 = r4.f84080a
                java.util.List<com.ss.android.ugc.aweme.language.e> r1 = r1.f84078b
                int r2 = r4.getAdapterPosition()
                java.lang.Object r1 = r1.get(r2)
                com.ss.android.ugc.aweme.language.e r1 = (com.p280ss.android.ugc.aweme.language.C7120e) r1
                java.lang.String r1 = r1.mo18535f()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                android.view.View r0 = r4.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                r1 = 2131297089(0x7f090341, float:1.8212113E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.lang.String r1 = "itemView.choose_img"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                com.ss.android.ugc.aweme.journey.ChooseAppLanguageAdapter r1 = r4.f84080a
                com.ss.android.ugc.aweme.language.e r1 = r1.f84077a
                r2 = 0
                if (r1 == 0) goto L_0x006f
                com.ss.android.ugc.aweme.journey.ChooseAppLanguageAdapter r1 = r4.f84080a
                java.util.List<com.ss.android.ugc.aweme.language.e> r1 = r1.f84078b
                int r3 = r4.getAdapterPosition()
                java.lang.Object r1 = r1.get(r3)
                com.ss.android.ugc.aweme.language.e r1 = (com.p280ss.android.ugc.aweme.language.C7120e) r1
                java.lang.String r1 = r1.mo18536g()
                com.ss.android.ugc.aweme.journey.ChooseAppLanguageAdapter r3 = r4.f84080a
                com.ss.android.ugc.aweme.language.e r3 = r3.f84077a
                if (r3 != 0) goto L_0x0063
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0063:
                java.lang.String r3 = r3.mo18536g()
                boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)
                if (r1 == 0) goto L_0x006f
                r1 = 1
                goto L_0x0070
            L_0x006f:
                r1 = 0
            L_0x0070:
                r0.setSelected(r1)
                android.view.View r0 = r4.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 == 0) goto L_0x00ad
                android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
                int r1 = r4.getAdapterPosition()
                if (r1 != 0) goto L_0x008b
                r0.topMargin = r2
                goto L_0x00a0
            L_0x008b:
                android.view.View r1 = r4.itemView
                java.lang.String r2 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                android.content.Context r1 = r1.getContext()
                r2 = 1090519040(0x41000000, float:8.0)
                float r1 = com.bytedance.common.utility.C9738o.m28708b(r1, r2)
                int r1 = (int) r1
                int r1 = -r1
                r0.topMargin = r1
            L_0x00a0:
                android.view.View r1 = r4.itemView
                java.lang.String r2 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
                r1.setLayoutParams(r0)
                return
            L_0x00ad:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.journey.ChooseAppLanguageAdapter.ChooseAppLanguageViewHolder.mo83333a():void");
        }

        public ChooseAppLanguageViewHolder(ChooseAppLanguageAdapter chooseAppLanguageAdapter, final View view) {
            C7573i.m23587b(view, "view");
            this.f84080a = chooseAppLanguageAdapter;
            super(view);
            C32258p pVar = new C32258p(C9738o.m28708b(view.getContext(), 8.0f), Blur.NORMAL, 0.0f, C9738o.m28708b(view.getContext(), 2.0f), Color.parseColor("#1f000000"), C9738o.m28708b(view.getContext(), 2.0f));
            this.f84081b = pVar;
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            Context context = view2.getContext();
            C7573i.m23582a((Object) context, "itemView.context");
            this.f84082c = new C32259q(context.getResources().getColor(R.color.az3), this.f84081b);
            C32259q qVar = this.f84082c;
            View view3 = this.itemView;
            C7573i.m23582a((Object) view3, "itemView");
            Context context2 = view3.getContext();
            C7573i.m23582a((Object) context2, "itemView.context");
            qVar.mo83481a(context2.getResources().getColor(R.color.li));
            view.setBackground(this.f84082c);
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ ChooseAppLanguageViewHolder f84083a;

                {
                    this.f84083a = r1;
                }

                public final void onClick(View view) {
                    C7120e eVar;
                    ClickInstrumentation.onClick(view);
                    ImageView imageView = (ImageView) view.findViewById(R.id.vt);
                    C7573i.m23582a((Object) imageView, "view.choose_img");
                    ImageView imageView2 = (ImageView) view.findViewById(R.id.vt);
                    C7573i.m23582a((Object) imageView2, "view.choose_img");
                    imageView.setSelected(!imageView2.isSelected());
                    if (this.f84083a.getAdapterPosition() >= 0) {
                        ChooseAppLanguageAdapter chooseAppLanguageAdapter = this.f84083a.f84080a;
                        ImageView imageView3 = (ImageView) view.findViewById(R.id.vt);
                        C7573i.m23582a((Object) imageView3, "view.choose_img");
                        if (imageView3.isSelected()) {
                            eVar = (C7120e) this.f84083a.f84080a.f84078b.get(this.f84083a.getAdapterPosition());
                        } else {
                            eVar = null;
                        }
                        chooseAppLanguageAdapter.f84077a = eVar;
                        this.f84083a.f84080a.notifyDataSetChanged();
                        this.f84083a.f84080a.f84079c.invoke(this.f84083a.f84080a.f84077a);
                    }
                }
            });
            view.setLayerType(1, null);
        }
    }

    public final int getItemCount() {
        return this.f84078b.size();
    }

    public final /* synthetic */ void onBindViewHolder(C1293v vVar, int i) {
        m104476a((ChooseAppLanguageViewHolder) vVar, i);
    }

    /* renamed from: a */
    private static void m104476a(ChooseAppLanguageViewHolder chooseAppLanguageViewHolder, int i) {
        C7573i.m23587b(chooseAppLanguageViewHolder, "p0");
        chooseAppLanguageViewHolder.mo83333a();
    }

    public ChooseAppLanguageAdapter(List<? extends C7120e> list, C7562b<? super C7120e, C7581n> bVar) {
        C7573i.m23587b(list, "language");
        C7573i.m23587b(bVar, "itemListner");
        this.f84078b = list;
        this.f84079c = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ChooseAppLanguageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wx, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new ChooseAppLanguageViewHolder(this, inflate);
    }
}
