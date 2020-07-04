package com.bytedance.p263im.core.internal.queue;

import android.os.SystemClock;
import com.bytedance.p263im.core.internal.p587a.p588a.C11280o;
import com.bytedance.p263im.core.internal.p587a.p588a.C11280o.C11282a;
import com.bytedance.p263im.core.internal.p587a.p588a.C11283p;
import com.bytedance.p263im.core.internal.queue.p597a.C11384c;
import com.bytedance.p263im.core.internal.utils.C11403c;
import com.bytedance.p263im.core.internal.utils.C11430h;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11202d.C11204b;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MessagesPerUserRequestBody.Builder;
import com.bytedance.p263im.core.proto.Request;
import com.bytedance.p263im.core.proto.Response;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

/* renamed from: com.bytedance.im.core.internal.queue.e */
public final class C11391e implements Comparable<C11391e> {

    /* renamed from: a */
    public long f30852a;

    /* renamed from: b */
    public long f30853b;

    /* renamed from: c */
    public boolean f30854c;

    /* renamed from: d */
    public C11390d f30855d;

    /* renamed from: e */
    public Object[] f30856e;

    /* renamed from: f */
    public Request f30857f;

    /* renamed from: g */
    public Response f30858g;

    /* renamed from: h */
    public C11280o f30859h;

    /* renamed from: i */
    public int f30860i;

    /* renamed from: j */
    public long f30861j;

    /* renamed from: k */
    public long f30862k;

    /* renamed from: l */
    public int f30863l;

    /* renamed from: m */
    private int f30864m = C11198c.m32777a().mo27248b().f30412l;

    /* renamed from: m */
    private static C11391e m33520m() {
        return m33517a((C11390d) null);
    }

    /* renamed from: h */
    public final String mo27432h() {
        if (this.f30858g != null) {
            return this.f30858g.error_desc;
        }
        return "";
    }

    /* renamed from: d */
    public final int mo27428d() {
        if (this.f30857f != null) {
            return this.f30857f.cmd.intValue();
        }
        return IMCMD.IMCMD_NOT_USED.getValue();
    }

    /* renamed from: a */
    public final void mo27421a() {
        this.f30863l++;
    }

    /* renamed from: c */
    public final void mo27426c() {
        if (this.f30857f != null && this.f30863l > 0) {
            this.f30853b = C11282a.m33051a().mo27308b();
            this.f30857f = this.f30857f.newBuilder().sequence_id(Long.valueOf(this.f30853b)).build();
        }
    }

    /* renamed from: e */
    public final boolean mo27429e() {
        int i = C11198c.m32777a().mo27248b().f30410j;
        if (this.f30854c || i == 2 || (i == 0 && (this.f30863l >= this.f30864m || !C11198c.m32777a().f30372b.mo27237d()))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27430f() {
        if ((SystemClock.uptimeMillis() - this.f30862k < ((long) (this.f30864m * C11198c.m32777a().mo27248b().f30413m)) || mo27429e()) && SystemClock.uptimeMillis() - this.f30862k < ((long) C11198c.m32777a().mo27248b().f30414n)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo27431g() {
        if (this.f30858g == null || this.f30858g.status_code == null || (this.f30858g.status_code.intValue() != C11204b.f30383a && this.f30858g.status_code.intValue() != 200)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo27425b() {
        if (this.f30857f != null && this.f30857f.body != null && this.f30857f.body.messages_per_user_body != null && this.f30857f.cmd.intValue() == IMCMD.GET_MESSAGES_BY_USER.getValue()) {
            this.f30857f = this.f30857f.newBuilder().body(this.f30857f.body.newBuilder().messages_per_user_body(new Builder().cursor(Long.valueOf(C11430h.m33685a().mo27470a(this.f30857f.inbox_type.intValue()))).build()).build()).build();
        }
    }

    /* renamed from: i */
    public final int mo27433i() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f30857f.cmd.intValue());
            if (fromValue == null) {
                return C11204b.f30383a;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f30858g.body.send_message_body.status.intValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f30858g.body.create_conversation_v2_body.status.intValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f30858g.body.conversation_add_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f30858g.body.conversation_remove_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f30858g.body.update_conversation_participant_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f30858g.body.set_conversation_core_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f30858g.body.upsert_conversation_core_ext_info_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f30858g.body.set_conversation_setting_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f30858g.body.upsert_conversation_setting_ext_info_body.status.intValue();
            }
            return C11204b.f30383a;
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public final String mo27434j() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f30857f.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f30858g.body.send_message_body.extra_info;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f30858g.body.create_conversation_v2_body.extra_info;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f30858g.body.conversation_add_participants_body.extra_info;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f30858g.body.conversation_remove_participants_body.extra_info;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f30858g.body.update_conversation_participant_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f30858g.body.set_conversation_core_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f30858g.body.upsert_conversation_core_ext_info_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f30858g.body.set_conversation_setting_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f30858g.body.upsert_conversation_setting_ext_info_body.extra_info;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public final long mo27435k() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f30857f.cmd.intValue());
            if (fromValue == null) {
                return -1000;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f30858g.body.send_message_body.check_code.longValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f30858g.body.create_conversation_v2_body.check_code.longValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f30858g.body.conversation_add_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f30858g.body.conversation_remove_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f30858g.body.update_conversation_participant_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f30858g.body.set_conversation_core_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f30858g.body.upsert_conversation_core_ext_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f30858g.body.set_conversation_setting_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f30858g.body.upsert_conversation_setting_ext_info_body.check_code.longValue();
            }
            return -1000;
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public final String mo27436l() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f30857f.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.f30858g.body.send_message_body.check_message;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.f30858g.body.create_conversation_v2_body.check_message;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.f30858g.body.conversation_add_participants_body.check_message;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.f30858g.body.conversation_remove_participants_body.check_message;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.f30858g.body.update_conversation_participant_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.f30858g.body.set_conversation_core_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.f30858g.body.upsert_conversation_core_ext_info_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.f30858g.body.set_conversation_setting_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.f30858g.body.upsert_conversation_setting_ext_info_body.check_message;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C11391e m33515a(int i) {
        return m33516a(i, (C11390d) null);
    }

    /* renamed from: a */
    private static C11391e m33517a(C11390d dVar) {
        return m33518b(C11204b.f30383a, null);
    }

    /* renamed from: b */
    public static C11391e m33519b(Response response) {
        int i;
        if (response == null || response.cmd == null) {
            return null;
        }
        IMCMD fromValue = IMCMD.fromValue(response.cmd.intValue());
        if (fromValue == null) {
            return null;
        }
        C11391e m = m33520m();
        m.mo27424a(response);
        if (response.status_code != null) {
            i = response.status_code.intValue();
        } else {
            i = C11204b.f30389g;
        }
        m.f30860i = i;
        return C11283p.m33058a(fromValue, m);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(C11391e eVar) {
        if (equals(eVar)) {
            return 0;
        }
        int d = mo27428d();
        if (d != eVar.mo27428d()) {
            if (d == IMCMD.SEND_MESSAGE.getValue()) {
                return -1;
            }
            if (eVar.mo27428d() == IMCMD.SEND_MESSAGE.getValue()) {
                return 1;
            }
        }
        if (this.f30852a - eVar.f30852a > 0) {
            return 1;
        }
        if (this.f30852a - eVar.f30852a < 0) {
            return -1;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo27423a(C11384c cVar) {
        int i;
        if (this.f30857f != null) {
            if (cVar.mo27411a()) {
                try {
                    if (cVar.f30841d != null) {
                        this.f30858g = cVar.f30841d;
                    } else if (C11198c.m32777a().mo27248b().f30411k == 0) {
                        this.f30858g = (Response) Response.ADAPTER.decode(cVar.f30840c);
                    } else {
                        this.f30858g = (Response) C11403c.f30887a.mo15974a(new String(cVar.f30840c), Response.class);
                    }
                } catch (Exception unused) {
                }
            }
            if (this.f30858g == null) {
                Response.Builder sequence_id = new Response.Builder().cmd(this.f30857f.cmd).inbox_type(this.f30857f.inbox_type).error_desc(cVar.f30839b).sequence_id(Long.valueOf(this.f30852a));
                if (cVar.mo27411a()) {
                    i = C34943c.f91127w;
                } else {
                    i = cVar.f30838a;
                }
                this.f30858g = sequence_id.status_code(Integer.valueOf(i)).build();
            }
            this.f30860i = cVar.f30838a;
        }
    }

    /* renamed from: a */
    public final void mo27424a(Response response) {
        int i;
        this.f30858g = response;
        if (response != null) {
            if (response.status_code != null) {
                i = response.status_code.intValue();
            } else {
                i = C11204b.f30389g;
            }
            this.f30860i = i;
        }
    }

    /* renamed from: a */
    private static C11391e m33516a(int i, C11390d dVar) {
        return m33518b(i, null);
    }

    public C11391e(long j, C11280o oVar) {
        this.f30853b = j;
        this.f30852a = j;
        this.f30859h = oVar;
    }

    /* renamed from: b */
    private static C11391e m33518b(int i, C11390d dVar) {
        C11391e eVar = new C11391e(-1, null);
        eVar.f30860i = i;
        eVar.f30855d = dVar;
        eVar.f30861j = SystemClock.uptimeMillis();
        return eVar;
    }

    /* renamed from: a */
    public final void mo27422a(int i, String str) {
        if (this.f30857f != null) {
            this.f30858g = new Response.Builder().cmd(this.f30857f.cmd).inbox_type(this.f30857f.inbox_type).error_desc(str).sequence_id(Long.valueOf(this.f30852a)).status_code(Integer.valueOf(-1000)).build();
            this.f30860i = -1000;
        }
    }
}
