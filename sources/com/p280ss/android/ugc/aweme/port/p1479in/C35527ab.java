package com.p280ss.android.ugc.aweme.port.p1479in;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C25672e;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.port.in.ab */
public interface C35527ab {

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$a */
    public interface C35528a {
        /* renamed from: a */
        boolean mo83272a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$b */
    public interface C35529b extends C25672e {
        /* renamed from: a */
        void mo90341a(Exception exc, String str);

        /* renamed from: a */
        void mo90342a(List<AVMusic> list, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.ab$c */
    public interface C35530c {
        /* renamed from: a */
        void mo90343a(String str, int i, String str2, int i2);

        /* renamed from: a */
        void mo90344a(String str, int i, String str2, Exception exc);

        /* renamed from: a */
        void mo90345a(String str, int i, String str2, float[] fArr);
    }

    /* renamed from: a */
    UrlModel mo83258a(Object obj);

    /* renamed from: a */
    C35528a mo83259a(C35529b bVar);

    /* renamed from: a */
    C44849d mo83260a(String str, String str2);

    /* renamed from: a */
    String mo83261a(String str);

    /* renamed from: a */
    void mo83262a(Fragment fragment, int i, String str, int i2, Object obj, boolean z, Bundle bundle, String str2, String str3);

    /* renamed from: a */
    void mo83263a(AVMusic aVMusic, C35530c cVar);

    /* renamed from: a */
    void mo83264a(String str, C35526aa aaVar);

    /* renamed from: a */
    boolean mo83265a(int i);

    /* renamed from: a */
    boolean mo83266a(AVMusic aVMusic, Context context, boolean z);

    /* renamed from: b */
    int mo83267b(String str);
}
