package com.bytedance.lobby.p616vk;

import android.content.Context;
import com.bytedance.lobby.C12203b;
import com.bytedance.lobby.internal.BaseProvider;
import com.bytedance.lobby.internal.LobbyCore;
import com.p1848vk.sdk.VKSdk;

/* renamed from: com.bytedance.lobby.vk.VkProvider */
class VkProvider<T> extends BaseProvider<T> {
    /* renamed from: e */
    public final void mo29949e() {
        try {
            VKSdk.m147249a((Context) this.f27a, Integer.parseInt(this.f32494b.f32467c), "");
        } catch (Exception unused) {
        }
    }

    VkProvider(C12203b bVar) {
        super(LobbyCore.getApplication(), bVar);
    }
}
