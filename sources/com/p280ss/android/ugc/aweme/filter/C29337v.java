package com.p280ss.android.ugc.aweme.filter;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.filter.v */
public final class C29337v {

    /* renamed from: a */
    private static final String f77337a = new File(C35574k.m114861b().getFilesDir(), "filter").getAbsolutePath();

    /* renamed from: b */
    private static final String f77338b = new File(f77337a, "face_reshape").getAbsolutePath();

    /* renamed from: c */
    private static final String f77339c = new File(f77337a, "Qinyan").getAbsolutePath();

    /* renamed from: d */
    private static final String f77340d = new File(f77337a, "contour").getAbsolutePath();

    /* renamed from: b */
    public static String m96217b() {
        return f77339c;
    }

    /* renamed from: a */
    public static String m96215a() {
        StringBuilder sb = new StringBuilder();
        sb.append(f77338b);
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: c */
    private static String m96218c() {
        StringBuilder sb = new StringBuilder();
        sb.append(f77340d);
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: e */
    private static boolean m96220e() {
        if (C35574k.m114859a().mo70091f().mo93343b(Property.EffectResourceVersion) == 3 && C35574k.m114859a().mo70091f().mo93342a(Property.ContourModelCopied)) {
            return true;
        }
        try {
            m96216a(C35574k.m114861b().getAssets(), "Contour_2D", m96218c());
            C35574k.m114859a().mo70091f().mo93341a(Property.ContourModelCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m96221f() {
        if (C35574k.m114859a().mo70091f().mo93343b(Property.EffectResourceVersion) == 3 && C35574k.m114859a().mo70091f().mo93342a(Property.UlikeBeautyCopied)) {
            return true;
        }
        try {
            C43136fo.m136828a(C35574k.m114861b().getAssets().open("Qinyan.zip"), f77339c);
            C35574k.m114859a().mo70091f().mo93341a(Property.UlikeBeautyCopied, true);
        } catch (IOException unused) {
        }
        return false;
    }

    static {
        File file = new File(f77337a);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(f77338b);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(f77339c);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        File file4 = new File(f77340d);
        if (file4.exists()) {
            file4.mkdirs();
        }
        m96221f();
        m96219d();
        m96220e();
        C35574k.m114859a().mo70091f().mo93338a(Property.EffectResourceVersion, 3);
    }

    /* renamed from: d */
    private static boolean m96219d() {
        boolean z;
        if (!new File(f77338b, FilterModel.CONFIG_FILE).exists() || !new File(f77338b, "distortion.json").exists()) {
            z = false;
        } else {
            z = true;
        }
        if (C35574k.m114859a().mo70091f().mo93342a(Property.ReshapeModelCopied) && z) {
            return true;
        }
        AssetManager assets = C35574k.m114861b().getAssets();
        try {
            File file = new File(f77338b, FilterModel.CONFIG_FILE);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            if (!C42973bg.m136426a(assets.open("FaceReshape_V2/config.json"), (OutputStream) new FileOutputStream(file))) {
                return false;
            }
            File file2 = new File(f77338b, "distortion.json");
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            if (!C42973bg.m136426a(assets.open("FaceReshape_V2/distortion.json"), (OutputStream) new FileOutputStream(file2))) {
                return false;
            }
            C35574k.m114859a().mo70091f().mo93341a(Property.ReshapeModelCopied, true);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static void m96216a(AssetManager assetManager, String str, String str2) throws IOException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = File.separator;
            String[] list = assetManager.list(str);
            if (list == null || list.length <= 0) {
                C42973bg.m136426a(assetManager.open(str), (OutputStream) new FileOutputStream(str2));
                return;
            }
            File file = new File(str2);
            if (file.exists() || file.mkdirs()) {
                for (String str4 : list) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str3);
                    sb.append(str4);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(str3);
                    sb3.append(str4);
                    m96216a(assetManager, sb2, sb3.toString());
                }
            }
        }
    }
}
