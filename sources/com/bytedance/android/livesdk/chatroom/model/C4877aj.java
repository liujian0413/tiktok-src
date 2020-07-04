package com.bytedance.android.livesdk.chatroom.model;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.aj */
public final class C4877aj {
    /* renamed from: a */
    public static final C4917n m15877a(C4917n nVar, C4917n nVar2) {
        C7573i.m23587b(nVar, "curState");
        C7573i.m23587b(nVar2, "input");
        if (nVar instanceof C4878ak) {
            if ((nVar2 instanceof C4880am) || (nVar2 instanceof C4879al) || (nVar2 instanceof C4882ao)) {
                return nVar2;
            }
            return nVar;
        } else if (nVar instanceof C4880am) {
            if (nVar2 instanceof C4878ak) {
                return nVar2;
            }
            return nVar;
        } else if (nVar instanceof C4879al) {
            if (nVar2 instanceof C4878ak) {
                return nVar2;
            }
            return nVar;
        } else if (nVar instanceof C4882ao) {
            if ((nVar2 instanceof C4878ak) || (nVar2 instanceof C4881an)) {
                return nVar2;
            }
            return nVar;
        } else if (!(nVar instanceof C4881an)) {
            throw new IllegalStateException();
        } else if (nVar2 instanceof C4878ak) {
            return nVar2;
        } else {
            return nVar;
        }
    }
}
