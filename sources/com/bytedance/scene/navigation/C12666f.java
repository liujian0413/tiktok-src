package com.bytedance.scene.navigation;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.scene.C12629j;

/* renamed from: com.bytedance.scene.navigation.f */
public final class C12666f {

    /* renamed from: a */
    public final String f33628a;

    /* renamed from: b */
    public final Bundle f33629b;

    /* renamed from: c */
    public boolean f33630c = true;

    /* renamed from: d */
    public boolean f33631d = true;

    /* renamed from: e */
    public int f33632e;

    /* renamed from: a */
    public final Bundle mo31103a() {
        if (!TextUtils.isEmpty(this.f33628a)) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_rootScene", this.f33628a);
            bundle.putBundle("extra_rootScene_arguments", this.f33629b);
            bundle.putBoolean("extra_drawWindowBackground", this.f33630c);
            bundle.putBoolean("extra_fixSceneBackground_enabled", this.f33631d);
            bundle.putInt("extra_sceneBackground", this.f33632e);
            return bundle;
        }
        throw new IllegalArgumentException("call setRootScene first");
    }

    /* renamed from: a */
    public final C12666f mo31104a(int i) {
        this.f33632e = i;
        return this;
    }

    /* renamed from: b */
    public final C12666f mo31106b(boolean z) {
        this.f33631d = z;
        return this;
    }

    /* renamed from: a */
    public final C12666f mo31105a(boolean z) {
        this.f33630c = z;
        return this;
    }

    /* renamed from: a */
    public static C12666f m36820a(Bundle bundle) {
        String string = bundle.getString("extra_rootScene");
        if (string != null) {
            C12666f fVar = new C12666f(string, bundle.getBundle("extra_rootScene_arguments"));
            fVar.f33630c = bundle.getBoolean("extra_drawWindowBackground");
            fVar.f33631d = bundle.getBoolean("extra_fixSceneBackground_enabled");
            fVar.f33632e = bundle.getInt("extra_sceneBackground");
            return fVar;
        }
        throw new IllegalStateException("root scene class name cant be null");
    }

    private C12666f(String str, Bundle bundle) {
        this.f33628a = str;
        this.f33629b = bundle;
    }

    public C12666f(Class<? extends C12629j> cls, Bundle bundle) {
        if (!cls.isAssignableFrom(C12648d.class)) {
            this.f33628a = cls.getName();
            this.f33629b = bundle;
            return;
        }
        throw new IllegalArgumentException("cant use NavigationScene as root scene");
    }
}
