package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.p280ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p280ss.android.ugc.aweme.commercialize.model.C24995f;
import com.p280ss.android.ugc.aweme.commercialize.model.C25000i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35668f;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ag */
public final class C25226ag {

    /* renamed from: a */
    public static final C25226ag f66552a = new C25226ag();

    private C25226ag() {
    }

    /* renamed from: a */
    public static final void m82938a(Context context, User user, String str) {
        String str2;
        boolean z;
        String str3;
        boolean z2;
        if (user != null) {
            C25000i a = CommerceSettingsApi.m80550a();
            if (a != null) {
                str2 = a.f65922f;
            } else {
                str2 = null;
            }
            CharSequence charSequence = str2;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "https://sf3-ttcdn-tos.pstatp.com/obj/ttfe/aweme/fe/avatar/index.html?hide_nav_bar=1";
            }
            Builder appendQueryParameter = Uri.parse(str2).buildUpon().appendQueryParameter("from", str);
            Long b = C24995f.f65904d.mo65425b(user);
            if (b != null) {
                str3 = String.valueOf(b.longValue());
            } else {
                str3 = null;
            }
            CharSequence charSequence2 = str3;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                appendQueryParameter.appendQueryParameter("dec_id", str3);
            }
            appendQueryParameter.appendQueryParameter("author_id", user.getUid());
            C25371n.m83460a(context, appendQueryParameter.toString(), (String) null, true, null);
            C42961az.m136380a(new C35668f());
            C6907h.m21524a("click_setting_decoration", C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("enter_from", str), C7579l.m23633a("author_id", user.getUid())}));
        }
    }
}
