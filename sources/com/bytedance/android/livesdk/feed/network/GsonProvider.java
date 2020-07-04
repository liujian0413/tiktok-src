package com.bytedance.android.livesdk.feed.network;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.feed.services.C6115b.C6118b;
import com.bytedance.android.livesdk.feed.services.C6115b.C6118b.C6119a;
import com.bytedance.android.livesdk.feed.services.FeedItemDeserializer;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.C6715r;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.JsonParseException;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public final class GsonProvider implements C6118b<C6600e> {

    static abstract class AbsJsonDeserializer<T> implements C6708j<T> {

        /* renamed from: a */
        protected C6600e f17972a;

        public AbsJsonDeserializer(C6600e eVar) {
            this.f17972a = eVar;
        }
    }

    static class BaseListResponseDeserializer extends AbsJsonDeserializer<C3474a> {
        public BaseListResponseDeserializer(C6600e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C3474a mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
            C6711m m = kVar.mo16136m();
            int g = m.mo16149b("status_code").mo16003g();
            if (g == 0) {
                return (C3474a) this.f17972a.mo15971a(kVar, type);
            }
            C3474a aVar = new C3474a();
            aVar.f10295a = g;
            aVar.f10298d = (RequestError) this.f17972a.mo15970a(m.mo16149b("data"), RequestError.class);
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments.length <= 1) {
                    aVar.f10297c = (Extra) this.f17972a.mo15970a(m.mo16149b("extra"), Extra.class);
                } else {
                    aVar.f10297c = (Extra) this.f17972a.mo15971a(m.mo16149b("extra"), actualTypeArguments[1]);
                }
            } else {
                aVar.f10297c = (Extra) this.f17972a.mo15970a(m.mo16149b("extra"), Extra.class);
            }
            return aVar;
        }
    }

    static class BaseResponseDeserializer extends AbsJsonDeserializer<C3477b> {
        BaseResponseDeserializer(C6600e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C3477b mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
            C3477b bVar = (C3477b) this.f17972a.mo15971a(kVar, type);
            if (bVar.statusCode != 0) {
                bVar.error = (RequestError) this.f17972a.mo15970a(kVar.mo16136m().mo16149b("data"), RequestError.class);
            }
            return bVar;
        }
    }

    static class ListResponseDeserializer extends AbsJsonDeserializer<C3478c> {
        public ListResponseDeserializer(C6600e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C3478c mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
            C6711m m = kVar.mo16136m();
            int g = m.mo16149b("status_code").mo16003g();
            if (g == 0) {
                return (C3478c) this.f17972a.mo15971a(kVar, type);
            }
            C3478c cVar = new C3478c();
            cVar.f10295a = g;
            cVar.f10297c = (Extra) this.f17972a.mo15970a(m.mo16149b("extra"), Extra.class);
            cVar.f10298d = (RequestError) this.f17972a.mo15970a(m.mo16149b("data"), RequestError.class);
            return cVar;
        }
    }

    static class ResponseDeserializer extends AbsJsonDeserializer<C3479d> {
        ResponseDeserializer(C6600e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C3479d mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
            C3479d dVar = (C3479d) this.f17972a.mo15971a(kVar, type);
            if (dVar.statusCode != 0) {
                dVar.error = (RequestError) this.f17972a.mo15970a(kVar.mo16136m().mo16149b("data"), RequestError.class);
            }
            return dVar;
        }
    }

    static class RoomDeserializer implements C6708j<Room> {

        /* renamed from: a */
        private C6600e f17973a;

        private RoomDeserializer() {
            this.f17973a = C2317a.m9932a();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Room mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
            Room room = (Room) this.f17973a.mo15971a(kVar, type);
            room.init();
            return room;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.network.GsonProvider$a */
    static class C6079a extends C6715r<Boolean> {
        private C6079a() {
        }

        public final /* synthetic */ Object read(C6718a aVar) throws IOException {
            return m18964a(aVar);
        }

        /* renamed from: a */
        private static Boolean m18964a(C6718a aVar) throws IOException {
            boolean z;
            JsonToken f = aVar.mo16088f();
            switch (f) {
                case BOOLEAN:
                    return Boolean.valueOf(aVar.mo16091i());
                case NULL:
                    aVar.mo16092j();
                    return null;
                case NUMBER:
                    if (aVar.mo16095m() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                default:
                    StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
                    sb.append(f);
                    throw new JsonParseException(sb.toString());
            }
        }

        public final /* synthetic */ void write(C6720b bVar, Object obj) throws IOException {
            m18965a(bVar, (Boolean) obj);
        }

        /* renamed from: a */
        private static void m18965a(C6720b bVar, Boolean bool) throws IOException {
            if (bool == null) {
                bVar.mo16115f();
            } else {
                bVar.mo16105a(bool);
            }
        }
    }

    /* renamed from: a */
    private static Map<Type, Object> m18952a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Room.class, new RoomDeserializer());
        hashMap.put(FeedItem.class, new FeedItemDeserializer());
        hashMap.put(Boolean.class, new C6079a());
        hashMap.put(Boolean.TYPE, new C6079a());
        return hashMap;
    }

    /* renamed from: a */
    public final C6119a<C6600e> mo14736a(C6119a<C6600e> aVar) {
        C6607f a = new C6607f().mo15984a(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        Map a2 = m18952a();
        for (Type type : a2.keySet()) {
            a.mo15986a(type, a2.get(type));
        }
        C6607f a3 = new C6607f().mo15984a(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        for (Type type2 : a2.keySet()) {
            a3.mo15986a(type2, a2.get(type2));
        }
        C6600e f = a3.mo15992f();
        a.mo15986a(C3477b.class, new BaseResponseDeserializer(f));
        a.mo15986a(C3479d.class, new ResponseDeserializer(f));
        a.mo15986a(C3474a.class, new BaseListResponseDeserializer(f));
        a.mo15986a(C3478c.class, new ListResponseDeserializer(f));
        return aVar.mo14779a(a.mo15992f()).mo14778a();
    }
}
