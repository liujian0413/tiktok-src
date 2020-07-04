package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.i */
public final class C40993i {

    /* renamed from: a */
    public final int f106583a;

    /* renamed from: b */
    public final int f106584b;

    /* renamed from: c */
    public final int f106585c;

    /* renamed from: d */
    public final String f106586d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40993i) {
                C40993i iVar = (C40993i) obj;
                if (this.f106583a == iVar.f106583a) {
                    if (this.f106584b == iVar.f106584b) {
                        if (!(this.f106585c == iVar.f106585c) || !C7573i.m23585a((Object) this.f106586d, (Object) iVar.f106586d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f106583a * 31) + this.f106584b) * 31) + this.f106585c) * 31;
        String str = this.f106586d;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerMessage(messageType=");
        sb.append(this.f106583a);
        sb.append(", arg1=");
        sb.append(this.f106584b);
        sb.append(", arg2=");
        sb.append(this.f106585c);
        sb.append(", arg3=");
        sb.append(this.f106586d);
        sb.append(")");
        return sb.toString();
    }

    public C40993i(int i, int i2, int i3, String str) {
        this.f106583a = i;
        this.f106584b = i2;
        this.f106585c = i3;
        this.f106586d = str;
    }
}
