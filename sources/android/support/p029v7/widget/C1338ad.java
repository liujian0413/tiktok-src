package android.support.p029v7.widget;

import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: android.support.v7.widget.ad */
final class C1338ad {

    /* renamed from: a */
    boolean f5238a = true;

    /* renamed from: b */
    int f5239b;

    /* renamed from: c */
    int f5240c;

    /* renamed from: d */
    int f5241d;

    /* renamed from: e */
    int f5242e;

    /* renamed from: f */
    int f5243f;

    /* renamed from: g */
    int f5244g;

    /* renamed from: h */
    boolean f5245h;

    /* renamed from: i */
    boolean f5246i;

    C1338ad() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.f5239b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f5240c);
        sb.append(", mItemDirection=");
        sb.append(this.f5241d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f5242e);
        sb.append(", mStartLine=");
        sb.append(this.f5243f);
        sb.append(", mEndLine=");
        sb.append(this.f5244g);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo6257a(C1284o oVar) {
        View c = oVar.mo5848c(this.f5240c);
        this.f5240c += this.f5241d;
        return c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6258a(C1290s sVar) {
        if (this.f5240c < 0 || this.f5240c >= sVar.mo5870b()) {
            return false;
        }
        return true;
    }
}
