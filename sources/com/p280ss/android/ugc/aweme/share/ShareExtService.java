package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.setting.C37541ab;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import java.util.Comparator;
import p346io.reactivex.C7490k;

/* renamed from: com.ss.android.ugc.aweme.share.ShareExtService */
public interface ShareExtService {

    /* renamed from: com.ss.android.ugc.aweme.share.ShareExtService$a */
    public static final class C37951a {
    }

    void addShareRecord(String str, int i);

    Drawable channelDrawable(Activity activity, String str);

    Comparator<C38343b> channelServerOrder();

    boolean checkDownloadPermission(Activity activity);

    boolean checkShareAllowStatus(Aweme aweme, Context context);

    void copyContentToClipBoard(Context context, String str, String str2);

    C38389f getCopyAwemeAction(Aweme aweme, String str, boolean z, int i);

    C38389f getDislikeAction(Aweme aweme, String str, String str2);

    C38389f getDownloadAction(Activity activity, Aweme aweme, String str, String str2, boolean z);

    Drawable getFirstShareIcon(Activity activity);

    String[] getGifImageShareList();

    String getMostUseShareChannel();

    C37541ab getShareSetting();

    String getShortenUrl(ShareInfo shareInfo, String str);

    C38343b keyToChannel(String str, Activity activity);

    void markLocalCommand(Context context, String str);

    void requestFeedSelfsee(Context context, Aweme aweme);

    C7490k<String> shortUrl(String str);

    void syncToToutiao(AppCompatActivity appCompatActivity, boolean z, int i, Intent intent);
}
