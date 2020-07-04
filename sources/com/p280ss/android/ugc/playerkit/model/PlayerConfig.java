package com.p280ss.android.ugc.playerkit.model;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.p280ss.android.ugc.playerkit.p1750a.C44908b;
import com.p280ss.android.ugc.playerkit.p1750a.C44909c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.playerkit.model.PlayerConfig */
public final class PlayerConfig {

    /* renamed from: a */
    public Context f115496a;

    /* renamed from: b */
    public Type f115497b;

    /* renamed from: c */
    public boolean f115498c;

    /* renamed from: d */
    public C44908b f115499d;

    /* renamed from: e */
    public C44909c f115500e;

    /* renamed from: f */
    public SparseIntArray f115501f;

    /* renamed from: g */
    public SparseArray f115502g;

    /* renamed from: h */
    public C44915a f115503h;

    /* renamed from: i */
    public boolean f115504i;

    /* renamed from: j */
    public C44916b f115505j;

    /* renamed from: k */
    public boolean f115506k;

    /* renamed from: l */
    private int f115507l;

    /* renamed from: com.ss.android.ugc.playerkit.model.PlayerConfig$Type */
    public enum Type {
        Ijk,
        IjkHardware,
        TT,
        EXO,
        TT_IJK_ENGINE,
        TT_HARDWARE,
        LIVE
    }

    /* renamed from: com.ss.android.ugc.playerkit.model.PlayerConfig$a */
    public static class C44915a {

        /* renamed from: a */
        public static int f115509a = 1048576;

        /* renamed from: b */
        public static int f115510b = 409600;

        /* renamed from: c */
        public int f115511c;

        /* renamed from: d */
        public int f115512d = f115509a;

        /* renamed from: e */
        public int f115513e = f115510b;

        /* renamed from: f */
        public int f115514f = 1;

        /* renamed from: g */
        public int f115515g = 1;

        /* renamed from: h */
        public int f115516h = 2;

        /* renamed from: i */
        public int f115517i;
    }

    /* renamed from: com.ss.android.ugc.playerkit.model.PlayerConfig$b */
    public static class C44916b {

        /* renamed from: a */
        public String f115518a;

        /* renamed from: b */
        public Map<String, String> f115519b;
    }

    private PlayerConfig() {
    }

    /* renamed from: a */
    public static PlayerConfig m141681a() {
        return new PlayerConfig();
    }

    /* renamed from: d */
    public final void mo107394d() {
        this.f115507l |= 1;
    }

    /* renamed from: e */
    public final void mo107395e() {
        this.f115507l |= 2;
    }

    /* renamed from: f */
    private boolean m141682f() {
        if ((this.f115507l & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo107393c() {
        if ((this.f115507l & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo107392b() {
        if (m141682f() || mo107393c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final PlayerConfig mo107387a(Context context) {
        this.f115496a = context;
        return this;
    }

    /* renamed from: a */
    public final PlayerConfig mo107388a(SparseArray sparseArray) {
        this.f115502g = sparseArray;
        return this;
    }

    /* renamed from: a */
    public final PlayerConfig mo107389a(SparseIntArray sparseIntArray) {
        this.f115501f = sparseIntArray;
        return this;
    }

    /* renamed from: a */
    public final PlayerConfig mo107390a(C44908b bVar) {
        this.f115499d = bVar;
        return this;
    }

    /* renamed from: a */
    public final PlayerConfig mo107391a(Type type) {
        this.f115497b = type;
        return this;
    }
}
