package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.p280ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi.C27723a;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel;
import com.p280ss.android.ugc.aweme.poi.p335ui.SpaceDecoration;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJediV2 */
public final class ProfileCollectionAdapterForJediV2 extends JediBaseSingleTypeAdapter<C27707j> {

    /* renamed from: d */
    public static final C27726a f73109d = new C27726a(null);

    /* renamed from: c */
    public final C0043i f73110c;

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJediV2$ProfileCollectionViewHolderForJediV2 */
    public static final class ProfileCollectionViewHolderForJediV2 extends JediSimpleViewHolder<C27707j> {

        /* renamed from: f */
        static final /* synthetic */ C7595j[] f73111f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileCollectionViewHolderForJediV2.class), "profileCollectionViewModel", "getProfileCollectionViewModel()Lcom/ss/android/ugc/aweme/favorites/viewmodel/ProfileCollectionViewModel;"))};

        /* renamed from: g */
        public final ImageView f73112g;

        /* renamed from: j */
        public ProfileCollectionSubAdapterV2 f73113j;

        /* renamed from: k */
        public final View f73114k;

        /* renamed from: l */
        public final int f73115l;

        /* renamed from: m */
        private final ViewGroup f73116m;

        /* renamed from: n */
        private final DmtTextView f73117n;

        /* renamed from: o */
        private final DmtTextView f73118o;

        /* renamed from: p */
        private final RecyclerView f73119p;

        /* renamed from: q */
        private final ImageView f73120q;

        /* renamed from: r */
        private final C7541d f73121r;

        /* renamed from: p */
        private final ProfileCollectionViewModel m90899p() {
            return (ProfileCollectionViewModel) this.f73121r.getValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo29209a(C27707j jVar) {
            int i;
            C7573i.m23587b(jVar, "item");
            this.f73117n.setText(jVar.f73043a);
            String str = "";
            if (jVar.f73044b > 0) {
                StringBuilder sb = new StringBuilder(" ");
                sb.append(jVar.f73044b);
                str = sb.toString();
            }
            DmtTextView dmtTextView = this.f73118o;
            StringBuilder sb2 = new StringBuilder();
            Context context = this.f73114k.getContext();
            C7573i.m23582a((Object) context, "view.context");
            sb2.append(context.getResources().getString(R.string.d7e));
            sb2.append(str);
            dmtTextView.setText(sb2.toString());
            if (this.f73113j == null) {
                this.f73113j = new ProfileCollectionSubAdapterV2(m90899p());
                RecyclerView recyclerView = this.f73119p;
                ProfileCollectionSubAdapterV2 profileCollectionSubAdapterV2 = this.f73113j;
                if (profileCollectionSubAdapterV2 == null) {
                    C7573i.m23583a("mAdapter");
                }
                recyclerView.setAdapter(profileCollectionSubAdapterV2);
            }
            ImageView imageView = this.f73112g;
            int i2 = 8;
            if (jVar.f73050h) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            ProfileCollectionSubAdapterV2 profileCollectionSubAdapterV22 = this.f73113j;
            if (profileCollectionSubAdapterV22 == null) {
                C7573i.m23583a("mAdapter");
            }
            profileCollectionSubAdapterV22.mo71186a(jVar);
            ImageView imageView2 = this.f73120q;
            if (this.f31526i != this.f73115l - 1) {
                i2 = 0;
            }
            imageView2.setVisibility(i2);
        }

        public ProfileCollectionViewHolderForJediV2(View view, int i) {
            C7573i.m23587b(view, "view");
            super(view);
            this.f73114k = view;
            this.f73115l = i;
            View findViewById = this.f73114k.findViewById(R.id.a19);
            C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.container)");
            this.f73116m = (ViewGroup) findViewById;
            View findViewById2 = this.f73114k.findViewById(R.id.y8);
            C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.collect_type_title)");
            this.f73117n = (DmtTextView) findViewById2;
            View findViewById3 = this.f73114k.findViewById(R.id.y2);
            C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.collect_count)");
            this.f73118o = (DmtTextView) findViewById3;
            View findViewById4 = this.f73114k.findViewById(R.id.y5);
            C7573i.m23582a((Object) findViewById4, "view.findViewById(R.id.collect_recycler)");
            this.f73119p = (RecyclerView) findViewById4;
            View findViewById5 = this.f73114k.findViewById(R.id.a9o);
            C7573i.m23582a((Object) findViewById5, "view.findViewById(R.id.divide_line)");
            this.f73120q = (ImageView) findViewById5;
            View findViewById6 = this.f73114k.findViewById(R.id.c5f);
            C7573i.m23582a((Object) findViewById6, "view.findViewById(R.id.notice_dot)");
            this.f73112g = (ImageView) findViewById6;
            C7584c a = C7575l.m23595a(ProfileCollectionViewModel.class);
            this.f73121r = C7546e.m23569a(new C27727x36a8246b(this, a, a));
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            this.f73119p.setLayoutManager(new WrapLinearLayoutManager(view2.getContext(), 0, false));
            View view3 = this.itemView;
            C7573i.m23582a((Object) view3, "itemView");
            this.f73119p.mo5525a((C1272h) new SpaceDecoration(0, (int) C9738o.m28708b(view3.getContext(), 6.0f)));
            this.f73116m.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ ProfileCollectionViewHolderForJediV2 f73122a;

                {
                    this.f73122a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    int a = C27723a.m90895a(Integer.valueOf(((C27707j) this.f73122a.mo29309o()).f73046d));
                    String b = C27723a.m90896b(Integer.valueOf(((C27707j) this.f73122a.mo29309o()).f73046d));
                    StringBuilder sb = new StringBuilder("aweme://favorite?");
                    sb.append("index=");
                    sb.append(a);
                    sb.append("&enter_from=personal_homepage&enter_method=click_collection_section&tab_name=");
                    sb.append(b);
                    C7195s.m22438a().mo18682a(sb.toString());
                    this.f73122a.f73112g.setVisibility(8);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJediV2$a */
    public static final class C27726a {
        private C27726a() {
        }

        public /* synthetic */ C27726a(C7571f fVar) {
            this();
        }
    }

    public ProfileCollectionAdapterForJediV2(C0043i iVar) {
        C7573i.m23587b(iVar, "parent");
        super(iVar, new ProfileCollectionDifferV2(), null, 4, null);
        this.f73110c = iVar;
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11501d, C27707j> mo60559a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a10, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…ection_v2, parent, false)");
        return new ProfileCollectionViewHolderForJediV2<>(inflate, aC_().mo29143a());
    }
}
