package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11430h;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.ReportGetMessagesCursorRequestBody;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.internal.a.a.ab */
final class C11218ab extends C11280o {

    /* renamed from: a */
    private int f30458a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        return true;
    }

    /* renamed from: b */
    public final void mo27267b() {
        long a = C11430h.m33685a().mo27470a(this.f30458a);
        if (a != C11430h.m33685a().mo27475b(this.f30458a)) {
            RequestBody build = new Builder().report_conversation_cursor_body(new ReportGetMessagesCursorRequestBody.Builder().cursor(Long.valueOf(a)).build()).build();
            mo27301a(this.f30458a, build, null, Long.valueOf(a));
        }
    }

    C11218ab(int i) {
        super(IMCMD.REPORT_GET_MESSAGES_CURSOR.getValue());
        this.f30458a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        C11430h.m33685a().mo27476b(this.f30458a, ((Long) eVar.f30856e[0]).longValue());
    }
}
