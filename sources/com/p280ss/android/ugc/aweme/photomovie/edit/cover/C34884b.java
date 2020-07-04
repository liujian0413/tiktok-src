package com.p280ss.android.ugc.aweme.photomovie.edit.cover;

import android.graphics.Bitmap;
import android.net.Uri;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.photo.C34731e;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c.C38633a;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.cover.b */
public final class C34884b implements C38632c {

    /* renamed from: a */
    public List<String> f90980a;

    /* renamed from: b */
    private C34882a f90981b;

    /* renamed from: a */
    public final int mo88418a() {
        return 7;
    }

    /* renamed from: a */
    public static Uri m112456a(String str) {
        return Uri.parse(Uri.fromFile(new File(str)).toString());
    }

    C34884b(List<String> list, C34882a aVar) {
        this.f90980a = list;
        this.f90981b = aVar;
    }

    /* renamed from: a */
    private int m112455a(int i, int i2) {
        return this.f90981b.mo88417a(this.f90980a.size(), (((float) i) * 1.0f) / ((float) i2));
    }

    /* renamed from: a */
    public final void mo88419a(int i, int i2, C38633a aVar) {
        int a = mo88418a();
        for (int i3 = 0; i3 < a; i3++) {
            m112457a(i3, i, i2, aVar);
        }
    }

    /* renamed from: a */
    private void m112457a(int i, int i2, int i3, C38633a aVar) {
        final int a = m112455a(i, mo88418a());
        final int i4 = i2;
        final int i5 = i3;
        final C38633a aVar2 = aVar;
        final int i6 = i;
        C348851 r1 = new Runnable() {
            public final void run() {
                C23323e.m76501a(C34731e.m112065a(C34884b.m112456a((String) C34884b.this.f90980a.get(a))), i4, i5, (C23319b<Bitmap>) new C23319b<Bitmap>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(final Bitmap bitmap) {
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                aVar2.mo96651a(i6, bitmap);
                            }
                        });
                    }
                });
            }
        };
        C6726a.m20842a(r1);
    }
}
