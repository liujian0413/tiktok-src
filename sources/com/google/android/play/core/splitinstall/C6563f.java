package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.f */
public final class C6563f {

    /* renamed from: a */
    public final int f18874a;

    /* renamed from: b */
    public final int f18875b;

    /* renamed from: c */
    public final int f18876c;

    /* renamed from: d */
    public final long f18877d;

    /* renamed from: e */
    public final long f18878e;

    /* renamed from: f */
    public final PendingIntent f18879f;

    /* renamed from: g */
    List<Intent> f18880g;

    /* renamed from: h */
    private final List<String> f18881h;

    /* renamed from: i */
    private final List<String> f18882i;

    private C6563f(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.f18874a = i;
        this.f18875b = i2;
        this.f18876c = i3;
        this.f18877d = j;
        this.f18878e = j2;
        this.f18881h = list;
        this.f18882i = list2;
        this.f18879f = pendingIntent;
        this.f18880g = list3;
    }

    /* renamed from: a */
    public static C6563f m20385a(Bundle bundle) {
        C6563f fVar = new C6563f(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C6563f mo15925a(int i, int i2) {
        C6563f fVar = new C6563f(this.f18874a, i, i2, this.f18877d, this.f18878e, this.f18881h, this.f18882i, this.f18879f, this.f18880g);
        return fVar;
    }

    /* renamed from: a */
    public final List<String> mo15926a() {
        return this.f18881h != null ? new ArrayList(this.f18881h) : new ArrayList();
    }

    /* renamed from: b */
    public final List<String> mo15927b() {
        return this.f18882i != null ? new ArrayList(this.f18882i) : new ArrayList();
    }

    public final String toString() {
        int i = this.f18874a;
        int i2 = this.f18875b;
        int i3 = this.f18876c;
        long j = this.f18877d;
        long j2 = this.f18878e;
        String valueOf = String.valueOf(this.f18881h);
        String valueOf2 = String.valueOf(this.f18882i);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 193 + String.valueOf(valueOf2).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(",totalBytesToDownload=");
        sb.append(j2);
        sb.append(",moduleNames=");
        sb.append(valueOf);
        sb.append("languages=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
