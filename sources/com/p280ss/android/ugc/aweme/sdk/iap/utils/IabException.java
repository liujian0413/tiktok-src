package com.p280ss.android.ugc.aweme.sdk.iap.utils;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.IabException */
public class IabException extends Exception {
    C37369a mResult;

    public C37369a getResult() {
        return this.mResult;
    }

    public IabException(C37369a aVar) {
        this(aVar, (Exception) null);
    }

    public IabException(int i, String str) {
        this(new C37369a(i, str));
    }

    public IabException(C37369a aVar, Exception exc) {
        super(aVar.f97593b, exc);
        this.mResult = aVar;
    }

    public IabException(int i, String str, Exception exc) {
        this(new C37369a(i, str), exc);
    }
}
