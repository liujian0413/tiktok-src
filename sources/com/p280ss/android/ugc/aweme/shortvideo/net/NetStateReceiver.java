package com.p280ss.android.ugc.aweme.shortvideo.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.net.NetStateReceiver */
public class NetStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f104490a = "NetStateReceiver";

    /* renamed from: b */
    private static boolean f104491b;

    /* renamed from: c */
    private static int f104492c;

    /* renamed from: d */
    private static ArrayList<C40198a> f104493d = new ArrayList<>();

    /* renamed from: e */
    private static BroadcastReceiver f104494e;

    /* renamed from: b */
    private static boolean m128495b() {
        return f104491b;
    }

    /* renamed from: a */
    private static BroadcastReceiver m128490a() {
        if (f104494e == null) {
            synchronized (NetStateReceiver.class) {
                if (f104494e == null) {
                    f104494e = new NetStateReceiver();
                }
            }
        }
        return f104494e;
    }

    /* renamed from: c */
    private static void m128496c() {
        if (!f104493d.isEmpty()) {
            int size = f104493d.size();
            for (int i = 0; i < size; i++) {
                C40198a aVar = (C40198a) f104493d.get(i);
                if (aVar != null) {
                    if (m128495b()) {
                        aVar.mo99999a(f104492c);
                    } else {
                        aVar.mo99998a();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m128493b(Context context) {
        if (f104494e != null) {
            try {
                context.getApplicationContext().unregisterReceiver(f104494e);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m128494b(C40198a aVar) {
        if (f104493d != null && f104493d.contains(aVar)) {
            f104493d.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m128491a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.ugc.aweme.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.getApplicationContext().registerReceiver(m128490a(), intentFilter);
    }

    /* renamed from: a */
    public static void m128492a(C40198a aVar) {
        if (f104493d == null) {
            f104493d = new ArrayList<>();
        }
        f104493d.add(aVar);
    }

    public void onReceive(Context context, Intent intent) {
        f104494e = this;
        if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE") || intent.getAction().equalsIgnoreCase("com.ss.ugc.aweme.CONNECTIVITY_CHANGE")) {
            if (!C40199b.m128499a(context)) {
                f104491b = false;
            } else {
                f104491b = true;
                f104492c = C40199b.m128500b(context);
            }
            m128496c();
        }
    }
}
