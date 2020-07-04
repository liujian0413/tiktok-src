package com.p280ss.android.ugc.aweme.utils;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.utils.ab */
public final class C42914ab {

    /* renamed from: a */
    public Bundle f111445a = new Bundle();

    /* renamed from: a */
    public static C42914ab m136242a() {
        return new C42914ab();
    }

    /* renamed from: a */
    public final C42914ab mo104629a(String str, float f) {
        this.f111445a.putFloat(str, 0.1f);
        return this;
    }

    /* renamed from: a */
    public final C42914ab mo104630a(String str, int i) {
        this.f111445a.putInt(str, i);
        return this;
    }

    /* renamed from: a */
    public final C42914ab mo104631a(String str, Parcelable parcelable) {
        this.f111445a.putParcelable(str, parcelable);
        return this;
    }

    /* renamed from: a */
    public final C42914ab mo104632a(String str, Serializable serializable) {
        this.f111445a.putSerializable(str, serializable);
        return this;
    }

    /* renamed from: a */
    public final C42914ab mo104633a(String str, String str2) {
        this.f111445a.putString(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C42914ab mo104634a(String str, boolean z) {
        this.f111445a.putBoolean(str, z);
        return this;
    }

    /* renamed from: a */
    public final C42914ab mo104635a(String str, String[] strArr) {
        this.f111445a.putStringArray(str, strArr);
        return this;
    }
}
