package com.p280ss.android.ugc.aweme.services;

import android.arch.lifecycle.C0052o;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.services.ISDKService */
public interface ISDKService {

    /* renamed from: com.ss.android.ugc.aweme.services.ISDKService$VideoSplitMessage */
    public static final class VideoSplitMessage {
        public static final Companion Companion = new Companion(null);
        private final int result;

        /* renamed from: com.ss.android.ugc.aweme.services.ISDKService$VideoSplitMessage$Companion */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C7571f fVar) {
                this();
            }
        }

        public static /* synthetic */ VideoSplitMessage copy$default(VideoSplitMessage videoSplitMessage, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = videoSplitMessage.result;
            }
            return videoSplitMessage.copy(i);
        }

        public final int component1() {
            return this.result;
        }

        public final VideoSplitMessage copy(int i) {
            return new VideoSplitMessage(i);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof VideoSplitMessage) {
                    if (this.result == ((VideoSplitMessage) obj).result) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int getResult() {
            return this.result;
        }

        public final int hashCode() {
            return this.result;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoSplitMessage(result=");
            sb.append(this.result);
            sb.append(")");
            return sb.toString();
        }

        public VideoSplitMessage(int i) {
            this.result = i;
        }
    }

    int checkAudioFile(String str);

    int[] initVideoToGraph(String str);

    int rencodeAndSplitFile(String str, String str2, String str3, int i, int i2, int i3, long j, long j2, int i4, int i5, boolean z);

    void split(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, C0052o<VideoSplitMessage> oVar);

    int uninitVideoToGraph();
}
