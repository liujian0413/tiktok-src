package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi.C27723a;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33460e;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter */
public final class ProfileCollectionSubAdapter extends C1262a<ProfileCollectionSubViewHolder> {

    /* renamed from: a */
    public static final C27729a f73123a = new C27729a(null);

    /* renamed from: b */
    private List<UrlModel> f73124b;

    /* renamed from: c */
    private int f73125c;

    /* renamed from: d */
    private List<Object> f73126d;

    /* renamed from: e */
    private final ProfileCollectionViewModel f73127e;

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter$ProfileCollectionSubViewHolder */
    public static final class ProfileCollectionSubViewHolder extends C1293v {

        /* renamed from: a */
        private final RemoteImageView f73128a;

        /* renamed from: b */
        private final ImageView f73129b;

        /* renamed from: c */
        private final ProfileCollectionViewModel f73130c;

        /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter$ProfileCollectionSubViewHolder$a */
        static final class C27728a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f73131a;

            C27728a(int i) {
                this.f73131a = i;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                int a = C27723a.m90895a(Integer.valueOf(this.f73131a));
                String b = C27723a.m90896b(Integer.valueOf(this.f73131a));
                StringBuilder sb = new StringBuilder("aweme://favorite?");
                sb.append("index=");
                sb.append(a);
                sb.append("&enter_from=personal_homepage&enter_method=click_collection_section&tab_name=");
                sb.append(b);
                C7195s.m22438a().mo18682a(sb.toString());
            }
        }

        /* renamed from: a */
        public final void mo71182a() {
            this.f73128a.setLayoutParams(new LayoutParams(-1, -1));
            this.f73128a.setImageResource(R.color.a8h);
        }

        /* renamed from: a */
        public final void mo71183a(int i) {
            this.itemView.setOnClickListener(new C27728a(i));
        }

        public ProfileCollectionSubViewHolder(View view, ProfileCollectionViewModel profileCollectionViewModel) {
            C7573i.m23587b(view, "itemView");
            C7573i.m23587b(profileCollectionViewModel, "mProfileCollectionViewModel");
            super(view);
            this.f73130c = profileCollectionViewModel;
            View findViewById = view.findViewById(R.id.a4g);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.cover)");
            this.f73128a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.cfa);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.poi_img_placeholder)");
            this.f73129b = (ImageView) findViewById2;
        }

        /* renamed from: a */
        public final void mo71184a(UrlModel urlModel, int i, Object obj) {
            this.f73128a.setLayoutParams(new LayoutParams(-1, -1));
            if (urlModel != null && !C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
                this.f73129b.setVisibility(8);
                C23323e.m76524b(this.f73128a, urlModel);
            } else if (i != 1) {
                switch (i) {
                    case 3:
                        ProfileCollectionSubViewHolder profileCollectionSubViewHolder = this;
                        C23323e.m76503a(profileCollectionSubViewHolder.f73128a, (int) R.drawable.b71);
                        profileCollectionSubViewHolder.f73129b.setVisibility(8);
                        break;
                    case 4:
                        ProfileCollectionSubViewHolder profileCollectionSubViewHolder2 = this;
                        profileCollectionSubViewHolder2.mo71182a();
                        profileCollectionSubViewHolder2.f73129b.setVisibility(0);
                        break;
                    case 5:
                        ProfileCollectionSubViewHolder profileCollectionSubViewHolder3 = this;
                        C23323e.m76503a(profileCollectionSubViewHolder3.f73128a, (int) R.drawable.b8v);
                        profileCollectionSubViewHolder3.f73129b.setVisibility(8);
                        break;
                    default:
                        this.f73129b.setVisibility(8);
                        break;
                }
            } else {
                ProfileCollectionSubViewHolder profileCollectionSubViewHolder4 = this;
                C23323e.m76503a(profileCollectionSubViewHolder4.f73128a, (int) R.drawable.b73);
                profileCollectionSubViewHolder4.f73129b.setVisibility(8);
            }
            if (i == 7 && obj != null) {
                this.f73130c.mo71342a((MixStruct) obj);
            }
            if (i == 8 && obj != null) {
                this.f73130c.mo71343a((C33460e) obj);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapter$a */
    public static final class C27729a {
        private C27729a() {
        }

        public /* synthetic */ C27729a(C7571f fVar) {
            this();
        }
    }

    public final int getItemCount() {
        return 4;
    }

    public ProfileCollectionSubAdapter(ProfileCollectionViewModel profileCollectionViewModel) {
        C7573i.m23587b(profileCollectionViewModel, "profileCollectionViewModel");
        this.f73127e = profileCollectionViewModel;
    }

    /* renamed from: a */
    public final void mo71181a(C27707j jVar) {
        C7573i.m23587b(jVar, "struct");
        this.f73124b = jVar.f73045c;
        this.f73125c = jVar.f73046d;
        this.f73126d = jVar.f73049g;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ProfileCollectionSubViewHolder profileCollectionSubViewHolder, int i) {
        Object obj;
        C7573i.m23587b(profileCollectionSubViewHolder, "holder");
        List<UrlModel> list = this.f73124b;
        if (list != null) {
            if (i < list.size()) {
                UrlModel urlModel = (UrlModel) list.get(i);
                int i2 = this.f73125c;
                List<Object> list2 = this.f73126d;
                if (list2 != null) {
                    obj = list2.get(i);
                } else {
                    obj = null;
                }
                profileCollectionSubViewHolder.mo71184a(urlModel, i2, obj);
            } else {
                profileCollectionSubViewHolder.mo71182a();
            }
        }
        profileCollectionSubViewHolder.mo71183a(this.f73125c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ProfileCollectionSubViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a14, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int b = (C23482j.m77098b(viewGroup.getContext()) - ((int) C9738o.m28708b(viewGroup.getContext(), 62.0f))) / 4;
        layoutParams.width = b;
        layoutParams.height = b;
        inflate.setLayoutParams(layoutParams);
        return new ProfileCollectionSubViewHolder(inflate, this.f73127e);
    }
}
