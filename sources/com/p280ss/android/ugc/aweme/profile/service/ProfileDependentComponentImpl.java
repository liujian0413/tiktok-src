package com.p280ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Parcelable;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.sdk.account.p650b.p654d.C12748a;
import com.p280ss.android.http.legacy.p296a.C6810f;
import com.p280ss.android.image.C19587d.C19588a;
import com.p280ss.android.sdk.p899a.C20098b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.compliance.gradientpunish.C25796a;
import com.p280ss.android.ugc.aweme.compliance.gradientpunish.GradientPunishWarning;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.experiment.p1209a.C27687b;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;
import com.p280ss.android.ugc.aweme.hotsearch.p1296d.C30361a;
import com.p280ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.newfollow.live.C34140a;
import com.p280ss.android.ugc.aweme.newfollow.live.C34140a.C34141a;
import com.p280ss.android.ugc.aweme.newfollow.live.C34142b;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.C34283m;
import com.p280ss.android.ugc.aweme.p313im.C30561h;
import com.p280ss.android.ugc.aweme.p313im.C30561h.C30562a;
import com.p280ss.android.ugc.aweme.p962f.p963a.C21695a;
import com.p280ss.android.ugc.aweme.p962f.p963a.C21699c;
import com.p280ss.android.ugc.aweme.profile.guide.C35811b;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1483d.C35742a;
import com.p280ss.android.ugc.aweme.profile.p1483d.C35743b;
import com.p280ss.android.ugc.aweme.profile.p1484e.C35745a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.CropActivity.C36133a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.HeaderDetailActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36658a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36663b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36665c;
import com.p280ss.android.ugc.aweme.profile.util.C36689a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.VerifyActionManager;
import com.p280ss.android.ugc.aweme.setting.p337ui.DiskManagerActivity;
import com.p280ss.android.ugc.aweme.setting.p337ui.DownloadControlSettingActivity;
import com.p280ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.story.live.C41990e.C41991a;
import com.p280ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42916ad;
import com.p280ss.android.ugc.aweme.utils.C43060dk;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7586e;
import kotlin.text.C7634n;
import p346io.reactivex.C47556ac;
import p346io.reactivex.C47558ae;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl */
public final class ProfileDependentComponentImpl implements IProfileDependentComponentService {

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$a */
    public static final class C36057a implements C35745a {

        /* renamed from: a */
        public final MainAnimViewModel f94294a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f94295b;

        /* renamed from: a */
        public final C0052o<Boolean> mo90602a() {
            return this.f94294a.f85655c;
        }

        C36057a(FragmentActivity fragmentActivity) {
            this.f94295b = fragmentActivity;
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(MainAnimViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…nimViewModel::class.java)");
            this.f94294a = (MainAnimViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$b */
    static final class C36058b<T> implements C7495v<Boolean> {

        /* renamed from: a */
        public static final C36058b f94296a = new C36058b();

        C36058b() {
        }

        public final void subscribe(C47870u<Boolean> uVar) {
            C7573i.m23587b(uVar, "it");
            try {
                uVar.mo19239a((Object) Boolean.valueOf(DiskManagerActivity.f98398c.mo95146b()));
                uVar.mo19238a();
            } catch (Exception e) {
                uVar.mo19240a((Throwable) e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$c */
    static final class C36059c implements C34141a {

        /* renamed from: a */
        final /* synthetic */ C19588a f94297a;

        C36059c(C19588a aVar) {
            this.f94297a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$d */
    public static final class C36060d implements C35743b {

        /* renamed from: a */
        public final C34142b f94298a;

        /* renamed from: b */
        final /* synthetic */ Runnable f94299b;

        /* renamed from: c */
        final /* synthetic */ C35742a f94300c;

        /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$d$a */
        public static final class C36061a implements C34283m {

            /* renamed from: a */
            final /* synthetic */ C36060d f94301a;

            /* renamed from: a */
            public final void mo87007a(TextureView textureView, int i, int i2) {
            }

            C36061a(C36060d dVar) {
                this.f94301a = dVar;
            }

            /* renamed from: a */
            public final void mo87008a(PlayerMessage playerMessage, Object obj) {
                C7573i.m23587b(playerMessage, "message");
                this.f94301a.f94300c.mo90547a(playerMessage, obj);
            }
        }

        /* renamed from: a */
        public final void mo90599a() {
            this.f94298a.mo86826b();
        }

        /* renamed from: a */
        public final void mo90600a(boolean z) {
            this.f94298a.mo86824a(z);
        }

        C36060d(Runnable runnable, C35742a aVar) {
            this.f94299b = runnable;
            this.f94300c = aVar;
            this.f94298a = new C34142b(runnable, new C36061a(this));
        }

        /* renamed from: a */
        public final void mo90601a(boolean z, RoomStruct roomStruct, FrameLayout frameLayout) {
            C7573i.m23587b(roomStruct, "room");
            C7573i.m23587b(frameLayout, "liveStreamContainer");
            this.f94298a.mo86825a(true, roomStruct, frameLayout);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$e */
    static final /* synthetic */ class C36062e extends FunctionReference implements C7562b<Boolean, C7581n> {
        C36062e(C30561h hVar) {
            super(1, hVar);
        }

        public final String getName() {
            return "handleSystemCamera";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C30561h.class);
        }

        public final String getSignature() {
            return "handleSystemCamera(Z)V";
        }

        /* renamed from: a */
        private void m116154a(boolean z) {
            ((C30561h) this.receiver).mo80304a(z);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m116154a(((Boolean) obj).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$f */
    static final class C36063f<T> implements C47558ae<T> {

        /* renamed from: a */
        final /* synthetic */ String f94302a;

        /* renamed from: b */
        final /* synthetic */ int f94303b;

        C36063f(String str, int i) {
            this.f94302a = str;
            this.f94303b = i;
        }

        /* renamed from: a */
        public final void mo22262a(C47556ac<BaseResponse> acVar) {
            C7573i.m23587b(acVar, "it");
            acVar.mo119654a(PushSettingsApiManager.m120592b(this.f94302a, this.f94303b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$g */
    static final /* synthetic */ class C36064g extends FunctionReference implements C48008s<Activity, Fragment, Integer, String, String, C7581n> {

        /* renamed from: a */
        public static final C36064g f94304a = new C36064g();

        C36064g() {
            super(5);
        }

        public final String getName() {
            return "startCameraActivity";
        }

        public final C7585d getOwner() {
            return C7575l.m23596a(C42916ad.class, "main_musicallyI18nRelease");
        }

        public final String getSignature() {
            return "startCameraActivity(Landroid/app/Activity;Landroid/support/v4/app/Fragment;ILjava/lang/String;Ljava/lang/String;)V";
        }

        /* renamed from: a */
        private static void m116156a(Activity activity, Fragment fragment, int i, String str, String str2) {
            C7573i.m23587b(activity, "p1");
            C7573i.m23587b(str, "p4");
            C7573i.m23587b(str2, "p5");
            C42916ad.m136251a(activity, fragment, i, str, str2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m116156a((Activity) obj, (Fragment) obj2, ((Number) obj3).intValue(), (String) obj4, (String) obj5);
            return C7581n.f20898a;
        }
    }

    public final String typeVerificationEnterprise() {
        return "commerce_user";
    }

    public final C36066b bridgeService() {
        return new C36066b();
    }

    public final C36068d favoritesMobUtilsService() {
        return new C36068d();
    }

    public final C48008s<Activity, Fragment, Integer, String, String, C7581n> getStartCameraActivity() {
        return C36064g.f94304a;
    }

    public final boolean isEnableSettingDiskManager() {
        return C27687b.m90836a();
    }

    public final void logShowProfileDiskManagerGuideView() {
        DiskManagerActivity.f98398c.mo95147c();
    }

    public final boolean needShowProfileGuideToFillAvatarAndNickname() {
        return C35811b.m115628a();
    }

    public final boolean showProfileCollectionTab() {
        C7213d.m22500a();
        return C7213d.m22502aq();
    }

    public final int getBindFGGuideTextIndex() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18725S();
    }

    public final int getCloseWeiboEntry() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18718K();
    }

    public final String getGradientPunishWarningSettingsBubbleText() {
        GradientPunishWarning a = C25796a.m84785a();
        if (a != null) {
            String bubbleText = a.getBubbleText();
            if (bubbleText != null) {
                return bubbleText;
            }
        }
        return "";
    }

    public final C7586e<C7581n> getNotificationManagerHandleSystemCamera() {
        return new C36062e(C30562a.m99834a());
    }

    public final boolean isBigBriefIntroduce() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18824x();
    }

    public final boolean isFtcBindEnable() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18724R();
    }

    public final boolean isStarAtlasCooperationEntryOpen() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18817q();
    }

    public final boolean platformInfoManagerHasPlatformBinded() {
        return C20098b.m66270a().mo53820b();
    }

    public final boolean shouldUseRecyclerPartialUpdate() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18803bo().useRecyclerPartialUpdate;
    }

    public final boolean bindHintWindowsRulerShouldShowCompletePhone() {
        C21695a a = C21695a.m72595a();
        C7573i.m23582a((Object) a, "BindHintWindowsRuler.inst()");
        if (!a.f58104a) {
            return true;
        }
        return false;
    }

    public final C7492s<Boolean> needShowDiskManagerGuideView() {
        C7492s<Boolean> a = C7492s.m23282a((C7495v<T>) C36058b.f94296a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "Observable.create(Observ…dSchedulers.mainThread())");
        return a;
    }

    public final void onPunishWarningShow() {
        C6907h.m21524a("violation_bubble_show", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").f60753a);
    }

    public final boolean shouldShowGradientPunishWarningBubble() {
        if (C6399b.m19944t()) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                IAccountUserService f2 = C6861a.m21337f();
                C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                String curUserId = f2.getCurUserId();
                C7573i.m23582a((Object) curUserId, "AccountProxyService.userService().curUserId");
                if (C25796a.m84790b(curUserId)) {
                    IAccountUserService f3 = C6861a.m21337f();
                    C7573i.m23582a((Object) f3, "AccountProxyService.userService()");
                    String curUserId2 = f3.getCurUserId();
                    C7573i.m23582a((Object) curUserId2, "AccountProxyService.userService().curUserId");
                    if (!C25796a.m84791c(curUserId2, false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void showProfileGuideToFillAvatarAndNickname(C0608j jVar) {
        C35811b.m115625a(jVar);
    }

    public final boolean bindHintWindowsRulerCanShowBindDialog(boolean z) {
        return C21695a.m72595a().mo57964a(z);
    }

    public final String hexDigest(String str) {
        C7573i.m23587b(str, "string");
        return C12748a.m37035a(str);
    }

    public final C35745a mainAnimViewModel(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        return new C36057a(fragmentActivity);
    }

    public final void startDiskManagerActivity(Context context) {
        C7573i.m23587b(context, "context");
        context.startActivity(new Intent(context, DiskManagerActivity.class));
    }

    public final void preloadMiniApp(String str) {
        C7167b b = C7167b.m22380b();
        C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
        b.mo18647a().preloadMiniApp(str);
    }

    public final C30361a rankingTagSpan(BlueVBrandInfo blueVBrandInfo) {
        C7573i.m23587b(blueVBrandInfo, "info");
        return new C30361a(blueVBrandInfo.getRank(), blueVBrandInfo.getTagName(), 7);
    }

    public final Object showCompletePhone(NoticeView noticeView) {
        C7573i.m23587b(noticeView, "noticeBar");
        C36658a aVar = new C36658a(noticeView);
        if (aVar.mo93008d() && aVar.f96269b) {
            aVar.mo93004a("personal_homepage");
        }
        return aVar;
    }

    public final boolean onAntiCrawlerEvent(String str) {
        boolean z = false;
        if (str != null) {
            CharSequence charSequence = str;
            if (!C7634n.m23776c(charSequence, (CharSequence) "/aweme/v1/aweme/post/?", false) && !C7634n.m23776c(charSequence, (CharSequence) "/aweme/v1/aweme/favorite/?", false) && !C7634n.m23776c(charSequence, (CharSequence) "/aweme/v1/aweme/listcollection/?", false)) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public final void onPunishWarningClick(Context context) {
        C7573i.m23587b(context, "context");
        C25796a.m84786a(context);
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        String curUserId = f.getCurUserId();
        C7573i.m23582a((Object) curUserId, "curUid");
        C25796a.m84792d(curUserId, true);
        C6907h.m21524a("enter_violation_record", (Map) C22984d.m75611a().mo59973a("enter_method", "bubble").mo59973a("enter_from", "personal_homepage").f60753a);
    }

    public final boolean hasUnreadStoryWithCheck(User user, User user2) {
        return StoryUnreadUtils.hasUnreadStoryWithCheck(user, user2);
    }

    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, C28532n nVar) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(nVar, "onHasMoreListener");
        return C43060dk.m136608a(recyclerView, nVar);
    }

    public final void startDownloadControlSettingActivity(Activity activity, int i) {
        C7573i.m23587b(activity, "activity");
        DownloadControlSettingActivity.m120774a(activity, i);
    }

    public final void launchProfileCoverCropActivity(FragmentActivity fragmentActivity, Aweme aweme) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(aweme, "aweme");
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).enterProfileCropActivity(fragmentActivity, aweme);
    }

    public final C35743b newLivePlayHelper(Runnable runnable, C35742a aVar) {
        C7573i.m23587b(runnable, "onStreamPlay");
        C7573i.m23587b(aVar, "callback");
        return new C36060d(runnable, aVar);
    }

    public final Object showBindPhoneDialog(NoticeView noticeView, Context context) {
        C7573i.m23587b(noticeView, "noticeBar");
        C7573i.m23587b(context, "context");
        C36663b bVar = new C36663b(noticeView, context);
        C36663b.m118308a();
        return bVar;
    }

    public final C7319aa<BaseResponse> setPrivateSettingItem(String str, int i) {
        C7573i.m23587b(str, "field");
        return C7319aa.m22925a((C47558ae<T>) new C36063f<T>(str, i)).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a());
    }

    public final void startCrossPlatformActivity(Context context, String str) {
        C7573i.m23587b(context, "context");
        try {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            Object service = ServiceManager.get().getService(IUserService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…IUserService::class.java)");
            Builder appendQueryParameter = Uri.parse(C30199h.m98861a().getStarAtlasProfileLink()).buildUpon().appendQueryParameter("scene", "promotion").appendQueryParameter("source_user_id", ((IUserService) service).getCurrentUserID());
            String str2 = "author_id";
            if (str == null) {
                str = "";
            }
            intent.setData(appendQueryParameter.appendQueryParameter(str2, str).build());
            context.startActivity(intent);
        } catch (NullValueException e) {
            C6921a.m21554a((Exception) e);
        }
    }

    public final C34140a newLiveBlurProcessor(int i, float f, C19588a aVar) {
        return new C34140a(i, f, new C36059c(aVar));
    }

    public final void activeTT(Context context, String str, String str2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "targetPackage");
        C7573i.m23587b(str2, "userId");
        AwemeSSOPlatformUtils.m136205a(context, str, str2);
    }

    public final boolean bindHintWindowsRulerGetShowCompleteProfileDialog(List<String> list, int i, int i2) {
        C7573i.m23587b(list, "urlList");
        C21699c a = C21695a.m72595a().mo57963a(list, i, i2);
        C7573i.m23582a((Object) a, "BindHintWindowsRuler.ins…g(urlList, height, width)");
        return a.f58116a;
    }

    public final void onI18nVerificationViewClick(Context context, User user, String str, String str2) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "type");
        VerifyActionManager.INSTANCE.onI18nVerificationViewClick(context, user, str, str2);
    }

    public final void watchLiveMob(Context context, User user, String str, String str2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "enterMethod");
        C41990e.m133503a(new C41991a(context, user).mo103122b(str).mo103123c(str2));
    }

    public final void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        String[] strArr;
        C7573i.m23587b(view, "preView");
        C7573i.m23587b(user, "user");
        C42914ab a = C42914ab.m136242a().mo104631a("extra_zoom_info", (Parcelable) ZoomAnimationUtils.m136228a(view)).mo104634a("enable_edit_img", false);
        String str2 = "uri";
        if (TextUtils.isEmpty(str)) {
            strArr = C43122ff.m136764a(C43122ff.m136780k(user));
        } else {
            strArr = new String[]{str};
        }
        HeaderDetailActivity.m116635a(activity, a.mo104635a(str2, strArr).mo104634a("enable_download_img", true).mo104632a("share_info", (Serializable) user).f111445a);
    }

    public final <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(cls, "cls");
        return Api.m75213a(str, cls, str2, z, str3);
    }

    public final SpannableStringBuilder ellipsizeText2ExceptWidth(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        C7573i.m23587b(spannableStringBuilder, "spannable");
        C7573i.m23587b(textPaint, "paint");
        SpannableStringBuilder a = C30357c.m99184a(spannableStringBuilder, textPaint, i, i2, i3, i4);
        C7573i.m23582a((Object) a, "TagUtil.ellipsizeText2Ex…e, keepOffset, keepWidth)");
        return a;
    }

    public final C36665c showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, OnClickListener onClickListener2, float f, boolean z) {
        int i;
        C7573i.m23587b(noticeView, "noticeBar");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(onClickListener, "onClick");
        C7573i.m23587b(onClickListener2, "onCloseClick");
        float f2 = f * 100.0f;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C36665c cVar = new C36665c(noticeView, context, new C21699c(true, f2, i), onClickListener, onClickListener2);
        return cVar;
    }

    public final C36665c showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, List<String> list, int i, int i2) {
        C7573i.m23587b(noticeView, "noticeBar");
        C7573i.m23587b(context, "context");
        C7573i.m23587b(onClickListener, "onClick");
        C7573i.m23587b(list, "urlList");
        return new C36665c(noticeView, context, C21695a.m72595a().mo57963a(list, i, i2), onClickListener);
    }

    public final <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C6810f fVar, boolean z, String str3) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(cls, "cls");
        C7573i.m23587b(fVar, "headerGroup");
        return Api.m75207a(i, str, cls, str2, fVar, z, str3);
    }

    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "originalUrl");
        C36133a.m116558a(activity, str, z, f, i, i2, i3, i4);
    }

    public final void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(str, "originalUrl");
        C36133a.m116559a(fragment, str, z, f, i, i2, i3, i4);
    }

    public final void displayActivityLink(Context context, FrameLayout frameLayout, RemoteImageView remoteImageView, DmtTextView dmtTextView, ImageView imageView, ImageView imageView2, String str, String str2, LinkInfo linkInfo) {
        String str3;
        Context context2 = context;
        C7573i.m23587b(context, "context");
        C36689a aVar = new C36689a(context2, frameLayout, remoteImageView, dmtTextView, imageView, imageView2);
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        aVar.mo93031a(str3);
        aVar.mo93030a(linkInfo);
    }
}
