package com.p280ss.android.ugc.aweme.photo;

import android.content.Context;
import com.C1642a;
import com.p280ss.android.ugc.aweme.p1048ax.C23139a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.photo.a */
public final class C34726a implements C34791s {

    /* renamed from: a */
    private final String f90538a;

    /* renamed from: b */
    private final SimpleDateFormat f90539b;

    /* renamed from: a */
    public final String mo88162a() {
        return C1642a.m8035a(Locale.getDefault(), "%s/IMG_%s.png", new Object[]{this.f90538a, this.f90539b.format(new Date())});
    }

    public C34726a(Context context) {
        File file = new File(C23139a.m76055a(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f90538a = file.getAbsolutePath();
        this.f90539b = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }
}
