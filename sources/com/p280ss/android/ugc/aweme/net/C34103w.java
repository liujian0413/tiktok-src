package com.p280ss.android.ugc.aweme.net;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.net.w */
public final class C34103w {

    /* renamed from: a */
    public static final C34103w f88868a = new C34103w();

    /* renamed from: b */
    private static final Handler f88869b;

    /* renamed from: c */
    private static String[] f88870c;

    /* renamed from: d */
    private static boolean f88871d;

    /* renamed from: com.ss.android.ugc.aweme.net.w$a */
    static final class C34105a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f88873a;

        C34105a(String str) {
            this.f88873a = str;
        }

        public final void run() {
            throw new RuntimeException(this.f88873a);
        }
    }

    private C34103w() {
    }

    /* renamed from: a */
    public static void m109778a() {
        f88871d = true;
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f88869b = handler;
        handler.postDelayed(C341041.f88872a, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* renamed from: b */
    private static boolean m109780b() {
        if (f88871d || !C6399b.m19928c() || C6399b.m19944t()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static void m109779b(String str) {
        f88869b.post(new C34105a(str));
    }

    /* renamed from: a */
    public final void mo86756a(String str) {
        C7573i.m23587b(str, "url");
        if (m109780b()) {
            if (f88870c == null) {
                f88870c = C6399b.m19921a().getResources().getStringArray(R.array.aa);
            }
            Uri parse = Uri.parse(str);
            C7573i.m23582a((Object) parse, "uri");
            String path = parse.getPath();
            if (!C6319n.m19593a(parse.getQueryParameter("device_id"))) {
                String[] strArr = f88870c;
                if (strArr == null) {
                    C7573i.m23580a();
                }
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (!C7634n.m23776c((CharSequence) str, (CharSequence) strArr[i], false)) {
                        i++;
                    } else {
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder("启动阶段不能请求接口");
                sb.append(path);
                sb.append("，如果有疑问请联系禹慧军，");
                sb.append(str);
                m109779b(sb.toString());
            }
        }
    }
}
