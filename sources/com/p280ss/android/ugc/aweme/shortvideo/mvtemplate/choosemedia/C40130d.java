package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d */
public final class C40130d implements C40128b {

    /* renamed from: a */
    public AVChallenge f104330a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.d$a */
    static final class C40131a<T> implements C23319b<AVChallenge> {

        /* renamed from: a */
        final /* synthetic */ C40130d f104331a;

        C40131a(C40130d dVar) {
            this.f104331a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(AVChallenge aVChallenge) {
            this.f104331a.f104330a = aVChallenge;
        }
    }

    /* renamed from: a */
    public final Bundle mo99884a() {
        if (this.f104330a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("Key_mv_challenge", this.f104330a);
        return bundle;
    }

    /* renamed from: a */
    private final void m128283a(String str) {
        C35563c.f93241d.mo83166a(str, null, 0, 0, new C40131a(this));
    }

    /* renamed from: a */
    public final void mo99885a(Bundle bundle) {
        C7573i.m23587b(bundle, "data");
        String string = bundle.getString("Key_challenge_id");
        C7573i.m23582a((Object) string, "data.getString(MvThemeContants.KEY_CHALLENGE_ID)");
        m128283a(string);
    }
}
