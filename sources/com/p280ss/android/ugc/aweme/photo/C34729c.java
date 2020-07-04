package com.p280ss.android.ugc.aweme.photo;

import android.graphics.Bitmap.CompressFormat;
import com.C1642a;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.photo.c */
public final class C34729c implements C34791s {

    /* renamed from: a */
    public CompressFormat f90540a = CompressFormat.PNG;

    /* renamed from: b */
    private final String f90541b;

    /* renamed from: c */
    private final SimpleDateFormat f90542c;

    public C34729c() {
        File file = new File(C39811er.f103468d, "photo");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f90541b = file.getAbsolutePath();
        this.f90542c = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    /* renamed from: a */
    public final String mo88162a() {
        String str = ".png";
        if (this.f90540a == CompressFormat.JPEG) {
            str = ".jpeg";
        }
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder("%s/IMG_%s");
        sb.append(str);
        return C1642a.m8035a(locale, sb.toString(), new Object[]{this.f90541b, this.f90542c.format(new Date())});
    }
}
