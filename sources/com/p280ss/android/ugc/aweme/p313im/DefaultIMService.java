package com.p280ss.android.ugc.aweme.p313im;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.service.C7091a;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.C7101f;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7104a;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7105b;
import com.p280ss.android.ugc.aweme.p313im.service.model.C7106f;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C7092b;
import com.p280ss.android.ugc.aweme.p313im.service.p323b.C7094a;
import com.p280ss.android.ugc.aweme.p313im.service.p324d.C7095a;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7096a;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7097b;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7099c;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.websocket.p344ws.p345b.C7305b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.DefaultIMService */
public final class DefaultIMService implements IIMService {
    private static DefaultIMService sInstance;

    private DefaultIMService() {
    }

    public final void addGroupByPassword(String str) {
    }

    public final void addSessionListFragmentHeader(Fragment fragment, View view) {
    }

    public final void cacheRecentShareContact(IMContact iMContact) {
    }

    public final boolean canFetchFollowListIdle() {
        return false;
    }

    public final boolean canShowLiveNotification() {
        return false;
    }

    public final boolean checkGroupChatGuide(int i) {
        return false;
    }

    public final void cleanFeedUpdateCount(String str) {
    }

    public final void cleanUpdateTagCount(String str) {
    }

    public final boolean clearAudioDownloadCache() {
        return false;
    }

    public final void clearIMNotification() {
    }

    public final void commandShareVideo(Context context, C7104a aVar) {
    }

    public final void commentReply(Context context, C7105b bVar) {
    }

    public final String convertSearchKeyword(String str, String str2, String str3, String str4) {
        return null;
    }

    public final void deleteIMUser(String str) {
    }

    public final void deleteNoticeSession(C7102a aVar) {
    }

    public final void enableAssociativeEmoji(boolean z) {
    }

    public final void ensureIMState() {
    }

    public final void enterChooseContact(Context context, Bundle bundle, C6892b<Boolean> bVar) {
    }

    public final boolean exitUser(String str) {
        return false;
    }

    public final void fetchFollowList() {
    }

    public final void forceRefreshSessionList() {
    }

    public final C7093b getAbInterface() {
        return null;
    }

    public final List<IMUser> getAllFollowIMUsers() {
        return null;
    }

    public final List<IMUser> getAllFriends() {
        return null;
    }

    public final File getAudioDownloadCachePath() {
        return null;
    }

    public final String getConversationId(String str) {
        return "";
    }

    public final C7096a getExperimentService() {
        return null;
    }

    public final String getIMContactConversationId(IMContact iMContact) {
        return null;
    }

    public final String getIMContactUserId(IMContact iMContact) {
        return null;
    }

    public final C7101f getIMErrorMonitor() {
        return null;
    }

    public final IMUser getIMUserByUid(String str) {
        return null;
    }

    public final C7305b getImParser() {
        return null;
    }

    public final C7094a getInputMenuCustomizer() {
        return null;
    }

    public final C7102a getNoticeSession(String str) {
        return null;
    }

    public final List<IMUser> getRecentIMUsers() {
        return null;
    }

    public final C7095a getRelationSelectFragment() {
        return null;
    }

    public final C7097b getRelationService() {
        return null;
    }

    public final Class getSessionListActivityClass() {
        return null;
    }

    public final C7095a getSessionListFragment() {
        return null;
    }

    public final C7099c getShareService() {
        return null;
    }

    public final int getUpdateTagCount(String str) {
        return 0;
    }

    public final void hideIMNotification() {
    }

    public final void hideLiveNotification() {
    }

    public final void initialize(Application application, C7091a aVar, C7103h hVar) {
    }

    public final boolean isAssociativeEmojiEnabled() {
        return true;
    }

    public final boolean isImReduction() {
        return false;
    }

    public final boolean isInMainFeed() {
        return false;
    }

    public final boolean isNeedToContinuePlayInAct() {
        return false;
    }

    public final boolean isXInstalled(Context context) {
        return false;
    }

    public final boolean isXPlanB() {
        return false;
    }

    public final boolean isXPlanOpen() {
        return false;
    }

    public final void loadWcdbLibrary() {
    }

    public final void markSessionInMsgHelperRead(int i, int i2) {
    }

    public final void onFlipChatConversationListFinish(Bundle bundle) {
    }

    public final void onFlipChatLastMsgUpdate(Bundle bundle) {
    }

    public final void onFlipChatMsgBind(Bundle bundle) {
    }

    public final void onFlipChatMsgUnbind(boolean z) {
    }

    public final void onFlipChatPushMsgUpdate(String str, long j) {
    }

    public final void onFlipChatUnreadCountUpdate(Bundle bundle) {
    }

    public final void onNewNoticeArrived(int i, Bundle bundle) {
    }

    public final void openSessionListActivity(Context context) {
    }

    public final void openX(Context context, int i) {
    }

    public final void refreshLoginState() {
    }

    public final void resetLoginState() {
    }

    public final List<IMUser> searchFollowIMUser(List<IMUser> list, String str) {
        return null;
    }

    public final void setAbInterface(C7093b bVar) {
    }

    public final void setInputMenuCustomizer(C7094a aVar) {
    }

    public final void setNeedToContinuePlayInAct(boolean z) {
    }

    public final void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, C6892b<Boolean> bVar) {
    }

    public final void showIMNotification(Boolean bool) {
    }

    public final void showLiveNotification() {
    }

    public final void showShareDialog(Activity activity, SharePackage sharePackage, IMUser iMUser, C6892b<Boolean> bVar) {
    }

    public final boolean startChat(Context context, IMContact iMContact) {
        return false;
    }

    public final boolean startChat(Context context, IMUser iMUser) {
        return false;
    }

    public final boolean startChat(Context context, IMUser iMUser, int i) {
        return false;
    }

    public final boolean startChatWithAdLog(Context context, IMUser iMUser, IMAdLog iMAdLog) {
        return false;
    }

    public final boolean startChatWithAdLog(Context context, IMUser iMUser, IMAdLog iMAdLog, Serializable serializable) {
        return false;
    }

    public final boolean startChatWithExt(Context context, IMUser iMUser, Serializable serializable) {
        return false;
    }

    public final void startSelectChatMsg(Context context, String str, IMUser iMUser, int i, String str2) {
    }

    public final void updateIMUser(IMUser iMUser) {
    }

    public final void updateIMUserFollowStatus(IMUser iMUser) {
    }

    public final void updateNoticeSession(C7102a aVar) {
    }

    public final void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i) {
    }

    public final void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, IMAdLog iMAdLog) {
    }

    public final void wrapperIMShareIcon(Context context, RemoteImageView remoteImageView, int i) {
    }

    public final void wrapperIMShareText(Context context, TextView textView) {
    }

    public final void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i) {
    }

    public final void wrapperShareToX(Activity activity, Bundle bundle, int i) {
    }

    public final void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable, C7092b bVar) {
    }

    public final void wrapperSyncXStory(Activity activity, C7106f fVar, int i, C7092b bVar) {
    }

    public final void wrapperVideoShareBtnImIconAndText(boolean z, Context context, RemoteImageView remoteImageView, TextView textView, int i, C6892b<String> bVar) {
    }

    public static DefaultIMService inst() {
        if (sInstance == null) {
            synchronized (DefaultIMService.class) {
                if (sInstance == null) {
                    sInstance = new DefaultIMService();
                }
            }
        }
        return sInstance;
    }

    public final void wrapperSyncXBlockWithDialog(Context context, boolean z, OnClickListener onClickListener) {
        new C10741a(context).mo25657b((int) R.string.bhb).mo25650a((int) R.string.afn, onClickListener).mo25658b((int) R.string.w_, onClickListener).mo25656a().mo25637a();
    }

    public final void storyMessageReply(Context context, Bundle bundle, Runnable runnable, Runnable runnable2) {
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
