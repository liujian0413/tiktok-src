package com.bytedance.android.live.broadcast.preview.p139a.p140a;

import android.arch.lifecycle.C0052o;
import android.os.Message;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel.C2824a;
import com.bytedance.android.livesdkapi.C9402f;
import com.bytedance.android.livesdkapi.C9402f.C9403a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a.c */
public final class C2851c implements C9402f {

    /* renamed from: a */
    private StartLiveViewModel f9062a;

    /* renamed from: b */
    private Message f9063b;

    /* renamed from: a */
    private final void m11363a() {
        Message message;
        StartLiveViewModel startLiveViewModel = this.f9062a;
        if (startLiveViewModel != null) {
            C0052o n = startLiveViewModel.mo9607n();
            if (n != null) {
                message = (Message) n.getValue();
                this.f9063b = message;
            }
        }
        message = null;
        this.f9063b = message;
    }

    /* renamed from: a */
    public final void mo9616a(StartLiveViewModel startLiveViewModel) {
        C7573i.m23587b(startLiveViewModel, "viewModel");
        this.f9062a = startLiveViewModel;
    }

    /* renamed from: a */
    public final void mo9615a(C9403a aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        m11363a();
        Message message = this.f9063b;
        Object obj4 = null;
        if (message != null) {
            obj = message.obj;
        } else {
            obj = null;
        }
        if (obj instanceof Exception) {
            StartLiveViewModel startLiveViewModel = this.f9062a;
            if (startLiveViewModel != null) {
                C0052o n = startLiveViewModel.mo9607n();
                if (n != null) {
                    Message message2 = this.f9063b;
                    if (message2 != null) {
                        obj4 = message2.obj;
                    }
                    n.postValue(C2824a.m11335a(10, obj4));
                    return;
                }
            }
            return;
        }
        Message message3 = this.f9063b;
        if (message3 != null) {
            obj2 = message3.obj;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Room) {
            StartLiveViewModel startLiveViewModel2 = this.f9062a;
            if (startLiveViewModel2 != null) {
                C0052o o = startLiveViewModel2.mo9608o();
                if (o != null) {
                    Message message4 = this.f9063b;
                    if (message4 != null) {
                        obj3 = message4.obj;
                    } else {
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        o.postValue((Room) obj3);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                    }
                }
            }
            StartLiveViewModel startLiveViewModel3 = this.f9062a;
            if (startLiveViewModel3 != null) {
                C0052o n2 = startLiveViewModel3.mo9607n();
                if (n2 != null) {
                    Message message5 = this.f9063b;
                    if (message5 != null) {
                        obj4 = message5.obj;
                    }
                    n2.postValue(C2824a.m11335a(10, obj4));
                    return;
                }
            }
            return;
        }
        StartLiveViewModel startLiveViewModel4 = this.f9062a;
        if (startLiveViewModel4 != null) {
            C0052o n3 = startLiveViewModel4.mo9607n();
            if (n3 != null) {
                n3.postValue(C2824a.m11335a(10, null));
            }
        }
    }
}
