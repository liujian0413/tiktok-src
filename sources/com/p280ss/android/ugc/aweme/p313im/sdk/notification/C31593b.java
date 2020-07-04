package com.p280ss.android.ugc.aweme.p313im.sdk.notification;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.b */
public final class C31593b {

    /* renamed from: a */
    public final int f82699a;

    /* renamed from: b */
    public final Integer f82700b;

    /* renamed from: c */
    public final String f82701c;

    /* renamed from: d */
    public final Integer f82702d;

    /* renamed from: e */
    public final UrlModel f82703e;

    /* renamed from: f */
    public final String f82704f;

    /* renamed from: g */
    public final String f82705g;

    /* renamed from: h */
    public final String f82706h;

    /* renamed from: i */
    public final Long f82707i;

    /* renamed from: j */
    public final Integer f82708j;

    public C31593b() {
        this(0, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31593b) {
                C31593b bVar = (C31593b) obj;
                if (!(this.f82699a == bVar.f82699a) || !C7573i.m23585a((Object) this.f82700b, (Object) bVar.f82700b) || !C7573i.m23585a((Object) this.f82701c, (Object) bVar.f82701c) || !C7573i.m23585a((Object) this.f82702d, (Object) bVar.f82702d) || !C7573i.m23585a((Object) this.f82703e, (Object) bVar.f82703e) || !C7573i.m23585a((Object) this.f82704f, (Object) bVar.f82704f) || !C7573i.m23585a((Object) this.f82705g, (Object) bVar.f82705g) || !C7573i.m23585a((Object) this.f82706h, (Object) bVar.f82706h) || !C7573i.m23585a((Object) this.f82707i, (Object) bVar.f82707i) || !C7573i.m23585a((Object) this.f82708j, (Object) bVar.f82708j)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f82699a * 31;
        Integer num = this.f82700b;
        int i2 = 0;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f82701c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.f82702d;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f82703e;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.f82704f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f82705g;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f82706h;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.f82707i;
        int hashCode8 = (hashCode7 + (l != null ? l.hashCode() : 0)) * 31;
        Integer num3 = this.f82708j;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationContent(type=");
        sb.append(this.f82699a);
        sb.append(", conversationType=");
        sb.append(this.f82700b);
        sb.append(", conversationId=");
        sb.append(this.f82701c);
        sb.append(", messageType=");
        sb.append(this.f82702d);
        sb.append(", avatar=");
        sb.append(this.f82703e);
        sb.append(", name=");
        sb.append(this.f82704f);
        sb.append(", description=");
        sb.append(this.f82705g);
        sb.append(", schema=");
        sb.append(this.f82706h);
        sb.append(", anchorId=");
        sb.append(this.f82707i);
        sb.append(", anchorType=");
        sb.append(this.f82708j);
        sb.append(")");
        return sb.toString();
    }

    private C31593b(int i, Integer num, String str, Integer num2, UrlModel urlModel, String str2, String str3, String str4, Long l, Integer num3) {
        this.f82699a = i;
        this.f82700b = num;
        this.f82701c = str;
        this.f82702d = num2;
        this.f82703e = urlModel;
        this.f82704f = str2;
        this.f82705g = str3;
        this.f82706h = str4;
        this.f82707i = l;
        this.f82708j = num3;
    }

    public /* synthetic */ C31593b(int i, Integer num, String str, Integer num2, UrlModel urlModel, String str2, String str3, String str4, Long l, Integer num3, int i2, C7571f fVar) {
        int i3;
        Integer num4;
        String str5;
        Integer num5;
        UrlModel urlModel2;
        String str6;
        String str7;
        String str8;
        Long l2;
        int i4 = i2;
        if ((i4 & 1) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        Integer num6 = null;
        if ((i4 & 2) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i4 & 4) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i4 & 8) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i4 & 16) != 0) {
            urlModel2 = null;
        } else {
            urlModel2 = urlModel;
        }
        if ((i4 & 32) != 0) {
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i4 & 64) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i4 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i4 & 256) != 0) {
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i4 & 512) == 0) {
            num6 = num3;
        }
        this(i3, num4, str5, num5, urlModel2, str6, str7, str8, l2, num6);
    }
}
