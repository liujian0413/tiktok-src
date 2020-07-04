package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.support.p029v7.util.C1143a.C1147c;
import com.p280ss.android.ugc.aweme.base.utils.C23480h;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.AwemeDiff */
public final class AwemeDiff extends C1147c<Object> {
    /* renamed from: b */
    public final boolean mo4550b(Object obj, Object obj2) {
        C7573i.m23587b(obj, "p0");
        C7573i.m23587b(obj2, "p1");
        return C23480h.m77087a(obj, obj2);
    }

    /* renamed from: a */
    public final boolean mo4549a(Object obj, Object obj2) {
        C7573i.m23587b(obj, "p0");
        C7573i.m23587b(obj2, "p1");
        if ((obj instanceof Aweme) && (obj2 instanceof Aweme)) {
            return C7573i.m23585a((Object) ((Aweme) obj).getAid(), (Object) ((Aweme) obj2).getAid());
        }
        if (!(obj instanceof C27311c) || !(obj2 instanceof C27311c)) {
            if (!(obj instanceof RoomStruct) || !(obj2 instanceof RoomStruct) || ((RoomStruct) obj).f75166id != ((RoomStruct) obj2).f75166id) {
                return false;
            }
            return true;
        } else if (((C27311c) obj).f72018F == ((C27311c) obj2).f72018F) {
            return true;
        } else {
            return false;
        }
    }
}
