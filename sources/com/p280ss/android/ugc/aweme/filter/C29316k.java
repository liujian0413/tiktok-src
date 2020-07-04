package com.p280ss.android.ugc.aweme.filter;

import android.app.Activity;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.ugc.aweme.account.C21164d.C21165a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.k */
public final class C29316k {

    /* renamed from: com.ss.android.ugc.aweme.filter.k$a */
    public static final class C29317a implements C21165a {
        C29317a() {
        }

        /* renamed from: b */
        public final void mo57094b() {
        }

        /* renamed from: a */
        public final void mo57093a() {
            C29341z.m96258a(true);
        }
    }

    /* renamed from: a */
    public static final String m96160a(AppCompatActivity appCompatActivity) {
        C7573i.m23587b(appCompatActivity, "activity");
        String string = appCompatActivity.getResources().getString(R.string.o5);
        C7573i.m23582a((Object) string, "activity.resources.getSt…g(R.string.av_filter_box)");
        return string;
    }

    /* renamed from: b */
    public static final boolean m96161b(AppCompatActivity appCompatActivity) {
        C7573i.m23587b(appCompatActivity, "activity");
        if (C35574k.m114859a().mo70073G().mo57090c()) {
            return false;
        }
        C35574k.m114859a().mo70073G().mo57085a((Activity) appCompatActivity, "", "", (Bundle) null, (C21165a) new C29317a());
        return true;
    }
}
