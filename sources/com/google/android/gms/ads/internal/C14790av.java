package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.bdt;
import com.google.android.gms.internal.ads.bym;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.internal.av */
final class C14790av extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private final /* synthetic */ C14786ar f38208a;

    private C14790av(C14786ar arVar) {
        this.f38208a = arVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            this.f38208a.f38203h = (bdt) this.f38208a.f38198c.get(((Long) bym.m50299d().mo41272a(C15585bw.f43891cf)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            afm.m45780c("", e);
        }
        return this.f38208a.mo37687c();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f38208a.f38201f != null && str != null) {
            C14791aw.m42893a(this.f38208a.f38201f, str);
        }
    }

    /* synthetic */ C14790av(C14786ar arVar, C14787as asVar) {
        this(arVar);
    }
}
