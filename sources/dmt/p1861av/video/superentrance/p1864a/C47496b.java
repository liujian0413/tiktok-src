package dmt.p1861av.video.superentrance.p1864a;

import android.view.View;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: dmt.av.video.superentrance.a.b */
public final class C47496b {

    /* renamed from: dmt.av.video.superentrance.a.b$a */
    public static final class C47497a extends C42939as {

        /* renamed from: a */
        final /* synthetic */ C7561a f121944a;

        C47497a(C7561a aVar) {
            this.f121944a = aVar;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            this.f121944a.invoke();
        }
    }

    /* renamed from: a */
    public static final void m148233a(View view, C7561a<C7581n> aVar) {
        C7573i.m23587b(view, "$this$setDebounceOnClickListener");
        C7573i.m23587b(aVar, "run");
        view.setOnClickListener(new C47497a(aVar));
    }
}
