package kotlin.p1884io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C48020o;
import kotlin.C7581n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C47903b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.sequences.C7604g;

/* renamed from: kotlin.io.e */
public final class C47976e implements C7604g<File> {

    /* renamed from: a */
    public final File f122809a;

    /* renamed from: b */
    public final FileWalkDirection f122810b;

    /* renamed from: c */
    public final C7562b<File, Boolean> f122811c;

    /* renamed from: d */
    public final C7562b<File, C7581n> f122812d;

    /* renamed from: e */
    public final C7563m<File, IOException, C7581n> f122813e;

    /* renamed from: f */
    public final int f122814f;

    /* renamed from: kotlin.io.e$a */
    static abstract class C47977a extends C47982c {
        public C47977a(File file) {
            C7573i.m23587b(file, "rootDir");
            super(file);
            if (C48020o.f122844a) {
                boolean isDirectory = file.isDirectory();
                if (C48020o.f122844a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    /* renamed from: kotlin.io.e$b */
    final class C47978b extends C47903b<File> {

        /* renamed from: b */
        private final ArrayDeque<C47982c> f122816b = new ArrayDeque<>();

        /* renamed from: kotlin.io.e$b$a */
        final class C47979a extends C47977a {

            /* renamed from: a */
            final /* synthetic */ C47978b f122817a;

            /* renamed from: c */
            private boolean f122818c;

            /* renamed from: d */
            private File[] f122819d;

            /* renamed from: e */
            private int f122820e;

            /* renamed from: f */
            private boolean f122821f;

            /* renamed from: a */
            public final File mo120175a() {
                if (!this.f122821f && this.f122819d == null) {
                    C7562b<File, Boolean> bVar = C47976e.this.f122811c;
                    if (bVar != null && !((Boolean) bVar.invoke(this.f122828b)).booleanValue()) {
                        return null;
                    }
                    this.f122819d = this.f122828b.listFiles();
                    if (this.f122819d == null) {
                        C7563m<File, IOException, C7581n> mVar = C47976e.this.f122813e;
                        if (mVar != null) {
                            File file = this.f122828b;
                            AccessDeniedException accessDeniedException = new AccessDeniedException(this.f122828b, null, "Cannot list files in a directory", 2, null);
                            mVar.invoke(file, accessDeniedException);
                        }
                        this.f122821f = true;
                    }
                }
                if (this.f122819d != null) {
                    int i = this.f122820e;
                    File[] fileArr = this.f122819d;
                    if (fileArr == null) {
                        C7573i.m23580a();
                    }
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f122819d;
                        if (fileArr2 == null) {
                            C7573i.m23580a();
                        }
                        int i2 = this.f122820e;
                        this.f122820e = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f122818c) {
                    this.f122818c = true;
                    return this.f122828b;
                }
                C7562b<File, C7581n> bVar2 = C47976e.this.f122812d;
                if (bVar2 != null) {
                    bVar2.invoke(this.f122828b);
                }
                return null;
            }

            public C47979a(C47978b bVar, File file) {
                C7573i.m23587b(file, "rootDir");
                this.f122817a = bVar;
                super(file);
            }
        }

        /* renamed from: kotlin.io.e$b$b */
        final class C47980b extends C47982c {

            /* renamed from: a */
            final /* synthetic */ C47978b f122822a;

            /* renamed from: c */
            private boolean f122823c;

            /* renamed from: a */
            public final File mo120175a() {
                if (this.f122823c) {
                    return null;
                }
                this.f122823c = true;
                return this.f122828b;
            }

            public C47980b(C47978b bVar, File file) {
                C7573i.m23587b(file, "rootFile");
                this.f122822a = bVar;
                super(file);
                if (C48020o.f122844a) {
                    boolean isFile = file.isFile();
                    if (C48020o.f122844a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }
        }

        /* renamed from: kotlin.io.e$b$c */
        final class C47981c extends C47977a {

            /* renamed from: a */
            final /* synthetic */ C47978b f122824a;

            /* renamed from: c */
            private boolean f122825c;

            /* renamed from: d */
            private File[] f122826d;

            /* renamed from: e */
            private int f122827e;

            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
                if (r0.length == 0) goto L_0x0079;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.io.File mo120175a() {
                /*
                    r10 = this;
                    boolean r0 = r10.f122825c
                    r1 = 0
                    if (r0 != 0) goto L_0x0022
                    kotlin.io.e$b r0 = r10.f122824a
                    kotlin.io.e r0 = kotlin.p1884io.C47976e.this
                    kotlin.jvm.a.b<java.io.File, java.lang.Boolean> r0 = r0.f122811c
                    if (r0 == 0) goto L_0x001c
                    java.io.File r2 = r10.f122828b
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x001c
                    return r1
                L_0x001c:
                    r0 = 1
                    r10.f122825c = r0
                    java.io.File r0 = r10.f122828b
                    return r0
                L_0x0022:
                    java.io.File[] r0 = r10.f122826d
                    if (r0 == 0) goto L_0x0041
                    int r0 = r10.f122827e
                    java.io.File[] r2 = r10.f122826d
                    if (r2 != 0) goto L_0x002f
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x002f:
                    int r2 = r2.length
                    if (r0 >= r2) goto L_0x0033
                    goto L_0x0041
                L_0x0033:
                    kotlin.io.e$b r0 = r10.f122824a
                    kotlin.io.e r0 = kotlin.p1884io.C47976e.this
                    kotlin.jvm.a.b<java.io.File, kotlin.n> r0 = r0.f122812d
                    if (r0 == 0) goto L_0x0040
                    java.io.File r2 = r10.f122828b
                    r0.invoke(r2)
                L_0x0040:
                    return r1
                L_0x0041:
                    java.io.File[] r0 = r10.f122826d
                    if (r0 != 0) goto L_0x0087
                    java.io.File r0 = r10.f122828b
                    java.io.File[] r0 = r0.listFiles()
                    r10.f122826d = r0
                    java.io.File[] r0 = r10.f122826d
                    if (r0 != 0) goto L_0x006b
                    kotlin.io.e$b r0 = r10.f122824a
                    kotlin.io.e r0 = kotlin.p1884io.C47976e.this
                    kotlin.jvm.a.m<java.io.File, java.io.IOException, kotlin.n> r0 = r0.f122813e
                    if (r0 == 0) goto L_0x006b
                    java.io.File r2 = r10.f122828b
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.f122828b
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x006b:
                    java.io.File[] r0 = r10.f122826d
                    if (r0 == 0) goto L_0x0079
                    java.io.File[] r0 = r10.f122826d
                    if (r0 != 0) goto L_0x0076
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0076:
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0087
                L_0x0079:
                    kotlin.io.e$b r0 = r10.f122824a
                    kotlin.io.e r0 = kotlin.p1884io.C47976e.this
                    kotlin.jvm.a.b<java.io.File, kotlin.n> r0 = r0.f122812d
                    if (r0 == 0) goto L_0x0086
                    java.io.File r2 = r10.f122828b
                    r0.invoke(r2)
                L_0x0086:
                    return r1
                L_0x0087:
                    java.io.File[] r0 = r10.f122826d
                    if (r0 != 0) goto L_0x008e
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x008e:
                    int r1 = r10.f122827e
                    int r2 = r1 + 1
                    r10.f122827e = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p1884io.C47976e.C47978b.C47981c.mo120175a():java.io.File");
            }

            public C47981c(C47978b bVar, File file) {
                C7573i.m23587b(file, "rootDir");
                this.f122824a = bVar;
                super(file);
            }
        }

        /* renamed from: a */
        public final void mo120073a() {
            File c = m148923c();
            if (c != null) {
                mo120074a(c);
            } else {
                mo120075b();
            }
        }

        /* renamed from: c */
        private final File m148923c() {
            File a;
            while (true) {
                C47982c cVar = (C47982c) this.f122816b.peek();
                if (cVar == null) {
                    return null;
                }
                a = cVar.mo120175a();
                if (a == null) {
                    this.f122816b.pop();
                } else if (C7573i.m23585a((Object) a, (Object) cVar.f122828b) || !a.isDirectory() || this.f122816b.size() >= C47976e.this.f122814f) {
                    return a;
                } else {
                    this.f122816b.push(m148922a(a));
                }
            }
            return a;
        }

        public C47978b() {
            if (C47976e.this.f122809a.isDirectory()) {
                this.f122816b.push(m148922a(C47976e.this.f122809a));
            } else if (C47976e.this.f122809a.isFile()) {
                this.f122816b.push(new C47980b(this, C47976e.this.f122809a));
            } else {
                mo120075b();
            }
        }

        /* renamed from: a */
        private final C47977a m148922a(File file) {
            switch (C47983f.f122829a[C47976e.this.f122810b.ordinal()]) {
                case 1:
                    return new C47981c(this, file);
                case 2:
                    return new C47979a(this, file);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: kotlin.io.e$c */
    static abstract class C47982c {

        /* renamed from: b */
        public final File f122828b;

        /* renamed from: a */
        public abstract File mo120175a();

        public C47982c(File file) {
            C7573i.m23587b(file, "root");
            this.f122828b = file;
        }
    }

    /* renamed from: a */
    public final Iterator<File> mo19416a() {
        return new C47978b<>();
    }

    public C47976e(File file, FileWalkDirection fileWalkDirection) {
        C7573i.m23587b(file, "start");
        C7573i.m23587b(fileWalkDirection, "direction");
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
    }

    private C47976e(File file, FileWalkDirection fileWalkDirection, C7562b<? super File, Boolean> bVar, C7562b<? super File, C7581n> bVar2, C7563m<? super File, ? super IOException, C7581n> mVar, int i) {
        this.f122809a = file;
        this.f122810b = fileWalkDirection;
        this.f122811c = bVar;
        this.f122812d = bVar2;
        this.f122813e = mVar;
        this.f122814f = i;
    }

    private /* synthetic */ C47976e(File file, FileWalkDirection fileWalkDirection, C7562b bVar, C7562b bVar2, C7563m mVar, int i, int i2, C7571f fVar) {
        this(file, fileWalkDirection, null, null, null, Integer.MAX_VALUE);
    }
}
