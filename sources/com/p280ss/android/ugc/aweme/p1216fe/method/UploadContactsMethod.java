package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.user.p1689d.C42829b;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import com.p280ss.android.ugc.aweme.utils.C42925am.C42929a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.UploadContactsMethod */
public final class UploadContactsMethod extends BaseCommonJavaMethod implements C6310a {

    /* renamed from: b */
    public static final C27934a f73600b = new C27934a(null);

    /* renamed from: a */
    public final C6309f f73601a = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: c */
    private C27876a f73602c;

    /* renamed from: d */
    private final Activity f73603d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.UploadContactsMethod$a */
    public static final class C27934a {
        private C27934a() {
        }

        public /* synthetic */ C27934a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.UploadContactsMethod$b */
    public static final class C27935b implements C42929a {

        /* renamed from: a */
        final /* synthetic */ UploadContactsMethod f73604a;

        /* renamed from: b */
        final /* synthetic */ C27876a f73605b;

        /* renamed from: a */
        public final void mo71408a() {
            C42829b.m135986a().mo104529a(this.f73604a.f73601a, 115);
        }

        /* renamed from: b */
        public final void mo71409b() {
            C27876a aVar = this.f73605b;
            if (aVar != null) {
                aVar.mo71362a(0, "");
            }
        }

        C27935b(UploadContactsMethod uploadContactsMethod, C27876a aVar) {
            this.f73604a = uploadContactsMethod;
            this.f73605b = aVar;
        }
    }

    public final void handleMsg(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 115) {
            C27876a aVar = this.f73602c;
            if (aVar != null) {
                aVar.mo71364a("", 1, "");
            }
        }
    }

    public UploadContactsMethod(Activity activity, C11087a aVar) {
        super(aVar);
        this.f73603d = activity;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        this.f73602c = aVar;
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin()) {
            aVar.mo71362a(0, "");
        } else if (C42925am.m136275c(AwemeApplication.m21341a())) {
            C42829b.m135986a().mo104529a(this.f73601a, 115);
        } else if (this.f73603d != null) {
            C42925am.m136271a(this.f73603d, (C42929a) new C27935b(this, aVar));
        } else {
            aVar.mo71362a(0, "");
        }
    }
}
