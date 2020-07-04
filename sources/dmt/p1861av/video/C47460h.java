package dmt.p1861av.video;

import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.p255e.C6326a;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader.C20488d;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.h */
public final class C47460h implements C20488d {
    /* renamed from: a */
    public final boolean mo55402a(List<String> list) {
        C7573i.m23587b(list, "list");
        try {
            for (String a : list) {
                C6326a.m19641a(a);
            }
        } catch (Throwable th) {
            C2077a.m9161a(th, "VESDK load so");
        }
        return true;
    }
}
