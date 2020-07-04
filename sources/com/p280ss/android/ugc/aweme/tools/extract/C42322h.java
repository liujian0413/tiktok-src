package com.p280ss.android.ugc.aweme.tools.extract;

import com.p280ss.android.ugc.aweme.photo.C34791s;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.h */
public final class C42322h implements C34791s {

    /* renamed from: a */
    public String f110088a = C35563c.f93238a.getFilesDir().getAbsolutePath();

    /* renamed from: a */
    public final String mo88162a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f110088a);
        sb.append(File.separator);
        sb.append("extract-frame-");
        sb.append(System.currentTimeMillis());
        sb.append(".jpg");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo103805b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f110088a);
        sb.append(File.separator);
        sb.append("extract-frame-");
        sb.append(System.currentTimeMillis());
        sb.append("_hq.jpg");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo103804a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C35563c.f93238a.getFilesDir());
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append(str2);
        this.f110088a = sb.toString();
        File file = new File(this.f110088a);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
