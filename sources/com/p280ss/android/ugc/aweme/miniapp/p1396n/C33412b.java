package com.p280ss.android.ugc.aweme.miniapp.p1396n;

import com.p1843tt.miniapp.IWebSocketService;
import com.p1843tt.miniapp.IWebSocketService.IWebSocketServiceListener;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C23018p;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.notice.api.p1430ws.C34334h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.websocket.p344ws.WebSocketStatus.ConnectState;
import com.p280ss.android.websocket.p344ws.output.C45457c;
import com.p280ss.android.websocket.p344ws.output.C45460f;
import com.p280ss.android.websocket.p344ws.p1781a.C45446d;
import com.p280ss.android.websocket.p344ws.p1781a.C45447e;
import java.util.HashMap;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.miniapp.n.b */
public class C33412b implements IWebSocketService {

    /* renamed from: a */
    private IWebSocketServiceListener f87261a;

    public C33412b() {
        m108063a();
    }

    public boolean isConnected() {
        return C34334h.m111033d().f89486b;
    }

    /* renamed from: a */
    private void m108063a() {
        if (!C42961az.m136384e(this)) {
            C42961az.m136382c(this);
        }
    }

    public String getCurUserId() {
        return C6861a.m21337f().getCurUserId();
    }

    public boolean isBackground() {
        return C23018p.m75672a().mo59989b();
    }

    public boolean isLogin() {
        return C6861a.m21337f().isLogin();
    }

    public boolean isSettingsEnable() {
        return C30199h.m98861a().getMiniappWonderlandEnable().booleanValue();
    }

    public void setWebSocketServiceListener(IWebSocketServiceListener iWebSocketServiceListener) {
        this.f87261a = iWebSocketServiceListener;
    }

    @C7709l
    public void onReceiveMsg(C45457c cVar) {
        this.f87261a.onReceiveMsg(cVar.f117068e, cVar.f117067d, new String(cVar.f117065b));
    }

    @C7709l(mo20402c = -1)
    public void onWSStatusChange(C45460f fVar) {
        if (fVar.f117075b == ConnectState.CONNECTED) {
            this.f87261a.onWebSocketConnected();
            return;
        }
        if (fVar.f117075b == ConnectState.CLOSED) {
            this.f87261a.onWebSocketClosed();
        }
    }

    public void sendMessage(String str) {
        String e = C34334h.m111033d().mo87179e();
        C45447e eVar = new C45447e(e, 1013, 0, System.currentTimeMillis(), 1, str.getBytes(), "pb", "pb", new HashMap());
        C42961az.m136380a(new C45446d(e, eVar));
    }
}
