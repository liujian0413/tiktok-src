package com.p280ss.android.ugc.aweme.favorites.adapter;

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
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
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

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi */
public final class ProfileCollectionAdapterForJedi extends JediBaseSingleTypeAdapter<C27707j> {

    /* renamed from: c */
    public static final C27723a f73100c = new C27723a(null);

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi$ProfileCollectionViewHolderForJedi */
    public static final class ProfileCollectionViewHolderForJedi extends JediSimpleViewHolder<C27707j> {

        /* renamed from: f */
        static final /* synthetic */ C7595j[] f73101f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileCollectionViewHolderForJedi.class), "profileCollectionViewModel", "getProfileCollectionViewModel()Lcom/ss/android/ugc/aweme/favorites/viewmodel/ProfileCollectionViewModel;"))};

        /* renamed from: g */
        public ProfileCollectionSubAdapter f73102g;

        /* renamed from: j */
        public final View f73103j;

        /* renamed from: k */
        private final DmtTextView f73104k;

        /* renamed from: l */
        private final RecyclerView f73105l;

        /* renamed from: m */
        private final ImageView f73106m;

        /* renamed from: n */
        private final C7541d f73107n;

        /* renamed from: p */
        private final ProfileCollectionViewModel m90893p() {
            return (ProfileCollectionViewModel) this.f73107n.getValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo29209a(C27707j jVar) {
            String str;
            int i;
            C7573i.m23587b(jVar, "item");
            DmtTextView dmtTextView = this.f73104k;
            if (jVar.f73044b > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(jVar.f73043a);
                sb.append(' ');
                sb.append(jVar.f73044b);
                str = sb.toString();
            } else {
                str = jVar.f73043a;
            }
            dmtTextView.setText(str);
            if (this.f73102g == null) {
                this.f73102g = new ProfileCollectionSubAdapter(m90893p());
                RecyclerView recyclerView = this.f73105l;
                ProfileCollectionSubAdapter profileCollectionSubAdapter = this.f73102g;
                if (profileCollectionSubAdapter == null) {
                    C7573i.m23583a("mAdapter");
                }
                recyclerView.setAdapter(profileCollectionSubAdapter);
            }
            ImageView imageView = this.f73106m;
            if (jVar.f73050h) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            ProfileCollectionSubAdapter profileCollectionSubAdapter2 = this.f73102g;
            if (profileCollectionSubAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            profileCollectionSubAdapter2.mo71181a(jVar);
        }

        public ProfileCollectionViewHolderForJedi(View view) {
            C7573i.m23587b(view, "view");
            super(view);
            this.f73103j = view;
            View findViewById = this.f73103j.findViewById(R.id.y8);
            C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.collect_type_title)");
            this.f73104k = (DmtTextView) findViewById;
            View findViewById2 = this.f73103j.findViewById(R.id.y5);
            C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.collect_recycler)");
            this.f73105l = (RecyclerView) findViewById2;
            View findViewById3 = this.f73103j.findViewById(R.id.c5f);
            C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.notice_dot)");
            this.f73106m = (ImageView) findViewById3;
            C7584c a = C7575l.m23595a(ProfileCollectionViewModel.class);
            this.f73107n = C7546e.m23569a(new C27724xe7592bab(this, a, a));
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            this.f73105l.setLayoutManager(new WrapLinearLayoutManager(view2.getContext(), 0, false));
            RecyclerView recyclerView = this.f73105l;
            View view3 = this.itemView;
            C7573i.m23582a((Object) view3, "itemView");
            recyclerView.mo5525a((C1272h) new DividerItemDecoration(0, (int) C9738o.m28708b(view3.getContext(), 3.5f), 0));
            this.f73103j.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ ProfileCollectionViewHolderForJedi f73108a;

                {
                    this.f73108a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    int a = C27723a.m90895a(Integer.valueOf(((C27707j) this.f73108a.mo29309o()).f73046d));
                    String b = C27723a.m90896b(Integer.valueOf(((C27707j) this.f73108a.mo29309o()).f73046d));
                    StringBuilder sb = new StringBuilder("aweme://favorite?");
                    sb.append("index=");
                    sb.append(a);
                    sb.append("&enter_from=personal_homepage&enter_method=click_collection_section&tab_name=");
                    sb.append(b);
                    C7195s.m22438a().mo18682a(sb.toString());
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi$a */
    public static final class C27723a {
        private C27723a() {
        }

        public /* synthetic */ C27723a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static int m90895a(Integer num) {
            if (num != null && num.intValue() == 2) {
                return 0;
            }
            if (num != null && num.intValue() == 4) {
                return 1;
            }
            if (num != null && num.intValue() == 6) {
                return 2;
            }
            if (num != null && num.intValue() == 3) {
                return 3;
            }
            if (num != null && num.intValue() == 1) {
                return 4;
            }
            if (num != null && num.intValue() == 5) {
                return 5;
            }
            return 0;
        }

        /* renamed from: b */
        public static String m90896b(Integer num) {
            if (num != null && num.intValue() == 2) {
                return "video";
            }
            if (num != null && num.intValue() == 4) {
                return "location";
            }
            if (num != null && num.intValue() == 3) {
                return "challenge";
            }
            if (num != null && num.intValue() == 1) {
                return "music";
            }
            if (num != null && num.intValue() == 5) {
                return "prop";
            }
            if (num != null && num.intValue() == 6) {
                return "goods";
            }
            if (num != null && num.intValue() == 7) {
                return "compilation";
            }
            if (num != null && num.intValue() == 8) {
                return "micro_app";
            }
            if (num != null && num.intValue() == 9) {
                return "entertainment";
            }
            return "";
        }
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11501d, C27707j> mo60559a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0z, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…ollection, parent, false)");
        return new ProfileCollectionViewHolderForJedi<>(inflate);
    }
}
