package com.p280ss.android.ugc.aweme.tools.beauty.manager;

import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategoryGender;
import com.p280ss.android.ugc.aweme.beauty.C23532c;
import com.p280ss.android.ugc.aweme.beauty.C23534e;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.C23539i;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.p280ss.android.ugc.aweme.tools.beauty.C42182f;
import com.p280ss.android.ugc.aweme.utils.C43074dw;
import com.p280ss.android.ugc.aweme.utils.C43107es;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.a */
public final class C42189a implements C23539i {

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.a$a */
    static final class C42190a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23532c f109759a;

        C42190a(C23532c cVar) {
            this.f109759a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m134222a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m134222a() {
            C23532c cVar = this.f109759a;
            if (C42194c.m134245c() >= 3) {
                cVar = C23532c.m77289a(BeautyCategoryGender.FEMALE, this.f109759a.f62109b, this.f109759a.f62110c, this.f109759a.f62111d, this.f109759a.f62112e);
            }
            C42212g.m134300a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo61323a() {
        C42201d.m134266a();
    }

    /* renamed from: b */
    public final C43074dw<List<ComposerInfo>> mo61327b() {
        return C42212g.m134308b();
    }

    /* renamed from: c */
    public final C43074dw<List<ComposerInfo>> mo61328c() {
        return C42212g.m134319d();
    }

    /* renamed from: e */
    public final BeautyCategoryGender mo61330e() {
        return C42212g.m134316c().f62108a;
    }

    /* renamed from: f */
    public final ComposerBeautyBuriedInfo mo61331f() {
        return C42209f.m134280b();
    }

    /* renamed from: d */
    public final boolean mo61329d() {
        if (C42194c.m134245c() < 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo61324a(AppCompatActivity appCompatActivity) {
        C7573i.m23587b(appCompatActivity, "activity");
        C42182f.m134202a(appCompatActivity);
    }

    /* renamed from: a */
    public final void mo61325a(C23532c cVar) {
        C7573i.m23587b(cVar, "gender");
        if (C23536f.m77298a()) {
            C43107es.m136728a(0, new C42190a(cVar));
        }
    }

    /* renamed from: a */
    public final void mo61326a(C23534e eVar, boolean z) {
        C7573i.m23587b(eVar, "beautySequence");
        if (z) {
            C42209f.m134278a(eVar);
        } else {
            C42209f.m134281b(eVar);
        }
    }
}
