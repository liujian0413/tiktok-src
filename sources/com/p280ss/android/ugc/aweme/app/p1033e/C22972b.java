package com.p280ss.android.ugc.aweme.app.p1033e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.crash.C9847a;
import com.bytedance.crash.CrashType;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p255e.C6326a;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.common.p1146g.C25686b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.memory.p1391a.C33200a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42941at;
import com.p280ss.android.ugc.aweme.utils.C42941at.C42950f;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.app.e.b */
public final class C22972b implements C9847a {

    /* renamed from: a */
    private Map<String, String> f60739a = new HashMap();

    /* renamed from: b */
    private C9847a f60740b;

    /* renamed from: b */
    private void m75570b() {
        this.f60739a.put("root", String.valueOf(C42941at.m136318d()));
    }

    /* renamed from: a */
    private void m75569a() {
        this.f60739a.put("librarian", Arrays.toString(C6326a.m19644a()));
        this.f60739a.put("class_loader", getClass().getClassLoader().toString());
    }

    /* renamed from: c */
    private void m75571c() {
        if (TextUtils.equals(C6399b.m19941q(), "local_test") && !TextUtils.isEmpty(C33200a.m107100a())) {
            this.f60739a.put("mapping", C33200a.m107100a());
        }
    }

    /* renamed from: d */
    private void m75572d() {
        C42950f c = C42941at.m136315c();
        if (c != null) {
            this.f60739a.put("vmPeak", String.valueOf(c.f111490a));
            this.f60739a.put("vmSize", String.valueOf(c.f111491b));
            this.f60739a.put("fdCount", String.valueOf(c.f111493d));
            this.f60739a.put("maxFdCount", String.valueOf(c.f111492c));
            this.f60739a.put("threadCount", String.valueOf(c.f111494e));
        }
    }

    /* renamed from: a */
    public final Map<? extends String, ? extends String> mo24411a(CrashType crashType) {
        if (crashType == CrashType.JAVA || crashType == CrashType.LAUNCH || crashType == CrashType.NATIVE) {
            m75572d();
        }
        m75570b();
        m75571c();
        m75569a();
        return m75568a(this.f60739a);
    }

    /* renamed from: a */
    private static Map<String, String> m75568a(Map<String, String> map) {
        if (map != null && !map.containsKey("curUserId") && C6861a.m21337f().isLogin()) {
            map.put("curUserId", C6861a.m21337f().getCurUserId());
            if (C6861a.m21337f().getCurUser() != null) {
                map.put("shortId", C6861a.m21337f().getCurUser().getShortId());
                map.put("nickname", C6861a.m21337f().getCurUser().getNickname());
            }
        }
        return map;
    }

    public C22972b(Context context, C9847a aVar) {
        this.f60740b = aVar;
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        this.f60739a.put("git_sha", C6399b.m19937m());
        this.f60739a.put("git_branch", C6399b.m19936l());
        this.f60739a.put("abi", System.getProperty("os.arch"));
        this.f60739a.put("veSdk", iAVService.getVESDKVersion());
        this.f60739a.put("effectSdk", iAVService.getEffectSDKVersion());
        this.f60739a.put("player_type", String.valueOf(C44917a.m141692r().mo105098a()));
        this.f60739a.put("preloader_type", String.valueOf(C44917a.m141692r().mo105105h()));
        this.f60739a.put("ttplayer_version", "295511");
        this.f60739a.put("release_build", C6781d.m20984c());
        this.f60739a.put("real_machine", String.valueOf(C25686b.m84432a()));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append("&&");
        sb.append(Build.BRAND);
        sb.append("&&");
        sb.append(Build.MODEL);
        sb.append("&&");
        sb.append(Build.FINGERPRINT);
        this.f60739a.put("device_info", sb.toString());
        Map a = this.f60740b.mo24411a(CrashType.ALL);
        if (a != null) {
            this.f60739a.putAll(a);
        }
        m75568a(this.f60739a);
    }
}
