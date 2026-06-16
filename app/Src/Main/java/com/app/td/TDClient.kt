package com.app.td

class TDClient {

    companion object {
        init { TDLibLoader }
    }

    private val client = TdApi.Client.create { update ->
        AuthManager.handle(update)
    }

    fun send(query: TdApi.Function<TdApi.Object>, cb: (TdApi.Object) -> Unit = {}) {
        client.send(query, cb)
    }
}
