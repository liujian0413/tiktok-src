package com.bytedance.android.live.gson;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.C6713p;
import com.google.gson.C6714q;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class FeedItemTypeAdapter implements C6708j<FeedItem>, C6714q<FeedItem> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6709k mo10404a(Object obj, Type type, C6713p pVar) {
        return m12745a((FeedItem) obj, type, pVar);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        return m12746b(kVar, type, iVar);
    }

    /* renamed from: a */
    private static C6709k m12745a(FeedItem feedItem, Type type, C6713p pVar) {
        C6711m m = C2317a.m9933b().mo15963a((Object) feedItem).mo16136m();
        m.mo16144a("data", C2317a.m9933b().mo15964a((Object) feedItem.getRoom(), (Type) Room.class));
        return m;
    }

    /* renamed from: b */
    private static FeedItem m12746b(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        try {
            FeedItem feedItem = (FeedItem) C2317a.m9933b().mo15970a(kVar, FeedItem.class);
            feedItem.init();
            return feedItem;
        } catch (Exception unused) {
            throw new JsonParseException("error type");
        }
    }
}
