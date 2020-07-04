package com.p280ss.android.ugc.aweme.miniapp.appgroup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d.C33372a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.CollectionMicroAppAdapter */
public final class CollectionMicroAppAdapter extends C1262a<C1293v> {

    /* renamed from: c */
    public static final C33353b f87145c = new C33353b(null);

    /* renamed from: a */
    public ArrayList<C33371d> f87146a = new ArrayList<>();

    /* renamed from: b */
    public final Context f87147b;

    /* renamed from: d */
    private final C25674b<C33365a> f87148d;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.CollectionMicroAppAdapter$a */
    static final class C33352a extends C1293v {

        /* renamed from: a */
        public TextView f87149a;

        public C33352a(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.dxv);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.…icro_app_collection_hint)");
            this.f87149a = (TextView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.CollectionMicroAppAdapter$b */
    static final class C33353b {
        private C33353b() {
        }

        public /* synthetic */ C33353b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.CollectionMicroAppAdapter$c */
    static final class C33354c extends C1293v {

        /* renamed from: a */
        public TextView f87150a;

        public C33354c(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.dxv);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.…icro_app_collection_hint)");
            this.f87150a = (TextView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.CollectionMicroAppAdapter$d */
    static final class C33355d extends Lambda implements C7562b<C33371d, Boolean> {

        /* renamed from: a */
        final /* synthetic */ CollectionMicroAppAdapter f87151a;

        /* renamed from: b */
        final /* synthetic */ int f87152b;

        C33355d(CollectionMicroAppAdapter collectionMicroAppAdapter, int i) {
            this.f87151a = collectionMicroAppAdapter;
            this.f87152b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m107904a((C33371d) obj));
        }

        /* renamed from: a */
        private boolean m107904a(C33371d dVar) {
            C7573i.m23587b(dVar, "it");
            if (this.f87151a.f87146a.indexOf(dVar) > this.f87152b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.CollectionMicroAppAdapter$e */
    public static final class C33356e extends C42939as {

        /* renamed from: a */
        final /* synthetic */ CollectionMicroAppAdapter f87153a;

        /* renamed from: b */
        final /* synthetic */ C1293v f87154b;

        /* renamed from: c */
        final /* synthetic */ IMiniAppService f87155c;

        /* renamed from: d */
        final /* synthetic */ MicroAppInfo f87156d;

        /* renamed from: a */
        public final void mo70606a(View view) {
            boolean z;
            C33472a c = new C33472a().mo85791b("setting_page").mo85792c("021001");
            Iterator it = this.f87153a.f87146a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C33371d) it.next()).f87194a == C33372a.m107936b()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (((MicroAppItemViewHolder) this.f87154b).getAdapterPosition() < i) {
                c.mo85789a("recently");
            } else {
                c.mo85789a("collection");
            }
            this.f87155c.openMiniApp(this.f87153a.f87147b, this.f87156d, c.mo85790a());
        }

        C33356e(CollectionMicroAppAdapter collectionMicroAppAdapter, C1293v vVar, IMiniAppService iMiniAppService, MicroAppInfo microAppInfo) {
            this.f87153a = collectionMicroAppAdapter;
            this.f87154b = vVar;
            this.f87155c = iMiniAppService;
            this.f87156d = microAppInfo;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.CollectionMicroAppAdapter$f */
    public static final class C33357f extends C42939as {

        /* renamed from: a */
        final /* synthetic */ CollectionMicroAppAdapter f87157a;

        C33357f(CollectionMicroAppAdapter collectionMicroAppAdapter) {
            this.f87157a = collectionMicroAppAdapter;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            Context context = this.f87157a.f87147b;
            if (context != null) {
                context.startActivity(new Intent(context, RecentlyUsedMicroAppActivity.class));
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    activity.overridePendingTransition(R.anim.c5, R.anim.cd);
                }
                C6907h.m21524a("click_more_recently_mp_button", (Map) C22984d.m75611a().mo59973a("enter_from", "setting_page").f60753a);
            }
        }
    }

    public final int getItemCount() {
        return this.f87146a.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 == null) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85539a() {
        /*
            r8 = this;
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.d> r0 = r8.f87146a
            com.ss.android.ugc.aweme.miniapp.appgroup.d r7 = new com.ss.android.ugc.aweme.miniapp.appgroup.d
            int r2 = com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d.C33372a.m107938d()
            android.content.Context r1 = r8.f87147b
            if (r1 == 0) goto L_0x0018
            r3 = 2131821761(0x7f1104c1, float:1.9276274E38)
            java.lang.String r1 = r1.getString(r3)
            if (r1 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r4 = r1
            goto L_0x001b
        L_0x0018:
            java.lang.String r1 = "暂无收藏历史"
            goto L_0x0016
        L_0x001b:
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.add(r7)
            r8.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.miniapp.appgroup.CollectionMicroAppAdapter.mo85539a():void");
    }

    /* renamed from: b */
    public final void mo85541b() {
        ArrayList<C33371d> arrayList = this.f87146a;
        C33371d dVar = new C33371d(C33372a.m107935a(), null, null, 6, null);
        arrayList.add(dVar);
        ArrayList<C33371d> arrayList2 = this.f87146a;
        C33371d dVar2 = new C33371d(C33372a.m107936b(), null, null, 6, null);
        arrayList2.add(dVar2);
    }

    public final int getItemViewType(int i) {
        if (i < 0 || i >= this.f87146a.size()) {
            return 0;
        }
        return ((C33371d) this.f87146a.get(i)).f87194a;
    }

    /* renamed from: a */
    public final void mo85540a(List<? extends MicroAppInfo> list) {
        boolean z;
        boolean z2;
        if (!C6307b.m19566a((Collection<T>) list)) {
            Iterator it = this.f87146a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C33371d) it.next()).f87194a == C33372a.m107936b()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i++;
            }
            Iterable iterable = this.f87146a;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (this.f87146a.indexOf((C33371d) next) <= i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            this.f87146a = new ArrayList<>((List) arrayList);
            this.f87146a.addAll(i + 1, C33371d.f87192i.mo85552a(list));
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo85542b(List<? extends MicroAppInfo> list) {
        boolean z;
        if (!C6307b.m19566a((Collection<T>) list)) {
            Iterator it = this.f87146a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C33371d) it.next()).f87194a == C33372a.m107936b()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            C7525m.m23480a((List<T>) this.f87146a, (C7562b<? super T, Boolean>) new C33355d<Object,Boolean>(this, i));
            this.f87146a.addAll(C33371d.f87192i.mo85552a(list));
            notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r2 == null) goto L_0x0079;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85543c(java.util.List<? extends com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo> r10) {
        /*
            r9 = this;
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.d> r0 = r9.f87146a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.d> r0 = r9.f87146a
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x0013:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r0.next()
            com.ss.android.ugc.aweme.miniapp.appgroup.d r3 = (com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d) r3
            int r3 = r3.f87194a
            int r4 = com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d.C33372a.m107936b()
            if (r3 != r4) goto L_0x0029
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 == 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0030:
            r2 = -1
        L_0x0031:
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.d> r0 = r9.f87146a
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.d> r3 = r9.f87146a
            java.util.List r2 = r3.subList(r1, r2)
            java.lang.String r3 = "groupMicroApps.subList(0, collectionBlockIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r0.removeAll(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.ss.android.ugc.aweme.miniapp.appgroup.d r8 = new com.ss.android.ugc.aweme.miniapp.appgroup.d
            int r3 = com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d.C33372a.m107935a()
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r8)
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.collection.C6307b.m19566a(r2)
            if (r2 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.miniapp.appgroup.d r10 = new com.ss.android.ugc.aweme.miniapp.appgroup.d
            int r4 = com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d.C33372a.m107938d()
            r5 = 0
            android.content.Context r2 = r9.f87147b
            if (r2 == 0) goto L_0x0079
            r3 = 2131826117(0x7f1115c5, float:1.928511E38)
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r6 = r2
            goto L_0x007c
        L_0x0079:
            java.lang.String r2 = "暂无使用记录"
            goto L_0x0077
        L_0x007c:
            r7 = 2
            r8 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r10)
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.d> r10 = r9.f87146a
            java.util.Collection r0 = (java.util.Collection) r0
            r10.addAll(r1, r0)
            r9.notifyDataSetChanged()
            return
        L_0x0090:
            if (r10 == 0) goto L_0x0097
            int r2 = r10.size()
            goto L_0x0098
        L_0x0097:
            r2 = 0
        L_0x0098:
            r3 = 3
            if (r2 <= r3) goto L_0x00c1
            com.ss.android.ugc.aweme.miniapp.appgroup.d$a r2 = com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d.f87192i
            if (r10 != 0) goto L_0x00a2
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a2:
            java.util.List r10 = r10.subList(r1, r3)
            java.util.ArrayList r10 = r2.mo85552a(r10)
            java.util.Collection r10 = (java.util.Collection) r10
            r0.addAll(r10)
            com.ss.android.ugc.aweme.miniapp.appgroup.d r10 = new com.ss.android.ugc.aweme.miniapp.appgroup.d
            int r3 = com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d.C33372a.m107939e()
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r10)
            goto L_0x00cc
        L_0x00c1:
            com.ss.android.ugc.aweme.miniapp.appgroup.d$a r2 = com.p280ss.android.ugc.aweme.miniapp.appgroup.C33371d.f87192i
            java.util.ArrayList r10 = r2.mo85552a(r10)
            java.util.Collection r10 = (java.util.Collection) r10
            r0.addAll(r10)
        L_0x00cc:
            java.util.ArrayList<com.ss.android.ugc.aweme.miniapp.appgroup.d> r10 = r9.f87146a
            java.util.Collection r0 = (java.util.Collection) r0
            r10.addAll(r1, r0)
            r9.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.miniapp.appgroup.CollectionMicroAppAdapter.mo85543c(java.util.List):void");
    }

    public CollectionMicroAppAdapter(Context context, C25674b<C33365a> bVar) {
        C7573i.m23587b(bVar, "mPresenter");
        this.f87147b = context;
        this.f87148d = bVar;
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        String str = null;
        if (i == C33372a.m107935a()) {
            View inflate = LayoutInflater.from(this.f87147b).inflate(R.layout.adp, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(mCon…item_view, parent, false)");
            C33352a aVar = new C33352a(inflate);
            TextView textView = aVar.f87149a;
            Context context = this.f87147b;
            if (context != null) {
                Resources resources = context.getResources();
                if (resources != null) {
                    str = resources.getString(R.string.c9p);
                }
            }
            textView.setText(str);
            return aVar;
        } else if (i == C33372a.m107936b()) {
            View inflate2 = LayoutInflater.from(this.f87147b).inflate(R.layout.adp, viewGroup, false);
            C7573i.m23582a((Object) inflate2, "LayoutInflater.from(mCon…item_view, parent, false)");
            C33352a aVar2 = new C33352a(inflate2);
            TextView textView2 = aVar2.f87149a;
            Context context2 = this.f87147b;
            if (context2 != null) {
                Resources resources2 = context2.getResources();
                if (resources2 != null) {
                    str = resources2.getString(R.string.c9n);
                }
            }
            textView2.setText(str);
            return aVar2;
        } else if (i == C33372a.m107938d()) {
            View inflate3 = LayoutInflater.from(this.f87147b).inflate(R.layout.ado, viewGroup, false);
            C7573i.m23582a((Object) inflate3, "LayoutInflater.from(mCon…xt_layout, parent, false)");
            return new C33354c(inflate3);
        } else if (i == C33372a.m107937c() || i == C33372a.m107939e()) {
            View inflate4 = LayoutInflater.from(this.f87147b).inflate(R.layout.adn, viewGroup, false);
            C7573i.m23582a((Object) inflate4, "LayoutInflater.from(mCon…em_layout, parent, false)");
            return new MicroAppItemViewHolder(inflate4);
        } else {
            throw new IllegalArgumentException("wrong type");
        }
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        CharSequence charSequence;
        C7573i.m23587b(vVar, "holder");
        int i2 = vVar.mItemViewType;
        String str = null;
        if (i2 == C33372a.m107937c()) {
            MicroAppItemViewHolder microAppItemViewHolder = (MicroAppItemViewHolder) vVar;
            microAppItemViewHolder.f87176b.setVisibility(0);
            C7167b b = C7167b.m22380b();
            C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
            IMiniAppService a = b.mo18647a();
            MicroAppInfo microAppInfo = ((C33371d) this.f87146a.get(i)).f87195b;
            if (microAppInfo != null) {
                a.preloadMiniApp(microAppInfo.getAppId(), microAppInfo.getType());
            } else {
                microAppInfo = null;
            }
            DmtTextView dmtTextView = microAppItemViewHolder.f87176b;
            if (microAppInfo != null) {
                charSequence = microAppInfo.getName();
            } else {
                charSequence = null;
            }
            dmtTextView.setText(charSequence);
            SimpleDraweeView simpleDraweeView = microAppItemViewHolder.f87175a;
            if (microAppInfo != null) {
                str = microAppInfo.getIcon();
            }
            simpleDraweeView.setImageURI(str);
            vVar.itemView.setOnClickListener(new C33356e(this, vVar, a, microAppInfo));
            if (i == C7525m.m23459a((List<? extends T>) this.f87146a)) {
                C25673a aVar = (C25673a) this.f87148d.mo66539h();
                C7573i.m23582a((Object) aVar, "mPresenter.model");
                if (!((C33365a) aVar).isHasMore()) {
                    View view = vVar.itemView;
                    C7573i.m23582a((Object) view, "holder.itemView");
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        GridLayoutManager.LayoutParams layoutParams2 = (GridLayoutManager.LayoutParams) layoutParams;
                        layoutParams2.setMargins(0, 0, 0, C23486n.m77122a(68.0d));
                        View view2 = vVar.itemView;
                        C7573i.m23582a((Object) view2, "holder.itemView");
                        view2.setLayoutParams(layoutParams2);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager.LayoutParams");
                }
            }
            View view3 = vVar.itemView;
            C7573i.m23582a((Object) view3, "holder.itemView");
            LayoutParams layoutParams3 = view3.getLayoutParams();
            if (layoutParams3 != null) {
                GridLayoutManager.LayoutParams layoutParams4 = (GridLayoutManager.LayoutParams) layoutParams3;
                layoutParams4.setMargins(0, 0, 0, 0);
                View view4 = vVar.itemView;
                C7573i.m23582a((Object) view4, "holder.itemView");
                view4.setLayoutParams(layoutParams4);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager.LayoutParams");
        } else if (i2 == C33372a.m107939e()) {
            MicroAppItemViewHolder microAppItemViewHolder2 = (MicroAppItemViewHolder) vVar;
            DmtTextView dmtTextView2 = microAppItemViewHolder2.f87176b;
            Context context = this.f87147b;
            if (context != null) {
                str = context.getString(R.string.c_z);
            }
            dmtTextView2.setText(str);
            microAppItemViewHolder2.f87175a.setImageResource(R.drawable.ack);
            vVar.itemView.setOnClickListener(new C33357f(this));
        } else {
            if (i2 == C33372a.m107938d()) {
                ((C33354c) vVar).f87150a.setText(((C33371d) this.f87146a.get(i)).f87196c);
            }
        }
    }
}
