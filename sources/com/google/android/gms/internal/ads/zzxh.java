package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;

public final class zzxh {

    public static final class zza extends axu<zza, C16279a> implements azc {
        /* access modifiers changed from: private */
        public static final zza zzcev = new zza();
        private static volatile azm<zza> zzdu;

        /* renamed from: com.google.android.gms.internal.ads.zzxh$zza$a */
        public static final class C16279a extends C15546a<zza, C16279a> implements azc {
            private C16279a() {
                super(zza.zzcev);
            }

            /* synthetic */ C16279a(bwn bwn) {
                this();
            }
        }

        public enum zzb implements axx {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
            AD_FAILED_TO_LOAD_NETWORK_ERROR(BaseNotice.HASHTAG),
            AD_FAILED_TO_LOAD_TIMEOUT(102),
            AD_FAILED_TO_LOAD_CANCELLED(103),
            AD_FAILED_TO_LOAD_NO_ERROR(104),
            AD_FAILED_TO_LOAD_NOT_FOUND(105),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
            REQUEST_FAILED_TO_BUILD_URL(1003),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(LiveRoomStruct.ROOM_LONGTIME_NO_NET),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
            REQUEST_FAILED_TO_UPDATE_SIGNALS(1006),
            REQUEST_FAILED_TO_RENDER(1007),
            BANNER_SIZE_INVALID(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT),
            BANNER_SIZE_VALID(10001),
            ANDROID_WEBVIEW_CRASH(10002),
            OFFLINE_UPLOAD(10003);
            
            private static final axy<zzb> zzef = null;
            private final int value;

            public final int zzac() {
                return this.value;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzef = new bwo();
            }
        }

        private zza() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (bwn.f44061a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C16279a(null);
                case 3:
                    return m47701a((aza) zzcev, "\u0001\u0000", (Object[]) null);
                case 4:
                    return zzcev;
                case 5:
                    azm<zza> azm = zzdu;
                    if (azm == null) {
                        synchronized (zza.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzcev);
                                zzdu = azm;
                            }
                        }
                    }
                    return azm;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            axu.m47703a(zza.class, zzcev);
        }
    }
}
