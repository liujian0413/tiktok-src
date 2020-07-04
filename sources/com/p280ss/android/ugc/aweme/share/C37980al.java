package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.feed.C28206aj;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedSelfseeNoticeModel;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28457k;
import com.p280ss.android.ugc.aweme.setting.C37541ab;
import com.p280ss.android.ugc.aweme.setting.C37578ax;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.improve.C38065a.C38066a;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38104i;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38108k;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38164e;
import com.p280ss.android.ugc.aweme.share.improve.p1542e.C38172b;
import com.p280ss.android.ugc.aweme.share.p1533d.C38025a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import java.util.Comparator;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.al */
public final class C37980al extends C38062i {
    public final void syncToToutiao(AppCompatActivity appCompatActivity, boolean z, int i, Intent intent) {
        C7573i.m23587b(appCompatActivity, "activity");
    }

    public final C37541ab getShareSetting() {
        return new C37578ax();
    }

    public final Comparator<C38343b> channelServerOrder() {
        return new C38172b<>(0);
    }

    public final String getMostUseShareChannel() {
        return C38025a.m121371a().mo95662a(0);
    }

    public final String[] getGifImageShareList() {
        C7573i.m23582a((Object) C38025a.m121371a(), "I18nShareOrderUtil.getInstance()");
        String[] b = C38025a.m121375b();
        C7573i.m23582a((Object) b, "I18nShareOrderUtil.getInstance().gifShareList");
        return b;
    }

    public final boolean checkDownloadPermission(Activity activity) {
        C7573i.m23587b(activity, "activity");
        return C38164e.m121919a(activity);
    }

    public final Drawable getFirstShareIcon(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C38025a.m121371a();
        Drawable a = C38025a.m121370a(activity);
        C7573i.m23582a((Object) a, "I18nShareOrderUtil.getIn…stAvailableIcon(activity)");
        return a;
    }

    public final void addShareRecord(String str, int i) {
        C7573i.m23587b(str, "channel");
        C38025a.m121371a().mo95663a(str, i);
    }

    public final boolean checkShareAllowStatus(Aweme aweme, Context context) {
        C7573i.m23587b(context, "context");
        return C38164e.m121920a(context, aweme);
    }

    public final C38343b keyToChannel(String str, Activity activity) {
        C7573i.m23587b(str, "key");
        return C38066a.m121469a(str, activity);
    }

    public final Drawable channelDrawable(Activity activity, String str) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "channelKey");
        C38343b a = C38066a.m121469a(str, activity);
        if (a != null) {
            return C0683b.m2903a((Context) activity, a.mo95736a());
        }
        return null;
    }

    public final String getShortenUrl(ShareInfo shareInfo, String str) {
        C7573i.m23587b(shareInfo, "shareInfo");
        C7573i.m23587b(str, "channel");
        String a = C28206aj.m92712a(shareInfo, str, true);
        C7573i.m23582a((Object) a, "ShareUrlUtils.getShorten…shareInfo, channel, true)");
        return a;
    }

    public final void requestFeedSelfsee(Context context, Aweme aweme) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aweme, "aweme");
        C28457k kVar = new C28457k(context);
        kVar.mo66536a(new FeedSelfseeNoticeModel());
        kVar.mo56976a(aweme.getAid());
    }

    public final C38389f getDislikeAction(Aweme aweme, String str, String str2) {
        C7573i.m23587b(aweme, "aweme");
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C38108k(aweme, str, str2);
    }

    public final C38389f getCopyAwemeAction(Aweme aweme, String str, boolean z, int i) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        return new C38104i(aweme, str, z, i);
    }

    public final C38389f getDownloadAction(Activity activity, Aweme aweme, String str, String str2, boolean z) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aweme, "aweme");
        ShareDependService a = C37950a.m121238a();
        if (str == null) {
            str = "";
        }
        String str3 = str;
        if (str2 == null) {
            str2 = "";
        }
        C38389f downloadAction = a.getDownloadAction(activity, aweme, str3, str2, z);
        if (downloadAction == null) {
            C7573i.m23580a();
        }
        return downloadAction;
    }
}
