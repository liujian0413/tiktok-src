package com.p280ss.android.ugc.aweme.shortvideo.WorkSpace;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace */
public final class Workspace implements Parcelable {
    public static final Creator<Workspace> CREATOR = new Creator<Workspace>() {
        /* renamed from: a */
        private static Workspace[] m122825a(int i) {
            return new Workspace[i];
        }

        /* renamed from: a */
        private static Workspace m122824a(Parcel parcel) {
            return new Workspace(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122824a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122825a(i);
        }
    };

    /* renamed from: a */
    final WorkspaceImpl f99853a;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: c */
    public final File mo96314c() {
        return this.f99853a.mo96283a();
    }

    /* renamed from: d */
    public final File mo96315d() {
        return this.f99853a.mo96287b();
    }

    /* renamed from: e */
    public final File mo96317e() {
        return this.f99853a.mo96288c();
    }

    /* renamed from: f */
    public final void mo96318f() {
        this.f99853a.mo96291e();
    }

    /* renamed from: g */
    public final File mo96319g() {
        return this.f99853a.mo96289d();
    }

    /* renamed from: h */
    public final void mo96320h() {
        this.f99853a.mo96292f();
    }

    /* renamed from: i */
    public final void mo96321i() {
        this.f99853a.mo96293g();
    }

    /* renamed from: j */
    public final File mo96322j() {
        return this.f99853a.mo96294h();
    }

    /* renamed from: k */
    public final File mo96323k() {
        return this.f99853a.mo96295i();
    }

    /* renamed from: l */
    public final File mo96324l() {
        return this.f99853a.mo96296j();
    }

    /* renamed from: m */
    public final void mo96325m() {
        this.f99853a.mo96286a(C39811er.f103469e);
    }

    /* renamed from: n */
    public final File mo96326n() {
        return this.f99853a.mo96297k();
    }

    /* renamed from: o */
    public final File mo96327o() {
        return this.f99853a.mo96298l();
    }

    /* renamed from: p */
    public final File mo96328p() {
        return this.f99853a.mo96299m();
    }

    /* renamed from: q */
    public final File mo96329q() {
        return this.f99853a.mo96300n();
    }

    /* renamed from: a */
    public static Workspace m122801a() {
        OldImpl oldImpl = new OldImpl();
        Workspace workspace = new Workspace((WorkspaceImpl) oldImpl);
        oldImpl.f99850o = workspace;
        return workspace;
    }

    /* renamed from: b */
    public static String m122805b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        StringBuilder sb = new StringBuilder();
        sb.append(C39811er.f103472h);
        sb.append(simpleDateFormat.format(new Date()));
        return sb.toString();
    }

    private Workspace(WorkspaceImpl workspaceImpl) {
        this.f99853a = workspaceImpl;
    }

    /* renamed from: a */
    public final void mo96311a(C38416a aVar) {
        this.f99853a.mo96284a(aVar);
    }

    /* renamed from: b */
    public final void mo96313b(String str) {
        this.f99853a.mo96286a(str);
    }

    protected Workspace(Parcel parcel) {
        this.f99853a = (WorkspaceImpl) parcel.readParcelable(WorkspaceImpl.class.getClassLoader());
        if (this.f99853a instanceof OldImpl) {
            ((OldImpl) this.f99853a).f99850o = this;
        }
    }

    /* renamed from: a */
    public static String m122803a(String str) {
        String a = C6306c.m19561a(str);
        StringBuilder sb = new StringBuilder();
        sb.append(C39811er.f103470f);
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo96312a(File file) {
        this.f99853a.mo96285a(file);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f99853a, i);
    }

    /* renamed from: a */
    public static Workspace m122802a(String str, String str2, String str3, String str4) {
        OldImpl oldImpl = new OldImpl();
        oldImpl.f99836a = 1;
        oldImpl.f99839d = str;
        oldImpl.f99840e = str2;
        oldImpl.f99842g = str3;
        oldImpl.f99841f = str4;
        oldImpl.f99838c = m122803a(str);
        Workspace workspace = new Workspace((WorkspaceImpl) oldImpl);
        oldImpl.f99850o = workspace;
        return workspace;
    }

    /* renamed from: b */
    public static Workspace m122804b(String str, String str2, String str3, String str4) {
        OldImpl oldImpl = new OldImpl();
        oldImpl.f99836a = 0;
        oldImpl.f99839d = null;
        oldImpl.f99840e = null;
        oldImpl.f99842g = str3;
        oldImpl.f99841f = str4;
        Workspace workspace = new Workspace((WorkspaceImpl) oldImpl);
        oldImpl.f99850o = workspace;
        return workspace;
    }
}
