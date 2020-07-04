package com.bytedance.ies.bullet.kit.web;

import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.web.a */
public final class C10616a {

    /* renamed from: com.bytedance.ies.bullet.kit.web.a$a */
    public static final class C10617a implements C10646m {

        /* renamed from: a */
        final /* synthetic */ WebResourceRequest f28456a;

        C10617a(WebResourceRequest webResourceRequest) {
            this.f28456a = webResourceRequest;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.a$b */
    public static final class C10618b implements C10645l {

        /* renamed from: a */
        final /* synthetic */ WebResourceError f28457a;

        C10618b(WebResourceError webResourceError) {
            this.f28457a = webResourceError;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.a$c */
    public static final class C10619c implements C10639f {

        /* renamed from: a */
        final /* synthetic */ PermissionRequest f28458a;

        C10619c(PermissionRequest permissionRequest) {
            this.f28458a = permissionRequest;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.a$d */
    public static final class C10620d implements C10629c {

        /* renamed from: a */
        final /* synthetic */ FileChooserParams f28459a;

        C10620d(FileChooserParams fileChooserParams) {
            this.f28459a = fileChooserParams;
        }
    }

    /* renamed from: a */
    public static final C10629c m31051a(FileChooserParams fileChooserParams) {
        C7573i.m23587b(fileChooserParams, "$this$transform");
        return new C10620d(fileChooserParams);
    }

    /* renamed from: a */
    public static final C10639f m31052a(PermissionRequest permissionRequest) {
        C7573i.m23587b(permissionRequest, "$this$transform");
        return new C10619c(permissionRequest);
    }

    /* renamed from: a */
    public static final C10645l m31053a(WebResourceError webResourceError) {
        C7573i.m23587b(webResourceError, "$this$transform");
        return new C10618b(webResourceError);
    }

    /* renamed from: a */
    public static final C10646m m31054a(WebResourceRequest webResourceRequest) {
        C7573i.m23587b(webResourceRequest, "$this$transform");
        return new C10617a(webResourceRequest);
    }
}
