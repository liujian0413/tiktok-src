package com.p280ss.android.ugc.aweme.setting;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.setting.model.PopupResponse;
import com.p280ss.android.ugc.aweme.setting.model.PopupSetting;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.setting.PopupSettingManager */
public class PopupSettingManager implements C6310a {

    /* renamed from: a */
    static PopupSettingRequestApi f97893a = ((PopupSettingRequestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f97894b).create(PopupSettingRequestApi.class));

    /* renamed from: b */
    private static final String f97894b = Api.f60502b;

    /* renamed from: c */
    private static PopupSettingManager f97895c;

    /* renamed from: d */
    private C6309f f97896d = new C6309f(this);

    /* renamed from: e */
    private C6309f f97897e;

    /* renamed from: f */
    private int f97898f;

    /* renamed from: g */
    private Map<String, PopupSetting> f97899g = new HashMap();

    /* renamed from: h */
    private boolean f97900h;

    /* renamed from: com.ss.android.ugc.aweme.setting.PopupSettingManager$PopupSettingRequestApi */
    interface PopupSettingRequestApi {
        @C7730f(mo20420a = "/aweme/v1/user/popup/")
        C18253l<PopupResponse> requestPopupConfig();
    }

    private PopupSettingManager() {
    }

    /* renamed from: a */
    public static PopupSettingManager m120234a() {
        if (f97895c == null) {
            synchronized (PopupSettingManager.class) {
                if (f97895c == null) {
                    f97895c = new PopupSettingManager();
                }
            }
        }
        return f97895c;
    }

    /* renamed from: a */
    private void m120235a(C6309f fVar) {
        C23397p.m76735a().mo60807a(fVar, new Callable() {
            public final Object call() throws Exception {
                try {
                    return PopupSettingManager.f97893a.requestPopupConfig().get();
                } catch (ExecutionException e) {
                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
                }
            }
        }, 1);
    }

    /* renamed from: a */
    public final PopupSetting mo94809a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PopupSetting popupSetting = (PopupSetting) this.f97899g.get(str);
        this.f97899g.put(str, null);
        return popupSetting;
    }

    public void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof ApiServerException) {
            C10761a.m31403c(C6399b.m19921a(), ((ApiServerException) obj).getErrorMsg()).mo25750a();
        } else if (obj instanceof Exception) {
            C10761a.m31403c(C6399b.m19921a(), C6399b.m19921a().getResources().getString(R.string.cjt)).mo25750a();
        } else {
            if ((obj instanceof PopupResponse) && i == 1) {
                PopupResponse popupResponse = (PopupResponse) obj;
                if (popupResponse != null) {
                    List<PopupSetting> list = popupResponse.popups;
                    if (list != null) {
                        for (PopupSetting popupSetting : list) {
                            if (popupSetting != null) {
                                try {
                                    String str = popupSetting.f98129id;
                                    if (!TextUtils.isEmpty(str)) {
                                        this.f97899g.put(str, popupSetting);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                        this.f97900h = true;
                        if (this.f97897e != null) {
                            this.f97897e.sendEmptyMessage(this.f97898f);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo94810a(C6309f fVar, int i) {
        this.f97897e = fVar;
        this.f97898f = 2;
        synchronized (this) {
            m120235a(this.f97896d);
        }
    }
}
