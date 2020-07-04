package com.p280ss.android.ugc.aweme.tutorial.net;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42670e;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tutorial.net.b */
public final class C42684b {

    /* renamed from: a */
    public static final C42684b f110952a = new C42684b();

    /* renamed from: b */
    private static final String f110953b;

    private C42684b() {
    }

    static {
        String absolutePath = new File(C39810eq.f103468d, "tutorial").getAbsolutePath();
        C7573i.m23582a((Object) absolutePath, "File(ShortVideoConfig.sD… \"tutorial\").absolutePath");
        f110953b = absolutePath;
    }

    /* renamed from: b */
    private static String m135534b(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(f110953b);
        sb.append(File.separator);
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        sb.append("_");
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: a */
    public final C42670e mo104285a(int i, int i2, int i3) {
        Object a = C35574k.m114859a().mo70085S().mo15973a((Reader) new FileReader(m135534b(i, i2, i3)), C42670e.class);
        C7573i.m23582a(a, "CameraClient.getAPI().ge…ListResponse::class.java)");
        return (C42670e) a;
    }

    /* renamed from: a */
    public final void mo104286a(C42670e eVar, int i, int i2, int i3) {
        C7573i.m23587b(eVar, "tutorialList");
        File file = new File(m135534b(i, i2, i3));
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            C35574k.m114859a().mo70085S().mo15977a((Object) eVar, (Appendable) fileWriter);
            fileWriter.flush();
        } catch (IOException unused) {
        }
    }
}
