package com.p280ss.android.ugc.aweme.commercialize.p1128im;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.route.BaseRoute;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.commercialize.p1128im.model.ChatExt;
import com.p280ss.android.ugc.aweme.location.C32616a.C32617a;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.profile.api.C35732h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C37273j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.im.a */
public final class C24758a extends BaseRoute implements C37273j {

    /* renamed from: a */
    public static final C24758a f65215a = new C24758a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a */
    public static final class C24759a {

        /* renamed from: a */
        public final IIMService f65216a = C30553b.m99808a(false);

        /* renamed from: b */
        public IMUser f65217b;

        /* renamed from: c */
        public LocationBundle f65218c;

        /* renamed from: d */
        public boolean f65219d;

        /* renamed from: e */
        public final Context f65220e;

        /* renamed from: f */
        public final String f65221f;

        /* renamed from: g */
        public final String f65222g;

        /* renamed from: h */
        public final IMAdLog f65223h;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a$a */
        static final class C24760a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C24759a f65224a;

            C24760a(C24759a aVar) {
                this.f65224a = aVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                this.f65224a.mo64762a(C32630h.m105696b(this.f65224a.f65220e).mo83993a());
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a$b */
        public static final class C24761b extends Handler {

            /* renamed from: a */
            final /* synthetic */ C24759a f65225a;

            public final void handleMessage(Message message) {
                if (message != null) {
                    Object obj = message.obj;
                    if (obj != null) {
                        if (obj instanceof Exception) {
                            if (C7163a.m22363a()) {
                                C10761a.m31403c(this.f65225a.f65220e, "debug: query user failed").mo25750a();
                            }
                        } else if (obj instanceof User) {
                            this.f65225a.mo64761a(IMUser.fromUser((User) obj));
                        }
                    }
                }
            }

            C24761b(C24759a aVar, Looper looper) {
                this.f65225a = aVar;
                super(looper);
            }
        }

        /* renamed from: b */
        private final void m81256b() {
            C35732h.m115451a().mo90591a(new C24761b(this, Looper.getMainLooper()), this.f65221f, 0);
        }

        /* renamed from: c */
        private final void m81257c() {
            if (!C32617a.m105668a()) {
                mo64762a((LocationBundle) null);
            } else {
                C1592h.m7855a((Callable<TResult>) new C24760a<TResult>(this), (Executor) C1592h.f5957a);
            }
        }

        /* renamed from: a */
        public final void mo64760a() {
            boolean z;
            if (this.f65216a != null) {
                CharSequence charSequence = this.f65221f;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    m81256b();
                    m81257c();
                }
            }
        }

        /* renamed from: d */
        private final void m81258d() {
            if (this.f65217b != null && this.f65219d) {
                ChatExt chatExt = new ChatExt();
                chatExt.ext = this.f65222g;
                chatExt.setLoc(this.f65218c);
                IIMService iIMService = this.f65216a;
                if (iIMService != null) {
                    iIMService.startChatWithAdLog(this.f65220e, this.f65217b, this.f65223h, chatExt);
                }
            }
        }

        /* renamed from: a */
        public final synchronized void mo64761a(IMUser iMUser) {
            this.f65217b = iMUser;
            m81258d();
        }

        /* renamed from: a */
        public final synchronized void mo64762a(LocationBundle locationBundle) {
            this.f65218c = locationBundle;
            this.f65219d = true;
            m81258d();
        }

        public C24759a(Context context, String str, String str2, IMAdLog iMAdLog) {
            C7573i.m23587b(context, "ctx");
            this.f65220e = context;
            this.f65221f = str;
            this.f65222g = str2;
            this.f65223h = iMAdLog;
        }
    }

    private C24758a() {
    }

    /* renamed from: c */
    public static final String m81252c(String str) {
        if (!m81251b(str)) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("uid");
    }

    /* renamed from: a */
    public final boolean mo59315a(String str) {
        return mo59313a((Activity) null, str);
    }

    public final void open(Context context) {
        if (context != null) {
            mo59313a((Activity) context, getUrl());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    private static IMAdLog m81246a(Uri uri) {
        boolean z;
        String queryParameter = uri.getQueryParameter("cid");
        String queryParameter2 = uri.getQueryParameter("log_extra");
        CharSequence charSequence = queryParameter;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return new IMAdLog(queryParameter2, queryParameter);
    }

    /* renamed from: b */
    private static boolean m81250b(Uri uri) {
        String str;
        String str2 = "chatting";
        String str3 = null;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (C7634n.m23717a(str2, str, true)) {
            String str4 = "/message";
            if (uri != null) {
                str3 = uri.getPath();
            }
            if (C7634n.m23717a(str4, str3, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m81251b(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String str3 = "chatting";
        String str4 = null;
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (C7634n.m23717a(str3, str2, true)) {
            String str5 = "/message";
            if (parse != null) {
                str4 = parse.getPath();
            }
            if (C7634n.m23717a(str5, str4, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m81249a(Context context, Uri uri) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(uri, "uri");
        if (!m81250b(uri)) {
            return false;
        }
        m81247a(context, uri.getQueryParameter("uid"), uri.getQueryParameter("ext"), m81246a(uri));
        return true;
    }

    /* renamed from: a */
    public final boolean mo59313a(Activity activity, String str) {
        boolean z;
        Context context;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (activity != null) {
            context = activity;
        } else {
            context = C6399b.m19921a();
        }
        C7573i.m23582a((Object) parse, "uri");
        return m81249a(context, parse);
    }

    /* renamed from: a */
    public final boolean mo59314a(Activity activity, String str, View view) {
        return mo59313a(activity, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m81247a(Context context, String str, String str2, IMAdLog iMAdLog) {
        C7573i.m23587b(context, "context");
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (f.isLogin()) {
            new C24759a(context, str, str2, iMAdLog).mo64760a();
            return;
        }
        Intent intent = new Intent(context, ChatCheckLoginActivity.class);
        intent.putExtra("extra_uid", str);
        intent.putExtra("extra_ext", str2);
        intent.putExtra("extra_imadlog", iMAdLog);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
