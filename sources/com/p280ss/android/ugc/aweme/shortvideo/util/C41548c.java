package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.ads.AdError;
import com.google.common.base.C17454q;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.ugc.asve.p756d.C15454h;
import com.p280ss.android.ugc.asve.sandbox.C20896b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IPreloadVESo;
import com.p280ss.android.ugc.aweme.services.IPreloadVESoKt;
import com.p280ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39379ea;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39967gn;
import com.p280ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41253ah;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordPermissionActivity;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40517g;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41463q;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.superentrance.C47498b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.c */
public final class C41548c {

    /* renamed from: a */
    private static C17454q f108017a;

    /* renamed from: a */
    public static void m132320a(Context context, Intent intent) {
        if (intent != null && context != null) {
            if (context instanceof Activity) {
                m132322b((Activity) context, intent);
                return;
            }
            C41514ab.m132244a().mo102173a(context);
            intent.setClass(context, VideoRecordPermissionActivity.class);
            context.startActivity(intent);
        }
    }

    /* renamed from: c */
    private static void m132323c(Activity activity, Intent intent) {
        C41545b.m132307a().mo102189b("av_video_record_init");
        C6726a.m20842a(C41550d.f108019a);
        new C39967gn();
        C35563c.m114829a(C39967gn.m127849a());
        m132324d(activity, intent);
        if (C35563c.f93245h.mo83212d()) {
            C35563c.f93245h.mo83208b(activity.getApplicationContext());
        }
    }

    /* renamed from: a */
    public static void m132317a(Activity activity, Intent intent) {
        Effect a = new C47498b().mo119611a();
        if (a != null) {
            String str = "";
            try {
                str = C30199h.m98861a().getSuperEntranceConfig().getEffectTip();
            } catch (NullValueException unused) {
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(a.getEffectId());
            intent.putExtra("extra_camera_facing", 1);
            intent.putExtra("extra_super_entrance_pop", str);
            intent.putStringArrayListExtra("reuse_sticker_ids", arrayList);
            intent.putExtra("first_sticker", a);
        }
        if (TextUtils.isEmpty(intent.getStringExtra("shoot_way"))) {
            intent.putExtra("shoot_way", "super_entrance");
        }
        intent.putExtra("translation_type", 3);
        m132322b(activity, intent);
    }

    /* renamed from: b */
    public static void m132322b(Activity activity, Intent intent) {
        if (intent != null && activity != null) {
            IPreloadVESo providePreloadVESo = ((IAVService) ServiceManager.get().getService(IAVService.class)).providePreloadVESo();
            intent.putExtra("sdk_load_ve_so_status", IPreloadVESoKt.toStatusCode(TENativeLibsLoader.m67985b()));
            intent.putExtra("preload_ve_so_task_status", providePreloadVESo.getPreLoadVESoStatus().toStatusCode());
            intent.putExtra("preload_ve_so_cost_time", providePreloadVESo.getPreLoadVESoCostTime());
            C43072du.m136630a("camera_start");
            C15454h.m45260a(System.currentTimeMillis());
            new C39967gn();
            C35563c.m114829a(C39967gn.m127849a());
            intent.putExtra("extra_start_record_time", System.currentTimeMillis());
            C41514ab.m132244a().mo102173a(activity);
            intent.putExtra("extra_av_navigation_bar_height", C39805en.m127451d(activity));
            if (!VideoRecordPermissionActivity.m131763a((Context) activity) || C39379ea.m125809a()) {
                intent.setClass(activity, VideoRecordPermissionActivity.class);
                activity.startActivity(intent);
                return;
            }
            C41545b.m132307a().mo102188a("av_video_record_init");
            boolean booleanExtra = intent.getBooleanExtra("enter_record_directly_from_system", false);
            boolean booleanExtra2 = intent.getBooleanExtra("recreate_record_activity_support", false);
            if (booleanExtra) {
                C43072du.m136631a("camera_error", "2");
            } else if (!VideoRecordPermissionActivity.m131768b(intent) || !C35563c.m114832a()) {
                IStoryRecordService iStoryRecordService = (IStoryRecordService) ServiceManager.get().getService(IStoryRecordService.class);
                if ((!C41253ah.m131872a() && !VideoRecordPermissionActivity.m131765a(intent) && !VideoRecordPermissionActivity.m131768b(intent) && C35563c.m114832a() && !booleanExtra2) || (iStoryRecordService != null && iStoryRecordService.isStoryRecording())) {
                    C6893q.m21447a("record", C6869c.m21381a().mo16887a("event", "isRecording").mo16887a("user_info", C35563c.m114835b()).mo16888b());
                    C10761a.m31399c(activity.getApplicationContext(), (int) R.string.b9m).mo25750a();
                    C43072du.m136632a("camera_error", "2", "recording");
                } else if (!C39360dw.m125725a().mo97930a((Context) activity)) {
                    C6893q.m21447a("record", C6869c.m21381a().mo16887a("event", "isPublishing").mo16888b());
                    C43072du.m136632a("camera_error", "2", "publishing");
                } else {
                    C6907h.m21524a("av_memory_log", (Map) C22984d.m75611a().mo59973a("creation_id", intent.getStringExtra("creation_id")).mo59973a("enter_from", intent.getStringExtra("enter_from")).mo59971a("dalvikPss", C41514ab.m132244a().f107964b).mo59971a("nativePss", C41514ab.m132244a().f107965c).mo59971a("otherPss", C41514ab.m132244a().f107967e).mo59971a("totalPss", C41514ab.m132244a().f107966d).f60753a);
                    m132323c(activity, intent);
                }
            } else {
                C43072du.m136632a("camera_error", "2", "recording");
            }
        }
    }

    /* renamed from: d */
    private static void m132324d(final Activity activity, Intent intent) {
        f108017a = C17454q.m58004b();
        C41545b.m132307a().mo102189b("av_video_record_init");
        String stringExtra = intent.getStringExtra("first_face_sticker");
        String stringExtra2 = intent.getStringExtra("music_reuse_sticker_id");
        String stringExtra3 = intent.getStringExtra("challenge_id");
        String stringExtra4 = intent.getStringExtra("music_id");
        String stringExtra5 = intent.getStringExtra("extra_bind_mv_id");
        String stringExtra6 = intent.getStringExtra("direct_use_sticker_music");
        String stringExtra7 = intent.getStringExtra("poi_struct_in_tools_line");
        Effect effect = (Effect) intent.getParcelableExtra("first_sticker");
        if (!TextUtils.isEmpty(stringExtra7)) {
            C38505a.m123087b(stringExtra7);
        }
        ArrayList arrayList = new ArrayList();
        C415491 r8 = new C1591g<Bundle, C1592h<Bundle>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1592h<Bundle> then(C1592h<Bundle> hVar) throws Exception {
                if (!hVar.mo6887c() && !hVar.mo6889d()) {
                    return C1592h.m7851a(hVar.mo6890e());
                }
                if (hVar.mo6889d() && hVar.mo6891f() != null) {
                    if (hVar.mo6891f() instanceof StatusCodeException) {
                        StatusCodeException statusCodeException = (StatusCodeException) hVar.mo6891f();
                        statusCodeException.getStatusCode();
                        int statusCode = statusCodeException.getStatusCode();
                        String message = hVar.mo6891f().getMessage();
                        switch (statusCode) {
                            case AdError.CACHE_ERROR_CODE /*2002*/:
                            case AdError.INTERNAL_ERROR_2004 /*2004*/:
                                message = activity.getString(R.string.azh);
                                break;
                            case AdError.INTERNAL_ERROR_2003 /*2003*/:
                                message = activity.getString(R.string.aow);
                                break;
                            case AdError.INTERNAL_ERROR_2006 /*2006*/:
                                message = activity.getString(R.string.fjt);
                                break;
                        }
                        C10761a.m31403c((Context) activity, message).mo25750a();
                    } else {
                        C10761a.m31403c((Context) activity, hVar.mo6891f().getMessage()).mo25750a();
                    }
                }
                return C1592h.m7851a(new Bundle());
            }
        };
        if (!TextUtils.isEmpty(stringExtra)) {
            arrayList.add(VideoRecordPermissionActivity.m131754a((Context) activity, stringExtra, "cold_start").mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) r8));
        }
        boolean a = C35574k.m114859a().mo70091f().mo93342a(Property.EnableUpdateMoji);
        if (a && effect != null && !TextUtils.isEmpty(effect.getId()) && C40517g.m129535b(effect.getId())) {
            arrayList.add(VideoRecordPermissionActivity.m131753a((Context) activity, effect.getId(), new C1606i<>(), (C41653c) null).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) r8));
        }
        List<AVChallenge> list = C39360dw.m125725a().f102247b;
        if (a && !C6311g.m19573a(list) && !TextUtils.isEmpty(((AVChallenge) list.get(0)).stickerId)) {
            arrayList.add(VideoRecordPermissionActivity.m131766b(activity, ((AVChallenge) list.get(0)).stickerId).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) r8));
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            arrayList.add(VideoRecordPermissionActivity.m131751a((Context) activity, stringExtra2).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) r8));
        }
        if (!TextUtils.isEmpty(stringExtra5)) {
            arrayList.add(VideoRecordPermissionActivity.m131770d(activity, stringExtra5).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) r8));
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            arrayList.add(VideoRecordPermissionActivity.m131769c(activity, stringExtra3).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) r8));
        }
        if (!TextUtils.isEmpty(stringExtra4)) {
            arrayList.add(VideoRecordPermissionActivity.m131752a((Context) activity, stringExtra4, 2).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) r8));
        }
        if (!TextUtils.isEmpty(stringExtra6)) {
            arrayList.add(VideoRecordPermissionActivity.m131752a((Context) activity, stringExtra6, 2).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) r8));
        }
        if (C6311g.m19573a(arrayList)) {
            m132318a(activity, intent, null);
        } else {
            C1592h.m7858b((Collection<? extends C1592h<TResult>>) arrayList).mo6876a((C1591g<TResult, TContinuationResult>) new C41551e<TResult,TContinuationResult>(activity, intent), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Void m132315a(Activity activity, Intent intent, C1592h hVar) throws Exception {
        if (hVar.mo6889d() || hVar.mo6887c()) {
            m132318a(activity, intent, null);
        } else {
            m132318a(activity, intent, (List) hVar.mo6890e());
        }
        return null;
    }

    /* renamed from: a */
    private static void m132318a(Activity activity, Intent intent, List<Bundle> list) {
        if (C41253ah.m131872a()) {
            C35563c.m114830a(VideoRecordNewActivity.class);
        } else {
            C41253ah.m131870a("");
        }
        f108017a.mo44941a(TimeUnit.MILLISECONDS);
        C41545b.m132307a().mo102189b("av_video_record_init");
        Intent intent2 = new Intent(activity, VideoRecordNewActivity.class);
        boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
        boolean booleanExtra2 = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra3 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        boolean booleanExtra4 = intent.getBooleanExtra(C20896b.m69935a(), false);
        String str = null;
        if (booleanExtra3) {
            C39360dw.m125725a().mo97928a((AVMusic) null);
            C39360dw.m125725a().mo97936f();
        }
        if (booleanExtra) {
            C35563c.f93240c.mo83133a(true);
        }
        intent2.putExtra("sticker_pannel_show", booleanExtra2);
        intent2.putExtra("enter_record_from_other_platform", booleanExtra3);
        intent2.putExtra("star_atlas_object", intent.getStringExtra("star_atlas_object"));
        intent2.putExtra("key_using_sand_box", booleanExtra4);
        if (list != null) {
            for (Bundle putExtras : list) {
                intent2.putExtras(putExtras);
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("micro_app_class"))) {
            intent2.putExtra("micro_app_class", intent.getStringExtra("micro_app_class"));
        }
        if (intent2.getExtras() != null) {
            str = intent2.getExtras().getString("creation_id");
        }
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString();
            intent2.putExtra("creation_id", str);
        }
        C41463q.m132132a(str);
        TTUploaderService.m122753a();
        activity.startActivity(intent2);
    }

    /* renamed from: a */
    public static void m132319a(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder("startToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport");
        sb.append(z);
        sb.append(",clearOld:");
        sb.append(z2);
        C41530am.m132280a(sb.toString());
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        if (C39360dw.m125725a().mo97930a((Context) activity)) {
            if (C41253ah.m131872a() || !C35563c.m114832a() || !z || !VideoRecordPermissionActivity.m131763a((Context) activity)) {
                intent.setClass(activity, VideoRecordPermissionActivity.class);
            } else {
                intent.setClass(activity, VideoRecordNewActivity.class);
                if (z2 && VideoRecordPermissionActivity.m131764a((Context) activity, intent)) {
                    return;
                }
            }
            m132322b(activity, intent);
        }
    }

    /* renamed from: a */
    public static void m132321a(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder("notifyToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport");
        sb.append(z);
        sb.append(",clearOld:");
        sb.append(z2);
        C41530am.m132280a(sb.toString());
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        if (C39360dw.m125725a().mo97930a(context)) {
            if (C41253ah.m131872a() || !C35563c.m114832a() || !z || !VideoRecordPermissionActivity.m131763a(context)) {
                intent.setClass(context, VideoRecordPermissionActivity.class);
            } else {
                intent.setClass(context, VideoRecordNewActivity.class);
                if (z2 && VideoRecordPermissionActivity.m131764a(context, intent)) {
                    return;
                }
            }
            context.startActivity(intent);
        }
    }
}
