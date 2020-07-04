package com.p280ss.android.ugc.aweme.unlogin;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment */
public final class UnloginSignUpFragment extends AmeBaseFragment implements OnClickListener {

    /* renamed from: f */
    public static final C42753a f111081f = new C42753a(null);

    /* renamed from: e */
    public boolean f111082e = true;

    /* renamed from: g */
    private HashMap f111083g;

    /* renamed from: com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment$a */
    public static final class C42753a {
        private C42753a() {
        }

        public /* synthetic */ C42753a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m135697a(String str, String str2) {
            C7573i.m23587b(str, "enterFrom");
            C7573i.m23587b(str2, "enterMethod");
            C6907h.m21524a("enter_signup_login_homepage", (Map) C22984d.m75611a().mo59973a("enter_from", str).mo59973a("enter_method", str2).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment$b */
    static final class C42754b implements C23305g {

        /* renamed from: a */
        final /* synthetic */ UnloginSignUpFragment f111084a;

        C42754b(UnloginSignUpFragment unloginSignUpFragment) {
            this.f111084a = unloginSignUpFragment;
        }

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo58663a() {
            FragmentActivity activity = this.f111084a.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            TabChangeManager.m106432a(activity).mo84574a("HOME");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment$c */
    static final class C42755c implements OnTouchListener {

        /* renamed from: a */
        public static final C42755c f111085a = new C42755c();

        C42755c() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: a */
    private View m135690a(int i) {
        if (this.f111083g == null) {
            this.f111083g = new HashMap();
        }
        View view = (View) this.f111083g.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f111083g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    private void m135695f() {
        if (this.f111083g != null) {
            this.f111083g.clear();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m135695f();
    }

    /* renamed from: a */
    private String m135691a() {
        if (this.f111082e) {
            return "message";
        }
        return "personal_homepage";
    }

    /* renamed from: d */
    private String m135693d() {
        if (this.f111082e) {
            return "click_message";
        }
        return "click_mine";
    }

    /* renamed from: e */
    private void m135694e() {
        OnClickListener onClickListener = this;
        ((DmtTextView) m135690a((int) R.id.rn)).setOnClickListener(onClickListener);
        ((ImageView) m135690a((int) R.id.d43)).setOnClickListener(onClickListener);
    }

    @C7709l
    public final void onEvent(C42757b bVar) {
        C7573i.m23587b(bVar, "ev");
        if (!this.f111082e) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            TabChangeManager.m106432a(activity).mo84574a("HOME");
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null && !C27326a.m89578a(view)) {
            int id = view.getId();
            if (id == R.id.rn) {
                C32656f.m105749a((Fragment) this, m135691a(), m135693d(), (C23305g) new C42754b(this));
                C42753a.m135697a(m135691a(), m135693d());
            } else {
                if (id == R.id.d43) {
                    if (ProfileNewStyleExperiment.INSTANCE.getCOMMOM_M()) {
                        C7195s.m22438a().mo18679a((Activity) getActivity(), C7203u.m22460a("aweme://setting").mo18695a());
                    } else {
                        FragmentActivity activity = getActivity();
                        if (activity == null) {
                            C7573i.m23580a();
                        }
                        C7573i.m23582a((Object) activity, "activity!!");
                        C30246a.m98970a(activity).mo79736f("page_setting");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m135692a(View view) {
        C7573i.m23587b(view, "view");
        if (VERSION.SDK_INT >= 19) {
            View a = m135690a((int) R.id.aq1);
            C7573i.m23582a((Object) a, "gap_status_bar");
            LayoutParams layoutParams = a.getLayoutParams();
            View a2 = m135690a((int) R.id.aq1);
            C7573i.m23582a((Object) a2, "gap_status_bar");
            layoutParams.height = C10994a.m32204a(a2.getContext());
        } else {
            View a3 = m135690a((int) R.id.aq1);
            C7573i.m23582a((Object) a3, "gap_status_bar");
            a3.setVisibility(8);
        }
        if (this.f111082e) {
            DmtTextView dmtTextView = (DmtTextView) m135690a((int) R.id.e3f);
            C7573i.m23582a((Object) dmtTextView, "tv_title");
            dmtTextView.setText(view.getContext().getText(R.string.aci));
            DmtTextView dmtTextView2 = (DmtTextView) m135690a((int) R.id.avh);
            C7573i.m23582a((Object) dmtTextView2, "hint");
            dmtTextView2.setText(view.getContext().getText(R.string.ach));
            ImageView imageView = (ImageView) m135690a((int) R.id.ayn);
            Object service = ServiceManager.get().getService(IBridgeService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…ridgeService::class.java)");
            Integer unloginMessageDrawable = ((IBridgeService) service).getUnloginMessageDrawable();
            C7573i.m23582a((Object) unloginMessageDrawable, "ServiceManager.get().get…a).unloginMessageDrawable");
            imageView.setImageResource(unloginMessageDrawable.intValue());
            return;
        }
        DmtTextView dmtTextView3 = (DmtTextView) m135690a((int) R.id.e3f);
        C7573i.m23582a((Object) dmtTextView3, "tv_title");
        dmtTextView3.setText(view.getContext().getText(R.string.d7z));
        DmtTextView dmtTextView4 = (DmtTextView) m135690a((int) R.id.avh);
        C7573i.m23582a((Object) dmtTextView4, "hint");
        dmtTextView4.setText(view.getContext().getText(R.string.d7y));
        ((ImageView) m135690a((int) R.id.ayn)).setImageResource(R.drawable.b22);
        if (C6399b.m19946v()) {
            ImageView imageView2 = (ImageView) m135690a((int) R.id.d43);
            Object service2 = ServiceManager.get().getService(IBridgeService.class);
            C7573i.m23582a(service2, "ServiceManager.get().get…ridgeService::class.java)");
            Integer unloginProfileMoreImg = ((IBridgeService) service2).getUnloginProfileMoreImg();
            C7573i.m23582a((Object) unloginProfileMoreImg, "ServiceManager.get().get…va).unloginProfileMoreImg");
            imageView2.setImageResource(unloginProfileMoreImg.intValue());
        }
        ImageView imageView3 = (ImageView) m135690a((int) R.id.d43);
        C7573i.m23582a((Object) imageView3, "setting_btn");
        imageView3.setVisibility(0);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(C42755c.f111085a);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("tab");
        } else {
            str = null;
        }
        this.f111082e = TextUtils.equals(str, "UNLOGIN_NOTIFICATION");
        m135692a(view);
        m135694e();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.rn, viewGroup, false);
    }
}
