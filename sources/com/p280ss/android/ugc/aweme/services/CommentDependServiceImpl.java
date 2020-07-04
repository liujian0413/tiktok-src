package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentLikeUsersHolder;
import com.p280ss.android.ugc.aweme.comment.api.ICommentLikeUsersHolder;
import com.p280ss.android.ugc.aweme.comment.experiment.BindPhoneForCommentAB;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.services.C24219a;
import com.p280ss.android.ugc.aweme.comment.widgets.CommentAdWidget;
import com.p280ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.ISearchMixViewHolderExperiment;
import com.p280ss.android.ugc.aweme.discover.mob.C26781b;
import com.p280ss.android.ugc.aweme.experiment.CommentShareableExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28458l;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28460m;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28463p;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.C28687a;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28689b;
import com.p280ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.p280ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.p1285ui.SummonFriendActivity;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32720b;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainFragment;
import com.p280ss.android.ugc.aweme.main.MainPageFragment;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p962f.C21704d;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.report.C37196b;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.commentfilter.p1515b.C37607a.C37608a;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.C37990ar;
import com.p280ss.android.ugc.aweme.share.C37996b;
import com.p280ss.android.ugc.aweme.share.improve.C38152c;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38082aj;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38109l;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.share.libra.CloseClientWatermarkExperiment;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C42972bf;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import com.p280ss.android.ugc.trill.share.base.C45083a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Comparator;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.services.CommentDependServiceImpl */
public class CommentDependServiceImpl implements C24219a {
    public ReplacementSpan getLinkTagSpan(Context context, Aweme aweme) {
        return null;
    }

    public boolean isShowBarrageStyle(String str, Aweme aweme) {
        return false;
    }

    public void logAdLink(Context context, String str, LinkData linkData, Aweme aweme, String str2) {
    }

    public boolean isChallengeToHashTag() {
        C7213d.m22500a();
        return true;
    }

    public boolean isForbiddenWaterClientMark() {
        return CloseClientWatermarkExperiment.INSTANCE.closed();
    }

    public boolean needBindMobile() {
        return C21704d.m72621a();
    }

    public boolean commentReplyGroupedByConversation() {
        return C7213d.m22500a().mo18753aP();
    }

    public long getPlayerManagerCurrentPosition() {
        return C43316v.m137450K().mo104915n();
    }

    public Comparator<C38343b> getServerControlChannelOrder() {
        return C37984ap.m121302b().channelServerOrder();
    }

    public boolean isFacebookShareLinkEnable() {
        return C7213d.m22500a().mo18708A();
    }

    public boolean isI18nReplyBuildingEnabled() {
        return C7213d.m22500a().mo18773ak();
    }

    public boolean isInstagramShareShowDialogTip() {
        return C7213d.m22500a().mo18780as();
    }

    public boolean isInstagramShareShowToastTip() {
        return C7213d.m22500a().mo18779ar();
    }

    public boolean isMiniEmojiPanelEnabled() {
        return C7213d.m22500a().mo18771ai();
    }

    public boolean shouldReplyDirectly() {
        return C7213d.m22500a().mo18713F();
    }

    public boolean supportCommentGifEmoji() {
        return C7213d.m22500a().mo18822v();
    }

    public int getBindPhoneForCommentAB() {
        return C6384b.m19835a().mo15287a(BindPhoneForCommentAB.class, true, "bind_phone_for_post_comment", C6384b.m19835a().mo15295d().bind_phone_for_post_comment, 21);
    }

    public boolean isBlackBackground() {
        Activity g = C6405d.m19984g();
        if ((g instanceof ForwardDetailActivity) || (g instanceof OriginDetailActivity)) {
            return true;
        }
        return false;
    }

    public boolean isCommentShareable() {
        return C6384b.m19835a().mo15292a(CommentShareableExperiment.class, false, "support_share_comment", C6384b.m19835a().mo15295d().support_share_comment, false);
    }

    public boolean isFollowFeedEnterFullScreenDetail() {
        return C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false);
    }

    public boolean isNewCommentBackground() {
        AbTestModel d = C7213d.m22500a().mo18803bo();
        if (d == null || d.commentBG != 0) {
            return false;
        }
        return true;
    }

    public boolean isSearchMixViewHolder() {
        if (C6384b.m19835a().mo15287a(ISearchMixViewHolderExperiment.class, true, "search_mix_display_type", C6384b.m19835a().mo15295d().search_mix_display_type, 0) != 0) {
            return true;
        }
        return false;
    }

    public boolean checkDownloadByAwemeStatus(Aweme aweme) {
        return C28687a.m94366b(aweme);
    }

    public boolean checkPermission(Activity activity) {
        return C38082aj.m121569a(activity);
    }

    public boolean disableWaterMarkForUnReviewed(Aweme aweme) {
        return C28687a.m94370e(aweme);
    }

    public String fixArabicShare(String str) {
        return C37996b.m121311a(str);
    }

    public Widget getCommentAdWidget(C7561a<C7581n> aVar) {
        return new CommentAdWidget(aVar);
    }

    public Widget getCommentHeaderWidget(C7561a<C7581n> aVar) {
        return new CommentHeaderWidget(aVar);
    }

    public int getIsLongItem(Context context) {
        return C32718a.m105909a(context);
    }

    public boolean isInLongVideoPage(Context context) {
        return C32718a.m105910b(context);
    }

    public boolean isLongVideo(Aweme aweme) {
        return C32720b.m105919a(aweme);
    }

    public boolean shouldSelfSeeAwemeWithOutWaterMark(Aweme aweme) {
        return C28687a.m94369d(aweme);
    }

    public void addShareRecord(String str) {
        C37984ap.m121302b().addShareRecord(str, 0);
    }

    public C28463p getFeedStatusPresenter(Context context) {
        C28460m mVar = new C28460m(context);
        mVar.mo66536a(new C28458l());
        return mVar;
    }

    public boolean isNeedShowKeyboard(int i) {
        return C7213d.m22500a().mo18737a(i);
    }

    public ICommentLikeUsersHolder getICommentLikeUsersHolder(ViewGroup viewGroup) {
        return new CommentLikeUsersHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a50, viewGroup, false));
    }

    public boolean isOnFeedPage(Context context) {
        if (context instanceof MainActivity) {
            Fragment a = ((MainActivity) context).getTabChangeManager().mo84567a();
            if (a != null && (a instanceof MainFragment) && ((MainFragment) a).mo84452c()) {
                return true;
            }
        }
        return false;
    }

    public boolean isMainPageFragmentVisible(Fragment fragment) {
        for (Fragment fragment2 : fragment.mFragmentManager.mo2658f()) {
            if ((fragment2 instanceof MainPageFragment) && fragment2.mUserVisibleHint) {
                return true;
            }
        }
        return false;
    }

    public boolean isCurPlayActive(Activity activity) {
        if (C6405d.m19987h()) {
            return false;
        }
        if (activity instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) activity;
            if (!ScrollSwitchStateManager.m98918a((FragmentActivity) mainActivity).mo79723b("page_feed") || !mainActivity.isUnderMainTab() || !mainActivity.isViewValid()) {
                return false;
            }
            return true;
        } else if (!(activity instanceof DetailActivity)) {
            return false;
        } else {
            DetailActivity detailActivity = (DetailActivity) activity;
            if (!ScrollSwitchStateManager.m98918a((FragmentActivity) detailActivity).mo79723b("page_feed") || !detailActivity.isViewValid()) {
                return false;
            }
            return true;
        }
    }

    public void checkDownloadStoragePermission(Activity activity, C7561a<C7581n> aVar) {
        C38082aj.m121566a(activity, aVar);
    }

    public boolean checkDownloadAndDonotShowForbiddenToast(Context context, Aweme aweme) {
        return C28687a.m94365b(context, aweme);
    }

    public boolean checkShareAllowStatus(Aweme aweme, Context context) {
        return C38082aj.m121570a(aweme, context);
    }

    public String fetchShortenUrl(String str, String str2) {
        return C38152c.m121901a(str, str2, true);
    }

    public Uri getFileProviderUri(Context context, File file) {
        return C42972bf.m136419a(context, file);
    }

    public String getShareThumbUrl(Context context, String str) {
        return new C37990ar(context, str).f98919b;
    }

    public String disLikeAweme(Aweme aweme, LinkData linkData) throws Exception {
        return AwemeApi.m115430a(aweme, C25268bg.m83039a(aweme));
    }

    public Uri getFileProviderUri(Context context, String str) {
        return C42972bf.m136419a(context, new File(str));
    }

    public void injectConfig(C38382b bVar, boolean z) {
        C37984ap.m121301a().injectUniversalConfig(bVar, null, z);
    }

    public boolean interceptShareSheetAction(C38389f fVar, Context context) {
        if (!(fVar instanceof C38109l) || TrillApplication.m21341a().getExternalFilesDir(null) != null || C38157b.m121909b(context)) {
            return false;
        }
        C38159c.m121915a(context);
        return false;
    }

    public void appendV4CommonParams(C22984d dVar, String str, String str2) {
        C26781b.m87963a(dVar, str, str2);
    }

    public void logFeedRawAdComment(Context context, Aweme aweme, String str) {
        C24976t.m82259n(context, aweme, str);
    }

    public void onEventV3IncludingPoiParams(Aweme aweme, String str, C22984d dVar) {
        C35452k.m114511a(aweme, str, dVar);
    }

    public void onEventV3JsonIncludingPoiParams(Aweme aweme, String str, C22984d dVar) {
        C35452k.m114516b(aweme, str, dVar);
    }

    public void tryShowCommentFilterGuide(Activity activity, Aweme aweme, Comment comment) {
        C37608a.m120413a(activity, aweme, comment);
    }

    public void createDialogForComment(Context context, int i, Runnable runnable) {
        C21704d.m72619a(context, i, runnable, "comment");
    }

    public void report(Activity activity, Comment comment, String str) {
        int i;
        Builder appendQueryParameter = new Builder().appendQueryParameter("object_id", comment.getCid());
        String str2 = "comment_with_emoji";
        if (comment.getEmoji() != null) {
            i = 1;
        } else {
            i = 0;
        }
        Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(str2, String.valueOf(i)).appendQueryParameter("owner_id", Comment.getAuthorUid(comment)).appendQueryParameter("report_type", "comment");
        if (C6399b.m19944t()) {
            appendQueryParameter2.appendQueryParameter("locale", ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
            if (!TextUtils.isEmpty(str)) {
                appendQueryParameter2.appendQueryParameter("video_owner_id", str);
            }
        }
        C37196b.m119568b(activity, appendQueryParameter2);
    }

    public void logDetailAdMaskClickReplay(Context context, String str, String str2, String str3) {
        C24976t.m82239i(context, str, str2, str3);
    }

    public void report(Activity activity, Aweme aweme, String str, String str2) {
        C37196b.m119560a(activity, aweme, str, str2);
    }

    public void startUserProfileActivity(Context context, String str, String str2, String str3) {
        UserProfileActivity.m117394a(context, str, str2, str3);
    }

    public void sendAdLog(Context context, Aweme aweme, String str, String str2) {
        C24958f.m81905a().mo65273b(aweme).mo65266a(str).mo65276b(str2).mo65270a(context);
    }

    public void startSummonFriendActivityForResult(Activity activity, String str, int i, int i2) {
        if (activity != null) {
            Intent intent = new Intent(activity, SummonFriendActivity.class);
            intent.putExtra("video_id", str);
            intent.putExtra("source", i);
            activity.startActivityForResult(intent, i2);
        }
    }

    public void commentReplyToIM(Context context, Comment comment, UrlModel urlModel, String str, int i, String str2, String str3) {
        C30553b.m99784a(context, comment, urlModel, str, i, str2, str3);
    }

    public void shareAfterDownload(Activity activity, int i, SharePackage sharePackage, String str, Comment comment, Aweme aweme, boolean z, boolean z2, boolean z3, C28689b bVar) {
        Aweme aweme2 = aweme;
        C45083a aVar = new C45083a(activity, z, i, str, z2);
        aVar.f115889p = comment;
        aVar.f115884k = bVar;
        aVar.mo107632a(aweme);
        if (z3) {
            Activity activity2 = activity;
            aVar.mo107633a(aweme, activity.getString(R.string.bug), false);
            return;
        }
        aVar.mo107632a(aweme);
    }
}
