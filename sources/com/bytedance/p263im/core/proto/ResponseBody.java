package com.bytedance.p263im.core.proto;

import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ResponseBody */
public final class ResponseBody extends Message<ResponseBody, Builder> {
    public static final ProtoAdapter<ResponseBody> ADAPTER = new ProtoAdapter_ResponseBody();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody#ADAPTER", tag = 613)
    public final BatchMarkConversationReadResponseBody batch_mark_read_body;
    @WireField(adapter = "com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody#ADAPTER", tag = 210)
    public final CheckMessagesPerUserResponseBody check_messages_per_user_body;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody#ADAPTER", tag = 650)
    public final ConversationAddParticipantsResponseBody conversation_add_participants_body;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationInfoUpdatedNotify#ADAPTER", tag = 502)
    public final ConversationInfoUpdatedNotify conversation_info_updated_notify;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationParticipantsListResponseBody#ADAPTER", tag = 605)
    public final ConversationParticipantsListResponseBody conversation_participants_body;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody#ADAPTER", tag = 651)
    public final ConversationRemoveParticipantsResponseBody conversation_remove_participants_body;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationSetRoleResponseBody#ADAPTER", tag = 653)
    public final ConversationSetRoleResponseBody conversation_set_role_body;
    @WireField(adapter = "com.bytedance.im.core.proto.ConversationsListResponseBody#ADAPTER", tag = 300)
    public final ConversationsListResponseBody conversations_list_body;
    @WireField(adapter = "com.bytedance.im.core.proto.CreateConversationResponseBody#ADAPTER", tag = 602)
    public final CreateConversationResponseBody create_conversation_body;
    @WireField(adapter = "com.bytedance.im.core.proto.CreateConversationV2ResponseBody#ADAPTER", tag = 609)
    public final CreateConversationV2ResponseBody create_conversation_v2_body;
    @WireField(adapter = "com.bytedance.im.core.proto.DeleteConversationCoreExtInfoResponseBody#ADAPTER", tag = 905)
    public final DeleteConversationCoreExtInfoResponseBody delete_conversation_core_ext_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.DeleteConversationSettingExtInfoResponseBody#ADAPTER", tag = 923)
    public final DeleteConversationSettingExtInfoResponseBody delete_conversation_setting_ext_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.DeleteStrangerAllConversationResponseBody#ADAPTER", tag = 1004)
    public final DeleteStrangerAllConversationResponseBody delete_stranger_all_conversation_body;
    @WireField(adapter = "com.bytedance.im.core.proto.DeleteStrangerConversationResponseBody#ADAPTER", tag = 1003)
    public final DeleteStrangerConversationResponseBody delete_stranger_conversation_body;
    @WireField(adapter = "com.bytedance.im.core.proto.DeleteStrangerMessageResponseBody#ADAPTER", tag = 1002)
    public final DeleteStrangerMessageResponseBody delete_stranger_message_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationCoreInfoResponseBody#ADAPTER", tag = 901)
    public final GetConversationCoreInfoResponseBody get_conversation_core_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationCoreInfoListResponseBody#ADAPTER", tag = 903)
    public final GetConversationCoreInfoListResponseBody get_conversation_core_info_list_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationInfoResponseBody#ADAPTER", tag = 600)
    public final GetConversationInfoResponseBody get_conversation_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationInfoListByFavoriteV2ResponseBody#ADAPTER", tag = 611)
    public final GetConversationInfoListByFavoriteV2ResponseBody get_conversation_info_list_by_favorite_v2_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody#ADAPTER", tag = 612)
    public final GetConversationInfoListByTopV2ResponseBody get_conversation_info_list_by_top_v2_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody#ADAPTER", tag = 610)
    public final GetConversationInfoListV2ResponseBody get_conversation_info_list_v2_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody#ADAPTER", tag = 608)
    public final GetConversationInfoV2ResponseBody get_conversation_info_v2_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetUserConversationListResponseBody#ADAPTER", tag = 2006)
    public final GetUserConversationListResponseBody get_conversation_list_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationSettingInfoResponseBody#ADAPTER", tag = 920)
    public final GetConversationSettingInfoResponseBody get_conversation_setting_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationInfoListResponseBody#ADAPTER", tag = 607)
    public final GetConversationInfoListResponseBody get_conversations_info_list_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetGroupInfoResponseBody#ADAPTER", tag = 801)
    public final GetGroupInfoResponseBody get_group_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetGroupInfoListResponseBody#ADAPTER", tag = 803)
    public final GetGroupInfoListResponseBody get_groups_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetStrangerConversationListResponseBody#ADAPTER", tag = 1000)
    public final GetStrangerConversationListResponseBody get_stranger_conversation_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetStrangerMessagesResponseBody#ADAPTER", tag = 1001)
    public final GetStrangerMessagesResponseBody get_stranger_messages_body;
    @WireField(adapter = "com.bytedance.im.core.proto.NewMessageNotify#ADAPTER", tag = 500)
    public final NewMessageNotify has_new_message_notify;
    @WireField(adapter = "com.bytedance.im.core.proto.MarkConversationReadNotify#ADAPTER", tag = 501)
    public final MarkConversationReadNotify mark_conversation_read_notify;
    @WireField(adapter = "com.bytedance.im.core.proto.MarkStrangerAllConversationReadResponseBody#ADAPTER", tag = 1006)
    public final MarkStrangerAllConversationReadResponseBody mark_stranger_all_conversation_read_body;
    @WireField(adapter = "com.bytedance.im.core.proto.MarkStrangerConversationReadResponseBody#ADAPTER", tag = 1005)
    public final MarkStrangerConversationReadResponseBody mark_stranger_conversation_read_body;
    @WireField(adapter = "com.bytedance.im.core.proto.MessagesInConversationResponseBody#ADAPTER", tag = 301)
    public final MessagesInConversationResponseBody messages_in_conversation_body;
    @WireField(adapter = "com.bytedance.im.core.proto.MessagesPerUserResponseBody#ADAPTER", tag = 200)
    public final MessagesPerUserResponseBody messages_per_user_body;
    @WireField(adapter = "com.bytedance.im.core.proto.MessagesPerUserInitResponseBody#ADAPTER", tag = 201)
    public final MessagesPerUserInitResponseBody messages_per_user_init_body;
    @WireField(adapter = "com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody#ADAPTER", tag = 203)
    public final MessagesPerUserInitV2ResponseBody messages_per_user_init_v2_body;
    @WireField(adapter = "com.bytedance.im.core.proto.MgetConversationParticipantsResponseBody#ADAPTER", tag = 654)
    public final MgetConversationParticipantsResponseBody mget_conversation_participants_body;
    @WireField(adapter = "com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody#ADAPTER", tag = 705)
    public final ModifyMessagePropertyResponseBody modify_message_property_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody#ADAPTER", tag = 2001)
    public final GetConversationParticipantsMinIndexV3ResponseBody participants_min_index_body;
    @WireField(adapter = "com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody#ADAPTER", tag = 2000)
    public final GetConversationParticipantsReadIndexV3ResponseBody participants_read_index_body;
    @WireField(adapter = "com.bytedance.im.core.proto.ReactionMessageResponseBody#ADAPTER", tag = 703)
    public final ReactionMessageResponseBody reaction_message_body;
    @WireField(adapter = "com.bytedance.im.core.proto.SendMessageResponseBody#ADAPTER", tag = 100)
    public final SendMessageResponseBody send_message_body;
    @WireField(adapter = "com.bytedance.im.core.proto.SendUserActionResponseBody#ADAPTER", tag = 410)
    public final SendUserActionResponseBody send_user_action_body;
    @WireField(adapter = "com.bytedance.im.core.proto.SetConversationCoreInfoResponseBody#ADAPTER", tag = 902)
    public final SetConversationCoreInfoResponseBody set_conversation_core_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.SetConversationInfoResponseBody#ADAPTER", tag = 601)
    public final SetConversationInfoResponseBody set_conversation_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody#ADAPTER", tag = 921)
    public final SetConversationSettingInfoResponseBody set_conversation_setting_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.SetGroupInfoResponseBody#ADAPTER", tag = 802)
    public final SetGroupInfoResponseBody set_group_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.StrangerNewMessageNotify#ADAPTER", tag = 503)
    public final StrangerNewMessageNotify stranger_has_new_message_notify;
    @WireField(adapter = "com.bytedance.im.core.proto.SyncMessageResponseBody#ADAPTER", tag = 704)
    public final SyncMessageResponseBody sync_message_body;
    @WireField(adapter = "com.bytedance.im.core.proto.UpdateConversationParticipantResponseBody#ADAPTER", tag = 655)
    public final UpdateConversationParticipantResponseBody update_conversation_participant_body;
    @WireField(adapter = "com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody#ADAPTER", tag = 904)
    public final UpsertConversationCoreExtInfoResponseBody upsert_conversation_core_ext_info_body;
    @WireField(adapter = "com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody#ADAPTER", tag = 922)
    public final UpsertConversationSettingExtInfoResponseBody upsert_conversation_setting_ext_info_body;

    /* renamed from: com.bytedance.im.core.proto.ResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ResponseBody, Builder> {
        public BatchMarkConversationReadResponseBody batch_mark_read_body;
        public CheckMessagesPerUserResponseBody check_messages_per_user_body;
        public ConversationAddParticipantsResponseBody conversation_add_participants_body;
        public ConversationInfoUpdatedNotify conversation_info_updated_notify;
        public ConversationParticipantsListResponseBody conversation_participants_body;
        public ConversationRemoveParticipantsResponseBody conversation_remove_participants_body;
        public ConversationSetRoleResponseBody conversation_set_role_body;
        public ConversationsListResponseBody conversations_list_body;
        public CreateConversationResponseBody create_conversation_body;
        public CreateConversationV2ResponseBody create_conversation_v2_body;
        public DeleteConversationCoreExtInfoResponseBody delete_conversation_core_ext_info_body;
        public DeleteConversationSettingExtInfoResponseBody delete_conversation_setting_ext_info_body;
        public DeleteStrangerAllConversationResponseBody delete_stranger_all_conversation_body;
        public DeleteStrangerConversationResponseBody delete_stranger_conversation_body;
        public DeleteStrangerMessageResponseBody delete_stranger_message_body;
        public GetConversationCoreInfoResponseBody get_conversation_core_info_body;
        public GetConversationCoreInfoListResponseBody get_conversation_core_info_list_body;
        public GetConversationInfoResponseBody get_conversation_info_body;
        public GetConversationInfoListByFavoriteV2ResponseBody get_conversation_info_list_by_favorite_v2_body;
        public GetConversationInfoListByTopV2ResponseBody get_conversation_info_list_by_top_v2_body;
        public GetConversationInfoListV2ResponseBody get_conversation_info_list_v2_body;
        public GetConversationInfoV2ResponseBody get_conversation_info_v2_body;
        public GetUserConversationListResponseBody get_conversation_list_body;
        public GetConversationSettingInfoResponseBody get_conversation_setting_info_body;
        public GetConversationInfoListResponseBody get_conversations_info_list_body;
        public GetGroupInfoResponseBody get_group_info_body;
        public GetGroupInfoListResponseBody get_groups_info_body;
        public GetStrangerConversationListResponseBody get_stranger_conversation_body;
        public GetStrangerMessagesResponseBody get_stranger_messages_body;
        public NewMessageNotify has_new_message_notify;
        public MarkConversationReadNotify mark_conversation_read_notify;
        public MarkStrangerAllConversationReadResponseBody mark_stranger_all_conversation_read_body;
        public MarkStrangerConversationReadResponseBody mark_stranger_conversation_read_body;
        public MessagesInConversationResponseBody messages_in_conversation_body;
        public MessagesPerUserResponseBody messages_per_user_body;
        public MessagesPerUserInitResponseBody messages_per_user_init_body;
        public MessagesPerUserInitV2ResponseBody messages_per_user_init_v2_body;
        public MgetConversationParticipantsResponseBody mget_conversation_participants_body;
        public ModifyMessagePropertyResponseBody modify_message_property_body;
        public GetConversationParticipantsMinIndexV3ResponseBody participants_min_index_body;
        public GetConversationParticipantsReadIndexV3ResponseBody participants_read_index_body;
        public ReactionMessageResponseBody reaction_message_body;
        public SendMessageResponseBody send_message_body;
        public SendUserActionResponseBody send_user_action_body;
        public SetConversationCoreInfoResponseBody set_conversation_core_info_body;
        public SetConversationInfoResponseBody set_conversation_info_body;
        public SetConversationSettingInfoResponseBody set_conversation_setting_info_body;
        public SetGroupInfoResponseBody set_group_info_body;
        public StrangerNewMessageNotify stranger_has_new_message_notify;
        public SyncMessageResponseBody sync_message_body;
        public UpdateConversationParticipantResponseBody update_conversation_participant_body;
        public UpsertConversationCoreExtInfoResponseBody upsert_conversation_core_ext_info_body;
        public UpsertConversationSettingExtInfoResponseBody upsert_conversation_setting_ext_info_body;

        public final ResponseBody build() {
            ResponseBody responseBody = new ResponseBody(this.send_message_body, this.messages_per_user_body, this.messages_per_user_init_body, this.messages_per_user_init_v2_body, this.check_messages_per_user_body, this.conversations_list_body, this.messages_in_conversation_body, this.send_user_action_body, this.has_new_message_notify, this.mark_conversation_read_notify, this.conversation_info_updated_notify, this.stranger_has_new_message_notify, this.get_conversation_info_body, this.set_conversation_info_body, this.create_conversation_body, this.get_conversations_info_list_body, this.batch_mark_read_body, this.get_conversation_info_v2_body, this.create_conversation_v2_body, this.get_conversation_info_list_v2_body, this.get_conversation_info_list_by_favorite_v2_body, this.get_conversation_info_list_by_top_v2_body, this.conversation_participants_body, this.conversation_add_participants_body, this.conversation_remove_participants_body, this.conversation_set_role_body, this.mget_conversation_participants_body, this.update_conversation_participant_body, this.reaction_message_body, this.sync_message_body, this.modify_message_property_body, this.get_group_info_body, this.set_group_info_body, this.get_groups_info_body, this.get_conversation_core_info_body, this.set_conversation_core_info_body, this.get_conversation_core_info_list_body, this.upsert_conversation_core_ext_info_body, this.delete_conversation_core_ext_info_body, this.get_conversation_setting_info_body, this.set_conversation_setting_info_body, this.upsert_conversation_setting_ext_info_body, this.delete_conversation_setting_ext_info_body, this.get_stranger_conversation_body, this.get_stranger_messages_body, this.delete_stranger_message_body, this.delete_stranger_conversation_body, this.delete_stranger_all_conversation_body, this.mark_stranger_conversation_read_body, this.mark_stranger_all_conversation_read_body, this.participants_read_index_body, this.participants_min_index_body, this.get_conversation_list_body, super.buildUnknownFields());
            return responseBody;
        }

        public final Builder batch_mark_read_body(BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody) {
            this.batch_mark_read_body = batchMarkConversationReadResponseBody;
            return this;
        }

        public final Builder check_messages_per_user_body(CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
            this.check_messages_per_user_body = checkMessagesPerUserResponseBody;
            return this;
        }

        public final Builder conversation_add_participants_body(ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
            this.conversation_add_participants_body = conversationAddParticipantsResponseBody;
            return this;
        }

        public final Builder conversation_info_updated_notify(ConversationInfoUpdatedNotify conversationInfoUpdatedNotify) {
            this.conversation_info_updated_notify = conversationInfoUpdatedNotify;
            return this;
        }

        public final Builder conversation_participants_body(ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
            this.conversation_participants_body = conversationParticipantsListResponseBody;
            return this;
        }

        public final Builder conversation_remove_participants_body(ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody) {
            this.conversation_remove_participants_body = conversationRemoveParticipantsResponseBody;
            return this;
        }

        public final Builder conversation_set_role_body(ConversationSetRoleResponseBody conversationSetRoleResponseBody) {
            this.conversation_set_role_body = conversationSetRoleResponseBody;
            return this;
        }

        public final Builder conversations_list_body(ConversationsListResponseBody conversationsListResponseBody) {
            this.conversations_list_body = conversationsListResponseBody;
            return this;
        }

        public final Builder create_conversation_body(CreateConversationResponseBody createConversationResponseBody) {
            this.create_conversation_body = createConversationResponseBody;
            return this;
        }

        public final Builder create_conversation_v2_body(CreateConversationV2ResponseBody createConversationV2ResponseBody) {
            this.create_conversation_v2_body = createConversationV2ResponseBody;
            return this;
        }

        public final Builder delete_conversation_core_ext_info_body(DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody) {
            this.delete_conversation_core_ext_info_body = deleteConversationCoreExtInfoResponseBody;
            return this;
        }

        public final Builder delete_conversation_setting_ext_info_body(DeleteConversationSettingExtInfoResponseBody deleteConversationSettingExtInfoResponseBody) {
            this.delete_conversation_setting_ext_info_body = deleteConversationSettingExtInfoResponseBody;
            return this;
        }

        public final Builder delete_stranger_all_conversation_body(DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody) {
            this.delete_stranger_all_conversation_body = deleteStrangerAllConversationResponseBody;
            return this;
        }

        public final Builder delete_stranger_conversation_body(DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody) {
            this.delete_stranger_conversation_body = deleteStrangerConversationResponseBody;
            return this;
        }

        public final Builder delete_stranger_message_body(DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody) {
            this.delete_stranger_message_body = deleteStrangerMessageResponseBody;
            return this;
        }

        public final Builder get_conversation_core_info_body(GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody) {
            this.get_conversation_core_info_body = getConversationCoreInfoResponseBody;
            return this;
        }

        public final Builder get_conversation_core_info_list_body(GetConversationCoreInfoListResponseBody getConversationCoreInfoListResponseBody) {
            this.get_conversation_core_info_list_body = getConversationCoreInfoListResponseBody;
            return this;
        }

        public final Builder get_conversation_info_body(GetConversationInfoResponseBody getConversationInfoResponseBody) {
            this.get_conversation_info_body = getConversationInfoResponseBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_favorite_v2_body(GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody) {
            this.get_conversation_info_list_by_favorite_v2_body = getConversationInfoListByFavoriteV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_info_list_by_top_v2_body(GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
            this.get_conversation_info_list_by_top_v2_body = getConversationInfoListByTopV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_info_list_v2_body(GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
            this.get_conversation_info_list_v2_body = getConversationInfoListV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_info_v2_body(GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
            this.get_conversation_info_v2_body = getConversationInfoV2ResponseBody;
            return this;
        }

        public final Builder get_conversation_list_body(GetUserConversationListResponseBody getUserConversationListResponseBody) {
            this.get_conversation_list_body = getUserConversationListResponseBody;
            return this;
        }

        public final Builder get_conversation_setting_info_body(GetConversationSettingInfoResponseBody getConversationSettingInfoResponseBody) {
            this.get_conversation_setting_info_body = getConversationSettingInfoResponseBody;
            return this;
        }

        public final Builder get_conversations_info_list_body(GetConversationInfoListResponseBody getConversationInfoListResponseBody) {
            this.get_conversations_info_list_body = getConversationInfoListResponseBody;
            return this;
        }

        public final Builder get_group_info_body(GetGroupInfoResponseBody getGroupInfoResponseBody) {
            this.get_group_info_body = getGroupInfoResponseBody;
            return this;
        }

        public final Builder get_groups_info_body(GetGroupInfoListResponseBody getGroupInfoListResponseBody) {
            this.get_groups_info_body = getGroupInfoListResponseBody;
            return this;
        }

        public final Builder get_stranger_conversation_body(GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
            this.get_stranger_conversation_body = getStrangerConversationListResponseBody;
            return this;
        }

        public final Builder get_stranger_messages_body(GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
            this.get_stranger_messages_body = getStrangerMessagesResponseBody;
            return this;
        }

        public final Builder has_new_message_notify(NewMessageNotify newMessageNotify) {
            this.has_new_message_notify = newMessageNotify;
            return this;
        }

        public final Builder mark_conversation_read_notify(MarkConversationReadNotify markConversationReadNotify) {
            this.mark_conversation_read_notify = markConversationReadNotify;
            return this;
        }

        public final Builder mark_stranger_all_conversation_read_body(MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody) {
            this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadResponseBody;
            return this;
        }

        public final Builder mark_stranger_conversation_read_body(MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody) {
            this.mark_stranger_conversation_read_body = markStrangerConversationReadResponseBody;
            return this;
        }

        public final Builder messages_in_conversation_body(MessagesInConversationResponseBody messagesInConversationResponseBody) {
            this.messages_in_conversation_body = messagesInConversationResponseBody;
            return this;
        }

        public final Builder messages_per_user_body(MessagesPerUserResponseBody messagesPerUserResponseBody) {
            this.messages_per_user_body = messagesPerUserResponseBody;
            return this;
        }

        public final Builder messages_per_user_init_body(MessagesPerUserInitResponseBody messagesPerUserInitResponseBody) {
            this.messages_per_user_init_body = messagesPerUserInitResponseBody;
            return this;
        }

        public final Builder messages_per_user_init_v2_body(MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
            this.messages_per_user_init_v2_body = messagesPerUserInitV2ResponseBody;
            return this;
        }

        public final Builder mget_conversation_participants_body(MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody) {
            this.mget_conversation_participants_body = mgetConversationParticipantsResponseBody;
            return this;
        }

        public final Builder modify_message_property_body(ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody) {
            this.modify_message_property_body = modifyMessagePropertyResponseBody;
            return this;
        }

        public final Builder participants_min_index_body(GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
            this.participants_min_index_body = getConversationParticipantsMinIndexV3ResponseBody;
            return this;
        }

        public final Builder participants_read_index_body(GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
            this.participants_read_index_body = getConversationParticipantsReadIndexV3ResponseBody;
            return this;
        }

        public final Builder reaction_message_body(ReactionMessageResponseBody reactionMessageResponseBody) {
            this.reaction_message_body = reactionMessageResponseBody;
            return this;
        }

        public final Builder send_message_body(SendMessageResponseBody sendMessageResponseBody) {
            this.send_message_body = sendMessageResponseBody;
            return this;
        }

        public final Builder send_user_action_body(SendUserActionResponseBody sendUserActionResponseBody) {
            this.send_user_action_body = sendUserActionResponseBody;
            return this;
        }

        public final Builder set_conversation_core_info_body(SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody) {
            this.set_conversation_core_info_body = setConversationCoreInfoResponseBody;
            return this;
        }

        public final Builder set_conversation_info_body(SetConversationInfoResponseBody setConversationInfoResponseBody) {
            this.set_conversation_info_body = setConversationInfoResponseBody;
            return this;
        }

        public final Builder set_conversation_setting_info_body(SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody) {
            this.set_conversation_setting_info_body = setConversationSettingInfoResponseBody;
            return this;
        }

        public final Builder set_group_info_body(SetGroupInfoResponseBody setGroupInfoResponseBody) {
            this.set_group_info_body = setGroupInfoResponseBody;
            return this;
        }

        public final Builder stranger_has_new_message_notify(StrangerNewMessageNotify strangerNewMessageNotify) {
            this.stranger_has_new_message_notify = strangerNewMessageNotify;
            return this;
        }

        public final Builder sync_message_body(SyncMessageResponseBody syncMessageResponseBody) {
            this.sync_message_body = syncMessageResponseBody;
            return this;
        }

        public final Builder update_conversation_participant_body(UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody) {
            this.update_conversation_participant_body = updateConversationParticipantResponseBody;
            return this;
        }

        public final Builder upsert_conversation_core_ext_info_body(UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody) {
            this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoResponseBody;
            return this;
        }

        public final Builder upsert_conversation_setting_ext_info_body(UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody) {
            this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoResponseBody;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ResponseBody$ProtoAdapter_ResponseBody */
    static final class ProtoAdapter_ResponseBody extends ProtoAdapter<ResponseBody> {
        public ProtoAdapter_ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ResponseBody.class);
        }

        public final ResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case C34943c.f91127w /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.w int)*/:
                            builder.messages_per_user_body((MessagesPerUserResponseBody) MessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                            break;
                        case 201:
                            builder.messages_per_user_init_body((MessagesPerUserInitResponseBody) MessagesPerUserInitResponseBody.ADAPTER.decode(protoReader));
                            break;
                        default:
                            switch (nextTag) {
                                case C34943c.f91128x /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.x int)*/:
                                    builder.conversations_list_body((ConversationsListResponseBody) ConversationsListResponseBody.ADAPTER.decode(protoReader));
                                    break;
                                case 301:
                                    builder.messages_in_conversation_body((MessagesInConversationResponseBody) MessagesInConversationResponseBody.ADAPTER.decode(protoReader));
                                    break;
                                default:
                                    switch (nextTag) {
                                        case VETransitionFilterParam.TransitionDuration_DEFAULT /*500*/:
                                            builder.has_new_message_notify((NewMessageNotify) NewMessageNotify.ADAPTER.decode(protoReader));
                                            break;
                                        case 501:
                                            builder.mark_conversation_read_notify((MarkConversationReadNotify) MarkConversationReadNotify.ADAPTER.decode(protoReader));
                                            break;
                                        case 502:
                                            builder.conversation_info_updated_notify((ConversationInfoUpdatedNotify) ConversationInfoUpdatedNotify.ADAPTER.decode(protoReader));
                                            break;
                                        case 503:
                                            builder.stranger_has_new_message_notify((StrangerNewMessageNotify) StrangerNewMessageNotify.ADAPTER.decode(protoReader));
                                            break;
                                        default:
                                            switch (nextTag) {
                                                case 600:
                                                    builder.get_conversation_info_body((GetConversationInfoResponseBody) GetConversationInfoResponseBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 601:
                                                    builder.set_conversation_info_body((SetConversationInfoResponseBody) SetConversationInfoResponseBody.ADAPTER.decode(protoReader));
                                                    break;
                                                case 602:
                                                    builder.create_conversation_body((CreateConversationResponseBody) CreateConversationResponseBody.ADAPTER.decode(protoReader));
                                                    break;
                                                default:
                                                    switch (nextTag) {
                                                        case 607:
                                                            builder.get_conversations_info_list_body((GetConversationInfoListResponseBody) GetConversationInfoListResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 608:
                                                            builder.get_conversation_info_v2_body((GetConversationInfoV2ResponseBody) GetConversationInfoV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 609:
                                                            builder.create_conversation_v2_body((CreateConversationV2ResponseBody) CreateConversationV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 610:
                                                            builder.get_conversation_info_list_v2_body((GetConversationInfoListV2ResponseBody) GetConversationInfoListV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 611:
                                                            builder.get_conversation_info_list_by_favorite_v2_body((GetConversationInfoListByFavoriteV2ResponseBody) GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 612:
                                                            builder.get_conversation_info_list_by_top_v2_body((GetConversationInfoListByTopV2ResponseBody) GetConversationInfoListByTopV2ResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 613:
                                                            builder.batch_mark_read_body((BatchMarkConversationReadResponseBody) BatchMarkConversationReadResponseBody.ADAPTER.decode(protoReader));
                                                            break;
                                                        default:
                                                            switch (nextTag) {
                                                                case 650:
                                                                    builder.conversation_add_participants_body((ConversationAddParticipantsResponseBody) ConversationAddParticipantsResponseBody.ADAPTER.decode(protoReader));
                                                                    break;
                                                                case 651:
                                                                    builder.conversation_remove_participants_body((ConversationRemoveParticipantsResponseBody) ConversationRemoveParticipantsResponseBody.ADAPTER.decode(protoReader));
                                                                    break;
                                                                default:
                                                                    switch (nextTag) {
                                                                        case 653:
                                                                            builder.conversation_set_role_body((ConversationSetRoleResponseBody) ConversationSetRoleResponseBody.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        case 654:
                                                                            builder.mget_conversation_participants_body((MgetConversationParticipantsResponseBody) MgetConversationParticipantsResponseBody.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        case 655:
                                                                            builder.update_conversation_participant_body((UpdateConversationParticipantResponseBody) UpdateConversationParticipantResponseBody.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        default:
                                                                            switch (nextTag) {
                                                                                case 703:
                                                                                    builder.reaction_message_body((ReactionMessageResponseBody) ReactionMessageResponseBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                case 704:
                                                                                    builder.sync_message_body((SyncMessageResponseBody) SyncMessageResponseBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                case 705:
                                                                                    builder.modify_message_property_body((ModifyMessagePropertyResponseBody) ModifyMessagePropertyResponseBody.ADAPTER.decode(protoReader));
                                                                                    break;
                                                                                default:
                                                                                    switch (nextTag) {
                                                                                        case 801:
                                                                                            builder.get_group_info_body((GetGroupInfoResponseBody) GetGroupInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        case 802:
                                                                                            builder.set_group_info_body((SetGroupInfoResponseBody) SetGroupInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        case 803:
                                                                                            builder.get_groups_info_body((GetGroupInfoListResponseBody) GetGroupInfoListResponseBody.ADAPTER.decode(protoReader));
                                                                                            break;
                                                                                        default:
                                                                                            switch (nextTag) {
                                                                                                case 901:
                                                                                                    builder.get_conversation_core_info_body((GetConversationCoreInfoResponseBody) GetConversationCoreInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 902:
                                                                                                    builder.set_conversation_core_info_body((SetConversationCoreInfoResponseBody) SetConversationCoreInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 903:
                                                                                                    builder.get_conversation_core_info_list_body((GetConversationCoreInfoListResponseBody) GetConversationCoreInfoListResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 904:
                                                                                                    builder.upsert_conversation_core_ext_info_body((UpsertConversationCoreExtInfoResponseBody) UpsertConversationCoreExtInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                case 905:
                                                                                                    builder.delete_conversation_core_ext_info_body((DeleteConversationCoreExtInfoResponseBody) DeleteConversationCoreExtInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (nextTag) {
                                                                                                        case 920:
                                                                                                            builder.get_conversation_setting_info_body((GetConversationSettingInfoResponseBody) GetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        case 921:
                                                                                                            builder.set_conversation_setting_info_body((SetConversationSettingInfoResponseBody) SetConversationSettingInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        case 922:
                                                                                                            builder.upsert_conversation_setting_ext_info_body((UpsertConversationSettingExtInfoResponseBody) UpsertConversationSettingExtInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        case 923:
                                                                                                            builder.delete_conversation_setting_ext_info_body((DeleteConversationSettingExtInfoResponseBody) DeleteConversationSettingExtInfoResponseBody.ADAPTER.decode(protoReader));
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (nextTag) {
                                                                                                                case 1000:
                                                                                                                    builder.get_stranger_conversation_body((GetStrangerConversationListResponseBody) GetStrangerConversationListResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 1001:
                                                                                                                    builder.get_stranger_messages_body((GetStrangerMessagesResponseBody) GetStrangerMessagesResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 1002:
                                                                                                                    builder.delete_stranger_message_body((DeleteStrangerMessageResponseBody) DeleteStrangerMessageResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 1003:
                                                                                                                    builder.delete_stranger_conversation_body((DeleteStrangerConversationResponseBody) DeleteStrangerConversationResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case LiveRoomStruct.ROOM_LONGTIME_NO_NET /*1004*/:
                                                                                                                    builder.delete_stranger_all_conversation_body((DeleteStrangerAllConversationResponseBody) DeleteStrangerAllConversationResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 1005:
                                                                                                                    builder.mark_stranger_conversation_read_body((MarkStrangerConversationReadResponseBody) MarkStrangerConversationReadResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                case 1006:
                                                                                                                    builder.mark_stranger_all_conversation_read_body((MarkStrangerAllConversationReadResponseBody) MarkStrangerAllConversationReadResponseBody.ADAPTER.decode(protoReader));
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (nextTag) {
                                                                                                                        case AdError.SERVER_ERROR_CODE /*2000*/:
                                                                                                                            builder.participants_read_index_body((GetConversationParticipantsReadIndexV3ResponseBody) GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.decode(protoReader));
                                                                                                                            break;
                                                                                                                        case AdError.INTERNAL_ERROR_CODE /*2001*/:
                                                                                                                            builder.participants_min_index_body((GetConversationParticipantsMinIndexV3ResponseBody) GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.decode(protoReader));
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (nextTag) {
                                                                                                                                case 100:
                                                                                                                                    builder.send_message_body((SendMessageResponseBody) SendMessageResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                    break;
                                                                                                                                case 203:
                                                                                                                                    builder.messages_per_user_init_v2_body((MessagesPerUserInitV2ResponseBody) MessagesPerUserInitV2ResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                    break;
                                                                                                                                case 210:
                                                                                                                                    builder.check_messages_per_user_body((CheckMessagesPerUserResponseBody) CheckMessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                    break;
                                                                                                                                case 410:
                                                                                                                                    builder.send_user_action_body((SendUserActionResponseBody) SendUserActionResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                    break;
                                                                                                                                case 605:
                                                                                                                                    builder.conversation_participants_body((ConversationParticipantsListResponseBody) ConversationParticipantsListResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                    break;
                                                                                                                                case AdError.INTERNAL_ERROR_2006 /*2006*/:
                                                                                                                                    builder.get_conversation_list_body((GetUserConversationListResponseBody) GetUserConversationListResponseBody.ADAPTER.decode(protoReader));
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                                                                                                                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                    }
                                                                                                            }
                                                                                                    }
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final int encodedSize(ResponseBody responseBody) {
            return SendMessageResponseBody.ADAPTER.encodedSizeWithTag(100, responseBody.send_message_body) + MessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(C34943c.f91127w, responseBody.messages_per_user_body) + MessagesPerUserInitResponseBody.ADAPTER.encodedSizeWithTag(201, responseBody.messages_per_user_init_body) + MessagesPerUserInitV2ResponseBody.ADAPTER.encodedSizeWithTag(203, responseBody.messages_per_user_init_v2_body) + CheckMessagesPerUserResponseBody.ADAPTER.encodedSizeWithTag(210, responseBody.check_messages_per_user_body) + ConversationsListResponseBody.ADAPTER.encodedSizeWithTag(C34943c.f91128x, responseBody.conversations_list_body) + MessagesInConversationResponseBody.ADAPTER.encodedSizeWithTag(301, responseBody.messages_in_conversation_body) + SendUserActionResponseBody.ADAPTER.encodedSizeWithTag(410, responseBody.send_user_action_body) + NewMessageNotify.ADAPTER.encodedSizeWithTag(VETransitionFilterParam.TransitionDuration_DEFAULT, responseBody.has_new_message_notify) + MarkConversationReadNotify.ADAPTER.encodedSizeWithTag(501, responseBody.mark_conversation_read_notify) + ConversationInfoUpdatedNotify.ADAPTER.encodedSizeWithTag(502, responseBody.conversation_info_updated_notify) + StrangerNewMessageNotify.ADAPTER.encodedSizeWithTag(503, responseBody.stranger_has_new_message_notify) + GetConversationInfoResponseBody.ADAPTER.encodedSizeWithTag(600, responseBody.get_conversation_info_body) + SetConversationInfoResponseBody.ADAPTER.encodedSizeWithTag(601, responseBody.set_conversation_info_body) + CreateConversationResponseBody.ADAPTER.encodedSizeWithTag(602, responseBody.create_conversation_body) + GetConversationInfoListResponseBody.ADAPTER.encodedSizeWithTag(607, responseBody.get_conversations_info_list_body) + BatchMarkConversationReadResponseBody.ADAPTER.encodedSizeWithTag(613, responseBody.batch_mark_read_body) + GetConversationInfoV2ResponseBody.ADAPTER.encodedSizeWithTag(608, responseBody.get_conversation_info_v2_body) + CreateConversationV2ResponseBody.ADAPTER.encodedSizeWithTag(609, responseBody.create_conversation_v2_body) + GetConversationInfoListV2ResponseBody.ADAPTER.encodedSizeWithTag(610, responseBody.get_conversation_info_list_v2_body) + GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.encodedSizeWithTag(611, responseBody.get_conversation_info_list_by_favorite_v2_body) + GetConversationInfoListByTopV2ResponseBody.ADAPTER.encodedSizeWithTag(612, responseBody.get_conversation_info_list_by_top_v2_body) + ConversationParticipantsListResponseBody.ADAPTER.encodedSizeWithTag(605, responseBody.conversation_participants_body) + ConversationAddParticipantsResponseBody.ADAPTER.encodedSizeWithTag(650, responseBody.conversation_add_participants_body) + ConversationRemoveParticipantsResponseBody.ADAPTER.encodedSizeWithTag(651, responseBody.conversation_remove_participants_body) + ConversationSetRoleResponseBody.ADAPTER.encodedSizeWithTag(653, responseBody.conversation_set_role_body) + MgetConversationParticipantsResponseBody.ADAPTER.encodedSizeWithTag(654, responseBody.mget_conversation_participants_body) + UpdateConversationParticipantResponseBody.ADAPTER.encodedSizeWithTag(655, responseBody.update_conversation_participant_body) + ReactionMessageResponseBody.ADAPTER.encodedSizeWithTag(703, responseBody.reaction_message_body) + SyncMessageResponseBody.ADAPTER.encodedSizeWithTag(704, responseBody.sync_message_body) + ModifyMessagePropertyResponseBody.ADAPTER.encodedSizeWithTag(705, responseBody.modify_message_property_body) + GetGroupInfoResponseBody.ADAPTER.encodedSizeWithTag(801, responseBody.get_group_info_body) + SetGroupInfoResponseBody.ADAPTER.encodedSizeWithTag(802, responseBody.set_group_info_body) + GetGroupInfoListResponseBody.ADAPTER.encodedSizeWithTag(803, responseBody.get_groups_info_body) + GetConversationCoreInfoResponseBody.ADAPTER.encodedSizeWithTag(901, responseBody.get_conversation_core_info_body) + SetConversationCoreInfoResponseBody.ADAPTER.encodedSizeWithTag(902, responseBody.set_conversation_core_info_body) + GetConversationCoreInfoListResponseBody.ADAPTER.encodedSizeWithTag(903, responseBody.get_conversation_core_info_list_body) + UpsertConversationCoreExtInfoResponseBody.ADAPTER.encodedSizeWithTag(904, responseBody.upsert_conversation_core_ext_info_body) + DeleteConversationCoreExtInfoResponseBody.ADAPTER.encodedSizeWithTag(905, responseBody.delete_conversation_core_ext_info_body) + GetConversationSettingInfoResponseBody.ADAPTER.encodedSizeWithTag(920, responseBody.get_conversation_setting_info_body) + SetConversationSettingInfoResponseBody.ADAPTER.encodedSizeWithTag(921, responseBody.set_conversation_setting_info_body) + UpsertConversationSettingExtInfoResponseBody.ADAPTER.encodedSizeWithTag(922, responseBody.upsert_conversation_setting_ext_info_body) + DeleteConversationSettingExtInfoResponseBody.ADAPTER.encodedSizeWithTag(923, responseBody.delete_conversation_setting_ext_info_body) + GetStrangerConversationListResponseBody.ADAPTER.encodedSizeWithTag(1000, responseBody.get_stranger_conversation_body) + GetStrangerMessagesResponseBody.ADAPTER.encodedSizeWithTag(1001, responseBody.get_stranger_messages_body) + DeleteStrangerMessageResponseBody.ADAPTER.encodedSizeWithTag(1002, responseBody.delete_stranger_message_body) + DeleteStrangerConversationResponseBody.ADAPTER.encodedSizeWithTag(1003, responseBody.delete_stranger_conversation_body) + DeleteStrangerAllConversationResponseBody.ADAPTER.encodedSizeWithTag(LiveRoomStruct.ROOM_LONGTIME_NO_NET, responseBody.delete_stranger_all_conversation_body) + MarkStrangerConversationReadResponseBody.ADAPTER.encodedSizeWithTag(1005, responseBody.mark_stranger_conversation_read_body) + MarkStrangerAllConversationReadResponseBody.ADAPTER.encodedSizeWithTag(1006, responseBody.mark_stranger_all_conversation_read_body) + GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(AdError.SERVER_ERROR_CODE, responseBody.participants_read_index_body) + GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.encodedSizeWithTag(AdError.INTERNAL_ERROR_CODE, responseBody.participants_min_index_body) + GetUserConversationListResponseBody.ADAPTER.encodedSizeWithTag(AdError.INTERNAL_ERROR_2006, responseBody.get_conversation_list_body) + responseBody.unknownFields().size();
        }

        public final ResponseBody redact(ResponseBody responseBody) {
            Builder newBuilder = responseBody.newBuilder();
            if (newBuilder.send_message_body != null) {
                newBuilder.send_message_body = (SendMessageResponseBody) SendMessageResponseBody.ADAPTER.redact(newBuilder.send_message_body);
            }
            if (newBuilder.messages_per_user_body != null) {
                newBuilder.messages_per_user_body = (MessagesPerUserResponseBody) MessagesPerUserResponseBody.ADAPTER.redact(newBuilder.messages_per_user_body);
            }
            if (newBuilder.messages_per_user_init_body != null) {
                newBuilder.messages_per_user_init_body = (MessagesPerUserInitResponseBody) MessagesPerUserInitResponseBody.ADAPTER.redact(newBuilder.messages_per_user_init_body);
            }
            if (newBuilder.messages_per_user_init_v2_body != null) {
                newBuilder.messages_per_user_init_v2_body = (MessagesPerUserInitV2ResponseBody) MessagesPerUserInitV2ResponseBody.ADAPTER.redact(newBuilder.messages_per_user_init_v2_body);
            }
            if (newBuilder.check_messages_per_user_body != null) {
                newBuilder.check_messages_per_user_body = (CheckMessagesPerUserResponseBody) CheckMessagesPerUserResponseBody.ADAPTER.redact(newBuilder.check_messages_per_user_body);
            }
            if (newBuilder.conversations_list_body != null) {
                newBuilder.conversations_list_body = (ConversationsListResponseBody) ConversationsListResponseBody.ADAPTER.redact(newBuilder.conversations_list_body);
            }
            if (newBuilder.messages_in_conversation_body != null) {
                newBuilder.messages_in_conversation_body = (MessagesInConversationResponseBody) MessagesInConversationResponseBody.ADAPTER.redact(newBuilder.messages_in_conversation_body);
            }
            if (newBuilder.send_user_action_body != null) {
                newBuilder.send_user_action_body = (SendUserActionResponseBody) SendUserActionResponseBody.ADAPTER.redact(newBuilder.send_user_action_body);
            }
            if (newBuilder.has_new_message_notify != null) {
                newBuilder.has_new_message_notify = (NewMessageNotify) NewMessageNotify.ADAPTER.redact(newBuilder.has_new_message_notify);
            }
            if (newBuilder.mark_conversation_read_notify != null) {
                newBuilder.mark_conversation_read_notify = (MarkConversationReadNotify) MarkConversationReadNotify.ADAPTER.redact(newBuilder.mark_conversation_read_notify);
            }
            if (newBuilder.conversation_info_updated_notify != null) {
                newBuilder.conversation_info_updated_notify = (ConversationInfoUpdatedNotify) ConversationInfoUpdatedNotify.ADAPTER.redact(newBuilder.conversation_info_updated_notify);
            }
            if (newBuilder.stranger_has_new_message_notify != null) {
                newBuilder.stranger_has_new_message_notify = (StrangerNewMessageNotify) StrangerNewMessageNotify.ADAPTER.redact(newBuilder.stranger_has_new_message_notify);
            }
            if (newBuilder.get_conversation_info_body != null) {
                newBuilder.get_conversation_info_body = (GetConversationInfoResponseBody) GetConversationInfoResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_body);
            }
            if (newBuilder.set_conversation_info_body != null) {
                newBuilder.set_conversation_info_body = (SetConversationInfoResponseBody) SetConversationInfoResponseBody.ADAPTER.redact(newBuilder.set_conversation_info_body);
            }
            if (newBuilder.create_conversation_body != null) {
                newBuilder.create_conversation_body = (CreateConversationResponseBody) CreateConversationResponseBody.ADAPTER.redact(newBuilder.create_conversation_body);
            }
            if (newBuilder.get_conversations_info_list_body != null) {
                newBuilder.get_conversations_info_list_body = (GetConversationInfoListResponseBody) GetConversationInfoListResponseBody.ADAPTER.redact(newBuilder.get_conversations_info_list_body);
            }
            if (newBuilder.batch_mark_read_body != null) {
                newBuilder.batch_mark_read_body = (BatchMarkConversationReadResponseBody) BatchMarkConversationReadResponseBody.ADAPTER.redact(newBuilder.batch_mark_read_body);
            }
            if (newBuilder.get_conversation_info_v2_body != null) {
                newBuilder.get_conversation_info_v2_body = (GetConversationInfoV2ResponseBody) GetConversationInfoV2ResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_v2_body);
            }
            if (newBuilder.create_conversation_v2_body != null) {
                newBuilder.create_conversation_v2_body = (CreateConversationV2ResponseBody) CreateConversationV2ResponseBody.ADAPTER.redact(newBuilder.create_conversation_v2_body);
            }
            if (newBuilder.get_conversation_info_list_v2_body != null) {
                newBuilder.get_conversation_info_list_v2_body = (GetConversationInfoListV2ResponseBody) GetConversationInfoListV2ResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_list_v2_body);
            }
            if (newBuilder.get_conversation_info_list_by_favorite_v2_body != null) {
                newBuilder.get_conversation_info_list_by_favorite_v2_body = (GetConversationInfoListByFavoriteV2ResponseBody) GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_list_by_favorite_v2_body);
            }
            if (newBuilder.get_conversation_info_list_by_top_v2_body != null) {
                newBuilder.get_conversation_info_list_by_top_v2_body = (GetConversationInfoListByTopV2ResponseBody) GetConversationInfoListByTopV2ResponseBody.ADAPTER.redact(newBuilder.get_conversation_info_list_by_top_v2_body);
            }
            if (newBuilder.conversation_participants_body != null) {
                newBuilder.conversation_participants_body = (ConversationParticipantsListResponseBody) ConversationParticipantsListResponseBody.ADAPTER.redact(newBuilder.conversation_participants_body);
            }
            if (newBuilder.conversation_add_participants_body != null) {
                newBuilder.conversation_add_participants_body = (ConversationAddParticipantsResponseBody) ConversationAddParticipantsResponseBody.ADAPTER.redact(newBuilder.conversation_add_participants_body);
            }
            if (newBuilder.conversation_remove_participants_body != null) {
                newBuilder.conversation_remove_participants_body = (ConversationRemoveParticipantsResponseBody) ConversationRemoveParticipantsResponseBody.ADAPTER.redact(newBuilder.conversation_remove_participants_body);
            }
            if (newBuilder.conversation_set_role_body != null) {
                newBuilder.conversation_set_role_body = (ConversationSetRoleResponseBody) ConversationSetRoleResponseBody.ADAPTER.redact(newBuilder.conversation_set_role_body);
            }
            if (newBuilder.mget_conversation_participants_body != null) {
                newBuilder.mget_conversation_participants_body = (MgetConversationParticipantsResponseBody) MgetConversationParticipantsResponseBody.ADAPTER.redact(newBuilder.mget_conversation_participants_body);
            }
            if (newBuilder.update_conversation_participant_body != null) {
                newBuilder.update_conversation_participant_body = (UpdateConversationParticipantResponseBody) UpdateConversationParticipantResponseBody.ADAPTER.redact(newBuilder.update_conversation_participant_body);
            }
            if (newBuilder.reaction_message_body != null) {
                newBuilder.reaction_message_body = (ReactionMessageResponseBody) ReactionMessageResponseBody.ADAPTER.redact(newBuilder.reaction_message_body);
            }
            if (newBuilder.sync_message_body != null) {
                newBuilder.sync_message_body = (SyncMessageResponseBody) SyncMessageResponseBody.ADAPTER.redact(newBuilder.sync_message_body);
            }
            if (newBuilder.modify_message_property_body != null) {
                newBuilder.modify_message_property_body = (ModifyMessagePropertyResponseBody) ModifyMessagePropertyResponseBody.ADAPTER.redact(newBuilder.modify_message_property_body);
            }
            if (newBuilder.get_group_info_body != null) {
                newBuilder.get_group_info_body = (GetGroupInfoResponseBody) GetGroupInfoResponseBody.ADAPTER.redact(newBuilder.get_group_info_body);
            }
            if (newBuilder.set_group_info_body != null) {
                newBuilder.set_group_info_body = (SetGroupInfoResponseBody) SetGroupInfoResponseBody.ADAPTER.redact(newBuilder.set_group_info_body);
            }
            if (newBuilder.get_groups_info_body != null) {
                newBuilder.get_groups_info_body = (GetGroupInfoListResponseBody) GetGroupInfoListResponseBody.ADAPTER.redact(newBuilder.get_groups_info_body);
            }
            if (newBuilder.get_conversation_core_info_body != null) {
                newBuilder.get_conversation_core_info_body = (GetConversationCoreInfoResponseBody) GetConversationCoreInfoResponseBody.ADAPTER.redact(newBuilder.get_conversation_core_info_body);
            }
            if (newBuilder.set_conversation_core_info_body != null) {
                newBuilder.set_conversation_core_info_body = (SetConversationCoreInfoResponseBody) SetConversationCoreInfoResponseBody.ADAPTER.redact(newBuilder.set_conversation_core_info_body);
            }
            if (newBuilder.get_conversation_core_info_list_body != null) {
                newBuilder.get_conversation_core_info_list_body = (GetConversationCoreInfoListResponseBody) GetConversationCoreInfoListResponseBody.ADAPTER.redact(newBuilder.get_conversation_core_info_list_body);
            }
            if (newBuilder.upsert_conversation_core_ext_info_body != null) {
                newBuilder.upsert_conversation_core_ext_info_body = (UpsertConversationCoreExtInfoResponseBody) UpsertConversationCoreExtInfoResponseBody.ADAPTER.redact(newBuilder.upsert_conversation_core_ext_info_body);
            }
            if (newBuilder.delete_conversation_core_ext_info_body != null) {
                newBuilder.delete_conversation_core_ext_info_body = (DeleteConversationCoreExtInfoResponseBody) DeleteConversationCoreExtInfoResponseBody.ADAPTER.redact(newBuilder.delete_conversation_core_ext_info_body);
            }
            if (newBuilder.get_conversation_setting_info_body != null) {
                newBuilder.get_conversation_setting_info_body = (GetConversationSettingInfoResponseBody) GetConversationSettingInfoResponseBody.ADAPTER.redact(newBuilder.get_conversation_setting_info_body);
            }
            if (newBuilder.set_conversation_setting_info_body != null) {
                newBuilder.set_conversation_setting_info_body = (SetConversationSettingInfoResponseBody) SetConversationSettingInfoResponseBody.ADAPTER.redact(newBuilder.set_conversation_setting_info_body);
            }
            if (newBuilder.upsert_conversation_setting_ext_info_body != null) {
                newBuilder.upsert_conversation_setting_ext_info_body = (UpsertConversationSettingExtInfoResponseBody) UpsertConversationSettingExtInfoResponseBody.ADAPTER.redact(newBuilder.upsert_conversation_setting_ext_info_body);
            }
            if (newBuilder.delete_conversation_setting_ext_info_body != null) {
                newBuilder.delete_conversation_setting_ext_info_body = (DeleteConversationSettingExtInfoResponseBody) DeleteConversationSettingExtInfoResponseBody.ADAPTER.redact(newBuilder.delete_conversation_setting_ext_info_body);
            }
            if (newBuilder.get_stranger_conversation_body != null) {
                newBuilder.get_stranger_conversation_body = (GetStrangerConversationListResponseBody) GetStrangerConversationListResponseBody.ADAPTER.redact(newBuilder.get_stranger_conversation_body);
            }
            if (newBuilder.get_stranger_messages_body != null) {
                newBuilder.get_stranger_messages_body = (GetStrangerMessagesResponseBody) GetStrangerMessagesResponseBody.ADAPTER.redact(newBuilder.get_stranger_messages_body);
            }
            if (newBuilder.delete_stranger_message_body != null) {
                newBuilder.delete_stranger_message_body = (DeleteStrangerMessageResponseBody) DeleteStrangerMessageResponseBody.ADAPTER.redact(newBuilder.delete_stranger_message_body);
            }
            if (newBuilder.delete_stranger_conversation_body != null) {
                newBuilder.delete_stranger_conversation_body = (DeleteStrangerConversationResponseBody) DeleteStrangerConversationResponseBody.ADAPTER.redact(newBuilder.delete_stranger_conversation_body);
            }
            if (newBuilder.delete_stranger_all_conversation_body != null) {
                newBuilder.delete_stranger_all_conversation_body = (DeleteStrangerAllConversationResponseBody) DeleteStrangerAllConversationResponseBody.ADAPTER.redact(newBuilder.delete_stranger_all_conversation_body);
            }
            if (newBuilder.mark_stranger_conversation_read_body != null) {
                newBuilder.mark_stranger_conversation_read_body = (MarkStrangerConversationReadResponseBody) MarkStrangerConversationReadResponseBody.ADAPTER.redact(newBuilder.mark_stranger_conversation_read_body);
            }
            if (newBuilder.mark_stranger_all_conversation_read_body != null) {
                newBuilder.mark_stranger_all_conversation_read_body = (MarkStrangerAllConversationReadResponseBody) MarkStrangerAllConversationReadResponseBody.ADAPTER.redact(newBuilder.mark_stranger_all_conversation_read_body);
            }
            if (newBuilder.participants_read_index_body != null) {
                newBuilder.participants_read_index_body = (GetConversationParticipantsReadIndexV3ResponseBody) GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.redact(newBuilder.participants_read_index_body);
            }
            if (newBuilder.participants_min_index_body != null) {
                newBuilder.participants_min_index_body = (GetConversationParticipantsMinIndexV3ResponseBody) GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.redact(newBuilder.participants_min_index_body);
            }
            if (newBuilder.get_conversation_list_body != null) {
                newBuilder.get_conversation_list_body = (GetUserConversationListResponseBody) GetUserConversationListResponseBody.ADAPTER.redact(newBuilder.get_conversation_list_body);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final void encode(ProtoWriter protoWriter, ResponseBody responseBody) throws IOException {
            SendMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 100, responseBody.send_message_body);
            MessagesPerUserResponseBody.ADAPTER.encodeWithTag(protoWriter, C34943c.f91127w, responseBody.messages_per_user_body);
            MessagesPerUserInitResponseBody.ADAPTER.encodeWithTag(protoWriter, 201, responseBody.messages_per_user_init_body);
            MessagesPerUserInitV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 203, responseBody.messages_per_user_init_v2_body);
            CheckMessagesPerUserResponseBody.ADAPTER.encodeWithTag(protoWriter, 210, responseBody.check_messages_per_user_body);
            ConversationsListResponseBody.ADAPTER.encodeWithTag(protoWriter, C34943c.f91128x, responseBody.conversations_list_body);
            MessagesInConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 301, responseBody.messages_in_conversation_body);
            SendUserActionResponseBody.ADAPTER.encodeWithTag(protoWriter, 410, responseBody.send_user_action_body);
            NewMessageNotify.ADAPTER.encodeWithTag(protoWriter, VETransitionFilterParam.TransitionDuration_DEFAULT, responseBody.has_new_message_notify);
            MarkConversationReadNotify.ADAPTER.encodeWithTag(protoWriter, 501, responseBody.mark_conversation_read_notify);
            ConversationInfoUpdatedNotify.ADAPTER.encodeWithTag(protoWriter, 502, responseBody.conversation_info_updated_notify);
            StrangerNewMessageNotify.ADAPTER.encodeWithTag(protoWriter, 503, responseBody.stranger_has_new_message_notify);
            GetConversationInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 600, responseBody.get_conversation_info_body);
            SetConversationInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 601, responseBody.set_conversation_info_body);
            CreateConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 602, responseBody.create_conversation_body);
            GetConversationInfoListResponseBody.ADAPTER.encodeWithTag(protoWriter, 607, responseBody.get_conversations_info_list_body);
            BatchMarkConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 613, responseBody.batch_mark_read_body);
            GetConversationInfoV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 608, responseBody.get_conversation_info_v2_body);
            CreateConversationV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 609, responseBody.create_conversation_v2_body);
            GetConversationInfoListV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 610, responseBody.get_conversation_info_list_v2_body);
            GetConversationInfoListByFavoriteV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 611, responseBody.get_conversation_info_list_by_favorite_v2_body);
            GetConversationInfoListByTopV2ResponseBody.ADAPTER.encodeWithTag(protoWriter, 612, responseBody.get_conversation_info_list_by_top_v2_body);
            ConversationParticipantsListResponseBody.ADAPTER.encodeWithTag(protoWriter, 605, responseBody.conversation_participants_body);
            ConversationAddParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 650, responseBody.conversation_add_participants_body);
            ConversationRemoveParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 651, responseBody.conversation_remove_participants_body);
            ConversationSetRoleResponseBody.ADAPTER.encodeWithTag(protoWriter, 653, responseBody.conversation_set_role_body);
            MgetConversationParticipantsResponseBody.ADAPTER.encodeWithTag(protoWriter, 654, responseBody.mget_conversation_participants_body);
            UpdateConversationParticipantResponseBody.ADAPTER.encodeWithTag(protoWriter, 655, responseBody.update_conversation_participant_body);
            ReactionMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 703, responseBody.reaction_message_body);
            SyncMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 704, responseBody.sync_message_body);
            ModifyMessagePropertyResponseBody.ADAPTER.encodeWithTag(protoWriter, 705, responseBody.modify_message_property_body);
            GetGroupInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 801, responseBody.get_group_info_body);
            SetGroupInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 802, responseBody.set_group_info_body);
            GetGroupInfoListResponseBody.ADAPTER.encodeWithTag(protoWriter, 803, responseBody.get_groups_info_body);
            GetConversationCoreInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 901, responseBody.get_conversation_core_info_body);
            SetConversationCoreInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 902, responseBody.set_conversation_core_info_body);
            GetConversationCoreInfoListResponseBody.ADAPTER.encodeWithTag(protoWriter, 903, responseBody.get_conversation_core_info_list_body);
            UpsertConversationCoreExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 904, responseBody.upsert_conversation_core_ext_info_body);
            DeleteConversationCoreExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 905, responseBody.delete_conversation_core_ext_info_body);
            GetConversationSettingInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 920, responseBody.get_conversation_setting_info_body);
            SetConversationSettingInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 921, responseBody.set_conversation_setting_info_body);
            UpsertConversationSettingExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 922, responseBody.upsert_conversation_setting_ext_info_body);
            DeleteConversationSettingExtInfoResponseBody.ADAPTER.encodeWithTag(protoWriter, 923, responseBody.delete_conversation_setting_ext_info_body);
            GetStrangerConversationListResponseBody.ADAPTER.encodeWithTag(protoWriter, 1000, responseBody.get_stranger_conversation_body);
            GetStrangerMessagesResponseBody.ADAPTER.encodeWithTag(protoWriter, 1001, responseBody.get_stranger_messages_body);
            DeleteStrangerMessageResponseBody.ADAPTER.encodeWithTag(protoWriter, 1002, responseBody.delete_stranger_message_body);
            DeleteStrangerConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, 1003, responseBody.delete_stranger_conversation_body);
            DeleteStrangerAllConversationResponseBody.ADAPTER.encodeWithTag(protoWriter, LiveRoomStruct.ROOM_LONGTIME_NO_NET, responseBody.delete_stranger_all_conversation_body);
            MarkStrangerConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 1005, responseBody.mark_stranger_conversation_read_body);
            MarkStrangerAllConversationReadResponseBody.ADAPTER.encodeWithTag(protoWriter, 1006, responseBody.mark_stranger_all_conversation_read_body);
            GetConversationParticipantsReadIndexV3ResponseBody.ADAPTER.encodeWithTag(protoWriter, AdError.SERVER_ERROR_CODE, responseBody.participants_read_index_body);
            GetConversationParticipantsMinIndexV3ResponseBody.ADAPTER.encodeWithTag(protoWriter, AdError.INTERNAL_ERROR_CODE, responseBody.participants_min_index_body);
            GetUserConversationListResponseBody.ADAPTER.encodeWithTag(protoWriter, AdError.INTERNAL_ERROR_2006, responseBody.get_conversation_list_body);
            protoWriter.writeBytes(responseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.send_message_body = this.send_message_body;
        builder.messages_per_user_body = this.messages_per_user_body;
        builder.messages_per_user_init_body = this.messages_per_user_init_body;
        builder.messages_per_user_init_v2_body = this.messages_per_user_init_v2_body;
        builder.check_messages_per_user_body = this.check_messages_per_user_body;
        builder.conversations_list_body = this.conversations_list_body;
        builder.messages_in_conversation_body = this.messages_in_conversation_body;
        builder.send_user_action_body = this.send_user_action_body;
        builder.has_new_message_notify = this.has_new_message_notify;
        builder.mark_conversation_read_notify = this.mark_conversation_read_notify;
        builder.conversation_info_updated_notify = this.conversation_info_updated_notify;
        builder.stranger_has_new_message_notify = this.stranger_has_new_message_notify;
        builder.get_conversation_info_body = this.get_conversation_info_body;
        builder.set_conversation_info_body = this.set_conversation_info_body;
        builder.create_conversation_body = this.create_conversation_body;
        builder.get_conversations_info_list_body = this.get_conversations_info_list_body;
        builder.batch_mark_read_body = this.batch_mark_read_body;
        builder.get_conversation_info_v2_body = this.get_conversation_info_v2_body;
        builder.create_conversation_v2_body = this.create_conversation_v2_body;
        builder.get_conversation_info_list_v2_body = this.get_conversation_info_list_v2_body;
        builder.get_conversation_info_list_by_favorite_v2_body = this.get_conversation_info_list_by_favorite_v2_body;
        builder.get_conversation_info_list_by_top_v2_body = this.get_conversation_info_list_by_top_v2_body;
        builder.conversation_participants_body = this.conversation_participants_body;
        builder.conversation_add_participants_body = this.conversation_add_participants_body;
        builder.conversation_remove_participants_body = this.conversation_remove_participants_body;
        builder.conversation_set_role_body = this.conversation_set_role_body;
        builder.mget_conversation_participants_body = this.mget_conversation_participants_body;
        builder.update_conversation_participant_body = this.update_conversation_participant_body;
        builder.reaction_message_body = this.reaction_message_body;
        builder.sync_message_body = this.sync_message_body;
        builder.modify_message_property_body = this.modify_message_property_body;
        builder.get_group_info_body = this.get_group_info_body;
        builder.set_group_info_body = this.set_group_info_body;
        builder.get_groups_info_body = this.get_groups_info_body;
        builder.get_conversation_core_info_body = this.get_conversation_core_info_body;
        builder.set_conversation_core_info_body = this.set_conversation_core_info_body;
        builder.get_conversation_core_info_list_body = this.get_conversation_core_info_list_body;
        builder.upsert_conversation_core_ext_info_body = this.upsert_conversation_core_ext_info_body;
        builder.delete_conversation_core_ext_info_body = this.delete_conversation_core_ext_info_body;
        builder.get_conversation_setting_info_body = this.get_conversation_setting_info_body;
        builder.set_conversation_setting_info_body = this.set_conversation_setting_info_body;
        builder.upsert_conversation_setting_ext_info_body = this.upsert_conversation_setting_ext_info_body;
        builder.delete_conversation_setting_ext_info_body = this.delete_conversation_setting_ext_info_body;
        builder.get_stranger_conversation_body = this.get_stranger_conversation_body;
        builder.get_stranger_messages_body = this.get_stranger_messages_body;
        builder.delete_stranger_message_body = this.delete_stranger_message_body;
        builder.delete_stranger_conversation_body = this.delete_stranger_conversation_body;
        builder.delete_stranger_all_conversation_body = this.delete_stranger_all_conversation_body;
        builder.mark_stranger_conversation_read_body = this.mark_stranger_conversation_read_body;
        builder.mark_stranger_all_conversation_read_body = this.mark_stranger_all_conversation_read_body;
        builder.participants_read_index_body = this.participants_read_index_body;
        builder.participants_min_index_body = this.participants_min_index_body;
        builder.get_conversation_list_body = this.get_conversation_list_body;
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
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53 = this.hashCode;
        if (i53 != 0) {
            return i53;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i54 = 0;
        if (this.send_message_body != null) {
            i = this.send_message_body.hashCode();
        } else {
            i = 0;
        }
        int i55 = (hashCode + i) * 37;
        if (this.messages_per_user_body != null) {
            i2 = this.messages_per_user_body.hashCode();
        } else {
            i2 = 0;
        }
        int i56 = (i55 + i2) * 37;
        if (this.messages_per_user_init_body != null) {
            i3 = this.messages_per_user_init_body.hashCode();
        } else {
            i3 = 0;
        }
        int i57 = (i56 + i3) * 37;
        if (this.messages_per_user_init_v2_body != null) {
            i4 = this.messages_per_user_init_v2_body.hashCode();
        } else {
            i4 = 0;
        }
        int i58 = (i57 + i4) * 37;
        if (this.check_messages_per_user_body != null) {
            i5 = this.check_messages_per_user_body.hashCode();
        } else {
            i5 = 0;
        }
        int i59 = (i58 + i5) * 37;
        if (this.conversations_list_body != null) {
            i6 = this.conversations_list_body.hashCode();
        } else {
            i6 = 0;
        }
        int i60 = (i59 + i6) * 37;
        if (this.messages_in_conversation_body != null) {
            i7 = this.messages_in_conversation_body.hashCode();
        } else {
            i7 = 0;
        }
        int i61 = (i60 + i7) * 37;
        if (this.send_user_action_body != null) {
            i8 = this.send_user_action_body.hashCode();
        } else {
            i8 = 0;
        }
        int i62 = (i61 + i8) * 37;
        if (this.has_new_message_notify != null) {
            i9 = this.has_new_message_notify.hashCode();
        } else {
            i9 = 0;
        }
        int i63 = (i62 + i9) * 37;
        if (this.mark_conversation_read_notify != null) {
            i10 = this.mark_conversation_read_notify.hashCode();
        } else {
            i10 = 0;
        }
        int i64 = (i63 + i10) * 37;
        if (this.conversation_info_updated_notify != null) {
            i11 = this.conversation_info_updated_notify.hashCode();
        } else {
            i11 = 0;
        }
        int i65 = (i64 + i11) * 37;
        if (this.stranger_has_new_message_notify != null) {
            i12 = this.stranger_has_new_message_notify.hashCode();
        } else {
            i12 = 0;
        }
        int i66 = (i65 + i12) * 37;
        if (this.get_conversation_info_body != null) {
            i13 = this.get_conversation_info_body.hashCode();
        } else {
            i13 = 0;
        }
        int i67 = (i66 + i13) * 37;
        if (this.set_conversation_info_body != null) {
            i14 = this.set_conversation_info_body.hashCode();
        } else {
            i14 = 0;
        }
        int i68 = (i67 + i14) * 37;
        if (this.create_conversation_body != null) {
            i15 = this.create_conversation_body.hashCode();
        } else {
            i15 = 0;
        }
        int i69 = (i68 + i15) * 37;
        if (this.get_conversations_info_list_body != null) {
            i16 = this.get_conversations_info_list_body.hashCode();
        } else {
            i16 = 0;
        }
        int i70 = (i69 + i16) * 37;
        if (this.batch_mark_read_body != null) {
            i17 = this.batch_mark_read_body.hashCode();
        } else {
            i17 = 0;
        }
        int i71 = (i70 + i17) * 37;
        if (this.get_conversation_info_v2_body != null) {
            i18 = this.get_conversation_info_v2_body.hashCode();
        } else {
            i18 = 0;
        }
        int i72 = (i71 + i18) * 37;
        if (this.create_conversation_v2_body != null) {
            i19 = this.create_conversation_v2_body.hashCode();
        } else {
            i19 = 0;
        }
        int i73 = (i72 + i19) * 37;
        if (this.get_conversation_info_list_v2_body != null) {
            i20 = this.get_conversation_info_list_v2_body.hashCode();
        } else {
            i20 = 0;
        }
        int i74 = (i73 + i20) * 37;
        if (this.get_conversation_info_list_by_favorite_v2_body != null) {
            i21 = this.get_conversation_info_list_by_favorite_v2_body.hashCode();
        } else {
            i21 = 0;
        }
        int i75 = (i74 + i21) * 37;
        if (this.get_conversation_info_list_by_top_v2_body != null) {
            i22 = this.get_conversation_info_list_by_top_v2_body.hashCode();
        } else {
            i22 = 0;
        }
        int i76 = (i75 + i22) * 37;
        if (this.conversation_participants_body != null) {
            i23 = this.conversation_participants_body.hashCode();
        } else {
            i23 = 0;
        }
        int i77 = (i76 + i23) * 37;
        if (this.conversation_add_participants_body != null) {
            i24 = this.conversation_add_participants_body.hashCode();
        } else {
            i24 = 0;
        }
        int i78 = (i77 + i24) * 37;
        if (this.conversation_remove_participants_body != null) {
            i25 = this.conversation_remove_participants_body.hashCode();
        } else {
            i25 = 0;
        }
        int i79 = (i78 + i25) * 37;
        if (this.conversation_set_role_body != null) {
            i26 = this.conversation_set_role_body.hashCode();
        } else {
            i26 = 0;
        }
        int i80 = (i79 + i26) * 37;
        if (this.mget_conversation_participants_body != null) {
            i27 = this.mget_conversation_participants_body.hashCode();
        } else {
            i27 = 0;
        }
        int i81 = (i80 + i27) * 37;
        if (this.update_conversation_participant_body != null) {
            i28 = this.update_conversation_participant_body.hashCode();
        } else {
            i28 = 0;
        }
        int i82 = (i81 + i28) * 37;
        if (this.reaction_message_body != null) {
            i29 = this.reaction_message_body.hashCode();
        } else {
            i29 = 0;
        }
        int i83 = (i82 + i29) * 37;
        if (this.sync_message_body != null) {
            i30 = this.sync_message_body.hashCode();
        } else {
            i30 = 0;
        }
        int i84 = (i83 + i30) * 37;
        if (this.modify_message_property_body != null) {
            i31 = this.modify_message_property_body.hashCode();
        } else {
            i31 = 0;
        }
        int i85 = (i84 + i31) * 37;
        if (this.get_group_info_body != null) {
            i32 = this.get_group_info_body.hashCode();
        } else {
            i32 = 0;
        }
        int i86 = (i85 + i32) * 37;
        if (this.set_group_info_body != null) {
            i33 = this.set_group_info_body.hashCode();
        } else {
            i33 = 0;
        }
        int i87 = (i86 + i33) * 37;
        if (this.get_groups_info_body != null) {
            i34 = this.get_groups_info_body.hashCode();
        } else {
            i34 = 0;
        }
        int i88 = (i87 + i34) * 37;
        if (this.get_conversation_core_info_body != null) {
            i35 = this.get_conversation_core_info_body.hashCode();
        } else {
            i35 = 0;
        }
        int i89 = (i88 + i35) * 37;
        if (this.set_conversation_core_info_body != null) {
            i36 = this.set_conversation_core_info_body.hashCode();
        } else {
            i36 = 0;
        }
        int i90 = (i89 + i36) * 37;
        if (this.get_conversation_core_info_list_body != null) {
            i37 = this.get_conversation_core_info_list_body.hashCode();
        } else {
            i37 = 0;
        }
        int i91 = (i90 + i37) * 37;
        if (this.upsert_conversation_core_ext_info_body != null) {
            i38 = this.upsert_conversation_core_ext_info_body.hashCode();
        } else {
            i38 = 0;
        }
        int i92 = (i91 + i38) * 37;
        if (this.delete_conversation_core_ext_info_body != null) {
            i39 = this.delete_conversation_core_ext_info_body.hashCode();
        } else {
            i39 = 0;
        }
        int i93 = (i92 + i39) * 37;
        if (this.get_conversation_setting_info_body != null) {
            i40 = this.get_conversation_setting_info_body.hashCode();
        } else {
            i40 = 0;
        }
        int i94 = (i93 + i40) * 37;
        if (this.set_conversation_setting_info_body != null) {
            i41 = this.set_conversation_setting_info_body.hashCode();
        } else {
            i41 = 0;
        }
        int i95 = (i94 + i41) * 37;
        if (this.upsert_conversation_setting_ext_info_body != null) {
            i42 = this.upsert_conversation_setting_ext_info_body.hashCode();
        } else {
            i42 = 0;
        }
        int i96 = (i95 + i42) * 37;
        if (this.delete_conversation_setting_ext_info_body != null) {
            i43 = this.delete_conversation_setting_ext_info_body.hashCode();
        } else {
            i43 = 0;
        }
        int i97 = (i96 + i43) * 37;
        if (this.get_stranger_conversation_body != null) {
            i44 = this.get_stranger_conversation_body.hashCode();
        } else {
            i44 = 0;
        }
        int i98 = (i97 + i44) * 37;
        if (this.get_stranger_messages_body != null) {
            i45 = this.get_stranger_messages_body.hashCode();
        } else {
            i45 = 0;
        }
        int i99 = (i98 + i45) * 37;
        if (this.delete_stranger_message_body != null) {
            i46 = this.delete_stranger_message_body.hashCode();
        } else {
            i46 = 0;
        }
        int i100 = (i99 + i46) * 37;
        if (this.delete_stranger_conversation_body != null) {
            i47 = this.delete_stranger_conversation_body.hashCode();
        } else {
            i47 = 0;
        }
        int i101 = (i100 + i47) * 37;
        if (this.delete_stranger_all_conversation_body != null) {
            i48 = this.delete_stranger_all_conversation_body.hashCode();
        } else {
            i48 = 0;
        }
        int i102 = (i101 + i48) * 37;
        if (this.mark_stranger_conversation_read_body != null) {
            i49 = this.mark_stranger_conversation_read_body.hashCode();
        } else {
            i49 = 0;
        }
        int i103 = (i102 + i49) * 37;
        if (this.mark_stranger_all_conversation_read_body != null) {
            i50 = this.mark_stranger_all_conversation_read_body.hashCode();
        } else {
            i50 = 0;
        }
        int i104 = (i103 + i50) * 37;
        if (this.participants_read_index_body != null) {
            i51 = this.participants_read_index_body.hashCode();
        } else {
            i51 = 0;
        }
        int i105 = (i104 + i51) * 37;
        if (this.participants_min_index_body != null) {
            i52 = this.participants_min_index_body.hashCode();
        } else {
            i52 = 0;
        }
        int i106 = (i105 + i52) * 37;
        if (this.get_conversation_list_body != null) {
            i54 = this.get_conversation_list_body.hashCode();
        }
        int i107 = i106 + i54;
        this.hashCode = i107;
        return i107;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_message_body != null) {
            sb.append(", send_message_body=");
            sb.append(this.send_message_body);
        }
        if (this.messages_per_user_body != null) {
            sb.append(", messages_per_user_body=");
            sb.append(this.messages_per_user_body);
        }
        if (this.messages_per_user_init_body != null) {
            sb.append(", messages_per_user_init_body=");
            sb.append(this.messages_per_user_init_body);
        }
        if (this.messages_per_user_init_v2_body != null) {
            sb.append(", messages_per_user_init_v2_body=");
            sb.append(this.messages_per_user_init_v2_body);
        }
        if (this.check_messages_per_user_body != null) {
            sb.append(", check_messages_per_user_body=");
            sb.append(this.check_messages_per_user_body);
        }
        if (this.conversations_list_body != null) {
            sb.append(", conversations_list_body=");
            sb.append(this.conversations_list_body);
        }
        if (this.messages_in_conversation_body != null) {
            sb.append(", messages_in_conversation_body=");
            sb.append(this.messages_in_conversation_body);
        }
        if (this.send_user_action_body != null) {
            sb.append(", send_user_action_body=");
            sb.append(this.send_user_action_body);
        }
        if (this.has_new_message_notify != null) {
            sb.append(", has_new_message_notify=");
            sb.append(this.has_new_message_notify);
        }
        if (this.mark_conversation_read_notify != null) {
            sb.append(", mark_conversation_read_notify=");
            sb.append(this.mark_conversation_read_notify);
        }
        if (this.conversation_info_updated_notify != null) {
            sb.append(", conversation_info_updated_notify=");
            sb.append(this.conversation_info_updated_notify);
        }
        if (this.stranger_has_new_message_notify != null) {
            sb.append(", stranger_has_new_message_notify=");
            sb.append(this.stranger_has_new_message_notify);
        }
        if (this.get_conversation_info_body != null) {
            sb.append(", get_conversation_info_body=");
            sb.append(this.get_conversation_info_body);
        }
        if (this.set_conversation_info_body != null) {
            sb.append(", set_conversation_info_body=");
            sb.append(this.set_conversation_info_body);
        }
        if (this.create_conversation_body != null) {
            sb.append(", create_conversation_body=");
            sb.append(this.create_conversation_body);
        }
        if (this.get_conversations_info_list_body != null) {
            sb.append(", get_conversations_info_list_body=");
            sb.append(this.get_conversations_info_list_body);
        }
        if (this.batch_mark_read_body != null) {
            sb.append(", batch_mark_read_body=");
            sb.append(this.batch_mark_read_body);
        }
        if (this.get_conversation_info_v2_body != null) {
            sb.append(", get_conversation_info_v2_body=");
            sb.append(this.get_conversation_info_v2_body);
        }
        if (this.create_conversation_v2_body != null) {
            sb.append(", create_conversation_v2_body=");
            sb.append(this.create_conversation_v2_body);
        }
        if (this.get_conversation_info_list_v2_body != null) {
            sb.append(", get_conversation_info_list_v2_body=");
            sb.append(this.get_conversation_info_list_v2_body);
        }
        if (this.get_conversation_info_list_by_favorite_v2_body != null) {
            sb.append(", get_conversation_info_list_by_favorite_v2_body=");
            sb.append(this.get_conversation_info_list_by_favorite_v2_body);
        }
        if (this.get_conversation_info_list_by_top_v2_body != null) {
            sb.append(", get_conversation_info_list_by_top_v2_body=");
            sb.append(this.get_conversation_info_list_by_top_v2_body);
        }
        if (this.conversation_participants_body != null) {
            sb.append(", conversation_participants_body=");
            sb.append(this.conversation_participants_body);
        }
        if (this.conversation_add_participants_body != null) {
            sb.append(", conversation_add_participants_body=");
            sb.append(this.conversation_add_participants_body);
        }
        if (this.conversation_remove_participants_body != null) {
            sb.append(", conversation_remove_participants_body=");
            sb.append(this.conversation_remove_participants_body);
        }
        if (this.conversation_set_role_body != null) {
            sb.append(", conversation_set_role_body=");
            sb.append(this.conversation_set_role_body);
        }
        if (this.mget_conversation_participants_body != null) {
            sb.append(", mget_conversation_participants_body=");
            sb.append(this.mget_conversation_participants_body);
        }
        if (this.update_conversation_participant_body != null) {
            sb.append(", update_conversation_participant_body=");
            sb.append(this.update_conversation_participant_body);
        }
        if (this.reaction_message_body != null) {
            sb.append(", reaction_message_body=");
            sb.append(this.reaction_message_body);
        }
        if (this.sync_message_body != null) {
            sb.append(", sync_message_body=");
            sb.append(this.sync_message_body);
        }
        if (this.modify_message_property_body != null) {
            sb.append(", modify_message_property_body=");
            sb.append(this.modify_message_property_body);
        }
        if (this.get_group_info_body != null) {
            sb.append(", get_group_info_body=");
            sb.append(this.get_group_info_body);
        }
        if (this.set_group_info_body != null) {
            sb.append(", set_group_info_body=");
            sb.append(this.set_group_info_body);
        }
        if (this.get_groups_info_body != null) {
            sb.append(", get_groups_info_body=");
            sb.append(this.get_groups_info_body);
        }
        if (this.get_conversation_core_info_body != null) {
            sb.append(", get_conversation_core_info_body=");
            sb.append(this.get_conversation_core_info_body);
        }
        if (this.set_conversation_core_info_body != null) {
            sb.append(", set_conversation_core_info_body=");
            sb.append(this.set_conversation_core_info_body);
        }
        if (this.get_conversation_core_info_list_body != null) {
            sb.append(", get_conversation_core_info_list_body=");
            sb.append(this.get_conversation_core_info_list_body);
        }
        if (this.upsert_conversation_core_ext_info_body != null) {
            sb.append(", upsert_conversation_core_ext_info_body=");
            sb.append(this.upsert_conversation_core_ext_info_body);
        }
        if (this.delete_conversation_core_ext_info_body != null) {
            sb.append(", delete_conversation_core_ext_info_body=");
            sb.append(this.delete_conversation_core_ext_info_body);
        }
        if (this.get_conversation_setting_info_body != null) {
            sb.append(", get_conversation_setting_info_body=");
            sb.append(this.get_conversation_setting_info_body);
        }
        if (this.set_conversation_setting_info_body != null) {
            sb.append(", set_conversation_setting_info_body=");
            sb.append(this.set_conversation_setting_info_body);
        }
        if (this.upsert_conversation_setting_ext_info_body != null) {
            sb.append(", upsert_conversation_setting_ext_info_body=");
            sb.append(this.upsert_conversation_setting_ext_info_body);
        }
        if (this.delete_conversation_setting_ext_info_body != null) {
            sb.append(", delete_conversation_setting_ext_info_body=");
            sb.append(this.delete_conversation_setting_ext_info_body);
        }
        if (this.get_stranger_conversation_body != null) {
            sb.append(", get_stranger_conversation_body=");
            sb.append(this.get_stranger_conversation_body);
        }
        if (this.get_stranger_messages_body != null) {
            sb.append(", get_stranger_messages_body=");
            sb.append(this.get_stranger_messages_body);
        }
        if (this.delete_stranger_message_body != null) {
            sb.append(", delete_stranger_message_body=");
            sb.append(this.delete_stranger_message_body);
        }
        if (this.delete_stranger_conversation_body != null) {
            sb.append(", delete_stranger_conversation_body=");
            sb.append(this.delete_stranger_conversation_body);
        }
        if (this.delete_stranger_all_conversation_body != null) {
            sb.append(", delete_stranger_all_conversation_body=");
            sb.append(this.delete_stranger_all_conversation_body);
        }
        if (this.mark_stranger_conversation_read_body != null) {
            sb.append(", mark_stranger_conversation_read_body=");
            sb.append(this.mark_stranger_conversation_read_body);
        }
        if (this.mark_stranger_all_conversation_read_body != null) {
            sb.append(", mark_stranger_all_conversation_read_body=");
            sb.append(this.mark_stranger_all_conversation_read_body);
        }
        if (this.participants_read_index_body != null) {
            sb.append(", participants_read_index_body=");
            sb.append(this.participants_read_index_body);
        }
        if (this.participants_min_index_body != null) {
            sb.append(", participants_min_index_body=");
            sb.append(this.participants_min_index_body);
        }
        if (this.get_conversation_list_body != null) {
            sb.append(", get_conversation_list_body=");
            sb.append(this.get_conversation_list_body);
        }
        StringBuilder replace = sb.replace(0, 2, "ResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponseBody)) {
            return false;
        }
        ResponseBody responseBody = (ResponseBody) obj;
        if (!unknownFields().equals(responseBody.unknownFields()) || !Internal.equals(this.send_message_body, responseBody.send_message_body) || !Internal.equals(this.messages_per_user_body, responseBody.messages_per_user_body) || !Internal.equals(this.messages_per_user_init_body, responseBody.messages_per_user_init_body) || !Internal.equals(this.messages_per_user_init_v2_body, responseBody.messages_per_user_init_v2_body) || !Internal.equals(this.check_messages_per_user_body, responseBody.check_messages_per_user_body) || !Internal.equals(this.conversations_list_body, responseBody.conversations_list_body) || !Internal.equals(this.messages_in_conversation_body, responseBody.messages_in_conversation_body) || !Internal.equals(this.send_user_action_body, responseBody.send_user_action_body) || !Internal.equals(this.has_new_message_notify, responseBody.has_new_message_notify) || !Internal.equals(this.mark_conversation_read_notify, responseBody.mark_conversation_read_notify) || !Internal.equals(this.conversation_info_updated_notify, responseBody.conversation_info_updated_notify) || !Internal.equals(this.stranger_has_new_message_notify, responseBody.stranger_has_new_message_notify) || !Internal.equals(this.get_conversation_info_body, responseBody.get_conversation_info_body) || !Internal.equals(this.set_conversation_info_body, responseBody.set_conversation_info_body) || !Internal.equals(this.create_conversation_body, responseBody.create_conversation_body) || !Internal.equals(this.get_conversations_info_list_body, responseBody.get_conversations_info_list_body) || !Internal.equals(this.batch_mark_read_body, responseBody.batch_mark_read_body) || !Internal.equals(this.get_conversation_info_v2_body, responseBody.get_conversation_info_v2_body) || !Internal.equals(this.create_conversation_v2_body, responseBody.create_conversation_v2_body) || !Internal.equals(this.get_conversation_info_list_v2_body, responseBody.get_conversation_info_list_v2_body) || !Internal.equals(this.get_conversation_info_list_by_favorite_v2_body, responseBody.get_conversation_info_list_by_favorite_v2_body) || !Internal.equals(this.get_conversation_info_list_by_top_v2_body, responseBody.get_conversation_info_list_by_top_v2_body) || !Internal.equals(this.conversation_participants_body, responseBody.conversation_participants_body) || !Internal.equals(this.conversation_add_participants_body, responseBody.conversation_add_participants_body) || !Internal.equals(this.conversation_remove_participants_body, responseBody.conversation_remove_participants_body) || !Internal.equals(this.conversation_set_role_body, responseBody.conversation_set_role_body) || !Internal.equals(this.mget_conversation_participants_body, responseBody.mget_conversation_participants_body) || !Internal.equals(this.update_conversation_participant_body, responseBody.update_conversation_participant_body) || !Internal.equals(this.reaction_message_body, responseBody.reaction_message_body) || !Internal.equals(this.sync_message_body, responseBody.sync_message_body) || !Internal.equals(this.modify_message_property_body, responseBody.modify_message_property_body) || !Internal.equals(this.get_group_info_body, responseBody.get_group_info_body) || !Internal.equals(this.set_group_info_body, responseBody.set_group_info_body) || !Internal.equals(this.get_groups_info_body, responseBody.get_groups_info_body) || !Internal.equals(this.get_conversation_core_info_body, responseBody.get_conversation_core_info_body) || !Internal.equals(this.set_conversation_core_info_body, responseBody.set_conversation_core_info_body) || !Internal.equals(this.get_conversation_core_info_list_body, responseBody.get_conversation_core_info_list_body) || !Internal.equals(this.upsert_conversation_core_ext_info_body, responseBody.upsert_conversation_core_ext_info_body) || !Internal.equals(this.delete_conversation_core_ext_info_body, responseBody.delete_conversation_core_ext_info_body) || !Internal.equals(this.get_conversation_setting_info_body, responseBody.get_conversation_setting_info_body) || !Internal.equals(this.set_conversation_setting_info_body, responseBody.set_conversation_setting_info_body) || !Internal.equals(this.upsert_conversation_setting_ext_info_body, responseBody.upsert_conversation_setting_ext_info_body) || !Internal.equals(this.delete_conversation_setting_ext_info_body, responseBody.delete_conversation_setting_ext_info_body) || !Internal.equals(this.get_stranger_conversation_body, responseBody.get_stranger_conversation_body) || !Internal.equals(this.get_stranger_messages_body, responseBody.get_stranger_messages_body) || !Internal.equals(this.delete_stranger_message_body, responseBody.delete_stranger_message_body) || !Internal.equals(this.delete_stranger_conversation_body, responseBody.delete_stranger_conversation_body) || !Internal.equals(this.delete_stranger_all_conversation_body, responseBody.delete_stranger_all_conversation_body) || !Internal.equals(this.mark_stranger_conversation_read_body, responseBody.mark_stranger_conversation_read_body) || !Internal.equals(this.mark_stranger_all_conversation_read_body, responseBody.mark_stranger_all_conversation_read_body) || !Internal.equals(this.participants_read_index_body, responseBody.participants_read_index_body) || !Internal.equals(this.participants_min_index_body, responseBody.participants_min_index_body) || !Internal.equals(this.get_conversation_list_body, responseBody.get_conversation_list_body)) {
            return false;
        }
        return true;
    }

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitResponseBody messagesPerUserInitResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, ConversationsListResponseBody conversationsListResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, SendUserActionResponseBody sendUserActionResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, ConversationInfoUpdatedNotify conversationInfoUpdatedNotify, StrangerNewMessageNotify strangerNewMessageNotify, GetConversationInfoResponseBody getConversationInfoResponseBody, SetConversationInfoResponseBody setConversationInfoResponseBody, CreateConversationResponseBody createConversationResponseBody, GetConversationInfoListResponseBody getConversationInfoListResponseBody, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, ConversationSetRoleResponseBody conversationSetRoleResponseBody, MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, ReactionMessageResponseBody reactionMessageResponseBody, SyncMessageResponseBody syncMessageResponseBody, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, GetGroupInfoResponseBody getGroupInfoResponseBody, SetGroupInfoResponseBody setGroupInfoResponseBody, GetGroupInfoListResponseBody getGroupInfoListResponseBody, GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, GetConversationCoreInfoListResponseBody getConversationCoreInfoListResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody, GetConversationSettingInfoResponseBody getConversationSettingInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, DeleteConversationSettingExtInfoResponseBody deleteConversationSettingExtInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody, DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody, DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody, MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody, MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody) {
        this(sendMessageResponseBody, messagesPerUserResponseBody, messagesPerUserInitResponseBody, messagesPerUserInitV2ResponseBody, checkMessagesPerUserResponseBody, conversationsListResponseBody, messagesInConversationResponseBody, sendUserActionResponseBody, newMessageNotify, markConversationReadNotify, conversationInfoUpdatedNotify, strangerNewMessageNotify, getConversationInfoResponseBody, setConversationInfoResponseBody, createConversationResponseBody, getConversationInfoListResponseBody, batchMarkConversationReadResponseBody, getConversationInfoV2ResponseBody, createConversationV2ResponseBody, getConversationInfoListV2ResponseBody, getConversationInfoListByFavoriteV2ResponseBody, getConversationInfoListByTopV2ResponseBody, conversationParticipantsListResponseBody, conversationAddParticipantsResponseBody, conversationRemoveParticipantsResponseBody, conversationSetRoleResponseBody, mgetConversationParticipantsResponseBody, updateConversationParticipantResponseBody, reactionMessageResponseBody, syncMessageResponseBody, modifyMessagePropertyResponseBody, getGroupInfoResponseBody, setGroupInfoResponseBody, getGroupInfoListResponseBody, getConversationCoreInfoResponseBody, setConversationCoreInfoResponseBody, getConversationCoreInfoListResponseBody, upsertConversationCoreExtInfoResponseBody, deleteConversationCoreExtInfoResponseBody, getConversationSettingInfoResponseBody, setConversationSettingInfoResponseBody, upsertConversationSettingExtInfoResponseBody, deleteConversationSettingExtInfoResponseBody, getStrangerConversationListResponseBody, getStrangerMessagesResponseBody, deleteStrangerMessageResponseBody, deleteStrangerConversationResponseBody, deleteStrangerAllConversationResponseBody, markStrangerConversationReadResponseBody, markStrangerAllConversationReadResponseBody, getConversationParticipantsReadIndexV3ResponseBody, getConversationParticipantsMinIndexV3ResponseBody, getUserConversationListResponseBody, ByteString.EMPTY);
    }

    public ResponseBody(SendMessageResponseBody sendMessageResponseBody, MessagesPerUserResponseBody messagesPerUserResponseBody, MessagesPerUserInitResponseBody messagesPerUserInitResponseBody, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody, ConversationsListResponseBody conversationsListResponseBody, MessagesInConversationResponseBody messagesInConversationResponseBody, SendUserActionResponseBody sendUserActionResponseBody, NewMessageNotify newMessageNotify, MarkConversationReadNotify markConversationReadNotify, ConversationInfoUpdatedNotify conversationInfoUpdatedNotify, StrangerNewMessageNotify strangerNewMessageNotify, GetConversationInfoResponseBody getConversationInfoResponseBody, SetConversationInfoResponseBody setConversationInfoResponseBody, CreateConversationResponseBody createConversationResponseBody, GetConversationInfoListResponseBody getConversationInfoListResponseBody, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody, CreateConversationV2ResponseBody createConversationV2ResponseBody, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody, GetConversationInfoListByFavoriteV2ResponseBody getConversationInfoListByFavoriteV2ResponseBody, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody, ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody, ConversationSetRoleResponseBody conversationSetRoleResponseBody, MgetConversationParticipantsResponseBody mgetConversationParticipantsResponseBody, UpdateConversationParticipantResponseBody updateConversationParticipantResponseBody, ReactionMessageResponseBody reactionMessageResponseBody, SyncMessageResponseBody syncMessageResponseBody, ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody, GetGroupInfoResponseBody getGroupInfoResponseBody, SetGroupInfoResponseBody setGroupInfoResponseBody, GetGroupInfoListResponseBody getGroupInfoListResponseBody, GetConversationCoreInfoResponseBody getConversationCoreInfoResponseBody, SetConversationCoreInfoResponseBody setConversationCoreInfoResponseBody, GetConversationCoreInfoListResponseBody getConversationCoreInfoListResponseBody, UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody, DeleteConversationCoreExtInfoResponseBody deleteConversationCoreExtInfoResponseBody, GetConversationSettingInfoResponseBody getConversationSettingInfoResponseBody, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody, UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody, DeleteConversationSettingExtInfoResponseBody deleteConversationSettingExtInfoResponseBody, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody, DeleteStrangerMessageResponseBody deleteStrangerMessageResponseBody, DeleteStrangerConversationResponseBody deleteStrangerConversationResponseBody, DeleteStrangerAllConversationResponseBody deleteStrangerAllConversationResponseBody, MarkStrangerConversationReadResponseBody markStrangerConversationReadResponseBody, MarkStrangerAllConversationReadResponseBody markStrangerAllConversationReadResponseBody, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody, GetUserConversationListResponseBody getUserConversationListResponseBody, ByteString byteString) {
        super(ADAPTER, byteString);
        this.send_message_body = sendMessageResponseBody;
        this.messages_per_user_body = messagesPerUserResponseBody;
        this.messages_per_user_init_body = messagesPerUserInitResponseBody;
        this.messages_per_user_init_v2_body = messagesPerUserInitV2ResponseBody;
        this.check_messages_per_user_body = checkMessagesPerUserResponseBody;
        this.conversations_list_body = conversationsListResponseBody;
        this.messages_in_conversation_body = messagesInConversationResponseBody;
        this.send_user_action_body = sendUserActionResponseBody;
        this.has_new_message_notify = newMessageNotify;
        this.mark_conversation_read_notify = markConversationReadNotify;
        this.conversation_info_updated_notify = conversationInfoUpdatedNotify;
        this.stranger_has_new_message_notify = strangerNewMessageNotify;
        this.get_conversation_info_body = getConversationInfoResponseBody;
        this.set_conversation_info_body = setConversationInfoResponseBody;
        this.create_conversation_body = createConversationResponseBody;
        this.get_conversations_info_list_body = getConversationInfoListResponseBody;
        this.batch_mark_read_body = batchMarkConversationReadResponseBody;
        this.get_conversation_info_v2_body = getConversationInfoV2ResponseBody;
        this.create_conversation_v2_body = createConversationV2ResponseBody;
        this.get_conversation_info_list_v2_body = getConversationInfoListV2ResponseBody;
        this.get_conversation_info_list_by_favorite_v2_body = getConversationInfoListByFavoriteV2ResponseBody;
        this.get_conversation_info_list_by_top_v2_body = getConversationInfoListByTopV2ResponseBody;
        this.conversation_participants_body = conversationParticipantsListResponseBody;
        this.conversation_add_participants_body = conversationAddParticipantsResponseBody;
        this.conversation_remove_participants_body = conversationRemoveParticipantsResponseBody;
        this.conversation_set_role_body = conversationSetRoleResponseBody;
        this.mget_conversation_participants_body = mgetConversationParticipantsResponseBody;
        this.update_conversation_participant_body = updateConversationParticipantResponseBody;
        this.reaction_message_body = reactionMessageResponseBody;
        this.sync_message_body = syncMessageResponseBody;
        this.modify_message_property_body = modifyMessagePropertyResponseBody;
        this.get_group_info_body = getGroupInfoResponseBody;
        this.set_group_info_body = setGroupInfoResponseBody;
        this.get_groups_info_body = getGroupInfoListResponseBody;
        this.get_conversation_core_info_body = getConversationCoreInfoResponseBody;
        this.set_conversation_core_info_body = setConversationCoreInfoResponseBody;
        this.get_conversation_core_info_list_body = getConversationCoreInfoListResponseBody;
        this.upsert_conversation_core_ext_info_body = upsertConversationCoreExtInfoResponseBody;
        this.delete_conversation_core_ext_info_body = deleteConversationCoreExtInfoResponseBody;
        this.get_conversation_setting_info_body = getConversationSettingInfoResponseBody;
        this.set_conversation_setting_info_body = setConversationSettingInfoResponseBody;
        this.upsert_conversation_setting_ext_info_body = upsertConversationSettingExtInfoResponseBody;
        this.delete_conversation_setting_ext_info_body = deleteConversationSettingExtInfoResponseBody;
        this.get_stranger_conversation_body = getStrangerConversationListResponseBody;
        this.get_stranger_messages_body = getStrangerMessagesResponseBody;
        this.delete_stranger_message_body = deleteStrangerMessageResponseBody;
        this.delete_stranger_conversation_body = deleteStrangerConversationResponseBody;
        this.delete_stranger_all_conversation_body = deleteStrangerAllConversationResponseBody;
        this.mark_stranger_conversation_read_body = markStrangerConversationReadResponseBody;
        this.mark_stranger_all_conversation_read_body = markStrangerAllConversationReadResponseBody;
        this.participants_read_index_body = getConversationParticipantsReadIndexV3ResponseBody;
        this.participants_min_index_body = getConversationParticipantsMinIndexV3ResponseBody;
        this.get_conversation_list_body = getUserConversationListResponseBody;
    }
}
