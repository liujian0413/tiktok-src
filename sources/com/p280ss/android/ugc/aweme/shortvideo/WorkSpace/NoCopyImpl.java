package com.p280ss.android.ugc.aweme.shortvideo.WorkSpace;

import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import kotlin.NotImplementedError;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.NoCopyImpl */
public class NoCopyImpl implements WorkspaceImpl {
    public static final Creator<OldImpl> CREATOR = new Creator<OldImpl>() {
        /* renamed from: a */
        private static OldImpl[] m122779a(int i) {
            return new OldImpl[i];
        }

        /* renamed from: a */
        private static OldImpl m122778a(Parcel parcel) {
            return new OldImpl(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122778a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122779a(i);
        }
    };

    /* renamed from: a */
    int f99820a;

    /* renamed from: b */
    String f99821b = C39811er.f103469e;

    /* renamed from: c */
    String f99822c;

    /* renamed from: d */
    String f99823d;

    /* renamed from: e */
    String f99824e;

    /* renamed from: f */
    String f99825f;

    /* renamed from: g */
    String f99826g;

    /* renamed from: h */
    String f99827h;

    /* renamed from: i */
    String f99828i;

    /* renamed from: j */
    String f99829j;

    /* renamed from: k */
    String f99830k;

    /* renamed from: l */
    String f99831l;

    /* renamed from: m */
    String f99832m;

    /* renamed from: n */
    Workspace f99833n;

    /* renamed from: a */
    public final void mo96286a(String str) {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo96291e() {
        this.f99826g = null;
    }

    /* renamed from: d */
    public final File mo96289d() {
        return new File(this.f99821b);
    }

    /* renamed from: i */
    public final File mo96295i() {
        throw new NotImplementedError();
    }

    /* renamed from: j */
    public final File mo96296j() {
        throw new NotImplementedError();
    }

    /* renamed from: c */
    public final File mo96288c() {
        if (this.f99826g == null) {
            return null;
        }
        return new File(this.f99826g);
    }

    /* renamed from: o */
    private File m122759o() {
        if (this.f99828i == null) {
            this.f99828i = new File(C39811er.f103468d, "mix.wav").getPath();
        }
        return new File(this.f99828i);
    }

    /* renamed from: a */
    public final File mo96283a() {
        if (this.f99823d == null) {
            this.f99823d = C39811er.m127466d("-concat-v");
        }
        return new File(this.f99823d);
    }

    /* renamed from: b */
    public final File mo96287b() {
        if (this.f99824e == null) {
            this.f99824e = C39811er.m127466d("-concat-a");
        }
        return new File(this.f99824e);
    }

    /* renamed from: f */
    public final void mo96292f() {
        File p = m122760p();
        if (p.exists()) {
            p.delete();
        }
        File o = m122759o();
        if (o.exists()) {
            o.delete();
        }
    }

    /* renamed from: g */
    public final void mo96293g() {
        if (mo96289d().exists()) {
            C7276d.m22810b(mo96289d());
        }
        mo96292f();
    }

    /* renamed from: h */
    public final File mo96294h() {
        if (this.f99830k == null) {
            this.f99830k = C39811er.m127465c("-concat-v");
        }
        return new File(this.f99830k);
    }

    /* renamed from: m */
    public final File mo96299m() {
        if (C7276d.m22812b(this.f99831l)) {
            return new File(this.f99831l);
        }
        return null;
    }

    /* renamed from: n */
    public final File mo96300n() {
        if (C7276d.m22812b(this.f99832m)) {
            return new File(this.f99832m);
        }
        return null;
    }

    /* renamed from: p */
    private File m122760p() {
        if (this.f99829j == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f99826g);
            sb.append(".wav");
            this.f99829j = new File(sb.toString()).getPath();
        }
        return new File(this.f99829j);
    }

    /* renamed from: k */
    public final File mo96297k() {
        String str = C39811er.f103473i;
        if (!C7276d.m22812b(str)) {
            C7276d.m22803a(str, false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C39811er.m127467e("-bgv-v"));
        this.f99831l = sb.toString();
        return new File(this.f99831l);
    }

    /* renamed from: l */
    public final File mo96298l() {
        String str = C39811er.f103473i;
        if (!C7276d.m22812b(str)) {
            C7276d.m22803a(str, false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C39811er.m127467e("-bgv-a"));
        this.f99832m = sb.toString();
        return new File(this.f99832m);
    }

    /* renamed from: a */
    public final void mo96285a(File file) {
        this.f99826g = file.getPath();
    }

    /* renamed from: a */
    public final void mo96284a(final C38416a aVar) {
        new AsyncTask() {
            /* access modifiers changed from: protected */
            public final void onPostExecute(Object obj) {
                if (aVar != null) {
                    aVar.mo96333a(NoCopyImpl.this.f99833n);
                }
            }

            /* access modifiers changed from: protected */
            public final Object doInBackground(Object[] objArr) {
                String a = C6306c.m19561a(NoCopyImpl.this.mo96283a().getPath());
                StringBuilder sb = new StringBuilder();
                sb.append(C39811er.f103486v);
                sb.append(a);
                sb.append(File.separator);
                String sb2 = sb.toString();
                C7276d.m22810b(new File(sb2));
                C7276d.m22811b(NoCopyImpl.this.mo96289d().getPath(), sb2);
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f99820a);
        parcel.writeString(this.f99821b);
        parcel.writeString(this.f99822c);
        parcel.writeString(this.f99823d);
        parcel.writeString(this.f99824e);
        parcel.writeString(this.f99825f);
        parcel.writeString(this.f99826g);
        parcel.writeString(this.f99827h);
        parcel.writeString(this.f99829j);
        parcel.writeString(this.f99828i);
        parcel.writeString(this.f99830k);
    }
}
