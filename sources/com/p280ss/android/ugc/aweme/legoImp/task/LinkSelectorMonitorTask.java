package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.p294e.p871c.C19541a;
import com.p280ss.android.p294e.p871c.C19542b;
import com.p280ss.android.p294e.p871c.C19543c;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LinkSelectorMonitorTask */
public class LinkSelectorMonitorTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        C6806b.m21144a().mo16624a((C19541a) new C19541a() {
            /* renamed from: a */
            private static String m104944a(Throwable th) {
                if (th == null) {
                    return "";
                }
                StringWriter stringWriter = new StringWriter();
                C6497a.m20180a(th, new PrintWriter(stringWriter));
                return stringWriter.toString();
            }

            /* renamed from: a */
            public final void mo51686a(C19542b bVar) {
                if (bVar.f52855a == 0 && (bVar.f52856b instanceof C19543c)) {
                    C19543c cVar = (C19543c) bVar.f52856b;
                    if (!cVar.f52864h) {
                        C6877n.m21449b(cVar.f52860d, cVar.f52861e, cVar.f52857a, null, cVar.f52862f, cVar.f52859c, null);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("duration", cVar.f52860d);
                            jSONObject.put("sendTime", cVar.f52861e);
                            jSONObject.put("url", cVar.f52857a);
                            jSONObject.put("traceCode", cVar.f52862f);
                            jSONObject.put("status", cVar.f52859c);
                            jSONObject.put("exception", m104944a((Throwable) cVar.f52863g));
                        } catch (JSONException unused) {
                        }
                        C6877n.m21447a("link_selector_e", jSONObject);
                    }
                    C6877n.m21442a(cVar.f52860d, cVar.f52861e, cVar.f52857a, null, cVar.f52862f, cVar.f52859c, null);
                }
            }
        });
    }
}
