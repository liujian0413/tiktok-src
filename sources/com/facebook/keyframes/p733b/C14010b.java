package com.facebook.keyframes.p733b;

import com.facebook.keyframes.model.KFAnimation;
import com.facebook.keyframes.model.KFAnimation.PropertyType;
import java.util.List;

/* renamed from: com.facebook.keyframes.b.b */
public final class C14010b {
    /* renamed from: a */
    public static KFAnimation m41367a(List<KFAnimation> list, PropertyType propertyType) {
        if (list == null) {
            return null;
        }
        int i = 0;
        int size = list.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((KFAnimation) list.get(i)).f37047b == propertyType) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return null;
        }
        return (KFAnimation) list.remove(i);
    }
}
