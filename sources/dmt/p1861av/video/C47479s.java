package dmt.p1861av.video;

import java.util.Arrays;

/* renamed from: dmt.av.video.s */
public final class C47479s {

    /* renamed from: a */
    public int[] f121909a;

    /* renamed from: b */
    public long f121910b;

    /* renamed from: c */
    public long f121911c;

    /* renamed from: d */
    public int f121912d;

    /* renamed from: e */
    public boolean f121913e;

    /* renamed from: f */
    public int f121914f;

    /* renamed from: g */
    public String f121915g;

    /* renamed from: h */
    public String f121916h;

    /* renamed from: i */
    public String f121917i;

    /* renamed from: j */
    public int f121918j;

    /* renamed from: k */
    public String f121919k;

    /* renamed from: l */
    public String f121920l;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VEFilterEffectOp{mEffectIndexes=");
        sb.append(Arrays.toString(this.f121909a));
        sb.append(", mTimePoint=");
        sb.append(this.f121910b);
        sb.append(", mOp=");
        sb.append(this.f121912d);
        sb.append(", mReverse=");
        sb.append(this.f121913e);
        sb.append(", mColor=");
        sb.append(this.f121914f);
        sb.append(", mResource='");
        sb.append(this.f121915g);
        sb.append('\'');
        sb.append(", mName='");
        sb.append(this.f121917i);
        sb.append('\'');
        sb.append(", mKey='");
        sb.append(this.f121916h);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C47479s m148203a(long j) {
        C47479s sVar = new C47479s();
        sVar.f121912d = 1;
        sVar.f121910b = j;
        return sVar;
    }

    /* renamed from: b */
    public static C47479s m148210b(int[] iArr) {
        C47479s sVar = new C47479s();
        sVar.f121912d = 3;
        sVar.f121909a = iArr;
        return sVar;
    }

    /* renamed from: a */
    public static C47479s m148202a(int i) {
        C47479s sVar = new C47479s();
        sVar.f121912d = 7;
        sVar.f121909a = new int[]{i};
        return sVar;
    }

    /* renamed from: b */
    public static C47479s m148209b(int i) {
        C47479s sVar = new C47479s();
        sVar.f121912d = 2;
        sVar.f121909a = new int[]{i};
        return sVar;
    }

    /* renamed from: a */
    public static C47479s m148208a(int[] iArr) {
        C47479s sVar = new C47479s();
        sVar.f121912d = 4;
        sVar.f121909a = iArr;
        return sVar;
    }

    /* renamed from: a */
    public static C47479s m148204a(long j, long j2) {
        C47479s sVar = new C47479s();
        sVar.f121912d = 6;
        sVar.f121910b = j;
        sVar.f121911c = j2;
        return sVar;
    }

    /* renamed from: a */
    public static C47479s m148205a(String str, long j) {
        C47479s sVar = new C47479s();
        sVar.f121912d = 0;
        sVar.f121915g = str;
        sVar.f121910b = j;
        return sVar;
    }

    /* renamed from: a */
    public static C47479s m148206a(String str, long j, long j2) {
        C47479s sVar = new C47479s();
        sVar.f121912d = 5;
        sVar.f121915g = str;
        sVar.f121910b = 0;
        sVar.f121911c = j2;
        return sVar;
    }

    /* renamed from: a */
    public static C47479s m148207a(String str, long j, long j2, int i) {
        C47479s sVar = new C47479s();
        sVar.f121912d = 8;
        sVar.f121915g = str;
        sVar.f121910b = 0;
        sVar.f121911c = j2;
        sVar.f121909a = new int[]{i};
        return sVar;
    }
}
