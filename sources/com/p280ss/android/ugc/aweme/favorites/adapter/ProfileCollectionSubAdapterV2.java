package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.models.PreviewParams;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27699d;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27705i;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27711m;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27754b;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33460e;
import com.p280ss.android.ugc.aweme.mix.MixDetailActivity;
import com.p280ss.android.ugc.aweme.mix.MixDetailActivity.C33478a;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41513aa;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapterV2 */
public final class ProfileCollectionSubAdapterV2 extends C1262a<ProfileCollectionSubViewHolderV2> {

    /* renamed from: b */
    public static final C27731a f73132b = new C27731a(null);

    /* renamed from: a */
    public final ProfileCollectionViewModel f73133a;

    /* renamed from: c */
    private List<UrlModel> f73134c;

    /* renamed from: d */
    private int f73135d;

    /* renamed from: e */
    private List<String> f73136e;

    /* renamed from: f */
    private List<Object> f73137f;

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapterV2$ProfileCollectionSubViewHolderV2 */
    public static final class ProfileCollectionSubViewHolderV2 extends C1293v {

        /* renamed from: a */
        public final int f73138a;

        /* renamed from: b */
        private final RemoteImageView f73139b;

        /* renamed from: c */
        private final ImageView f73140c;

        /* renamed from: d */
        private final DmtTextView f73141d;

        /* renamed from: e */
        private final ViewGroup f73142e;

        /* renamed from: f */
        private final DmtTextView f73143f;

        /* renamed from: g */
        private final ProfileCollectionViewModel f73144g;

        /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapterV2$ProfileCollectionSubViewHolderV2$a */
        static final class C27730a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ ProfileCollectionSubViewHolderV2 f73145a;

            /* renamed from: b */
            final /* synthetic */ int f73146b;

            /* renamed from: c */
            final /* synthetic */ Object f73147c;

            C27730a(ProfileCollectionSubViewHolderV2 profileCollectionSubViewHolderV2, int i, Object obj) {
                this.f73145a = profileCollectionSubViewHolderV2;
                this.f73146b = i;
                this.f73147c = obj;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                switch (this.f73146b) {
                    case 1:
                        this.f73145a.mo71193f(this.f73147c);
                        return;
                    case 2:
                        this.f73145a.mo71190a(this.f73147c);
                        return;
                    case 3:
                        this.f73145a.mo71192e(this.f73147c);
                        return;
                    case 4:
                        this.f73145a.mo71191c(this.f73147c);
                        return;
                    case 5:
                        this.f73145a.mo71194g(this.f73147c);
                        return;
                    case 6:
                        ProfileCollectionSubViewHolderV2.m90919d(this.f73147c);
                        return;
                    case 7:
                        ProfileCollectionSubViewHolderV2 profileCollectionSubViewHolderV2 = this.f73145a;
                        Object obj = this.f73147c;
                        if (obj != null) {
                            profileCollectionSubViewHolderV2.mo71189a((MixStruct) obj);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.MixStruct");
                    case 8:
                        this.f73145a.mo71195h(this.f73147c);
                        return;
                    case 9:
                        ProfileCollectionSubViewHolderV2.m90918b(this.f73147c);
                        break;
                }
            }
        }

        /* renamed from: a */
        public final void mo71187a() {
            this.f73139b.setLayoutParams(new LayoutParams(this.f73138a, this.f73138a));
            this.f73139b.setImageResource(R.color.a8h);
        }

        /* renamed from: g */
        public final void mo71194g(Object obj) {
            if (obj != null && (obj instanceof NewFaceStickerBean)) {
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                C27754b.m90995a(view.getContext(), (NewFaceStickerBean) obj, "personal_homepage", "collection");
            }
        }

        /* renamed from: b */
        public static void m90918b(Object obj) {
            if (obj instanceof C27699d) {
                C27699d dVar = (C27699d) obj;
                C27752a.m90989g(dVar.f73013a, "personal_homepage", "entertainment");
                Map linkedHashMap = new LinkedHashMap();
                String str = "movie_id";
                String str2 = dVar.f73013a;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put(str, str2);
                linkedHashMap.put("enter_from", "personal_homepage");
                C41513aa.m132240a(C33336b.m107784a(C41513aa.m132237a(), linkedHashMap));
            }
        }

        /* renamed from: e */
        public final void mo71192e(Object obj) {
            if (obj != null && (obj instanceof Challenge)) {
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                if (view.getContext() instanceof Activity) {
                    View view2 = this.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    Context context = view2.getContext();
                    if (context != null) {
                        C27754b.m90993a((Activity) context, (Challenge) obj, "personal_homepage", "collection");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                    }
                }
            }
        }

        /* renamed from: f */
        public final void mo71193f(Object obj) {
            if (obj != null && (obj instanceof Music)) {
                Music music = (Music) obj;
                C27752a.m90986d(music.getMid(), "personal_homepage", "collection");
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                C27754b.m90994a(view.getContext(), music, "personal_homepage", "collection");
            }
        }

        /* renamed from: h */
        public final void mo71195h(Object obj) {
            if (obj != null && (obj instanceof C33460e)) {
                C33460e eVar = (C33460e) obj;
                C27752a.m90971a(eVar, "personal_collection", "collection");
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                C27754b.m90996a(view.getContext(), eVar.f87346d, "personal_collection");
            }
        }

        /* renamed from: d */
        public static void m90919d(Object obj) {
            if (obj != null && (obj instanceof C27711m)) {
                C27711m mVar = (C27711m) obj;
                C27752a.m90974a(mVar.f73066a, "personal_homepage", "collection");
                Integer num = mVar.f73076k;
                if (num != null && num.intValue() == 2) {
                    C7195s a = C7195s.m22438a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(mVar.f73074i);
                    sb.append("&enter_from=personal_homepage");
                    sb.append("&source_page=personal_homepage");
                    a.mo18682a(sb.toString());
                    return;
                }
                Activity g = C6405d.m19984g();
                if (g != null) {
                    PreviewParams previewParams = new PreviewParams("personal_homepage", "click_collection_card", 0, 4, null);
                    previewParams.setPromotionId(mVar.f73066a);
                    previewParams.setProductId(mVar.f73067b);
                    previewParams.setOriginUserId(mVar.f73068c);
                    C24436a.m80356a().startPreview(g, previewParams);
                }
            }
        }

        /* renamed from: a */
        public final void mo71190a(Object obj) {
            if (obj != null && (obj instanceof Aweme)) {
                Bundle bundle = new Bundle();
                Aweme aweme = (Aweme) obj;
                bundle.putString("id", aweme.getAid());
                bundle.putString("video_from", "from_profile_self");
                bundle.putInt("video_type", 4);
                IAccountUserService a = C21115b.m71197a();
                C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                bundle.putString("userid", a.getCurUserId());
                bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                bundle.putString("refer", "personal_homepage");
                bundle.putString("tab_name", "collection");
                bundle.putInt("from_post_list", 0);
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                Context context = view.getContext();
                if (context != null) {
                    DetailActivity.m86049a((Activity) context, bundle, this.itemView);
                    C28229b.m92772a(aweme);
                    C27752a.m90984c(aweme.getAid(), "personal_homepage", "collection");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }

        /* renamed from: c */
        public final void mo71191c(Object obj) {
            if (obj != null) {
                if (obj instanceof SimplePoiInfoStruct) {
                    SimplePoiInfoStruct simplePoiInfoStruct = (SimplePoiInfoStruct) obj;
                    C27752a.m90976a(simplePoiInfoStruct.getPoiId(), "personal_homepage", "collection", false);
                    PoiBundle poiBundle = new PoiBundle();
                    poiBundle.poiId = simplePoiInfoStruct.getPoiId();
                    poiBundle.poiName = simplePoiInfoStruct.getPoiName();
                    poiBundle.from = "personal_homepage";
                    poiBundle.tabName = "collection";
                    poiBundle.clickMethod = "click_collection_poi";
                    poiBundle.isCoupon = "0";
                    View view = this.itemView;
                    C7573i.m23582a((Object) view, "itemView");
                    SmartRouter.buildRoute(view.getContext(), "//poi/detail").withParam("poi_bundle", (Serializable) poiBundle).open();
                } else {
                    if (obj instanceof C27705i) {
                        View view2 = this.itemView;
                        C7573i.m23582a((Object) view2, "itemView");
                        C35454m.m114522a(view2.getContext(), ((C27705i) obj).f73034b, "personal_homepage", "");
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo71189a(MixStruct mixStruct) {
            Bundle bundle;
            C33478a aVar = MixDetailActivity.f87435a;
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            Context context = view.getContext();
            C7573i.m23582a((Object) context, "itemView.context");
            String str = mixStruct.mixId;
            C7573i.m23582a((Object) str, "obj.mixId");
            User user = mixStruct.author;
            C7573i.m23582a((Object) user, "obj.author");
            String uid = user.getUid();
            C7573i.m23582a((Object) uid, "obj.author.uid");
            User user2 = mixStruct.author;
            C7573i.m23582a((Object) user2, "obj.author");
            String secUid = user2.getSecUid();
            C7573i.m23582a((Object) secUid, "obj.author.secUid");
            String str2 = "outer_favourite";
            String str3 = "outer_favourite";
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            String curUserId = f.getCurUserId();
            User user3 = mixStruct.author;
            C7573i.m23582a((Object) user3, "obj.author");
            if (C7573i.m23585a((Object) curUserId, (Object) user3.getUid())) {
                User user4 = mixStruct.author;
                C7573i.m23582a((Object) user4, "obj.author");
                C42914ab a = C42914ab.m136242a().mo104633a("uid", user4.getUid());
                String str4 = C22689a.f60407a;
                User user5 = mixStruct.author;
                C7573i.m23582a((Object) user5, "obj.author");
                bundle = a.mo104633a(str4, user5.getSecUid()).f111445a;
            } else {
                bundle = new Bundle();
            }
            C7573i.m23582a((Object) bundle, "if (AccountProxyService.…          } else Bundle()");
            C33478a.m108256a(aVar, context, str, uid, secUid, str2, str3, bundle, null, Long.valueOf(mixStruct.statis.currentEpisode), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, null);
        }

        public ProfileCollectionSubViewHolderV2(View view, int i, ProfileCollectionViewModel profileCollectionViewModel) {
            C7573i.m23587b(view, "itemView");
            C7573i.m23587b(profileCollectionViewModel, "mProfileCollectionViewModel");
            super(view);
            this.f73138a = i;
            this.f73144g = profileCollectionViewModel;
            View findViewById = view.findViewById(R.id.a4g);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.cover)");
            this.f73139b = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.cfa);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.poi_img_placeholder)");
            this.f73140c = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.title);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.title)");
            this.f73141d = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.a19);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.container)");
            this.f73142e = (ViewGroup) findViewById4;
            View findViewById5 = view.findViewById(R.id.ch6);
            C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.poi_spu_over_date)");
            this.f73143f = (DmtTextView) findViewById5;
        }

        /* renamed from: a */
        public final void mo71188a(UrlModel urlModel, int i, String str, Object obj) {
            this.f73139b.setLayoutParams(new LayoutParams(this.f73138a, this.f73138a));
            if (urlModel != null && !C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
                this.f73140c.setVisibility(8);
                C23323e.m76524b(this.f73139b, urlModel);
            } else if (i != 1) {
                switch (i) {
                    case 3:
                        ProfileCollectionSubViewHolderV2 profileCollectionSubViewHolderV2 = this;
                        C23323e.m76503a(profileCollectionSubViewHolderV2.f73139b, (int) R.drawable.b71);
                        profileCollectionSubViewHolderV2.f73140c.setVisibility(8);
                        break;
                    case 4:
                        ProfileCollectionSubViewHolderV2 profileCollectionSubViewHolderV22 = this;
                        profileCollectionSubViewHolderV22.mo71187a();
                        profileCollectionSubViewHolderV22.f73140c.setVisibility(0);
                        break;
                    case 5:
                        ProfileCollectionSubViewHolderV2 profileCollectionSubViewHolderV23 = this;
                        C23323e.m76503a(profileCollectionSubViewHolderV23.f73139b, (int) R.drawable.b8v);
                        profileCollectionSubViewHolderV23.f73140c.setVisibility(8);
                        break;
                    default:
                        this.f73140c.setVisibility(8);
                        break;
                }
            } else {
                ProfileCollectionSubViewHolderV2 profileCollectionSubViewHolderV24 = this;
                C23323e.m76503a(profileCollectionSubViewHolderV24.f73139b, (int) R.drawable.b73);
                profileCollectionSubViewHolderV24.f73140c.setVisibility(8);
            }
            if (i == 7 && obj != null) {
                this.f73144g.mo71342a((MixStruct) obj);
            }
            if (i == 8 && obj != null) {
                C33460e eVar = (C33460e) obj;
                this.f73144g.mo71343a(eVar);
                ProfileCollectionViewModel.m91274b(eVar);
            }
            CharSequence charSequence = str;
            if (TextUtils.isEmpty(charSequence)) {
                this.f73141d.setVisibility(8);
            } else {
                this.f73141d.setVisibility(0);
                DmtTextView dmtTextView = this.f73141d;
                if (i == 3) {
                    StringBuilder sb = new StringBuilder("#");
                    sb.append(str);
                    charSequence = sb.toString();
                }
                dmtTextView.setText(charSequence);
            }
            if (obj instanceof C27705i) {
                C27705i iVar = (C27705i) obj;
                if (iVar.f73033a == 2) {
                    this.f73139b.setAlpha(0.34f);
                    this.f73143f.setVisibility(0);
                    this.f73143f.setText(iVar.f73038f);
                }
            } else {
                this.f73139b.setAlpha(1.0f);
                this.f73143f.setVisibility(8);
            }
            this.f73142e.setOnClickListener(new C27730a(this, i, obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapterV2$a */
    public static final class C27731a {
        private C27731a() {
        }

        public /* synthetic */ C27731a(C7571f fVar) {
            this();
        }
    }

    public final int getItemCount() {
        int i;
        List<UrlModel> list = this.f73134c;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i >= 3) {
            return 3;
        }
        List<UrlModel> list2 = this.f73134c;
        if (list2 != null) {
            return list2.size();
        }
        return 0;
    }

    public ProfileCollectionSubAdapterV2(ProfileCollectionViewModel profileCollectionViewModel) {
        C7573i.m23587b(profileCollectionViewModel, "profileCollectionViewModel");
        this.f73133a = profileCollectionViewModel;
    }

    /* renamed from: a */
    public final void mo71186a(C27707j jVar) {
        C7573i.m23587b(jVar, "struct");
        this.f73134c = jVar.f73045c;
        this.f73135d = jVar.f73046d;
        this.f73136e = jVar.f73048f;
        this.f73137f = jVar.f73049g;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r2 == null) goto L_0x0023;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.p280ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapterV2.ProfileCollectionSubViewHolderV2 r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r0 = r4.f73134c
            if (r0 == 0) goto L_0x0037
            int r1 = r0.size()
            if (r6 >= r1) goto L_0x0033
            java.lang.Object r0 = r0.get(r6)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r0
            int r1 = r4.f73135d
            java.util.List<java.lang.String> r2 = r4.f73136e
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0025
        L_0x0023:
            java.lang.String r2 = ""
        L_0x0025:
            java.util.List<java.lang.Object> r3 = r4.f73137f
            if (r3 == 0) goto L_0x002e
            java.lang.Object r6 = r3.get(r6)
            goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            r5.mo71188a(r0, r1, r2, r6)
            goto L_0x0037
        L_0x0033:
            r5.mo71187a()
            return
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapterV2.onBindViewHolder(com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionSubAdapterV2$ProfileCollectionSubViewHolderV2, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ProfileCollectionSubViewHolderV2 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a15, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int b = (C23482j.m77098b(viewGroup.getContext()) - ((int) C9738o.m28708b(viewGroup.getContext(), 44.0f))) / 3;
        layoutParams.width = b;
        inflate.setLayoutParams(layoutParams);
        return new ProfileCollectionSubViewHolderV2(inflate, b, this.f73133a);
    }
}
