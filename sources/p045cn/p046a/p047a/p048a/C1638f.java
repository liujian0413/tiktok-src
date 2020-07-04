package p045cn.p046a.p047a.p048a;

import android.os.Environment;
import android.util.SparseArray;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: cn.a.a.a.f */
public final class C1638f {

    /* renamed from: a */
    public static String f6062a = "libmktplayer.so";

    /* renamed from: b */
    public static String f6063b = "libmktplayer_mediacodec.so";

    /* renamed from: c */
    public static String f6064c = "mktplayer";

    /* renamed from: d */
    public static String f6065d = "mktplayer_mediacodec";

    /* renamed from: e */
    private static String f6066e = "player_crash.log";

    /* renamed from: f */
    private static boolean f6067f;

    /* renamed from: g */
    private static final SparseArray<C1641c> f6068g = new SparseArray<>();

    /* renamed from: cn.a.a.a.f$a */
    static final class C1639a extends C1641c {

        /* renamed from: a */
        public int f6069a;

        public C1639a(int i, int i2) {
            super(i);
            this.f6069a = i2;
        }
    }

    /* renamed from: cn.a.a.a.f$b */
    static class C1640b extends C1641c {

        /* renamed from: a */
        public String f6070a;

        public C1640b(int i, String str) {
            super(i);
            this.f6070a = str;
        }
    }

    /* renamed from: cn.a.a.a.f$c */
    static class C1641c {

        /* renamed from: b */
        public int f6071b = -1;

        protected C1641c(int i) {
            this.f6071b = i;
        }
    }

    static {
        m8027a(13, 1);
        m8032b(14, "999.999.999.9");
        m8032b(15, "version code:1,name:999.999.999.9default sdk info 2016-12-05");
        m8028a(0, false);
        m8028a(1, true);
        m8028a(2, true);
        m8028a(3, false);
        m8028a(4, false);
        m8028a(5, false);
        m8028a(6, false);
        m8028a(7, false);
        m8028a(8, false);
        m8027a(10, 0);
        m8028a(11, false);
        m8027a(18, 2);
        m8031b();
    }

    /* renamed from: a */
    public static final boolean m8029a() {
        if (m8030b(6, 0) == 1) {
            return true;
        }
        if (m8030b(1, 0) == 0 || m8030b(7, 0) == 1 || m8030b(8, 0) == 1 || m8030b(10, 0) >= 3) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static final void m8031b() {
        boolean z;
        if (m8030b(0, 0) == 0) {
            m8027a(0, 1);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                sb.append(File.separatorChar);
                sb.append("mediakit");
                sb.append(File.separatorChar);
                sb.append("mediakit.debug");
                File file = new File(sb.toString());
                if (file.exists()) {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    boolean z2 = false;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            String replace = readLine.replace("\r\n", "");
                            if (replace.contains(":on")) {
                                z = true;
                            } else {
                                boolean contains = replace.contains(":off");
                                z = false;
                            }
                            if (replace.startsWith("debug_player:")) {
                                z2 = z;
                            } else if (replace.startsWith("ipc_player:")) {
                                m8028a(2, z);
                            } else if (replace.startsWith("print_info:")) {
                                f6067f = z;
                            } else {
                                replace.startsWith("check_lib:");
                                if (replace.startsWith("throw_crash:")) {
                                    m8028a(4, z);
                                } else if (replace.startsWith("choose_jmediacodec:")) {
                                    m8028a(24, z);
                                }
                            }
                        } else {
                            bufferedReader.close();
                            fileReader.close();
                            m8028a(6, z2);
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static final void m8028a(int i, boolean z) {
        m8027a(i, z ? 1 : 0);
    }

    /* renamed from: a */
    public static final String m8026a(int i, String str) {
        C1641c cVar = (C1641c) f6068g.get(14);
        if (cVar == null || !(cVar instanceof C1640b)) {
            return str;
        }
        return ((C1640b) cVar).f6070a;
    }

    /* renamed from: b */
    private static int m8030b(int i, int i2) {
        Object obj = f6068g.get(i);
        if (obj == null || !(obj instanceof C1639a)) {
            return 0;
        }
        return ((C1639a) obj).f6069a;
    }

    /* renamed from: a */
    public static final void m8027a(int i, int i2) {
        Object obj = f6068g.get(i);
        if (obj != null) {
            if (!(obj instanceof C1639a)) {
                f6068g.remove(i);
            } else if (i != 2 || !m8033b(6, false)) {
                ((C1639a) obj).f6069a = i2;
                return;
            } else {
                return;
            }
        }
        f6068g.append(i, new C1639a(i, i2));
    }

    /* renamed from: b */
    private static void m8032b(int i, String str) {
        Object obj = f6068g.get(i);
        if (obj != null) {
            if (obj instanceof C1640b) {
                ((C1640b) obj).f6070a = str;
                return;
            }
            f6068g.remove(i);
        }
        f6068g.append(i, new C1640b(i, str));
    }

    /* renamed from: b */
    private static boolean m8033b(int i, boolean z) {
        Object obj = f6068g.get(6);
        if (obj == null || !(obj instanceof C1639a) || ((C1639a) obj).f6069a != 1) {
            return false;
        }
        return true;
    }
}
