package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AssociativeEmoticonAll */
public final class AssociativeEmoticonAll extends Message<AssociativeEmoticonAll, Builder> {
    public static final DefaultValueProtoAdapter<AssociativeEmoticonAll> ADAPTER = new ProtoAdapter_AssociativeEmoticonAll();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer show;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 2)
    public final String sourceMessage;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AssociativeEmoticonAll$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AssociativeEmoticonAll, Builder> {
        public Integer show;
        public String sourceMessage;

        public final AssociativeEmoticonAll build() {
            if (this.show != null && this.sourceMessage != null) {
                return new AssociativeEmoticonAll(this.show, this.sourceMessage, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.show, "show", this.sourceMessage, "sourceMessage");
        }

        public final Builder show(Integer num) {
            this.show = num;
            return this;
        }

        public final Builder sourceMessage(String str) {
            this.sourceMessage = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AssociativeEmoticonAll$ProtoAdapter_AssociativeEmoticonAll */
    static final class ProtoAdapter_AssociativeEmoticonAll extends DefaultValueProtoAdapter<AssociativeEmoticonAll> {
        public final AssociativeEmoticonAll redact(AssociativeEmoticonAll associativeEmoticonAll) {
            return associativeEmoticonAll;
        }

        public ProtoAdapter_AssociativeEmoticonAll() {
            super(FieldEncoding.LENGTH_DELIMITED, AssociativeEmoticonAll.class);
        }

        public final AssociativeEmoticonAll decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (AssociativeEmoticonAll) null);
        }

        public final int encodedSize(AssociativeEmoticonAll associativeEmoticonAll) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, associativeEmoticonAll.show) + ProtoAdapter.STRING.encodedSizeWithTag(2, associativeEmoticonAll.sourceMessage) + associativeEmoticonAll.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, AssociativeEmoticonAll associativeEmoticonAll) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, associativeEmoticonAll.show);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, associativeEmoticonAll.sourceMessage);
            protoWriter.writeBytes(associativeEmoticonAll.unknownFields());
        }

        public final AssociativeEmoticonAll decode(ProtoReader protoReader, AssociativeEmoticonAll associativeEmoticonAll) throws IOException {
            Builder builder;
            AssociativeEmoticonAll associativeEmoticonAll2 = (AssociativeEmoticonAll) C10938a.m32097a().mo26425a(AssociativeEmoticonAll.class, associativeEmoticonAll);
            if (associativeEmoticonAll2 != null) {
                builder = associativeEmoticonAll2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.sourceMessage((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (associativeEmoticonAll2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Integer getShow() {
        return this.show;
    }

    public final String getSourceMessage() {
        return this.sourceMessage;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show = this.show;
        builder.sourceMessage = this.sourceMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((unknownFields().hashCode() * 37) + this.show.hashCode()) * 37) + this.sourceMessage.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", show=");
        sb.append(this.show);
        sb.append(", sourceMessage=");
        sb.append(this.sourceMessage);
        StringBuilder replace = sb.replace(0, 2, "AssociativeEmoticonAll{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AssociativeEmoticonAll)) {
            return false;
        }
        AssociativeEmoticonAll associativeEmoticonAll = (AssociativeEmoticonAll) obj;
        if (!unknownFields().equals(associativeEmoticonAll.unknownFields()) || !this.show.equals(associativeEmoticonAll.show) || !this.sourceMessage.equals(associativeEmoticonAll.sourceMessage)) {
            return false;
        }
        return true;
    }

    public AssociativeEmoticonAll(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public AssociativeEmoticonAll(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show = num;
        this.sourceMessage = str;
    }
}
