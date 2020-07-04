package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11430h;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.proto.CheckMessagePerUserRequestBody;
import com.bytedance.p263im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.InboxMessagesPerUser.Builder;
import com.bytedance.p263im.core.proto.InboxMessagesPerUserResponseBody;
import com.bytedance.p263im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.a.c */
final class C11241c extends C11280o {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27278a() {
        return true;
    }

    C11241c(C11195b<int[]> bVar) {
        super(IMCMD.CHECK_MESSAGES_BY_USER.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.check_messages_per_user_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo27277a(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                arrayList.add(new Builder().inbox_type(Integer.valueOf(i)).cursor(Long.valueOf(C11430h.m33685a().mo27470a(i))).build());
            }
            mo27301a(0, new RequestBody.Builder().check_messages_per_user_body(new CheckMessagePerUserRequestBody.Builder().checks(arrayList).build()).build(), null, iArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        boolean z;
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            z = false;
        } else {
            z = true;
        }
        int[] iArr = (int[]) eVar.f30856e[0];
        if (z) {
            CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody = eVar.f30858g.body.check_messages_per_user_body;
            if (checkMessagesPerUserResponseBody == null) {
                mo27305b(eVar);
                return;
            }
            List<InboxMessagesPerUserResponseBody> list = checkMessagesPerUserResponseBody.messages;
            if (list == null || list.isEmpty()) {
                mo27305b(eVar);
            } else if (iArr == null || iArr.length == 0) {
                mo27305b(eVar);
            } else {
                for (InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody : list) {
                    if (inboxMessagesPerUserResponseBody != null) {
                        Integer num = inboxMessagesPerUserResponseBody.inbox_type;
                        Boolean bool = inboxMessagesPerUserResponseBody.has_more;
                        if (!(num == null || bool == null)) {
                            for (int i = 0; i < iArr.length; i++) {
                                if (iArr[i] == num.intValue() && !bool.booleanValue()) {
                                    iArr[i] = -1;
                                }
                            }
                        }
                    }
                }
                mo27302a(iArr);
            }
        } else {
            mo27305b(eVar);
        }
    }
}
