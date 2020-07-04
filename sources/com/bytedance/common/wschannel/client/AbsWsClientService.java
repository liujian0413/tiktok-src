package com.bytedance.common.wschannel.client;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.C9752a;
import com.bytedance.common.wschannel.event.C9818a;
import com.bytedance.common.wschannel.event.ConnectionState;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.p280ss.android.message.C19846k;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;

public class AbsWsClientService extends Service implements C6310a {

    /* renamed from: a */
    private Handler f26709a = new C6309f(this);

    /* renamed from: b */
    private Messenger f26710b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24271a(WsChannelMsg wsChannelMsg) {
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.f26710b = new Messenger(this.f26709a);
    }

    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 10123) {
                    final Intent intent = (Intent) message.getData().getParcelable("DATA_INTENT");
                    if (intent != null) {
                        C19846k.m65542a().mo53204a(new Runnable() {
                            public final void run() {
                                AbsWsClientService.this.mo24270a(intent);
                            }
                        });
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public IBinder onBind(final Intent intent) {
        String str;
        StringBuilder sb = new StringBuilder("onBind intent = ");
        if (intent != null) {
            str = intent.toString();
        } else {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        sb.append(str);
        C19846k.m65542a().mo53204a(new Runnable() {
            public final void run() {
                AbsWsClientService.this.mo24270a(intent);
            }
        });
        return this.f26710b.getBinder();
    }

    /* renamed from: a */
    private void m28931a(Message message) {
        try {
            message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
            if (message.what == 40) {
                Parcelable parcelable = message.getData().getParcelable("payload");
                if (parcelable instanceof WsChannelMsg) {
                    mo24271a((WsChannelMsg) parcelable);
                }
                return;
            }
            if (message.what == 41) {
                message.getData().getString("payload_md5");
                message.getData().getBoolean("send_result");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo24270a(Intent intent) {
        if (intent != null) {
            try {
                String action = intent.getAction();
                if ("com.bytedance.article.wschannel.receive.connection".equals(action)) {
                    intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                    SocketState socketState = (SocketState) intent.getParcelableExtra("connection");
                    ConnectionState a = m28930a(socketState.f26740d, socketState.f26738b);
                    C9752a listener = WsConstants.getListener(socketState.f26740d);
                    if (listener != null) {
                        listener.mo24156a(new C9818a(a, socketState.mo24329b(), socketState.f26740d), socketState.mo24328a());
                    }
                } else {
                    if ("com.bytedance.article.wschannel.syncconnectstate".equals(action)) {
                        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
                        ArrayList<SocketState> parcelableArrayListExtra = intent.getParcelableArrayListExtra("connection");
                        if (parcelableArrayListExtra != null) {
                            for (SocketState socketState2 : parcelableArrayListExtra) {
                                if (socketState2 != null) {
                                    m28930a(socketState2.f26740d, socketState2.f26738b);
                                }
                            }
                        }
                    } else {
                        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
                        if ("com.bytedance.article.wschannel.receive.payload".equals(action)) {
                            WsChannelMsg wsChannelMsg = (WsChannelMsg) intent.getParcelableExtra("payload");
                            Message message = new Message();
                            message.what = 40;
                            message.getData().putParcelable("payload", wsChannelMsg);
                            m28931a(message);
                        } else if ("com.bytedance.article.wschannel.send.payload".equals(action)) {
                            String stringExtra = intent.getStringExtra("payload_md5");
                            boolean booleanExtra = intent.getBooleanExtra("send_result", true);
                            Message message2 = new Message();
                            message2.what = 41;
                            message2.getData().putString("payload_md5", stringExtra);
                            message2.getData().putBoolean("send_result", booleanExtra);
                            m28931a(message2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static ConnectionState m28930a(int i, int i2) {
        ConnectionState connectionState = ConnectionState.CONNECTION_UNKNOWN;
        if (i2 == 0) {
            connectionState = ConnectionState.CONNECTION_UNKNOWN;
        } else if (i2 == 1) {
            connectionState = ConnectionState.CONNECTING;
        } else if (i2 == 2) {
            connectionState = ConnectionState.CONNECT_FAILED;
        } else if (i2 == 3) {
            connectionState = ConnectionState.CONNECT_CLOSED;
        } else if (i2 == 4) {
            connectionState = ConnectionState.CONNECTED;
        }
        WsConstants.setConnectionState(i, connectionState);
        return connectionState;
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        String str;
        if (C6312h.m19578b()) {
            StringBuilder sb = new StringBuilder("onStartCommand intent = ");
            if (intent != null) {
                str = intent.toString();
            } else {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            }
            sb.append(str);
        }
        C19846k.m65542a().mo53204a(new Runnable() {
            public final void run() {
                AbsWsClientService.this.mo24270a(intent);
            }
        });
        return 2;
    }
}
