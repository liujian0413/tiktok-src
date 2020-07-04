package com.p280ss.android.ugc.aweme.account.p982ui;

import android.app.Activity;
import android.arch.lifecycle.C0049m;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.ActionResultModel;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowActivity;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.C21900a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22151j;
import com.p280ss.android.ugc.aweme.main.p1385g.C33033s;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity */
public final class BindOrModifyPhoneActivity extends BaseAccountFlowActivity {

    /* renamed from: a */
    public static final C22246a f59406a = new C22246a(null);

    /* renamed from: b */
    private Step f59407b = Step.INPUT_PHONE_BIND;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity$a */
    public static final class C22246a {
        private C22246a() {
        }

        public /* synthetic */ C22246a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Intent m73758a(Context context) {
            C7573i.m23587b(context, "context");
            Intent putExtra = new Intent(context, BindOrModifyPhoneActivity.class).putExtra("current_scene", Scene.BIND_PHONE.getValue()).putExtra("next_page", Step.INPUT_PHONE_BIND.getValue()).putExtra("enter_method", "first_bind_phone_click");
            C7573i.m23582a((Object) putExtra, "Intent(context, BindOrMo…, FIRST_BIND_PHONE_CLICK)");
            return putExtra;
        }

        /* renamed from: b */
        public static Intent m73759b(Context context) {
            C7573i.m23587b(context, "context");
            Intent putExtra = new Intent(context, BindOrModifyPhoneActivity.class).putExtra("current_scene", Scene.MODIFY_PHONE.getValue()).putExtra("next_page", Step.PHONE_SMS_VERIFY.getValue()).putExtra("enter_method", "change_bind_phone_click");
            C7573i.m23582a((Object) putExtra, "Intent(context, BindOrMo… CHANGE_BIND_PHONE_CLICK)");
            return putExtra;
        }
    }

    /* renamed from: a */
    public static final Intent m73754a(Context context) {
        return C22246a.m73758a(context);
    }

    /* renamed from: b */
    public static final Intent m73755b(Context context) {
        return C22246a.m73759b(context);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.l0).statusBarDarkFont(true).init();
    }

    public final void finish() {
        super.finish();
        ((C33033s) C21671bd.m72521a(C33033s.class)).mo60030a(this);
        User k = C21671bd.m72543k();
        if (k != null && !k.isPhoneBinded()) {
            C21671bd.m72522a(7, 2, (Object) null);
        }
    }

    /* renamed from: b */
    public final void mo58331b(Bundle bundle) {
        C10761a.m31409e(getApplicationContext(), (int) R.string.dnh).mo25750a();
        finish();
    }

    /* renamed from: a */
    public final void mo58328a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        Step a = C21900a.m73110a(bundle2.getInt("next_page", Step.INPUT_PHONE_BIND.getValue()));
        bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
        bundle2.putInt("current_page", a.getValue());
        bundle2.remove("next_page");
        mo58329a(C22151j.m73594a(a), bundle2);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.l0)));
        this.f59407b = C21900a.m73110a(getIntent().getIntExtra("next_page", Step.INPUT_PHONE_BIND.getValue()));
        if (getIntent().getIntExtra("current_scene", Scene.NONE.getValue()) == Scene.NONE.getValue()) {
            getIntent().putExtra("current_scene", Scene.BIND_PHONE.getValue());
            getIntent().putExtra("enter_method", "first_bind_phone_click");
        }
        if (bundle == null) {
            C0049m<Bundle> mVar = ((ActionResultModel) C0069x.m159a((FragmentActivity) this).mo147a(ActionResultModel.class)).f58597b;
            Intent intent = getIntent();
            C7573i.m23582a((Object) intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putString("enter_from", getIntent().getStringExtra("ENTER_REASON"));
            extras.putString("enter_method", getIntent().getStringExtra("enter_method"));
            extras.putString("enter_type", mo58333d());
            extras.putInt("next_page", this.f59407b.getValue());
            mVar.postValue(extras);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", false);
    }
}
