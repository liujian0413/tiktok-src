package com.p280ss.android.ugc.aweme.beauty;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.j */
public final class C23540j {

    /* renamed from: a */
    public static final C23540j f62123a = new C23540j();

    /* renamed from: b */
    private static final Keva f62124b;

    /* renamed from: com.ss.android.ugc.aweme.beauty.j$a */
    public static final class C23541a extends C6597a<List<? extends UlikeBeautyData>> {
        C23541a() {
        }
    }

    private C23540j() {
    }

    static {
        Keva repo = Keva.getRepo("ulike_repo");
        C7573i.m23582a((Object) repo, "Keva.getRepo(KEVA_ULIKE_REPO)");
        f62124b = repo;
    }

    /* renamed from: a */
    public static ArrayList<UlikeBeautyData> m77315a() {
        String string = f62124b.getString("ulike_download_config", "");
        if (TextUtils.isEmpty(string)) {
            C35622l lVar = (C35622l) C25682d.m84426a(C35574k.m114861b(), C35622l.class);
            String b = lVar.mo60362b("");
            if (!TextUtils.isEmpty(b)) {
                lVar.mo60366c("");
                f62124b.storeString("ulike_download_config", b);
                string = b;
            }
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (ArrayList) C35574k.m114859a().mo70085S().mo15975a(string, new C23541a().type);
    }

    /* renamed from: b */
    private static String m77317b(String str) {
        StringBuilder sb = new StringBuilder("composer_beauty_manual_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static final int m77314a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Keva keva = f62124b;
        if (str == null) {
            C7573i.m23580a();
        }
        return keva.getInt(m77317b(str), -1);
    }

    /* renamed from: a */
    public static void m77316a(ArrayList<UlikeBeautyData> arrayList) {
        f62124b.storeString("ulike_download_config", C35574k.m114859a().mo70085S().mo15979b((Object) arrayList));
    }
}
