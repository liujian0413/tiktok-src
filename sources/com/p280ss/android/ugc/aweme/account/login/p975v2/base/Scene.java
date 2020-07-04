package com.p280ss.android.ugc.aweme.account.login.p975v2.base;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.Scene */
public enum Scene {
    NONE(-1),
    SIGN_UP(0),
    LOGIN(1),
    MODIFY_PASSWORD(2),
    BIND_PHONE(3),
    MODIFY_PHONE(4);
    
    public static final C21899a Companion = null;
    public static final Map<Integer, Scene> VALUES_MAP = null;
    private final int value;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.Scene$a */
    public static final class C21899a {
        private C21899a() {
        }

        public /* synthetic */ C21899a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Scene m73109a(int i) {
            Scene scene = (Scene) Scene.VALUES_MAP.get(Integer.valueOf(i));
            if (scene == null) {
                return Scene.SIGN_UP;
            }
            return scene;
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        int i;
        Companion = new C21899a(null);
        Scene[] values = values();
        Map<Integer, Scene> linkedHashMap = new LinkedHashMap<>(C7551d.m23566c(C7507ae.m23386a(values.length), 16));
        for (Scene scene : values) {
            linkedHashMap.put(Integer.valueOf(scene.value), scene);
        }
        VALUES_MAP = linkedHashMap;
    }

    private Scene(int i) {
        this.value = i;
    }
}
