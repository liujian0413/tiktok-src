package kotlin.p1884io;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;

/* renamed from: kotlin.io.m */
public final class C47991m {

    /* renamed from: kotlin.io.m$a */
    static final class C47992a extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f122834a;

        C47992a(ArrayList arrayList) {
            this.f122834a = arrayList;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m148955a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m148955a(String str) {
            C7573i.m23587b(str, "it");
            this.f122834a.add(str);
        }
    }

    /* renamed from: b */
    public static final String m148954b(Reader reader) {
        C7573i.m23587b(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        m148949a(reader, stringWriter, VideoCacheReadBuffersizeExperiment.DEFAULT);
        String stringWriter2 = stringWriter.toString();
        C7573i.m23582a((Object) stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    /* renamed from: a */
    public static final List<String> m148951a(Reader reader) {
        C7573i.m23587b(reader, "$this$readLines");
        ArrayList arrayList = new ArrayList();
        m148953a(reader, new C47992a(arrayList));
        return arrayList;
    }

    /* renamed from: a */
    public static final C7604g<String> m148952a(BufferedReader bufferedReader) {
        C7573i.m23587b(bufferedReader, "$this$lineSequence");
        return C7605h.m23643b(new C47989l(bufferedReader));
    }

    /* renamed from: a */
    private static void m148953a(Reader reader, C7562b<? super String, C7581n> bVar) {
        BufferedReader bufferedReader;
        Throwable th;
        C7573i.m23587b(reader, "$this$forEachLine");
        C7573i.m23587b(bVar, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, VideoCacheReadBuffersizeExperiment.DEFAULT);
        }
        Closeable closeable = bufferedReader;
        try {
            Iterator a = m148952a((BufferedReader) closeable).mo19416a();
            while (a.hasNext()) {
                bVar.invoke(a.next());
            }
            C47973b.m148917a(closeable, null);
        } catch (Throwable th2) {
            C47973b.m148917a(closeable, th);
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static long m148949a(Reader reader, Writer writer, int i) {
        C7573i.m23587b(reader, "$this$copyTo");
        C7573i.m23587b(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }
}
