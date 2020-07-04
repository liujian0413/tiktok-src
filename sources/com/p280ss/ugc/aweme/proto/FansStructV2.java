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

/* renamed from: com.ss.ugc.aweme.proto.FansStructV2 */
public final class FansStructV2 extends Message<FansStructV2, Builder> {
    public static final ProtoAdapter<FansStructV2> ADAPTER = new ProtoAdapter_FansStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer fans_level;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String fans_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean is_fan;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean light_up;

    /* renamed from: com.ss.ugc.aweme.proto.FansStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<FansStructV2, Builder> {
        public Integer fans_level;
        public String fans_name;
        public Boolean is_fan;
        public Boolean light_up;

        public final FansStructV2 build() {
            FansStructV2 fansStructV2 = new FansStructV2(this.fans_name, this.fans_level, this.is_fan, this.light_up, super.buildUnknownFields());
            return fansStructV2;
        }

        public final Builder fans_level(Integer num) {
            this.fans_level = num;
            return this;
        }

        public final Builder fans_name(String str) {
            this.fans_name = str;
            return this;
        }

        public final Builder is_fan(Boolean bool) {
            this.is_fan = bool;
            return this;
        }

        public final Builder light_up(Boolean bool) {
            this.light_up = bool;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.FansStructV2$ProtoAdapter_FansStructV2 */
    static final class ProtoAdapter_FansStructV2 extends ProtoAdapter<FansStructV2> {
        public ProtoAdapter_FansStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, FansStructV2.class);
        }

        public final int encodedSize(FansStructV2 fansStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, fansStructV2.fans_name) + ProtoAdapter.INT32.encodedSizeWithTag(2, fansStructV2.fans_level) + ProtoAdapter.BOOL.encodedSizeWithTag(3, fansStructV2.is_fan) + ProtoAdapter.BOOL.encodedSizeWithTag(4, fansStructV2.light_up) + fansStructV2.unknownFields().size();
        }

        public final FansStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.fans_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.fans_level((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.is_fan((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.light_up((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, FansStructV2 fansStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fansStructV2.fans_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, fansStructV2.fans_level);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, fansStructV2.is_fan);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, fansStructV2.light_up);
            protoWriter.writeBytes(fansStructV2.unknownFields());
        }
    }

    public FansStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.fans_name = this.fans_name;
        builder.fans_level = this.fans_level;
        builder.is_fan = this.is_fan;
        builder.light_up = this.light_up;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.fans_name != null) {
            i = this.fans_name.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.fans_level != null) {
            i2 = this.fans_level.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.is_fan != null) {
            i3 = this.is_fan.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.light_up != null) {
            i5 = this.light_up.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.fans_name != null) {
            sb.append(", fans_name=");
            sb.append(this.fans_name);
        }
        if (this.fans_level != null) {
            sb.append(", fans_level=");
            sb.append(this.fans_level);
        }
        if (this.is_fan != null) {
            sb.append(", is_fan=");
            sb.append(this.is_fan);
        }
        if (this.light_up != null) {
            sb.append(", light_up=");
            sb.append(this.light_up);
        }
        StringBuilder replace = sb.replace(0, 2, "FansStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FansStructV2)) {
            return false;
        }
        FansStructV2 fansStructV2 = (FansStructV2) obj;
        if (!unknownFields().equals(fansStructV2.unknownFields()) || !Internal.equals(this.fans_name, fansStructV2.fans_name) || !Internal.equals(this.fans_level, fansStructV2.fans_level) || !Internal.equals(this.is_fan, fansStructV2.is_fan) || !Internal.equals(this.light_up, fansStructV2.light_up)) {
            return false;
        }
        return true;
    }

    public FansStructV2(String str, Integer num, Boolean bool, Boolean bool2) {
        this(str, num, bool, bool2, ByteString.EMPTY);
    }

    public FansStructV2(String str, Integer num, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.fans_name = str;
        this.fans_level = num;
        this.is_fan = bool;
        this.light_up = bool2;
    }
}
