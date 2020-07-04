package com.facebook.keyframes.p733b;

import com.facebook.keyframes.model.C14035c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: com.facebook.keyframes.b.a */
public final class C14009a {
    /* renamed from: a */
    public static List<C14035c> m41366a(List<C14035c> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14035c cVar = (C14035c) it.next();
            if (cVar.f37061b == 0) {
                stack.push(cVar);
                it.remove();
            }
        }
        while (!stack.isEmpty()) {
            C14035c cVar2 = (C14035c) stack.pop();
            arrayList.add(cVar2);
            for (C14035c cVar3 : list) {
                if (cVar3.f37061b == cVar2.f37060a) {
                    stack.push(cVar3);
                }
            }
        }
        return arrayList;
    }
}
