package com.p280ss.android.ugc.aweme.p313im.service;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
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
import java.io.File;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.service.IIMService */
public interface IIMService {
    void addGroupByPassword(String str);

    void addSessionListFragmentHeader(Fragment fragment, View view);

    void cacheRecentShareContact(IMContact iMContact);

    boolean canFetchFollowListIdle();

    boolean canShowLiveNotification();

    boolean checkGroupChatGuide(int i);

    void cleanFeedUpdateCount(String str);

    void cleanUpdateTagCount(String str);

    boolean clearAudioDownloadCache();

    void clearIMNotification();

    void commandShareVideo(Context context, C7104a aVar);

    void commentReply(Context context, C7105b bVar);

    String convertSearchKeyword(String str, String str2, String str3, String str4);

    void deleteIMUser(String str);

    void deleteNoticeSession(C7102a aVar);

    void enableAssociativeEmoji(boolean z);

    void ensureIMState();

    void enterChooseContact(Context context, Bundle bundle, C6892b<Boolean> bVar);

    boolean exitUser(String str);

    void fetchFollowList();

    void forceRefreshSessionList();

    C7093b getAbInterface();

    List<IMUser> getAllFollowIMUsers();

    List<IMUser> getAllFriends();

    File getAudioDownloadCachePath();

    String getConversationId(String str);

    C7096a getExperimentService();

    String getIMContactConversationId(IMContact iMContact);

    String getIMContactUserId(IMContact iMContact);

    C7101f getIMErrorMonitor();

    IMUser getIMUserByUid(String str);

    C7305b getImParser();

    C7094a getInputMenuCustomizer();

    C7102a getNoticeSession(String str);

    List<IMUser> getRecentIMUsers();

    C7095a getRelationSelectFragment();

    C7097b getRelationService();

    Class getSessionListActivityClass();

    C7095a getSessionListFragment();

    C7099c getShareService();

    int getUpdateTagCount(String str);

    void hideIMNotification();

    void hideLiveNotification();

    void initialize(Application application, C7091a aVar, C7103h hVar);

    boolean isAssociativeEmojiEnabled();

    boolean isImReduction();

    boolean isInMainFeed();

    boolean isNeedToContinuePlayInAct();

    boolean isXInstalled(Context context);

    boolean isXPlanB();

    boolean isXPlanOpen();

    void loadWcdbLibrary();

    void markSessionInMsgHelperRead(int i, int i2);

    void onFlipChatConversationListFinish(Bundle bundle);

    void onFlipChatLastMsgUpdate(Bundle bundle);

    void onFlipChatMsgBind(Bundle bundle);

    void onFlipChatMsgUnbind(boolean z);

    void onFlipChatPushMsgUpdate(String str, long j);

    void onFlipChatUnreadCountUpdate(Bundle bundle);

    void onNewNoticeArrived(int i, Bundle bundle);

    void openSessionListActivity(Context context);

    void openX(Context context, int i);

    void refreshLoginState();

    void resetLoginState();

    List<IMUser> searchFollowIMUser(List<IMUser> list, String str);

    void setAbInterface(C7093b bVar);

    void setInputMenuCustomizer(C7094a aVar);

    void setNeedToContinuePlayInAct(boolean z);

    void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, C6892b<Boolean> bVar);

    void showIMNotification(Boolean bool);

    void showLiveNotification();

    void showShareDialog(Activity activity, SharePackage sharePackage, IMUser iMUser, C6892b<Boolean> bVar);

    boolean startChat(Context context, IMContact iMContact);

    boolean startChat(Context context, IMUser iMUser);

    boolean startChat(Context context, IMUser iMUser, int i);

    boolean startChatWithAdLog(Context context, IMUser iMUser, IMAdLog iMAdLog);

    boolean startChatWithAdLog(Context context, IMUser iMUser, IMAdLog iMAdLog, Serializable serializable);

    boolean startChatWithExt(Context context, IMUser iMUser, Serializable serializable);

    void startSelectChatMsg(Context context, String str, IMUser iMUser, int i, String str2);

    void storyMessageReply(Context context, Bundle bundle, Runnable runnable, Runnable runnable2);

    void updateIMUser(IMUser iMUser);

    void updateIMUserFollowStatus(IMUser iMUser);

    void updateNoticeSession(C7102a aVar);

    void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i);

    void wrapperChatWithSyncXAlert(Activity activity, IMUser iMUser, int i, IMAdLog iMAdLog);

    void wrapperIMShareIcon(Context context, RemoteImageView remoteImageView, int i);

    void wrapperIMShareText(Context context, TextView textView);

    void wrapperSendMessageSyncXIcon(RemoteImageView remoteImageView, int i);

    void wrapperShareToX(Activity activity, Bundle bundle, int i);

    void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable);

    void wrapperSyncXAlert(Context context, int i, boolean z, Runnable runnable, C7092b bVar);

    void wrapperSyncXBlockWithDialog(Context context, boolean z, OnClickListener onClickListener);

    void wrapperSyncXStory(Activity activity, C7106f fVar, int i, C7092b bVar);

    void wrapperVideoShareBtnImIconAndText(boolean z, Context context, RemoteImageView remoteImageView, TextView textView, int i, C6892b<String> bVar);
}
