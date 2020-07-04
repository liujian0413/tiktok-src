package com.p280ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Environment;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.C37983ao;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.gif.a */
public final class C38044a {

    /* renamed from: a */
    public static final C38044a f99049a = new C38044a();

    /* renamed from: b */
    private static String f99050b;

    /* renamed from: c */
    private static List<? extends C37983ao> f99051c = C7525m.m23461a();

    /* renamed from: com.ss.android.ugc.aweme.share.gif.a$a */
    public static final class C38045a implements C43154a {

        /* renamed from: a */
        final /* synthetic */ C38054h f99052a;

        /* renamed from: b */
        final /* synthetic */ Activity f99053b;

        /* renamed from: c */
        final /* synthetic */ Aweme f99054c;

        /* renamed from: d */
        final /* synthetic */ String f99055d;

        /* renamed from: e */
        final /* synthetic */ String f99056e;

        /* renamed from: b */
        public final void mo71376b() {
        }

        /* renamed from: a */
        public final void mo71375a() {
            this.f99052a.mo95686a(this.f99053b, this.f99054c, this.f99055d, this.f99056e);
        }

        C38045a(C38054h hVar, Activity activity, Aweme aweme, String str, String str2) {
            this.f99052a = hVar;
            this.f99053b = activity;
            this.f99054c = aweme;
            this.f99055d = str;
            this.f99056e = str2;
        }
    }

    private C38044a() {
    }

    /* renamed from: a */
    public static List<C37983ao> m121413a() {
        return f99051c;
    }

    /* renamed from: b */
    public static String m121417b() {
        return f99050b;
    }

    static {
        File cacheDir = C6399b.m19921a().getCacheDir();
        C7573i.m23582a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
        String path = new File(cacheDir.getPath(), "gif").getPath();
        C7573i.m23582a((Object) path, "File(AppContextManager.g…acheDir.path, \"gif\").path");
        f99050b = path;
    }

    /* renamed from: a */
    public static void m121416a(List<? extends C37983ao> list) {
        f99051c = list;
    }

    /* renamed from: c */
    public static String m121419c(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        String aid = aweme.getAid();
        C7573i.m23582a((Object) aid, "aweme.aid");
        return aid;
    }

    /* renamed from: b */
    public final String mo95683b(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        String path = new File(f99050b, m121419c(aweme)).getPath();
        C7573i.m23582a((Object) path, "File(path, getGifVideoFileName(aweme)).path");
        return path;
    }

    /* renamed from: a */
    public static String m121412a(String str) {
        C7573i.m23587b(str, "fileName");
        String str2 = f99050b;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".gif");
        String path = new File(str2, sb.toString()).getPath();
        C7573i.m23582a((Object) path, "File(path, \"$fileName.gif\").path");
        return path;
    }

    /* renamed from: e */
    private static boolean m121421e(Aweme aweme) {
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl af = a.mo60062af();
        C7573i.m23582a((Object) af, "CommonSharePrefCache.inst().isShowGifButton");
        Integer num = (Integer) af.mo59877d();
        if ((num == null || num.intValue() != 0) && !aweme.isImage() && !aweme.isPrivate()) {
            User author = aweme.getAuthor();
            if (author == null || !author.isSecret()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m121420d(Aweme aweme) {
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl af = a.mo60062af();
        C7573i.m23582a((Object) af, "CommonSharePrefCache.inst().isShowGifButton");
        Integer num = (Integer) af.mo59877d();
        if ((num == null || num.intValue() != 0) && !aweme.isImage()) {
            Video video = aweme.getVideo();
            C7573i.m23582a((Object) video, "aweme.video");
            if (video.getDuration() <= 60000 && aweme.isReviewed() && !aweme.isPrivate() && (!aweme.isReviewed() || !aweme.isSelfSee())) {
                User author = aweme.getAuthor();
                if (author == null || !author.isSecret()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo95682a(Aweme aweme) {
        if (!C6399b.m19944t() || aweme == null) {
            return true;
        }
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().shareVideo2GifEditable()) {
            return m121421e(aweme);
        }
        return m121420d(aweme);
    }

    /* renamed from: b */
    public static void m121418b(File file, Context context) {
        C7573i.m23587b(file, "cardFile");
        C7573i.m23587b(context, "context");
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "tiktok");
        if (!file2.exists()) {
            file2.mkdir();
        }
        File file3 = new File(file2, file.getName());
        C7276d.m22820d(file.getPath(), file3.getPath());
        MediaScannerConnection.scanFile(context, new String[]{file3.getAbsolutePath()}, new String[]{"image/*"}, null);
    }

    /* renamed from: a */
    public static void m121415a(File file, Context context) {
        C7573i.m23587b(file, "cardFile");
        C7573i.m23587b(context, "context");
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "tiktok");
        if (!file2.exists()) {
            file2.mkdir();
        }
        File file3 = new File(file2, file.getName());
        C7276d.m22820d(file.getPath(), file3.getPath());
        MediaScannerConnection.scanFile(context, new String[]{file3.getAbsolutePath()}, new String[]{"image/gif"}, null);
    }

    /* renamed from: a */
    public static void m121414a(Activity activity, Aweme aweme, String str, String str2) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "logPb");
        C6907h.m21525a("save_as_gif", new C6909j().mo16966a("group_id", aweme.getAid()).mo16966a("author_id", aweme.getAuthorUid()).mo16966a("enter_from", str).mo16966a("log_pb", str2).mo16967a());
        C38045a aVar = new C38045a(C37950a.m121238a().getGifShareStrategy(), activity, aweme, str, str2);
        C43152a.m136869a(activity, "android.permission.WRITE_EXTERNAL_STORAGE", aVar);
    }
}
