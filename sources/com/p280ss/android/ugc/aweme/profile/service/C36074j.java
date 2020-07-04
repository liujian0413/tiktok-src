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
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1483d.C35742a;
import com.p280ss.android.ugc.aweme.profile.p1483d.C35743b;
import com.p280ss.android.ugc.aweme.profile.p1484e.C35745a;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.profile.service.j */
public final class C36074j implements IProfileDependentComponentService {

    /* renamed from: a */
    public static final C36074j f94315a = new C36074j();

    /* renamed from: b */
    private final /* synthetic */ IProfileDependentComponentService f94316b;

    public final void activeTT(Context context, String str, String str2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "targetPackage");
        C7573i.m23587b(str2, "userId");
        this.f94316b.activeTT(context, str, str2);
    }

    public final <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C6810f fVar, boolean z, String str3) {
        String str4 = str;
        C7573i.m23587b(str, "url");
        Class<T> cls2 = cls;
        C7573i.m23587b(cls, "cls");
        C6810f fVar2 = fVar;
        C7573i.m23587b(fVar, "headerGroup");
        return this.f94316b.apiExecuteGetJSONObject(i, str4, cls2, str2, fVar2, z, str3);
    }

    public final <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(cls, "cls");
        return this.f94316b.apiExecuteGetJSONObject(str, cls, str2, z, str3);
    }

    public final boolean bindHintWindowsRulerCanShowBindDialog(boolean z) {
        return this.f94316b.bindHintWindowsRulerCanShowBindDialog(z);
    }

    public final boolean bindHintWindowsRulerGetShowCompleteProfileDialog(List<String> list, int i, int i2) {
        C7573i.m23587b(list, "urlList");
        return this.f94316b.bindHintWindowsRulerGetShowCompleteProfileDialog(list, i, i2);
    }

    public final boolean bindHintWindowsRulerShouldShowCompletePhone() {
        return this.f94316b.bindHintWindowsRulerShouldShowCompletePhone();
    }

    public final C36069e bridgeService() {
        return this.f94316b.bridgeService();
    }

    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, C28532n nVar) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(nVar, "onHasMoreListener");
        return this.f94316b.buildBaseRecyclerView(recyclerView, nVar);
    }

    public final void displayActivityLink(Context context, FrameLayout frameLayout, RemoteImageView remoteImageView, DmtTextView dmtTextView, ImageView imageView, ImageView imageView2, String str, String str2, LinkInfo linkInfo) {
        Context context2 = context;
        C7573i.m23587b(context, "context");
        this.f94316b.displayActivityLink(context2, frameLayout, remoteImageView, dmtTextView, imageView, imageView2, str, str2, linkInfo);
    }

    public final SpannableStringBuilder ellipsizeText2ExceptWidth(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        C7573i.m23587b(spannableStringBuilder, "spannable");
        C7573i.m23587b(textPaint, "paint");
        return this.f94316b.ellipsizeText2ExceptWidth(spannableStringBuilder, textPaint, i, i2, i3, i4);
    }

    public final C36070f favoritesMobUtilsService() {
        return this.f94316b.favoritesMobUtilsService();
    }

    public final int getBindFGGuideTextIndex() {
        return this.f94316b.getBindFGGuideTextIndex();
    }

    public final int getCloseWeiboEntry() {
        return this.f94316b.getCloseWeiboEntry();
    }

    public final String getGradientPunishWarningSettingsBubbleText() {
        return this.f94316b.getGradientPunishWarningSettingsBubbleText();
    }

    public final C7562b<Boolean, C7581n> getNotificationManagerHandleSystemCamera() {
        return this.f94316b.getNotificationManagerHandleSystemCamera();
    }

    public final C48008s<Activity, Fragment, Integer, String, String, C7581n> getStartCameraActivity() {
        return this.f94316b.getStartCameraActivity();
    }

    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        Activity activity2 = activity;
        C7573i.m23587b(activity, "activity");
        String str2 = str;
        C7573i.m23587b(str, "originalUrl");
        this.f94316b.gotoCropActivity(activity2, str2, z, f, i, i2, i3, i4);
    }

    public final void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        Fragment fragment2 = fragment;
        C7573i.m23587b(fragment, "fragment");
        String str2 = str;
        C7573i.m23587b(str, "originalUrl");
        this.f94316b.gotoCropActivity(fragment2, str2, z, f, i, i2, i3, i4);
    }

    public final boolean hasUnreadStoryWithCheck(User user, User user2) {
        return this.f94316b.hasUnreadStoryWithCheck(user, user2);
    }

    public final String hexDigest(String str) {
        C7573i.m23587b(str, "string");
        return this.f94316b.hexDigest(str);
    }

    public final boolean isBigBriefIntroduce() {
        return this.f94316b.isBigBriefIntroduce();
    }

    public final boolean isEnableSettingDiskManager() {
        return this.f94316b.isEnableSettingDiskManager();
    }

    public final boolean isFtcBindEnable() {
        return this.f94316b.isFtcBindEnable();
    }

    public final boolean isStarAtlasCooperationEntryOpen() {
        return this.f94316b.isStarAtlasCooperationEntryOpen();
    }

    public final void launchProfileCoverCropActivity(FragmentActivity fragmentActivity, Aweme aweme) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(aweme, "aweme");
        this.f94316b.launchProfileCoverCropActivity(fragmentActivity, aweme);
    }

    public final void logShowProfileDiskManagerGuideView() {
        this.f94316b.logShowProfileDiskManagerGuideView();
    }

    public final C35745a mainAnimViewModel(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        return this.f94316b.mainAnimViewModel(fragmentActivity);
    }

    public final C7492s<Boolean> needShowDiskManagerGuideView() {
        return this.f94316b.needShowDiskManagerGuideView();
    }

    public final boolean needShowProfileGuideToFillAvatarAndNickname() {
        return this.f94316b.needShowProfileGuideToFillAvatarAndNickname();
    }

    public final C13842b newLiveBlurProcessor(int i, float f, C19588a aVar) {
        return this.f94316b.newLiveBlurProcessor(i, f, aVar);
    }

    public final C35743b newLivePlayHelper(Runnable runnable, C35742a aVar) {
        C7573i.m23587b(runnable, "onStreamPlay");
        C7573i.m23587b(aVar, "callback");
        return this.f94316b.newLivePlayHelper(runnable, aVar);
    }

    public final boolean onAntiCrawlerEvent(String str) {
        return this.f94316b.onAntiCrawlerEvent(str);
    }

    public final void onI18nVerificationViewClick(Context context, User user, String str, String str2) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "type");
        this.f94316b.onI18nVerificationViewClick(context, user, str, str2);
    }

    public final void onPunishWarningClick(Context context) {
        C7573i.m23587b(context, "context");
        this.f94316b.onPunishWarningClick(context);
    }

    public final void onPunishWarningShow() {
        this.f94316b.onPunishWarningShow();
    }

    public final boolean platformInfoManagerHasPlatformBinded() {
        return this.f94316b.platformInfoManagerHasPlatformBinded();
    }

    public final void preloadMiniApp(String str) {
        this.f94316b.preloadMiniApp(str);
    }

    public final ReplacementSpan rankingTagSpan(BlueVBrandInfo blueVBrandInfo) {
        C7573i.m23587b(blueVBrandInfo, "info");
        return this.f94316b.rankingTagSpan(blueVBrandInfo);
    }

    public final C7319aa<BaseResponse> setPrivateSettingItem(String str, int i) {
        C7573i.m23587b(str, "field");
        return this.f94316b.setPrivateSettingItem(str, i);
    }

    public final boolean shouldShowGradientPunishWarningBubble() {
        return this.f94316b.shouldShowGradientPunishWarningBubble();
    }

    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.f94316b.shouldUseRecyclerPartialUpdate();
    }

    public final Object showBindPhoneDialog(NoticeView noticeView, Context context) {
        C7573i.m23587b(noticeView, "noticeBar");
        C7573i.m23587b(context, "context");
        return this.f94316b.showBindPhoneDialog(noticeView, context);
    }

    public final Object showCompletePhone(NoticeView noticeView) {
        C7573i.m23587b(noticeView, "noticeBar");
        return this.f94316b.showCompletePhone(noticeView);
    }

    public final boolean showProfileCollectionTab() {
        return this.f94316b.showProfileCollectionTab();
    }

    public final Object showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, OnClickListener onClickListener2, float f, boolean z) {
        C7573i.m23587b(noticeView, "noticeBar");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(onClickListener, "onClick");
        C7573i.m23587b(onClickListener2, "onCloseClick");
        return this.f94316b.showProfileCompleteView(noticeView, context, onClickListener, onClickListener2, f, z);
    }

    public final Object showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, List<String> list, int i, int i2) {
        C7573i.m23587b(noticeView, "noticeBar");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(onClickListener, "onClick");
        C7573i.m23587b(list, "urlList");
        return this.f94316b.showProfileCompleteView(noticeView, context, onClickListener, list, i, i2);
    }

    public final void showProfileGuideToFillAvatarAndNickname(C0608j jVar) {
        this.f94316b.showProfileGuideToFillAvatarAndNickname(jVar);
    }

    public final void startCrossPlatformActivity(Context context, String str) {
        C7573i.m23587b(context, "context");
        this.f94316b.startCrossPlatformActivity(context, str);
    }

    public final void startDiskManagerActivity(Context context) {
        C7573i.m23587b(context, "context");
        this.f94316b.startDiskManagerActivity(context);
    }

    public final void startDownloadControlSettingActivity(Activity activity, int i) {
        C7573i.m23587b(activity, "activity");
        this.f94316b.startDownloadControlSettingActivity(activity, i);
    }

    public final void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        C7573i.m23587b(view, "preView");
        C7573i.m23587b(user, "user");
        this.f94316b.startHeaderDetailActivity(activity, view, str, user);
    }

    public final String typeVerificationEnterprise() {
        return this.f94316b.typeVerificationEnterprise();
    }

    public final void watchLiveMob(Context context, User user, String str, String str2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "enterMethod");
        this.f94316b.watchLiveMob(context, user, str, str2);
    }

    private C36074j() {
        Object service = ServiceManager.get().getService(IProfileDependentComponentService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…onentService::class.java)");
        this.f94316b = (IProfileDependentComponentService) service;
    }
}
