package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28689b;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.share.p1530b.C37997a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38388e;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SkeletonShareDialog;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.share.ShareService */
public interface ShareService {

    /* renamed from: com.ss.android.ugc.aweme.share.ShareService$a */
    public static final class C37952a {
    }

    void injectUniversalConfig(C38382b bVar, Activity activity, boolean z);

    SharePackage parseAweme(Context context, Aweme aweme, int i, String str, String str2);

    C37997a shareAfterPublishDialog(Activity activity, Aweme aweme, int i);

    SkeletonShareDialog shareAweme(Activity activity, Fragment fragment, Aweme aweme, C28343z<C28318an> zVar, Bundle bundle);

    void shareCommentAfterDownload(Activity activity, int i, SharePackage sharePackage, String str, Comment comment, Aweme aweme, boolean z, boolean z2, boolean z3, C28689b bVar);

    void shareCoupon(Context context, PoiStruct poiStruct, CouponInfo couponInfo, String str, String str2, String str3, PoiSimpleBundle poiSimpleBundle);

    void shareMusic(Activity activity, Music music, C38388e eVar, List<? extends Aweme> list);

    void sharePhotoAfterPublish(Activity activity, Aweme aweme, PhotoContext photoContext);

    void sharePoi(Activity activity, PoiStruct poiStruct, String str, PoiBundle poiBundle, List<? extends C34145b> list);

    C37997a sharePrivateAfterPublishDialog(Activity activity, Aweme aweme, int i);

    SkeletonShareDialog sharePrivateAweme(Activity activity, Fragment fragment, Aweme aweme, C28343z<C28318an> zVar, Bundle bundle);
}
