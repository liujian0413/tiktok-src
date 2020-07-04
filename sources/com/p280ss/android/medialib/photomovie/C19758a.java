package com.p280ss.android.medialib.photomovie;

import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

/* renamed from: com.ss.android.medialib.photomovie.a */
public final class C19758a {

    /* renamed from: a */
    public int f53633a;

    /* renamed from: b */
    public int f53634b;

    /* renamed from: c */
    public int f53635c;

    public C19758a() {
        this.f53633a = 1;
        this.f53634b = 2500;
        this.f53635c = VETransitionFilterParam.TransitionDuration_DEFAULT;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":");
        sb.append(this.f53633a);
        sb.append(",\"photoTime\":");
        sb.append(this.f53634b);
        sb.append(",\"transitionTime\":");
        sb.append(this.f53635c);
        sb.append('}');
        return sb.toString();
    }

    public C19758a(int i, int i2, int i3) {
        this.f53633a = 1;
        this.f53634b = 2500;
        this.f53635c = VETransitionFilterParam.TransitionDuration_DEFAULT;
        this.f53633a = 1;
        this.f53634b = i2;
        this.f53635c = VETransitionFilterParam.TransitionDuration_DEFAULT;
    }
}
