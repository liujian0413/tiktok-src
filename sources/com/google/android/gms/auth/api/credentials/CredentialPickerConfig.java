package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CredentialPickerConfig> CREATOR = new C14959d();

    /* renamed from: a */
    public final boolean f38707a;

    /* renamed from: b */
    public final boolean f38708b;

    /* renamed from: c */
    private final int f38709c;

    /* renamed from: d */
    private final boolean f38710d;

    /* renamed from: e */
    private final int f38711e;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C14954a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f38712a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f38713b = true;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f38714c = 1;

        /* renamed from: a */
        public final C14954a mo38049a(boolean z) {
            this.f38713b = true;
            return this;
        }

        /* renamed from: a */
        public final CredentialPickerConfig mo38050a() {
            return new CredentialPickerConfig(this);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [int] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1
      assigns: [?[boolean, int, float, short, byte, char], ?[int, float, short, byte, char], ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [boolean, int]
      mth insns count: 17
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CredentialPickerConfig(int r2, boolean r3, boolean r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            r1.f38709c = r2
            r1.f38707a = r3
            r1.f38708b = r4
            r3 = 1
            r4 = 3
            r0 = 2
            if (r2 >= r0) goto L_0x0016
            r1.f38710d = r5
            if (r5 == 0) goto L_0x0013
            r3 = 3
        L_0x0013:
            r1.f38711e = r3
            return
        L_0x0016:
            if (r6 != r4) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r1.f38710d = r3
            r1.f38711e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.CredentialPickerConfig.<init>(int, boolean, boolean, boolean, int):void");
    }

    private CredentialPickerConfig(C14954a aVar) {
        this(2, aVar.f38712a, aVar.f38713b, false, aVar.f38714c);
    }

    /* renamed from: a */
    private boolean m43407a() {
        return this.f38711e == 3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44459a(parcel, 1, this.f38707a);
        C15269a.m44459a(parcel, 2, this.f38708b);
        C15269a.m44459a(parcel, 3, m43407a());
        C15269a.m44447a(parcel, 4, this.f38711e);
        C15269a.m44447a(parcel, 1000, this.f38709c);
        C15269a.m44443a(parcel, a);
    }
}
