package com.danielasfregola.twitter4s.http.clients.statuses.parameters

import com.danielasfregola.twitter4s.http.marshalling.Parameters

case class MentionsParameters(count: Int,
                              since_id: Option[Long],
                              max_id: Option[Long],
                              trim_user: Boolean,
                              contributor_details: Boolean,
                              include_entities: Boolean) extends Parameters