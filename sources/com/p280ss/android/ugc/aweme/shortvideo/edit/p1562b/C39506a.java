package com.p280ss.android.ugc.aweme.shortvideo.edit.p1562b;

import android.app.Application;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.effectplatform.C27498p;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.a */
public final class C39506a {

    /* renamed from: a */
    public static String f102555a = "";

    /* renamed from: b */
    public static final String f102556b;

    /* renamed from: c */
    public static final C39507a f102557c = new C39507a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.a$a */
    public static final class C39507a {
        private C39507a() {
        }

        /* renamed from: a */
        public static String m126194a() {
            StringBuilder sb = new StringBuilder();
            sb.append(C39506a.f102556b);
            sb.append(File.separator);
            return sb.toString();
        }

        /* renamed from: b */
        public static boolean m126195b() {
            if (!m126197d() || C35574k.m114859a().mo70096k().mo93306b(Property.LightEnhanceBlackList) != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public static int m126196c() {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Integer lightEnhanceThreshold = a.getLightEnhanceThreshold();
            C7573i.m23582a((Object) lightEnhanceThreshold, "SettingsReader.get().lightEnhanceThreshold");
            return lightEnhanceThreshold.intValue();
        }

        /* renamed from: d */
        public static boolean m126197d() {
            if (C35574k.m114859a().mo70096k().mo93306b(Property.ShowAutoImproveButtonInEditPage) != 1 || C35574k.m114859a().mo70096k().mo93306b(Property.EnableOpenGl3) != 1 || !C27498p.m90141a("hdrnet") || VERSION.SDK_INT <= 20) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public static boolean m126198e() {
            boolean exists = new File(C39506a.f102556b, "content.json").exists();
            C35622l lVar = (C35622l) C25682d.m84426a(C35574k.m114861b(), C35622l.class);
            if (lVar.mo60365c(-1) == 2 && exists) {
                return true;
            }
            Application b = C35574k.m114861b();
            C7573i.m23582a((Object) b, "CameraClient.getApplication()");
            try {
                C43136fo.m136828a(b.getAssets().open("HDR_Filter.zip"), C39506a.f102556b);
                lVar.mo60363b(2);
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public /* synthetic */ C39507a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final String m126190a() {
        return C39507a.m126194a();
    }

    /* renamed from: b */
    public static final boolean m126191b() {
        return C39507a.m126195b();
    }

    /* renamed from: c */
    public static final int m126192c() {
        return C39507a.m126196c();
    }

    /* renamed from: d */
    public static final boolean m126193d() {
        return C39507a.m126197d();
    }

    static {
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        String absolutePath = new File(b.getFilesDir(), "hdr_filter").getAbsolutePath();
        C7573i.m23582a((Object) absolutePath, "File(CameraClient.getApp…hdr_filter\").absolutePath");
        f102556b = absolutePath;
        File file = new File(f102556b);
        if (!file.exists()) {
            file.mkdirs();
        }
        C39507a.m126198e();
    }
}
