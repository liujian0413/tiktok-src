package com.p280ss.android.ugc.aweme.discover.presenter;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.discover.api.SearchSugApi;
import com.p280ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.p280ss.android.ugc.aweme.discover.presenter.C26817d.C26818a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.r */
public final class C26841r extends C25652b<C25640a<SearchSugResponse>, C26818a> {

    /* renamed from: a */
    public int f70839a;

    /* renamed from: d */
    public String f70840d;

    /* renamed from: e */
    public String f70841e;

    /* renamed from: f */
    private Handler f70842f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private Runnable f70843g = new Runnable() {
        public final void run() {
            C26841r.this.mo56976a(C26841r.this.f70840d, C26841r.this.f70841e);
        }
    };

    public C26841r() {
        mo66536a(new C25640a<SearchSugResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length == 0 || TextUtils.isEmpty(objArr[0])) {
                    return false;
                }
                return true;
            }

            public final void handleMsg(Message message) {
                if (message.what != C26841r.this.f70839a) {
                    this.mHandler.removeMessages(message.what);
                } else {
                    super.handleMsg(message);
                }
            }

            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                this.mIsLoading = false;
                C26841r.this.f70839a = (C26841r.this.f70839a + 1) % 10;
                C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        String str;
                        String str2 = (String) objArr[0];
                        if (objArr.length > 1) {
                            str = (String) objArr[1];
                        } else {
                            str = null;
                        }
                        return SearchSugApi.m87319a(str2, str);
                    }
                }, C26841r.this.f70839a);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo56977b() {
        SearchSugResponse searchSugResponse;
        if (this.f67571b != null) {
            searchSugResponse = (SearchSugResponse) this.f67571b.getData();
        } else {
            searchSugResponse = null;
        }
        if (this.f67572c != null) {
            if (searchSugResponse != null) {
                C28199ae.m92689a().mo71792a(searchSugResponse.requestId, searchSugResponse.logPb);
                ((C26818a) this.f67572c).mo69477a(searchSugResponse);
                return;
            }
            ((C26818a) this.f67572c).mo69478b();
        }
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            ((C26818a) this.f67572c).mo69478b();
        }
    }

    /* renamed from: a */
    public final void mo69502a(String str, String str2) {
        this.f70840d = str;
        this.f70841e = str2;
        this.f70842f.removeCallbacks(this.f70843g);
        this.f70842f.postDelayed(this.f70843g, 150);
    }
}
