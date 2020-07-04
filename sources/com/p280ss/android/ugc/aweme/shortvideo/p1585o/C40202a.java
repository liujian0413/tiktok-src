package com.p280ss.android.ugc.aweme.shortvideo.p1585o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.app.PublishVideoJumpActivity;
import com.p280ss.android.ugc.aweme.app.PushLoginActivity;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.o.a */
public final class C40202a {

    /* renamed from: a */
    public static final C40202a f104498a = new C40202a();

    private C40202a() {
    }

    /* renamed from: a */
    private static Intent m128503a(Activity activity) {
        Intent intent = new Intent();
        if (C6399b.m19944t()) {
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
        } else {
            intent.setClass(activity, MainActivity.class);
        }
        intent.putExtra("enter_record_from_other_platform", true);
        return intent;
    }

    /* renamed from: c */
    public static void m128508c(Activity activity, Uri uri) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(uri, "routeUri");
        Intent intent = new Intent(activity, PublishVideoJumpActivity.class);
        intent.putExtra("route_uri", uri.toString());
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
    }

    /* renamed from: a */
    private static void m128504a(Activity activity, Intent intent) {
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a((Object) iAVService, "service");
        if (iAVService.isRecording() || iAVService.getPublishService().inPublishPage(activity)) {
            Context context = activity;
            Object service = ServiceManager.get().getService(IAVService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
            intent.setClass(context, ((IAVService) service).getRecordPermissionActivity());
            intent.putExtra("enter_record_directly_from_system", true);
            return;
        }
        intent.putExtra("shoot_way", "other_platform_camera");
        intent.putExtra("show_no_splash_ad", true);
        AwemeAppData.m65765a().f60329i = true;
    }

    /* renamed from: b */
    public final Intent mo100001b(Activity activity, Uri uri) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(uri, "uri");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
        Context context = activity;
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
        Intent intent = new Intent(context, ((IAVService) service).getRecordPermissionActivity());
        m128505a(activity, intent, uri);
        if (!((IAVService) ServiceManager.get().getService(IAVService.class)).needLoginBeforeRecord()) {
            return intent;
        }
        C23018p a = C23018p.m75672a();
        C7573i.m23582a((Object) a, "AwemeRuntime.inst()");
        boolean c = a.mo59990c();
        Intent intent2 = new Intent(context, PushLoginActivity.class);
        intent2.putExtra("next_step", intent);
        if (c) {
            activity.startActivity(intent2);
        } else {
            activity.startActivities(new Intent[]{new Intent(context, MainActivity.class), intent2});
        }
        return null;
    }

    /* renamed from: a */
    private static void m128507a(Uri uri, Intent intent) {
        String str = "retarget";
        if (TextUtils.equals(str, uri.getQueryParameter("gd_label"))) {
            C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("shoot_way", str).f60753a);
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str2 : queryParameterNames) {
                String queryParameter = uri.getQueryParameter(str2);
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -1195408547) {
                        if (hashCode == -818786127 && str2.equals("enter_from")) {
                            intent.putExtra("enter_from", queryParameter);
                        }
                    } else if (str2.equals("sticker_id")) {
                        intent.putExtra("sticker_id", queryParameter);
                        intent.putExtra("use_preset_sticker_at_first", true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final Intent mo100000a(Activity activity, Uri uri) {
        Intent intent;
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(uri, "routeUri");
        C23018p a = C23018p.m75672a();
        C7573i.m23582a((Object) a, "AwemeRuntime.inst()");
        boolean c = a.mo59990c();
        if (c) {
            Context context = activity;
            Object service = ServiceManager.get().getService(IAVService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
            intent = new Intent(context, ((IAVService) service).getRecordPermissionActivity());
        } else {
            intent = m128503a(activity);
        }
        m128505a(activity, intent, uri);
        if (c) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
        }
        return intent;
    }

    /* renamed from: a */
    private final void m128505a(Activity activity, Intent intent, Uri uri) {
        boolean z;
        String queryParameter = uri.getQueryParameter("from");
        CharSequence charSequence = queryParameter;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            queryParameter = "schema";
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("enter_from"))) {
            intent.putExtra("shoot_way", uri.getQueryParameter("enter_from"));
        } else {
            intent.putExtra("shoot_way", queryParameter);
        }
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -891901482) {
                if (hashCode == 305667899 && host.equals("openRecord")) {
                    m128506a(activity, uri, intent);
                }
            } else if (host.equals("studio")) {
                m128507a(uri, intent);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m128506a(android.app.Activity r10, android.net.Uri r11, android.content.Intent r12) {
        /*
            r9 = this;
            java.lang.String r0 = r11.getPath()
            java.lang.String r1 = "recordParam"
            java.lang.String r1 = r11.getQueryParameter(r1)
            java.lang.String r2 = "recordOrigin"
            java.lang.String r2 = r11.getQueryParameter(r2)
            java.lang.String r3 = "uid"
            java.lang.String r3 = r11.getQueryParameter(r3)
            java.lang.String r4 = "nickname"
            java.lang.String r4 = r11.getQueryParameter(r4)
            java.lang.String r5 = "sticker_pannel_show"
            r6 = 0
            boolean r5 = r11.getBooleanQueryParameter(r5, r6)
            java.lang.String r7 = "sticker_pannel_show"
            r12.putExtra(r7, r5)
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0045
            java.lang.String r5 = "path"
            kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            java.lang.String r5 = "/detail/"
            r7 = 2
            r8 = 0
            boolean r0 = kotlin.text.C7634n.m23721b(r0, r5, false)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r11.getLastPathSegment()
            goto L_0x004b
        L_0x0045:
            java.lang.String r0 = "id"
            java.lang.String r0 = r11.getQueryParameter(r0)
        L_0x004b:
            java.lang.String r5 = "mv_id"
            java.lang.String r5 = r11.getQueryParameter(r5)
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x005f
            java.lang.String r6 = "extra_bind_mv_id"
            r12.putExtra(r6, r5)
        L_0x005f:
            r5 = 1
            if (r2 != 0) goto L_0x0063
            goto L_0x00bf
        L_0x0063:
            int r6 = r2.hashCode()
            r7 = -887328209(0xffffffffcb1c722f, float:-1.0252847E7)
            if (r6 == r7) goto L_0x00af
            r10 = 1036042802(0x3dc0c232, float:0.0941204)
            if (r6 == r10) goto L_0x0072
            goto L_0x00bf
        L_0x0072:
            java.lang.String r10 = "jsBridge"
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L_0x00bf
            java.lang.String r10 = "from"
            java.lang.String r10 = r11.getQueryParameter(r10)
            java.lang.String r2 = "dou_plus"
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r10, r2)
            if (r10 == 0) goto L_0x00bf
            java.lang.String r10 = "dou_plus"
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r6)
            java.lang.String r6 = "shoot"
            com.ss.android.ugc.aweme.app.g.d r7 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r8 = "shoot_way"
            com.ss.android.ugc.aweme.app.g.d r10 = r7.mo59973a(r8, r10)
            java.lang.String r7 = "creation_id"
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r7, r2)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r6, r10)
            goto L_0x00bf
        L_0x00af:
            java.lang.String r6 = "system"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x00bf
            java.lang.String r2 = "extra_record_from_system"
            r12.putExtra(r2, r5)
            m128504a(r10, r12)
        L_0x00bf:
            if (r1 != 0) goto L_0x00c3
            goto L_0x01ac
        L_0x00c3:
            int r10 = r1.hashCode()
            switch(r10) {
                case -2090378579: goto L_0x019a;
                case -1890252483: goto L_0x012e;
                case 104263205: goto L_0x011f;
                case 1158383506: goto L_0x00db;
                case 1402633315: goto L_0x00cc;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            goto L_0x01ac
        L_0x00cc:
            java.lang.String r10 = "challenge"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x01ac
            java.lang.String r10 = "challenge_id"
            r12.putExtra(r10, r0)
            goto L_0x01ac
        L_0x00db:
            java.lang.String r10 = "donation"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x01ac
            java.lang.String r10 = "donation_id"
            r12.putExtra(r10, r0)
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.C7573i.m23582a(r10, r11)
            java.lang.String r11 = "christmas_h5"
            java.lang.String r1 = "donation_id"
            r12.putExtra(r1, r0)
            java.lang.String r0 = "shoot_way"
            r12.putExtra(r0, r11)
            java.lang.String r0 = "creation_id"
            r12.putExtra(r0, r10)
            java.lang.String r0 = "shoot"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.aweme.app.g.d r11 = r1.mo59973a(r2, r11)
            java.lang.String r1 = "creation_id"
            com.ss.android.ugc.aweme.app.g.d r10 = r11.mo59973a(r1, r10)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r10)
            goto L_0x01ac
        L_0x011f:
            java.lang.String r10 = "music"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x01ac
            java.lang.String r10 = "music_id"
            r12.putExtra(r10, r0)
            goto L_0x01ac
        L_0x012e:
            java.lang.String r10 = "sticker"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x01ac
            java.lang.String r10 = "come_from"
            java.lang.String r10 = r11.getQueryParameter(r10)
            java.lang.String r1 = "activity"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x0149
            java.lang.String r10 = "first_face_sticker"
            r12.putExtra(r10, r0)
        L_0x0149:
            java.lang.String r10 = "sticker_id"
            r12.putExtra(r10, r0)
            java.lang.String r10 = "from"
            java.lang.String r10 = r11.getQueryParameter(r10)
            java.lang.String r11 = "new_year2019_h5"
            boolean r10 = kotlin.jvm.internal.C7573i.m23585a(r10, r11)
            if (r10 == 0) goto L_0x01ac
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "UUID.randomUUID().toString()"
            kotlin.jvm.internal.C7573i.m23582a(r10, r11)
            java.lang.String r11 = "creation_id"
            r12.putExtra(r11, r10)
            java.lang.String r11 = "shoot_way"
            java.lang.String r1 = "new_year2019_h5"
            r12.putExtra(r11, r1)
            java.lang.String r11 = "use_preset_sticker_at_first"
            r12.putExtra(r11, r5)
            java.lang.String r11 = "shoot"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "shoot_way"
            java.lang.String r5 = "new_year2019_h5"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r5)
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.aweme.app.g.d r10 = r1.mo59973a(r2, r10)
            java.lang.String r1 = "prop_id"
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r11, r10)
            goto L_0x01ac
        L_0x019a:
            java.lang.String r10 = "withStickerPanel"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L_0x01ac
            java.lang.String r10 = "sticker_pannel_show"
            r12.putExtra(r10, r5)
            java.lang.String r10 = "system_camera_stickers"
            com.p280ss.android.ugc.aweme.base.utils.C23479f.m77085a(r10)
        L_0x01ac:
            r10 = r3
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x01c8
            r10 = r4
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x01c8
            java.lang.String r10 = "extra_mention_uid"
            r12.putExtra(r10, r3)
            java.lang.String r10 = "extra_mention_user_name"
            r12.putExtra(r10, r4)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1585o.C40202a.m128506a(android.app.Activity, android.net.Uri, android.content.Intent):void");
    }
}
