package com.bytedance.android.livesdk.chatroom.api;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.media.C2360f;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.a */
public final class C4253a {
    /* renamed from: a */
    public static void m14397a(final Handler handler, long j) {
        ((EndPageRecommendRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(EndPageRecommendRetrofitApi.class)).getVideos(j).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C7326g<C3478c<C2360f>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C3478c<C2360f> cVar) throws Exception {
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(21);
                    obtainMessage.obj = cVar.f10296b;
                    handler.sendMessage(obtainMessage);
                }
            }
        }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(21);
                    obtainMessage.obj = th;
                    handler.sendMessage(obtainMessage);
                }
            }
        });
    }

    /* renamed from: b */
    public static void m14398b(final Handler handler, long j) {
        ((EndPageRecommendRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(EndPageRecommendRetrofitApi.class)).getLive(j).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C7326g<C3474a<Room, C2344a>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C3474a<Room, C2344a> aVar) throws Exception {
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(22);
                    obtainMessage.obj = aVar.f10296b;
                    try {
                        for (Room room : (List) obtainMessage.obj) {
                            room.setRequestId(((C2344a) aVar.f10297c).f7700g);
                            room.setLog_pb(((C2344a) aVar.f10297c).mo8249a().toString());
                        }
                    } catch (Exception unused) {
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(22);
                    obtainMessage.obj = th;
                    handler.sendMessage(obtainMessage);
                }
            }
        });
    }
}
