package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b.C9175a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdk.schema.interfaces.C8932b.C8933a;
import com.bytedance.android.livesdk.schema.interfaces.C8934c;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.common.utility.C6312h;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

public class LiveActionHandlerImpl implements C8931a {
    private RoomActionHandler roomActionHandler = new RoomActionHandler();
    private List<C8934c> schemaHandlers = new ArrayList();
    private C8938l userProfileActionHandler = new C8938l();

    /* renamed from: com.bytedance.android.livesdk.schema.LiveActionHandlerImpl$a */
    public static final class C8920a implements C9174b<C8931a> {
        /* renamed from: a */
        public final C9175a<C8931a> mo11528a(C9175a<C8931a> aVar) {
            return aVar.mo22388a(new LiveActionHandlerImpl()).mo22387a();
        }
    }

    public LiveActionHandlerImpl() {
        this.schemaHandlers.add(this.roomActionHandler);
        this.schemaHandlers.add(this.userProfileActionHandler);
        this.schemaHandlers.add(new C8939m());
        this.schemaHandlers.add(new C8927f());
        C3596c.m13174a(C8931a.class, this);
    }

    public boolean showUserProfile(long j) {
        return C8938l.m26743a(j, null, null);
    }

    static final /* synthetic */ void lambda$postReportReason$0$LiveActionHandlerImpl(C3479d dVar) throws Exception {
        if (dVar != null && dVar.data != null && !TextUtils.isEmpty(((ReportCommitData) dVar.data).desc)) {
            C9049ap.m27028a(((ReportCommitData) dVar.data).desc);
        }
    }

    static final /* synthetic */ void lambda$postReportReason$1$LiveActionHandlerImpl(Throwable th) throws Exception {
        if (th instanceof ApiServerException) {
            C9049ap.m27028a(((ApiServerException) th).getErrorMsg());
            C6312h.m19577a(th);
        }
    }

    public boolean canHandle(Uri uri) {
        for (C8934c canHandle : this.schemaHandlers) {
            if (canHandle.canHandle(uri)) {
                return true;
            }
        }
        return false;
    }

    public C8934c getHandler(Uri uri) {
        for (C8934c cVar : this.schemaHandlers) {
            if (cVar.canHandle(uri)) {
                return cVar;
            }
        }
        return null;
    }

    public boolean handle(Context context, Uri uri) {
        return handleSchema(context, uri, true);
    }

    public boolean openRoom(Context context, C8933a aVar) {
        return this.roomActionHandler.handleEnterRoom(context, aVar);
    }

    public boolean handle(Context context, String str) {
        return handleSchema(context, Uri.parse(str), true);
    }

    public boolean handleWithoutHost(Context context, String str) {
        return handleSchema(context, Uri.parse(str), false);
    }

    public boolean showUserProfile(long j, String str, Map<String, String> map) {
        return C8938l.m26743a(j, str, map);
    }

    private boolean handleSchema(Context context, Uri uri, boolean z) {
        if ((TextUtils.equals(uri.getScheme(), WebKitApi.SCHEME_HTTP) || TextUtils.equals(uri.getScheme(), WebKitApi.SCHEME_HTTPS)) && z) {
            C9178j.m27302j().mo22374c().mo11535a(context, C3979c.m13952b(uri.toString()));
            return true;
        }
        C8934c handler = getHandler(uri);
        if (handler != null) {
            return handler.handle(context, uri);
        }
        if (!z || !TTLiveSDKContext.getHostService().mo22365f().mo22047a(context, uri.toString())) {
            return false;
        }
        return true;
    }

    public void postReportReason(long j, long j2, long j3, String str) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).postReportReasons(j, j2, j3, str).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a(C8925d.f24293a, C8926e.f24294a);
    }
}
