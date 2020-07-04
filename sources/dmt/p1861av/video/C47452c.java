package dmt.p1861av.video;

import android.content.Context;
import android.os.Environment;
import com.google.common.p784io.C18110f;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader.C20488d;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.c */
public final class C47452c implements C20488d {

    /* renamed from: a */
    public static final C47453a f121853a = new C47453a(null);

    /* renamed from: b */
    private final ArrayList<String> f121854b = new ArrayList<>();

    /* renamed from: c */
    private final Context f121855c;

    /* renamed from: d */
    private final C20488d f121856d;

    /* renamed from: dmt.av.video.c$a */
    public static final class C47453a {
        private C47453a() {
        }

        public /* synthetic */ C47453a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: dmt.av.video.c$b */
    static final class C47454b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f121857a;

        C47454b(String str) {
            this.f121857a = str;
        }

        public final boolean accept(File file, String str) {
            return C7573i.m23585a((Object) str, (Object) this.f121857a);
        }
    }

    /* renamed from: a */
    private final File m148166a() {
        return new File(this.f121855c.getFilesDir(), "external_library");
    }

    /* renamed from: b */
    private final void m148169b() {
        File a = m148166a();
        if (a.exists()) {
            C7276d.m22810b(a);
        }
    }

    /* renamed from: a */
    private final boolean m148167a(String str) {
        if (this.f121854b.contains(str)) {
            return true;
        }
        String b = m148168b(str);
        if (b == null) {
            return this.f121856d.mo55402a(C7525m.m23457a(str));
        }
        try {
            C47455d.m148171a(b);
            this.f121854b.add(str);
        } catch (UnsatisfiedLinkError unused) {
        }
        return true;
    }

    /* renamed from: b */
    private final String m148168b(String str) {
        boolean z;
        String str2;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File a = m148166a();
        if (!a.exists() && !a.mkdirs()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("lib");
        sb.append(str);
        sb.append(".so");
        String sb2 = sb.toString();
        File[] listFiles = externalStorageDirectory.listFiles(new C47454b(sb2));
        C7573i.m23582a((Object) listFiles, "files");
        if (listFiles.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            return null;
        }
        File file = new File(a, sb2);
        try {
            C18110f.m59868a(file);
            C18110f.m59869a(listFiles[0], file);
            str2 = file.getPath();
        } catch (IOException unused) {
            str2 = null;
        }
        return str2;
    }

    /* renamed from: a */
    public final boolean mo55402a(List<String> list) {
        C7573i.m23587b(list, "list");
        boolean z = true;
        for (String a : list) {
            if (!m148167a(a)) {
                z = false;
            }
        }
        return z;
    }

    public C47452c(Context context, C20488d dVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(dVar, "wrappedLibraryLoader");
        this.f121855c = context;
        this.f121856d = dVar;
        m148169b();
    }
}
