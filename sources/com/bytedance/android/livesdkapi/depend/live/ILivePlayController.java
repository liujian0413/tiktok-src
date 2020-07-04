package com.bytedance.android.livesdkapi.depend.live;

import android.content.Context;
import android.view.TextureView;

public interface ILivePlayController {

    public enum PlayerMessage {
        UNKNOWN,
        PLAYER_PREPARED,
        COMPLETE_PLAY,
        MEDIA_ERROR,
        DISPLAYED_PLAY,
        STOP_WHEN_PLAYING_OTHER,
        STOP_WHEN_JOIN_INTERACT,
        BUFFERING_START,
        BUFFERING_END,
        INTERACT_SEI,
        VIDEO_SIZE_CHANGED,
        PLAYER_DETACHED;

        public static PlayerMessage valueOf(int i) {
            if (i < 0 || i >= values().length) {
                return UNKNOWN;
            }
            return values()[i];
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.live.ILivePlayController$a */
    public static class C9317a {
        /* renamed from: a */
        public static String m27711a(Context context) {
            if (context == null) {
                return "@";
            }
            return context.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.live.ILivePlayController$b */
    public interface C9318b {
        /* renamed from: a */
        void mo11991a(PlayerMessage playerMessage, Object obj);
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.live.ILivePlayController$c */
    public static class C9319c {

        /* renamed from: a */
        public final boolean f25509a;

        /* renamed from: b */
        public final boolean f25510b;

        /* renamed from: c */
        public final int f25511c;

        /* renamed from: com.bytedance.android.livesdkapi.depend.live.ILivePlayController$c$a */
        public static class C9320a {

            /* renamed from: a */
            public boolean f25512a;

            /* renamed from: b */
            public boolean f25513b;

            /* renamed from: c */
            public int f25514c;

            /* renamed from: a */
            public final C9319c mo22794a() {
                return new C9319c(this);
            }

            /* renamed from: a */
            public final C9320a mo22792a(int i) {
                this.f25514c = i;
                return this;
            }

            /* renamed from: b */
            public final C9320a mo22795b(boolean z) {
                this.f25513b = z;
                return this;
            }

            /* renamed from: a */
            public final C9320a mo22793a(boolean z) {
                this.f25512a = z;
                return this;
            }
        }

        /* renamed from: a */
        public static C9320a m27713a() {
            return new C9320a();
        }

        private C9319c(C9320a aVar) {
            this.f25509a = aVar.f25512a;
            this.f25510b = aVar.f25513b;
            this.f25511c = aVar.f25514c;
        }
    }

    /* renamed from: a */
    void mo21782a(String str);

    /* renamed from: a */
    void mo21783a(String str, TextureView textureView, int i, C9319c cVar, C9318b bVar, String str2) throws Exception;

    /* renamed from: a */
    void mo21784a(String str, String str2, TextureView textureView, int i, C9319c cVar, C9318b bVar) throws Exception;

    /* renamed from: a */
    void mo21785a(boolean z, Context context);

    /* renamed from: c */
    void mo21787c(Context context);

    /* renamed from: d */
    void mo21788d(Context context);

    /* renamed from: d */
    void mo21789d(boolean z);

    /* renamed from: e */
    void mo21790e();

    /* renamed from: e */
    void mo21791e(Context context);

    /* renamed from: f */
    int mo21793f();

    /* renamed from: f */
    void mo21794f(Context context);

    /* renamed from: g */
    boolean mo21795g();

    /* renamed from: h */
    boolean mo21796h();

    /* renamed from: i */
    String mo21797i();

    /* renamed from: j */
    String mo21798j();
}
