package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C14954a;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<HintRequest> CREATOR = new C14962g();

    /* renamed from: a */
    public final CredentialPickerConfig f38724a;

    /* renamed from: b */
    public final boolean f38725b;

    /* renamed from: c */
    public final String[] f38726c;

    /* renamed from: d */
    public final boolean f38727d;

    /* renamed from: e */
    public final String f38728e;

    /* renamed from: f */
    public final String f38729f;

    /* renamed from: g */
    private final int f38730g;

    /* renamed from: h */
    private final boolean f38731h;

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    public static final class C14955a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f38732a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f38733b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String[] f38734c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CredentialPickerConfig f38735d = new C14954a().mo38050a();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f38736e = false;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f38737f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f38738g;

        /* renamed from: a */
        public final C14955a mo38054a(boolean z) {
            this.f38733b = true;
            return this;
        }

        /* renamed from: a */
        public final C14955a mo38053a(CredentialPickerConfig credentialPickerConfig) {
            this.f38735d = (CredentialPickerConfig) C15267r.m44384a(credentialPickerConfig);
            return this;
        }

        /* renamed from: a */
        public final HintRequest mo38055a() {
            if (this.f38734c == null) {
                this.f38734c = new String[0];
            }
            if (this.f38732a || this.f38733b || this.f38734c.length != 0) {
                return new HintRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
    }

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f38730g = i;
        this.f38724a = (CredentialPickerConfig) C15267r.m44384a(credentialPickerConfig);
        this.f38725b = z;
        this.f38731h = z2;
        this.f38726c = (String[]) C15267r.m44384a(strArr);
        if (this.f38730g < 2) {
            this.f38727d = true;
            this.f38728e = null;
            this.f38729f = null;
            return;
        }
        this.f38727d = z3;
        this.f38728e = str;
        this.f38729f = str2;
    }

    private HintRequest(C14955a aVar) {
        this(2, aVar.f38735d, aVar.f38732a, aVar.f38733b, aVar.f38734c, aVar.f38736e, aVar.f38737f, aVar.f38738g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 1, (Parcelable) this.f38724a, i, false);
        C15269a.m44459a(parcel, 2, this.f38725b);
        C15269a.m44459a(parcel, 3, this.f38731h);
        C15269a.m44462a(parcel, 4, this.f38726c, false);
        C15269a.m44459a(parcel, 5, this.f38727d);
        C15269a.m44457a(parcel, 6, this.f38728e, false);
        C15269a.m44457a(parcel, 7, this.f38729f, false);
        C15269a.m44447a(parcel, 1000, this.f38730g);
        C15269a.m44443a(parcel, a);
    }
}
