package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1745d;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1677k;

public final class MergePaths implements C1806b {

    /* renamed from: a */
    public final String f6472a;

    /* renamed from: b */
    public final MergePathsMode f6473b;

    public enum MergePathsMode {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        public static MergePathsMode forId(int i) {
            switch (i) {
                case 1:
                    return Merge;
                case 2:
                    return Add;
                case 3:
                    return Subtract;
                case 4:
                    return Intersect;
                case 5:
                    return ExcludeIntersections;
                default:
                    return Merge;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.f6473b);
        sb.append('}');
        return sb.toString();
    }

    public MergePaths(String str, MergePathsMode mergePathsMode) {
        this.f6472a = str;
        this.f6473b = mergePathsMode;
    }

    /* renamed from: a */
    public final C1668b mo7291a(C1767h hVar, C1821a aVar) {
        if (hVar.f6362g) {
            return new C1677k(this);
        }
        C1745d.m8323a("Animation contains merge paths but they are disabled.");
        return null;
    }
}
