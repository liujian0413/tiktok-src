package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Environment;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.er */
public class C39811er {

    /* renamed from: d */
    public static final String f103468d;

    /* renamed from: e */
    public static final String f103469e;

    /* renamed from: f */
    public static final String f103470f;

    /* renamed from: g */
    public static final String f103471g;

    /* renamed from: h */
    public static final String f103472h;

    /* renamed from: i */
    public static final String f103473i;

    /* renamed from: j */
    public static final String f103474j;

    /* renamed from: k */
    public static final String f103475k;

    /* renamed from: l */
    public static final String f103476l;

    /* renamed from: m */
    public static final String f103477m;

    /* renamed from: n */
    public static final String f103478n;

    /* renamed from: o */
    public static final String f103479o;

    /* renamed from: p */
    public static final String f103480p;

    /* renamed from: q */
    public static final String f103481q;

    /* renamed from: r */
    public static final String f103482r;

    /* renamed from: s */
    public static final String f103483s;

    /* renamed from: t */
    public static final String f103484t;

    /* renamed from: u */
    public static final String f103485u;

    /* renamed from: v */
    public static final String f103486v;

    /* renamed from: w */
    public static final String f103487w;

    /* renamed from: a */
    private static boolean m127463a() {
        return C7285c.m22838a(C29960a.m98230a(), "test_data", 0).getBoolean("sp_key_tools_dir_external", false);
    }

    /* renamed from: b */
    public static String m127464b() {
        StringBuilder sb = new StringBuilder();
        sb.append(f103476l);
        sb.append(m127467e(".mp4"));
        return sb.toString();
    }

    static {
        String str;
        StringBuilder sb;
        if (!C7163a.m22363a() || !m127463a()) {
            sb = new StringBuilder();
            sb.append(C7276d.m22818d());
            str = "/";
        } else {
            sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getPath());
            str = "/aweme/";
        }
        sb.append(str);
        f103468d = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f103468d);
        sb2.append("tmp/");
        f103469e = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f103468d);
        sb3.append("draft/");
        f103470f = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f103468d);
        sb4.append("diamond_game/");
        f103471g = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(f103468d);
        sb5.append("import/");
        f103472h = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(f103468d);
        sb6.append("background_video/tmp/");
        f103473i = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(f103468d);
        sb7.append("background_video/draft/");
        f103474j = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(f103468d);
        sb8.append("origin_sound/");
        f103475k = sb8.toString();
        StringBuilder sb9 = new StringBuilder();
        sb9.append(f103468d);
        sb9.append("tmp_video/");
        f103476l = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        sb10.append(f103468d);
        sb10.append("parallel_upload/");
        f103477m = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        sb11.append(f103468d);
        sb11.append("record_work_space");
        f103478n = sb11.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append(f103468d);
        sb12.append("shortvideo/videoedit/audiorecord/");
        f103479o = sb12.toString();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(Environment.getExternalStorageDirectory().getPath());
        sb13.append("/aweme/draft/");
        f103480p = sb13.toString();
        StringBuilder sb14 = new StringBuilder();
        sb14.append(f103468d);
        sb14.append("cache/");
        f103481q = sb14.toString();
        StringBuilder sb15 = new StringBuilder();
        sb15.append(f103468d);
        sb15.append("filters/");
        f103482r = sb15.toString();
        StringBuilder sb16 = new StringBuilder();
        sb16.append(f103468d);
        sb16.append("audio-effect/");
        f103483s = sb16.toString();
        StringBuilder sb17 = new StringBuilder();
        sb17.append(f103468d);
        sb17.append("music/");
        f103484t = sb17.toString();
        StringBuilder sb18 = new StringBuilder();
        sb18.append(f103468d);
        sb18.append("beauty-face/");
        f103485u = sb18.toString();
        StringBuilder sb19 = new StringBuilder();
        sb19.append(f103468d);
        sb19.append("noCopyDraft/");
        f103486v = sb19.toString();
        StringBuilder sb20 = new StringBuilder();
        sb20.append(f103468d);
        sb20.append("compat_draft_track/");
        f103487w = sb20.toString();
        C7276d.m22805a(new File(f103468d));
    }

    /* renamed from: c */
    public static String m127465c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f103468d);
        sb.append(m127467e(str));
        return sb.toString();
    }

    /* renamed from: d */
    public static String m127466d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f103486v);
        sb.append(m127467e(str));
        return sb.toString();
    }

    /* renamed from: e */
    public static String m127467e(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(time));
        sb.append(str);
        return sb.toString();
    }
}
