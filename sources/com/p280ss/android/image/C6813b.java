package com.p280ss.android.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Environment;
import android.os.Process;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.common.utility.p482io.FileUtils;
import com.facebook.common.file.C13297a;
import com.facebook.common.file.C13298b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.image.b */
public final class C6813b {

    /* renamed from: a */
    public static String f19415a = "joke_essay";

    /* renamed from: b */
    protected static String f19416b;

    /* renamed from: c */
    protected static String f19417c;

    /* renamed from: d */
    protected static String f19418d;

    /* renamed from: e */
    protected static String f19419e;

    /* renamed from: f */
    protected static String f19420f;

    /* renamed from: g */
    protected static boolean f19421g;

    /* renamed from: h */
    protected static String f19422h;

    /* renamed from: i */
    protected static String f19423i;

    /* renamed from: m */
    protected static volatile boolean f19424m;

    /* renamed from: n */
    private static String f19425n;

    /* renamed from: j */
    protected final int f19426j;

    /* renamed from: k */
    protected final int f19427k;

    /* renamed from: l */
    protected final Context f19428l;

    /* renamed from: com.ss.android.image.b$a */
    static class C6818a {

        /* renamed from: a */
        public long f19433a;

        /* renamed from: b */
        public long f19434b;

        /* renamed from: c */
        public String f19435c;

        private C6818a() {
        }
    }

    /* renamed from: com.ss.android.image.b$b */
    static class C6819b implements C13298b {

        /* renamed from: a */
        private final List<C6818a> f19436a;

        /* renamed from: a */
        public final void mo16657a(File file) {
        }

        /* renamed from: c */
        public final void mo16659c(File file) {
        }

        /* renamed from: a */
        public final List<C6818a> mo16656a() {
            return Collections.unmodifiableList(this.f19436a);
        }

        private C6819b() {
            this.f19436a = new ArrayList();
        }

        /* renamed from: b */
        public final void mo16658b(File file) {
            C6818a aVar = new C6818a();
            aVar.f19433a = file.lastModified();
            aVar.f19434b = file.length();
            aVar.f19435c = file.getAbsolutePath();
            this.f19436a.add(aVar);
        }
    }

    /* renamed from: a */
    public static String m21179a() {
        return f19419e;
    }

    /* renamed from: e */
    private static String m21191e() {
        return f19423i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16648a(int i, int i2) {
        try {
            C19591g.m64533a(f19419e);
        } catch (Exception unused) {
        }
        m21181a(i, new File(f19418d), null);
        m21187b(i, new File(f19425n), null);
        if (!C6319n.m19593a(f19420f)) {
            m21181a(i2, new File(f19420f), null);
        }
    }

    /* renamed from: a */
    public final void mo16649a(long j) {
        try {
            C19591g.m64533a(f19419e);
        } catch (Exception unused) {
        }
        if (m21189c() > 20971520) {
            long a = m21177a(20971520, f19418d, null);
            if (a < 20971520) {
                m21177a(20971520 - a, f19420f, null);
            }
        }
    }

    /* renamed from: d */
    private static boolean m21190d() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static long m21189c() {
        try {
            return 0 + C19591g.m64531a(new File(f19417c), false);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo16651b() {
        m21188b(62914560);
        if (!f19424m) {
            long j = C19598i.f53020a.f53022b;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j < 86400000) {
                try {
                    C19598i.f53020a.mo51784a(this);
                } catch (Exception unused) {
                }
            } else {
                C19598i.f53020a.f53022b = currentTimeMillis;
                f19424m = true;
                new C6304f("ClearCache") {
                    public final void run() {
                        Process.setThreadPriority(10);
                        System.currentTimeMillis();
                        try {
                            Thread.sleep(10000);
                            System.currentTimeMillis();
                            C6813b.this.mo16648a(C6813b.this.f19426j, C6813b.this.f19427k);
                        } catch (Exception unused) {
                        }
                        System.currentTimeMillis();
                        C6813b.f19424m = false;
                        try {
                            C19598i.f53020a.mo51784a(C6813b.this);
                        } catch (Exception unused2) {
                        }
                    }
                }.start();
            }
        }
    }

    public C6813b(Context context) {
        this(context, 5);
    }

    /* renamed from: b */
    public static String m21186b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo16647a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f19418d);
        sb.append(m21192f(str));
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo16653d(String str) {
        if (C6319n.m19593a(f19420f)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f19420f);
        sb.append(m21192f(str));
        return sb.toString();
    }

    /* renamed from: b */
    private void m21188b(long j) {
        if (!f19424m && m21189c() >= 62914560) {
            C19598i.f53020a.f53022b = System.currentTimeMillis();
            f19424m = true;
            new C6304f("ClearCache") {
                public final void run() {
                    Process.setThreadPriority(10);
                    System.currentTimeMillis();
                    try {
                        System.currentTimeMillis();
                        C6813b.this.mo16649a(20971520);
                    } catch (Exception unused) {
                    }
                    System.currentTimeMillis();
                    C6813b.f19424m = false;
                    try {
                        C19598i.f53020a.mo51784a(C6813b.this);
                    } catch (Exception unused2) {
                    }
                }
            }.start();
        }
    }

    /* renamed from: f */
    private static String m21192f(String str) {
        if (str == null || str.length() < 2) {
            return "__";
        }
        String substring = str.substring(0, 2);
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        if (!Character.isLetterOrDigit(charAt) || !Character.isLetterOrDigit(charAt2)) {
            return "__";
        }
        return substring;
    }

    /* renamed from: c */
    public final String mo16652c(String str) {
        StringBuilder sb = new StringBuilder(f19418d);
        sb.append(m21192f(str));
        sb.append("/");
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo16654e(String str) {
        if (C6319n.m19593a(f19420f)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(f19420f);
        sb.append(m21192f(str));
        sb.append("/");
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:12|13|14|15|16|17|18|19|20|(1:22)(1:23)|24|(6:26|(1:28)|29|(1:31)|32|(1:34))|(3:35|36|(2:38|39)(3:40|41|(1:43)))) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0047 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m21182a(android.content.Context r3) {
        /*
            java.lang.Class<com.ss.android.image.b> r0 = com.p280ss.android.image.C6813b.class
            monitor-enter(r0)
            boolean r1 = f19421g     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            java.lang.String r1 = r3.getPackageName()     // Catch:{ all -> 0x0122 }
            f19416b = r1     // Catch:{ all -> 0x0122 }
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return
        L_0x0017:
            r1 = 1
            f19421g = r1     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = r2.getPath()     // Catch:{ all -> 0x0122 }
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "/Android/data/"
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = f19416b     // Catch:{ all -> 0x0122 }
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "/cache/"
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0122 }
            f19417c = r1     // Catch:{ all -> 0x0122 }
            r1 = 0
            java.lang.String r3 = com.p280ss.android.image.C19591g.m64532a(r3)     // Catch:{ Exception -> 0x0047 }
            f19422h = r3     // Catch:{ Exception -> 0x0047 }
            goto L_0x0049
        L_0x0047:
            f19422h = r1     // Catch:{ all -> 0x0122 }
        L_0x0049:
            java.lang.String r3 = f19422h     // Catch:{ all -> 0x0122 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ all -> 0x0122 }
            if (r3 != 0) goto L_0x0067
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f19422h     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "/hashedimages/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f19420f = r3     // Catch:{ all -> 0x0122 }
            goto L_0x0069
        L_0x0067:
            f19420f = r1     // Catch:{ all -> 0x0122 }
        L_0x0069:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f19417c     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "hashedimages/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f19418d = r3     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f19417c     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "tmpimages/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f19419e = r3     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "/Android/data/com.ss.spipe/cache/avatar"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f19425n = r3     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f19415a     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f19423i = r3     // Catch:{ all -> 0x0122 }
            boolean r3 = m21190d()     // Catch:{ all -> 0x0122 }
            if (r3 == 0) goto L_0x0104
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f19417c     // Catch:{ all -> 0x0122 }
            r3.<init>(r1)     // Catch:{ all -> 0x0122 }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x00e4
            r3.mkdirs()     // Catch:{ all -> 0x0122 }
        L_0x00e4:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f19418d     // Catch:{ all -> 0x0122 }
            r3.<init>(r1)     // Catch:{ all -> 0x0122 }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x00f4
            r3.mkdirs()     // Catch:{ all -> 0x0122 }
        L_0x00f4:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f19419e     // Catch:{ all -> 0x0122 }
            r3.<init>(r1)     // Catch:{ all -> 0x0122 }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x0104
            r3.mkdirs()     // Catch:{ all -> 0x0122 }
        L_0x0104:
            java.lang.String r3 = f19420f     // Catch:{ Exception -> 0x0120 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ Exception -> 0x0120 }
            if (r3 == 0) goto L_0x010e
            monitor-exit(r0)
            return
        L_0x010e:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0120 }
            java.lang.String r1 = f19420f     // Catch:{ Exception -> 0x0120 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0120 }
            boolean r1 = r3.exists()     // Catch:{ Exception -> 0x0120 }
            if (r1 != 0) goto L_0x011e
            r3.mkdirs()     // Catch:{ Exception -> 0x0120 }
        L_0x011e:
            monitor-exit(r0)
            return
        L_0x0120:
            monitor-exit(r0)
            return
        L_0x0122:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.image.C6813b.m21182a(android.content.Context):void");
    }

    private C6813b(Context context, int i) {
        this.f19426j = 5;
        this.f19427k = 1;
        this.f19428l = context.getApplicationContext();
        if (!f19421g) {
            m21182a(context);
        }
    }

    /* renamed from: b */
    public static Bitmap m21185b(Bitmap bitmap, int i) {
        int i2 = i * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        float f = (float) i;
        canvas.drawCircle(f, f, f, paint);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, i2, i2);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m21178a(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f = (float) i;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (com.bytedance.common.utility.p482io.FileUtils.ImageType.UNKNOWN.equals(r3) != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r3 = android.net.Uri.parse(r4).getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r3 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r4 = r3.lastIndexOf(46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r4 <= 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if ((r4 + 1) >= r3.length()) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r3 = r3.substring(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r3.equalsIgnoreCase(".jpg") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r3.equalsIgnoreCase(".jpeg") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r3.equalsIgnoreCase(".png") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r3.equalsIgnoreCase(".gif") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (r3.equalsIgnoreCase(".bmp") == false) goto L_0x0071;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m21180a(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = ".jpg"
            if (r4 != 0) goto L_0x0007
            if (r3 != 0) goto L_0x0007
            return r0
        L_0x0007:
            com.bytedance.common.utility.io.FileUtils$ImageType r3 = com.bytedance.common.utility.p482io.FileUtils.m28678b(r3)     // Catch:{ Exception -> 0x0071 }
            int[] r1 = com.p280ss.android.image.C6813b.C68174.f19432a     // Catch:{ Exception -> 0x0071 }
            int r2 = r3.ordinal()     // Catch:{ Exception -> 0x0071 }
            r1 = r1[r2]     // Catch:{ Exception -> 0x0071 }
            switch(r1) {
                case 1: goto L_0x001d;
                case 2: goto L_0x001a;
                case 3: goto L_0x0017;
                default: goto L_0x0016;
            }     // Catch:{ Exception -> 0x0071 }
        L_0x0016:
            goto L_0x0020
        L_0x0017:
            java.lang.String r1 = ".gif"
            goto L_0x001f
        L_0x001a:
            java.lang.String r1 = ".png"
            goto L_0x001f
        L_0x001d:
            java.lang.String r1 = ".jpg"
        L_0x001f:
            r0 = r1
        L_0x0020:
            com.bytedance.common.utility.io.FileUtils$ImageType r1 = com.bytedance.common.utility.p482io.FileUtils.ImageType.UNKNOWN     // Catch:{ Exception -> 0x0071 }
            boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x0071 }
            if (r3 != 0) goto L_0x0029
            return r0
        L_0x0029:
            android.net.Uri r3 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x0071 }
            if (r3 != 0) goto L_0x0034
            return r0
        L_0x0034:
            r4 = 46
            int r4 = r3.lastIndexOf(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 <= 0) goto L_0x0071
            int r1 = r4 + 1
            int r2 = r3.length()     // Catch:{ Exception -> 0x0071 }
            if (r1 >= r2) goto L_0x0071
            java.lang.String r3 = r3.substring(r4)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r4 = ".jpg"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = ".jpeg"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = ".png"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = ".gif"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = ".bmp"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r3 = r0
        L_0x0072:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.image.C6813b.m21180a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void mo16650a(Context context, String str, String str2) {
        m21184a(context, str, str2, null, null, true);
    }

    /* renamed from: a */
    private void m21181a(int i, File file, Set<String> set) {
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m21187b(i, file2, set);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private long m21177a(long j, String str, Set<String> set) {
        C6819b bVar = new C6819b();
        C13297a.m38909a(new File(str), bVar);
        ArrayList<C6818a> arrayList = new ArrayList<>(bVar.mo16656a());
        Collections.sort(arrayList, new Comparator<C6818a>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m21201a((C6818a) obj, (C6818a) obj2);
            }

            /* renamed from: a */
            private static int m21201a(C6818a aVar, C6818a aVar2) {
                if (aVar.f19433a == aVar2.f19433a) {
                    return 0;
                }
                if (aVar.f19433a > aVar2.f19433a) {
                    return -1;
                }
                return 1;
            }
        });
        long j2 = 0;
        for (C6818a aVar : arrayList) {
            j2 += aVar.f19434b;
            if (j2 > j) {
                File file = new File(aVar.f19435c);
                String name = file.getName();
                if (set == null || !set.contains(name)) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return j2;
    }

    /* renamed from: b */
    private static void m21187b(int i, File file, Set<String> set) {
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = ((long) (i * 24 * 3600)) * 1000;
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        String name = file2.getName();
                        if (set == null || !set.contains(name)) {
                            try {
                                if (currentTimeMillis - file2.lastModified() > j) {
                                    file2.delete();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m21183a(Context context, int i, int i2, boolean z) {
        if (z) {
            C9738o.m28694a(context, i, i2);
        }
    }

    /* renamed from: a */
    private void m21184a(Context context, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        boolean z2;
        File file;
        String str6;
        if (!m21190d()) {
            m21183a(context, R.drawable.wt, R.string.e_8, true);
            return;
        }
        try {
            String str7 = null;
            if (!C6319n.m19593a(str)) {
                str5 = mo16652c(str);
                file = new File(str5);
                z2 = file.isFile();
                if (!z2) {
                    str5 = mo16654e(str);
                    file = new File(str5);
                    z2 = file.isFile();
                }
            } else {
                str5 = null;
                file = null;
                z2 = false;
            }
            if (z2 || C6319n.m19593a((String) null)) {
                str7 = str2;
            } else {
                String c = mo16652c(null);
                File file2 = new File(c);
                boolean isFile = file2.isFile();
                if (!isFile) {
                    c = mo16654e(null);
                    file2 = new File(c);
                    isFile = file2.isFile();
                }
                str = null;
            }
            if (!z2) {
                m21183a(context, R.drawable.wt, R.string.e_7, true);
                return;
            }
            String a = m21180a(str5, str7);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(a);
            String sb2 = sb.toString();
            String e = m21191e();
            if (e.endsWith("/")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e);
                sb3.append(sb2);
                str6 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(e);
                sb4.append("/");
                sb4.append(sb2);
                str6 = sb4.toString();
            }
            File file3 = new File(str6);
            if (file3.isFile() && file.length() == file3.length()) {
                m21183a(context, R.drawable.zf, R.string.e_9, true);
            } else if (!FileUtils.m28674a(FileUtils.m28670a(str5), e, sb2)) {
                m21183a(context, R.drawable.wt, R.string.e_6, true);
            } else {
                C19605l.m64567a(context, str6);
                m21183a(context, R.drawable.zf, R.string.e_9, true);
            }
        } catch (Exception unused) {
            m21183a(context, R.drawable.wt, R.string.e_6, true);
        }
    }
}
