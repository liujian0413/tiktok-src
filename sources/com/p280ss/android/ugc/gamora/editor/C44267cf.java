package com.p280ss.android.ugc.gamora.editor;

import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.gamora.editor.cf */
public final class C44267cf {

    /* renamed from: d */
    public static final List<Integer> f114423d = C7525m.m23464b((T[]) new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13)});

    /* renamed from: e */
    public static final C44268a f114424e = new C44268a(null);

    /* renamed from: a */
    public final int f114425a;

    /* renamed from: b */
    public final int f114426b;

    /* renamed from: c */
    public final int f114427c;

    /* renamed from: com.ss.android.ugc.gamora.editor.cf$a */
    public static final class C44268a {
        private C44268a() {
        }

        /* renamed from: a */
        public static List<Integer> m140050a() {
            return C44267cf.f114423d;
        }

        public /* synthetic */ C44268a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44267cf) {
                C44267cf cfVar = (C44267cf) obj;
                if (this.f114425a == cfVar.f114425a) {
                    if (this.f114426b == cfVar.f114426b) {
                        if (this.f114427c == cfVar.f114427c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f114425a * 31) + this.f114426b) * 31) + this.f114427c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditToolbarItemModel(type=");
        sb.append(this.f114425a);
        sb.append(", iconRes=");
        sb.append(this.f114426b);
        sb.append(", textRes=");
        sb.append(this.f114427c);
        sb.append(")");
        return sb.toString();
    }

    public C44267cf(int i, int i2, int i3) {
        this.f114425a = i;
        this.f114426b = i2;
        this.f114427c = i3;
    }
}
