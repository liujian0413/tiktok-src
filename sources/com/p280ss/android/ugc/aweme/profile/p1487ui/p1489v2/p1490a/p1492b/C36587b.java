package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.p1492b;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BindAccountView.C36132a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MTBindAccountView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusAbsProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.C36581a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.a.b.b */
public abstract class C36587b extends C36581a {

    /* renamed from: b */
    private MTBindAccountView f95996b;

    /* renamed from: c */
    private DmtTextView f95997c;

    /* renamed from: d */
    private View f95998d;

    /* renamed from: e */
    private View f95999e;

    /* renamed from: f */
    private View f96000f;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.a.b.b$a */
    public static final class C36588a implements C36132a {

        /* renamed from: a */
        final /* synthetic */ User f96001a;

        /* renamed from: a */
        public final void mo91966a() {
        }

        C36588a(User user) {
            this.f96001a = user;
        }

        /* renamed from: a */
        public final void mo91967a(int i) {
            String str;
            String str2;
            String str3;
            switch (i) {
                case 1:
                    str = "instagram";
                    break;
                case 2:
                    str = "youtube";
                    break;
                case 3:
                    str = "twitter";
                    break;
                default:
                    str = "";
                    break;
            }
            if (!TextUtils.isEmpty(str)) {
                IAccountUserService f = C6861a.m21337f();
                User user = this.f96001a;
                if (user != null) {
                    str2 = user.getUid();
                } else {
                    str2 = null;
                }
                if (f.isMe(str2)) {
                    str3 = "personal_homepage";
                } else {
                    str3 = "others_homepage";
                }
                C6907h.m21524a("click_social_account", (Map) C22984d.m75611a().mo59973a("enter_from", str3).mo59973a("platform", str).f60753a);
            }
        }
    }

    /* renamed from: f */
    public final View mo92812f() {
        return this.f95998d;
    }

    /* renamed from: d */
    public final int mo92810d() {
        if (this.f95998d == null) {
            return 0;
        }
        View view = this.f95998d;
        if (view == null) {
            C7573i.m23580a();
        }
        return view.getHeight();
    }

    /* renamed from: e */
    public final int mo92811e() {
        if (this.f95999e == null) {
            return 0;
        }
        View view = this.f95999e;
        if (view == null) {
            C7573i.m23580a();
        }
        return view.getHeight();
    }

    public C36587b(MusAbsProfileFragment musAbsProfileFragment) {
        C7573i.m23587b(musAbsProfileFragment, "owner");
        super(musAbsProfileFragment);
    }

    /* renamed from: a */
    public final void mo92803a(String str) {
        DmtTextView dmtTextView = this.f95997c;
        if (dmtTextView != null) {
            dmtTextView.setText(str);
        }
    }

    /* renamed from: b */
    public final void mo92808b(boolean z) {
        if (z) {
            View view = this.f96000f;
            if (view != null) {
                view.setVisibility(0);
            }
            return;
        }
        View view2 = this.f96000f;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo92801a(View view) {
        MTBindAccountView mTBindAccountView;
        DmtTextView dmtTextView;
        View view2;
        View view3;
        View view4 = null;
        if (view != null) {
            mTBindAccountView = (MTBindAccountView) view.findViewById(R.id.mf);
        } else {
            mTBindAccountView = null;
        }
        this.f95996b = mTBindAccountView;
        if (view != null) {
            dmtTextView = (DmtTextView) view.findViewById(R.id.e9m);
        } else {
            dmtTextView = null;
        }
        this.f95997c = dmtTextView;
        if (view != null) {
            view2 = view.findViewById(R.id.bri);
        } else {
            view2 = null;
        }
        this.f95998d = view2;
        if (view != null) {
            view3 = view.findViewById(R.id.cul);
        } else {
            view3 = null;
        }
        this.f95999e = view3;
        if (view != null) {
            view4 = view.findViewById(R.id.ads);
        }
        this.f96000f = view4;
    }

    /* renamed from: a */
    public final void mo92805a(boolean z, User user) {
        if (user != null) {
            if (!z) {
                MTBindAccountView mTBindAccountView = this.f95996b;
                if (mTBindAccountView != null) {
                    mTBindAccountView.setVisibility(0);
                }
                MTBindAccountView mTBindAccountView2 = this.f95996b;
                if (mTBindAccountView2 != null) {
                    mTBindAccountView2.mo91960a(user);
                }
                MTBindAccountView mTBindAccountView3 = this.f95996b;
                if (mTBindAccountView3 != null) {
                    mTBindAccountView3.setEventListener(new C36588a(user));
                }
            } else {
                MTBindAccountView mTBindAccountView4 = this.f95996b;
                if (mTBindAccountView4 != null) {
                    mTBindAccountView4.setVisibility(8);
                }
            }
        }
    }
}
