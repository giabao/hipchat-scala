package com.imadethatcow.hipchat.common.caseclass

import com.imadethatcow.hipchat.common.enums.AuthGrantType
import AuthGrantType.AuthGrantType
import com.imadethatcow.hipchat.common.enums.OwnerType.OwnerType

case class AuthRequest(grant_type: AuthGrantType,
                       username: Option[String] = None,
                       code: Option[String] = None,
                       redirect_url: Option[String] = None,
                       scope: Option[String] = None,
                       password: Option[String] = None,
                       refresh_token: Option[String] = None)

case class AuthResponse(access_token: String,
                        expires_in: Long,
                        group_name: String,
                        token_type: String,
                        scope: String,
                        group_id: String,
                        refresh_token: Option[String] = None)

case class GetSessionResponse(scopes: Seq[String],
                              access_token: String,
                              expires_in: Long,
                              client: AuthClient,
                              owner: Option[UsersItem],
                              owner_type: String)

case class AuthClient(room: Option[RoomsItem],
                      id: String,
                      allowed_scopes: Seq[String],
                      name: Option[String],
                      oauth_client_id: String)