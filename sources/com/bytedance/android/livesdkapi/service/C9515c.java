package com.bytedance.android.livesdkapi.service;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.live.C9321a;
import com.bytedance.android.livesdkapi.depend.live.C9328d;
import com.bytedance.android.livesdkapi.depend.live.C9332f;
import com.bytedance.android.livesdkapi.depend.live.C9337k;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController;
import com.bytedance.android.livesdkapi.depend.live.p444a.C9323b;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9345a;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9348c;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9350e;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9351f;
import com.bytedance.android.livesdkapi.p436c.C9293b;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdkapi.service.c */
public interface C9515c {
    /* renamed from: a */
    Fragment mo22001a(Context context, Bundle bundle);

    /* renamed from: a */
    Fragment mo22002a(C9348c cVar, Bundle bundle);

    /* renamed from: a */
    LiveActivityProxy mo22003a(FragmentActivity fragmentActivity, int i);

    /* renamed from: a */
    C9328d mo22004a(long j, Bundle bundle);

    /* renamed from: a */
    C9345a mo22005a(Bundle bundle);

    /* renamed from: a */
    <T> T mo22006a(String str, T t);

    /* renamed from: a */
    void mo22007a();

    /* renamed from: a */
    void mo22008a(long j, Bundle bundle, Context context);

    /* renamed from: a */
    void mo22009a(Context context);

    /* renamed from: a */
    void mo22010a(String str);

    /* renamed from: a */
    void mo22011a(String str, boolean z);

    /* renamed from: a */
    void mo22012a(Locale locale);

    /* renamed from: a */
    void mo22013a(boolean z);

    /* renamed from: a */
    boolean mo22014a(Context context, Uri uri);

    /* renamed from: b */
    C9293b mo22015b(Bundle bundle);

    /* renamed from: b */
    C9350e mo22016b();

    /* renamed from: c */
    C9516d mo22017c();

    /* renamed from: d */
    C9332f mo22018d();

    /* renamed from: e */
    ILivePlayController mo22019e();

    /* renamed from: f */
    C9323b mo22020f();

    /* renamed from: g */
    Fragment mo22021g();

    /* renamed from: h */
    C9321a mo22022h();

    /* renamed from: i */
    C9351f mo22023i();

    /* renamed from: j */
    C9337k mo22024j();
}
