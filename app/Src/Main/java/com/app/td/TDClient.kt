package com.app.td

class TDClient {

    private val client = TdApi.Client.create { update ->
        handle(update)
    }

    fun send(query: TdApi.Function<TdApi.Object>, cb: (TdApi.Object) -> Unit) {
        client.send(query, cb)
    }

    private fun handle(update: TdApi.Update) {
        // auth + updates
    }
}
