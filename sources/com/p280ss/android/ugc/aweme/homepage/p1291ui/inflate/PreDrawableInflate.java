package com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.p1290ui.HomePageUIFrameService;
import com.p280ss.android.ugc.aweme.lego.LegoInflate;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate */
public class PreDrawableInflate implements LegoInflate {
    private final Map<Integer, Drawable> drawableCache = new ConcurrentHashMap();
    private final Map<String, Object> valueCache = new ConcurrentHashMap();

    public int theme() {
        return R.style.gu;
    }

    public Class<? extends Activity> activity() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getHomePageInflateActivityClass();
    }

    public Drawable getFestivalDrawable() {
        Drawable drawable = (Drawable) this.drawableCache.remove(Integer.valueOf(-100));
        if (drawable == null) {
            return C29125d.m95532k();
        }
        return drawable;
    }

    public Object getValue(String str) {
        return this.valueCache.get(str);
    }

    private void preloadValue(String str, Object obj) {
        this.valueCache.put(str, obj);
    }

    private void preLoadDrawable(int i, Drawable drawable) {
        if (drawable != null) {
            this.drawableCache.put(Integer.valueOf(i), drawable);
        }
    }

    public Drawable getDrawable(int i, Context context) {
        Drawable drawable = (Drawable) this.drawableCache.remove(Integer.valueOf(i));
        if (drawable == null) {
            return context.getResources().getDrawable(i);
        }
        return drawable;
    }

    public void inflate(Context context, Activity activity) {
        Context context2 = context;
        if (C6399b.m19946v()) {
            preLoadDrawable(R.drawable.ajk, context2, true);
            preLoadDrawable(R.drawable.ak2, context2, true);
            preLoadDrawable(R.drawable.ajs, context2, true);
            preLoadDrawable(R.drawable.ajy, context2, true);
            preLoadDrawable(R.drawable.aji, context2, true);
            preLoadDrawable(R.drawable.a90, context2, true);
            preLoadDrawable(R.drawable.a91, context2, true);
            preLoadDrawable(R.drawable.a92, context2, true);
            preLoadDrawable(R.drawable.a93, context2, true);
            preLoadDrawable(R.drawable.ajg, context2, true);
            preLoadDrawable(R.drawable.a94, context2, true);
            preLoadDrawable(R.drawable.a95, context2, true);
            preLoadDrawable(R.drawable.a96, context2, true);
            preLoadDrawable(R.drawable.a97, context2, true);
            preLoadDrawable(R.drawable.a98, context2, true);
            preLoadDrawable(R.drawable.a99, context2, true);
            preLoadDrawable(R.drawable.ajf, context2, true);
            preLoadDrawable(R.drawable.a9_, context2, true);
            preLoadDrawable(R.drawable.a9a, context2, true);
            preLoadDrawable(R.drawable.ba4, context2, true);
        } else {
            preLoadDrawable(R.drawable.ajg, context2, true);
            preLoadDrawable(R.drawable.ajk, context2, true);
            preLoadDrawable(R.drawable.ak2, context2, true);
            preLoadDrawable(R.drawable.ajq, context2, true);
            preLoadDrawable(R.drawable.ajs, context2, true);
            preLoadDrawable(R.drawable.ajw, context2, true);
            preLoadDrawable(R.drawable.ajy, context2, true);
            preLoadDrawable(R.drawable.ak0, context2, true);
            preLoadDrawable(R.drawable.ap6, context2, true);
            preLoadDrawable(R.drawable.ap4, context2, true);
            preLoadDrawable(R.drawable.ap2, context2, true);
            preLoadDrawable(R.drawable.asb, context2, true);
            preLoadDrawable(R.drawable.aju, context2, true);
            preLoadDrawable(R.drawable.ajo, context2, true);
            preLoadDrawable(R.drawable.b_7, context2, true);
            preLoadDrawable(R.drawable.aji, context2, true);
            preLoadDrawable(R.drawable.av2, context2, true);
            preLoadDrawable(R.drawable.arz, context2, true);
            preLoadDrawable(R.drawable.a90, context2, true);
            preLoadDrawable(R.drawable.a91, context2, true);
            preLoadDrawable(R.drawable.a92, context2, true);
            preLoadDrawable(R.drawable.a93, context2, true);
            preLoadDrawable(R.drawable.a96, context2, true);
            preLoadDrawable(R.drawable.a97, context2, true);
            preLoadDrawable(R.drawable.a98, context2, true);
            preLoadDrawable(R.drawable.a99, context2, true);
            preLoadDrawable(R.drawable.aw5, context2, true);
            preLoadDrawable(R.drawable.az2, context2, true);
            preLoadDrawable(R.drawable.auq, context2, true);
        }
        try {
            preLoadDrawable(-100, C29125d.m95532k());
        } catch (Exception unused) {
        }
        preloadValue("status_bar_height", Integer.valueOf(context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
    }

    private void preLoadDrawable(int i, Context context, boolean z) {
        try {
            Drawable drawable = context.getResources().getDrawable(i);
            if (z) {
                this.drawableCache.put(Integer.valueOf(i), drawable);
            }
        } catch (Exception unused) {
        }
    }
}
