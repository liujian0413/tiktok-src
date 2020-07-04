package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.support.p029v7.util.C1143a.C1147c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter;
import com.p280ss.android.ugc.aweme.following.model.C29574i;
import com.p280ss.android.ugc.aweme.following.model.C29575j;
import com.p280ss.android.ugc.aweme.following.model.RelationDiff;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.ConnectedRelationItemView;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewholder.ConnectedRelationContactViewHolder;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewholder.ConnectedRelationViewHolder;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewholder.RecommendRelationTitleViewHolder;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendContactItemView;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecommendUserItemView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter */
public final class ConnectedRelationAdapter extends JediBaseMultiTypeAdapter<Object> {

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter$a */
    static final class C29716a extends Lambda implements C7562b<ViewGroup, ConnectedRelationViewHolder> {

        /* renamed from: a */
        public static final C29716a f78195a = new C29716a();

        C29716a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97418a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static ConnectedRelationViewHolder m97418a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            Context context = viewGroup.getContext();
            C7573i.m23582a((Object) context, "it.context");
            ConnectedRelationItemView connectedRelationItemView = new ConnectedRelationItemView(context, null, 0, 6, null);
            return new ConnectedRelationViewHolder(connectedRelationItemView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter$b */
    static final class C29717b extends Lambda implements C7562b<ViewGroup, ConnectedRelationViewHolder> {

        /* renamed from: a */
        public static final C29717b f78196a = new C29717b();

        C29717b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97419a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static ConnectedRelationViewHolder m97419a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            Context context = viewGroup.getContext();
            C7573i.m23582a((Object) context, "it.context");
            RecommendUserItemView recommendUserItemView = new RecommendUserItemView(context, null, 0, 6, null);
            return new ConnectedRelationViewHolder(recommendUserItemView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter$c */
    static final class C29718c extends Lambda implements C7562b<ViewGroup, RecommendRelationTitleViewHolder> {

        /* renamed from: a */
        public static final C29718c f78197a = new C29718c();

        C29718c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97420a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static RecommendRelationTitleViewHolder m97420a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u6, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new RecommendRelationTitleViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter$d */
    static final class C29719d extends Lambda implements C7562b<ViewGroup, RecommendRelationTitleViewHolder> {

        /* renamed from: a */
        public static final C29719d f78198a = new C29719d();

        C29719d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97421a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static RecommendRelationTitleViewHolder m97421a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u6, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new RecommendRelationTitleViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter$e */
    static final class C29720e extends Lambda implements C7562b<ViewGroup, ConnectedRelationContactViewHolder> {

        /* renamed from: a */
        public static final C29720e f78199a = new C29720e();

        C29720e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97422a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static ConnectedRelationContactViewHolder m97422a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            Context context = viewGroup.getContext();
            C7573i.m23582a((Object) context, "it.context");
            RecommendContactItemView recommendContactItemView = new RecommendContactItemView(context, null, 0, 6, null);
            recommendContactItemView.setEnterFrom("common_relation");
            return new ConnectedRelationContactViewHolder(recommendContactItemView);
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        Object a = mo29135a(i, false);
        if (a instanceof C29574i) {
            return ((C29574i) a).f77946a;
        }
        if (a instanceof C29575j) {
            return ((C29575j) a).f77948a;
        }
        if (a instanceof RecommendContact) {
            return 3;
        }
        return 5;
    }

    /* renamed from: a */
    public final void mo60560a(C11743d<JediViewHolder<? extends C11501d, ?>> dVar) {
        C7573i.m23587b(dVar, "registry");
        C11743d<JediViewHolder<? extends C11501d, ?>> dVar2 = dVar;
        dVar2.mo29314a(5, null, (C7562b<? super ViewGroup, ? extends VH>) C29716a.f78195a);
        dVar2.mo29314a(2, null, (C7562b<? super ViewGroup, ? extends VH>) C29717b.f78196a);
        dVar2.mo29314a(6, null, (C7562b<? super ViewGroup, ? extends VH>) C29718c.f78197a);
        dVar2.mo29314a(4, null, (C7562b<? super ViewGroup, ? extends VH>) C29719d.f78198a);
        dVar2.mo29314a(3, null, (C7562b<? super ViewGroup, ? extends VH>) C29720e.f78199a);
    }

    private ConnectedRelationAdapter(C0043i iVar, C11569b bVar) {
        C7573i.m23587b(iVar, "parent");
        super(iVar, (C1147c<T>) new RelationDiff<T>(), bVar);
    }

    public /* synthetic */ ConnectedRelationAdapter(C0043i iVar, C11569b bVar, int i, C7571f fVar) {
        this(iVar, null);
    }
}
