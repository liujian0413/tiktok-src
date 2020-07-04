package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusAbsProfileFragment;
import com.p280ss.android.ugc.aweme.profile.tab.MusProfileNavigator;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.a.a */
public abstract class C36581a {

    /* renamed from: a */
    public final MusAbsProfileFragment f95991a;

    /* renamed from: a */
    public abstract int mo92798a();

    /* renamed from: a */
    public void mo92799a(float f) {
    }

    /* renamed from: a */
    public void mo92800a(FragmentActivity fragmentActivity) {
    }

    /* renamed from: a */
    public void mo92801a(View view) {
    }

    /* renamed from: a */
    public void mo92803a(String str) {
    }

    /* renamed from: a */
    public void mo92804a(boolean z) {
    }

    /* renamed from: a */
    public void mo92805a(boolean z, User user) {
    }

    /* renamed from: b */
    public void mo92806b() {
    }

    /* renamed from: b */
    public void mo92808b(boolean z) {
    }

    /* renamed from: c */
    public void mo92809c() {
    }

    /* renamed from: d */
    public int mo92810d() {
        return 0;
    }

    /* renamed from: e */
    public int mo92811e() {
        return 0;
    }

    /* renamed from: f */
    public View mo92812f() {
        return null;
    }

    public C36581a(MusAbsProfileFragment musAbsProfileFragment) {
        C7573i.m23587b(musAbsProfileFragment, "owner");
        this.f95991a = musAbsProfileFragment;
    }

    /* renamed from: b */
    public final void mo92807b(View view) {
        MusProfileNavigator musProfileNavigator = this.f95991a.f94740l;
        if (musProfileNavigator != null) {
            musProfileNavigator.mo91837a(true);
        }
    }

    /* renamed from: a */
    public void mo92802a(User user, View view, TextView textView) {
        if (user != null) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if ((!f.isLogin() || !C43122ff.m136787r(user) || !TextUtils.isEmpty(user.getBioSecureUrl())) && textView != null) {
                if (VERSION.SDK_INT >= 17) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ays, 0, 0, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ays, 0, 0, 0);
                }
                Context context = this.f95991a.getContext();
                if (context != null) {
                    Resources resources = context.getResources();
                    if (resources != null) {
                        int color = resources.getColor(R.color.ab1);
                        textView.setCompoundDrawablePadding((int) C9738o.m28708b(this.f95991a.getContext(), 4.0f));
                        textView.setTextColor(color);
                    }
                }
            }
        }
    }
}
