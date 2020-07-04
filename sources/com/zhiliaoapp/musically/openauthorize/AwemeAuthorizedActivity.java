package com.zhiliaoapp.musically.openauthorize;

import android.os.Bundle;
import android.view.View;
import com.p280ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity;
import java.util.HashMap;

public final class AwemeAuthorizedActivity extends BaseI18nAuthorizedActivity {
    private HashMap _$_findViewCache;

    public final void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
