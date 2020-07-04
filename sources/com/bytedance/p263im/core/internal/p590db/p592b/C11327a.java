package com.bytedance.p263im.core.internal.p590db.p592b;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import com.bytedance.p263im.core.internal.p590db.p592b.C11351d.C11352a;
import com.bytedance.p263im.core.internal.p590db.p592b.p593a.C11330a;

/* renamed from: com.bytedance.im.core.internal.db.b.a */
public abstract class C11327a implements C11330a {

    /* renamed from: a */
    protected final Context f30694a;

    /* renamed from: b */
    public final String f30695b;

    /* renamed from: c */
    public final C11352a f30696c;

    /* renamed from: d */
    private final int f30697d;

    /* renamed from: e */
    private final DatabaseErrorHandler f30698e;

    /* renamed from: f */
    private final String f30699f;

    /* renamed from: g */
    private C11330a f30700g;

    /* renamed from: a */
    public abstract C11330a mo27327a();

    /* renamed from: a */
    public final void mo27331a(C11330a aVar) {
    }

    /* renamed from: a */
    public void mo27328a(C11351d dVar) {
    }

    /* renamed from: a */
    public void mo27329a(C11351d dVar, int i, int i2) {
    }

    /* renamed from: b */
    public void mo27330b(C11351d dVar, int i, int i2) {
    }

    /* renamed from: d */
    public final C11351d mo27334d() {
        return null;
    }

    /* renamed from: b */
    public final C11351d mo27332b() {
        return this.f30700g.mo27334d();
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.sqlite.SQLiteDatabase$CursorFactory] */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.bytedance.im.core.internal.db.b.a$2] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r7v0, types: [com.tencent.wcdb.database.SQLiteDatabase$a] */
    /* JADX WARNING: type inference failed for: r2v6, types: [com.bytedance.im.core.internal.db.b.a$1] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.bytedance.im.core.internal.db.b.a$1, com.bytedance.im.core.internal.db.b.a$2]
      uses: [android.database.sqlite.SQLiteDatabase$CursorFactory, ?[OBJECT, ARRAY]]
      mth insns count: 38
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27333c() {
        /*
            r9 = this;
            com.bytedance.im.core.internal.db.b.a.a r0 = r9.mo27327a()
            com.bytedance.im.core.a.c r1 = com.bytedance.p263im.core.p584a.C11198c.m32777a()
            com.bytedance.im.core.a.e r1 = r1.mo27248b()
            boolean r1 = r1.f30405e
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.bytedance.im.core.internal.db.b.d$a r1 = r9.f30696c
            if (r1 == 0) goto L_0x001a
            com.bytedance.im.core.internal.db.b.a$1 r2 = new com.bytedance.im.core.internal.db.b.a$1
            r2.<init>()
        L_0x001a:
            r7 = r2
            java.lang.String r1 = r9.f30699f
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0031
            com.bytedance.im.core.internal.db.b.a.f r1 = new com.bytedance.im.core.internal.db.b.a.f
            android.content.Context r2 = r9.f30694a
            java.lang.String r3 = r9.f30695b
            int r4 = r9.f30697d
            r1.<init>(r2, r3, r7, r4)
            r9.f30700g = r1
            goto L_0x005c
        L_0x0031:
            com.bytedance.im.core.internal.db.b.a.f r1 = new com.bytedance.im.core.internal.db.b.a.f
            android.content.Context r4 = r9.f30694a
            java.lang.String r5 = r9.f30695b
            java.lang.String r2 = r9.f30699f
            byte[] r6 = r2.getBytes()
            int r8 = r9.f30697d
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f30700g = r1
            goto L_0x005c
        L_0x0046:
            com.bytedance.im.core.internal.db.b.d$a r1 = r9.f30696c
            if (r1 == 0) goto L_0x004f
            com.bytedance.im.core.internal.db.b.a$2 r2 = new com.bytedance.im.core.internal.db.b.a$2
            r2.<init>()
        L_0x004f:
            com.bytedance.im.core.internal.db.b.a.e r1 = new com.bytedance.im.core.internal.db.b.a.e
            android.content.Context r3 = r9.f30694a
            java.lang.String r4 = r9.f30695b
            int r5 = r9.f30697d
            r1.<init>(r3, r4, r2, r5)
            r9.f30700g = r1
        L_0x005c:
            com.bytedance.im.core.internal.db.b.a.a r1 = r9.f30700g
            r1.mo27331a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p263im.core.internal.p590db.p592b.C11327a.mo27333c():void");
    }

    public C11327a(Context context, String str, C11352a aVar, int i) {
        this(context, str, null, null, 16, null);
    }

    public C11327a(Context context, String str, String str2, C11352a aVar, int i) {
        this(context, str, str2, null, 16, null);
    }

    private C11327a(Context context, String str, String str2, C11352a aVar, int i, DatabaseErrorHandler databaseErrorHandler) {
        if (i > 0) {
            this.f30694a = context;
            this.f30695b = str;
            this.f30699f = str2;
            this.f30696c = aVar;
            this.f30697d = i;
            this.f30698e = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Version must be >= 1, was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
