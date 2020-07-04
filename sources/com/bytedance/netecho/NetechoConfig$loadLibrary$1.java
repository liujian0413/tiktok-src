package com.bytedance.netecho;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;

final /* synthetic */ class NetechoConfig$loadLibrary$1 extends FunctionReference implements C7562b<String, C7581n> {
    public static final NetechoConfig$loadLibrary$1 INSTANCE = new NetechoConfig$loadLibrary$1();

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    NetechoConfig$loadLibrary$1() {
        super(1);
    }

    public final String getName() {
        return "loadLibrary";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(System.class);
    }

    public final String getSignature() {
        return "loadLibrary(Ljava/lang/String;)V";
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C7581n.f20898a;
    }

    public final void invoke(String str) {
        C7573i.m23587b(str, "p1");
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
    }
}
