package com.bytedance.android.live.core.utils;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C6311g;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.live.core.utils.q */
public final class C3401q {

    /* renamed from: c */
    private static C3401q f10208c = new C3401q();

    /* renamed from: a */
    public List<String> f10209a = new LinkedList();

    /* renamed from: b */
    public final Object f10210b = new Object();

    /* renamed from: d */
    private ExecutorService f10211d = C3403r.m12647a(1);

    /* renamed from: a */
    public static C3401q m12644a() {
        return f10208c;
    }

    private C3401q() {
    }

    /* renamed from: b */
    public final void mo10306b(ImageModel imageModel) {
        if (imageModel != null) {
            final List urls = imageModel.getUrls();
            if (urls != null && !urls.isEmpty()) {
                this.f10211d.execute(new Runnable() {
                    public final void run() {
                        synchronized (C3401q.this.f10210b) {
                            C3401q.this.f10209a.removeAll(urls);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final boolean mo10305a(ImageModel imageModel) {
        if (imageModel == null || C6311g.m19573a(imageModel.getUrls())) {
            return false;
        }
        synchronized (this.f10210b) {
            for (String contains : imageModel.getUrls()) {
                if (this.f10209a.contains(contains)) {
                    return true;
                }
            }
            return false;
        }
    }
}
