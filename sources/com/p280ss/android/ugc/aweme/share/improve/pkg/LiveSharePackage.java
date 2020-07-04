package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38090d;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38142a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.share.p1543ui.C38263a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38327s;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38371b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38371b.C38372a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d.C38387a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.p280ss.android.ugc.aweme.utils.C42972bf;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage */
public final class LiveSharePackage extends SharePackage {
    public static final Creator<LiveSharePackage> CREATOR = new C38204c();

    /* renamed from: a */
    public static final C38201b f99340a = new C38201b(null);

    /* renamed from: b */
    private final C9388a f99341b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$a */
    public static final class C38200a extends C7219a<LiveSharePackage> {

        /* renamed from: a */
        public C9388a f99342a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public LiveSharePackage mo18866a() {
            return new LiveSharePackage(this);
        }

        /* renamed from: a */
        public final C38200a mo95783a(C9388a aVar) {
            C7573i.m23587b(aVar, "callback");
            this.f99342a = aVar;
            return this;
        }

        /* renamed from: a */
        public final C38200a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$b */
    public static final class C38201b {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$b$a */
        public static final class C38202a implements C38386d {

            /* renamed from: a */
            final /* synthetic */ Activity f99343a;

            /* renamed from: b */
            final /* synthetic */ C9389b f99344b;

            /* renamed from: c */
            final /* synthetic */ LiveSharePackage f99345c;

            /* renamed from: d */
            final /* synthetic */ C9388a f99346d;

            /* renamed from: a */
            public final void mo67217a(SharePackage sharePackage, Context context) {
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                C38387a.m122614b(this, sharePackage, context);
            }

            /* renamed from: b */
            public final void mo67219b(SharePackage sharePackage, Context context) {
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                C38387a.m122613a(this, sharePackage, context);
            }

            /* renamed from: a */
            public final void mo67218a(C38389f fVar, SharePackage sharePackage, Context context) {
                C7573i.m23587b(fVar, "action");
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                if (fVar instanceof C38090d) {
                    this.f99346d.mo11626a(fVar.mo95715b(), "link");
                }
            }

            C38202a(Activity activity, C9389b bVar, LiveSharePackage liveSharePackage, C9388a aVar) {
                this.f99343a = activity;
                this.f99344b = bVar;
                this.f99345c = liveSharePackage;
                this.f99346d = aVar;
            }

            /* renamed from: a */
            public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
                C7573i.m23587b(bVar, "channel");
                C7573i.m23587b(context, "context");
                if (z) {
                    this.f99346d.mo11626a(bVar.mo95739b(), C38201b.m122031a(bVar));
                } else {
                    this.f99346d.mo11627a(new Throwable());
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$b$b */
        public static final class C38203b implements C38371b {

            /* renamed from: a */
            final /* synthetic */ Activity f99347a;

            /* renamed from: b */
            final /* synthetic */ C9389b f99348b;

            /* renamed from: c */
            final /* synthetic */ LiveSharePackage f99349c;

            /* renamed from: d */
            final /* synthetic */ C9388a f99350d;

            /* renamed from: a */
            public final void mo95707a(SharePackage sharePackage) {
                C7573i.m23587b(sharePackage, "sharePackage");
                this.f99350d.mo11626a("chat_merge", "link");
            }

            /* renamed from: b */
            public final boolean mo95709b(SharePackage sharePackage) {
                C7573i.m23587b(sharePackage, "sharePackage");
                return C38372a.m122566a(this, sharePackage);
            }

            /* renamed from: a */
            public final void mo95708a(String str, SharePackage sharePackage) {
                C7573i.m23587b(str, "channel");
                C7573i.m23587b(sharePackage, "sharePackage");
                C38372a.m122565a(this, str, sharePackage);
            }

            C38203b(Activity activity, C9389b bVar, LiveSharePackage liveSharePackage, C9388a aVar) {
                this.f99347a = activity;
                this.f99348b = bVar;
                this.f99349c = liveSharePackage;
                this.f99350d = aVar;
            }
        }

        private C38201b() {
        }

        /* renamed from: a */
        public static String m122031a(C38343b bVar) {
            return "qr_code";
        }

        public /* synthetic */ C38201b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static UrlModel m122029a(ImageModel imageModel) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(imageModel.getUri());
            urlModel.setUrlList(imageModel.getUrls());
            urlModel.setUrlKey(imageModel.getUri());
            urlModel.setWidth(imageModel.width);
            urlModel.setHeight(imageModel.height);
            return urlModel;
        }

        /* renamed from: a */
        public final void mo95784a(Activity activity, C9389b bVar, C9388a aVar) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(bVar, "live");
            C7573i.m23587b(aVar, "callback");
            LiveSharePackage a = m122030a(bVar, (Context) activity, aVar);
            C38382b bVar2 = new C38382b();
            C37984ap.m121301a().injectUniversalConfig(bVar2, activity, false);
            bVar2.mo95977b(false);
            bVar2.mo95963a((C38343b) new C38142a());
            bVar2.mo95968a("instagram");
            bVar2.mo95968a("instagram_story");
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            C7573i.m23582a((Object) iUserService, "userService");
            if (!C7573i.m23585a((Object) iUserService.getCurrentUserID(), (Object) String.valueOf(bVar.f25821d))) {
                bVar2.mo95967a((C38389f) new C38235b(activity, bVar));
                bVar2.mo95967a((C38389f) new C38234a(activity, bVar));
            }
            bVar2.mo95964a((SharePackage) a);
            bVar2.mo95966a((C38386d) new C38202a(activity, bVar, a, aVar));
            bVar2.mo95965a((C38371b) new C38203b(activity, bVar, a, aVar));
            CommonShareDialog commonShareDialog = new CommonShareDialog(activity, bVar2.mo95972a(), 0, 4, null);
            commonShareDialog.show();
        }

        /* renamed from: a */
        public static LiveSharePackage m122030a(C9389b bVar, Context context, C9388a aVar) {
            UrlModel urlModel;
            boolean z;
            String str;
            String str2;
            C7573i.m23587b(bVar, "params");
            C7573i.m23587b(context, "context");
            C7573i.m23587b(aVar, "callback");
            C7219a d = new C38200a().mo95783a(aVar).mo18868d("live");
            String str3 = bVar.f25831n;
            C7573i.m23582a((Object) str3, "params.url");
            C7219a h = d.mo18872h(str3);
            String str4 = bVar.f25832o;
            C7573i.m23582a((Object) str4, "params.title");
            C7219a f = h.mo18870f(str4);
            String str5 = bVar.f25833p;
            C7573i.m23582a((Object) str5, "params.description");
            LiveSharePackage liveSharePackage = (LiveSharePackage) f.mo18871g(str5).mo18869e(String.valueOf(bVar.f25820c)).mo18866a();
            Bundle bundle = liveSharePackage.f20186l;
            ImageModel imageModel = bVar.f25826i;
            C7573i.m23582a((Object) imageModel, "params.avatarThumb");
            bundle.putSerializable("thumb_for_share", m122029a(imageModel));
            String str6 = "video_cover";
            if (bVar.f25829l == null) {
                ImageModel imageModel2 = bVar.f25828k;
                C7573i.m23582a((Object) imageModel2, "params.avatarLarge");
                urlModel = m122029a(imageModel2);
            } else {
                ImageModel imageModel3 = bVar.f25829l;
                C7573i.m23582a((Object) imageModel3, "params.cover");
                urlModel = m122029a(imageModel3);
            }
            bundle.putSerializable(str6, urlModel);
            bundle.putString("author_name", bVar.f25830m);
            bundle.putString("author_id", bVar.f25825h.toString());
            bundle.putString("app_name", context.getString(R.string.jf));
            String str7 = "thumb_url";
            CharSequence charSequence = bVar.f25834q;
            if (charSequence == null || C7634n.m23713a(charSequence)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImageModel imageModel4 = bVar.f25827j;
                C7573i.m23582a((Object) imageModel4, "params.avatarMedium");
                str = C23323e.m76499a(m122029a(imageModel4));
            } else {
                str = bVar.f25834q;
            }
            bundle.putString(str7, str);
            bundle.putString("uid_for_share", String.valueOf(bVar.f25821d));
            bundle.putString("sec_user_id", bVar.f25840w);
            bundle.putLong("group_id", bVar.f25820c);
            bundle.putLong("item_id", bVar.f25820c);
            bundle.putString("share_text", liveSharePackage.f20184j);
            bundle.putString("live_id", String.valueOf(bVar.f25821d));
            bundle.putString("room_title", bVar.f25832o);
            bundle.putString("request_id", bVar.f25837t);
            String str8 = "user_type";
            if (bVar.f25836s) {
                str2 = "host";
            } else {
                str2 = "aud";
            }
            bundle.putString(str8, str2);
            bundle.putString("previous_page", "live");
            return liveSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$c */
    public static final class C38204c implements Creator<LiveSharePackage> {
        C38204c() {
        }

        /* renamed from: a */
        private static LiveSharePackage[] m122041a(int i) {
            return new LiveSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122040a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122041a(i);
        }

        /* renamed from: a */
        private static LiveSharePackage m122040a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new LiveSharePackage(parcel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage$d */
    static final class C38205d extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38343b f99351a;

        /* renamed from: b */
        final /* synthetic */ Context f99352b;

        /* renamed from: c */
        final /* synthetic */ String f99353c;

        C38205d(C38343b bVar, Context context, String str) {
            this.f99351a = bVar;
            this.f99352b = context;
            this.f99353c = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m122042a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m122042a(String str) {
            C7573i.m23587b(str, "it");
            C38343b bVar = this.f99351a;
            Uri a = C42972bf.m136419a(this.f99352b, new File(str));
            C7573i.m23582a((Object) a, "FileProviderUtils.getFil…derUri(context, File(it))");
            C38357h hVar = new C38357h(a, str, null, null, null, this.f99353c, 28, null);
            bVar.mo95744a(hVar, this.f99352b);
        }
    }

    /* renamed from: a */
    public static final LiveSharePackage m122019a(C9389b bVar, Context context, C9388a aVar) {
        return C38201b.m122030a(bVar, context, aVar);
    }

    /* renamed from: a */
    public static final void m122020a(Activity activity, C9389b bVar, C9388a aVar) {
        f99340a.mo95784a(activity, bVar, aVar);
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public LiveSharePackage(C38200a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        this.f99341b = aVar.f99342a;
    }

    public LiveSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38200a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(C38159c.m121914a(this.f20185k, bVar), this.f20183i, this.f20184j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C37984ap.m121302b().addShareRecord(bVar.mo95739b(), 2);
        if (!(bVar instanceof C38327s)) {
            return false;
        }
        try {
            C38263a.m122227a(this.f20186l);
            C38263a.m122228a(bVar, context, new C38205d(bVar, context, C38159c.m121914a(this.f20185k, bVar)));
        } catch (Exception unused) {
        }
        return true;
    }
}
