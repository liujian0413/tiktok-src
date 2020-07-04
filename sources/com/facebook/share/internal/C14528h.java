package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.C13962w;

/* renamed from: com.facebook.share.internal.h */
final class C14528h extends C13962w {

    /* renamed from: c */
    private String f37550c;

    /* renamed from: a */
    public final void mo33610a(Bundle bundle) {
        bundle.putString("com.facebook.platform.extra.OBJECT_ID", this.f37550c);
    }

    C14528h(Context context, String str, String str2) {
        super(context, 65542, 65543, 20141001, str);
        this.f37550c = str2;
    }
}
