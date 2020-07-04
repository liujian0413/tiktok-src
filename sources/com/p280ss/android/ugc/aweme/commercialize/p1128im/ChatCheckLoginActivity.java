package com.p280ss.android.ugc.aweme.commercialize.p1128im;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a.C24759a;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity */
public final class ChatCheckLoginActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C24755a f65211a = new C24755a(null);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$a */
    public static final class C24755a {
        private C24755a() {
        }

        public /* synthetic */ C24755a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$b */
    public static final class C24756b implements C23305g {

        /* renamed from: a */
        final /* synthetic */ ChatCheckLoginActivity f65212a;

        /* renamed from: b */
        final /* synthetic */ ObjectRef f65213b;

        /* renamed from: a */
        public final void mo58663a() {
            ((C7561a) this.f65213b.element).invoke();
        }

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
            this.f65212a.finish();
        }

        C24756b(ChatCheckLoginActivity chatCheckLoginActivity, ObjectRef objectRef) {
            this.f65212a = chatCheckLoginActivity;
            this.f65213b = objectRef;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity$c */
    static final class C24757c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChatCheckLoginActivity f65214a;

        C24757c(ChatCheckLoginActivity chatCheckLoginActivity) {
            this.f65214a = chatCheckLoginActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m81245a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m81245a() {
            new C24759a(this.f65214a, this.f65214a.getIntent().getStringExtra("extra_uid"), this.f65214a.getIntent().getStringExtra("extra_ext"), (IMAdLog) this.f65214a.getIntent().getSerializableExtra("extra_imadlog")).mo64760a();
            this.f65214a.finish();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = (C7561a) new C24757c(this);
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (f.isLogin()) {
            ((C7561a) objectRef.element).invoke();
        } else {
            C32656f.m105745a((Activity) this, "", "", (C23305g) new C24756b(this, objectRef));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", false);
    }
}
