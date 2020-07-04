package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.tools.C42142ai;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.utils.C43041d;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ba */
public final class C38506ba implements C42161ba {

    /* renamed from: a */
    FragmentActivity f100106a;

    /* renamed from: b */
    public C38509a f100107b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ba$a */
    public interface C38509a {
        /* renamed from: a */
        boolean mo96476a();
    }

    private C38506ba(FragmentActivity fragmentActivity) {
        this.f100106a = fragmentActivity;
    }

    public C38506ba(FragmentActivity fragmentActivity, C38509a aVar) {
        this(fragmentActivity);
        this.f100107b = aVar;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42142ai.class) {
            return null;
        }
        return new C42159az<T>() {

            /* renamed from: a */
            Handler f100108a = new Handler(Looper.getMainLooper());

            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                C385081 r2 = new Runnable() {
                    public final void run() {
                        if (C43041d.m136567a((Activity) C38506ba.this.f100106a)) {
                            if (C38506ba.this.f100107b == null || C38506ba.this.f100107b.mo96476a()) {
                                ((RecordControlViewModel) C36113b.m116288a(C38506ba.this.f100106a).mo91871a(RecordControlViewModel.class)).mo106953a(true);
                            }
                        }
                    }
                };
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    r2.run();
                } else {
                    this.f100108a.post(r2);
                }
            }
        };
    }
}
