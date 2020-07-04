package com.google.android.gms.auth.api.p745a;

import android.content.Context;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15029g;
import com.google.android.gms.common.api.C15034c;
import com.google.android.gms.common.api.internal.C15049a;
import com.google.android.gms.common.api.internal.C15145l;
import com.google.android.gms.internal.p760b.C16347h;
import com.google.android.gms.tasks.C17057f;

/* renamed from: com.google.android.gms.auth.api.a.b */
public abstract class C14945b extends C15034c<Object> {

    /* renamed from: i */
    private static final C15029g<C16347h> f38660i = new C15029g<>();

    /* renamed from: j */
    private static final C15018a<C16347h, Object> f38661j = new C14946c();

    /* renamed from: k */
    private static final C15017a<Object> f38662k = new C15017a<>("SmsRetriever.API", f38661j, f38660i);

    public C14945b(Context context) {
        super(context, f38662k, null, (C15145l) new C15049a());
    }

    /* renamed from: a */
    public abstract C17057f<Void> mo38025a();
}
