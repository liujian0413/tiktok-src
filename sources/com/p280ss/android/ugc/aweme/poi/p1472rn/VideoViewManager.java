package com.p280ss.android.ugc.aweme.poi.p1472rn;

import android.content.Context;
import com.C1642a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.api.Api.C22798b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.newfollow.util.C34200e;
import com.p280ss.android.ugc.aweme.utils.C43018cm;
import com.p280ss.android.ugc.aweme.video.C43222g;
import java.util.Arrays;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewManager */
public final class VideoViewManager extends SimpleViewManager<VideoViewBox> {
    public static final C35217a Companion = new C35217a(null);
    public static final C7541d PLAYER$delegate = C7546e.m23569a(C35218b.f92230a);
    private final C35220d mCallback = new C35220d();

    /* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewManager$a */
    public static final class C35217a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f92229a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C35217a.class), "PLAYER", "getPLAYER()Lcom/ss/android/ugc/aweme/video/IPlayerManager;"))};

        private C35217a() {
        }

        /* renamed from: a */
        public static C43222g m113625a() {
            return (C43222g) VideoViewManager.PLAYER$delegate.getValue();
        }

        public /* synthetic */ C35217a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewManager$b */
    static final class C35218b extends Lambda implements C7561a<C43222g> {

        /* renamed from: a */
        public static final C35218b f92230a = new C35218b();

        C35218b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m113626a();
        }

        /* renamed from: a */
        private static C43222g m113626a() {
            return C34200e.m110432a().mo86947b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewManager$c */
    public interface C35219c {
        /* renamed from: a */
        void mo89659a(String str, VideoViewBox videoViewBox);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewManager$d */
    public static final class C35220d implements C35219c {
        C35220d() {
        }

        /* renamed from: a */
        public final void mo89659a(String str, VideoViewBox videoViewBox) {
            C7573i.m23587b(str, "state");
            C7573i.m23587b(videoViewBox, "viewBox");
            Context context = videoViewBox.getContext();
            if (context != null) {
                NativeModule nativeModule = ((ReactContext) context).getNativeModule(UIManagerModule.class);
                C7573i.m23582a((Object) nativeModule, "reactContext.getNativeMo…anagerModule::class.java)");
                ((UIManagerModule) nativeModule).getEventDispatcher().dispatchEvent(new C35222a(videoViewBox.getId(), str));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.rn.VideoViewManager$e */
    public static final class C35221e extends C6597a<Map<String, ? extends String>> {
        C35221e() {
        }
    }

    public final String getName() {
        return "AwemeVideoView";
    }

    public final Map<String, Integer> getCommandsMap() {
        return C43018cm.m136529a("bindAweme", Integer.valueOf(1), "play", Integer.valueOf(2), "pause", Integer.valueOf(3), "destroy", Integer.valueOf(4), "seek", Integer.valueOf(5));
    }

    private final Aweme parseAweme(String str) {
        try {
            return (Aweme) new C22798b(Aweme.class).mo59831a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAfterUpdateTransaction(VideoViewBox videoViewBox) {
        super.onAfterUpdateTransaction(videoViewBox);
        if (videoViewBox != null) {
            videoViewBox.mo89634d();
        }
    }

    /* access modifiers changed from: protected */
    public final VideoViewBox createViewInstance(ThemedReactContext themedReactContext) {
        C7573i.m23587b(themedReactContext, "reactContext");
        VideoViewBox videoViewBox = new VideoViewBox(themedReactContext, null, 0, 6, null);
        return videoViewBox;
    }

    @ReactProp(name = "continuePlay")
    public final void setContinuePlay(VideoViewBox videoViewBox, boolean z) {
        C7573i.m23587b(videoViewBox, "videoViewBox");
        try {
            videoViewBox.f92212h = z;
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "enableLog")
    public final void setEnableLog(VideoViewBox videoViewBox, boolean z) {
        C7573i.m23587b(videoViewBox, "videoViewBox");
        try {
            videoViewBox.f92210f = z;
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "enableProgress")
    public final void setEnableProgress(VideoViewBox videoViewBox, boolean z) {
        C7573i.m23587b(videoViewBox, "videoViewBox");
        try {
            videoViewBox.f92213i = z;
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "fitMode")
    public final void setFitMode(VideoViewBox videoViewBox, String str) {
        C7573i.m23587b(videoViewBox, "videoViewBox");
        C7573i.m23587b(str, "fitMode");
        try {
            videoViewBox.setFitMode(str);
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "initTime")
    public final void setInitTime(VideoViewBox videoViewBox, int i) {
        C7573i.m23587b(videoViewBox, "videoViewBox");
        try {
            videoViewBox.mo89629a(i);
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "isMuted")
    public final void setIsMuted(VideoViewBox videoViewBox, boolean z) {
        C7573i.m23587b(videoViewBox, "videoViewBox");
        try {
            videoViewBox.setIsMuted(z);
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "singlePlayer")
    public final void setSinglePlayer(VideoViewBox videoViewBox, boolean z) {
        C7573i.m23587b(videoViewBox, "videoViewBox");
        try {
            videoViewBox.f92211g = z;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void addEventEmitters(ThemedReactContext themedReactContext, VideoViewBox videoViewBox) {
        super.addEventEmitters(themedReactContext, videoViewBox);
        if (videoViewBox == null) {
            C7573i.m23580a();
        }
        videoViewBox.setStateChangeCallback(this.mCallback);
    }

    @ReactProp(name = "aweme")
    public final void setAweme(VideoViewBox videoViewBox, String str) {
        C7573i.m23587b(videoViewBox, "videoViewBox");
        C7573i.m23587b(str, "awemeStr");
        try {
            C7573i.m23582a((Object) C1642a.m8034a("get aweme : %s", Arrays.copyOf(new Object[]{str}, 1)), "java.lang.String.format(format, *args)");
            videoViewBox.f92206b = parseAweme(str);
        } catch (Exception unused) {
        }
    }

    @ReactProp(name = "logEventMap")
    public final void setLogParams(VideoViewBox videoViewBox, String str) {
        C7573i.m23587b(videoViewBox, "videoViewBox");
        C7573i.m23587b(str, "logParams");
        try {
            C7573i.m23582a((Object) C1642a.m8034a("get log : %s", Arrays.copyOf(new Object[]{str}, 1)), "java.lang.String.format(format, *args)");
            Map map = (Map) new C6600e().mo15975a(str, new C35221e().type);
            C7573i.m23582a((Object) map, "paramMap");
            videoViewBox.setLogParams(map);
        } catch (Exception unused) {
        }
    }

    public final void receiveCommand(VideoViewBox videoViewBox, int i, ReadableArray readableArray) {
        String str = null;
        switch (i) {
            case 1:
                if (readableArray != null) {
                    str = readableArray.getString(0);
                }
                try {
                    Aweme parseAweme = parseAweme(str);
                    if (videoViewBox != null) {
                        videoViewBox.f92206b = parseAweme;
                        break;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 2:
                if (videoViewBox != null) {
                    videoViewBox.mo89633c(true);
                    break;
                } else {
                    return;
                }
            case 3:
                if (videoViewBox != null) {
                    videoViewBox.mo89635d(true);
                    break;
                } else {
                    return;
                }
            case 4:
                if (videoViewBox != null) {
                    videoViewBox.mo89632c();
                    break;
                } else {
                    return;
                }
            case 5:
                if (readableArray != null) {
                    str = readableArray.getString(0);
                }
                if (videoViewBox != null) {
                    videoViewBox.mo89636f(str);
                    return;
                }
                break;
        }
    }
}
