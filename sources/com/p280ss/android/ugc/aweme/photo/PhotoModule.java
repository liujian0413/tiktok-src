package com.p280ss.android.ugc.aweme.photo;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.Bitmap.CompressFormat;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.photo.PhotoModule */
public class PhotoModule implements C0042h {

    /* renamed from: c */
    private static final int[] f90527c = {720, 1280};

    /* renamed from: a */
    public C34724a f90528a;

    /* renamed from: b */
    boolean f90529b;

    /* renamed from: d */
    private final AbsActivity f90530d;

    /* renamed from: e */
    private final C20676a f90531e;

    /* renamed from: f */
    private final C34791s f90532f = new C34729c();

    /* renamed from: g */
    private C41654d f90533g;

    /* renamed from: com.ss.android.ugc.aweme.photo.PhotoModule$a */
    public interface C34724a {
        /* renamed from: a */
        void mo88156a(String str);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void dismissDialog() {
        if (this.f90533g != null && this.f90533g.isShowing()) {
            this.f90533g.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo88153a() {
        if (!this.f90529b) {
            this.f90529b = true;
            ((C34729c) this.f90532f).f90540a = CompressFormat.PNG;
            String a = this.f90532f.mo88162a();
            this.f90533g = C41654d.m132586b(this.f90530d, "");
            this.f90533g.setIndeterminate(true);
            this.f90531e.mo55887a(a, f90527c[0], f90527c[1], (C7562b<? super Integer, C7581n>) new C34789q<Object,C7581n>(this, a));
        }
    }

    /* renamed from: a */
    public static boolean m112050a(String str) {
        if (!C34758j.m112135a(str) || C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C7581n mo88154b(String str) throws Exception {
        this.f90533g.dismiss();
        this.f90528a.mo88156a(str);
        this.f90529b = false;
        return C7581n.f20898a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo88152a(String str, Integer num) {
        C1592h.m7855a((Callable<TResult>) new C34790r<TResult>(this, str), C1592h.f5958b);
        return C7581n.f20898a;
    }

    public PhotoModule(AbsActivity absActivity, C20676a aVar, C34724a aVar2) {
        this.f90530d = absActivity;
        this.f90531e = aVar;
        this.f90528a = aVar2;
        absActivity.getLifecycle().mo55a(this);
    }
}
