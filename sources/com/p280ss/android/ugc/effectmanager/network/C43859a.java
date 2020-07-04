package com.p280ss.android.ugc.effectmanager.network;

import android.accounts.NetworkErrorException;
import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p280ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43720b;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a;
import com.p280ss.android.ugc.effectmanager.link.C43849a;
import java.io.InputStream;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.effectmanager.network.a */
public final class C43859a {

    /* renamed from: a */
    public C43720b f113630a;

    /* renamed from: b */
    public C43849a f113631b = new C43849a(null);

    public C43859a(C43720b bVar) {
        this.f113630a = bVar;
    }

    /* renamed from: a */
    public final InputStream mo106116a(C43707b bVar) throws Exception {
        InputStream a = this.f113630a.mo70656a(bVar);
        if (a != null) {
            return a;
        }
        this.f113631b.mo106069a(bVar.f113169a);
        if (this.f113631b.f113606e == null) {
            StringBuilder sb = new StringBuilder("link-selector context is null, with ");
            sb.append(bVar.f113175g);
            throw new LinkErrorException(sb.toString());
        } else if (!this.f113631b.mo106071c()) {
            throw new Exception("network unavailable");
        } else if (TextUtils.isEmpty(bVar.f113175g)) {
            throw new NetworkErrorException("Download error");
        } else {
            throw new NetworkErrorException(bVar.f113175g);
        }
    }

    /* renamed from: a */
    public final <T extends BaseNetResponse> T mo106114a(C43707b bVar, C43721c cVar, Class<T> cls) throws Exception {
        InputStream a = this.f113630a.mo70656a(bVar);
        if (a == null) {
            this.f113631b.mo106069a(bVar.f113169a);
            if (this.f113631b.f113606e == null) {
                StringBuilder sb = new StringBuilder("link-selector context is null, with ");
                sb.append(bVar.f113175g);
                throw new LinkErrorException(sb.toString());
            } else if (!this.f113631b.mo106071c()) {
                throw new Exception("network unavailable");
            } else if (TextUtils.isEmpty(bVar.f113175g)) {
                throw new NetworkErrorException("Download error");
            } else {
                throw new NetworkErrorException(bVar.f113175g);
            }
        } else {
            T t = (BaseNetResponse) cVar.mo70689a(a, cls);
            C43729a.m138574a(a);
            if (t != null) {
                int i = t.status_code;
                if (i == 0) {
                    return t;
                }
                this.f113631b.mo106069a(bVar.f113169a);
                throw new StatusCodeException(i, t.message);
            }
            this.f113631b.mo106069a(bVar.f113169a);
            throw new JSONException("Json convert fail");
        }
    }

    /* renamed from: a */
    public final <T extends BaseNetResponse> T mo106115a(C43707b bVar, InputStream inputStream, C43721c cVar, Class<T> cls) throws Exception {
        T t = (BaseNetResponse) cVar.mo70689a(inputStream, cls);
        if (t != null) {
            int i = t.status_code;
            if (i == 0) {
                return t;
            }
            this.f113631b.mo106069a(bVar.f113169a);
            throw new StatusCodeException(i, t.message);
        }
        this.f113631b.mo106069a(bVar.f113169a);
        throw new JSONException("Json convert fail");
    }
}
