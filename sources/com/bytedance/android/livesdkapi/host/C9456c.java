package com.bytedance.android.livesdkapi.host;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.p453a.C9444e;

/* renamed from: com.bytedance.android.livesdkapi.host.c */
public interface C9456c extends C2324b, C9444e {

    /* renamed from: com.bytedance.android.livesdkapi.host.c$a */
    public static class C9457a {

        /* renamed from: a */
        public Throwable f25912a;
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.c$b */
    public interface C9458b {
        /* renamed from: b */
        void mo21637b();

        /* renamed from: c */
        void mo21638c();
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.c$c */
    public interface C9459c {
        /* renamed from: a */
        void mo9921a(Bitmap bitmap);

        /* renamed from: a */
        void mo9922a(C9457a aVar);
    }

    /* renamed from: a */
    C9457a mo23192a(ImageModel imageModel, C9459c cVar);

    /* renamed from: a */
    void mo23193a(String str);

    /* renamed from: a */
    void mo23194a(String str, C9458b bVar);

    /* renamed from: a */
    boolean mo23195a(ImageModel imageModel);

    /* renamed from: b */
    String mo23196b(ImageModel imageModel);

    /* renamed from: b */
    String mo23197b(String str);
}
