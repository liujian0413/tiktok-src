package com.bytedance.p263im.core.p586b;

import android.os.SystemClock;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.proto.IMCMD;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.b.d */
public final class C11209d {

    /* renamed from: a */
    private static C11207b f30431a;

    /* renamed from: a */
    public static void m32830a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (f30431a != null) {
            f30431a.mo18018a(str, jSONObject, (JSONObject) null);
        }
        StringBuilder sb = new StringBuilder("serviceName=");
        sb.append(str);
        sb.append(" duration=");
        sb.append(jSONObject);
        sb.append(" logExtra=");
        sb.append(null);
        C11404d.m33583a("monitor", sb.toString());
    }

    /* renamed from: a */
    public static void m32823a(C11207b bVar) {
        f30431a = bVar;
    }

    /* renamed from: a */
    public static void m32825a(Object obj) {
        if (f30431a != null) {
            f30431a.mo18014a(obj);
        }
    }

    /* renamed from: a */
    public static void m32824a(Exception exc) {
        C11208c.m32815a().mo27256a("core").mo27258b("task_exception").mo27257a("error", exc.toString()).mo27257a("error_stack", m32831b(exc)).mo27260b();
    }

    /* renamed from: b */
    public static String m32831b(Exception exc) {
        if (exc == null) {
            return "";
        }
        StackTraceElement[] stackTrace = exc.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (stackTrace != null && i < stackTrace.length) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(stackTrace[i].getClassName());
            sb.append(":");
            sb.append(stackTrace[i].getMethodName());
            sb.append(":");
            sb.append(stackTrace[i].getLineNumber());
            i++;
        }
        if (sb.length() > 1000) {
            sb.substring(0, 999);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C11208c m32821a(C11391e eVar, boolean z) {
        C11208c a = C11208c.m32815a().mo27257a("duration", Long.valueOf(SystemClock.uptimeMillis() - eVar.f30861j));
        IMCMD fromValue = IMCMD.fromValue(eVar.mo27428d());
        if (fromValue == null) {
            fromValue = IMCMD.IMCMD_NOT_USED;
        }
        switch (fromValue) {
            case ADD_CONVERSATION_PARTICIPANTS:
                a.mo27256a("conversation").mo27258b("add_participants");
                break;
            case CREATE_CONVERSATION_V2:
                a.mo27256a("core").mo27258b("create_conversation");
                break;
            case GET_CONVERSATION_INFO_V2:
                a.mo27256a("core").mo27258b("get_conversation_info");
                break;
            case GET_CONVERSATION_INFO_LIST_V2:
                a.mo27256a("core").mo27258b("get_conversation_info_list");
                break;
            case GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2:
                a.mo27256a("core").mo27258b("get_favorite_conversation_list");
                break;
            case GET_CONVERSATION_INFO_LIST_BY_TOP_V2:
                a.mo27256a("core").mo27258b("get_top_conversation_list");
                break;
            case GET_MESSAGES_BY_USER:
                a.mo27256a("core").mo27258b("get_msg_by_user");
                break;
            case GET_STRANGER_CONVERSATION_LIST:
                a.mo27256a("core").mo27258b("get_stranger_conversation_list");
                break;
            case GET_STRANGER_MESSAGES_IN_CONVERSATION:
                a.mo27256a("core").mo27258b("get_stranger_msg_list");
                break;
            case GET_MESSAGES_BY_USER_INIT_V2:
                a.mo27256a("core").mo27258b("install_init");
                break;
            case LEAVE_CONVERSATION:
                a.mo27256a("conversation").mo27258b("leave");
                break;
            case GET_MESSAGES_BY_CONVERSATION:
                a.mo27256a("core").mo27258b("load_history");
                break;
            case CONVERSATION_PARTICIPANTS_LIST:
                a.mo27256a("core").mo27258b("load_member");
                break;
            case REMOVE_CONVERSATION_PARTICIPANTS:
                a.mo27256a("conversation").mo27258b("remove_member");
                break;
            case SEND_MESSAGE:
                a.mo27256a("core").mo27258b("message_send");
                break;
            case SET_CONVERSATION_CORE_INFO:
                a.mo27256a("conversation").mo27258b("update_core");
                break;
            case SET_CONVERSATION_SETTING_INFO:
                a.mo27256a("conversation").mo27258b("update_setting");
                break;
            case UPDATE_CONVERSATION_PARTICIPANT:
                a.mo27256a("conversation").mo27258b("update_member");
                break;
            case UPSERT_CONVERSATION_CORE_EXT_INFO:
                a.mo27256a("conversation").mo27258b("update_core_ext");
                break;
            case UPSERT_CONVERSATION_SETTING_EXT_INFO:
                a.mo27256a("conversation").mo27258b("update_setting_ext");
                break;
            case DISSOLVE_CONVERSATION:
                a.mo27256a("conversation").mo27258b("dissolve");
                break;
            case SYNC_MESSAGE:
                a.mo27256a("core").mo27258b("property_msg_send");
                break;
            case SET_MESSAGE_PROPERTY:
                a.mo27256a("core").mo27258b("message_set_property_send");
                break;
            case GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3:
                a.mo27256a("conversation").mo27258b("get_conversation_participants_read_index");
                break;
            case GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3:
                a.mo27256a("conversation").mo27258b("get_conversation_participants_min_index");
                break;
            default:
                a.mo27256a("unknown").mo27258b("not_use");
                break;
        }
        if (z) {
            a.mo27257a("success", Integer.valueOf(1));
        } else {
            a.mo27257a("error", Integer.valueOf(eVar.f30860i));
            a.mo27257a("success", Integer.valueOf(0));
            if (eVar.f30857f != null) {
                a.mo27259b("origin_request", eVar.f30857f);
            }
            if (eVar.f30858g != null) {
                a.mo27259b("origin_response", eVar.f30858g);
            }
        }
        return a;
    }

    /* renamed from: a */
    public static void m32827a(String str, String str2, Throwable th) {
        if (f30431a != null) {
            f30431a.mo18015a(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m32826a(String str, String str2, float f) {
        if (f30431a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str2, 1.0d);
                jSONObject.put("service", str);
            } catch (JSONException unused) {
            }
            f30431a.mo18017a("service_monitor", str, jSONObject);
        }
        StringBuilder sb = new StringBuilder("serviceName=");
        sb.append(str);
        sb.append(" key=");
        sb.append(str2);
        sb.append(" value=1.0");
        C11404d.m33583a("monitor", sb.toString());
    }

    /* renamed from: a */
    public static void m32829a(String str, String str2, JSONObject jSONObject) {
        if (f30431a != null) {
            f30431a.mo18017a(str, str2, jSONObject);
        }
        StringBuilder sb = new StringBuilder("log_type=");
        sb.append(str);
        sb.append(" serviceName=");
        sb.append(str2);
        sb.append(" logExtra=");
        sb.append(jSONObject);
        C11404d.m33583a("monitor", sb.toString());
    }

    /* renamed from: a */
    public static void m32828a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        if (f30431a != null) {
            f30431a.mo18016a(str, str2, map, map2);
        }
    }

    /* renamed from: a */
    public static void m32822a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("sendDuration=");
        sb.append(j);
        sb.append(" sendTime=");
        sb.append(j2);
        sb.append(" sendUrl=");
        sb.append(str);
        sb.append(" sendIp=");
        sb.append(str2);
        sb.append(" traceCode=");
        sb.append(str3);
        sb.append(" status=");
        sb.append(i);
        sb.append(" extJson=");
        sb.append(null);
        C11404d.m33583a("monitor", sb.toString());
    }

    /* renamed from: b */
    public static void m32832b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("duration=");
        sb.append(j);
        sb.append(" sendTime=");
        sb.append(j2);
        sb.append(" sendUrl=");
        sb.append(str);
        sb.append(" sendIp=");
        sb.append(str2);
        sb.append(" traceCode=");
        sb.append(str3);
        sb.append(" status=");
        sb.append(i);
        sb.append(" extJson=");
        sb.append(null);
        C11404d.m33583a("monitor", sb.toString());
    }
}
