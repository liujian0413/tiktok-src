package com.p280ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.text.TextUtils;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.analysis.C6863c;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.coupon.C24575a;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.C27692g;
import com.p280ss.android.ugc.aweme.experiment.C27693h;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.share.C28692c;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.christmas.C29135b;
import com.p280ss.android.ugc.aweme.festival.christmas.api.ChristmasApi;
import com.p280ss.android.ugc.aweme.festival.christmas.model.C29139b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35005a.C35006a;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35007b;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35298a;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.GotCouponDialog;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.promote.C36924c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.C37954a;
import com.p280ss.android.ugc.aweme.share.C37974ak;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.SilentShareChannel;
import com.p280ss.android.ugc.aweme.share.p1530b.C37997a;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39328f;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41537aq;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43014ci;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.base.component.EventActivityComponent */
public class EventActivityComponent implements GenericLifecycleObserver {

    /* renamed from: d */
    private static boolean f61334d;

    /* renamed from: f */
    private static C23308j f61335f;

    /* renamed from: a */
    AbsActivity f61336a;

    /* renamed from: b */
    private C37997a f61337b;

    /* renamed from: c */
    private WeakReference<C6863c> f61338c;

    /* renamed from: e */
    private C23306h f61339e;

    /* renamed from: e */
    private void m76460e() {
        C42961az.m136382c(this);
    }

    /* renamed from: f */
    private void m76461f() {
        C42961az.m136383d(this);
    }

    /* renamed from: g */
    private void m76462g() {
        if (this.f61337b != null) {
            this.f61337b.mo74016c();
        }
    }

    /* renamed from: a */
    public static void m76449a() {
        C39328f fVar = (C39328f) C7705c.m23799a().mo20388a(C39328f.class);
        if (fVar != null) {
            C7705c.m23799a().mo20397g(fVar);
        }
    }

    /* renamed from: b */
    public static boolean m76455b() {
        User curUser = C21115b.m71197a().getCurUser();
        if (!C6399b.m19944t() || curUser == null || !curUser.isSecret()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m76456c() {
        if (this.f61336a instanceof C6863c) {
            this.f61338c = new WeakReference<>((C6863c) this.f61336a);
        }
        m76458d();
    }

    /* renamed from: d */
    private void m76458d() {
        if (!C6399b.m19944t()) {
            if (this.f61339e == null) {
                this.f61339e = new C23306h(this.f61336a);
            }
            this.f61339e.mo60598a();
        }
    }

    public EventActivityComponent(AbsActivity absActivity) {
        this.f61336a = absActivity;
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void showChangeUsernameDialog(C27692g gVar) {
        Activity g = C6405d.m19984g();
        if (g != null) {
            if (f61335f == null || !f61335f.isShowing()) {
                C23308j jVar = new C23308j(g, gVar.f72987a);
                f61335f = jVar;
                jVar.show();
                C6907h.onEventV3("modify_username_notify");
            }
        }
    }

    @C7709l(mo20401b = true)
    public void onPublishStatus(final C39328f fVar) {
        final AbsActivity absActivity = this.f61336a;
        if (absActivity != null && absActivity.isViewValid()) {
            f61334d = false;
            if (fVar.f102148b == 12) {
                if (absActivity == C6405d.m19984g()) {
                    C10761a.m31399c((Context) this.f61336a, (int) R.string.b7m).mo25750a();
                }
                C6921a.m21559a((Throwable) new Exception(fVar.toString()));
            } else if (fVar.f102148b == 9) {
                if (absActivity == C6405d.m19984g()) {
                    String str = fVar.f102151e;
                    if (TextUtils.isEmpty(str)) {
                        str = absActivity.getResources().getString(R.string.d9c);
                    }
                    C10761a.m31403c((Context) this.f61336a, str).mo25750a();
                }
                C6921a.m21559a((Throwable) new Exception(fVar.toString()));
            } else if (fVar.f102148b == 10) {
                m76450a((Activity) this.f61336a, fVar.f102154h, (Runnable) new Runnable() {
                    public final void run() {
                        boolean z;
                        boolean z2;
                        boolean z3;
                        boolean z4;
                        C43014ci.m136517a();
                        Aweme aweme = (Aweme) fVar.f102150d;
                        if (aweme.getStatus().getPrivateStatus() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (aweme.getStatus().getPrivateStatus() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((fVar.f102154h instanceof CreateAwemeResponse) && C6399b.m19945u() && !z2 && ((CreateAwemeResponse) fVar.f102154h).hasStickerRedPacket) || ((CreateAwemeResponse) fVar.f102154h).isReviewVideo == 1) {
                            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) fVar.f102154h;
                            boolean z5 = ((CreateAwemeResponse) fVar.f102154h).hasStickerRedPacket;
                            if (((CreateAwemeResponse) fVar.f102154h).isReviewVideo == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z && z4) {
                                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showNewYearGuideDialog(EventActivityComponent.this.f61336a, aweme, createAwemeResponse.stickerToken, fVar.f102156j, true);
                                return;
                            } else if (!z2 && z5) {
                                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).showNewYearGuideDialog(EventActivityComponent.this.f61336a, aweme, createAwemeResponse.stickerToken, fVar.f102156j, false);
                                return;
                            }
                        }
                        if (z2 || C43168s.m136911c(aweme)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((z3 && !C6399b.m19944t()) || (z3 && C6399b.m19944t() && ((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo59877d()).booleanValue())) {
                            EventActivityComponent.m76454b(fVar, absActivity);
                        } else if (EventActivityComponent.m76455b()) {
                            if (fVar.f102155i) {
                                EventActivityComponent.this.mo60586a(fVar, absActivity, true);
                            }
                            EventActivityComponent.m76454b(fVar, absActivity);
                        } else if (fVar.f102155i) {
                            EventActivityComponent.this.mo60586a(fVar, absActivity, false);
                        } else if (fVar.f102154h instanceof CreateAwemeResponse) {
                            if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isUserMaterialDialogDealing()) {
                                EventActivityComponent.this.mo60584a(fVar, absActivity);
                            } else {
                                ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).registerComponentAndStatus(EventActivityComponent.this, fVar);
                            }
                        }
                        EventActivityComponent.m76449a();
                    }
                });
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setPublishStatus(fVar.f102148b);
        }
    }

    /* renamed from: b */
    public static void m76454b(C39328f fVar, AbsActivity absActivity) {
        C37984ap.m121301a().sharePrivateAfterPublishDialog(absActivity, (Aweme) fVar.f102150d, fVar.f102147a);
    }

    /* renamed from: a */
    public static boolean m76453a(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        if (instance.getTimeInMillis() < j) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m76459d(C39328f fVar, AbsActivity absActivity) {
        this.f61337b = C37984ap.m121301a().shareAfterPublishDialog(absActivity, (Aweme) fVar.f102150d, fVar.f102147a);
        String curUserId = C21115b.m71197a().getCurUserId();
        final long c = C27693h.m90846c(curUserId, 0);
        this.f61337b.setOnDismissListener(new OnDismissListener() {
            public final void onDismiss() {
                if (C6399b.m19947w()) {
                    User curUser = C21115b.m71197a().getCurUser();
                    if (curUser != null && curUser.nicknameUpdateReminder()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis > c && !EventActivityComponent.m76453a(c, currentTimeMillis) && C6903bc.m21473N().mo71141a()) {
                            C42961az.m136380a(new C27692g(curUser));
                        }
                    }
                }
            }
        });
        this.f61337b.mo74014b();
        C27693h.m90847d(curUserId, System.currentTimeMillis());
        C41530am.m132280a("PublishDurationMonitor MANUAL_END showSuccessWindow");
    }

    /* renamed from: a */
    public final void mo44a(C0043i iVar, Event event) {
        switch (event) {
            case ON_CREATE:
                m76456c();
                return;
            case ON_START:
                m76460e();
                return;
            case ON_STOP:
                m76461f();
                return;
            case ON_DESTROY:
                m76462g();
                break;
        }
    }

    /* renamed from: c */
    private static boolean m76457c(C39328f fVar, AbsActivity absActivity) {
        if (!C37954a.m121244a() || !C38037a.m121403a()) {
            return false;
        }
        AVUploadSaveModel aVUploadSaveModel = ((CreateAwemeResponse) fVar.f102154h).mSaveModel;
        if (aVUploadSaveModel == null) {
            return false;
        }
        Aweme aweme = ((CreateAwemeResponse) fVar.f102154h).aweme;
        String str = "short";
        if (!(aweme == null || aweme.getDistributeType() == 1)) {
            str = "long";
        }
        if (aweme != null && !f61334d && ((aVUploadSaveModel.getSaveToAlbum() && C6399b.m19944t()) || (aVUploadSaveModel.isSaveLocal() && !C6399b.m19944t()))) {
            C37974ak.m121282a(aweme.getAid(), "video_post_page", "download", str, null, aVUploadSaveModel.isWaterMark() ? 1 : 0);
        }
        int saveType = aVUploadSaveModel.getSaveType();
        SilentShareChannel silentShareChannel = null;
        Iterator it = SilentShareChannel.supportChannels(absActivity).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SilentShareChannel silentShareChannel2 = (SilentShareChannel) it.next();
            if (silentShareChannel2.getSaveType() == saveType) {
                silentShareChannel = silentShareChannel2;
                break;
            }
        }
        if (silentShareChannel == null) {
            f61334d = true;
            return false;
        }
        UrlModel cover = ((CreateAwemeResponse) fVar.f102154h).aweme.getVideo().getCover();
        C23323e.m76526b((String) cover.getUrlList().get(0));
        C28692c cVar = new C28692c(absActivity, silentShareChannel.getLabel(), cover);
        cVar.setOnDismissListener(new C23302d(fVar, silentShareChannel, aVUploadSaveModel, absActivity));
        cVar.mo73752a();
        C6907h.m21524a("share_notice_after_post", (Map) C22984d.m75611a().mo59973a("enter_from", "video_post_page").mo59973a("platform", silentShareChannel.getKey()).f60753a);
        if (aweme != null && !f61334d) {
            C37974ak.m121282a(aweme.getAid(), "video_post_page", silentShareChannel.getKey(), str, null, aVUploadSaveModel.isWaterMark() ? 1 : 0);
            f61334d = true;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo60584a(C39328f fVar, AbsActivity absActivity) {
        if (!m76457c(fVar, absActivity)) {
            if (!C38037a.m121403a()) {
                m76454b(fVar, absActivity);
                return;
            }
            C36924c.m118805a(absActivity);
            m76459d(fVar, absActivity);
            C41537aq.m132297a(fVar.f102154h, absActivity);
        }
    }

    /* renamed from: a */
    public static void m76450a(Activity activity, C38455ap apVar, Runnable runnable) {
        PoiStruct poiStruct;
        String str;
        if (apVar != null && (apVar instanceof CreateAwemeResponse)) {
            CouponInfo couponInfo = ((CreateAwemeResponse) apVar).couponInfo;
            if (couponInfo != null) {
                try {
                    str = ((CreateAwemeResponse) apVar).aweme.getPoiStruct().getPoiId();
                    try {
                        poiStruct = ((CreateAwemeResponse) apVar).aweme.getPoiStruct();
                    } catch (NullPointerException unused) {
                        poiStruct = null;
                        C35007b.m113007e(new C35006a().mo88754b(str).mo88752a("homepage_follow").mo88757e("homepage_follow").mo88759g(String.valueOf(couponInfo.getCouponId())).mo88758f("click_publish").mo88760h(C24575a.m80615a(activity, couponInfo.getStatus(), true)).mo88762j(C24575a.m80616a(couponInfo)).mo88751a(poiStruct).mo88753a());
                        C28410h.m93358a(true);
                        GotCouponDialog gotCouponDialog = new GotCouponDialog(activity);
                        gotCouponDialog.mo89838a(new C35298a(str, couponInfo, poiStruct));
                        gotCouponDialog.setOnDismissListener(new C23303e(runnable));
                        C6907h.m21524a("show_coupon_toast", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("enter_method", "click_publish").mo59970a("coupon_id", couponInfo.getCouponId()).mo59973a("poi_id", str).f60753a);
                        return;
                    }
                } catch (NullPointerException unused2) {
                    str = null;
                    poiStruct = null;
                    C35007b.m113007e(new C35006a().mo88754b(str).mo88752a("homepage_follow").mo88757e("homepage_follow").mo88759g(String.valueOf(couponInfo.getCouponId())).mo88758f("click_publish").mo88760h(C24575a.m80615a(activity, couponInfo.getStatus(), true)).mo88762j(C24575a.m80616a(couponInfo)).mo88751a(poiStruct).mo88753a());
                    C28410h.m93358a(true);
                    GotCouponDialog gotCouponDialog2 = new GotCouponDialog(activity);
                    gotCouponDialog2.mo89838a(new C35298a(str, couponInfo, poiStruct));
                    gotCouponDialog2.setOnDismissListener(new C23303e(runnable));
                    C6907h.m21524a("show_coupon_toast", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("enter_method", "click_publish").mo59970a("coupon_id", couponInfo.getCouponId()).mo59973a("poi_id", str).f60753a);
                    return;
                }
                C35007b.m113007e(new C35006a().mo88754b(str).mo88752a("homepage_follow").mo88757e("homepage_follow").mo88759g(String.valueOf(couponInfo.getCouponId())).mo88758f("click_publish").mo88760h(C24575a.m80615a(activity, couponInfo.getStatus(), true)).mo88762j(C24575a.m80616a(couponInfo)).mo88751a(poiStruct).mo88753a());
                C28410h.m93358a(true);
                GotCouponDialog gotCouponDialog22 = new GotCouponDialog(activity);
                gotCouponDialog22.mo89838a(new C35298a(str, couponInfo, poiStruct));
                gotCouponDialog22.setOnDismissListener(new C23303e(runnable));
                C6907h.m21524a("show_coupon_toast", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_follow").mo59973a("enter_method", "click_publish").mo59970a("coupon_id", couponInfo.getCouponId()).mo59973a("poi_id", str).f60753a);
                return;
            }
        }
        runnable.run();
    }

    /* renamed from: a */
    public final void mo60585a(C39328f fVar, AbsActivity absActivity, C29139b bVar) {
        if (!m76457c(fVar, absActivity) && !C41537aq.m132297a(fVar.f102154h, absActivity) && !((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).festivalShareVideoAfterPublish(absActivity, bVar, (Aweme) fVar.f102150d)) {
            m76459d(fVar, absActivity);
        }
    }

    /* renamed from: a */
    public final void mo60586a(final C39328f fVar, final AbsActivity absActivity, final boolean z) {
        Object obj = fVar.f102150d;
        if (obj instanceof Aweme) {
            Aweme aweme = (Aweme) obj;
            ChristmasApi.m95577a().participateFestivalActivity(aweme.getAid(), C29135b.m95578a(aweme), C29132a.m95565c()).mo19294a(C47549a.m148327a()).mo19304b(C7333a.m23044b()).mo19189a((C7498y<? super T>) new C7498y<C29139b>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C7321c cVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(C29139b bVar) {
                    if (!z) {
                        EventActivityComponent.this.mo60585a(fVar, absActivity, bVar);
                    }
                }

                public final void onError(Throwable th) {
                    if (!z) {
                        EventActivityComponent.this.mo60584a(fVar, absActivity);
                    }
                }
            });
        }
    }
}
