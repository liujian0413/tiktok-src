package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.common.C10775d;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.widget.C13031a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.commerce.service.p1107ab.ProfileEcommerceEntranceAB;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25250au;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C25763a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.p1052b.C23147b;
import com.p280ss.android.ugc.aweme.profile.experiment.ProfileRecommendUserWhenEmpty;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36481a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.presenter.C36041o;
import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment */
public abstract class BaseProfileFragment extends TempBaseProfileFragment implements C0935e, OnClickListener, C25763a, C36041o {

    /* renamed from: y */
    protected static final String f94515y;

    /* renamed from: A */
    protected List<Integer> f94516A;

    /* renamed from: B */
    protected int f94517B;

    /* renamed from: C */
    protected int f94518C;

    /* renamed from: D */
    protected TextView f94519D;

    /* renamed from: E */
    protected TextView f94520E;

    /* renamed from: F */
    protected TextView f94521F;

    /* renamed from: G */
    protected TextView f94522G;

    /* renamed from: H */
    protected TranslationStatusView f94523H;

    /* renamed from: J */
    protected View f94524J;

    /* renamed from: K */
    public TextView f94525K;

    /* renamed from: L */
    C36481a f94526L;

    /* renamed from: M */
    protected String f94527M;

    /* renamed from: N */
    protected int f94528N;

    /* renamed from: O */
    protected int f94529O;

    /* renamed from: P */
    protected String f94530P;

    /* renamed from: Q */
    public User f94531Q;

    /* renamed from: R */
    protected C36436dw f94532R;

    /* renamed from: S */
    protected int f94533S;

    /* renamed from: T */
    protected DataCenter f94534T;

    /* renamed from: U */
    protected ProfileViewModel f94535U;

    /* renamed from: V */
    protected C13031a f94536V;

    /* renamed from: e */
    private ViewGroup f94537e;

    /* renamed from: f */
    private ViewGroup f94538f;

    /* renamed from: g */
    private ViewGroup f94539g;
    public DampScrollableLayout mScrollableLayout;
    public View mStatusView;
    public TextView mTitle;

    /* renamed from: z */
    public List<ProfileListFragment> f94540z;

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo91936A();

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract void mo91937B();

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract void mo91938D();

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract int mo91939E();

    /* renamed from: Y_ */
    public boolean mo16933Y_() {
        return true;
    }

    /* renamed from: b */
    public void mo91709b(boolean z) {
    }

    /* renamed from: b */
    public void mo91710b(boolean z, boolean z2, boolean z3) {
    }

    /* renamed from: c */
    public void mo91712c(User user) {
    }

    /* renamed from: d */
    public void mo91717d(User user) {
    }

    /* renamed from: e */
    public void mo91720e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo91925h(User user);

    /* renamed from: i */
    public abstract void mo91877i();

    /* renamed from: k */
    public List<Integer> mo91879k() {
        return this.f94516A;
    }

    /* renamed from: k */
    public void mo91947k(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo91949l(int i);

    public void onPageScrollStateChanged(int i) {
    }

    /* renamed from: y */
    public boolean mo91957y() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract int mo91958z();

    /* renamed from: a */
    public void mo91702a(User user) {
        if (isViewValid()) {
            mo91950l(user);
            this.f94531Q = user;
            this.f94535U.mo93194a(user);
        }
    }

    /* renamed from: a */
    public void mo91700a(long j) {
        if (!mo91878j() && isViewValid()) {
            this.f94530P = C30537o.m99738a(j);
            this.f94521F.setText(this.f94530P);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91942a(ProfileListFragment profileListFragment, Integer num) {
        if (this.f94516A.contains(num)) {
            int indexOf = this.f94516A.indexOf(num);
            this.f94540z.remove(indexOf);
            this.f94516A.remove(indexOf);
        }
        this.f94540z.add(profileListFragment);
        this.f94516A.add(num);
    }

    /* renamed from: a */
    private void mo91872a() {
        this.mScrollableLayout.setMinY(0);
    }

    /* renamed from: f */
    public final boolean mo91726f() {
        return isViewValid();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo91955w() {
        if (this.f94523H != null) {
            this.f94523H.mo104219c();
        }
    }

    static {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.czl);
        sb.append(":");
        f94515y = sb.toString();
    }

    /* renamed from: j */
    private static boolean mo91878j() {
        if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
            return false;
        }
        if (!C6399b.m19944t() || C6399b.m19947w()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final C13031a mo91954v() {
        if (this.f94536V == null && getView() != null) {
            this.f94536V = C13031a.f34476e.mo31608a(this, getView());
        }
        return this.f94536V;
    }

    /* renamed from: x */
    public final void mo91956x() {
        this.mScrollableLayout.setMinY((int) (-C9738o.m28708b(getContext(), 300.0f)));
    }

    /* renamed from: F */
    public final void mo91940F() {
        if (this.f94519D != null) {
            this.f94519D.setText("-");
        }
        if (this.f94520E != null) {
            this.f94520E.setText("-");
        }
        if (this.f94521F != null) {
            this.f94521F.setText("-");
        }
        this.f94530P = "0";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo91875g() {
        this.mScrollableLayout.setLayoutParams(new LayoutParams(-1, -2));
        mo91877i();
        mo91940F();
        mo91711c(0);
        mo91716d(0);
        mo91708b((String) null);
        mo91713c("");
    }

    public void setUser(User user) {
        this.f94531Q = user;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91873a(View view) {
        this.mScrollableLayout.setOnScrollListener(this);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f94535U = ProfileViewModel.m118573a((Fragment) this);
    }

    /* renamed from: a */
    private void mo92047a(Bundle bundle) {
        if (bundle != null) {
            this.f94528N = bundle.getInt("profile_cur_pos", 0);
            this.f94529O = bundle.getInt("indicator_scroll_maxx", 0);
        }
    }

    /* renamed from: o */
    private static boolean mo92127o(User user) {
        if (user == null || user.getTabSetting() == null || !user.getTabSetting().isHideLikeTab()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo91705b(int i) {
        if (!mo91878j() && isViewValid()) {
            if (i < 0) {
                i = 0;
            }
            this.f94517B = i;
            this.f94519D.setText(C30537o.m99738a((long) i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo91945d(View view) {
        if (!mo91878j()) {
            this.f94538f.setOnClickListener(this);
            this.f94537e.setOnClickListener(this);
            this.f94539g.setOnClickListener(this);
        }
    }

    /* renamed from: l */
    public final void mo91950l(User user) {
        if (C43122ff.m136783n(user) || C6399b.m19946v() || ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
            mo91872a();
        } else {
            mo91956x();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("profile_cur_pos", this.f94528N);
        bundle.putInt("indicator_scroll_maxx", this.f94529O);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    private static List<Integer> mo61681a(String str) {
        if (TextUtils.equals(str, C21115b.m71197a().getCurUserId())) {
            return new ArrayList(C23060u.m75742a().mo60069am().mo59877d());
        }
        return new ArrayList(C23060u.m75742a().mo60070an().mo59877d());
    }

    /* renamed from: f */
    private List<Integer> mo92117f(String str) {
        List<Integer> a = mo61681a(str);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (!m116480a(str, ((Integer) it.next()).intValue())) {
                it.remove();
            }
        }
        return a;
    }

    /* renamed from: i */
    private List<Integer> mo92055i(User user) {
        List<Integer> a = mo61681a(user.getUid());
        m116479a(a, user);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (!mo91943b(user, ((Integer) it.next()).intValue())) {
                it.remove();
            }
        }
        if (ProfileRecommendUserWhenEmpty.isRecommendUserMode(user)) {
            a.clear();
            a.add(Integer.valueOf(8));
        }
        return a;
    }

    /* renamed from: j */
    private static boolean mo91926j(User user) {
        if (user == null || user.getTabSetting() == null || user.getTabSetting().getBrandTab() == null || !user.getTabSetting().getBrandTab().isShowBrandTab()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static boolean mo92059n(User user) {
        if (user == null || user.getTabSetting() == null || user.getTabSetting().getAggregationTab() == null || !user.getTabSetting().getAggregationTab().isShowTab()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo91707b(Exception exc) {
        if (C6399b.m19944t() && (exc instanceof ApiServerException)) {
            ApiServerException apiServerException = (ApiServerException) exc;
            int errorCode = apiServerException.getErrorCode();
            if (!TextUtils.isEmpty(apiServerException.getErrorMsg()) && getContext() != null && errorCode != 3070 && errorCode != 3071 && errorCode != 3072) {
                C10761a.m31403c(getContext(), apiServerException.getErrorMsg()).mo25750a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo91946e(String str) {
        List<Integer> f = mo92117f(str);
        this.f94540z = new ArrayList(f.size());
        this.f94516A = new ArrayList(f.size());
        for (Integer intValue : f) {
            mo91949l(intValue.intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo91948k(User user) {
        if (!mo91878j() && C6399b.m19944t()) {
            if (this.f94532R == null) {
                this.f94532R = new C36436dw(getContext(), this.f94523H, this.f94522G);
            }
            this.f94532R.mo92511a(user);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f94527M = arguments.getString("from");
            this.f94535U.mo93195a(this.f94527M);
        }
        this.f94534T = DataCenter.m75849a(C0069x.m157a((Fragment) this), (C0043i) this);
    }

    @C7709l
    public void onNeedScrollToTop(C36435dv dvVar) {
        boolean z;
        if (this.f94531Q == null || !C21115b.m71197a().isLogin() || !C43122ff.m136787r(this.f94531Q)) {
            z = false;
        } else {
            z = true;
        }
        if (this.mScrollableLayout != null && z == dvVar.f95595a) {
            this.mScrollableLayout.mo66849d();
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f94540z != null && this.f94528N >= 0 && this.f94528N < this.f94540z.size()) {
            ProfileListFragment profileListFragment = (ProfileListFragment) this.f94540z.get(this.f94528N);
            if (profileListFragment != null) {
                profileListFragment.setUserVisibleHint(z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo91944c(View view) {
        if (!mo91878j()) {
            this.f94519D = (TextView) view.findViewById(R.id.ao9);
            this.f94520E = (TextView) view.findViewById(R.id.ao4);
            this.f94539g = (ViewGroup) view.findViewById(R.id.abf);
            this.f94521F = (TextView) view.findViewById(R.id.a87);
            this.f94522G = (TextView) view.findViewById(R.id.e_2);
            this.f94523H = (TranslationStatusView) view.findViewById(R.id.dnl);
            this.f94538f = (ViewGroup) view.findViewById(R.id.ao6);
            this.f94537e = (ViewGroup) view.findViewById(R.id.aoa);
            this.f94524J = view.findViewById(R.id.ckd);
            this.f94525K = (TextView) view.findViewById(R.id.e9_);
            mo91955w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo91951m(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                C7213d.m22500a();
                if (!C7213d.m22502aq() || !C43122ff.m136787r(this.f94531Q)) {
                    return 5;
                }
                return 8;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 7;
            case 7:
                return 10;
            case 8:
                return 13;
            case 9:
                return 12;
            default:
                return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo91952m(User user) {
        List<Integer> i = mo92055i(user);
        ArrayList arrayList = new ArrayList();
        if (this.f94540z == null) {
            this.f94540z = new ArrayList(i.size());
        } else {
            arrayList.addAll(this.f94540z);
            this.f94540z.clear();
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.f94516A == null) {
            this.f94516A = new ArrayList(i.size());
        } else {
            arrayList2.addAll(this.f94516A);
            this.f94516A.clear();
        }
        for (Integer num : i) {
            if (arrayList2.contains(Integer.valueOf(mo91951m(num.intValue())))) {
                int indexOf = arrayList2.indexOf(Integer.valueOf(mo91951m(num.intValue())));
                mo91942a((ProfileListFragment) arrayList.get(indexOf), (Integer) arrayList2.get(indexOf));
            } else {
                mo91949l(num.intValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ProfileListFragment mo91941a(Integer num) {
        if (this.f94540z == null || this.f94516A == null) {
            return null;
        }
        int indexOf = this.f94516A.indexOf(num);
        if (indexOf == -1) {
            return null;
        }
        return (ProfileListFragment) this.f94540z.get(indexOf);
    }

    /* renamed from: a */
    public void mo91697a(int i) {
        if (!mo91878j() && isViewValid()) {
            if (i < 0) {
                i = 0;
            }
            this.f94518C = i;
            this.f94520E.setText(C30537o.m99738a((long) i));
        }
    }

    /* renamed from: a */
    public void mo91698a(int i, int i2) {
        mo91947k(i);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.f94533S = i;
        mo91873a(view);
        mo91944c(view);
        mo91945d(view);
        mo92047a(bundle);
        mo91875g();
    }

    /* renamed from: a */
    private static void m116479a(List<Integer> list, User user) {
        if (list.contains(Integer.valueOf(5)) && C25250au.m82996a(user)) {
            if (C43122ff.m136787r(user) || !C25250au.m82997a(user.isWithCommerceEntry(), user.isWithFusionShopEntry(), user) || !C25250au.m83000d(user) || C6384b.m19835a().mo15287a(ProfileEcommerceEntranceAB.class, true, "preferred_show_goods_tab", C6384b.m19835a().mo15295d().preferred_show_goods_tab, 1) == 1) {
                list.remove(list.indexOf(Integer.valueOf(5)));
                if (user.getTabSetting().getEnterpriseTab().getTabType() == 2) {
                    list.add(Integer.valueOf(5));
                    return;
                }
                list.add(0, Integer.valueOf(5));
            } else {
                list.remove(list.indexOf(Integer.valueOf(5)));
            }
        }
    }

    /* renamed from: a */
    private static boolean m116480a(String str, int i) {
        if (C6399b.m19946v()) {
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (i == 0) {
            return true;
        } else {
            if (i == 1) {
                return SharePrefCache.inst().isOpenForward();
            }
            if (i != 2 || C7213d.m22500a().mo18778ap()) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo91943b(User user, int i) {
        boolean z;
        if (C6399b.m19946v()) {
            if (i != 3) {
                return m116480a(user.getUid(), i);
            }
            if (user.getShowArtistPlaylist() == 1) {
                return true;
            }
            return false;
        } else if (i == 5) {
            if ((user.getTabSetting() == null || user.getTabSetting().getEnterpriseTab() == null) && !user.isWithCommerceEnterpriseTabEntry()) {
                z = false;
            } else {
                z = true;
            }
            if (C10775d.m31450a().f28891a || user.getCommerceUserLevel() <= 0 || !z) {
                return false;
            }
            return true;
        } else if (i == 7) {
            if (C10775d.m31450a().f28891a || !mo91926j(user)) {
                return false;
            }
            return true;
        } else if (i == 9) {
            if (C10775d.m31450a().f28891a || !mo92059n(user)) {
                return false;
            }
            return true;
        } else if (i == 2) {
            return mo92127o(user);
        } else {
            if (i == 4) {
                if (user.getVerificationType() == 3 || user.isEffectArtist()) {
                    return true;
                }
                return false;
            } else if (i != 3) {
                return m116480a(user.getUid(), i);
            } else {
                if (user.getShowArtistPlaylist() == 1) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: a */
    public void mo91699a(int i, String str) {
        if (mo91878j() || !isViewValid()) {
            return;
        }
        if (!C6399b.m19944t()) {
            this.f94522G.setVisibility(0);
            if (!TextUtils.isEmpty(str)) {
                this.f94522G.setText(str);
            } else if (i == 1 || i == 2) {
                this.f94522G.setText(R.string.duo);
            } else {
                this.f94522G.setVisibility(8);
            }
        } else if (TextUtils.isEmpty(str)) {
            this.f94522G.setText(R.string.dum);
        } else {
            while (str.contains("\n\n")) {
                str = str.replaceAll("\n\n", "\n");
            }
            this.f94522G.setText(str);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f94536V = null;
        return C23147b.f61094a.mo60289a((Activity) getActivity(), mo91958z(), layoutInflater, viewGroup);
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (f != 0.0f) {
            this.f94529O = C9738o.m28691a(getContext()) / 3;
        }
    }
}
