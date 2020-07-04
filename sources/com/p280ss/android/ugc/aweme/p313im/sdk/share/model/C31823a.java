package com.p280ss.android.ugc.aweme.p313im.sdk.share.model;

import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.model.a */
public final class C31823a {

    /* renamed from: a */
    public final ViewGroup f83248a;

    /* renamed from: b */
    public final ImageView f83249b;

    /* renamed from: c */
    public final boolean f83250c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31823a) {
                C31823a aVar = (C31823a) obj;
                if (C7573i.m23585a((Object) this.f83248a, (Object) aVar.f83248a) && C7573i.m23585a((Object) this.f83249b, (Object) aVar.f83249b)) {
                    if (this.f83250c == aVar.f83250c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ViewGroup viewGroup = this.f83248a;
        int i = 0;
        int hashCode = (viewGroup != null ? viewGroup.hashCode() : 0) * 31;
        ImageView imageView = this.f83249b;
        if (imageView != null) {
            i = imageView.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f83250c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareCreateGroupPayload(layout=");
        sb.append(this.f83248a);
        sb.append(", ivCheck=");
        sb.append(this.f83249b);
        sb.append(", whiteBg=");
        sb.append(this.f83250c);
        sb.append(")");
        return sb.toString();
    }

    public C31823a(ViewGroup viewGroup, ImageView imageView, boolean z) {
        C7573i.m23587b(viewGroup, "layout");
        C7573i.m23587b(imageView, "ivCheck");
        this.f83248a = viewGroup;
        this.f83249b = imageView;
        this.f83250c = z;
    }
}
