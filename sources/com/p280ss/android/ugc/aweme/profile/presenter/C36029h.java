package com.p280ss.android.ugc.aweme.profile.presenter;

import bolts.C1591g;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.effect.EffectApi;
import com.p280ss.android.ugc.aweme.effect.EffectApi.API;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.feed.model.NewFaceSticker;
import com.p280ss.android.ugc.aweme.feed.model.NewStickerItemList;
import com.p280ss.android.ugc.aweme.net.C34089j;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.h */
public final class C36029h extends C25673a<NewFaceSticker, NewStickerItemList> {
    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    public final List<NewFaceSticker> getItems() {
        NewStickerItemList newStickerItemList = (NewStickerItemList) this.mData;
        if (newStickerItemList != null) {
            return newStickerItemList.stickers;
        }
        return null;
    }

    public final boolean isHasMore() {
        if (this.mData == null || ((NewStickerItemList) this.mData).hasMore != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(NewStickerItemList newStickerItemList) {
        LogPbBean logPbBean;
        super.handleData(newStickerItemList);
        if (newStickerItemList != null) {
            List<NewFaceSticker> list = newStickerItemList.stickers;
            if (list != null) {
                for (NewFaceSticker newFaceSticker : list) {
                    if (newStickerItemList != null) {
                        logPbBean = newStickerItemList.logPb;
                    } else {
                        logPbBean = null;
                    }
                    newFaceSticker.setLogPb(logPbBean);
                }
            }
        }
    }

    public final void loadMoreList(Object... objArr) {
        String str;
        long j;
        C7573i.m23587b(objArr, "params");
        API a = EffectApi.m89609a();
        Object obj = objArr[1];
        if (obj != null) {
            String str2 = (String) obj;
            if (objArr.length >= 3) {
                String str3 = objArr[2];
                if (str3 != null) {
                    str = str3;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                str = null;
            }
            String str4 = str;
            if (this.mData == null) {
                j = 0;
            } else {
                j = ((NewStickerItemList) this.mData).cursor;
            }
            a.getEffectList(str2, str4, j, 10).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }

    public final void refreshList(Object... objArr) {
        String str;
        C7573i.m23587b(objArr, "params");
        API a = EffectApi.m89609a();
        Object obj = objArr[1];
        if (obj != null) {
            String str2 = (String) obj;
            if (objArr.length >= 3) {
                String str3 = objArr[2];
                if (str3 != null) {
                    str = str3;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                str = null;
            }
            a.getEffectList(str2, str, 0, 10).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
    }
}
