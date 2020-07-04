package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.app.Application;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0068c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.u */
public class C40815u extends C0068c {

    /* renamed from: a */
    private static volatile C40815u f106144a;

    /* renamed from: b */
    private final InfoStickerRepository f106145b;

    /* renamed from: a */
    public static void m130431a() {
        f106144a = null;
    }

    private C40815u(InfoStickerRepository infoStickerRepository) {
        this.f106145b = infoStickerRepository;
    }

    /* renamed from: a */
    public static C40815u m130430a(Application application) {
        if (f106144a == null) {
            synchronized (C40815u.class) {
                f106144a = new C40815u(new InfoStickerRepository(application.getApplicationContext()));
            }
        }
        return f106144a;
    }

    /* renamed from: a */
    public final <T extends C0063u> T mo149a(Class<T> cls) {
        if (cls.isAssignableFrom(InfoStickerViewModel.class)) {
            return new InfoStickerViewModel(this.f106145b);
        }
        StringBuilder sb = new StringBuilder("Unknow ViewModel class: ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }
}
