package shark;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import okio.BufferedSource;
import okio.Okio;

public final class Hprof implements Closeable {

    /* renamed from: e */
    public static final Map<String, HprofVersion> f123812e;

    /* renamed from: f */
    public static final C48694a f123813f = new C48694a(null);

    /* renamed from: a */
    public final C48821m f123814a;

    /* renamed from: b */
    public final long f123815b;

    /* renamed from: c */
    public final HprofVersion f123816c;

    /* renamed from: d */
    public final long f123817d;

    /* renamed from: g */
    private final FileChannel f123818g;

    /* renamed from: h */
    private final BufferedSource f123819h;

    public enum HprofVersion {
        JDK1_2_BETA3("JAVA PROFILE 1.0"),
        JDK1_2_BETA4("JAVA PROFILE 1.0.1"),
        JDK_6("JAVA PROFILE 1.0.2"),
        ANDROID("JAVA PROFILE 1.0.3");
        
        private final String versionString;

        public final String getVersionString() {
            return this.versionString;
        }

        private HprofVersion(String str) {
            this.versionString = str;
        }
    }

    /* renamed from: shark.Hprof$a */
    public static final class C48694a {
        private C48694a() {
        }

        public /* synthetic */ C48694a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Hprof m150437a(File file) {
            C7573i.m23587b(file, "hprofFile");
            long length = file.length();
            if (length != 0) {
                FileInputStream fileInputStream = new FileInputStream(file);
                FileChannel channel = fileInputStream.getChannel();
                BufferedSource buffer = Okio.buffer(Okio.source((InputStream) fileInputStream));
                boolean z = false;
                long indexOf = buffer.indexOf(0);
                String readUtf8 = buffer.readUtf8(indexOf);
                HprofVersion hprofVersion = (HprofVersion) Hprof.f123812e.get(readUtf8);
                if (hprofVersion != null) {
                    z = true;
                }
                if (z) {
                    buffer.skip(1);
                    int readInt = buffer.readInt();
                    long readLong = buffer.readLong();
                    C48821m mVar = new C48821m(buffer, readInt, indexOf + 1 + 4 + 8);
                    C7573i.m23582a((Object) channel, "channel");
                    Hprof hprof = new Hprof(channel, buffer, mVar, readLong, hprofVersion, length, null);
                    return hprof;
                }
                StringBuilder sb = new StringBuilder("Unsupported Hprof version [");
                sb.append(readUtf8);
                sb.append("] not in supported list ");
                sb.append(Hprof.f123812e.keySet());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            throw new IllegalArgumentException("Hprof file is 0 byte length");
        }
    }

    public final void close() {
        this.f123819h.close();
    }

    static {
        HprofVersion[] values = HprofVersion.values();
        Collection arrayList = new ArrayList(values.length);
        for (HprofVersion hprofVersion : values) {
            arrayList.add(C7579l.m23633a(hprofVersion.getVersionString(), hprofVersion));
        }
        f123812e = C7507ae.m23388a((Iterable<? extends Pair<? extends K, ? extends V>>) (List) arrayList);
    }

    /* renamed from: a */
    public final void mo123383a(long j) {
        if (this.f123814a.f124112a != j) {
            this.f123819h.buffer().clear();
            this.f123818g.position(j);
            this.f123814a.f124112a = j;
        }
    }

    private Hprof(FileChannel fileChannel, BufferedSource bufferedSource, C48821m mVar, long j, HprofVersion hprofVersion, long j2) {
        this.f123818g = fileChannel;
        this.f123819h = bufferedSource;
        this.f123814a = mVar;
        this.f123815b = j;
        this.f123816c = hprofVersion;
        this.f123817d = j2;
    }

    public /* synthetic */ Hprof(FileChannel fileChannel, BufferedSource bufferedSource, C48821m mVar, long j, HprofVersion hprofVersion, long j2, C7571f fVar) {
        this(fileChannel, bufferedSource, mVar, j, hprofVersion, j2);
    }
}
