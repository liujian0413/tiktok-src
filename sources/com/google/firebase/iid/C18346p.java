package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.C17058g;

/* renamed from: com.google.firebase.iid.p */
abstract class C18346p<T> {

    /* renamed from: a */
    final int f49835a;

    /* renamed from: b */
    final C17058g<T> f49836b = new C17058g<>();

    /* renamed from: c */
    final int f49837c;

    /* renamed from: d */
    final Bundle f49838d;

    C18346p(int i, int i2, Bundle bundle) {
        this.f49835a = i;
        this.f49837c = i2;
        this.f49838d = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo47262a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo47263a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47265a(T t) {
        this.f49836b.mo44299a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo47264a(zzal zzal) {
        this.f49836b.mo44298a((Exception) zzal);
    }

    public String toString() {
        int i = this.f49837c;
        int i2 = this.f49835a;
        boolean a = mo47263a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
