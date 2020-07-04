package com.p280ss.android.ugc.aweme.property;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.property.PropertyStore.PropertyType;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.property.ABPageViewAdapter */
public final class ABPageViewAdapter extends C1262a<AbPageViewHolder> {

    /* renamed from: b */
    public static final C36928a f96772b = new C36928a(null);

    /* renamed from: a */
    public C7562b<? super String, C7581n> f96773a;

    /* renamed from: c */
    private C36969j f96774c;

    /* renamed from: d */
    private Language f96775d;

    /* renamed from: com.ss.android.ugc.aweme.property.ABPageViewAdapter$AbEffectInHouseViewHolder */
    public static final class AbEffectInHouseViewHolder extends AbPageViewHolder {
        public AbEffectInHouseViewHolder(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            Context context = viewGroup.getContext();
            C7573i.m23582a((Object) context, "parent.context");
            AVABEffectInHouseView aVABEffectInHouseView = new AVABEffectInHouseView(context, null, 0, 6, null);
            super(aVABEffectInHouseView);
        }

        /* renamed from: a */
        public final void mo93296a(C36956b bVar) {
            C7573i.m23587b(bVar, "itemBean");
            View view = this.f96776a;
            if (view != null) {
                ((AVABEffectInHouseView) view).setABDetailItem(bVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.property.AVABEffectInHouseView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ABPageViewAdapter$AbPageViewHolder */
    public static class AbPageViewHolder extends C1293v {

        /* renamed from: a */
        public final View f96776a;

        public AbPageViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            linearLayout.setOrientation(1);
            super(linearLayout);
            this.f96776a = view;
            View view2 = this.itemView;
            if (view2 != null) {
                ((ViewGroup) view2).addView(view);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ABPageViewAdapter$AbRangeViewHolder */
    public static final class AbRangeViewHolder extends AbPageViewHolder {
        public AbRangeViewHolder(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            super(new AVABRangeView(viewGroup.getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ABPageViewAdapter$AbStateViewHolder */
    public static final class AbStateViewHolder extends AbPageViewHolder {
        public AbStateViewHolder(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            super(new AVABStateView(viewGroup.getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ABPageViewAdapter$AbTextViewHolder */
    public static final class AbTextViewHolder extends AbPageViewHolder {

        /* renamed from: com.ss.android.ugc.aweme.property.ABPageViewAdapter$AbTextViewHolder$a */
        static final class C36927a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C36960f f96777a;

            C36927a(C36960f fVar) {
                this.f96777a = fVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C7562b<View, C7581n> bVar = this.f96777a.f96863i;
                C7573i.m23582a((Object) view, "it");
                bVar.invoke(view);
            }
        }

        public AbTextViewHolder(Context context) {
            C7573i.m23587b(context, "context");
            TextView textView = new TextView(context);
            int a = C23486n.m77122a(16.0d);
            textView.setBackgroundColor(-1);
            textView.setTextColor(-16777216);
            textView.setTextSize(1, 15.0f);
            textView.setPadding(a, 0, a, a);
            super(textView);
        }

        /* renamed from: a */
        public final void mo93297a(C36960f fVar) {
            C7573i.m23587b(fVar, "itemBean");
            View view = this.f96776a;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.setText(fVar.f96862h);
                textView.setOnClickListener(new C36927a(fVar));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ABPageViewAdapter$a */
    public static final class C36928a {
        private C36928a() {
        }

        public /* synthetic */ C36928a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ABPageViewAdapter$b */
    static final class C36929b implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ ABPageViewAdapter f96778a;

        /* renamed from: b */
        final /* synthetic */ C36957c f96779b;

        C36929b(ABPageViewAdapter aBPageViewAdapter, C36957c cVar) {
            this.f96778a = aBPageViewAdapter;
            this.f96779b = cVar;
        }

        public final boolean onLongClick(View view) {
            ABPageViewAdapter.m118815a(this.f96778a).invoke(this.f96779b.f96851e);
            return true;
        }
    }

    public final int getItemCount() {
        return this.f96774c.f96873a;
    }

    /* renamed from: a */
    public final void mo93295a(C7562b<? super String, C7581n> bVar) {
        C7573i.m23587b(bVar, "showDetailMsg");
        this.f96773a = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C7562b m118815a(ABPageViewAdapter aBPageViewAdapter) {
        C7562b<? super String, C7581n> bVar = aBPageViewAdapter.f96773a;
        if (bVar == null) {
            C7573i.m23583a("showDetailMsg");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo93293a(Language language) {
        C7573i.m23587b(language, "type");
        this.f96775d = language;
        notifyDataSetChanged();
    }

    public final int getItemViewType(int i) {
        C36957c a = this.f96774c.mo93388a(i);
        if (a instanceof C36960f) {
            return 3;
        }
        if (a instanceof C36956b) {
            return 2;
        }
        PropertyType type = a.f96852f.type();
        if (type != null && C36958d.f96854a[type.ordinal()] == 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo93294a(C36969j jVar) {
        C7573i.m23587b(jVar, "data");
        this.f96774c = jVar;
        notifyDataSetChanged();
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m118814a(viewGroup, i);
    }

    public ABPageViewAdapter(C36969j jVar, Language language) {
        C7573i.m23587b(jVar, "showedAbItemsData");
        C7573i.m23587b(language, "languageType");
        this.f96774c = jVar;
        this.f96775d = language;
    }

    /* renamed from: a */
    private final void m118816a(View view, C36957c cVar) {
        view.setOnLongClickListener(new C36929b(this, cVar));
    }

    /* renamed from: a */
    private static AbPageViewHolder m118814a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        switch (i) {
            case 0:
                return new AbRangeViewHolder(viewGroup);
            case 1:
                return new AbStateViewHolder(viewGroup);
            case 2:
                return new AbEffectInHouseViewHolder(viewGroup);
            case 3:
                Context context = viewGroup.getContext();
                C7573i.m23582a((Object) context, "parent.context");
                return new AbTextViewHolder(context);
            default:
                throw new AssertionError();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(AbPageViewHolder abPageViewHolder, int i) {
        C7573i.m23587b(abPageViewHolder, "holder");
        C36957c a = this.f96774c.mo93388a(i);
        String str = a.f96849c;
        String str2 = a.f96850d;
        if (a instanceof C36960f) {
            ((AbTextViewHolder) abPageViewHolder).mo93297a((C36960f) a);
        } else if (a instanceof C36956b) {
            ((AbEffectInHouseViewHolder) abPageViewHolder).mo93296a((C36956b) a);
        } else {
            PropertyType type = a.f96852f.type();
            if (type != null && C36958d.f96855b[type.ordinal()] == 1) {
                View view = abPageViewHolder.f96776a;
                if (view != null) {
                    AVABStateView aVABStateView = (AVABStateView) view;
                    aVABStateView.mo93335a(a.f96852f, str);
                    if (this.f96775d == Language.EngAndChi) {
                        aVABStateView.setSubText(str2);
                    } else {
                        aVABStateView.setSubText("");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.property.AVABStateView");
                }
            } else {
                View view2 = abPageViewHolder.f96776a;
                if (view2 != null) {
                    AVABRangeView aVABRangeView = (AVABRangeView) view2;
                    aVABRangeView.mo93328a(a.f96852f, str);
                    if (this.f96775d == Language.EngAndChi) {
                        aVABRangeView.setSubText(str2);
                    } else {
                        aVABRangeView.setSubText("");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.property.AVABRangeView");
                }
            }
            View view3 = abPageViewHolder.itemView;
            C7573i.m23582a((Object) view3, "holder.itemView");
            m118816a(view3, a);
        }
    }
}
