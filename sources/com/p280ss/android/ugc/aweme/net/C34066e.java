package com.p280ss.android.ugc.aweme.net;

import android.content.Context;
import com.p280ss.android.common.p852c.C19279b;
import com.p280ss.android.common.p852c.C19281d;
import com.p280ss.android.common.p852c.p853a.C19274a;
import com.p280ss.android.common.util.C19288d;
import com.p280ss.android.common.util.C6773c;
import com.p280ss.android.common.util.C6775g;
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.http.legacy.p296a.C6810f;
import java.util.List;
import org.apache.http.client.RedirectHandler;

/* renamed from: com.ss.android.ugc.aweme.net.e */
public abstract class C34066e implements C19279b {

    /* renamed from: a */
    protected C19279b f88836a;

    /* renamed from: b */
    protected Context f88837b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C19279b mo86744a();

    /* renamed from: a */
    public final byte[] mo26329a(int i, String str) throws Exception {
        if (this.f88836a == null) {
            this.f88836a = mo86744a();
        }
        return this.f88836a.mo26329a(i, str);
    }

    /* renamed from: a */
    public final boolean mo26328a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, C6773c<String> cVar, String str2, C6775g gVar, List<C19565e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) throws Exception {
        if (this.f88836a == null) {
            this.f88836a = mo86744a();
        }
        return this.f88836a.mo26328a(i, str, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, gVar, list, strArr, iArr, redirectHandler);
    }

    public C34066e(Context context) {
        this.f88837b = context;
    }

    /* renamed from: a */
    public final String mo26349a(int i, int i2, String str, List<C6809a> list) throws Exception {
        if (this.f88836a == null) {
            return null;
        }
        return this.f88836a.mo26349a(i, i2, str, list);
    }

    /* renamed from: a */
    public final String mo26321a(int i, int i2, String str, List<C19565e> list, C19274a aVar, C19281d[] dVarArr) throws Exception {
        if (this.f88836a == null) {
            this.f88836a = mo86744a();
        }
        return this.f88836a.mo26321a(i, i2, str, list, aVar, dVarArr);
    }

    /* renamed from: a */
    public final String mo26324a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception {
        if (this.f88836a == null) {
            this.f88836a = mo86744a();
        }
        return this.f88836a.mo26324a(i, i2, str, bArr, str2, str3);
    }

    /* renamed from: a */
    public final String mo26326a(int i, String str, C19274a aVar, C19288d<Long> dVar, long j, C19281d[] dVarArr) throws Exception {
        if (this.f88836a == null) {
            this.f88836a = mo86744a();
        }
        return this.f88836a.mo26326a(i, str, aVar, dVar, j, dVarArr);
    }

    /* renamed from: b */
    public final String mo26351b(int i, int i2, String str, List<C19565e> list, boolean z, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        if (this.f88836a == null) {
            return null;
        }
        return this.f88836a.mo26351b(i, i2, str, list, z, dVarArr, list2);
    }

    /* renamed from: b */
    public final String mo26352b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C6809a> list) throws Exception {
        if (this.f88836a == null) {
            return null;
        }
        return this.f88836a.mo26352b(i, i2, str, bArr, str2, str3, list);
    }

    /* renamed from: a */
    public final String mo26323a(int i, int i2, String str, List<C19565e> list, boolean z, C19281d[] dVarArr, List<C6809a> list2) throws Exception {
        if (this.f88836a == null) {
            this.f88836a = mo86744a();
        }
        return this.f88836a.mo26323a(i, i2, str, list, z, dVarArr, list2);
    }

    /* renamed from: a */
    public final String mo26325a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C6809a> list) throws Exception {
        if (this.f88836a == null) {
            this.f88836a = mo86744a();
        }
        return this.f88836a.mo26325a(i, i2, str, bArr, str2, str3, list);
    }

    /* renamed from: a */
    public final String mo26322a(int i, int i2, String str, List<C6809a> list, boolean z, boolean z2, C6810f fVar, boolean z3) throws Exception {
        if (this.f88836a == null) {
            this.f88836a = mo86744a();
        }
        return this.f88836a.mo26322a(i, i2, str, list, z, z2, fVar, z3);
    }

    /* renamed from: a */
    public final boolean mo26327a(int i, String str, String str2, String str3, String str4, C6773c<String> cVar, String str5, C6775g gVar, List<C19565e> list, String[] strArr, int[] iArr) throws Exception {
        if (this.f88836a == null) {
            this.f88836a = mo86744a();
        }
        return this.f88836a.mo26327a(i, str, str2, str3, str4, cVar, str5, gVar, list, strArr, iArr);
    }
}
