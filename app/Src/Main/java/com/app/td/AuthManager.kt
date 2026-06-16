package com.app.td

object AuthManager {

    fun startLogin(client: TDClient, phone: String) {
        client.send(
            TdApi.SetAuthenticationPhoneNumber(phone, null)
        ) {}
    }

    fun sendCode(client: TDClient, code: String) {
        client.send(
            TdApi.CheckAuthenticationCode(code)
        ) {}
    }
}
