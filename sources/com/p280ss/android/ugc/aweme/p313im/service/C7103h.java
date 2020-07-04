package com.p280ss.android.ugc.aweme.p313im.service;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.following.model.C29567c;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32000a;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32001c;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32003d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.service.h */
public interface C7103h {
    void addImpressionId(int i, String str);

    void bindRecommendContactItemView(C1293v vVar, RecommendContact recommendContact, int i);

    void bindRecommendViewHolder(C1293v vVar, User user, int i, boolean z, int i2);

    boolean canShowInnerNotification();

    boolean checkIMInsertRecommendContact();

    void checkPluginAndLoadLibrary(Context context, boolean z, String str, C32000a aVar);

    C1293v createRecommendContactItemView(ViewGroup viewGroup, C7563m<RecommendContact, Integer, C7581n> mVar);

    C1293v createRecommendViewHolder(Context context, HashMap<String, Boolean> hashMap, C32001c<User> cVar);

    void downloadPdf(Context context, String str, String str2);

    boolean enableIM();

    boolean enableSendPic();

    void enterAddFriendsActivity(Context context);

    void enterDetailActivity(Context context, String str, String str2, String str3, int i, int i2, String str4, View view);

    void feedbackIm(String str, String str2);

    String getAppLanguage();

    int getAssociativeEmoji();

    Activity getCurrentActivity();

    ViewGroup getCurrentDecorView(Activity activity);

    String getCurrentLocaleLanguage();

    C25673a<User, C29567c> getFollowerFetchModel(String str, String str2);

    String getFriendToFamiliarStr(int i, int i2);

    C32025c getIMSetting();

    String getInnerPushEnterFrom();

    boolean getIsHotSearchBillboardEnable();

    C32014g getLiveProxy();

    C32023i getPlayerProxy();

    int getRecommendContactPosition();

    long getSpringApiLimitedTime();

    String getToReportId();

    String getWsUrl();

    int getXPlanStyle();

    void handleXDownload(Activity activity, String str, C32005c cVar);

    boolean isCheckPlugin();

    boolean isEnableShowTeenageTip();

    boolean isFFSDKBind();

    boolean isInMainFeed();

    boolean isInPublishPage();

    boolean isMainPage();

    boolean isNeedToContinuePlayInAct();

    boolean isXPlanRedPacketOpen();

    void jumpToLivePage(Context context, String str, String str2, String str3);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logIMShareHeadShow();

    void makePhoneCall(Activity activity, String str, String str2, String str3, String str4);

    void monitorMsgSendStatus(Map<String, String> map);

    void openFFSdkSchema(String str);

    void openLiveUrl(Context context, String str);

    void openPrivacyReminder(Context context);

    void openUrl(Context context, Uri uri, boolean z);

    void popCaptcha(Activity activity, int i, C32003d dVar);

    void putSecUidToMap(String str, String str2);

    void recordLastShareTypeIsIm();

    void saveLogPb(String str, String str2);

    void saveShareCommandToSp(String str);

    void setCurrentLocaleLanguage(String str);

    void setIMAwemeProvider(C32009e eVar);

    void setNeedToContinueToPlay(boolean z);

    void setSharePlayer(Object... objArr);

    void shareToTargetChannel(Context context, String str);

    boolean showNewStyle();

    void showNotification(String str, String str2);

    void updateApk(Context context);
}
