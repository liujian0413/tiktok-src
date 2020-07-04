package com.p280ss.base.p1785a;

import android.os.AsyncTask;

/* renamed from: com.ss.base.a.b */
public final class C45774b<Result> {

    /* renamed from: a */
    private C45775a<Result> f117106a = new C45775a<>(0);

    /* renamed from: com.ss.base.a.b$a */
    static class C45775a<Result> extends AsyncTask<Void, Void, C45773a<Result>> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C45777d<Result> f117107a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C45776c<Result> f117108b;

        private C45775a() {
        }

        /* synthetic */ C45775a(byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            C45773a aVar = new C45773a();
            this.f117107a.mo110978a(aVar);
            return aVar;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            C45773a aVar = (C45773a) obj;
            if (this.f117108b != null) {
                if (aVar.f117105c) {
                    this.f117108b.mo110977a(aVar.f117103a);
                    return;
                }
                this.f117108b.mo110976a();
            }
        }
    }

    /* renamed from: a */
    public static <Result> C45774b<Result> m143724a(C45777d<Result> dVar) {
        return new C45774b<>(dVar);
    }

    /* renamed from: a */
    public final void mo110973a(C45776c<Result> cVar) {
        this.f117106a.f117108b = cVar;
        this.f117106a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private C45774b(C45777d<Result> dVar) {
        this.f117106a.f117107a = dVar;
    }
}
