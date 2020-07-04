package com.twitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;

public final class Extractor {

    /* renamed from: a */
    public boolean f120075a = true;

    public static class Entity {

        /* renamed from: a */
        protected int f120076a;

        /* renamed from: b */
        protected int f120077b;

        /* renamed from: c */
        public final String f120078c;

        /* renamed from: d */
        public final String f120079d;

        /* renamed from: e */
        public final Type f120080e;

        public enum Type {
            URL,
            HASHTAG,
            MENTION,
            CASHTAG
        }

        public final int hashCode() {
            return this.f120080e.hashCode() + this.f120078c.hashCode() + this.f120076a + this.f120077b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f120078c);
            sb.append("(");
            sb.append(this.f120080e);
            sb.append(") [");
            sb.append(this.f120076a);
            sb.append(",");
            sb.append(this.f120077b);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entity)) {
                return false;
            }
            Entity entity = (Entity) obj;
            if (!this.f120080e.equals(entity.f120080e) || this.f120076a != entity.f120076a || this.f120077b != entity.f120077b || !this.f120078c.equals(entity.f120078c)) {
                return false;
            }
            return true;
        }

        public Entity(int i, int i2, String str, Type type) {
            this(i, i2, str, null, type);
        }

        private Entity(int i, int i2, String str, String str2, Type type) {
            this.f120076a = i;
            this.f120077b = i2;
            this.f120078c = str;
            this.f120079d = null;
            this.f120080e = type;
        }
    }

    /* renamed from: a */
    public final List<Entity> mo117888a(String str) {
        int i;
        if (!(str == null || str.length() == 0)) {
            if (this.f120075a) {
                i = 46;
            } else {
                i = 58;
            }
            if (str.indexOf(i) != -1) {
                ArrayList arrayList = new ArrayList();
                Matcher matcher = C46815a.f120088h.matcher(str);
                while (matcher.find()) {
                    if (matcher.group(4) != null || (this.f120075a && !C46815a.f120090j.matcher(matcher.group(2)).matches())) {
                        String group = matcher.group(3);
                        int start = matcher.start(3);
                        int end = matcher.end(3);
                        Matcher matcher2 = C46815a.f120089i.matcher(group);
                        if (matcher2.find()) {
                            group = matcher2.group();
                            end = group.length() + start;
                        }
                        arrayList.add(new Entity(start, end, group, Type.URL));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }
}
