package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.app.Application;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.p */
public final class C39777p {

    /* renamed from: a */
    public static final C39778a f103402a = new C39778a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.p$a */
    public static final class C39778a {
        private C39778a() {
        }

        /* renamed from: a */
        public final String mo99224a() {
            StringBuilder sb = new StringBuilder();
            sb.append(m127358b());
            sb.append(m127357a("_cover.png"));
            return sb.toString();
        }

        /* renamed from: b */
        public static String m127358b() {
            StringBuilder sb = new StringBuilder();
            Application b = C35574k.m114861b();
            C7573i.m23582a((Object) b, "CameraClient.getApplication()");
            File cacheDir = b.getCacheDir();
            C7573i.m23582a((Object) cacheDir, "CameraClient.getApplication().cacheDir");
            sb.append(cacheDir.getPath());
            sb.append(File.separator);
            return sb.toString();
        }

        public /* synthetic */ C39778a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static String m127357a(String str) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
            C7573i.m23582a((Object) instance, "calendar");
            Date time = instance.getTime();
            StringBuilder sb = new StringBuilder();
            sb.append(simpleDateFormat.format(time));
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static final String m127353a() {
        return f103402a.mo99224a();
    }

    /* renamed from: b */
    public static String m127355b(String str) {
        C7573i.m23587b(str, "concatAudioPath");
        String path = new File(C39811er.f103475k, new File(str).getName()).getPath();
        C7573i.m23582a((Object) path, "originalSoundFile.path");
        return path;
    }

    /* renamed from: c */
    public static String m127356c(String str) {
        C7573i.m23587b(str, "concatVideoPath");
        String path = new File(C39811er.f103477m, new File(str).getName()).getPath();
        C7573i.m23582a((Object) path, "synthetiseOutputFile.path");
        return path;
    }

    /* renamed from: a */
    public static String m127354a(String str) {
        C7573i.m23587b(str, "concatVideoPath");
        File file = new File(str);
        String parent = file.getParent();
        StringBuilder sb = new StringBuilder("synthetise_");
        sb.append(file.getName());
        String path = new File(parent, sb.toString()).getPath();
        C7573i.m23582a((Object) path, "synthetiseOutputFile.path");
        return path;
    }
}
