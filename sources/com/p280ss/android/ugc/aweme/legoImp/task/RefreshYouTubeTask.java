package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.api.client.googleapis.auth.p775a.C17216c;
import com.google.api.client.googleapis.auth.p775a.C17216c.C17217a;
import com.google.api.client.http.C17272u;
import com.google.api.client.json.C17291c;
import com.google.api.client.json.p779a.C17280a;
import com.google.api.client.p770a.p771a.p772a.C17191a;
import com.google.api.p767a.p768a.C17160a;
import com.google.api.p767a.p768a.C17160a.C17161a;
import com.google.api.p767a.p768a.p769a.C17164a;
import com.google.api.p767a.p768a.p769a.C17172h;
import com.google.api.p767a.p768a.p769a.C17174j;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30202j;
import com.p280ss.android.ugc.aweme.global.config.settings.C6925d;
import com.p280ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.edit.api.YouTubeLinkingApi;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42935ap;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import net.openid.appauth.AuthorizationException;
import net.openid.appauth.C48265g;
import net.openid.appauth.C48265g.C48267b;
import net.openid.appauth.C48269i;
import net.openid.appauth.C48279m;
import net.openid.appauth.C48282p;
import net.openid.appauth.C48282p.C48284a;
import net.openid.appauth.C48285q;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.RefreshYouTubeTask */
public final class RefreshYouTubeTask implements C6310a, C6925d, LegoTask {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RefreshYouTubeTask.class), "googleClientId", "getGoogleClientId()Ljava/lang/String;"))};
    public static final C32381a Companion = new C32381a(null);
    public static final boolean DEBUG = C7163a.m22363a();
    private Handler bgHandler;
    public Context context;
    private final C7541d googleClientId$delegate = C7546e.m23569a(C32384c.f84503a);
    public String oldYouTubeChannelTitle;
    private int settingsTimeoutTicker;
    public String youTubeChannelId;
    public String youTubeChannelTitle;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RefreshYouTubeTask$a */
    static final class C32381a {
        private C32381a() {
        }

        public /* synthetic */ C32381a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RefreshYouTubeTask$b */
    static final class C32382b implements C48267b {

        /* renamed from: a */
        final /* synthetic */ RefreshYouTubeTask f84498a;

        /* renamed from: b */
        final /* synthetic */ String f84499b;

        C32382b(RefreshYouTubeTask refreshYouTubeTask, String str) {
            this.f84498a = refreshYouTubeTask;
            this.f84499b = str;
        }

        /* renamed from: a */
        public final void mo83605a(final C48285q qVar, final AuthorizationException authorizationException) {
            C43173w.m136925a((Runnable) new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C32382b f84500a;

                {
                    this.f84500a = r1;
                }

                public final void run() {
                    boolean z = false;
                    if (authorizationException != null) {
                        if (this.f84500a.f84498a.isAccessRevoked(authorizationException) && YouTubeLinkingApi.m115487a()) {
                            C6861a.m21337f().queryUser();
                        }
                        this.f84500a.f84498a.logEvent(false, false);
                    } else if (qVar == null) {
                        this.f84500a.f84498a.logEvent(false, false);
                    } else {
                        C17272u a = C17191a.m57039a();
                        C17291c aVar = new C17280a();
                        C17216c a2 = new C17217a().mo44493a(a).mo44494a(aVar).mo44513a(this.f84500a.f84498a.getGoogleClientId(), null).mo44514a();
                        if (RefreshYouTubeTask.DEBUG && qVar.f123335e != null) {
                            StringBuilder sb = new StringBuilder("New token expires on ");
                            Long l = qVar.f123335e;
                            if (l == null) {
                                C7573i.m23580a();
                            }
                            C7573i.m23582a((Object) l, "response.accessTokenExpirationTime!!");
                            sb.append(new Date(l.longValue()));
                        }
                        C7573i.m23582a((Object) a2, "mCredential");
                        a2.mo44484a(qVar.f123334d);
                        a2.mo44487b(qVar.f123335e);
                        a2.mo44488b(qVar.f123337g);
                        C17160a a3 = new C17161a(a, aVar, a2).mo44442f(RefreshYouTubeTask.access$getContext$p(this.f84500a.f84498a).getString(R.string.bf7)).mo44436a();
                        try {
                            RefreshYouTubeTask refreshYouTubeTask = this.f84500a.f84498a;
                            C7573i.m23582a((Object) a3, "youtube");
                            refreshYouTubeTask.fetchYouTubeData(a3);
                            z = true;
                        } catch (Exception unused) {
                        }
                        this.f84500a.f84498a.logEvent(z, true ^ TextUtils.equals(this.f84500a.f84498a.youTubeChannelTitle, this.f84500a.f84498a.oldYouTubeChannelTitle));
                        if (z && C23764b.m77913a(this.f84500a.f84498a.youTubeChannelId) && C23764b.m77913a(this.f84500a.f84498a.youTubeChannelTitle) && YouTubeLinkingApi.m115488a(this.f84500a.f84499b, null, this.f84500a.f84498a.youTubeChannelId, this.f84500a.f84498a.youTubeChannelTitle)) {
                            C6861a.m21337f().queryUser();
                        }
                    }
                }
            }, "RefreshYouTubeTask");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RefreshYouTubeTask$c */
    static final class C32384c extends Lambda implements C7561a<String> {

        /* renamed from: a */
        public static final C32384c f84503a = new C32384c();

        C32384c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m104953a();
        }

        /* renamed from: a */
        private static String m104953a() {
            if (C6399b.m19946v()) {
                return "616463764658-p01hhcj82u4mqjnp1oca04i3o67fjsm1.apps.googleusercontent.com";
            }
            return "1096011445005-qqsj3hcu9s53dv6pbdrl6vs8ls649v01.apps.googleusercontent.com";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RefreshYouTubeTask$d */
    static final class C32385d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RefreshYouTubeTask f84504a;

        /* renamed from: b */
        final /* synthetic */ User f84505b;

        C32385d(RefreshYouTubeTask refreshYouTubeTask, User user) {
            this.f84504a = refreshYouTubeTask;
            this.f84505b = user;
        }

        public final void run() {
            RefreshYouTubeTask refreshYouTubeTask = this.f84504a;
            User user = this.f84505b;
            C7573i.m23582a((Object) user, "curUser");
            refreshYouTubeTask.fetchNewData(user);
        }
    }

    public final String getGoogleClientId() {
        return (String) this.googleClientId$delegate.getValue();
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final void sync() {
    }

    public final void syncFail(Exception exc) {
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    private final boolean isEnabled() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Integer thirdPartyDataRefresh = a.getThirdPartyDataRefresh();
            if (thirdPartyDataRefresh == null) {
                return false;
            }
            if (thirdPartyDataRefresh.intValue() == 1) {
                return true;
            }
            return false;
        } catch (NullValueException unused) {
            return false;
        }
    }

    private final void startTimeoutTimer() {
        if (this.bgHandler == null) {
            HandlerThread handlerThread = new HandlerThread("youtube-refresh-timer");
            handlerThread.start();
            this.bgHandler = new Handler(handlerThread.getLooper());
        }
        Handler handler = this.bgHandler;
        if (handler == null) {
            C7573i.m23580a();
        }
        if (handler.hasMessages(1)) {
            Handler handler2 = this.bgHandler;
            if (handler2 == null) {
                C7573i.m23580a();
            }
            handler2.removeMessages(1);
        }
        Handler handler3 = this.bgHandler;
        if (handler3 == null) {
            C7573i.m23580a();
        }
        handler3.sendEmptyMessage(1);
    }

    public static final /* synthetic */ Context access$getContext$p(RefreshYouTubeTask refreshYouTubeTask) {
        Context context2 = refreshYouTubeTask.context;
        if (context2 == null) {
            C7573i.m23583a("context");
        }
        return context2;
    }

    public final void change(IESSettingsProxy iESSettingsProxy) {
        C7573i.m23587b(iESSettingsProxy, "iesSettings");
        Handler handler = this.bgHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Context context2 = this.context;
        if (context2 == null) {
            C7573i.m23583a("context");
        }
        run(context2);
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            Handler handler = this.bgHandler;
            if (handler != null) {
                handler.removeMessages(1);
            }
            this.settingsTimeoutTicker++;
            if (this.settingsTimeoutTicker > 3) {
                SettingsManagerProxy.inst().removeSettingsWatcher(this);
                Handler handler2 = this.bgHandler;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
            } else {
                Handler handler3 = this.bgHandler;
                if (handler3 != null) {
                    handler3.sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    }

    public final void fetchNewData(User user) {
        String youTubeRefreshToken = user.getYouTubeRefreshToken();
        C7573i.m23582a((Object) youTubeRefreshToken, "curUser.youTubeRefreshToken");
        String b = C42935ap.m136289b(youTubeRefreshToken, "J?I7iAd=3j9AM1P=", "AES/CBC/PKCS7Padding", "J?I7iAd=3j9AM1P=");
        this.oldYouTubeChannelTitle = user.getYoutubeChannelTitle();
        if (!TextUtils.isEmpty(b)) {
            C48282p a = new C48284a(new C48269i(Uri.parse("https://accounts.google.com/o/oauth2/v2/auth"), Uri.parse("https://www.googleapis.com/oauth2/v4/token")), getGoogleClientId()).mo120659a("refresh_token").mo120662b("https://www.googleapis.com/auth/youtube.readonly").mo120664d(b).mo120661a();
            C7573i.m23582a((Object) a, "TokenRequest.Builder(con…\n                .build()");
            Context context2 = this.context;
            if (context2 == null) {
                C7573i.m23583a("context");
            }
            new C48265g(context2).mo120650a(a, C48279m.f123310a, new C32382b(this, b));
        }
    }

    public final void fetchYouTubeData(C17160a aVar) throws IOException {
        C17172h hVar = (C17172h) aVar.mo44435e().mo44444a("id, snippet").mo44445a(Boolean.valueOf(true)).mo44507c();
        if (hVar != null && C23477d.m77083b(hVar.items)) {
            C17164a aVar2 = (C17164a) hVar.items.get(0);
            C7573i.m23582a((Object) aVar2, "channel");
            this.youTubeChannelId = aVar2.f47896id;
            C17174j jVar = aVar2.snippet;
            C7573i.m23582a((Object) jVar, "channel.snippet");
            this.youTubeChannelTitle = jVar.title;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isAccessRevoked(net.openid.appauth.AuthorizationException r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            org.json.JSONObject r7 = r7.toJson()
            java.lang.String r1 = "error"
            boolean r1 = r7.has(r1)
            java.lang.String r2 = "errorDescription"
            boolean r2 = r7.has(r2)
            r1 = r1 & r2
            r2 = 0
            if (r1 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r7 = r2
        L_0x001a:
            if (r7 == 0) goto L_0x0064
            java.lang.String r1 = "error"
            java.lang.String r1 = r7.getString(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r3 = "invalid_grant"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            r3 = 1
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = "errorDescription"
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r4 = "it.getString(\"errorDescription\")"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r4 = "revoked"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 2
            boolean r1 = kotlin.text.C7634n.m23776c(r1, r4, false)
            if (r1 == 0) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x0054:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r7.<init>(r0)
            throw r7
        L_0x005c:
            r1 = 0
        L_0x005d:
            if (r1 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r7 = r2
        L_0x0061:
            if (r7 == 0) goto L_0x0064
            return r3
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.legoImp.task.RefreshYouTubeTask.isAccessRevoked(net.openid.appauth.AuthorizationException):boolean");
    }

    public final void run(Context context2) {
        C7573i.m23587b(context2, "context");
        this.context = context2;
        C30202j a = C30202j.m98867a();
        C7573i.m23582a((Object) a, "SettingsStateManager.getInstance()");
        boolean z = true;
        if (!a.mo76690b()) {
            SettingsManagerProxy.inst().registerSettingsWatcher(this, true);
            startTimeoutTimer();
        } else if (isEnabled()) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            User curUser = f.getCurUser();
            C7573i.m23582a((Object) curUser, "curUser");
            if (!TextUtils.isEmpty(curUser.getYouTubeRefreshToken())) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long youTubeLastRefreshTime = curUser.getYouTubeLastRefreshTime();
                if (youTubeLastRefreshTime <= 0 || currentTimeMillis - youTubeLastRefreshTime <= TimeUnit.DAYS.toSeconds(30)) {
                    z = false;
                }
                if (z) {
                    if (C7573i.m23585a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
                        C43173w.m136925a((Runnable) new C32385d(this, curUser), "RefreshYouTubeTask");
                    } else {
                        fetchNewData(curUser);
                    }
                }
            }
        }
    }

    public final void logEvent(boolean z, boolean z2) {
        C6907h.m21524a("social_profile_check", (Map) new C22984d().mo59973a("platform", "youtube").mo59972a("need_refresh", (Object) Boolean.valueOf(true)).mo59972a("is_success", (Object) Boolean.valueOf(z)).mo59972a("is_update", (Object) Boolean.valueOf(z2)).f60753a);
    }
}
