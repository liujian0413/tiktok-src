package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28787ak;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28689b;
import com.p280ss.android.ugc.aweme.metrics.C33241am;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.improve.expr.WhatsappStatusExperiment;
import com.p280ss.android.ugc.aweme.share.improve.p1541d.C38165a.C38166a;
import com.p280ss.android.ugc.aweme.share.improve.p1541d.C38170b;
import com.p280ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.C38177b;
import com.p280ss.android.ugc.aweme.share.improve.pkg.MusicSharePackage;
import com.p280ss.android.ugc.aweme.share.p1529a.C37956a;
import com.p280ss.android.ugc.aweme.share.p1529a.C37958b;
import com.p280ss.android.ugc.aweme.share.p1530b.C37997a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38388e;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SkeletonShareDialog;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.aq */
public final class C37985aq implements ShareService {

    /* renamed from: a */
    public static final C37986a f98909a = new C37986a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.aq$a */
    public static final class C37986a {
        private C37986a() {
        }

        public /* synthetic */ C37986a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.aq$b */
    public static final class C37987b extends C38388e {

        /* renamed from: a */
        final /* synthetic */ Activity f98910a;

        /* renamed from: b */
        final /* synthetic */ Aweme f98911b;

        C37987b(Activity activity, Aweme aweme) {
            this.f98910a = activity;
            this.f98911b = aweme;
        }

        /* renamed from: a */
        public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
            C7573i.m23587b(bVar, "channel");
            C7573i.m23587b(context, "context");
            C6907h.m21518a((Context) this.f98910a, "share_video", bVar.mo95739b(), this.f98911b.getAid(), 0);
            new C33241am().mo85105a("release").mo85071g(this.f98911b).mo85112f(bVar.mo95739b()).mo85106b(0).mo85252e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.aq$c */
    static final class C37988c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PhotoContext f98912a;

        /* renamed from: b */
        final /* synthetic */ Activity f98913b;

        /* renamed from: c */
        final /* synthetic */ Aweme f98914c;

        C37988c(PhotoContext photoContext, Activity activity, Aweme aweme) {
            this.f98912a = photoContext;
            this.f98913b = activity;
            this.f98914c = aweme;
        }

        public final void run() {
            if (this.f98912a != null && this.f98913b != null) {
                new PhotoUploadSuccessPopView(this.f98913b, this.f98914c, this.f98912a).mo95466b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.aq$d */
    static final class C37989d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28787ak f98915a;

        /* renamed from: b */
        final /* synthetic */ Aweme f98916b;

        /* renamed from: c */
        final /* synthetic */ Activity f98917c;

        C37989d(C28787ak akVar, Aweme aweme, Activity activity) {
            this.f98915a = akVar;
            this.f98916b = aweme;
            this.f98917c = activity;
        }

        public final void run() {
            if (C28787ak.m94784a(this.f98916b)) {
                this.f98915a.mo74017c(this.f98916b);
                this.f98915a.f75923e = this.f98917c;
                this.f98915a.mo74014b();
                this.f98915a.mo74015b(this.f98916b);
            }
        }
    }

    public final void shareCoupon(Context context, PoiStruct poiStruct, CouponInfo couponInfo, String str, String str2, String str3, PoiSimpleBundle poiSimpleBundle) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(poiStruct, "poiStruct");
        C7573i.m23587b(couponInfo, "couponInfo");
        C7573i.m23587b(str, "poiId");
        C7573i.m23587b(str2, "activityId");
        C7573i.m23587b(str3, "couponId");
        C7573i.m23587b(poiSimpleBundle, "poiSimpleBundle");
    }

    public final void sharePoi(Activity activity, PoiStruct poiStruct, String str, PoiBundle poiBundle, List<? extends C34145b> list) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(poiStruct, "poi");
    }

    public final void injectUniversalConfig(C38382b bVar, Activity activity, boolean z) {
        C7573i.m23587b(bVar, "builder");
        C38170b.m121927a(bVar, z, activity);
    }

    public final void sharePhotoAfterPublish(Activity activity, Aweme aweme, PhotoContext photoContext) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(photoContext, "context");
        C6726a.m20844b(new C37988c(photoContext, activity, aweme));
    }

    public final C37997a sharePrivateAfterPublishDialog(Activity activity, Aweme aweme, int i) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aweme, "aweme");
        C28787ak akVar = new C28787ak();
        if (i > 0) {
            akVar.f75919a = i;
        }
        C6726a.m20843a(new C37989d(akVar, aweme, activity), NormalGiftView.MASK_TRANSLATE_VALUE);
        return akVar;
    }

    public final C37997a shareAfterPublishDialog(Activity activity, Aweme aweme, int i) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aweme, "aweme");
        SharePackage parseAweme = parseAweme(activity, aweme, -1, "", "");
        C38382b bVar = new C38382b();
        bVar.mo95963a(C37950a.m121238a().getImChannel(parseAweme, "", -1));
        C38166a.m121923a(bVar, false, C6405d.m19984g());
        bVar.mo95964a(parseAweme);
        bVar.mo95966a((C38386d) new C37987b(activity, aweme));
        if (!WhatsappStatusExperiment.INSTANCE.isStyle2()) {
            bVar.mo95968a("whatsapp_status");
        }
        C38239k kVar = new C38239k(activity, bVar.mo95972a());
        kVar.mo95667a(aweme);
        return kVar;
    }

    public final void shareMusic(Activity activity, Music music, C38388e eVar, List<? extends Aweme> list) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(eVar, "listener");
        MusicSharePackage.f99361b.mo95795a(activity, music, eVar, list);
    }

    public final SharePackage parseAweme(Context context, Aweme aweme, int i, String str, String str2) {
        C7573i.m23587b(context, "activity");
        C7573i.m23587b(aweme, "aweme");
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return C38177b.m121950a(aweme, context, i, str, str2);
    }

    public final SkeletonShareDialog sharePrivateAweme(Activity activity, Fragment fragment, Aweme aweme, C28343z<C28318an> zVar, Bundle bundle) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(zVar, "eventListener");
        C7573i.m23587b(bundle, "extras");
        return C37958b.m121263a(activity, fragment, aweme, zVar, bundle);
    }

    public final SkeletonShareDialog shareAweme(Activity activity, Fragment fragment, Aweme aweme, C28343z<C28318an> zVar, Bundle bundle) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(zVar, "eventListener");
        C7573i.m23587b(bundle, "extras");
        C37956a aVar = new C37956a(activity, fragment, aweme, zVar, bundle);
        return aVar.mo95566a();
    }

    public final void shareCommentAfterDownload(Activity activity, int i, SharePackage sharePackage, String str, Comment comment, Aweme aweme, boolean z, boolean z2, boolean z3, C28689b bVar) {
        String str2;
        Activity activity2 = activity;
        C7573i.m23587b(activity, "activity");
        SharePackage sharePackage2 = sharePackage;
        C7573i.m23587b(sharePackage, "sharePackage");
        C7573i.m23587b(comment, "comment");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(bVar, "shareListener");
        ShareDependService a = C37950a.m121238a();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        a.downloadAwemeThenShare(activity, aweme, z, i, str2, bVar, comment, z2, "", "");
    }
}
