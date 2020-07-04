package android.support.p022v4.app;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0071z;
import android.os.Bundle;
import android.support.p022v4.content.C0685d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.v */
public abstract class C0650v {

    /* renamed from: android.support.v4.app.v$a */
    public interface C0651a<D> {
        /* renamed from: a */
        C0685d<D> mo2758a(int i, Bundle bundle);

        /* renamed from: a */
        void mo2759a(C0685d<D> dVar);

        /* renamed from: a */
        void mo2760a(C0685d<D> dVar, D d);
    }

    /* renamed from: a */
    public abstract <D> C0685d<D> mo2480a(int i, Bundle bundle, C0651a<D> aVar);

    /* renamed from: a */
    public abstract void mo2481a();

    /* renamed from: a */
    public abstract void mo2482a(int i);

    /* renamed from: a */
    public abstract void mo2483a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public static <T extends C0043i & C0071z> C0650v m2811a(T t) {
        return new LoaderManagerImpl(t, ((C0071z) t).getViewModelStore());
    }
}
