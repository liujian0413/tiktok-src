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

/* renamed from: com.ss.ugc.aweme.proto.QuickShopSecondFloorV2 */
public final class QuickShopSecondFloorV2 extends Message<QuickShopSecondFloorV2, Builder> {
    public static final ProtoAdapter<QuickShopSecondFloorV2> ADAPTER = new ProtoAdapter_QuickShopSecondFloorV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String enter_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String process_text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String trans_bg_text;

    /* renamed from: com.ss.ugc.aweme.proto.QuickShopSecondFloorV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<QuickShopSecondFloorV2, Builder> {
        public String enter_text;
        public String process_text;
        public String trans_bg_text;

        public final QuickShopSecondFloorV2 build() {
            return new QuickShopSecondFloorV2(this.process_text, this.enter_text, this.trans_bg_text, super.buildUnknownFields());
        }

        public final Builder enter_text(String str) {
            this.enter_text = str;
            return this;
        }

        public final Builder process_text(String str) {
            this.process_text = str;
            return this;
        }

        public final Builder trans_bg_text(String str) {
            this.trans_bg_text = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.QuickShopSecondFloorV2$ProtoAdapter_QuickShopSecondFloorV2 */
    static final class ProtoAdapter_QuickShopSecondFloorV2 extends ProtoAdapter<QuickShopSecondFloorV2> {
        public ProtoAdapter_QuickShopSecondFloorV2() {
            super(FieldEncoding.LENGTH_DELIMITED, QuickShopSecondFloorV2.class);
        }

        public final int encodedSize(QuickShopSecondFloorV2 quickShopSecondFloorV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, quickShopSecondFloorV2.process_text) + ProtoAdapter.STRING.encodedSizeWithTag(2, quickShopSecondFloorV2.enter_text) + ProtoAdapter.STRING.encodedSizeWithTag(3, quickShopSecondFloorV2.trans_bg_text) + quickShopSecondFloorV2.unknownFields().size();
        }

        public final QuickShopSecondFloorV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.process_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.enter_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.trans_bg_text((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, QuickShopSecondFloorV2 quickShopSecondFloorV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, quickShopSecondFloorV2.process_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, quickShopSecondFloorV2.enter_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, quickShopSecondFloorV2.trans_bg_text);
            protoWriter.writeBytes(quickShopSecondFloorV2.unknownFields());
        }
    }

    public QuickShopSecondFloorV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.process_text = this.process_text;
        builder.enter_text = this.enter_text;
        builder.trans_bg_text = this.trans_bg_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.process_text != null) {
            i = this.process_text.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.enter_text != null) {
            i2 = this.enter_text.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.trans_bg_text != null) {
            i4 = this.trans_bg_text.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.process_text != null) {
            sb.append(", process_text=");
            sb.append(this.process_text);
        }
        if (this.enter_text != null) {
            sb.append(", enter_text=");
            sb.append(this.enter_text);
        }
        if (this.trans_bg_text != null) {
            sb.append(", trans_bg_text=");
            sb.append(this.trans_bg_text);
        }
        StringBuilder replace = sb.replace(0, 2, "QuickShopSecondFloorV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickShopSecondFloorV2)) {
            return false;
        }
        QuickShopSecondFloorV2 quickShopSecondFloorV2 = (QuickShopSecondFloorV2) obj;
        if (!unknownFields().equals(quickShopSecondFloorV2.unknownFields()) || !Internal.equals(this.process_text, quickShopSecondFloorV2.process_text) || !Internal.equals(this.enter_text, quickShopSecondFloorV2.enter_text) || !Internal.equals(this.trans_bg_text, quickShopSecondFloorV2.trans_bg_text)) {
            return false;
        }
        return true;
    }

    public QuickShopSecondFloorV2(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public QuickShopSecondFloorV2(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.process_text = str;
        this.enter_text = str2;
        this.trans_bg_text = str3;
    }
}
