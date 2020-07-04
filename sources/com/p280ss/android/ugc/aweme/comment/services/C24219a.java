package com.p280ss.android.ugc.aweme.comment.services;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.p022v4.app.Fragment;
import android.text.style.ReplacementSpan;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.comment.api.ICommentLikeUsersHolder;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28463p;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28689b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.io.File;
import java.util.Comparator;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.comment.services.a */
public interface C24219a {

    /* renamed from: a */
    public static final C24220a f63932a = C24220a.f63933a;

    /* renamed from: com.ss.android.ugc.aweme.comment.services.a$a */
    public static final class C24220a {

        /* renamed from: a */
        static final /* synthetic */ C24220a f63933a = new C24220a();

        private C24220a() {
        }

        /* renamed from: a */
        public static C24219a m79551a() {
            return (C24219a) ServiceManager.get().getService(C24219a.class);
        }
    }

    void addShareRecord(String str);

    void appendV4CommonParams(C22984d dVar, String str, String str2);

    boolean checkDownloadAndDonotShowForbiddenToast(Context context, Aweme aweme);

    boolean checkDownloadByAwemeStatus(Aweme aweme);

    void checkDownloadStoragePermission(Activity activity, C7561a<C7581n> aVar);

    boolean checkShareAllowStatus(Aweme aweme, Context context);

    boolean commentReplyGroupedByConversation();

    void commentReplyToIM(Context context, Comment comment, UrlModel urlModel, String str, int i, String str2, String str3);

    void createDialogForComment(Context context, int i, Runnable runnable);

    String disLikeAweme(Aweme aweme, LinkData linkData) throws Exception;

    boolean disableWaterMarkForUnReviewed(Aweme aweme);

    String fetchShortenUrl(String str, String str2);

    String fixArabicShare(String str);

    int getBindPhoneForCommentAB();

    Widget getCommentAdWidget(C7561a<C7581n> aVar);

    Widget getCommentHeaderWidget(C7561a<C7581n> aVar);

    C28463p<?, ?> getFeedStatusPresenter(Context context);

    Uri getFileProviderUri(Context context, File file);

    Uri getFileProviderUri(Context context, String str);

    ICommentLikeUsersHolder getICommentLikeUsersHolder(ViewGroup viewGroup);

    int getIsLongItem(Context context);

    ReplacementSpan getLinkTagSpan(Context context, Aweme aweme);

    long getPlayerManagerCurrentPosition();

    Comparator<C38343b> getServerControlChannelOrder();

    String getShareThumbUrl(Context context, String str);

    void injectConfig(C38382b bVar, boolean z);

    boolean interceptShareSheetAction(C38389f fVar, Context context);

    boolean isBlackBackground();

    boolean isChallengeToHashTag();

    boolean isCommentShareable();

    boolean isCurPlayActive(Activity activity);

    boolean isFacebookShareLinkEnable();

    boolean isFollowFeedEnterFullScreenDetail();

    boolean isForbiddenWaterClientMark();

    boolean isInLongVideoPage(Context context);

    boolean isInstagramShareShowDialogTip();

    boolean isInstagramShareShowToastTip();

    boolean isMainPageFragmentVisible(Fragment fragment);

    boolean isMiniEmojiPanelEnabled();

    boolean isNeedShowKeyboard(int i);

    boolean isNewCommentBackground();

    boolean isOnFeedPage(Context context);

    boolean isSearchMixViewHolder();

    boolean isShowBarrageStyle(String str, Aweme aweme);

    void logAdLink(Context context, String str, LinkData linkData, Aweme aweme, String str2);

    void logDetailAdMaskClickReplay(Context context, String str, String str2, String str3);

    void logFeedRawAdComment(Context context, Aweme aweme, String str);

    boolean needBindMobile();

    void onEventV3IncludingPoiParams(Aweme aweme, String str, C22984d dVar);

    void onEventV3JsonIncludingPoiParams(Aweme aweme, String str, C22984d dVar);

    void report(Activity activity, Comment comment, String str);

    void report(Activity activity, Aweme aweme, String str, String str2);

    void sendAdLog(Context context, Aweme aweme, String str, String str2);

    void shareAfterDownload(Activity activity, int i, SharePackage sharePackage, String str, Comment comment, Aweme aweme, boolean z, boolean z2, boolean z3, C28689b bVar);

    boolean shouldReplyDirectly();

    boolean shouldSelfSeeAwemeWithOutWaterMark(Aweme aweme);

    void startSummonFriendActivityForResult(Activity activity, String str, int i, int i2);

    void startUserProfileActivity(Context context, String str, String str2, String str3);

    boolean supportCommentGifEmoji();

    void tryShowCommentFilterGuide(Activity activity, Aweme aweme, Comment comment);
}
