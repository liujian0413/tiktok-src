package com.p280ss.android.ugc.aweme.challenge.p1084c;

import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.collect.C17777bq;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.f */
public final class C23678f extends C25640a<SearchChallengeList> {
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo61608a(SearchChallenge searchChallenge) {
        String str;
        if (searchChallenge.challenge == null) {
            str = null;
        } else {
            str = searchChallenge.challenge.getChallengeName();
        }
        return TextUtils.equals(str, ((SearchChallengeList) this.mData).keyword);
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                C23678f.this.mIsLoading = false;
                return ChallengeApi.m77600a((String) objArr[0], 20, (String) objArr[1]);
            }
        }, 0);
        return true;
    }

    public final void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            Exception exc = (Exception) message.obj;
            if (exc.getMessage() != null) {
                StringBuilder sb = new StringBuilder("challenge search failed, message:");
                sb.append(exc.getMessage());
                C41530am.m132283b(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("challenge search failed, stack trace:");
            sb2.append(Log.getStackTraceString(exc));
            C41530am.m132283b(sb2.toString());
        }
        super.handleMsg(message);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchChallengeList searchChallengeList) {
        if (searchChallengeList != null) {
            this.mData = searchChallengeList;
            if (((SearchChallengeList) this.mData).items == null) {
                ((SearchChallengeList) this.mData).items = new ArrayList();
            }
            if (!searchChallengeList.isMatch) {
                boolean isEmpty = ((SearchChallengeList) this.mData).items.isEmpty();
                if (!isEmpty) {
                    isEmpty = !C17777bq.m59104e(((SearchChallengeList) this.mData).items, new C23680g(this)).isPresent();
                }
                if (isEmpty) {
                    Challenge challenge = new Challenge();
                    challenge.setChallengeName(((SearchChallengeList) this.mData).keyword);
                    SearchChallenge searchChallenge = new SearchChallenge();
                    searchChallenge.challenge = challenge;
                    searchChallenge.isFake = true;
                    ((SearchChallengeList) this.mData).items.add(0, searchChallenge);
                }
            }
        }
    }
}
