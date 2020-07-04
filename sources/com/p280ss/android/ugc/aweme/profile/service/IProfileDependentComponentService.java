package com.p280ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.http.legacy.p296a.C6810f;
import com.p280ss.android.image.C19587d.C19588a;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1483d.C35742a;
import com.p280ss.android.ugc.aweme.profile.p1483d.C35743b;
import com.p280ss.android.ugc.aweme.profile.p1484e.C35745a;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService */
public interface IProfileDependentComponentService {
    void activeTT(Context context, String str, String str2);

    <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C6810f fVar, boolean z, String str3);

    <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3);

    boolean bindHintWindowsRulerCanShowBindDialog(boolean z);

    boolean bindHintWindowsRulerGetShowCompleteProfileDialog(List<String> list, int i, int i2);

    boolean bindHintWindowsRulerShouldShowCompletePhone();

    C36069e bridgeService();

    RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, C28532n nVar);

    void displayActivityLink(Context context, FrameLayout frameLayout, RemoteImageView remoteImageView, DmtTextView dmtTextView, ImageView imageView, ImageView imageView2, String str, String str2, LinkInfo linkInfo);

    SpannableStringBuilder ellipsizeText2ExceptWidth(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4);

    C36070f favoritesMobUtilsService();

    int getBindFGGuideTextIndex();

    int getCloseWeiboEntry();

    String getGradientPunishWarningSettingsBubbleText();

    C7562b<Boolean, C7581n> getNotificationManagerHandleSystemCamera();

    C48008s<Activity, Fragment, Integer, String, String, C7581n> getStartCameraActivity();

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4);

    void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4);

    boolean hasUnreadStoryWithCheck(User user, User user2);

    String hexDigest(String str);

    boolean isBigBriefIntroduce();

    boolean isEnableSettingDiskManager();

    boolean isFtcBindEnable();

    boolean isStarAtlasCooperationEntryOpen();

    void launchProfileCoverCropActivity(FragmentActivity fragmentActivity, Aweme aweme);

    void logShowProfileDiskManagerGuideView();

    C35745a mainAnimViewModel(FragmentActivity fragmentActivity);

    C7492s<Boolean> needShowDiskManagerGuideView();

    boolean needShowProfileGuideToFillAvatarAndNickname();

    C13842b newLiveBlurProcessor(int i, float f, C19588a aVar);

    C35743b newLivePlayHelper(Runnable runnable, C35742a aVar);

    boolean onAntiCrawlerEvent(String str);

    void onI18nVerificationViewClick(Context context, User user, String str, String str2);

    void onPunishWarningClick(Context context);

    void onPunishWarningShow();

    boolean platformInfoManagerHasPlatformBinded();

    void preloadMiniApp(String str);

    ReplacementSpan rankingTagSpan(BlueVBrandInfo blueVBrandInfo);

    C7319aa<BaseResponse> setPrivateSettingItem(String str, int i);

    boolean shouldShowGradientPunishWarningBubble();

    boolean shouldUseRecyclerPartialUpdate();

    Object showBindPhoneDialog(NoticeView noticeView, Context context);

    Object showCompletePhone(NoticeView noticeView);

    boolean showProfileCollectionTab();

    Object showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, OnClickListener onClickListener2, float f, boolean z);

    Object showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, List<String> list, int i, int i2);

    void showProfileGuideToFillAvatarAndNickname(C0608j jVar);

    void startCrossPlatformActivity(Context context, String str);

    void startDiskManagerActivity(Context context);

    void startDownloadControlSettingActivity(Activity activity, int i);

    void startHeaderDetailActivity(Activity activity, View view, String str, User user);

    String typeVerificationEnterprise();

    void watchLiveMob(Context context, User user, String str, String str2);
}
