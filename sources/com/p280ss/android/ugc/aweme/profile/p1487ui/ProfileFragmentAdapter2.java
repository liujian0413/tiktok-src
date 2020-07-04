package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.p280ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43105eq;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter2 */
public class ProfileFragmentAdapter2<T extends AmeBaseFragment> extends FragmentPagerAdapter {

    /* renamed from: a */
    boolean f95155a;

    /* renamed from: b */
    String f95156b;

    /* renamed from: c */
    public int f95157c;

    /* renamed from: d */
    private int f95158d;

    /* renamed from: a */
    private int m117214a() {
        if (m117215b()) {
            return 0;
        }
        return -1;
    }

    /* renamed from: b */
    private static boolean m117215b() {
        if (!C7213d.m22500a().mo18778ap()) {
            return true;
        }
        return false;
    }

    public int getCount() {
        int i;
        if (this.f95155a) {
            i = m117214a() + 4;
        } else {
            i = m117214a() + 3;
        }
        if (this.f95158d != i) {
            this.f95158d = i;
            notifyDataSetChanged();
        }
        return this.f95158d;
    }

    /* renamed from: c */
    private String m117216c(int i) {
        return C43105eq.m136725a((int) mo2424b(i));
    }

    /* renamed from: b */
    public final long mo2424b(int i) {
        if (this.f95155a) {
            if (i == 0) {
                return 3;
            }
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                C7213d.m22500a();
                if (C7213d.m22502aq()) {
                    return 8;
                }
                return 5;
            } else if (i == 3) {
                return 1;
            }
        } else if (i == 0) {
            return 0;
        } else {
            if (i == 1) {
                C7213d.m22500a();
                if (C7213d.m22502aq()) {
                    return 8;
                }
                return 5;
            } else if (i == 2) {
                return 1;
            }
        }
        return 0;
    }

    public int getItemPosition(Object obj) {
        int i = -2;
        if ((obj instanceof OriginMusicListFragment) && this.f95155a) {
            i = 0;
        }
        if (!(obj instanceof C36340al)) {
            return i;
        }
        if (this.f95155a) {
            if (((C36340al) obj).mo90851w() == 0) {
                return 1;
            }
            return m117214a() + 3;
        } else if (((C36340al) obj).mo90851w() == 0) {
            return 0;
        } else {
            return m117214a() + 2;
        }
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i == 0) {
            if (this.f95155a) {
                OriginMusicListFragment a = OriginMusicListFragment.m108624a("", false);
                a.mo92306h(m117216c(i));
                return a;
            }
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            String str = this.f95156b;
            String str2 = "";
            if (this.f95157c == i) {
                z4 = true;
            } else {
                z4 = false;
            }
            ProfileListFragment profileListFragment = (ProfileListFragment) iBridgeService.createAwemeListFragment(-1, 0, str, str2, false, z4);
            profileListFragment.mo92306h(m117216c(i));
            return profileListFragment;
        } else if (i == 1) {
            if (this.f95155a) {
                IBridgeService iBridgeService2 = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                String str3 = this.f95156b;
                String str4 = "";
                if (this.f95157c == i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ProfileListFragment profileListFragment2 = (ProfileListFragment) iBridgeService2.createAwemeListFragment(-1, 0, str3, str4, false, z3);
                profileListFragment2.mo92306h(m117216c(i));
                return profileListFragment2;
            }
            UserStateFragment a2 = UserStateFragment.m110246a("others_homepage", this.f95156b, "");
            a2.mo92306h(m117216c(i));
            return a2;
        } else if (i == 2) {
            if (this.f95155a) {
                UserStateFragment a3 = UserStateFragment.m110246a("others_homepage", this.f95156b, "");
                a3.mo92306h(m117216c(i));
                return a3;
            } else if (!m117215b()) {
                return null;
            } else {
                IBridgeService iBridgeService3 = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                String str5 = this.f95156b;
                String str6 = "";
                if (this.f95157c == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ProfileListFragment profileListFragment3 = (ProfileListFragment) iBridgeService3.createAwemeListFragment(-1, 1, str5, str6, false, z2);
                profileListFragment3.mo92306h(m117216c(i));
                return profileListFragment3;
            }
        } else if (i != 3 || !m117215b()) {
            return null;
        } else {
            IBridgeService iBridgeService4 = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            String str7 = this.f95156b;
            String str8 = "";
            if (this.f95157c == i) {
                z = true;
            } else {
                z = false;
            }
            ProfileListFragment profileListFragment4 = (ProfileListFragment) iBridgeService4.createAwemeListFragment(-1, 1, str7, str8, false, z);
            profileListFragment4.mo92306h(m117216c(i));
            return profileListFragment4;
        }
    }
}
