package android.support.p022v4.app;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0070y;
import android.os.Bundle;
import android.os.Looper;
import android.support.p022v4.app.C0650v.C0651a;
import android.support.p022v4.content.C0685d;
import android.support.p022v4.content.C0685d.C0687b;
import android.support.p022v4.util.C0891c;
import android.support.p022v4.util.C0905l;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
final class LoaderManagerImpl extends C0650v {

    /* renamed from: a */
    private final C0043i f2227a;

    /* renamed from: b */
    private final LoaderViewModel f2228b;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderInfo */
    public static class LoaderInfo<D> extends C0052o<D> implements C0687b<D> {

        /* renamed from: a */
        public final C0685d<D> f2229a;

        /* renamed from: b */
        private final int f2230b;

        /* renamed from: c */
        private final Bundle f2231c;

        /* renamed from: d */
        private C0043i f2232d;

        /* renamed from: e */
        private C0572a<D> f2233e;

        /* renamed from: f */
        private C0685d<D> f2234f;

        public void onActive() {
            this.f2229a.mo2823l();
        }

        public void onInactive() {
            this.f2229a.mo2826o();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2487a() {
            C0043i iVar = this.f2232d;
            C0572a<D> aVar = this.f2233e;
            if (iVar != null && aVar != null) {
                super.removeObserver(aVar);
                observe(iVar, aVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2230b);
            sb.append(" : ");
            C0891c.m3790a(this.f2229a, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void removeObserver(C0053p<? super D> pVar) {
            super.removeObserver(pVar);
            this.f2232d = null;
            this.f2233e = null;
        }

        public void setValue(D d) {
            super.setValue(d);
            if (this.f2234f != null) {
                this.f2234f.mo2828q();
                this.f2234f = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0685d<D> mo2486a(boolean z) {
            this.f2229a.mo2824m();
            this.f2229a.mo2827p();
            C0572a<D> aVar = this.f2233e;
            if (aVar != null) {
                removeObserver(aVar);
                aVar.mo2498a();
            }
            this.f2229a.mo2822a(this);
            this.f2229a.mo2828q();
            return this.f2234f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0685d<D> mo2485a(C0043i iVar, C0651a<D> aVar) {
            C0572a<D> aVar2 = new C0572a<>(this.f2229a, aVar);
            observe(iVar, aVar2);
            if (this.f2233e != null) {
                removeObserver(this.f2233e);
            }
            this.f2232d = iVar;
            this.f2233e = aVar2;
            return this.f2229a;
        }

        /* renamed from: a */
        public final void mo2488a(C0685d<D> dVar, D d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
            } else {
                postValue(d);
            }
        }

        LoaderInfo(int i, Bundle bundle, C0685d<D> dVar, C0685d<D> dVar2) {
            this.f2230b = i;
            this.f2231c = bundle;
            this.f2229a = dVar;
            this.f2234f = dVar2;
            this.f2229a.mo2821a(i, this);
        }

        /* renamed from: a */
        public final void mo2489a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2230b);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2231c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f2229a);
            C0685d<D> dVar = this.f2229a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            dVar.mo2778a(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.f2233e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f2233e);
                C0572a<D> aVar = this.f2233e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("  ");
                aVar.mo2499a(sb2.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(C0685d.m2920c(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends C0063u {

        /* renamed from: b */
        private static final C0067b f2235b = new C0067b() {
            /* renamed from: a */
            public final <T extends C0063u> T mo149a(Class<T> cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: a */
        public boolean f2236a = false;

        /* renamed from: c */
        private C0905l<LoaderInfo> f2237c = new C0905l<>();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2492a() {
            this.f2236a = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo2495b() {
            this.f2236a = false;
        }

        LoaderViewModel() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo2497c() {
            int b = this.f2237c.mo3435b();
            for (int i = 0; i < b; i++) {
                ((LoaderInfo) this.f2237c.mo3443e(i)).mo2487a();
            }
        }

        public void onCleared() {
            super.onCleared();
            int b = this.f2237c.mo3435b();
            for (int i = 0; i < b; i++) {
                ((LoaderInfo) this.f2237c.mo3443e(i)).mo2486a(true);
            }
            this.f2237c.mo3438c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo2496b(int i) {
            this.f2237c.mo3436b(i);
        }

        /* renamed from: a */
        static LoaderViewModel m2347a(C0070y yVar) {
            return (LoaderViewModel) new C0065w(yVar, f2235b).mo147a(LoaderViewModel.class);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final <D> LoaderInfo<D> mo2491a(int i) {
            return (LoaderInfo) this.f2237c.mo3433a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2493a(int i, LoaderInfo loaderInfo) {
            this.f2237c.mo3437b(i, loaderInfo);
        }

        /* renamed from: a */
        public final void mo2494a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2237c.mo3435b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                for (int i = 0; i < this.f2237c.mo3435b(); i++) {
                    LoaderInfo loaderInfo = (LoaderInfo) this.f2237c.mo3443e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2237c.mo3442d(i));
                    printWriter.print(": ");
                    printWriter.println(loaderInfo.toString());
                    loaderInfo.mo2489a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    static class C0572a<D> implements C0053p<D> {

        /* renamed from: a */
        public boolean f2238a;

        /* renamed from: b */
        private final C0685d<D> f2239b;

        /* renamed from: c */
        private final C0651a<D> f2240c;

        public final String toString() {
            return this.f2240c.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2498a() {
            if (this.f2238a) {
                this.f2240c.mo2759a(this.f2239b);
            }
        }

        public final void onChanged(D d) {
            this.f2240c.mo2760a(this.f2239b, d);
            this.f2238a = true;
        }

        C0572a(C0685d<D> dVar, C0651a<D> aVar) {
            this.f2239b = dVar;
            this.f2240c = aVar;
        }

        /* renamed from: a */
        public final void mo2499a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f2238a);
        }
    }

    /* renamed from: a */
    public final void mo2481a() {
        this.f2228b.mo2497c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0891c.m3790a(this.f2227a, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo2482a(int i) {
        if (this.f2228b.f2236a) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            LoaderInfo a = this.f2228b.mo2491a(i);
            if (a != null) {
                a.mo2486a(true);
                this.f2228b.mo2496b(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    LoaderManagerImpl(C0043i iVar, C0070y yVar) {
        this.f2227a = iVar;
        this.f2228b = LoaderViewModel.m2347a(yVar);
    }

    /* renamed from: a */
    public final <D> C0685d<D> mo2480a(int i, Bundle bundle, C0651a<D> aVar) {
        if (this.f2228b.f2236a) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            LoaderInfo a = this.f2228b.mo2491a(i);
            if (a == null) {
                return m2337a(i, bundle, aVar, null);
            }
            return a.mo2485a(this.f2227a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: a */
    public final void mo2483a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2228b.mo2494a(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private <D> C0685d<D> m2337a(int i, Bundle bundle, C0651a<D> aVar, C0685d<D> dVar) {
        try {
            this.f2228b.mo2492a();
            C0685d a = aVar.mo2758a(i, bundle);
            if (a != null) {
                if (a.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a.getClass().getModifiers())) {
                        StringBuilder sb = new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        sb.append(a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                LoaderInfo loaderInfo = new LoaderInfo(i, bundle, a, null);
                this.f2228b.mo2493a(i, loaderInfo);
                this.f2228b.mo2495b();
                return loaderInfo.mo2485a(this.f2227a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f2228b.mo2495b();
            throw th;
        }
    }
}
