package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.api.UsedPhoneApi;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UsedPhoneConfirmFragment */
public final class UsedPhoneConfirmFragment extends AmeBaseFragment {

    /* renamed from: e */
    private HashMap f95275e;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UsedPhoneConfirmFragment$a */
    static final /* synthetic */ class C36305a extends FunctionReference implements C7562b<View, C7581n> {
        C36305a(UsedPhoneConfirmFragment usedPhoneConfirmFragment) {
            super(1, usedPhoneConfirmFragment);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(UsedPhoneConfirmFragment.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117351a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117351a(View view) {
            C7573i.m23587b(view, "p1");
            ((UsedPhoneConfirmFragment) this.receiver).mo92360a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UsedPhoneConfirmFragment$b */
    static final /* synthetic */ class C36306b extends FunctionReference implements C7562b<View, C7581n> {
        C36306b(UsedPhoneConfirmFragment usedPhoneConfirmFragment) {
            super(1, usedPhoneConfirmFragment);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(UsedPhoneConfirmFragment.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117352a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117352a(View view) {
            C7573i.m23587b(view, "p1");
            ((UsedPhoneConfirmFragment) this.receiver).mo92360a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.UsedPhoneConfirmFragment$c */
    static final /* synthetic */ class C36307c extends FunctionReference implements C7562b<View, C7581n> {
        C36307c(UsedPhoneConfirmFragment usedPhoneConfirmFragment) {
            super(1, usedPhoneConfirmFragment);
        }

        public final String getName() {
            return "onClick";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(UsedPhoneConfirmFragment.class);
        }

        public final String getSignature() {
            return "onClick(Landroid/view/View;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m117353a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m117353a(View view) {
            C7573i.m23587b(view, "p1");
            ((UsedPhoneConfirmFragment) this.receiver).mo92360a(view);
        }
    }

    /* renamed from: a */
    private View m117348a(int i) {
        if (this.f95275e == null) {
            this.f95275e = new HashMap();
        }
        View view = (View) this.f95275e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f95275e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    private void m117349a() {
        if (this.f95275e != null) {
            this.f95275e.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m117349a();
    }

    /* renamed from: a */
    public final void mo92360a(View view) {
        int id = view.getId();
        if (id == R.id.jo) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } else if (id == R.id.a10) {
            ((UsedPhoneApi) new RetrofitFactory().createBuilder(C19223b.f51890e).mo26430a().mo26435a(UsedPhoneApi.class)).usedPhoneConfirm(true).mo19128a();
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.onBackPressed();
            }
            C6907h.m21524a("secondhand_keep_click", (Map) C22984d.m75611a().mo59973a("enter_from", "secondhand_confirm_page").f60753a);
        } else if (id == R.id.sp) {
            ((UsedPhoneApi) new RetrofitFactory().createBuilder(C19223b.f51890e).mo26430a().mo26435a(UsedPhoneApi.class)).usedPhoneConfirm(false).mo19128a();
            C6861a.m21332a().bindService().modifyMobile(getActivity(), "", null, null);
            FragmentActivity activity3 = getActivity();
            if (activity3 != null) {
                activity3.onBackPressed();
            }
            C6907h.m21524a("secondhand_change_click", (Map) C22984d.m75611a().mo59973a("enter_from", "secondhand_confirm_page").f60753a);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
        String bindPhone = curUser.getBindPhone();
        C7573i.m23582a((Object) bindPhone, "phoneNumber");
        if (C7634n.m23721b(bindPhone, "+", false)) {
            CommonItemView commonItemView = (CommonItemView) m117348a((int) R.id.a3w);
            C7573i.m23582a((Object) commonItemView, "country_or_region");
            commonItemView.setVisibility(8);
        } else {
            CommonItemView commonItemView2 = (CommonItemView) m117348a((int) R.id.a3w);
            C7573i.m23582a((Object) commonItemView2, "country_or_region");
            commonItemView2.setVisibility(0);
            CommonItemView commonItemView3 = (CommonItemView) m117348a((int) R.id.a3w);
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.d5s));
            sb.append('/');
            sb.append(getString(R.string.d5n));
            commonItemView3.setLeftText(sb.toString());
        }
        ((CommonItemView) m117348a((int) R.id.cb5)).setRightText(bindPhone);
        View findViewById = view.findViewById(R.id.jo);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C36455ej(new C36305a(this)));
        }
        UsedPhoneConfirmFragment usedPhoneConfirmFragment = this;
        ((DmtTextView) m117348a((int) R.id.a10)).setOnClickListener(new C36455ej(new C36306b(usedPhoneConfirmFragment)));
        ((DmtTextView) m117348a((int) R.id.sp)).setOnClickListener(new C36455ej(new C36307c(usedPhoneConfirmFragment)));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.ro, viewGroup, false);
        if (inflate == null) {
            C7573i.m23580a();
        }
        return inflate;
    }
}
