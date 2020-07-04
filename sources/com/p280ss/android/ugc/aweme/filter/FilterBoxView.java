package com.p280ss.android.ugc.aweme.filter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.recyclerview.extensions.ListAdapter;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.google.common.collect.C17794bt;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.widget.AbstractLoadingLayout;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxView */
public final class FilterBoxView extends AbstractLoadingLayout {

    /* renamed from: j */
    public static final C29158a f76944j = new C29158a(null);

    /* renamed from: f */
    public C29159b f76945f;

    /* renamed from: g */
    public C29315j f76946g;

    /* renamed from: h */
    public Drawable f76947h;

    /* renamed from: i */
    public Drawable f76948i;

    /* renamed from: k */
    private final AVDmtPanelRecyleView f76949k;

    /* renamed from: l */
    private final AVDmtPanelRecyleView f76950l;

    /* renamed from: m */
    private C17794bt<EffectCategoryModel, C29324o> f76951m;

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxView$DetailAdapter */
    public final class DetailAdapter extends ListAdapter<C29324o, ViewHolder> {

        /* renamed from: b */
        private ContextWrapper f76953b;

        /* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxView$DetailAdapter$ViewHolder */
        public final class ViewHolder extends C1293v {

            /* renamed from: a */
            public final TextView f76954a;

            /* renamed from: b */
            public final int f76955b;

            /* renamed from: c */
            final /* synthetic */ DetailAdapter f76956c;

            /* renamed from: d */
            private final CircleImageView f76957d;

            /* renamed from: e */
            private final ImageView f76958e;

            /* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxView$DetailAdapter$ViewHolder$a */
            static final class C29155a extends Lambda implements C7561a<C7581n> {

                /* renamed from: a */
                final /* synthetic */ ViewHolder f76962a;

                C29155a(ViewHolder viewHolder) {
                    this.f76962a = viewHolder;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    m95663a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m95663a() {
                    if (this.f76962a.getAdapterPosition() >= 0) {
                        C29324o oVar = (C29324o) this.f76962a.f76956c.mo4535a(this.f76962a.getAdapterPosition());
                        if (oVar != null) {
                            oVar.f77320o = "filter_box";
                        }
                        FilterBoxView filterBoxView = FilterBoxView.this;
                        C7573i.m23582a((Object) oVar, "item");
                        EffectCategoryModel a = filterBoxView.mo74675a(oVar);
                        if (oVar.f77318m) {
                            C29159b bVar = FilterBoxView.this.f76945f;
                            if (bVar != null) {
                                bVar.mo74686a(a, oVar);
                            }
                        } else {
                            oVar.f77317l = !oVar.f77317l;
                            this.f76962a.mo74681a(oVar);
                            if (ViewHolder.m95661b(oVar)) {
                                C29159b bVar2 = FilterBoxView.this.f76945f;
                                if (bVar2 != null) {
                                    bVar2.mo74687b(a, oVar);
                                }
                            } else {
                                C29159b bVar3 = FilterBoxView.this.f76945f;
                                if (bVar3 != null) {
                                    bVar3.mo74688c(a, oVar);
                                }
                            }
                        }
                    }
                }
            }

            /* renamed from: b */
            public static boolean m95661b(C29324o oVar) {
                return oVar.f77317l;
            }

            /* renamed from: a */
            public final void mo74681a(C29324o oVar) {
                Drawable drawable;
                float f;
                C7573i.m23587b(oVar, "filterBean");
                C23323e.m76514a((RemoteImageView) this.f76957d, oVar.f77271f.toString());
                this.f76954a.setText(oVar.f77267b);
                ImageView imageView = this.f76958e;
                if (oVar.f77317l) {
                    drawable = FilterBoxView.this.f76948i;
                } else {
                    drawable = FilterBoxView.this.f76947h;
                }
                imageView.setImageDrawable(drawable);
                if (oVar.f77318m) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                imageView.setAlpha(f);
            }

            public ViewHolder(DetailAdapter detailAdapter, final LinearLayout linearLayout) {
                C7573i.m23587b(linearLayout, "itemView");
                this.f76956c = detailAdapter;
                super(linearLayout);
                View childAt = linearLayout.getChildAt(0);
                if (childAt != null) {
                    this.f76957d = (CircleImageView) childAt;
                    View childAt2 = linearLayout.getChildAt(1);
                    if (childAt2 != null) {
                        this.f76954a = (TextView) childAt2;
                        View childAt3 = linearLayout.getChildAt(2);
                        if (childAt3 != null) {
                            this.f76958e = (ImageView) childAt3;
                            this.f76955b = C42111b.f109618a.mo103542a(false, false, false, false, true);
                            final C7561a aVar = new C29155a(this);
                            linearLayout.setOnClickListener(new OnClickListener() {
                                public final void onClick(View view) {
                                    ClickInstrumentation.onClick(view);
                                    aVar.invoke();
                                }
                            });
                            linearLayout.setOnTouchListener(new OnTouchListener(this) {

                                /* renamed from: a */
                                final /* synthetic */ ViewHolder f76960a;

                                {
                                    this.f76960a = r1;
                                }

                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    C7573i.m23582a((Object) motionEvent, "event");
                                    if (motionEvent.getAction() == 1) {
                                        ObjectAnimator ofInt = ObjectAnimator.ofInt(linearLayout, "backgroundColor", new int[]{this.f76960a.f76955b, 16777215});
                                        C7573i.m23582a((Object) ofInt, "animator");
                                        ofInt.setDuration(500);
                                        ofInt.setEvaluator(new ArgbEvaluator());
                                        ofInt.start();
                                    }
                                    return false;
                                }
                            });
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.CircleImageView");
            }
        }

        public DetailAdapter() {
            super(new C1147c<C29324o>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
                    return m95657a((C29324o) obj, (C29324o) obj2);
                }

                /* renamed from: b */
                public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
                    return m95658b((C29324o) obj, (C29324o) obj2);
                }

                /* renamed from: a */
                private static boolean m95657a(C29324o oVar, C29324o oVar2) {
                    C7573i.m23587b(oVar, "p0");
                    C7573i.m23587b(oVar2, "p1");
                    return C7573i.m23585a((Object) oVar.f77267b, (Object) oVar2.f77267b);
                }

                /* renamed from: b */
                private static boolean m95658b(C29324o oVar, C29324o oVar2) {
                    C7573i.m23587b(oVar, "p0");
                    C7573i.m23587b(oVar2, "p1");
                    return C7573i.m23585a((Object) oVar.f77267b, (Object) oVar2.f77267b);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            C7573i.m23587b(viewHolder, "viewHolder");
            Object a = mo4535a(i);
            C7573i.m23582a(a, "getItem(position)");
            viewHolder.mo74681a((C29324o) a);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            if (this.f76953b == null) {
                this.f76953b = new ContextWrapper(viewGroup.getContext());
            }
            ContextWrapper contextWrapper = this.f76953b;
            if (contextWrapper == null) {
                C7573i.m23580a();
            }
            View inflate = LayoutInflater.from(contextWrapper).inflate(R.layout.fz, viewGroup, false);
            if (inflate != null) {
                return new ViewHolder(this, (LinearLayout) inflate);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxView$MasterAdapter */
    public final class MasterAdapter extends ListAdapter<EffectCategoryModel, ViewHolder> {

        /* renamed from: a */
        public String f76963a;

        /* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxView$MasterAdapter$ViewHolder */
        public final class ViewHolder extends C1293v {

            /* renamed from: a */
            public final TextView f76965a;

            /* renamed from: b */
            final /* synthetic */ MasterAdapter f76966b;

            public ViewHolder(MasterAdapter masterAdapter, FrameLayout frameLayout) {
                C7573i.m23587b(frameLayout, "itemView");
                this.f76966b = masterAdapter;
                super(frameLayout);
                View childAt = frameLayout.getChildAt(0);
                if (childAt != null) {
                    this.f76965a = (TextView) childAt;
                    frameLayout.setOnFocusChangeListener(new OnFocusChangeListener(this) {

                        /* renamed from: a */
                        final /* synthetic */ ViewHolder f76967a;

                        {
                            this.f76967a = r1;
                        }

                        public final void onFocusChange(View view, boolean z) {
                            if (z) {
                                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) this.f76967a.f76966b.mo4535a(this.f76967a.getAdapterPosition());
                                FilterBoxView filterBoxView = FilterBoxView.this;
                                C7573i.m23582a((Object) effectCategoryModel, "item");
                                filterBoxView.mo74676a(effectCategoryModel);
                                this.f76967a.f76966b.f76963a = effectCategoryModel.name;
                                this.f76967a.f76966b.notifyDataSetChanged();
                            }
                        }
                    });
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }

            /* renamed from: a */
            public final void mo74684a(EffectCategoryModel effectCategoryModel, boolean z) {
                float f;
                C7573i.m23587b(effectCategoryModel, "item");
                this.f76965a.setText(effectCategoryModel.name);
                TextView textView = this.f76965a;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                textView.setAlpha(f);
                if (z) {
                    this.f76965a.setTypeface(this.f76965a.getTypeface(), 1);
                } else {
                    this.f76965a.setTypeface(C10832b.m31784a().mo26161a(C10834d.f29337g));
                }
            }
        }

        public MasterAdapter() {
            super(new C1147c<EffectCategoryModel>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
                    return m95666a((EffectCategoryModel) obj, (EffectCategoryModel) obj2);
                }

                /* renamed from: b */
                public final /* bridge */ /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
                    return m95667b((EffectCategoryModel) obj, (EffectCategoryModel) obj2);
                }

                /* renamed from: a */
                private static boolean m95666a(EffectCategoryModel effectCategoryModel, EffectCategoryModel effectCategoryModel2) {
                    C7573i.m23587b(effectCategoryModel, "p0");
                    C7573i.m23587b(effectCategoryModel2, "p1");
                    return C7573i.m23585a((Object) effectCategoryModel.name, (Object) effectCategoryModel2.name);
                }

                /* renamed from: b */
                private static boolean m95667b(EffectCategoryModel effectCategoryModel, EffectCategoryModel effectCategoryModel2) {
                    C7573i.m23587b(effectCategoryModel, "p0");
                    C7573i.m23587b(effectCategoryModel2, "p1");
                    return C7573i.m23585a((Object) effectCategoryModel.name, (Object) effectCategoryModel2.name);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g0, viewGroup, false);
            if (inflate != null) {
                return new ViewHolder(this, (FrameLayout) inflate);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            boolean z;
            C7573i.m23587b(viewHolder, "viewHolder");
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) mo4535a(i);
            if (this.f76963a == null) {
                C7573i.m23582a((Object) effectCategoryModel, "item");
                this.f76963a = effectCategoryModel.name;
                z = true;
            } else {
                String str = this.f76963a;
                C7573i.m23582a((Object) effectCategoryModel, "item");
                z = C7573i.m23585a((Object) str, (Object) effectCategoryModel.name);
            }
            viewHolder.mo74684a(effectCategoryModel, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxView$SpaceItemDecoration */
    public final class SpaceItemDecoration extends C1272h {

        /* renamed from: b */
        private final int f76969b;

        public SpaceItemDecoration(int i) {
            this.f76969b = i;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            C7573i.m23587b(rect, "outRect");
            C7573i.m23587b(view, "view");
            C7573i.m23587b(recyclerView, "parent");
            C7573i.m23587b(sVar, "state");
            if (RecyclerView.m5892f(view) == 0) {
                rect.top = this.f76969b;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxView$a */
    public static final class C29158a {
        private C29158a() {
        }

        public /* synthetic */ C29158a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterBoxView$b */
    public interface C29159b {
        /* renamed from: a */
        void mo74686a(EffectCategoryModel effectCategoryModel, C29324o oVar);

        /* renamed from: b */
        void mo74687b(EffectCategoryModel effectCategoryModel, C29324o oVar);

        /* renamed from: c */
        void mo74688c(EffectCategoryModel effectCategoryModel, C29324o oVar);
    }

    public final C29315j getDependency() {
        C29315j jVar = this.f76946g;
        if (jVar == null) {
            C7573i.m23583a("dependency");
        }
        return jVar;
    }

    public final void setCallback(C29159b bVar) {
        this.f76945f = bVar;
    }

    public final void setDependency(C29315j jVar) {
        C7573i.m23587b(jVar, "<set-?>");
        this.f76946g = jVar;
    }

    /* renamed from: a */
    public final void mo74676a(EffectCategoryModel effectCategoryModel) {
        C7573i.m23587b(effectCategoryModel, "item");
        m95648b(effectCategoryModel);
    }

    /* renamed from: b */
    private final void m95648b(EffectCategoryModel effectCategoryModel) {
        List list;
        C1262a adapter = this.f76950l.getAdapter();
        if (adapter != null) {
            DetailAdapter detailAdapter = (DetailAdapter) adapter;
            if (effectCategoryModel == null) {
                list = C7525m.m23461a();
            } else {
                C17794bt<EffectCategoryModel, C29324o> btVar = this.f76951m;
                if (btVar != null) {
                    list = btVar.get(effectCategoryModel);
                } else {
                    list = null;
                }
                if (list == null) {
                    C7573i.m23580a();
                }
            }
            detailAdapter.mo4536a(list);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.FilterBoxView.DetailAdapter");
    }

    public final void setCategoryMap(C17794bt<EffectCategoryModel, C29324o> btVar) {
        C7573i.m23587b(btVar, "categoryMap");
        setState(0);
        this.f76951m = btVar;
        MasterAdapter masterAdapter = new MasterAdapter();
        this.f76949k.setAdapter(masterAdapter);
        Set elementSet = btVar.keys().elementSet();
        C7573i.m23582a((Object) elementSet, "categoryMap.keys().elementSet()");
        masterAdapter.mo4536a(C7525m.m23516h((Iterable<? extends T>) elementSet));
        Set elementSet2 = btVar.keys().elementSet();
        C7573i.m23582a((Object) elementSet2, "categoryMap.keys().elementSet()");
        m95648b((EffectCategoryModel) C7525m.m23513g(C7525m.m23516h((Iterable<? extends T>) elementSet2)));
    }

    public FilterBoxView(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        Context context2 = getContext();
        C7573i.m23582a((Object) context2, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView = new AVDmtPanelRecyleView(context2, null, 0, 6, null);
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView.getContext(), 1, false));
        aVDmtPanelRecyleView.setAdapter(new MasterAdapter());
        aVDmtPanelRecyleView.mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(aVDmtPanelRecyleView.getContext(), 8.0f)));
        this.f76949k = aVDmtPanelRecyleView;
        this.f76949k.setSecondPanel(true);
        Context context3 = getContext();
        C7573i.m23582a((Object) context3, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = new AVDmtPanelRecyleView(context3, null, 0, 6, null);
        aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView2.getContext(), 1, false));
        aVDmtPanelRecyleView2.setAdapter(new DetailAdapter());
        aVDmtPanelRecyleView2.mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(aVDmtPanelRecyleView2.getContext(), 8.0f)));
        this.f76950l = aVDmtPanelRecyleView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.f76949k, new LayoutParams(0, -1, 1.0f));
        linearLayout.addView(this.f76950l, new LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        int b = C42111b.f109618a.mo103546b(false);
        Context context4 = getContext();
        C7573i.m23582a((Object) context4, "context");
        this.f76947h = C42111b.m134051a(context4.getResources().getDrawable(R.drawable.a53), b);
        Context context5 = getContext();
        C7573i.m23582a((Object) context5, "context");
        this.f76948i = context5.getResources().getDrawable(R.drawable.a4i);
    }

    /* renamed from: a */
    public final EffectCategoryModel mo74675a(C29324o oVar) {
        C7573i.m23587b(oVar, "filter");
        try {
            C17794bt<EffectCategoryModel, C29324o> btVar = this.f76951m;
            if (btVar == null) {
                C7573i.m23580a();
            }
            Collection entries = btVar.entries();
            C7573i.m23582a((Object) entries, "categoryMap!!.entries()");
            for (Object next : entries) {
                Object value = ((Entry) next).getValue();
                C7573i.m23582a(value, "entry.value");
                if (C7573i.m23585a((Object) ((C29324o) value).f77267b, (Object) oVar.f77267b)) {
                    Object key = ((Entry) next).getKey();
                    C7573i.m23582a(key, "categoryMap!!.entries().…r.name)\n            }.key");
                    return (EffectCategoryModel) key;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException e) {
            StringBuilder sb = new StringBuilder("filter.name=");
            sb.append(oVar.f77267b);
            sb.append(", category.names=");
            C17794bt<EffectCategoryModel, C29324o> btVar2 = this.f76951m;
            if (btVar2 == null) {
                C7573i.m23580a();
            }
            Collection values = btVar2.values();
            C7573i.m23582a((Object) values, "categoryMap!!.values()");
            Iterable<C29324o> iterable = values;
            Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
            for (C29324o oVar2 : iterable) {
                C7573i.m23582a((Object) oVar2, "it");
                arrayList.add(oVar2.f77267b);
            }
            sb.append((List) arrayList);
            C41530am.m132283b(sb.toString());
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo66618a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.mo66618a(i, i2);
        int i6 = 0;
        if (this.f67668a != null) {
            View view = this.f67668a;
            C7573i.m23582a((Object) view, "mContentView");
            if (i2 == 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            view.setVisibility(i5);
        }
        View view2 = this.f67669b;
        C7573i.m23582a((Object) view2, "mLoadingView");
        if (i2 == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.f67671d;
        C7573i.m23582a((Object) view3, "mErrorView");
        if (i2 == 2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.f67670c;
        C7573i.m23582a((Object) view4, "mEmptyView");
        if (i2 != 3) {
            i6 = 8;
        }
        view4.setVisibility(i6);
    }

    public FilterBoxView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
        Context context2 = getContext();
        C7573i.m23582a((Object) context2, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView = new AVDmtPanelRecyleView(context2, null, 0, 6, null);
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView.getContext(), 1, false));
        aVDmtPanelRecyleView.setAdapter(new MasterAdapter());
        aVDmtPanelRecyleView.mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(aVDmtPanelRecyleView.getContext(), 8.0f)));
        this.f76949k = aVDmtPanelRecyleView;
        this.f76949k.setSecondPanel(true);
        Context context3 = getContext();
        C7573i.m23582a((Object) context3, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = new AVDmtPanelRecyleView(context3, null, 0, 6, null);
        aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView2.getContext(), 1, false));
        aVDmtPanelRecyleView2.setAdapter(new DetailAdapter());
        aVDmtPanelRecyleView2.mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(aVDmtPanelRecyleView2.getContext(), 8.0f)));
        this.f76950l = aVDmtPanelRecyleView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.f76949k, new LayoutParams(0, -1, 1.0f));
        linearLayout.addView(this.f76950l, new LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        int b = C42111b.f109618a.mo103546b(false);
        Context context4 = getContext();
        C7573i.m23582a((Object) context4, "context");
        this.f76947h = C42111b.m134051a(context4.getResources().getDrawable(R.drawable.a53), b);
        Context context5 = getContext();
        C7573i.m23582a((Object) context5, "context");
        this.f76948i = context5.getResources().getDrawable(R.drawable.a4i);
    }

    /* renamed from: a */
    public final View mo66617a(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        return new DmtLoadingLayout(context, attributeSet, i);
    }

    /* renamed from: b */
    public final View mo66620b(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        return new Space(context);
    }

    /* renamed from: c */
    public final View mo66621c(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        return new Space(context);
    }

    public FilterBoxView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
        Context context2 = getContext();
        C7573i.m23582a((Object) context2, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView = new AVDmtPanelRecyleView(context2, null, 0, 6, null);
        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView.getContext(), 1, false));
        aVDmtPanelRecyleView.setAdapter(new MasterAdapter());
        aVDmtPanelRecyleView.mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(aVDmtPanelRecyleView.getContext(), 8.0f)));
        this.f76949k = aVDmtPanelRecyleView;
        this.f76949k.setSecondPanel(true);
        Context context3 = getContext();
        C7573i.m23582a((Object) context3, "context");
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = new AVDmtPanelRecyleView(context3, null, 0, 6, null);
        aVDmtPanelRecyleView2.setLayoutManager(new LinearLayoutManager(aVDmtPanelRecyleView2.getContext(), 1, false));
        aVDmtPanelRecyleView2.setAdapter(new DetailAdapter());
        aVDmtPanelRecyleView2.mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(aVDmtPanelRecyleView2.getContext(), 8.0f)));
        this.f76950l = aVDmtPanelRecyleView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.f76949k, new LayoutParams(0, -1, 1.0f));
        linearLayout.addView(this.f76950l, new LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        int b = C42111b.f109618a.mo103546b(false);
        Context context4 = getContext();
        C7573i.m23582a((Object) context4, "context");
        this.f76947h = C42111b.m134051a(context4.getResources().getDrawable(R.drawable.a53), b);
        Context context5 = getContext();
        C7573i.m23582a((Object) context5, "context");
        this.f76948i = context5.getResources().getDrawable(R.drawable.a4i);
    }
}
