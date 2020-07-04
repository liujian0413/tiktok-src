package com.p280ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import android.util.Log;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.p280ss.android.ugc.aweme.music.model.MusicDetail;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.o */
public final class C33820o extends C25652b<C25640a<MusicDetail>, C33823p> {
    public C33820o() {
        mo66536a(new C25640a<MusicDetail>() {
            public final boolean checkParams(Object... objArr) {
                return objArr != null;
            }

            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                if (objArr.length > 0 && TextUtils.isEmpty(objArr[0])) {
                    C33820o.m108998e();
                }
                C23397p.f61597b.mo60807a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        if (objArr.length <= 2 || ((Integer) objArr[2]).intValue() != 1) {
                            return MusicDetailApi.m108894a((String) objArr[0], ((Integer) objArr[1]).intValue());
                        }
                        return MusicDetailApi.m108895a((String) objArr[0], (String) objArr[1]);
                    }
                }, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (this.f67572c != null && this.f67571b != null) {
            ((C33823p) this.f67572c).mo83268a((MusicDetail) this.f67571b.getData());
        }
    }

    /* renamed from: e */
    public static void m108998e() {
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
            }
            jSONObject.put("error_stack", stackTraceString);
        } catch (Exception unused) {
        }
        C6893q.m21447a("music_id_empty", jSONObject);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C33823p) this.f67572c).mo83269b_(exc);
        }
    }
}
