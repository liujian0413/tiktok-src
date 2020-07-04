package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.bytedance.jedi.ext.adapter.multitype.C11743d.C11744a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.C25650d;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder;
import com.p280ss.android.ugc.aweme.profile.model.MediaMixList;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeAdapter */
public final class JediAwemeAdapter extends JediBaseMultiTypeAdapter<Object> {

    /* renamed from: c */
    public static final C35833a f93889c = new C35833a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeAdapter$a */
    public static final class C35833a {
        private C35833a() {
        }

        public /* synthetic */ C35833a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeAdapter$b */
    static final class C35834b extends Lambda implements C7562b<ViewGroup, JediAwemeVideoViewHolder> {

        /* renamed from: a */
        public static final C35834b f93890a = new C35834b();

        C35834b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m115671a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static JediAwemeVideoViewHolder m115671a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new JediAwemeVideoViewHolder(viewGroup, null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeAdapter$c */
    static final class C35835c extends Lambda implements C7562b<ViewGroup, JediAwemeImageViewHolder> {

        /* renamed from: a */
        public static final C35835c f93891a = new C35835c();

        C35835c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m115672a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static JediAwemeImageViewHolder m115672a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new JediAwemeImageViewHolder(viewGroup, null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeAdapter$d */
    static final class C35836d extends Lambda implements C7562b<ViewGroup, JediDraftVideoViewHolder> {

        /* renamed from: a */
        public static final C35836d f93892a = new C35836d();

        C35836d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m115673a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static JediDraftVideoViewHolder m115673a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new JediDraftVideoViewHolder(viewGroup, null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeAdapter$e */
    static final class C35837e extends Lambda implements C7562b<ViewGroup, JediLiveVideoViewHolder> {

        /* renamed from: a */
        public static final C35837e f93893a = new C35837e();

        C35837e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m115674a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static JediLiveVideoViewHolder m115674a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            Context context = viewGroup.getContext();
            if (context != null) {
                return new JediLiveVideoViewHolder(viewGroup, (FragmentActivity) context);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeAdapter$f */
    static final class C35838f extends Lambda implements C7562b<ViewGroup, MediaMixListViewHolder> {

        /* renamed from: a */
        public static final C35838f f93894a = new C35838f();

        C35838f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m115675a((ViewGroup) obj);
        }

        /* renamed from: a */
        private static MediaMixListViewHolder m115675a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return new MediaMixListViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeAdapter$g */
    static final class C35839g extends Lambda implements C7562b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeAdapter f93895a;

        /* renamed from: b */
        final /* synthetic */ int f93896b;

        C35839g(JediAwemeAdapter jediAwemeAdapter, int i) {
            this.f93895a = jediAwemeAdapter;
            this.f93896b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m115676a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        private boolean m115676a(int i) {
            int i2 = this.f93896b;
            int i3 = 2;
            Object a = this.f93895a.mo29135a(i, false);
            if (a instanceof MediaMixList) {
                i3 = 4;
            } else if (a instanceof RoomStruct) {
                i3 = 3;
            } else if (!(a instanceof C27311c)) {
                if (!(a instanceof Aweme)) {
                    a = null;
                }
                Aweme aweme = (Aweme) a;
                if (aweme == null || aweme.getAwemeType() != 2) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            }
            if (i2 == i3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        return this.f61299a.mo29318b(i);
    }

    /* renamed from: b */
    public final C7562b<Integer, Boolean> mo90806b(int i) {
        return new C35839g<>(this, i);
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (!(vVar instanceof C25650d)) {
            vVar = null;
        }
        C25650d dVar = (C25650d) vVar;
        if (dVar != null) {
            dVar.mo66492a(true);
        }
    }

    public final void onViewDetachedFromWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewDetachedFromWindow(vVar);
        if (!(vVar instanceof C25650d)) {
            vVar = null;
        }
        C25650d dVar = (C25650d) vVar;
        if (dVar != null) {
            dVar.mo66492a(false);
            dVar.bz_();
        }
    }

    /* renamed from: a */
    public final void mo60560a(C11743d<JediViewHolder<? extends C11501d, ?>> dVar) {
        C7573i.m23587b(dVar, "registry");
        C11743d<JediViewHolder<? extends C11501d, ?>> dVar2 = dVar;
        C11744a.m34438a((C11743d) dVar2, mo90806b(0), (C7563m) null, (C7562b) C35834b.f93890a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, mo90806b(1), (C7563m) null, (C7562b) C35835c.f93891a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, mo90806b(2), (C7563m) null, (C7562b) C35836d.f93892a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, mo90806b(3), (C7563m) null, (C7562b) C35837e.f93893a, 2, (Object) null);
        C11744a.m34438a((C11743d) dVar2, mo90806b(4), (C7563m) null, (C7562b) C35838f.f93894a, 2, (Object) null);
    }

    private JediAwemeAdapter(C0043i iVar, C11569b bVar) {
        C7573i.m23587b(iVar, "parent");
        super(iVar, (C1147c<T>) new AwemeDiff<T>(), bVar);
    }

    public /* synthetic */ JediAwemeAdapter(C0043i iVar, C11569b bVar, int i, C7571f fVar) {
        this(iVar, null);
    }
}
