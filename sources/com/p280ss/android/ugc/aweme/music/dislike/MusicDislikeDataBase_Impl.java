package com.p280ss.android.ugc.aweme.music.dislike;

import android.arch.persistence.p009a.C0134b;
import android.arch.persistence.p009a.C0135c;
import android.arch.persistence.p009a.C0135c.C0136a;
import android.arch.persistence.p009a.C0135c.C0137b;
import android.arch.persistence.room.C0146a;
import android.arch.persistence.room.C0156d;
import android.arch.persistence.room.C0162g;
import android.arch.persistence.room.C0162g.C0163a;
import android.arch.persistence.room.RoomDatabase.C0144b;
import android.arch.persistence.room.p012b.C0150b;
import android.arch.persistence.room.p012b.C0150b.C0151a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.ugc.aweme.music.dislike.MusicDislikeDataBase_Impl */
public class MusicDislikeDataBase_Impl extends MusicDislikeDataBase {
    /* renamed from: a */
    public final C0156d mo305a() {
        return new C0156d(this, "musicDislikeEntity");
    }

    /* renamed from: b */
    public final C0135c mo310b(C0146a aVar) {
        return aVar.f305a.mo287a(C0137b.m371a(aVar.f306b).mo302a(aVar.f307c).mo301a((C0136a) new C0162g(aVar, new C0163a(1) {
            /* renamed from: a */
            public final void mo357a(C0134b bVar) {
                bVar.mo270c("DROP TABLE IF EXISTS `musicDislikeEntity`");
            }

            /* renamed from: b */
            public final void mo358b(C0134b bVar) {
                bVar.mo270c("CREATE TABLE IF NOT EXISTS `musicDislikeEntity` (`title` TEXT NOT NULL, `iconUrl` TEXT NOT NULL, `author` TEXT NOT NULL, `musicId` TEXT NOT NULL, PRIMARY KEY(`musicId`))");
                bVar.mo270c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo270c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"b3035381388715afb9ed2687d4e033b7\")");
            }

            /* renamed from: d */
            public final void mo360d(C0134b bVar) {
                if (MusicDislikeDataBase_Impl.this.f290e != null) {
                    int size = MusicDislikeDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        MusicDislikeDataBase_Impl.this.f290e.get(i);
                    }
                }
            }

            /* renamed from: c */
            public final void mo359c(C0134b bVar) {
                MusicDislikeDataBase_Impl.this.f286a = bVar;
                MusicDislikeDataBase_Impl.this.mo308a(bVar);
                if (MusicDislikeDataBase_Impl.this.f290e != null) {
                    int size = MusicDislikeDataBase_Impl.this.f290e.size();
                    for (int i = 0; i < size; i++) {
                        ((C0144b) MusicDislikeDataBase_Impl.this.f290e.get(i)).mo323a(bVar);
                    }
                }
            }

            /* renamed from: e */
            public final void mo361e(C0134b bVar) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("title", new C0151a("title", "TEXT", true, 0));
                hashMap.put("iconUrl", new C0151a("iconUrl", "TEXT", true, 0));
                hashMap.put("author", new C0151a("author", "TEXT", true, 0));
                hashMap.put("musicId", new C0151a("musicId", "TEXT", true, 1));
                C0150b bVar2 = new C0150b("musicDislikeEntity", hashMap, new HashSet(0), new HashSet(0));
                C0150b a = C0150b.m417a(bVar, "musicDislikeEntity");
                if (!bVar2.equals(a)) {
                    StringBuilder sb = new StringBuilder("Migration didn't properly handle musicDislikeEntity(com.ss.android.ugc.aweme.music.dislike.MusicDislikeEntity).\n Expected:\n");
                    sb.append(bVar2);
                    sb.append("\n Found:\n");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }, "b3035381388715afb9ed2687d4e033b7", "b1ca9817a0a4539270563ec2afdf5dab")).mo303a());
    }
}
