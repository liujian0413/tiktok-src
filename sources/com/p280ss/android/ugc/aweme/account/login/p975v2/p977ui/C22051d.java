package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.d */
public final class C22051d {

    /* renamed from: a */
    public static final C22051d f58973a = new C22051d();

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.d$a */
    static final class C22052a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f58974a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58975b;

        /* renamed from: c */
        final /* synthetic */ String f58976c;

        C22052a(Activity activity, BaseAccountFlowFragment baseAccountFlowFragment, String str) {
            this.f58974a = activity;
            this.f58975b = baseAccountFlowFragment;
            this.f58976c = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22051d.m73353a(this.f58974a, this.f58975b, this.f58976c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.d$b */
    static final class C22053b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f58977a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58978b;

        C22053b(String str, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58977a = str;
            this.f58978b = baseAccountFlowFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            int i2;
            if (i == 1) {
                C6907h.m21524a("click_forget_password", (Map) new C21102b().mo56946a("platform", "email").mo56946a("enter_from", this.f58977a).mo56946a("enter_method", this.f58978b.mo58341f()).f56672a);
            } else if (i == 0) {
                C6907h.m21524a("click_forget_password", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_from", this.f58977a).mo56946a("enter_method", this.f58978b.mo58341f()).f56672a);
            }
            BaseAccountFlowFragment baseAccountFlowFragment = this.f58978b;
            Bundle arguments = this.f58978b.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            String str = "next_page";
            if (i == 1) {
                i2 = Step.INPUT_EMAIL_FIND_PASSWORD.getValue();
            } else {
                i2 = Step.INPUT_PHONE_FIND_PASSWORD.getValue();
            }
            arguments.putInt(str, i2);
            arguments.putInt("current_scene", Scene.MODIFY_PASSWORD.getValue());
            if (this.f58978b instanceof C22050c) {
                C21903c.m73115a((Fragment) this.f58978b, ((C22050c) this.f58978b).mo58402a());
            }
            C7573i.m23582a((Object) arguments, "(fragment.arguments ?: B…          }\n            }");
            baseAccountFlowFragment.mo58336a(arguments);
            dialogInterface.dismiss();
        }
    }

    private C22051d() {
    }

    /* renamed from: a */
    public static void m73353a(Activity activity, BaseAccountFlowFragment baseAccountFlowFragment, String str) {
        C25712a aVar = new C25712a(activity);
        String string = activity.getString(R.string.cew);
        C7573i.m23582a((Object) string, "activity.getString(R.string.mus_phone_num)");
        String string2 = activity.getString(R.string.cc9);
        C7573i.m23582a((Object) string2, "activity.getString(R.string.mus_email)");
        aVar.mo66614a((CharSequence[]) new String[]{string, string2}, (DialogInterface.OnClickListener) new C22053b(str, baseAccountFlowFragment));
        C42951au.m136342a(aVar.mo66610a());
    }

    /* renamed from: a */
    public static void m73354a(View view, Activity activity, BaseAccountFlowFragment baseAccountFlowFragment, String str) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "enterFrom");
        view.setOnTouchListener(new C34032a(0.5f, 150, null));
        view.setOnClickListener(new C22052a(activity, baseAccountFlowFragment, str));
    }
}
