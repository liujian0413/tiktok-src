package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.text.TextUtils;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEUtils;
import com.p280ss.android.vesdk.clipparam.VEAlgorithmPath;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a */
public final class C39106a {

    /* renamed from: a */
    public C39107a f101421a = new C39107a(this) {

        /* renamed from: a */
        final /* synthetic */ C39195i f101591a;

        {
            this.f101591a = r1;
        }

        /* renamed from: a */
        public final int mo97368a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
            C7573i.m23587b(str, "audioPath");
            C7573i.m23587b(vEAlgorithmPath, "veAlgorithmPath");
            if (this.f101591a.f101584a == null) {
                return -1;
            }
            C15389d dVar = this.f101591a.f101584a;
            if (dVar == null) {
                C7573i.m23580a();
            }
            int a = dVar.mo38782a(str, i, i2, vEAlgorithmPath);
            C15389d dVar2 = this.f101591a.f101584a;
            if (dVar2 == null) {
                C7573i.m23580a();
            }
            dVar2.mo38803a(0, 1, 0.5f);
            return a;
        }
    };

    /* renamed from: b */
    public AVMusic f101422b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a$a */
    public interface C39107a {
        /* renamed from: a */
        int mo97368a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath);
    }

    /* renamed from: a */
    private static long m124818a() {
        if (C35563c.f93230L.mo93342a(Property.LongVideoPermitted)) {
            return C35563c.f93230L.mo93344c(Property.LongVideoThreshold);
        }
        return C40413c.f105051b;
    }

    /* renamed from: a */
    private static VEAlgorithmPath m124820a(VEAlgorithmPath vEAlgorithmPath) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        VEAlgorithmPath vEAlgorithmPath2 = new VEAlgorithmPath();
        Integer num = null;
        if (vEAlgorithmPath != null) {
            str = vEAlgorithmPath.getVeBeatsPath();
        } else {
            str = null;
        }
        vEAlgorithmPath2.setVeBeatsPath(str);
        if (vEAlgorithmPath != null) {
            str2 = vEAlgorithmPath.getDownBeatsPath();
        } else {
            str2 = null;
        }
        vEAlgorithmPath2.setDownBeatsPath(str2);
        if (vEAlgorithmPath != null) {
            str3 = vEAlgorithmPath.getNoStrengthBeatsPath();
        } else {
            str3 = null;
        }
        vEAlgorithmPath2.setNoStrengthBeatsPath(str3);
        if (vEAlgorithmPath != null) {
            str4 = vEAlgorithmPath.getManMadePath();
        } else {
            str4 = null;
        }
        vEAlgorithmPath2.setManMadePath(str4);
        if (vEAlgorithmPath != null) {
            str5 = vEAlgorithmPath.getOnlineBeatsPath();
        } else {
            str5 = null;
        }
        vEAlgorithmPath2.setOnlineBeatsPath(str5);
        if (vEAlgorithmPath != null) {
            num = Integer.valueOf(vEAlgorithmPath.getMode());
        }
        if (num == null) {
            C7573i.m23580a();
        }
        vEAlgorithmPath2.setMode(num.intValue());
        vEAlgorithmPath2.setType(vEAlgorithmPath.getType());
        return vEAlgorithmPath2;
    }

    /* renamed from: a */
    public static VEAlgorithmPath m124819a(AVMusic aVMusic) {
        int i;
        if (aVMusic == null) {
            C7573i.m23580a();
            return null;
        }
        String b = C39182e.m125097b(aVMusic);
        String veBeatsPath = aVMusic.getStickPointMusicAlg().getVeBeatsPath();
        String downBeatsPath = aVMusic.getStickPointMusicAlg().getDownBeatsPath();
        String noStrengthBeatsPath = aVMusic.getStickPointMusicAlg().getNoStrengthBeatsPath();
        String manModeBeatsPath = aVMusic.getStickPointMusicAlg().getManModeBeatsPath();
        if (!C7276d.m22812b(veBeatsPath)) {
            veBeatsPath = null;
        }
        if (!C7276d.m22812b(downBeatsPath)) {
            downBeatsPath = null;
        }
        if (!C7276d.m22812b(noStrengthBeatsPath)) {
            noStrengthBeatsPath = null;
        }
        if (!C7276d.m22812b(manModeBeatsPath)) {
            manModeBeatsPath = null;
        }
        if (aVMusic.getStickPointMusicAlg().isSuccessivelyAlgType() && !aVMusic.getStickPointMusicAlg().existSuccessivelyAlgFile()) {
            aVMusic.getStickPointMusicAlg().setAlgType(VEAlgorithmPath.BEATES_FILE_DEFAULT);
        }
        VEAlgorithmPath vEAlgorithmPath = new VEAlgorithmPath();
        vEAlgorithmPath.setVeBeatsPath(veBeatsPath);
        vEAlgorithmPath.setDownBeatsPath(downBeatsPath);
        if (!aVMusic.getStickPointMusicAlg().isSuccessivelyAlgType()) {
            if (C7276d.m22812b(downBeatsPath)) {
                vEAlgorithmPath.setNoStrengthBeatsPath(null);
            } else {
                vEAlgorithmPath.setNoStrengthBeatsPath(noStrengthBeatsPath);
            }
        }
        vEAlgorithmPath.setManMadePath(manModeBeatsPath);
        vEAlgorithmPath.setOnlineBeatsPath(b);
        vEAlgorithmPath.setType(aVMusic.getStickPointMusicAlg().getAlgType());
        if (aVMusic.getStickPointMusicAlg().isSuccessivelyAlgType()) {
            i = VEAlgorithmPath.MODE_SUCCESSIVELY;
        } else {
            i = VEAlgorithmPath.INTMODE_ONSET;
        }
        vEAlgorithmPath.setMode(i);
        return vEAlgorithmPath;
    }

    /* renamed from: a */
    public final int mo97367a(String str, VEAlgorithmPath vEAlgorithmPath) {
        boolean z;
        boolean z2;
        int b = C35563c.f93246i.mo103862b(str);
        int a = (int) m124818a();
        if (b <= 0) {
            return -1;
        }
        if (b > a) {
            b = a;
        }
        int c = C39182e.m125099c();
        if (b > c) {
            b = c;
        }
        VEAlgorithmPath a2 = m124820a(vEAlgorithmPath);
        VEAlgorithmPath a3 = m124820a(vEAlgorithmPath);
        boolean z3 = false;
        int a4 = m124817a(str, 0, b, vEAlgorithmPath);
        if (a4 != -10006) {
            if (a4 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C39194h.m125154b(z2, a4, C39182e.m125101d(this.f101422b));
        }
        if (a4 >= 0) {
            return a4;
        }
        int b2 = m124821b(str, 0, b, a2);
        if (b2 != -10007) {
            if (b2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            C39194h.m125149a(z, b2, C39182e.m125101d(this.f101422b));
        }
        if (b2 >= 0) {
            return b2;
        }
        int c2 = m124822c(str, 0, b, a3);
        if (c2 >= 0) {
            z3 = true;
        }
        C39194h.m125148a(z3);
        return c2;
    }

    /* renamed from: b */
    private final int m124821b(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        if (TextUtils.isEmpty(str)) {
            return -10001;
        }
        if (vEAlgorithmPath == null) {
            return -10002;
        }
        if (TextUtils.isEmpty(vEAlgorithmPath.getVeBeatsPath())) {
            return -10007;
        }
        if (!C7276d.m22812b(vEAlgorithmPath.getVeBeatsPath())) {
            return -10003;
        }
        vEAlgorithmPath.setType(VEAlgorithmPath.BEATES_FILE_DEFAULT);
        vEAlgorithmPath.setMode(VEAlgorithmPath.INTMODE_ONSET);
        vEAlgorithmPath.setManMadePath(null);
        vEAlgorithmPath.setOnlineBeatsPath(null);
        C39107a aVar = this.f101421a;
        if (aVar == null) {
            C7573i.m23580a();
        }
        if (str == null) {
            C7573i.m23580a();
        }
        return aVar.mo97368a(str, 0, i2, vEAlgorithmPath);
    }

    /* renamed from: c */
    private final int m124822c(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        if (TextUtils.isEmpty(str) || vEAlgorithmPath == null) {
            return -1;
        }
        if (!C7276d.m22812b(vEAlgorithmPath.getOnlineBeatsPath())) {
            if (str == null) {
                C7573i.m23580a();
            }
            if (VEUtils.getMusicDefaultAlgorithm(str, vEAlgorithmPath.getOnlineBeatsPath()) < 0) {
                return -1;
            }
        }
        vEAlgorithmPath.setManMadePath(null);
        vEAlgorithmPath.setVeBeatsPath(null);
        vEAlgorithmPath.setNoStrengthBeatsPath(null);
        vEAlgorithmPath.setDownBeatsPath(null);
        vEAlgorithmPath.setType(VEAlgorithmPath.BEATES_FILE_DEFAULT);
        vEAlgorithmPath.setMode(VEAlgorithmPath.INTMODE_ONSET);
        C39107a aVar = this.f101421a;
        if (aVar == null) {
            C7573i.m23580a();
        }
        if (str == null) {
            C7573i.m23580a();
        }
        return aVar.mo97368a(str, 0, i2, vEAlgorithmPath);
    }

    /* renamed from: a */
    private final int m124817a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        if (TextUtils.isEmpty(str)) {
            return -10001;
        }
        if (vEAlgorithmPath == null) {
            return -10002;
        }
        if (vEAlgorithmPath.getType() == VEAlgorithmPath.BEATES_FILE_DEFAULT) {
            return -10006;
        }
        if (vEAlgorithmPath.getType() == VEAlgorithmPath.BEATES_FILE_BEATS_A0) {
            if (!C7276d.m22812b(vEAlgorithmPath.getVeBeatsPath())) {
                return -10003;
            }
            vEAlgorithmPath.setManMadePath(vEAlgorithmPath.getVeBeatsPath());
            vEAlgorithmPath.setDownBeatsPath(null);
            vEAlgorithmPath.setVeBeatsPath(null);
        }
        if (vEAlgorithmPath.getType() == VEAlgorithmPath.BEATES_FILE_SERVER_C) {
            if (!C7276d.m22812b(vEAlgorithmPath.getDownBeatsPath())) {
                return -10004;
            }
            vEAlgorithmPath.setManMadePath(vEAlgorithmPath.getDownBeatsPath());
            vEAlgorithmPath.setVeBeatsPath(null);
            vEAlgorithmPath.setDownBeatsPath(null);
        }
        if (vEAlgorithmPath.getType() == VEAlgorithmPath.BEATES_FILE_CUSTOM) {
            if (!C7276d.m22812b(vEAlgorithmPath.getManMadePath())) {
                return -10005;
            }
            vEAlgorithmPath.setVeBeatsPath(null);
            vEAlgorithmPath.setDownBeatsPath(null);
        }
        vEAlgorithmPath.setNoStrengthBeatsPath(null);
        vEAlgorithmPath.setOnlineBeatsPath(null);
        C39107a aVar = this.f101421a;
        if (aVar == null) {
            C7573i.m23580a();
        }
        if (str == null) {
            C7573i.m23580a();
        }
        return aVar.mo97368a(str, 0, i2, vEAlgorithmPath);
    }
}
