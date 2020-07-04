package com.p280ss.android.ugc.aweme.story.shootvideo.textrecord;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.c */
public class C42058c {

    /* renamed from: a */
    private static C42058c f109257a;

    /* renamed from: b */
    private List<C42057b> f109258b = new ArrayList();

    /* renamed from: c */
    private int f109259c;

    /* renamed from: a */
    public static C42058c m133726a() {
        if (f109257a == null) {
            synchronized (C42058c.class) {
                if (f109257a == null) {
                    f109257a = new C42058c();
                }
            }
        }
        return f109257a;
    }

    /* renamed from: b */
    public final void mo103294b() {
        this.f109259c++;
        if (this.f109259c == this.f109258b.size()) {
            this.f109259c = 0;
        }
    }

    /* renamed from: c */
    public final C42057b mo103295c() {
        if (this.f109259c == this.f109258b.size()) {
            this.f109259c = 0;
        }
        return (C42057b) this.f109258b.get(this.f109259c);
    }

    private C42058c() {
        this.f109258b.add(new C42057b(new int[]{-16716612, -16745761}, -1, -1056964609));
        this.f109258b.add(new C42057b(new int[]{-20071, -55717}, -1, -1056964609));
        this.f109258b.add(new C42057b(new int[]{-14625300, -5938690, -119723}, -1, -1056964609));
        this.f109258b.add(new C42057b(new int[]{-468142, -42147}, -1, -1056964609));
        this.f109258b.add(new C42057b(new int[]{-16352892, -15726275}, -1, -1056964609));
        this.f109258b.add(new C42057b(new int[]{-1773591, -7100977}, -16777216, 1442840576));
        this.f109258b.add(new C42057b(new int[]{-12369085, -16777216}, -1, -1056964609));
    }
}
