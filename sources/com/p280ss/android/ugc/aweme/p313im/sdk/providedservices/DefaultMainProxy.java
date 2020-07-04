package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.following.model.C29567c;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.p313im.service.C32005c;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e;
import com.p280ss.android.ugc.aweme.p313im.service.C32014g;
import com.p280ss.android.ugc.aweme.p313im.service.C32023i;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32000a;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32001c;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32003d;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32004e;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.DefaultMainProxy */
public class DefaultMainProxy implements C7103h {
    public void addImpressionId(int i, String str) {
    }

    public void bindRecommendContactItemView(C1293v vVar, RecommendContact recommendContact, int i) {
    }

    public void bindRecommendViewHolder(C1293v vVar, User user, int i, boolean z, int i2) {
    }

    public boolean canShowInnerNotification() {
        return false;
    }

    public boolean checkIMInsertRecommendContact() {
        return false;
    }

    public void checkPluginAndLoadLibrary(Context context, boolean z, String str, C32000a aVar) {
    }

    public C1293v createRecommendContactItemView(ViewGroup viewGroup, C7563m<RecommendContact, Integer, C7581n> mVar) {
        return null;
    }

    public C1293v createRecommendViewHolder(Context context, HashMap<String, Boolean> hashMap, C32001c<User> cVar) {
        return null;
    }

    public void downloadPdf(Context context, String str, String str2) {
    }

    public boolean enableIM() {
        return true;
    }

    public boolean enableSendPic() {
        return false;
    }

    public void enterAddFriendsActivity(Context context) {
    }

    public void enterDetailActivity(Context context, String str, String str2, String str3, int i, int i2, String str4, View view) {
    }

    public void enterNotificationDetail(Context context, int i, int i2, String str) {
    }

    public void feedbackIm(String str, String str2) {
    }

    public String getAppLanguage() {
        return null;
    }

    public int getAssociativeEmoji() {
        return 0;
    }

    public Locale getCountryLocale() {
        return null;
    }

    public Activity getCurrentActivity() {
        return null;
    }

    public ViewGroup getCurrentDecorView(Activity activity) {
        return null;
    }

    public C25673a<User, C29567c> getFollowerFetchModel(String str, String str2) {
        return null;
    }

    public int getFriendToFamiliarId(int i, int i2) {
        return 0;
    }

    public String getFriendToFamiliarStr(int i, int i2) {
        return "";
    }

    public String getInnerPushEnterFrom() {
        return "";
    }

    public boolean getIsHotSearchBillboardEnable() {
        return true;
    }

    public C32014g getLiveProxy() {
        return null;
    }

    public C32023i getPlayerProxy() {
        return null;
    }

    public int getRecommendContactPosition() {
        return -1;
    }

    public String getSessionId() {
        return "";
    }

    public long getSpringApiLimitedTime() {
        return 0;
    }

    public String getToReportId() {
        return null;
    }

    public String getWsUrl() {
        return null;
    }

    public int getXPlanStyle() {
        return 0;
    }

    public void handleXDownload(Activity activity, String str, C32005c cVar) {
    }

    public boolean isCheckPlugin() {
        return false;
    }

    public boolean isEnableShowTeenageTip() {
        return false;
    }

    public boolean isFFSDKBind() {
        return false;
    }

    public boolean isInMainFeed() {
        return false;
    }

    public boolean isInPublishPage() {
        return false;
    }

    public boolean isMainPage() {
        return false;
    }

    public boolean isNeedToContinuePlayInAct() {
        return false;
    }

    public boolean isXPlanRedPacketOpen() {
        return false;
    }

    public void jumpToDeepLink(Context context, String str) {
    }

    public void jumpToLivePage(Context context, String str, String str2, String str3) {
    }

    public void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
    }

    public void logIMShareHeadShow() {
    }

    public void makePhoneCall(Activity activity, String str, String str2, String str3, String str4) {
    }

    public void monitorMsgSendStatus(Map<String, String> map) {
    }

    public void openFFSdkSchema(String str) {
    }

    public void openLiveUrl(Context context, String str) {
    }

    public void openPrivacyReminder(Context context) {
    }

    public void openUrl(Context context, Uri uri, boolean z) {
    }

    public void popCaptcha(Activity activity, int i, C32003d dVar) {
    }

    public void postNotificationIndicator(int i, int i2) {
    }

    public void putSecUidToMap(String str, String str2) {
    }

    public void recordLastShareTypeIsIm() {
    }

    public void saveLogPb(String str, String str2) {
    }

    public void saveShareCommandToSp(String str) {
    }

    public void setCurrentLocaleLanguage(String str) {
    }

    public void setIMAwemeProvider(C32009e eVar) {
    }

    public void setNeedToContinueToPlay(boolean z) {
    }

    public void setSharePlayer(Object... objArr) {
    }

    public void shareToTargetChannel(Context context, String str) {
    }

    public boolean showNewStyle() {
        return false;
    }

    public void showNotification(String str, String str2) {
    }

    public void unSubscribeSession(int i, C32004e eVar) {
    }

    public void updateApk(Context context) {
    }

    public String getCurrentLocaleLanguage() {
        return Locale.CHINESE.getLanguage();
    }

    public C32025c getIMSetting() {
        return C32025c.m104002a();
    }
}
