package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.C22601c;
import com.p280ss.android.ugc.aweme.base.p1062f.C23333b;
import com.p280ss.android.ugc.aweme.commercialize.loft.C24863e;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26681f;
import com.p280ss.android.ugc.aweme.discover.presenter.C26815b;
import com.p280ss.android.ugc.aweme.festival.christmas.C29137d;
import com.p280ss.android.ugc.aweme.i18n.draftcompat.C30450a;
import com.p280ss.android.ugc.aweme.i18n.language.initial.C30489i;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32576d;
import com.p280ss.android.ugc.aweme.main.C32922c;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.main.C32981dh;
import com.p280ss.android.ugc.aweme.memory.C33202b;
import com.p280ss.android.ugc.aweme.metrics.p1394b.C33257a;
import com.p280ss.android.ugc.aweme.setting.C37556ai;
import com.p280ss.android.ugc.aweme.setting.model.IVerifyActionCache;
import com.p280ss.android.ugc.aweme.setting.p1518f.C37628a.C37629a;
import com.p280ss.android.ugc.aweme.setting.p1521i.C37652b;
import com.p280ss.android.ugc.aweme.setting.p1522j.C37654a.C37655a;
import com.p280ss.android.ugc.aweme.setting.p337ui.C37918h;
import com.p280ss.android.ugc.aweme.share.C37968ag;
import com.p280ss.android.ugc.aweme.story.shootvideo.C42011b;
import com.p280ss.android.ugc.aweme.video.C43212e.C43213a;
import com.p280ss.android.ugc.trill.share.p1767a.C45078a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.b */
public final class C23216b {

    /* renamed from: a */
    public static Map<Class, Object> f61207a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m76235a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface()) {
            return null;
        }
        if (C22601c.class.equals(cls)) {
            T t = f61207a.get(cls);
            if (t == null || !(t instanceof C23226l)) {
                t = new C23226l(applicationContext);
                f61207a.put(cls, t);
            }
            return t;
        } else if (C32961dd.class.equals(cls)) {
            T t2 = f61207a.get(cls);
            if (t2 == null || !(t2 instanceof C23238x)) {
                t2 = new C23238x(applicationContext);
                f61207a.put(cls, t2);
            }
            return t2;
        } else if (C32981dh.class.equals(cls)) {
            T t3 = f61207a.get(cls);
            if (t3 == null || !(t3 instanceof C23239y)) {
                t3 = new C23239y(applicationContext);
                f61207a.put(cls, t3);
            }
            return t3;
        } else if (C33202b.class.equals(cls)) {
            T t4 = f61207a.get(cls);
            if (t4 == null || !(t4 instanceof C23240z)) {
                t4 = new C23240z(applicationContext);
                f61207a.put(cls, t4);
            }
            return t4;
        } else if (C43213a.class.equals(cls)) {
            T t5 = f61207a.get(cls);
            if (t5 == null || !(t5 instanceof C23214at)) {
                t5 = new C23214at(applicationContext);
                f61207a.put(cls, t5);
            }
            return t5;
        } else if (C32576d.class.equals(cls)) {
            T t6 = f61207a.get(cls);
            if (t6 == null || !(t6 instanceof C23236v)) {
                t6 = new C23236v(applicationContext);
                f61207a.put(cls, t6);
            }
            return t6;
        } else if (C37629a.class.equals(cls)) {
            T t7 = f61207a.get(cls);
            if (t7 == null || !(t7 instanceof C23204aj)) {
                t7 = new C23204aj(applicationContext);
                f61207a.put(cls, t7);
            }
            return t7;
        } else if (C37918h.class.equals(cls)) {
            T t8 = f61207a.get(cls);
            if (t8 == null || !(t8 instanceof C23207am)) {
                t8 = new C23207am(applicationContext);
                f61207a.put(cls, t8);
            }
            return t8;
        } else if (C37968ag.class.equals(cls)) {
            T t9 = f61207a.get(cls);
            if (t9 == null || !(t9 instanceof C23209ao)) {
                t9 = new C23209ao(applicationContext);
                f61207a.put(cls, t9);
            }
            return t9;
        } else if (C23333b.class.equals(cls)) {
            T t10 = f61207a.get(cls);
            if (t10 == null || !(t10 instanceof C23227m)) {
                t10 = new C23227m(applicationContext);
                f61207a.put(cls, t10);
            }
            return t10;
        } else if (C24863e.class.equals(cls)) {
            T t11 = f61207a.get(cls);
            if (t11 == null || !(t11 instanceof C23229o)) {
                t11 = new C23229o(applicationContext);
                f61207a.put(cls, t11);
            }
            return t11;
        } else if (C26681f.class.equals(cls)) {
            T t12 = f61207a.get(cls);
            if (t12 == null || !(t12 instanceof C23230p)) {
                t12 = new C23230p(applicationContext);
                f61207a.put(cls, t12);
            }
            return t12;
        } else if (C26815b.class.equals(cls)) {
            T t13 = f61207a.get(cls);
            if (t13 == null || !(t13 instanceof C23231q)) {
                t13 = new C23231q(applicationContext);
                f61207a.put(cls, t13);
            }
            return t13;
        } else if (C29137d.class.equals(cls)) {
            T t14 = f61207a.get(cls);
            if (t14 == null || !(t14 instanceof C23233s)) {
                t14 = new C23233s(applicationContext);
                f61207a.put(cls, t14);
            }
            return t14;
        } else if (C30450a.class.equals(cls)) {
            T t15 = f61207a.get(cls);
            if (t15 == null || !(t15 instanceof C23234t)) {
                t15 = new C23234t(applicationContext);
                f61207a.put(cls, t15);
            }
            return t15;
        } else if (C30489i.class.equals(cls)) {
            T t16 = f61207a.get(cls);
            if (t16 == null || !(t16 instanceof C23235u)) {
                t16 = new C23235u(applicationContext);
                f61207a.put(cls, t16);
            }
            return t16;
        } else if (C32922c.class.equals(cls)) {
            T t17 = f61207a.get(cls);
            if (t17 == null || !(t17 instanceof C23237w)) {
                t17 = new C23237w(applicationContext);
                f61207a.put(cls, t17);
            }
            return t17;
        } else if (C33257a.class.equals(cls)) {
            T t18 = f61207a.get(cls);
            if (t18 == null || !(t18 instanceof C23195aa)) {
                t18 = new C23195aa(applicationContext);
                f61207a.put(cls, t18);
            }
            return t18;
        } else if (C37556ai.class.equals(cls)) {
            T t19 = f61207a.get(cls);
            if (t19 == null || !(t19 instanceof C23203ai)) {
                t19 = new C23203ai(applicationContext);
                f61207a.put(cls, t19);
            }
            return t19;
        } else if (IVerifyActionCache.class.equals(cls)) {
            T t20 = f61207a.get(cls);
            if (t20 == null || !(t20 instanceof C23205ak)) {
                t20 = new C23205ak(applicationContext);
                f61207a.put(cls, t20);
            }
            return t20;
        } else if (C37652b.class.equals(cls)) {
            T t21 = f61207a.get(cls);
            if (t21 == null || !(t21 instanceof C23206al)) {
                t21 = new C23206al(applicationContext);
                f61207a.put(cls, t21);
            }
            return t21;
        } else if (C37655a.class.equals(cls)) {
            T t22 = f61207a.get(cls);
            if (t22 == null || !(t22 instanceof C23208an)) {
                t22 = new C23208an(applicationContext);
                f61207a.put(cls, t22);
            }
            return t22;
        } else if (C42011b.class.equals(cls)) {
            T t23 = f61207a.get(cls);
            if (t23 == null || !(t23 instanceof C23213as)) {
                t23 = new C23213as(applicationContext);
                f61207a.put(cls, t23);
            }
            return t23;
        } else if (!C45078a.class.equals(cls)) {
            return null;
        } else {
            T t24 = f61207a.get(cls);
            if (t24 == null || !(t24 instanceof C23215au)) {
                t24 = new C23215au(applicationContext);
                f61207a.put(cls, t24);
            }
            return t24;
        }
    }
}
