package com.app.td

object AuthManager {

    fun handle(update: TdApi.Update) {

        if (update is TdApi.UpdateAuthorizationState) {

            when (val state = update.authorizationState) {

                is TdApi.AuthorizationStateWaitPhoneNumber -> {}

                is TdApi.AuthorizationStateWaitCode -> {}

                is TdApi.AuthorizationStateWaitPassword -> {}

                is TdApi.AuthorizationStateReady -> {}
            }
        }
    }

    fun setPhone(client: TDClient, phone: String) {
        client.send(TdApi.SetAuthenticationPhoneNumber(phone, null))
    }

    fun setCode(client: TDClient, code: String) {
        client.send(TdApi.CheckAuthenticationCode(code))
    }

    fun setPassword(client: TDClient, pass: String) {
        client.send(TdApi.CheckAuthenticationPassword(pass))
    }
}
