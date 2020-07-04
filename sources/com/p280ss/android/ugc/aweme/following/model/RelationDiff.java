package com.p280ss.android.ugc.aweme.following.model;

import android.support.p029v7.util.C1143a.C1147c;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.model.RelationDiff */
public final class RelationDiff extends C1147c<Object> {
    /* renamed from: a */
    public final boolean mo4549a(Object obj, Object obj2) {
        C7573i.m23587b(obj, "p0");
        C7573i.m23587b(obj2, "p1");
        if (!(obj instanceof C29574i) || !(obj2 instanceof C29574i)) {
            if ((obj instanceof C29575j) && (obj2 instanceof C29575j)) {
                C29575j jVar = (C29575j) obj;
                C29575j jVar2 = (C29575j) obj2;
                if (jVar.f77948a != jVar2.f77948a || !C7573i.m23585a((Object) jVar.f77949b.getUid(), (Object) jVar2.f77949b.getUid())) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof C29573h) || !(obj2 instanceof C29573h)) {
                if (!(obj instanceof RecommendContact) || !(obj2 instanceof RecommendContact)) {
                    return false;
                }
                return C7573i.m23585a((Object) ((RecommendContact) obj).getType(), (Object) ((RecommendContact) obj2).getType());
            } else if (((C29573h) obj).f77944a == ((C29573h) obj2).f77944a) {
                return true;
            } else {
                return false;
            }
        } else if (((C29574i) obj).f77946a == ((C29574i) obj2).f77946a) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo4550b(Object obj, Object obj2) {
        C7573i.m23587b(obj, "p0");
        C7573i.m23587b(obj2, "p1");
        if (!(obj instanceof C29574i) || !(obj2 instanceof C29574i)) {
            if ((obj instanceof C29575j) && (obj2 instanceof C29575j)) {
                C29575j jVar = (C29575j) obj;
                C29575j jVar2 = (C29575j) obj2;
                if (jVar.f77948a != jVar2.f77948a || !C7573i.m23585a((Object) jVar.f77949b, (Object) jVar2.f77949b)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof C29573h) || !(obj2 instanceof C29573h)) {
                if (!(obj instanceof RecommendContact) || !(obj2 instanceof RecommendContact)) {
                    return false;
                }
                return C7573i.m23585a((Object) ((RecommendContact) obj).getType(), (Object) ((RecommendContact) obj2).getType());
            } else if (((C29573h) obj).f77944a == ((C29573h) obj2).f77944a) {
                return true;
            } else {
                return false;
            }
        } else if (((C29574i) obj).f77946a == ((C29574i) obj2).f77946a) {
            return true;
        } else {
            return false;
        }
    }
}
