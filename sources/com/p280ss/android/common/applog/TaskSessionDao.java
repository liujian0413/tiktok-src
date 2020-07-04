package com.p280ss.android.common.applog;

import android.content.Context;
import android.util.Pair;
import com.p280ss.android.common.applog.p286a.C19272d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.TaskSessionDao */
public class TaskSessionDao {
    private static volatile TaskSessionDao inst;
    private Context context;

    public static String genSessionId() {
        return AppLog.genSession();
    }

    public static long genTeaEventIndex() {
        return AppLog.genEventIndex();
    }

    private TaskSessionDao(Context context2) {
        this.context = context2.getApplicationContext();
    }

    public static TaskSessionDao inst(Context context2) {
        if (inst == null) {
            synchronized (TaskSessionDao.class) {
                if (inst == null) {
                    inst = new TaskSessionDao(context2);
                }
            }
        }
        return inst;
    }

    public void saveTaskSession(C19272d dVar) {
        C19272d a = C19272d.m63144a(dVar);
        if (a != null) {
            LogQueueSaveAndSendTaskSession logQueueSaveAndSendTaskSession = new LogQueueSaveAndSendTaskSession();
            logQueueSaveAndSendTaskSession.taskSession = a;
            AppLog instance = AppLog.getInstance(this.context);
            if (instance != null) {
                instance.enqueue((LogQueueItem) logQueueSaveAndSendTaskSession);
            }
        }
    }

    public Pair<Long, String> saveTaskSession(C19272d dVar, JSONObject jSONObject) {
        if (dVar == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("datetime", AppLog.formatDate(dVar.f52161a));
            jSONObject3.put("local_time_ms", System.currentTimeMillis());
            jSONObject3.put("session_id", dVar.f52162b);
            jSONObject3.put("bg_session", 1);
            if (dVar.mo51152a()) {
                jSONObject3.put("from_session", dVar.f52164d);
            }
            if (dVar.mo51154b()) {
                jSONObject3.put("to_session", dVar.f52166f);
            }
            jSONObject3.put("duration", dVar.mo51158e());
            jSONObject3.put("session_type", dVar.mo51157d());
            jSONObject3.put("is_background", false);
            AppLog.tryPutEventIndex(jSONObject3);
            jSONArray.put(jSONObject3);
            jSONObject2.put("terminate", jSONArray);
            new StringBuilder("save task session to db : ").append(dVar.toString());
            String jSONObject4 = jSONObject2.toString();
            return Pair.create(Long.valueOf(DBHelper.getInstance(this.context).insertLog(jSONObject4, 0)), jSONObject4);
        } catch (JSONException unused) {
            return null;
        }
    }
}
