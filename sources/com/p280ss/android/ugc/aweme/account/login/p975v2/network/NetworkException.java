package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.NetworkException */
public final class NetworkException extends Throwable {
    public static final C21911a Companion = new C21911a(null);
    private final int errorCode;
    private final String errorMsg;
    private JSONObject extra;
    private final Scene scene;
    private final Step step;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.NetworkException$a */
    public static final class C21911a {
        private C21911a() {
        }

        public /* synthetic */ C21911a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static NetworkException m73128a(Scene scene, Step step) {
            C7573i.m23587b(scene, "scene");
            C7573i.m23587b(step, "step");
            NetworkException networkException = new NetworkException(-1, "no data", scene, step, null);
            return networkException;
        }
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final JSONObject getExtra() {
        return this.extra;
    }

    public final Scene getScene() {
        return this.scene;
    }

    public final Step getStep() {
        return this.step;
    }

    public final void setExtra(JSONObject jSONObject) {
        this.extra = jSONObject;
    }

    public NetworkException(int i, String str, Scene scene2, Step step2, JSONObject jSONObject) {
        C7573i.m23587b(scene2, "scene");
        C7573i.m23587b(step2, "step");
        super(str);
        this.errorCode = i;
        this.errorMsg = str;
        this.scene = scene2;
        this.step = step2;
        this.extra = jSONObject;
    }
}
