package com.facebook.datasource;

/* renamed from: com.facebook.datasource.b */
public abstract class C13345b<T> implements C13349e<T> {
    public void onCancellation(C13346c<T> cVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void onFailureImpl(C13346c<T> cVar);

    /* access modifiers changed from: protected */
    public abstract void onNewResultImpl(C13346c<T> cVar);

    public void onProgressUpdate(C13346c<T> cVar) {
    }

    public void onFailure(C13346c<T> cVar) {
        try {
            onFailureImpl(cVar);
        } finally {
            cVar.mo32644g();
        }
    }

    public void onNewResult(C13346c<T> cVar) {
        boolean b = cVar.mo32639b();
        try {
            onNewResultImpl(cVar);
        } finally {
            if (b) {
                cVar.mo32644g();
            }
        }
    }
}
