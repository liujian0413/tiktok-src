package com.p280ss.android.ugc.aweme.shortvideo.scanface;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.util.Pair;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.scanface.b */
public final class C40323b {

    /* renamed from: a */
    public C40326c f104714a;

    /* renamed from: b */
    public C7321c f104715b;

    /* renamed from: c */
    private final int f104716c = 1;

    /* renamed from: d */
    private final int f104717d = 2;

    /* renamed from: e */
    private int f104718e = this.f104716c;

    /* renamed from: f */
    private final C40322a f104719f;

    /* renamed from: b */
    public final void mo100149b() {
        C7321c cVar = this.f104715b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: a */
    public final void mo100146a() {
        if (this.f104718e != this.f104717d) {
            this.f104718e = this.f104717d;
            this.f104714a.mo100150a();
        }
    }

    /* renamed from: a */
    public final void mo100147a(String str) {
        this.f104719f.mo100144a(str);
    }

    /* renamed from: a */
    public final void mo100148a(boolean z, boolean z2) {
        C7321c cVar = this.f104715b;
        if (cVar != null) {
            cVar.dispose();
        }
        if (this.f104718e != this.f104716c) {
            this.f104718e = this.f104716c;
            this.f104714a.mo100152b();
            this.f104719f.mo100145a(z, z2);
        }
    }

    public C40323b(final AbsActivity absActivity, FrameLayout frameLayout, C40322a aVar) {
        C7573i.m23587b(absActivity, "activity");
        C7573i.m23587b(frameLayout, "containerView");
        C7573i.m23587b(aVar, "listener");
        this.f104719f = aVar;
        this.f104714a = new C40326c(frameLayout);
        ((ScanFaceViewModel) C0069x.m159a((FragmentActivity) absActivity).mo147a(ScanFaceViewModel.class)).mo100143a().observe(absActivity, new C0053p<Pair<Integer, String>>(this) {

            /* renamed from: a */
            final /* synthetic */ C40323b f104720a;

            {
                this.f104720a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Pair<Integer, String> pair) {
                if (pair != null) {
                    Integer num = (Integer) pair.first;
                    String str = (String) pair.second;
                    if (num != null && num.intValue() == 7) {
                        C40323b bVar = this.f104720a;
                        C7573i.m23582a((Object) str, "res");
                        bVar.mo100147a(str);
                    } else if (num != null && num.intValue() == 16) {
                        C7321c cVar = this.f104720a.f104715b;
                        if (cVar != null) {
                            cVar.dispose();
                        }
                        this.f104720a.f104715b = C7492s.m23295b(5, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C403241 f104722a;

                            {
                                this.f104722a = r1;
                            }

                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public void accept(Long l) {
                                C10761a.m31392b((Context) absActivity, (int) R.string.bv0, 0).mo25750a();
                                this.f104722a.f104720a.mo100148a(false, false);
                            }
                        });
                    } else if (num != null && num.intValue() == 9) {
                        this.f104720a.mo100148a(true, false);
                    }
                    C40326c cVar2 = this.f104720a.f104714a;
                    C7573i.m23582a((Object) num, "status");
                    cVar2.mo100151a(num.intValue());
                }
            }
        });
    }
}
