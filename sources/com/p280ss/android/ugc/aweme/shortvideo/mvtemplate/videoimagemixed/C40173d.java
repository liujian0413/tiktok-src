package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.C40183d;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d */
public final class C40173d {

    /* renamed from: a */
    public static final C40173d f104443a = new C40173d();

    /* renamed from: b */
    private static int f104444b = 35;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d$a */
    static final class C40174a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f104445a;

        C40174a(String str) {
            this.f104445a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            if (C7276d.m22812b(this.f104445a)) {
                C40173d.f104443a.mo99940a(new File(this.f104445a));
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d$b */
    static final class C40175b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f104446a;

        C40175b(List list) {
            this.f104446a = list;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m128366a());
        }

        /* renamed from: a */
        private int m128366a() {
            String c = C40173d.m128358c();
            if (!new File(c).exists()) {
                new File(c).mkdirs();
            }
            for (MediaModel mediaModel : this.f104446a) {
                String str = mediaModel.f88156b;
                C7573i.m23582a((Object) str, "model.filePath");
                if (C40173d.m128357b(str)) {
                    Bitmap a = C40168a.f104413a.mo99928a(mediaModel.f88156b, 720, 1280);
                    if (a != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c);
                        sb.append(C40173d.m128354a(".png"));
                        String sb2 = sb.toString();
                        C42341f.m134636a(a, new File(sb2), 50, CompressFormat.PNG);
                        C40168a.m128334a(a);
                        mediaModel.f88156b = sb2;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d$c */
    static final class C40176c<TTaskResult, TContinuationResult> implements C1591g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C40183d f104447a;

        C40176c(C40183d dVar) {
            this.f104447a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Integer> hVar) {
            C40183d dVar = this.f104447a;
            if (dVar != null) {
                dVar.mo99882a(true);
            }
            return null;
        }
    }

    private C40173d() {
    }

    /* renamed from: a */
    public static int m128353a() {
        return f104444b;
    }

    /* renamed from: b */
    public final int mo99941b() {
        if (m128359d()) {
            return f104444b;
        }
        return 12;
    }

    /* renamed from: d */
    public static boolean m128359d() {
        if (!C39182e.m125104g()) {
            return false;
        }
        return C35563c.f93231M.mo93305a(Property.EnableVideoImageMixed);
    }

    /* renamed from: e */
    public final void mo99942e() {
        if (m128359d()) {
            C1592h.m7853a((Callable<TResult>) new C40174a<TResult>(m128358c()));
        }
    }

    /* renamed from: c */
    public static String m128358c() {
        StringBuilder sb = new StringBuilder();
        Application application = C35563c.f93238a;
        C7573i.m23582a((Object) application, "AVEnv.application");
        File filesDir = application.getFilesDir();
        C7573i.m23582a((Object) filesDir, "AVEnv.application.filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("videoimage_mixed_resize");
        sb.append(File.separator);
        String sb2 = sb.toString();
        if (!new File(sb2).exists()) {
            new File(sb2).mkdirs();
        }
        return sb2;
    }

    /* renamed from: a */
    public final boolean mo99939a(int i) {
        if (!m128359d() || i == 3 || i == 4 || i == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m128354a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        C7573i.m23582a((Object) instance, "calendar");
        Date time = instance.getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(time));
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m128357b(String str) {
        C7573i.m23587b(str, "imagePath");
        if (!C38527bf.m123172a(str)) {
            return false;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        String str2 = options.outMimeType;
        CharSequence charSequence = str2;
        if (!TextUtils.isEmpty(charSequence)) {
            C7573i.m23582a((Object) str2, "type");
            if (C7634n.m23776c(charSequence, (CharSequence) "png", false) || C7634n.m23776c(charSequence, (CharSequence) "webp", false) || C7634n.m23776c(charSequence, (CharSequence) "bmp", false) || C7634n.m23776c(charSequence, (CharSequence) "jpg", false) || C7634n.m23776c(charSequence, (CharSequence) "jpeg", false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m128356a(List<? extends MyMediaModel> list) {
        if (C6292i.m19525a(list)) {
            return false;
        }
        if (list == null) {
            C7573i.m23580a();
        }
        for (MyMediaModel c : list) {
            if (c.mo86201c()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo99938a(android.content.Context r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0010
            android.content.res.Resources r5 = r5.getResources()
            if (r5 == 0) goto L_0x0010
            r0 = 2131822367(0x7f11071f, float:1.9277503E38)
            java.lang.String r5 = r5.getString(r0)
            goto L_0x0011
        L_0x0010:
            r5 = 0
        L_0x0011:
            if (r5 != 0) goto L_0x0016
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0016:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            int r3 = r4.mo99941b()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r5 = com.C1642a.m8034a(r5, r0)
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d.mo99938a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    public final boolean mo99940a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                mo99940a(a);
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public static void m128355a(List<? extends MediaModel> list, C40183d dVar) {
        C7573i.m23587b(list, "mediaModelList");
        if (C6292i.m19525a(list)) {
            dVar.mo99882a(true);
        } else {
            C1592h.m7853a((Callable<TResult>) new C40175b<TResult>(list)).mo6876a((C1591g<TResult, TContinuationResult>) new C40176c<TResult,TContinuationResult>(dVar), C1592h.f5958b);
        }
    }
}
