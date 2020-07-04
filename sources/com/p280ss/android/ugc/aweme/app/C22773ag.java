package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.C22689a.C22708e;
import com.p280ss.android.ugc.aweme.app.C22689a.C22709f;
import com.p280ss.android.ugc.aweme.app.C22880at.C22881a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailActivity;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.NotificationTabStyleExperiment;
import com.p280ss.android.ugc.aweme.live.feedpage.C32518c;
import com.p280ss.android.ugc.aweme.livewallpaper.p1370ui.LocalLiveWallPaperActivity;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.story.live.C41990e.C41991a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.app.ag */
public final class C22773ag extends C22689a {

    /* renamed from: c */
    public static final C22774a f60464c = new C22774a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.ag$a */
    public static final class C22774a {
        private C22774a() {
        }

        /* renamed from: a */
        public static List<C22708e> m75159a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C22786l());
            arrayList.add(new C22779f());
            arrayList.add(new C22778e());
            arrayList.add(new C22785k());
            arrayList.add(new C22784j());
            arrayList.add(new C22775b());
            arrayList.add(new C22781g());
            arrayList.add(new C22776c());
            arrayList.add(new C22783i());
            arrayList.add(new C22782h());
            arrayList.add(new C22777d());
            return arrayList;
        }

        public /* synthetic */ C22774a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$b */
    public static final class C22775b extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C7634n.m23721b(sb.toString(), "aweme/create", false);
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("effects", false);
            boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("blur", false);
            boolean booleanQueryParameter3 = uri.getBooleanQueryParameter("duet", false);
            String queryParameter = uri.getQueryParameter("aweme_id");
            Intent intent = new Intent(activity, PushCameraBlurActivity.class);
            intent.putExtra("show_dialog", booleanQueryParameter2);
            intent.putExtra("show_effect", booleanQueryParameter);
            intent.putExtra("show_duet", booleanQueryParameter3);
            intent.putExtra("aid", queryParameter);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$c */
    public static final class C22776c extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) C22704b.f60414c);
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent(activity, MainActivity.class);
            try {
                int parseInt = Integer.parseInt(uri.getQueryParameter("tab"));
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    C22887b.f60603b.mo59852a("homepage_hot", uri, z);
                } else if (parseInt == 2) {
                    C22887b.f60603b.mo59852a("homepage_fresh", uri, z);
                }
            } catch (Exception unused) {
            }
            intent.addFlags(536870912);
            intent.addFlags(32768);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$d */
    public static final class C22777d extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) "game", (Object) str);
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C23018p a = C23018p.m75672a();
            C7573i.m23582a((Object) a, "AwemeRuntime.inst()");
            if (a.mo59990c()) {
                C33471b a2 = new C33472a().mo85791b("schema").mo85790a();
                Context context = activity;
                C7167b.m22380b().mo18647a().openMiniApp(context, C33447f.m108188a("", uri.getQueryParameter("game_id"), true, ""), a2);
                return;
            }
            Intent mainActivityIntent = MainActivity.getMainActivityIntent(activity);
            String queryParameter = uri.getQueryParameter("game_id");
            mainActivityIntent.putExtra("jumpToGame", true);
            mainActivityIntent.putExtra("gameId", queryParameter);
            activity.startActivity(mainActivityIntent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$e */
    public static final class C22778e extends C22708e {

        /* renamed from: a */
        public final String f60465a = "click_push_follow_request";

        /* renamed from: b */
        public final String f60466b = "click_push_follow_approve";

        /* renamed from: c */
        public final String f60467c = "click_push_follow";

        /* renamed from: d */
        public final String f60468d = "click_push_digg";

        /* renamed from: e */
        public final String f60469e = "click_push_digg_comment";

        /* renamed from: f */
        public final String f60470f = "click_push_forward_digg";

        /* renamed from: g */
        public final String f60471g = "click_push_vote";

        /* renamed from: h */
        public final String f60472h = "click_push_comment";

        /* renamed from: i */
        public final String f60473i = "click_push_replycomment";

        /* renamed from: j */
        public final String f60474j = "click_push_forward";

        /* renamed from: k */
        public final String f60475k = "click_push_forward_and_forward";

        /* renamed from: l */
        public final String f60476l = "click_push_forward_comment";

        /* renamed from: m */
        public final String f60477m = "click_push_forwardreplycomment";

        /* renamed from: n */
        public final String f60478n = "click_push_videoat";

        /* renamed from: o */
        public final String f60479o = "click_push_commentat";

        /* renamed from: p */
        public final String f60480p = "click_push_forward_at";

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (C7573i.m23585a((Object) "notification", (Object) str) || C7573i.m23585a((Object) "chat", (Object) str)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            int a = C6384b.m19835a().mo15287a(NotificationTabStyleExperiment.class, true, "i18n_message_page_style", C6384b.m19835a().mo15295d().i18n_message_page_style, 2);
            if (a == 1 || a == 3) {
                if (!C7573i.m23585a((Object) "chat", (Object) str) || !C7573i.m23585a((Object) "/system", (Object) str2)) {
                    String queryParameter2 = uri.getQueryParameter("gd_label");
                    Intent intent = new Intent();
                    CharSequence charSequence = queryParameter2;
                    if (TextUtils.equals(charSequence, this.f60467c)) {
                        intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 0).buildIntent();
                        C7573i.m23582a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
                    } else if (TextUtils.equals(charSequence, this.f60468d) || TextUtils.equals(charSequence, this.f60469e) || TextUtils.equals(charSequence, this.f60470f)) {
                        intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 1).buildIntent();
                        C7573i.m23582a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
                    } else if (TextUtils.equals(charSequence, this.f60472h) || TextUtils.equals(charSequence, this.f60473i) || TextUtils.equals(charSequence, this.f60471g) || TextUtils.equals(charSequence, this.f60474j) || TextUtils.equals(charSequence, this.f60475k) || TextUtils.equals(charSequence, this.f60476l) || TextUtils.equals(charSequence, this.f60477m)) {
                        intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 3).buildIntent();
                        C7573i.m23582a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
                    } else if (TextUtils.equals(charSequence, this.f60478n) || TextUtils.equals(charSequence, this.f60480p) || TextUtils.equals(charSequence, this.f60479o)) {
                        intent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 2).buildIntent();
                        C7573i.m23582a((Object) intent, "SmartRouter.buildRoute(a…           .buildIntent()");
                    } else {
                        intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
                        intent.setFlags(335544320);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                    }
                    intent.putExtra("enter_from", "push");
                    C22995i a2 = C22995i.m75637a();
                    C7573i.m23582a((Object) a2, "AppLifeCircleCacheManager.getInstance()");
                    if (a2.f60773a) {
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                    }
                    IAccountUserService a3 = C21115b.m71197a();
                    C7573i.m23582a((Object) a3, "AccountUserProxyService.get()");
                    if (!a3.isLogin()) {
                        return C22881a.m75349a(activity, intent, queryParameter);
                    }
                    return intent;
                }
                Intent buildIntent = SmartRouter.buildRoute((Context) activity, "//notification").withParam("from_where", 5).buildIntent();
                IAccountUserService a4 = C21115b.m71197a();
                C7573i.m23582a((Object) a4, "AccountUserProxyService.get()");
                if (!a4.isLogin()) {
                    return C22881a.m75349a(activity, buildIntent, queryParameter);
                }
                return buildIntent;
            } else if (C7573i.m23585a((Object) "chat", (Object) str)) {
                IIMService g = C30553b.m99810g();
                C7573i.m23582a((Object) g, "IM.get()");
                Class sessionListActivityClass = g.getSessionListActivityClass();
                if (sessionListActivityClass != null) {
                    IAccountUserService a5 = C21115b.m71197a();
                    C7573i.m23582a((Object) a5, "AccountUserProxyService.get()");
                    if (!a5.isLogin()) {
                        return C22881a.m75349a(activity, new Intent(activity, sessionListActivityClass), queryParameter);
                    }
                    return new Intent(activity, sessionListActivityClass);
                }
                IAccountUserService a6 = C21115b.m71197a();
                C7573i.m23582a((Object) a6, "AccountUserProxyService.get()");
                if (!a6.isLogin()) {
                    return C22881a.m75349a(activity, null, queryParameter);
                }
                return null;
            } else if (!C7573i.m23585a((Object) "notification", (Object) str)) {
                return null;
            } else {
                Intent intent2 = new Intent();
                intent2.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
                intent2.setFlags(335544320);
                intent2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                String queryParameter3 = uri.getQueryParameter("label");
                C22887b.f60603b.mo59852a(queryParameter3, uri, z);
                if (TextUtils.equals(queryParameter3, "check_profile")) {
                    intent2.putExtra("push", true);
                }
                IAccountUserService a7 = C21115b.m71197a();
                C7573i.m23582a((Object) a7, "AccountUserProxyService.get()");
                if (!a7.isLogin()) {
                    return C22881a.m75349a(activity, intent2, queryParameter);
                }
                return intent2;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$f */
    public static final class C22779f extends C22708e {

        /* renamed from: com.ss.android.ugc.aweme.app.ag$f$a */
        static final class C22780a<T> implements C7326g<Map<Long, Long>> {

            /* renamed from: a */
            final /* synthetic */ User f60481a;

            C22780a(User user) {
                this.f60481a = user;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Map<Long, Long> map) {
                String str;
                String uid = this.f60481a.getUid();
                C7573i.m23582a((Object) uid, "user.uid");
                Long l = (Long) map.get(Long.valueOf(Long.parseLong(uid)));
                if (l != null) {
                    long longValue = l.longValue();
                    C41989d.m133496c(String.valueOf(longValue), this.f60481a.getUid());
                    String uid2 = this.f60481a.getUid();
                    if (longValue > 0) {
                        str = "live_on";
                    } else {
                        str = "live_finish";
                    }
                    C41989d.m133478a(uid2, longValue, str);
                }
            }
        }

        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "live";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (C7573i.m23585a((Object) str, (Object) "live") || (C6399b.m19946v() && (C7573i.m23585a((Object) str, (Object) "live") || C7573i.m23585a((Object) str, (Object) "live.musical.ly")))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            long j;
            String str4;
            String str5;
            Activity activity2 = activity;
            Uri uri2 = uri;
            String str6 = str3;
            boolean z2 = z;
            C7573i.m23587b(activity2, "activity");
            C7573i.m23587b(uri2, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str6, "fromTokenType");
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin()) {
                return new Intent(activity2, MainActivity.class);
            }
            String queryParameter = uri2.getQueryParameter("userId");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = uri2.getQueryParameter("user_id");
            }
            String queryParameter2 = uri2.getQueryParameter("sec_user_id");
            C22709f.m75045a(queryParameter, uri2);
            String queryParameter3 = uri2.getQueryParameter("liveId");
            if (TextUtils.isEmpty(queryParameter3)) {
                queryParameter3 = uri2.getQueryParameter("room_id");
            }
            String queryParameter4 = uri2.getQueryParameter("from");
            if (TextUtils.isEmpty(queryParameter4)) {
                queryParameter4 = uri2.getQueryParameter("gd_label");
            }
            String queryParameter5 = uri2.getQueryParameter("backurl");
            String queryParameter6 = uri2.getQueryParameter("tab_index");
            try {
                j = Long.parseLong(queryParameter3);
            } catch (NumberFormatException unused) {
                j = 0;
            }
            User user = new User();
            user.setUid(queryParameter);
            user.roomId = j;
            Context context = activity2;
            if (!C22787ah.m75185a(context)) {
                return new Intent(context, MainActivity.class);
            }
            AwemeAppData.m65765a().f60329i = true;
            if (!TextUtils.isEmpty(queryParameter)) {
                C22792an anVar = new C22792an(context);
                anVar.mo59827a(queryParameter4, str6, j);
                anVar.mo59828a(queryParameter, queryParameter2, queryParameter6, z2);
            } else {
                CharSequence charSequence = queryParameter4;
                if (!TextUtils.equals(charSequence, C22912d.f60641a) && !TextUtils.equals(charSequence, "jsbridge")) {
                    C41989d.m133469a(context, 1, user.getRequestId(), user.getUid(), user.roomId);
                }
                if (!C6399b.m19944t() && !TextUtils.isEmpty(str6)) {
                    C6907h.m21524a("live_play", (Map) C22984d.m75611a().mo59973a("enter_from", str6).mo59973a("anchor_id", queryParameter).f60753a);
                }
                if (z2) {
                    C32518c.m105318a().mo83745a(C22773ag.f60464c.getClass(), user, new C22780a(user));
                }
                C41991a a2 = new C41991a(context, user).mo103120a(queryParameter6);
                if (z2) {
                    str4 = "push";
                } else {
                    str4 = C22912d.f60641a;
                }
                C41991a a3 = a2.mo103122b(str4).mo103117a(4);
                if (z2) {
                    str5 = "push";
                } else {
                    str5 = C22912d.f60641a;
                }
                C41990e.m133503a(a3.mo103123c(str5).mo103121a("backUrl", queryParameter5));
            }
            C22887b.f60603b.mo59852a("live", uri2, z2);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$g */
    public static final class C22781g extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "livewallpaper");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return new Intent(activity, LocalLiveWallPaperActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$h */
    public static final class C22782h extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            if (C7573i.m23585a((Object) "microapp", (Object) str) || C7573i.m23585a((Object) "microgame", (Object) str)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo59800a(Activity activity, Uri uri, boolean z) {
            String str;
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            CharSequence queryParameter = uri.getQueryParameter("schema_from");
            if (TextUtils.equals(queryParameter, "splash")) {
                str = "025001";
            } else if (TextUtils.equals(queryParameter, "qr_code")) {
                str = "021002";
            } else if (TextUtils.equals(queryParameter, "ad_link")) {
                str = "025003";
            } else {
                str = "";
            }
            String queryParameter2 = uri.getQueryParameter("position");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            C7167b.m22380b().mo18647a().openMiniApp((Context) activity, uri.toString(), new C33472a().mo85791b("schema").mo85792c(str).mo85789a(queryParameter2).mo85794e(C22912d.f60642b).mo85790a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$i */
    public static final class C22783i extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "growth_activity_dialog");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return new Intent(activity, MainActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$j */
    public static final class C22784j extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "private");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            Intent intent = new Intent();
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            intent.putExtra("label", uri.getQueryParameter("label"));
            intent.putExtra("uid", uri.getLastPathSegment());
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin()) {
                return C22881a.m75349a(activity, intent, queryParameter);
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$k */
    public static final class C22785k extends C22708e {
        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return C7634n.m23721b(sb.toString(), "user/referral", false);
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            return new Intent(activity, MainActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.ag$l */
    public static final class C22786l extends C22708e {
        /* renamed from: a */
        public final String mo59797a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            return "challenge_detail";
        }

        /* renamed from: a */
        public final boolean mo59798a(String str, String str2) {
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            return C7573i.m23585a((Object) str, (Object) "tag");
        }

        /* renamed from: a */
        public final Intent mo59796a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(str, "host");
            C7573i.m23587b(str2, "path");
            C7573i.m23587b(str3, "fromTokenType");
            C25242ao.m82971a(uri, uri.getQueryParameter("id"));
            Intent intent = new Intent(activity, ChallengeDetailActivity.class);
            intent.putExtra("id", uri.getQueryParameter("id"));
            intent.putExtra("enter_from", uri.getQueryParameter("enter_from"));
            C22887b.f60603b.mo59852a("challenge_detail", uri, z);
            return intent;
        }
    }
}
