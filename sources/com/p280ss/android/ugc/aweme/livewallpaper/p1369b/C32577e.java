package com.p280ss.android.ugc.aweme.livewallpaper.p1369b;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C42971be;
import com.p280ss.android.ugc.aweme.utils.C43146m;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43045c;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.e */
public final class C32577e {

    /* renamed from: a */
    private static boolean f84934a;

    /* renamed from: a */
    public static void m105492a(List<LiveWallPaperBean> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (LiveWallPaperBean liveWallPaperBean : list) {
                if (C6399b.m19944t()) {
                    C6907h.m21524a("wall_paper_show", (Map) C22984d.m75611a().mo59973a("group_id", liveWallPaperBean.getId()).mo59973a("enter_from", "paper_set").f60753a);
                } else {
                    C6907h.onEvent(MobClick.obtain().setEventName("wall_paper_show").setLabelName("set_wall_paper").setValue(liveWallPaperBean.getId()));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m105495a(Context context, String str) {
        WallpaperInfo wallpaperInfo;
        try {
            wallpaperInfo = WallpaperManager.getInstance(context).getWallpaperInfo();
        } catch (Exception unused) {
            wallpaperInfo = null;
        }
        if (wallpaperInfo == null) {
            return false;
        }
        String packageName = wallpaperInfo.getPackageName();
        if (m105508e()) {
            return "com.zhiliao.musically.livewallpaper".equals(packageName);
        }
        return packageName.equals(str);
    }

    /* renamed from: a */
    public static boolean m105496a(Aweme aweme) {
        return m105505c(aweme) || !m105507d(aweme) || C28482e.m93620m(aweme) || (C6399b.m19944t() && aweme != null && aweme.getAuthor() != null && !C6861a.m21337f().isMe(aweme.getAuthor().getUid()) && aweme.getAuthor().isSecret());
    }

    /* renamed from: a */
    private static void m105493a(boolean z) {
        if (!f84934a && !z && !C43045c.m136571a()) {
            f84934a = true;
            C6877n.m21407a("livewall_not_use_plugin", "", C6869c.m21381a().mo16887a("message", "not use plugin").mo16888b());
        }
    }

    /* renamed from: a */
    public static boolean m105494a(Activity activity, String str) {
        if (!m105508e() || activity == null || activity.isFinishing()) {
            return false;
        }
        boolean a = C43146m.m136851a(activity, "com.zhiliao.musically.livewallpaper");
        if (a && !m105502b(activity)) {
            return false;
        }
        m105488a(activity, a, str);
        return true;
    }

    /* renamed from: a */
    public static void m105485a() {
        C6907h.m21524a("wallpaper_plugin_success", (Map) new HashMap());
    }

    /* renamed from: g */
    private static boolean m105511g() {
        if (!C43045c.m136571a() || VERSION.SDK_INT < 26) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m105497b() {
        File filesDir = AwemeApplication.m21341a().getFilesDir();
        if (filesDir == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir);
        sb.append("/LiveWallpaper/");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m105503c() {
        StringBuilder sb = new StringBuilder();
        sb.append(m105497b());
        sb.append("fallback.mp4");
        return sb.toString();
    }

    /* renamed from: e */
    public static boolean m105508e() {
        boolean z;
        if (C7213d.m22500a().mo18717J() == 2) {
            z = true;
        } else {
            z = false;
        }
        m105493a(z);
        if (!z || m105511g()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String m105510f() {
        File externalFilesDir = C6399b.m19921a().getExternalFilesDir("livewallpaper");
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        return "";
    }

    /* renamed from: d */
    public static boolean m105506d() {
        if (C7213d.m22500a().mo18717J() == 0 || ((Integer) SharePrefCache.inst().getUseLiveWallpaper().mo59877d()).intValue() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m105502b(Activity activity) {
        if (9 > C43146m.m136852b(activity, "com.zhiliao.musically.livewallpaper")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static void m105504c(Activity activity) {
        Intent intent;
        if (!C6776h.m20948b(activity, "com.android.vending")) {
            intent = new Intent(activity, CrossPlatformActivity.class);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.zhiliao.musically.livewallpaper"));
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("hide_status_bar", true);
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.zhiliao.musically.livewallpaper"));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
        }
        try {
            activity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private static boolean m105509e(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return true;
        }
        int width = video.getWidth();
        int height = video.getHeight();
        if (width == 0 || height == 0 || aweme.getAwemeType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m105487a(Activity activity) {
        if (activity != null) {
            if (C6399b.m19944t()) {
                m105504c(activity);
                return;
            }
            String f = m105510f();
            if (!TextUtils.isEmpty(f)) {
                StringBuilder sb = new StringBuilder();
                sb.append(f);
                sb.append(File.separator);
                sb.append("livewallpaper-release");
                C7276d.m22816c(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f);
                sb2.append("/livewallpaper");
                String a = C42971be.m136415a((Context) activity, "livewallpaper-release", sb2.toString());
                if (a != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(268435456);
                    intent.setFlags(1);
                    intent.setDataAndType(C19929d.m65754a((Context) activity, new File(a)), "application/vnd.android.package-archive");
                    activity.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m105501b(String str) {
        C6907h.m21524a("wallpaper_plugin_alert", (Map) C22984d.m75611a().mo59973a("group_id", str).f60753a);
    }

    /* renamed from: c */
    private static boolean m105505c(Aweme aweme) {
        if (m105506d() || m105509e(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m105507d(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        int downloadSetting = aweme.getAuthor().getDownloadSetting();
        if (downloadSetting != 3) {
            switch (downloadSetting) {
                case 0:
                    break;
                case 1:
                    boolean e = C43168s.m136913e(aweme);
                    if (aweme.getAuthor() == null || !C6861a.m21337f().isMe(aweme.getAuthor().getUid())) {
                        return e;
                    }
                default:
                    return false;
            }
        } else if (aweme.getAuthor() == null || !C6861a.m21337f().isMe(aweme.getAuthor().getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m105499b(Aweme aweme) {
        String str = "";
        if (aweme != null) {
            StringBuilder sb = new StringBuilder("type ");
            sb.append(aweme.getAwemeType());
            str = sb.toString();
            Video video = aweme.getVideo();
            if (video != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" width ");
                sb2.append(video.getWidth());
                sb2.append(" height ");
                sb2.append(video.getHeight());
                str = sb2.toString();
            }
        }
        C6877n.m21407a("livewall_not_show", "", C6869c.m21381a().mo16885a("abvalue", Integer.valueOf(C7213d.m22500a().mo18717J())).mo16885a("setting", (Integer) SharePrefCache.inst().getUseLiveWallpaper().mo59877d()).mo16882a("isInValidValueAweme", Boolean.valueOf(m105509e(aweme))).mo16887a("message", str).mo16888b());
    }

    /* renamed from: a */
    public static void m105490a(String str) {
        if (C6399b.m19944t()) {
            C6907h.m21524a("wall_paper_click", (Map) C22984d.m75611a().mo59973a("group_id", str).mo59973a("enter_from", "paper_set").f60753a);
        } else {
            C6907h.onEvent(MobClick.obtain().setEventName("wall_paper_click").setLabelName("set_wall_paper").setValue(str));
        }
    }

    /* renamed from: a */
    public static void m105486a(int i, String str) {
        C6877n.m21444a("livewall_paper_setting", i, C6869c.m21381a().mo16887a("message", str).mo16888b());
        if (!TextUtils.isEmpty(str)) {
            C6877n.m21407a("type_livewallpaper_setting", "", C6869c.m21381a().mo16887a("message", str).mo16888b());
        }
    }

    /* renamed from: b */
    public static void m105498b(int i, String str) {
        C6877n.m21444a("livewall_paper_download", i, C6869c.m21381a().mo16887a("message", str).mo16888b());
        if (!TextUtils.isEmpty(str)) {
            C6877n.m21407a("type_livewall_paper_download", "", C6869c.m21381a().mo16887a("message", str).mo16888b());
        }
    }

    /* renamed from: a */
    public static void m105489a(Aweme aweme, String str) {
        if (aweme != null) {
            if (C6399b.m19944t()) {
                C6907h.m21524a("wall_paper_show", (Map) C22984d.m75611a().mo59973a("group_id", aweme.getAid()).mo59973a("request_id", aweme.getRequestId()).mo59973a("enter_from", str).f60753a);
                return;
            }
            C6907h.onEvent(MobClick.obtain().setEventName("share_video_tab").setLabelName("wall_paper_show").setValue(aweme.getAid()).setJsonObject(C6869c.m21381a().mo16887a("request_id", aweme.getRequestId()).mo16887a("enter_from", str).mo16888b()));
        }
    }

    /* renamed from: b */
    public static void m105500b(Aweme aweme, String str) {
        if (C6399b.m19944t()) {
            C6907h.m21524a("wall_paper_click", (Map) C22984d.m75611a().mo59973a("group_id", aweme.getAid()).mo59973a("request_id", aweme.getRequestId()).mo59973a("enter_from", str).f60753a);
            return;
        }
        C6907h.onEvent(MobClick.obtain().setEventName("share_video_tab").setLabelName("wall_paper").setValue(aweme.getAid()).setJsonObject(C6869c.m21381a().mo16887a("request_id", aweme.getRequestId()).mo16887a("enter_from", str).mo16888b()));
        C22984d a = C22984d.m75611a().mo59973a("group_id", aweme.getAid()).mo59973a("request_id", aweme.getRequestId()).mo59973a("author_id", aweme.getAuthorUid()).mo59973a("enter_from", str);
        if (C33230ac.m107222d(str)) {
            a.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
            C6907h.m21525a("wall_paper_click", C33230ac.m107211a(a.f60753a));
            return;
        }
        C6907h.m21524a("wall_paper_click", (Map) a.f60753a);
    }

    /* renamed from: a */
    private static void m105488a(final Activity activity, boolean z, String str) {
        int i;
        int i2;
        int i3;
        if (activity != null && !activity.isFinishing()) {
            if (z) {
                i = R.string.fk7;
            } else {
                i = R.string.buj;
            }
            if (z) {
                i2 = R.string.fk8;
            } else {
                i2 = R.string.buk;
            }
            if (z) {
                i3 = R.string.fk6;
            } else {
                i3 = R.string.bui;
            }
            if (C6399b.m19946v()) {
                new C10741a(activity).mo25649a(i2).mo25657b(i).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a(i3, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C32577e.m105487a(activity);
                    }
                }).mo25656a().mo25637a();
            } else {
                new C10741a(activity).mo25663c(R.drawable.abh).mo25653a(activity.getString(i2)).mo25660b(activity.getString(i)).mo25654a(activity.getString(i3), (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C32577e.m105487a(activity);
                    }
                }).mo25661b(activity.getString(R.string.w_), (OnClickListener) null).mo25656a().mo25638b();
            }
            m105501b(str);
        }
    }

    /* renamed from: a */
    public static void m105491a(String str, String str2, boolean z) {
        String str3;
        String str4;
        if (C6399b.m19944t()) {
            if (z) {
                str4 = "wall_paper_success";
            } else {
                str4 = "wall_paper_fail";
            }
            C6907h.m21524a(str4, (Map) C22984d.m75611a().mo59973a("group_id", str).mo59973a("enter_from", str2).f60753a);
            return;
        }
        C6869c a = C6869c.m21381a().mo16887a("enter_from", str2);
        MobClick obtain = MobClick.obtain();
        if (z) {
            str3 = "set_success";
        } else {
            str3 = "set_fail";
        }
        C6907h.onEvent(obtain.setEventName(str3).setLabelName("wall_paper").setValue(str).setJsonObject(a.mo16888b()));
    }
}
