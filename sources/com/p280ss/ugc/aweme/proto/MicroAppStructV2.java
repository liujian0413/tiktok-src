package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.MicroAppStructV2 */
public final class MicroAppStructV2 extends Message<MicroAppStructV2, Builder> {
    public static final ProtoAdapter<MicroAppStructV2> ADAPTER = new ProtoAdapter_MicroAppStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String app_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String app_name;
    @WireField(adapter = "com.ss.ugc.aweme.proto.MicroAppCardStructV2#ADAPTER", tag = 11)
    public MicroAppCardStructV2 card;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public String description;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer orientation;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer state;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String summary;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 8)
    public Integer type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public String web_url;

    /* renamed from: com.ss.ugc.aweme.proto.MicroAppStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MicroAppStructV2, Builder> {
        public String app_id;
        public String app_name;
        public MicroAppCardStructV2 card;
        public String description;
        public String icon;
        public Integer orientation;
        public String schema;
        public Integer state;
        public String summary;
        public String title;
        public Integer type;
        public String web_url;

        public final MicroAppStructV2 build() {
            MicroAppStructV2 microAppStructV2 = new MicroAppStructV2(this.app_id, this.app_name, this.icon, this.orientation, this.schema, this.state, this.summary, this.type, this.description, this.title, this.card, this.web_url, super.buildUnknownFields());
            return microAppStructV2;
        }

        public final Builder app_id(String str) {
            this.app_id = str;
            return this;
        }

        public final Builder app_name(String str) {
            this.app_name = str;
            return this;
        }

        public final Builder card(MicroAppCardStructV2 microAppCardStructV2) {
            this.card = microAppCardStructV2;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder icon(String str) {
            this.icon = str;
            return this;
        }

        public final Builder orientation(Integer num) {
            this.orientation = num;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder state(Integer num) {
            this.state = num;
            return this;
        }

        public final Builder summary(String str) {
            this.summary = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.MicroAppStructV2$ProtoAdapter_MicroAppStructV2 */
    static final class ProtoAdapter_MicroAppStructV2 extends ProtoAdapter<MicroAppStructV2> {
        public ProtoAdapter_MicroAppStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MicroAppStructV2.class);
        }

        public final MicroAppStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.app_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.app_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.icon((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.orientation((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.state((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.summary((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 9:
                            builder.description((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.card((MicroAppCardStructV2) MicroAppCardStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.web_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(MicroAppStructV2 microAppStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, microAppStructV2.app_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, microAppStructV2.app_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, microAppStructV2.icon) + ProtoAdapter.INT32.encodedSizeWithTag(4, microAppStructV2.orientation) + ProtoAdapter.STRING.encodedSizeWithTag(5, microAppStructV2.schema) + ProtoAdapter.INT32.encodedSizeWithTag(6, microAppStructV2.state) + ProtoAdapter.STRING.encodedSizeWithTag(7, microAppStructV2.summary) + ProtoAdapter.INT32.encodedSizeWithTag(8, microAppStructV2.type) + ProtoAdapter.STRING.encodedSizeWithTag(9, microAppStructV2.description) + ProtoAdapter.STRING.encodedSizeWithTag(10, microAppStructV2.title) + MicroAppCardStructV2.ADAPTER.encodedSizeWithTag(11, microAppStructV2.card) + ProtoAdapter.STRING.encodedSizeWithTag(12, microAppStructV2.web_url) + microAppStructV2.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, MicroAppStructV2 microAppStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, microAppStructV2.app_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, microAppStructV2.app_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, microAppStructV2.icon);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, microAppStructV2.orientation);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, microAppStructV2.schema);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, microAppStructV2.state);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, microAppStructV2.summary);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, microAppStructV2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, microAppStructV2.description);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, microAppStructV2.title);
            MicroAppCardStructV2.ADAPTER.encodeWithTag(protoWriter, 11, microAppStructV2.card);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, microAppStructV2.web_url);
            protoWriter.writeBytes(microAppStructV2.unknownFields());
        }
    }

    public MicroAppStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.app_id = this.app_id;
        builder.app_name = this.app_name;
        builder.icon = this.icon;
        builder.orientation = this.orientation;
        builder.schema = this.schema;
        builder.state = this.state;
        builder.summary = this.summary;
        builder.type = this.type;
        builder.description = this.description;
        builder.title = this.title;
        builder.card = this.card;
        builder.web_url = this.web_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.hashCode;
        if (i12 != 0) {
            return i12;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i13 = 0;
        if (this.app_id != null) {
            i = this.app_id.hashCode();
        } else {
            i = 0;
        }
        int i14 = (hashCode + i) * 37;
        if (this.app_name != null) {
            i2 = this.app_name.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 37;
        if (this.icon != null) {
            i3 = this.icon.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 37;
        if (this.orientation != null) {
            i4 = this.orientation.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 37;
        if (this.schema != null) {
            i5 = this.schema.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 37;
        if (this.state != null) {
            i6 = this.state.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 37;
        if (this.summary != null) {
            i7 = this.summary.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 37;
        if (this.type != null) {
            i8 = this.type.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 37;
        if (this.description != null) {
            i9 = this.description.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 37;
        if (this.title != null) {
            i10 = this.title.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 37;
        if (this.card != null) {
            i11 = this.card.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 37;
        if (this.web_url != null) {
            i13 = this.web_url.hashCode();
        }
        int i25 = i24 + i13;
        this.hashCode = i25;
        return i25;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.app_name != null) {
            sb.append(", app_name=");
            sb.append(this.app_name);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.orientation != null) {
            sb.append(", orientation=");
            sb.append(this.orientation);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (this.summary != null) {
            sb.append(", summary=");
            sb.append(this.summary);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.card != null) {
            sb.append(", card=");
            sb.append(this.card);
        }
        if (this.web_url != null) {
            sb.append(", web_url=");
            sb.append(this.web_url);
        }
        StringBuilder replace = sb.replace(0, 2, "MicroAppStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MicroAppStructV2)) {
            return false;
        }
        MicroAppStructV2 microAppStructV2 = (MicroAppStructV2) obj;
        if (!unknownFields().equals(microAppStructV2.unknownFields()) || !Internal.equals(this.app_id, microAppStructV2.app_id) || !Internal.equals(this.app_name, microAppStructV2.app_name) || !Internal.equals(this.icon, microAppStructV2.icon) || !Internal.equals(this.orientation, microAppStructV2.orientation) || !Internal.equals(this.schema, microAppStructV2.schema) || !Internal.equals(this.state, microAppStructV2.state) || !Internal.equals(this.summary, microAppStructV2.summary) || !Internal.equals(this.type, microAppStructV2.type) || !Internal.equals(this.description, microAppStructV2.description) || !Internal.equals(this.title, microAppStructV2.title) || !Internal.equals(this.card, microAppStructV2.card) || !Internal.equals(this.web_url, microAppStructV2.web_url)) {
            return false;
        }
        return true;
    }

    public MicroAppStructV2(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, String str6, String str7, MicroAppCardStructV2 microAppCardStructV2, String str8) {
        this(str, str2, str3, num, str4, num2, str5, num3, str6, str7, microAppCardStructV2, str8, ByteString.EMPTY);
    }

    public MicroAppStructV2(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, String str6, String str7, MicroAppCardStructV2 microAppCardStructV2, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.app_name = str2;
        this.icon = str3;
        this.orientation = num;
        this.schema = str4;
        this.state = num2;
        this.summary = str5;
        this.type = num3;
        this.description = str6;
        this.title = str7;
        this.card = microAppCardStructV2;
        this.web_url = str8;
    }
}
