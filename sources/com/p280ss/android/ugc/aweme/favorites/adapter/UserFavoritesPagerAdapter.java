package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.ChallengeCollectListFragment;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.MediaMixListFragment;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.MediumCollectionFragment;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.MicroAppCollectionFragment;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.MusicCollectListFragment;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.StickersCollectListFragment;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28504t;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.C36102u;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileFragmentAdapter;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C43105eq;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.UserFavoritesPagerAdapter */
public class UserFavoritesPagerAdapter extends ProfileFragmentAdapter {

    /* renamed from: n */
    private static final String f73148n;

    /* renamed from: a */
    private ArrayList<Fragment> f73149a = new ArrayList<>();

    /* renamed from: d */
    private Context f73150d;

    /* renamed from: e */
    private MediaMixListFragment f73151e;

    /* renamed from: f */
    private C36340al f73152f;

    /* renamed from: g */
    private AmeBaseFragment f73153g;

    /* renamed from: h */
    private AmeBaseFragment f73154h;

    /* renamed from: i */
    private ChallengeCollectListFragment f73155i;

    /* renamed from: j */
    private MusicCollectListFragment f73156j;

    /* renamed from: k */
    private StickersCollectListFragment f73157k;

    /* renamed from: l */
    private MicroAppCollectionFragment f73158l;

    /* renamed from: m */
    private MediumCollectionFragment f73159m;

    /* renamed from: o */
    private List<Integer> f73160o = new ArrayList();

    static {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.edp);
        sb.append(":");
        f73148n = sb.toString();
    }

    /* renamed from: a */
    public final Integer mo71197a() {
        if (this.f73160o == null) {
            return null;
        }
        for (int i = 0; i < this.f73160o.size(); i++) {
            if (((Integer) this.f73160o.get(i)).intValue() == 21) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo71199d(int i) {
        m90929h(i);
        m90930i(i);
    }

    /* renamed from: h */
    private void m90929h(int i) {
        for (int i2 = 0; i2 < getCount(); i2++) {
            if (mo2423a(i2) instanceof ProfileListFragment) {
                ProfileListFragment profileListFragment = (ProfileListFragment) mo2423a(i2);
                if (!(profileListFragment == null || profileListFragment.mFragmentManager == null)) {
                    if (i2 == i) {
                        profileListFragment.setUserVisibleHint(true);
                    } else {
                        profileListFragment.setUserVisibleHint(false);
                    }
                    profileListFragment.aT_();
                }
            }
        }
    }

    /* renamed from: i */
    private void m90930i(int i) {
        if (this.f73149a != null && i >= 0 && i < this.f73149a.size() && (this.f73149a.get(i) instanceof ProfileListFragment)) {
            ProfileListFragment profileListFragment = (ProfileListFragment) this.f73149a.get(i);
            if (profileListFragment != null && profileListFragment.aO_()) {
                profileListFragment.aQ_();
            }
        }
    }

    /* renamed from: c */
    public final void mo71198c(int i) {
        m90929h(i);
        if (this.f73149a != null && i >= 0 && i < this.f73149a.size() && (this.f73149a.get(i) instanceof ProfileListFragment)) {
            ProfileListFragment profileListFragment = (ProfileListFragment) this.f73149a.get(i);
            if (profileListFragment != null) {
                profileListFragment.mo92305g(true);
            }
        }
    }

    public CharSequence getPageTitle(int i) {
        switch (((Integer) this.f73160o.get(i)).intValue()) {
            case 0:
            case 2:
                return this.f73150d.getString(R.string.beo);
            case 1:
            case 3:
                return this.f73150d.getString(R.string.b_e);
            case 8:
                return this.f73150d.getString(R.string.a65);
            case 9:
                return this.f73150d.getString(R.string.cxe);
            case 10:
                return this.f73150d.getString(R.string.a5z);
            case 11:
                return this.f73150d.getString(R.string.a62);
            case 12:
                return this.f73150d.getString(R.string.b6g);
            case 16:
                return this.f73150d.getString(R.string.a5w);
            case 17:
                return this.f73150d.getString(R.string.b_g);
            case 18:
                return this.f73150d.getString(R.string.et);
            case 19:
                return this.f73150d.getString(R.string.bc1);
            case 21:
                return this.f73150d.getString(R.string.c94);
            case 22:
                return this.f73150d.getString(R.string.c9m);
            case 23:
                return "影视综";
            default:
                return "";
        }
    }

    public UserFavoritesPagerAdapter(C0608j jVar, Context context, String str, ArrayList<String> arrayList) {
        super(jVar);
        this.f73150d = context;
        StringBuilder sb = new StringBuilder();
        sb.append(f73148n);
        sb.append(0);
        this.f73152f = (C36340al) jVar.mo2644a(sb.toString());
        if (this.f73152f == null) {
            this.f73152f = C36102u.f94392a.newBasicAwemeListFragment((int) this.f73150d.getResources().getDimension(R.dimen.my), 4, C21115b.m71197a().getCurUserId(), C6861a.m21337f().getCurUser().getSecUid(), false, true);
        }
        this.f73152f.mo90834f(true);
        this.f73152f.mo90832e(true);
        this.f73152f.mo92454h(C43105eq.m136725a(8));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f73148n);
        sb2.append(3);
        this.f73155i = (ChallengeCollectListFragment) jVar.mo2644a(sb2.toString());
        if (this.f73155i == null) {
            this.f73155i = new ChallengeCollectListFragment();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f73148n);
        sb3.append(4);
        this.f73156j = (MusicCollectListFragment) jVar.mo2644a(sb3.toString());
        if (this.f73156j == null) {
            this.f73156j = new MusicCollectListFragment();
        }
        this.f73149a.add((Fragment) this.f73152f);
        this.f73160o.add(Integer.valueOf(8));
        if (C28504t.m93691a()) {
            if (this.f73151e == null) {
                this.f73151e = new MediaMixListFragment();
                this.f73151e.setArguments(C42914ab.m136242a().mo104633a("enter_from", str).mo104632a("mix_push_ids", (Serializable) arrayList).f111445a);
            }
            this.f73149a.add(this.f73151e);
            this.f73160o.add(Integer.valueOf(21));
        }
        if (!C6399b.m19944t()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(f73148n);
            sb4.append(1);
            this.f73153g = (AmeBaseFragment) jVar.mo2644a(sb4.toString());
            if (this.f73153g == null) {
                this.f73153g = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createCollectPoiFragment();
            }
            this.f73149a.add(this.f73153g);
            this.f73160o.add(Integer.valueOf(9));
        }
        if (!C6399b.m19944t()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(f73148n);
            sb5.append(6);
            this.f73158l = (MicroAppCollectionFragment) jVar.mo2644a(sb5.toString());
            if (this.f73158l == null) {
                this.f73158l = new MicroAppCollectionFragment();
            }
            this.f73149a.add(this.f73158l);
            this.f73160o.add(Integer.valueOf(22));
        }
        if (!C6399b.m19944t()) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(f73148n);
            sb6.append(2);
            this.f73154h = (AmeBaseFragment) jVar.mo2644a(sb6.toString());
            if (this.f73154h == null) {
                this.f73154h = C24436a.m80356a().createCollectGoodsFragment();
            }
            this.f73149a.add(this.f73154h);
            this.f73160o.add(Integer.valueOf(19));
        }
        this.f73149a.add(this.f73155i);
        this.f73149a.add(this.f73156j);
        this.f73160o.add(Integer.valueOf(10));
        this.f73160o.add(Integer.valueOf(11));
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().showStickerCollection()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(f73148n);
            sb7.append(5);
            this.f73157k = (StickersCollectListFragment) jVar.mo2644a(sb7.toString());
            if (this.f73157k == null) {
                this.f73157k = new StickersCollectListFragment();
            }
            this.f73149a.add(this.f73157k);
            this.f73160o.add(Integer.valueOf(16));
        }
        if (!C6399b.m19944t()) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(f73148n);
            sb8.append(7);
            this.f73159m = (MediumCollectionFragment) jVar.mo2644a(sb8.toString());
            if (this.f73159m == null) {
                this.f73159m = new MediumCollectionFragment();
            }
            this.f73149a.add(this.f73159m);
            this.f73160o.add(Integer.valueOf(23));
        }
        mo92301a(this.f73149a, this.f73160o);
    }
}
