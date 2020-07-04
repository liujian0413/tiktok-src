package com.p280ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import android.support.p022v4.p027os.C0879b;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f */
public abstract class C39825f {

    /* renamed from: a */
    protected int f103509a;

    /* renamed from: b */
    protected int f103510b;

    /* renamed from: c */
    public String f103511c;

    /* renamed from: a */
    public abstract C18253l<VideoCreation> mo88202a(Object obj, SynthetiseResult synthetiseResult);

    /* renamed from: a */
    public abstract C18253l<? extends C38455ap> mo88203a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult);

    /* renamed from: a */
    public abstract C39359dv<SynthetiseResult> mo88204a(Object obj);

    /* renamed from: a */
    public abstract C39359dv<VideoCreation> mo88205a(Object obj, VideoCreation videoCreation);

    /* renamed from: a */
    public abstract void mo88206a();

    /* renamed from: b */
    public abstract long mo88207b(Object obj);

    /* renamed from: c */
    public Bitmap mo88209c(Object obj) {
        return null;
    }

    /* renamed from: d */
    public boolean mo88492d(Object obj) {
        return false;
    }

    public C39825f(int i, int i2) {
        this.f103509a = i;
        this.f103510b = i2;
    }

    /* renamed from: a */
    public C39359dv<SynthetiseResult> mo96357a(Object obj, C0879b bVar, boolean z) {
        return mo88204a(obj);
    }
}
